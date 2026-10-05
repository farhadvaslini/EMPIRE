package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class rb implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ wb g;
    public final /* synthetic */ yd3 h;

    public /* synthetic */ rb(wb wbVar, yd3 yd3Var, int i) {
        this.f = i;
        this.g = wbVar;
        this.h = yd3Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        int i2 = 3;
        int i3 = 2;
        yd3 yd3Var = this.h;
        wb wbVar = this.g;
        switch (i) {
            case 0:
                qb qbVar = wbVar.f;
                ja jaVar = new ja(i3, yd3Var);
                qk2 qk2Var = new qk2();
                wbVar.e.d("dataBuilder", qbVar, new u1(i2, qk2Var, jaVar));
                Object obj = qk2Var.f;
                if (obj != null) {
                    return (xd3) obj;
                }
                s51.F("result");
                throw null;
            case 1:
                qb qbVar2 = wbVar.g;
                rb rbVar = new rb(wbVar, yd3Var, i3);
                qk2 qk2Var2 = new qk2();
                wbVar.e.d("positioner", qbVar2, new u1(i2, qk2Var2, rbVar));
                Object obj2 = qk2Var2.f;
                if (obj2 != null) {
                    return (jk2) obj2;
                }
                s51.F("result");
                throw null;
            default:
                Object objA = wbVar.c.a();
                ab1 ab1Var = (ab1) (((ab1) objA).t0() ? objA : null);
                return ab1Var == null ? jk2.e : yd3Var.H(ab1Var).i(ab1Var.k0(0L));
        }
    }
}
