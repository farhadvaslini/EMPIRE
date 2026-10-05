package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qe2 implements ss0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;
    public final /* synthetic */ af2 h;

    public qe2(boolean z, long j, af2 af2Var) {
        this.f = z;
        this.g = j;
        this.h = af2Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        nv0 nv0Var = (nv0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            vp.f(Boolean.valueOf(this.f), null, uq.R(pq1.h, nv0Var), null, gq.N(-2064098104, new pe2(this.g, this.h), nv0Var), nv0Var, 24576);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
