package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yf {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public yf() {
        this.b = new uy0[32];
        this.c = new float[32];
        this.d = new byte[32];
        js1 js1Var = or2.a;
        this.e = new js1();
        this.f = new js1();
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((c30) this.d) != null) {
                if (((c30) this.f) == null) {
                    this.f = new c30();
                }
                c30 c30Var = (c30) this.f;
                c30Var.c = null;
                c30Var.b = false;
                c30Var.d = null;
                c30Var.a = false;
                WeakHashMap weakHashMap = mq3.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    c30Var.b = true;
                    c30Var.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    c30Var.a = true;
                    c30Var.d = backgroundTintMode;
                }
                if (c30Var.b || c30Var.a) {
                    yg.d(background, c30Var, view.getDrawableState());
                    return;
                }
            }
            c30 c30Var2 = (c30) this.e;
            if (c30Var2 != null) {
                yg.d(background, c30Var2, view.getDrawableState());
                return;
            }
            c30 c30Var3 = (c30) this.d;
            if (c30Var3 != null) {
                yg.d(background, c30Var3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        c30 c30Var = (c30) this.e;
        if (c30Var != null) {
            return (ColorStateList) c30Var.c;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        c30 c30Var = (c30) this.e;
        if (c30Var != null) {
            return (PorterDuff.Mode) c30Var.d;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = pf2.y;
        pi piVarH = pi.H(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) piVarH.g;
        View view2 = (View) this.b;
        mq3.h(view2, view2.getContext(), iArr, attributeSet, (TypedArray) piVarH.g, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                yg ygVar = (yg) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (ygVar) {
                    colorStateListG = ygVar.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    i(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(piVarH.l(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(wf0.b(typedArray.getInt(2, -1), null));
            }
            piVarH.J();
        } catch (Throwable th) {
            piVarH.J();
            throw th;
        }
    }

    public eu1 e(String str) {
        cu1 cu1Var;
        str.getClass();
        xb3 xb3Var = (xb3) this.f;
        if (xb3Var == null || (cu1Var = (cu1) xb3Var.getValue()) == null) {
            return null;
        }
        int i = fu1.j;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        uri.getClass();
        Bundle bundleD = cu1Var.d(uri, (LinkedHashMap) this.d);
        if (bundleD == null) {
            return null;
        }
        return new eu1((fu1) this.b, bundleD, cu1Var.l, cu1Var.b(uri), false);
    }

    public void f() {
        this.a = -1;
        i(null);
        a();
    }

    public void g(int i) {
        ColorStateList colorStateListG;
        this.a = i;
        yg ygVar = (yg) this.c;
        if (ygVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (ygVar) {
                colorStateListG = ygVar.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        i(colorStateListG);
        a();
    }

    public void h(uy0 uy0Var) {
        int iV = uj.V((uy0[]) this.b, uy0Var);
        if (iV >= 0) {
            uy0[] uy0VarArr = (uy0[]) this.b;
            int i = iV + 1;
            uj.J(uy0VarArr, uy0VarArr, iV, i, this.a);
            uy0[] uy0VarArr2 = (uy0[]) this.b;
            int i2 = this.a;
            uy0VarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.c;
            System.arraycopy(fArr, i, fArr, iV, i2 - i);
            byte[] bArr = (byte[]) this.d;
            uj.H(bArr, bArr, iV, i, this.a);
            this.a--;
        }
    }

    public void i(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((c30) this.d) == null) {
                this.d = new c30();
            }
            c30 c30Var = (c30) this.d;
            c30Var.c = colorStateList;
            c30Var.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void j(ColorStateList colorStateList) {
        if (((c30) this.e) == null) {
            this.e = new c30();
        }
        c30 c30Var = (c30) this.e;
        c30Var.c = colorStateList;
        c30Var.b = true;
        a();
    }

    public void k(PorterDuff.Mode mode) {
        if (((c30) this.e) == null) {
            this.e = new c30();
        }
        c30 c30Var = (c30) this.e;
        c30Var.d = mode;
        c30Var.a = true;
        a();
    }

    public yf(View view) {
        this.a = -1;
        this.b = view;
        this.c = yg.a();
    }
}
