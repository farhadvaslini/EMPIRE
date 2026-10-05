package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class t9 implements rs0 {
    public final /* synthetic */ bq1 f;
    public final /* synthetic */ ps1 g;
    public final /* synthetic */ os1 h;
    public final /* synthetic */ es2 i;
    public final /* synthetic */ z13 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ float l;
    public final /* synthetic */ d00 m;

    public t9(bq1 bq1Var, ps1 ps1Var, os1 os1Var, es2 es2Var, z13 z13Var, long j, float f, d00 d00Var) {
        this.f = bq1Var;
        this.g = ps1Var;
        this.h = os1Var;
        this.i = es2Var;
        this.j = z13Var;
        this.k = j;
        this.l = f;
        this.m = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            lr.d(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, nv0Var, 384);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
