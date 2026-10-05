package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yd extends n51 {
    public long A;
    public final wd B;
    public final wd C;
    public long D;
    public bk3 u;
    public os1 v;
    public zd w;
    public i62 x;
    public i62 y;
    public long z;

    public yd(bk3 bk3Var, os1 os1Var, zd zdVar) {
        super(1);
        this.u = bk3Var;
        this.v = os1Var;
        this.w = zdVar;
        this.z = 0L;
        this.A = 0L;
        this.B = new wd(this, 1);
        this.C = new wd(this, 0);
        this.D = -9223372034707292160L;
    }

    @Override // defpackage.aq1
    public final void j1() {
        this.D = -9223372034707292160L;
    }

    @Override // defpackage.n51, defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        long j2;
        i62 i62VarT = xm1Var.t(j);
        if (en1Var.M()) {
            j2 = (((long) i62VarT.f) << 32) | (((long) i62VarT.g) & 4294967295L);
        } else {
            bk3 bk3Var = this.u;
            int i = i62VarT.f;
            if (bk3Var == null) {
                j2 = (((long) i) << 32) | (((long) i62VarT.g) & 4294967295L);
                this.D = j2;
            } else {
                long j3 = (((long) i62VarT.g) & 4294967295L) | (((long) i) << 32);
                ak3 ak3VarA = bk3Var.a(new xd(this, j3, 0), null, null, new xd(this, j3, 1));
                j2 = ((p41) ak3VarA.getValue()).a;
                this.D = ((p41) ak3VarA.getValue()).a;
            }
        }
        boolean zM = en1Var.M();
        oi0 oi0Var = oi0.f;
        if (zM) {
            this.x = i62VarT;
            this.z = j2;
            return en1Var.I0((int) (j2 >> 32), (int) (j2 & 4294967295L), oi0Var, this.B);
        }
        this.y = i62VarT;
        this.A = j2;
        return en1Var.I0((int) (j2 >> 32), (int) (j2 & 4294967295L), oi0Var, this.C);
    }
}
