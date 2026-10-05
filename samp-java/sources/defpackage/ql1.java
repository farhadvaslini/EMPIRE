package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class ql1 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ rl1 g;

    public /* synthetic */ ql1(rl1 rl1Var, int i) {
        this.f = i;
        this.g = rl1Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        rl1 rl1Var = this.g;
        switch (i) {
            case 0:
                rl1Var.r1();
                return dm3.a;
            case 1:
                return new gy1(rl1Var.B);
            default:
                ab1 ab1Var = (ab1) rl1Var.z.getValue();
                return new gy1(ab1Var != null ? ab1Var.k0(0L) : 9205357640488583168L);
        }
    }
}
