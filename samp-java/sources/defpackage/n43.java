package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class n43 extends u71 implements ns0 {
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n43(long j) {
        super(1);
        this.g = j;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        uw0 uw0Var = (uw0) obj;
        long j = this.g;
        uw0Var.m(Float.intBitsToFloat((int) (j >> 32)));
        uw0Var.s(Float.intBitsToFloat((int) (j & 4294967295L)));
        uw0Var.q0(d32.g(0.0f, 0.0f));
        return dm3.a;
    }
}
