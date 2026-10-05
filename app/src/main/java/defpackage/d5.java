package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class d5 implements rs0 {
    public final /* synthetic */ rs0 f;
    public final /* synthetic */ rs0 g;
    public final /* synthetic */ rs0 h;
    public final /* synthetic */ z13 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ rs0 n;
    public final /* synthetic */ d00 o;

    public d5(rs0 rs0Var, rs0 rs0Var2, rs0 rs0Var3, z13 z13Var, long j, long j2, long j3, long j4, rs0 rs0Var4, d00 d00Var) {
        this.f = rs0Var;
        this.g = rs0Var2;
        this.h = rs0Var3;
        this.i = z13Var;
        this.j = j;
        this.k = j2;
        this.l = j3;
        this.m = j4;
        this.n = rs0Var4;
        this.o = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 1;
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            e5.a(gq.N(1367541877, new c5(this.n, this.o, i), nv0Var), null, this.f, this.g, this.h, this.i, this.j, hy.e(r51.s1, nv0Var), this.k, this.l, this.m, nv0Var, 6);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
