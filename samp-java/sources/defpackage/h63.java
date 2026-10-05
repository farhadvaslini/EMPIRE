package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class h63 implements rs0 {
    public final /* synthetic */ rs0 f;
    public final /* synthetic */ d00 g;
    public final /* synthetic */ rs0 h;
    public final /* synthetic */ gh3 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;

    public h63(rs0 rs0Var, d00 d00Var, rs0 rs0Var2, gh3 gh3Var, long j, long j2) {
        this.f = rs0Var;
        this.g = d00Var;
        this.h = rs0Var2;
        this.i = gh3Var;
        this.j = j;
        this.k = j2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            nv0Var.a0(-168976609);
            y02.a(this.g, this.f, this.h, this.i, this.j, this.k, nv0Var, 0);
            nv0Var.p(false);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
