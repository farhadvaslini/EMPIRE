package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ci {
    public final TextView a;
    public c30 b;
    public c30 c;
    public c30 d;
    public c30 e;
    public c30 f;
    public c30 g;
    public c30 h;
    public final li i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public ci(TextView textView) {
        this.a = textView;
        this.i = new li(textView);
    }

    public static c30 c(Context context, yg ygVar, int i) {
        ColorStateList colorStateListG;
        synchronized (ygVar) {
            colorStateListG = ygVar.a.g(context, i);
        }
        if (colorStateListG == null) {
            return null;
        }
        c30 c30Var = new c30();
        c30Var.b = true;
        c30Var.c = colorStateListG;
        return c30Var;
    }

    public final void a(Drawable drawable, c30 c30Var) {
        if (drawable == null || c30Var == null) {
            return;
        }
        yg.d(drawable, c30Var, this.a.getDrawableState());
    }

    public final void b() {
        c30 c30Var = this.b;
        TextView textView = this.a;
        if (c30Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        c30 c30Var = this.h;
        if (c30Var != null) {
            return (ColorStateList) c30Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        c30 c30Var = this.h;
        if (c30Var != null) {
            return (PorterDuff.Mode) c30Var.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, pf2.v);
        pi piVar = new pi(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, piVar);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            ai.d(textView, string);
        }
        piVar.J();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        li liVar = this.i;
        if (liVar.j()) {
            DisplayMetrics displayMetrics = liVar.j.getResources().getDisplayMetrics();
            liVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (liVar.h()) {
                liVar.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        li liVar = this.i;
        if (liVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = liVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                liVar.f = li.b(iArrCopyOf);
                if (!liVar.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                liVar.g = false;
            }
            if (liVar.h()) {
                liVar.a();
            }
        }
    }

    public final void j(int i) {
        li liVar = this.i;
        if (liVar.j()) {
            if (i == 0) {
                liVar.a = 0;
                liVar.d = -1.0f;
                liVar.e = -1.0f;
                liVar.c = -1.0f;
                liVar.f = new int[0];
                liVar.b = false;
                return;
            }
            if (i != 1) {
                c.p(by1.e(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = liVar.j.getResources().getDisplayMetrics();
            liVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (liVar.h()) {
                liVar.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new c30();
        }
        c30 c30Var = this.h;
        c30Var.c = colorStateList;
        c30Var.b = colorStateList != null;
        this.b = c30Var;
        this.c = c30Var;
        this.d = c30Var;
        this.e = c30Var;
        this.f = c30Var;
        this.g = c30Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new c30();
        }
        c30 c30Var = this.h;
        c30Var.d = mode;
        c30Var.a = mode != null;
        this.b = c30Var;
        this.c = c30Var;
        this.d = c30Var;
        this.e = c30Var;
        this.f = c30Var;
        this.g = c30Var;
    }

    public final void m(Context context, pi piVar) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) piVar.g;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceS = piVar.s(i5, this.j, new xh(this, i6, i7, new WeakReference(this.a)));
                if (typefaceS != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceS;
                    } else {
                        this.l = bi.a(Typeface.create(typefaceS, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = bi.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
