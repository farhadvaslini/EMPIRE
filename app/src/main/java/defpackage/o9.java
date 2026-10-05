package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class o9 implements j72 {
    public te1 a;
    public w83 b;
    public ze1 c;
    public s23 d;

    @Override // defpackage.j72
    public final void a(bg3 bg3Var, b11 b11Var, v1 v1Var, w40 w40Var) {
        j(new a4(bg3Var, this, b11Var, v1Var, w40Var, 1));
    }

    @Override // defpackage.j72
    public final void b() {
        j(null);
    }

    @Override // defpackage.j72
    public final void c(bg3 bg3Var, bg3 bg3Var2) {
        ze1 ze1Var = this.c;
        if (ze1Var != null) {
            boolean z = (yg3.b(ze1Var.h.b, bg3Var2.b) && s51.n(ze1Var.h.c, bg3Var2.c)) ? false : true;
            ze1Var.h = bg3Var2;
            int size = ze1Var.j.size();
            for (int i = 0; i < size; i++) {
                hk2 hk2Var = (hk2) ((WeakReference) ze1Var.j.get(i)).get();
                if (hk2Var != null) {
                    hk2Var.g = bg3Var2;
                }
            }
            ue1 ue1Var = ze1Var.m;
            synchronized (ue1Var.c) {
                ue1Var.j = null;
                ue1Var.l = null;
                ue1Var.k = null;
                ue1Var.m = null;
                ue1Var.n = null;
            }
            if (s51.n(bg3Var, bg3Var2)) {
                if (z) {
                    a31 a31Var = ze1Var.b;
                    int iF = yg3.f(bg3Var2.b);
                    int iE = yg3.e(bg3Var2.b);
                    yg3 yg3Var = ze1Var.h.c;
                    int iF2 = yg3Var != null ? yg3.f(yg3Var.a) : -1;
                    yg3 yg3Var2 = ze1Var.h.c;
                    a31Var.t().updateSelection((View) a31Var.g, iF, iE, iF2, yg3Var2 != null ? yg3.e(yg3Var2.a) : -1);
                    return;
                }
                return;
            }
            if (bg3Var != null && (!s51.n(bg3Var.a.g, bg3Var2.a.g) || (yg3.b(bg3Var.b, bg3Var2.b) && !s51.n(bg3Var.c, bg3Var2.c)))) {
                a31 a31Var2 = ze1Var.b;
                a31Var2.t().restartInput((View) a31Var2.g);
                return;
            }
            int size2 = ze1Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hk2 hk2Var2 = (hk2) ((WeakReference) ze1Var.j.get(i2)).get();
                if (hk2Var2 != null) {
                    bg3 bg3Var3 = ze1Var.h;
                    a31 a31Var3 = ze1Var.b;
                    if (hk2Var2.k) {
                        hk2Var2.g = bg3Var3;
                        if (hk2Var2.i) {
                            a31Var3.t().updateExtractedText((View) a31Var3.g, hk2Var2.h, t22.h(bg3Var3));
                        }
                        yg3 yg3Var3 = bg3Var3.c;
                        long j = bg3Var3.b;
                        int iF3 = yg3Var3 != null ? yg3.f(yg3Var3.a) : -1;
                        yg3 yg3Var4 = bg3Var3.c;
                        a31Var3.t().updateSelection((View) a31Var3.g, yg3.f(j), yg3.e(j), iF3, yg3Var4 != null ? yg3.e(yg3Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.j72
    public final void d() {
        t73 t73Var;
        te1 te1Var = this.a;
        if (te1Var == null || (t73Var = (t73) ur.z(te1Var, s20.q)) == null) {
            return;
        }
        ((ka0) t73Var).b();
    }

    @Override // defpackage.j72
    public final void e(bg3 bg3Var, iy1 iy1Var, pg3 pg3Var, va vaVar, jk2 jk2Var, jk2 jk2Var2) {
        ze1 ze1Var = this.c;
        if (ze1Var != null) {
            ue1 ue1Var = ze1Var.m;
            synchronized (ue1Var.c) {
                try {
                    ue1Var.j = bg3Var;
                    ue1Var.l = iy1Var;
                    ue1Var.k = pg3Var;
                    ue1Var.m = jk2Var;
                    ue1Var.n = jk2Var2;
                    if (ue1Var.e || ue1Var.d) {
                        ue1Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.j72
    public final void f() {
        t73 t73Var;
        te1 te1Var = this.a;
        if (te1Var == null || (t73Var = (t73) ur.z(te1Var, s20.q)) == null) {
            return;
        }
        ((ka0) t73Var).a();
    }

    @Override // defpackage.j72
    public final void g() {
        w83 w83Var = this.b;
        if (w83Var != null) {
            w83Var.c(null);
        }
        this.b = null;
        ms1 ms1VarI = i();
        if (ms1VarI != null) {
            s23 s23Var = (s23) ms1VarI;
            synchronized (s23Var) {
                s23Var.u(s23Var.o() + ((long) s23Var.p), s23Var.o, s23Var.o() + ((long) s23Var.p), s23Var.o() + ((long) s23Var.p) + ((long) s23Var.q));
            }
        }
    }

    @Override // defpackage.j72
    public final void h(jk2 jk2Var) {
        Rect rect;
        ze1 ze1Var = this.c;
        if (ze1Var != null) {
            ze1Var.l = new Rect(vm1.M(jk2Var.a), vm1.M(jk2Var.b), vm1.M(jk2Var.c), vm1.M(jk2Var.d));
            if (!ze1Var.j.isEmpty() || (rect = ze1Var.l) == null) {
                return;
            }
            ze1Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final ms1 i() {
        s23 s23Var = this.d;
        if (s23Var != null) {
            return s23Var;
        }
        if (!ja3.a) {
            return null;
        }
        s23 s23VarB = r51.b(2, jp.h);
        this.d = s23VarB;
        return s23VarB;
    }

    public final void j(a4 a4Var) {
        te1 te1Var = this.a;
        if (te1Var == null) {
            return;
        }
        this.b = te1Var.s ? cl3.t(te1Var.d1(), null, new hd1(te1Var, new n9(a4Var, this, te1Var, w83Var, 0), w83Var, 1), 1) : null;
    }

    public final void k(te1 te1Var) {
        te1 te1Var2 = this.a;
        if (!(te1Var2 == te1Var)) {
            p21.c("Expected textInputModifierNode to be " + te1Var + " but was " + te1Var2);
        }
        this.a = null;
    }
}
