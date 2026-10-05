package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jk0 implements rs0 {
    public final /* synthetic */ ok0 f;
    public final /* synthetic */ bq1 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ps1 i;
    public final /* synthetic */ os1 j;
    public final /* synthetic */ es2 k;
    public final /* synthetic */ z13 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ float n;
    public final /* synthetic */ d00 o;

    public jk0(ok0 ok0Var, bq1 bq1Var, boolean z, ps1 ps1Var, os1 os1Var, es2 es2Var, z13 z13Var, long j, float f, d00 d00Var) {
        this.f = ok0Var;
        this.g = bq1Var;
        this.h = z;
        this.i = ps1Var;
        this.j = os1Var;
        this.k = es2Var;
        this.l = z13Var;
        this.m = j;
        this.n = f;
        this.o = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            ok0 ok0Var = this.f;
            lr.d(vm1.C(this.g, new yv(this.h, ok0Var.j, ok0Var.k)), this.i, this.j, this.k, this.l, this.m, this.n, this.o, nv0Var, 384);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
