package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class vd1 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ xd1 g;

    public /* synthetic */ vd1(xd1 xd1Var, int i) {
        this.f = i;
        this.g = xd1Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        xd1 xd1Var = this.g;
        switch (i) {
            case 0:
                return Float.valueOf(xd1Var.u.b());
            case 1:
                return Float.valueOf(xd1Var.u.f());
            default:
                return Float.valueOf(xd1Var.u.a() - xd1Var.u.e());
        }
    }
}
