package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xd1 extends aq1 implements tu2 {
    public cs0 t;
    public pd1 u;
    public t02 v;
    public boolean w;
    public tr2 x;
    public final ud1 y = new ud1(this, 0);
    public ud1 z;

    public xd1(cs0 cs0Var, pd1 pd1Var, t02 t02Var, boolean z) {
        this.t = cs0Var;
        this.u = pd1Var;
        this.v = t02Var;
        this.w = z;
        p1();
    }

    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        bv2.l(dv2Var);
        dv2Var.a(zu2.P, this.y);
        t02 t02Var = this.v;
        tr2 tr2Var = this.x;
        if (t02Var == t02.f) {
            if (tr2Var == null) {
                s51.F("scrollAxisRange");
                throw null;
            }
            cv2 cv2Var = zu2.w;
            a71 a71Var = bv2.a[13];
            cv2Var.getClass();
            dv2Var.a(cv2Var, tr2Var);
        } else {
            if (tr2Var == null) {
                s51.F("scrollAxisRange");
                throw null;
            }
            cv2 cv2Var2 = zu2.v;
            a71 a71Var2 = bv2.a[12];
            cv2Var2.getClass();
            dv2Var.a(cv2Var2, tr2Var);
        }
        ud1 ud1Var = this.z;
        if (ud1Var != null) {
            dv2Var.a(pu2.f, new y0(null, ud1Var));
        }
        dv2Var.a(pu2.C, new y0(null, new xc1(28, new vd1(this, 2))));
        px pxVarC = this.u.c();
        cv2 cv2Var3 = zu2.f;
        a71 a71Var3 = bv2.a[24];
        cv2Var3.getClass();
        dv2Var.a(cv2Var3, pxVarC);
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    public final void p1() {
        this.x = new tr2(new vd1(this, 0), new vd1(this, 1));
        this.z = this.w ? new ud1(this, 1) : null;
    }
}
