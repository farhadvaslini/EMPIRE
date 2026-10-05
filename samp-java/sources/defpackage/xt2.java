package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xt2 implements ss0 {
    public final /* synthetic */ o11 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ no2 i;
    public final /* synthetic */ cs0 j;

    public xt2(o11 o11Var, boolean z, boolean z2, no2 no2Var, cs0 cs0Var) {
        this.f = o11Var;
        this.g = z;
        this.h = z2;
        this.i = no2Var;
        this.j = cs0Var;
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
        bq1 bq1VarD = l11.a(yp1.a, qr1Var, this.f).d(new wt2(this.g, qr1Var, null, this.h, this.i, this.j));
        nv0Var.p(false);
        return bq1VarD;
    }
}
