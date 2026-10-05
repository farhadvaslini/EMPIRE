package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bc extends TextPaint {
    public w9 a;
    public ne3 b;
    public int c;
    public r13 d;
    public wx e;
    public dp f;
    public cb0 g;
    public h43 h;
    public rf0 i;

    public final w9 a() {
        w9 w9Var = this.a;
        if (w9Var != null) {
            return w9Var;
        }
        w9 w9Var2 = new w9(this);
        this.a = w9Var2;
        return w9Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().g(i);
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final dp dpVar, final long j, float f) {
        if (dpVar == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (dpVar instanceof w73) {
            d(b32.v(f, ((w73) dpVar).a));
            return;
        }
        if (!(dpVar instanceof o13)) {
            c.k();
            return;
        }
        if (s51.n(this.f, dpVar)) {
            h43 h43Var = this.h;
            if (!(h43Var == null ? false : h43.a(h43Var.a, j))) {
            }
        } else if (j != 9205357640488583168L) {
            this.f = dpVar;
            this.h = new h43(j);
            this.g = b32.j(new cs0() { // from class: ac
                @Override // defpackage.cs0
                public final Object a() {
                    return ((o13) dpVar).b(j);
                }
            });
        }
        w9 w9VarA = a();
        cb0 cb0Var = this.g;
        w9VarA.l(cb0Var != null ? (Shader) cb0Var.getValue() : null);
        this.e = null;
        f80.O(this, f);
    }

    public final void d(long j) {
        wx wxVar = this.e;
        if ((wxVar == null ? false : wx.c(wxVar.a, j)) || j == 16) {
            return;
        }
        this.e = new wx(j);
        setColor(vp.T(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(rf0 rf0Var) {
        if (rf0Var == null || s51.n(this.i, rf0Var)) {
            return;
        }
        this.i = rf0Var;
        if (rf0Var.equals(fm0.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(rf0Var instanceof ga3)) {
            c.k();
            return;
        }
        a().p(1);
        ga3 ga3Var = (ga3) rf0Var;
        a().o(ga3Var.a);
        w9 w9VarA = a();
        ((Paint) w9VarA.b).setStrokeMiter(ga3Var.b);
        a().n(ga3Var.d);
        a().m(ga3Var.c);
        a().k(null);
    }

    public final void f(r13 r13Var) {
        if (r13Var == null || s51.n(this.d, r13Var)) {
            return;
        }
        this.d = r13Var;
        if (r13Var.equals(r13.d)) {
            clearShadowLayer();
            return;
        }
        r13 r13Var2 = this.d;
        float f = r13Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (r13Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), vp.T(this.d.a));
    }

    public final void g(ne3 ne3Var) {
        if (ne3Var == null || s51.n(this.b, ne3Var)) {
            return;
        }
        this.b = ne3Var;
        int i = ne3Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
