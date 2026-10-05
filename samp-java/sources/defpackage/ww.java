package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ww implements ss0 {
    public final /* synthetic */ o11 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ no2 h;
    public final /* synthetic */ cs0 i;

    public ww(o11 o11Var, boolean z, no2 no2Var, cs0 cs0Var) {
        this.f = o11Var;
        this.g = z;
        this.h = no2Var;
        this.i = cs0Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        nv0 nv0Var = (nv0) obj2;
        ((Number) obj3).intValue();
        nv0Var.a0(-1525724089);
        Object objO = nv0Var.O();
        if (objO == c20.a) {
            objO = nc2.e(nv0Var);
        }
        qr1 qr1Var = (qr1) objO;
        bq1 bq1VarD = l11.a(yp1.a, qr1Var, this.f).d(new uw(qr1Var, null, false, this.g, null, this.h, this.i));
        nv0Var.p(false);
        return bq1VarD;
    }
}
