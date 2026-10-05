package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class i63 implements rs0 {
    public final /* synthetic */ rs0 f;
    public final /* synthetic */ d00 g;
    public final /* synthetic */ rs0 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;

    public i63(rs0 rs0Var, d00 d00Var, rs0 rs0Var2, long j, long j2) {
        this.f = rs0Var;
        this.g = d00Var;
        this.h = rs0Var2;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            vr.c(mg3.a.a(ql3.a(gv3.W, nv0Var)), gq.N(969655473, new h63(this.f, this.g, this.h, ql3.a(gv3.Q, nv0Var), this.i, this.j), nv0Var), nv0Var, 56);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
