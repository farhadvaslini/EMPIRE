package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ej0 extends u71 implements ns0 {
    public final /* synthetic */ hj0 g;
    public final /* synthetic */ e93 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ i62 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ zi0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej0(hj0 hj0Var, ak3 ak3Var, long j, long j2, long j3, i62 i62Var, long j4, zi0 zi0Var) {
        super(1);
        this.g = hj0Var;
        this.h = ak3Var;
        this.i = j2;
        this.j = j3;
        this.k = i62Var;
        this.l = j4;
        this.m = zi0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        h62 h62Var = (h62) obj;
        hj0 hj0Var = this.g;
        u23 u23Var = hj0Var.A;
        e93 e93Var = this.h;
        long j = e93Var != null ? ((i41) e93Var.getValue()).a : 0L;
        u23Var.d();
        if (u23Var.d()) {
            u23Var.c.getClass();
        }
        long jC = i41.c(j, 0L);
        if (u23Var.d()) {
            u23Var.j = jC;
        }
        h5 h5Var = hj0Var.E;
        long jC2 = i41.c(h5Var != null ? h5Var.a(this.i, this.j, bb1.f) : 0L, jC);
        long j2 = this.l;
        h62Var.getClass();
        i62 i62Var = this.k;
        h62.c(h62Var, i62Var);
        i62Var.K0(i41.c((((long) (((int) (jC2 >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (jC2 & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), i62Var.j), 0.0f, this.m);
        return dm3.a;
    }
}
