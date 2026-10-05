package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.Character;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xh {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public xh(CharSequence charSequence, int i, Locale locale) {
        this.d = charSequence;
        if (charSequence.length() < 0) {
            n21.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            n21.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new xs(charSequence, i));
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new y6(this, i));
    }

    public void b(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbL = nc2.l("Invalid offset: ", i, ". Valid range is [", i2, " , ");
        sbL.append(i3);
        sbL.append("]");
        n21.a(sbL.toString());
    }

    public int c() {
        lx lxVar = (lx) this.e;
        String str = (String) this.d;
        if (lxVar == null) {
            return str.length();
        }
        return (lxVar.b - lxVar.b()) + (str.length() - (this.c - this.b));
    }

    public boolean d(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!nh0.d()) {
                    return false;
                }
                nh0 nh0VarA = nh0.a();
                if (nh0VarA.c() != 1 || nh0VarA.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean e(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return w22.z(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean f(int i) {
        b(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (h(i) && h(i - 1) && h(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(g(i) || g(i + 1));
    }

    public boolean g(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (s51.n(unicodeBlockOf, unicodeBlock) && s51.n(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return s51.n(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && s51.n(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean h(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!nh0.d()) {
                return false;
            }
            nh0 nh0VarA = nh0.a();
            if (nh0VarA.c() != 1 || nh0VarA.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean i(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return w22.z(Character.codePointAt((CharSequence) this.d, i));
    }

    public int j(int i) {
        b(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (h(iFollowing + (-1)) && h(iFollowing) && !g(iFollowing)) ? j(iFollowing) : iFollowing;
    }

    public void k(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
            typeface = bi.a(typeface, i, (this.c & 2) != 0);
        }
        ci ciVar = (ci) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (ciVar.m) {
            ciVar.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = ciVar.j;
                if (zIsAttachedToWindow) {
                    textView.post(new yh(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public int l(int i) {
        b(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (h(iPreceding) && d(iPreceding) && !g(iPreceding)) ? l(iPreceding) : iPreceding;
    }

    public void m(int i, int i2, String str) {
        if (i > i2) {
            n21.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            n21.a("start must be non-negative, but was " + i);
        }
        lx lxVar = (lx) this.e;
        if (lxVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            lx lxVar2 = new lx();
            lxVar2.b = iMax;
            lxVar2.e = cArr;
            lxVar2.c = length;
            lxVar2.d = i4;
            this.e = lxVar2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > lxVar.b - lxVar.b()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            m(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > lxVar.b()) {
            int iB = length2 - lxVar.b();
            int i9 = lxVar.b;
            do {
                i9 *= 2;
            } while (i9 - lxVar.b < iB);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) lxVar.e, 0, cArr2, 0, lxVar.c);
            int i10 = lxVar.b;
            int i11 = lxVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) lxVar.e, i11, cArr2, i13, (i12 + i11) - i11);
            lxVar.e = cArr2;
            lxVar.b = i9;
            lxVar.d = i13;
        }
        int i14 = lxVar.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) lxVar.e;
            System.arraycopy(cArr3, i8, cArr3, lxVar.d - i15, i15);
            lxVar.c = i7;
            lxVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iB2 = lxVar.b() + i7;
            int iB3 = lxVar.b() + i8;
            int i16 = lxVar.d;
            int i17 = iB2 - i16;
            char[] cArr4 = (char[]) lxVar.e;
            System.arraycopy(cArr4, i16, cArr4, lxVar.c, i17);
            lxVar.c += i17;
            lxVar.d = iB3;
        } else {
            lxVar.d = lxVar.b() + i8;
            lxVar.c = i7;
        }
        str.getChars(0, str.length(), (char[]) lxVar.e, lxVar.c);
        lxVar.c = str.length() + lxVar.c;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                lx lxVar = (lx) this.e;
                String str = (String) this.d;
                if (lxVar == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) lxVar.e, 0, lxVar.c);
                char[] cArr = (char[]) lxVar.e;
                int i = lxVar.d;
                sb.append(cArr, i, lxVar.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xh() {
    }

    public xh(ci ciVar, int i, int i2, WeakReference weakReference) {
        this.e = ciVar;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }
}
