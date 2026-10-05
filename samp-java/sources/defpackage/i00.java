package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class i00 implements ss0 {
    public static final i00 g = new i00(0);
    public static final i00 h = new i00(1);
    public static final i00 i = new i00(2);
    public final /* synthetic */ int f;

    public /* synthetic */ i00(int i2) {
        this.f = i2;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i2 = this.f;
        dm3 dm3Var = dm3.a;
        switch (i2) {
            case 0:
                ((Number) obj3).intValue();
                break;
            case 1:
                z53 z53Var = (z53) obj;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= nv0Var.f(z53Var) ? 4 : 2;
                }
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    nv0Var.U();
                } else {
                    y02.c(z53Var, null, null, 0L, 0L, 0L, 0L, 0L, nv0Var, iIntValue & 14);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                qf0 qf0Var = (qf0) obj;
                long j = ((gy1) obj2).a;
                long j2 = ((wx) obj3).a;
                x43 x43Var = x43.a;
                qf0.a0(qf0Var, j2, qf0Var.T(x43.c) / 2.0f, j, null, 120);
                break;
            default:
                ((Number) obj3).intValue();
                t00.a.f((nv0) obj2, 0);
                break;
        }
        return dm3Var;
    }
}
