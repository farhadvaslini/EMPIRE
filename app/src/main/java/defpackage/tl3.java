package defpackage;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tl3 implements wi {
    public final Object f;
    public final ArrayList g = new ArrayList();
    public Object h;

    public tl3(tb1 tb1Var) {
        this.f = tb1Var;
        this.h = tb1Var;
    }

    public final void a() {
        this.g.clear();
        this.h = this.f;
        ((tb1) this.f).R();
    }

    @Override // defpackage.wi
    public final void c(int i, Object obj) {
        ((tb1) this.h).B(i, (tb1) obj);
    }

    @Override // defpackage.wi
    public final void d(Object obj) {
        this.g.add(this.h);
        this.h = obj;
    }

    @Override // defpackage.wi
    public final void e() {
        lk2 rectManager;
        l6 autofillManager;
        lk2 rectManager2;
        tb1 tb1Var = (tb1) this.h;
        ax1 ax1Var = tb1Var.L;
        if (!tb1Var.H()) {
            m21.a("onReuse is only expected on attached node");
        }
        pq3 pq3Var = tb1Var.u;
        if (pq3Var != null) {
            View view = pq3Var.g;
            if (view.getParent() != pq3Var) {
                pq3Var.addView(view);
            } else {
                pq3Var.k.a();
            }
        }
        hc1 hc1Var = tb1Var.N;
        if (hc1Var != null) {
            hc1Var.i(false);
        }
        tb1Var.z = false;
        if (tb1Var.W) {
            tb1Var.W = false;
        } else {
            aq1 aq1Var = tb1Var.L.e;
            for (aq1 aq1Var2 = aq1Var; aq1Var2 != null; aq1Var2 = aq1Var2.j) {
                if (aq1Var2.s) {
                    aq1Var2.k1();
                }
            }
            for (aq1 aq1Var3 = aq1Var; aq1Var3 != null; aq1Var3 = aq1Var3.j) {
                if (aq1Var3.s) {
                    aq1Var3.m1();
                }
            }
            while (aq1Var != null) {
                if (aq1Var.s) {
                    aq1Var.g1();
                }
                aq1Var = aq1Var.j;
            }
        }
        int i = tb1Var.g;
        q12 q12Var = tb1Var.t;
        if (q12Var != null && (rectManager2 = ((h7) q12Var).getRectManager()) != null) {
            rectManager2.i(tb1Var);
        }
        tb1Var.g = su2.a.addAndGet(1);
        q12 q12Var2 = tb1Var.t;
        if (q12Var2 != null) {
            h7 h7Var = (h7) q12Var2;
            h7Var.getLayoutNodes().g(i);
            h7Var.getLayoutNodes().i(tb1Var.g, tb1Var);
        }
        for (aq1 aq1Var4 = ax1Var.f; aq1Var4 != null; aq1Var4 = aq1Var4.k) {
            aq1Var4.f1();
        }
        ax1Var.e();
        if (ax1Var.d(8)) {
            tb1Var.F();
        }
        tb1.Z(tb1Var);
        q12 q12Var3 = tb1Var.t;
        if (q12Var3 != null && (autofillManager = ((h7) q12Var3).getAutofillManager()) != null) {
            h7 h7Var2 = autofillManager.h;
            a31 a31Var = autofillManager.f;
            pr1 pr1Var = autofillManager.m;
            if (pr1Var.f(i)) {
                a31Var.z(h7Var2, i, false);
            }
            qu2 qu2VarW = tb1Var.w();
            if (qu2VarW != null && qu2VarW.f.b(zu2.r)) {
                pr1Var.a(tb1Var.g);
                a31Var.z(h7Var2, tb1Var.g, true);
            }
        }
        q12 q12Var4 = tb1Var.t;
        if (q12Var4 == null || (rectManager = ((h7) q12Var4).getRectManager()) == null) {
            return;
        }
        rectManager.h(tb1Var);
    }

    @Override // defpackage.wi
    public final /* bridge */ /* synthetic */ void f(int i, Object obj) {
    }

    @Override // defpackage.wi
    public final void g() {
        q12 q12Var = ((tb1) this.f).t;
        if (q12Var != null) {
            ((h7) q12Var).w();
        }
    }

    @Override // defpackage.wi
    public final void h(int i, int i2, int i3) {
        ((tb1) this.h).L(i, i2, i3);
    }

    @Override // defpackage.wi
    public final Object i() {
        return this.h;
    }

    @Override // defpackage.wi
    public final void j(int i, int i2) {
        ((tb1) this.h).S(i, i2);
    }

    @Override // defpackage.wi
    public final void s() {
        this.h = this.g.remove(r0.size() - 1);
    }
}
