package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sd1 implements pd1 {
    public final cb0 a;
    public final /* synthetic */ ie1 b;

    public sd1(ie1 ie1Var) {
        this.b = ie1Var;
        this.a = b32.j(new qd1(ie1Var, 0));
    }

    @Override // defpackage.pd1
    public final int a() {
        ie1 ie1Var = this.b;
        return (int) (ie1Var.i().p == t02.f ? ie1Var.i().i() & 4294967295L : ie1Var.i().i() >> 32);
    }

    @Override // defpackage.pd1
    public final float b() {
        ie1 ie1Var = this.b;
        return (ie1Var.g() * 500) + ie1Var.h();
    }

    @Override // defpackage.pd1
    public final px c() {
        return new px(((Number) this.a.getValue()).intValue(), 1);
    }

    @Override // defpackage.pd1
    public final Object d(int i, wd1 wd1Var) {
        ar2 ar2Var = ie1.x;
        ie1 ie1Var = this.b;
        ie1Var.getClass();
        Object objD = ie1Var.d(ts1.f, new wd1(ie1Var, i, 0, (p40) null), wd1Var);
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        if (objD != y50Var) {
            objD = dm3Var;
        }
        return objD == y50Var ? objD : dm3Var;
    }

    @Override // defpackage.pd1
    public final int e() {
        ie1 ie1Var = this.b;
        return (-ie1Var.i().m) + ie1Var.i().q;
    }

    @Override // defpackage.pd1
    public final float f() {
        ie1 ie1Var = this.b;
        int iG = ie1Var.g();
        int iH = ie1Var.h();
        return ie1Var.c() ? (iG * 500) + iH + 100.0f : (iG * 500) + iH;
    }
}
