package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pl1 extends gq1 {
    public final rf a;
    public final wf3 b;
    public final r62 c;

    public pl1(rf rfVar, wf3 wf3Var, r62 r62Var) {
        this.a = rfVar;
        this.b = wf3Var;
        this.c = r62Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new rl1(this.a, this.b, this.c);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        rl1 rl1Var = (rl1) aq1Var;
        rl1Var.getClass();
        r62 r62Var = rl1Var.v;
        View view = rl1Var.w;
        ua0 ua0Var = rl1Var.x;
        rl1Var.t = this.a;
        rl1Var.u = this.b;
        r62 r62Var2 = this.c;
        rl1Var.v = r62Var2;
        View viewS = vp.S(rl1Var);
        ua0 ua0Var2 = vr.X(rl1Var).E;
        if (rl1Var.y != null) {
            cv2 cv2Var = sl1.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !r62Var2.a()) || !jd0.b(Float.NaN, Float.NaN) || !jd0.b(Float.NaN, Float.NaN) || !r62Var2.equals(r62Var) || !viewS.equals(view) || !s51.n(ua0Var2, ua0Var)) {
                rl1Var.q1();
            }
        }
        rl1Var.r1();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + by1.b(nc2.a(nc2.a(nc2.c(9205357640488583168L, by1.b(nc2.a(this.a.hashCode() * 961, Float.NaN, 31), 31, true), 31), Float.NaN, 31), Float.NaN, 31), 31, true)) * 31);
    }
}
