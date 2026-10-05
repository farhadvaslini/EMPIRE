package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nt1 extends View {
    public static final int l = Color.rgb(180, 25, 29);
    public static final int m = Color.rgb(54, 104, 44);
    public static final int n = Color.rgb(50, 60, 127);
    public static final int o = Color.rgb(168, 110, 252);
    public static final int p = Color.rgb(226, 192, 99);
    public static final int q = Color.rgb(225, 225, 225);
    public final LinkedHashMap f;
    public final HashMap g;
    public final HashMap h;
    public final Typeface i;
    public final TextPaint j;
    public final xb3 k;

    public nt1(GameActivity gameActivity) {
        super(gameActivity);
        this.f = new LinkedHashMap();
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = Typeface.DEFAULT;
        this.j = new TextPaint(129);
        this.k = new xb3(new it1(0, this));
        setWillNotDraw(false);
        setClickable(false);
        setFocusable(false);
        setImportantForAccessibility(2);
        setPadding(0, 0, 0, 0);
    }

    public static final void e(qk2 qk2Var, ArrayList arrayList, nk2 nk2Var, float f, nk2 nk2Var2, ok2 ok2Var, mk2 mk2Var) {
        if (((CharSequence) qk2Var.f).length() > 0) {
            arrayList.add(new ht1(((StringBuilder) qk2Var.f).toString(), nk2Var.f, f, nk2Var2.f, ok2Var.f, mk2Var.f));
            qk2Var.f = new StringBuilder();
        }
    }

    private final float getFallbackGlyphHeight() {
        return ((Number) this.k.getValue()).floatValue();
    }

    public final TextPaint a(gt1 gt1Var, int i) {
        float fAbs = Math.abs(gt1Var.f);
        if (fAbs < 0.05f) {
            fAbs = 0.05f;
        }
        float fAbs2 = Math.abs(gt1Var.e);
        float f = fAbs2 >= 0.05f ? fAbs2 : 0.05f;
        TextPaint textPaint = new TextPaint(129);
        textPaint.setColor(i);
        textPaint.setTypeface(this.i);
        textPaint.setTextSize(y02.g(((fAbs * 8.0f) * 100.0f) / getFallbackGlyphHeight(), 1.0f, 256.0f));
        textPaint.setTextScaleX(y02.g(f / (fAbs * 0.25f), 0.1f, 8.0f));
        return textPaint;
    }

    public final void b(Canvas canvas, gt1 gt1Var, String str, int i, float f, float f2) {
        TextPaint textPaintA = a(gt1Var, i);
        int i2 = gt1Var.i;
        int i3 = gt1Var.j;
        float f3 = f2 - textPaintA.getFontMetrics().ascent;
        int i4 = gt1Var.h;
        if (Color.alpha(i4) == 0) {
            i4 = -16777216;
        }
        if (i3 > 0) {
            TextPaint textPaintA2 = a(gt1Var, i4);
            textPaintA2.setStyle(Paint.Style.STROKE);
            float f4 = i3;
            if (f4 < 1.0f) {
                f4 = 1.0f;
            }
            textPaintA2.setStrokeWidth(f4 * 2.0f);
            canvas.drawText(str, f, f3, textPaintA2);
        } else if (i2 > 0) {
            TextPaint textPaintA3 = a(gt1Var, i4);
            float f5 = i2;
            canvas.drawText(str, f + f5, f5 + f3, textPaintA3);
        }
        canvas.drawText(str, f, f3, textPaintA);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, gt1 gt1Var) {
        float f;
        float f2;
        float fAbs;
        gt1 gt1Var2 = gt1Var;
        List listD = d(gt1Var2);
        float f3 = gt1Var2.c;
        ArrayList arrayList = (ArrayList) listD;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            int i3 = i2 + 1;
            int i4 = i + 1;
            if (i < 0) {
                vr.b0();
                throw null;
            }
            lt1 lt1Var = (lt1) obj;
            int i5 = gt1Var2.l;
            if (i5 == 1) {
                f = lt1Var.b * 0.5f;
            } else if (i5 != 2) {
                f2 = f3;
                float f4 = gt1Var2.d;
                float f5 = i;
                fAbs = Math.abs(gt1Var2.f);
                if (fAbs < 0.05f) {
                    fAbs = 0.05f;
                }
                float f6 = (fAbs * 9.0f * f5) + f4;
                float f7 = f2;
                for (mt1 mt1Var : lt1Var.a) {
                    float fMeasureText = a(gt1Var2, gt1Var2.g).measureText(mt1Var.a);
                    if (mt1Var.c) {
                        b(canvas, gt1Var2, mt1Var.a, mt1Var.b, f7, f6);
                    }
                    f7 += fMeasureText;
                    gt1Var2 = gt1Var;
                }
                gt1Var2 = gt1Var;
                i2 = i3;
                i = i4;
            } else {
                f = lt1Var.b;
            }
            f2 = f3 - f;
            float f42 = gt1Var2.d;
            float f52 = i;
            fAbs = Math.abs(gt1Var2.f);
            if (fAbs < 0.05f) {
            }
            float f62 = (fAbs * 9.0f * f52) + f42;
            float f72 = f2;
            while (r12.hasNext()) {
            }
            gt1Var2 = gt1Var;
            i2 = i3;
            i = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r9.equals("s") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0102, code lost:
    
        if (r9.equals("w") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0105, code lost:
    
        r9 = defpackage.nt1.q;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List d(gt1 gt1Var) {
        int i;
        Integer numK;
        Integer numK2;
        int iArgb;
        int i2 = gt1Var.g;
        String str = gt1Var.b;
        kt1 kt1Var = new kt1(str, gt1Var.e, gt1Var.f);
        int i3 = gt1Var.a;
        Integer numValueOf = Integer.valueOf(i3);
        HashMap map = this.g;
        jt1 jt1Var = (jt1) map.get(numValueOf);
        if (jt1Var != null && jt1Var.a.equals(kt1Var)) {
            return jt1Var.b;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iIntValue = i2;
        int length = 0;
        while (length < str.length()) {
            int i4 = length + 2;
            if (i4 < str.length() && str.charAt(length) == '~' && str.charAt(i4) == '~') {
                int i5 = length + 1;
                String strSubstring = str.substring(i5, i4);
                Locale locale = Locale.ROOT;
                locale.getClass();
                String lowerCase = strSubstring.toLowerCase(locale);
                lowerCase.getClass();
                int iHashCode = lowerCase.hashCode();
                if (iHashCode == 98) {
                    if (lowerCase.equals("b")) {
                        iIntValue = n;
                    } else {
                        arrayList2.add(new mt1(String.valueOf(str.charAt(length)), iIntValue, false));
                        arrayList2.add(new mt1(String.valueOf(str.charAt(i5)), iIntValue, false));
                        arrayList2.add(new mt1(String.valueOf(str.charAt(i4)), iIntValue, false));
                    }
                    length += 3;
                } else if (iHashCode != 108) {
                    if (iHashCode != 110) {
                        if (iHashCode != 112) {
                            if (iHashCode != 119) {
                                if (iHashCode != 121) {
                                    if (iHashCode != 103) {
                                        if (iHashCode != 104) {
                                            if (iHashCode != 114) {
                                                if (iHashCode == 115) {
                                                }
                                            } else if (lowerCase.equals("r")) {
                                                iArgb = l;
                                                iIntValue = iArgb;
                                            }
                                        } else if (lowerCase.equals("h")) {
                                            int iAlpha = Color.alpha(iIntValue);
                                            int iRed = (int) (Color.red(iIntValue) * 1.5f);
                                            if (iRed > 255) {
                                                iRed = 255;
                                            }
                                            int iGreen = (int) (Color.green(iIntValue) * 1.5f);
                                            if (iGreen > 255) {
                                                iGreen = 255;
                                            }
                                            int iBlue = (int) (Color.blue(iIntValue) * 1.5f);
                                            iArgb = Color.argb(iAlpha, iRed, iGreen, iBlue <= 255 ? iBlue : 255);
                                            iIntValue = iArgb;
                                        }
                                    } else if (lowerCase.equals("g")) {
                                        iArgb = m;
                                        iIntValue = iArgb;
                                    }
                                } else if (lowerCase.equals("y")) {
                                    iArgb = p;
                                    iIntValue = iArgb;
                                }
                            }
                            length += 3;
                        } else if (lowerCase.equals("p")) {
                            iArgb = o;
                            iIntValue = iArgb;
                            length += 3;
                        }
                    } else if (lowerCase.equals("n")) {
                        arrayList.add(arrayList2);
                        arrayList2 = new ArrayList();
                        length += 3;
                    }
                    arrayList2.add(new mt1(String.valueOf(str.charAt(length)), iIntValue, false));
                    arrayList2.add(new mt1(String.valueOf(str.charAt(i5)), iIntValue, false));
                    arrayList2.add(new mt1(String.valueOf(str.charAt(i4)), iIntValue, false));
                    length += 3;
                } else {
                    if (lowerCase.equals("l")) {
                        iArgb = -16777216;
                        iIntValue = iArgb;
                        length += 3;
                    }
                    arrayList2.add(new mt1(String.valueOf(str.charAt(length)), iIntValue, false));
                    arrayList2.add(new mt1(String.valueOf(str.charAt(i5)), iIntValue, false));
                    arrayList2.add(new mt1(String.valueOf(str.charAt(i4)), iIntValue, false));
                    length += 3;
                }
            } else {
                int i6 = length + 7;
                if (i6 < str.length() && str.charAt(length) == '{' && str.charAt(i6) == '}' && (numK2 = ur.k(str.substring(length + 1, i6))) != null) {
                    iIntValue = numK2.intValue();
                    length += 8;
                } else if (str.charAt(length) == '\n' || str.charAt(length) == '\r') {
                    arrayList.add(arrayList2);
                    arrayList2 = new ArrayList();
                    if (str.charAt(length) == '\r' && (i = length + 1) < str.length() && str.charAt(i) == '\n') {
                        length = i;
                    }
                    length++;
                } else {
                    if (length + 3 < str.length()) {
                        char c = '0';
                        if (str.charAt(length) == '0') {
                            int i7 = length + 1;
                            if (str.charAt(i7) == 'x' || str.charAt(i7) == 'X') {
                                int i8 = i4;
                                while (i8 < str.length() && i8 < length + 10) {
                                    char cCharAt = str.charAt(i8);
                                    if ((c > cCharAt || cCharAt >= ':') && ('a' > cCharAt || cCharAt >= 'g')) {
                                        if ('A' > cCharAt || cCharAt >= 'G') {
                                            break;
                                        }
                                    }
                                    i8++;
                                    c = '0';
                                }
                                int i9 = (i8 - length) - 2;
                                if ((i9 == 6 || i9 == 8) && (numK = ur.k(str.substring(i4, i8))) != null) {
                                    iIntValue = numK.intValue();
                                    length = i8;
                                }
                            }
                        }
                    }
                    int iCodePointAt = str.codePointAt(length);
                    char[] chars = Character.toChars(iCodePointAt);
                    chars.getClass();
                    String str2 = new String(chars);
                    arrayList2.add(new mt1(str2, iIntValue, iCodePointAt >= 128));
                    length += str2.length();
                }
            }
        }
        arrayList.add(arrayList2);
        ArrayList arrayList3 = new ArrayList(rx.d0(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            List list = (List) obj;
            Iterator it = list.iterator();
            double dMeasureText = 0.0d;
            while (it.hasNext()) {
                dMeasureText += (double) a(gt1Var, i2).measureText(((mt1) it.next()).a);
            }
            arrayList3.add(new lt1(list, (float) dMeasureText));
        }
        map.put(Integer.valueOf(i3), new jt1(kt1Var, arrayList3));
        return arrayList3;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        Canvas canvas2;
        nt1 nt1Var;
        Canvas canvas3;
        canvas.getClass();
        super.onDraw(canvas);
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.scale(getWidth() / 640.0f, getHeight() / 448.0f, 0.0f, 0.0f);
        try {
            Collection<gt1> collectionValues = this.f.values();
            collectionValues.getClass();
            for (gt1 gt1Var : collectionValues) {
                List<ht1> list = (List) this.h.get(Integer.valueOf(gt1Var.a));
                if (list != null) {
                    for (ht1 ht1Var : list) {
                        String str = ht1Var.a;
                        int i = ht1Var.e;
                        float f = ht1Var.b;
                        float f2 = ht1Var.c;
                        nt1 nt1Var2 = this;
                        canvas2 = canvas;
                        try {
                            nt1Var2.b(canvas2, gt1Var, str, i, f, f2);
                            this = nt1Var2;
                            canvas = canvas2;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            canvas2.restoreToCount(iSave);
                            throw th2;
                        }
                    }
                    nt1Var = this;
                    canvas3 = canvas;
                } else {
                    nt1Var = this;
                    canvas3 = canvas;
                    nt1Var.c(canvas3, gt1Var);
                }
                this = nt1Var;
                canvas = canvas3;
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th3) {
            th = th3;
            canvas2 = canvas;
        }
    }
}
