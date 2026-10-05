package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class w6 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ w6(ie1 ie1Var, int i) {
        this.f = 5;
        this.g = i;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        boolean zX1;
        int i = this.f;
        int i2 = this.g;
        switch (i) {
            case 0:
                zX1 = ((rp0) obj).x1(i2);
                break;
            case 1:
                zX1 = ((rp0) obj).x1(i2);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                zX1 = ((rp0) obj).x1(i2);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                zX1 = ((rp0) obj).x1(i2);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                zX1 = ((rp0) obj).p1(i2);
                break;
            default:
                ld1 ld1Var = (ld1) obj;
                t63 t63VarL = jo3.l();
                jo3.v(t63VarL, jo3.s(t63VarL), t63VarL != null ? t63VarL.e() : null);
                int i3 = ld1Var.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    ld1Var.a(i2 + i4);
                }
                return dm3.a;
        }
        return Boolean.valueOf(zX1);
    }

    public /* synthetic */ w6(int i, int i2) {
        this.f = i2;
        this.g = i;
    }
}
