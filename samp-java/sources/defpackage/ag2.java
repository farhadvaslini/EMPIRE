package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class ag2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cf2 g;

    public /* synthetic */ ag2(cf2 cf2Var, int i) {
        this.f = i;
        this.g = cf2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f;
        dm3 dm3Var = dm3.a;
        cf2 cf2Var = this.g;
        switch (i5) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    if (cf2Var != null) {
                        i = -379398235;
                        i2 = 2131624554;
                    } else {
                        i = -379395868;
                        i2 = 2131624550;
                    }
                    mg3.b(by1.f(nv0Var, i, i2, nv0Var, false), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var, 0, 0, 262142);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    mg3.b(oz2.N(2131624074, new Object[]{cf2Var.b}, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    mg3.b(cf2Var.b, null, 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var3, 1572864, 0, 262078);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nv0Var4.U();
                } else {
                    mg3.b(cf2Var.c, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var4, 0, 0, 262142);
                }
                break;
            default:
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!nv0Var5.R(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    nv0Var5.U();
                } else {
                    if (cf2Var != null) {
                        i3 = 1178202755;
                        i4 = 2131624077;
                    } else {
                        i3 = 1178205442;
                        i4 = 2131624071;
                    }
                    mg3.b(by1.f(nv0Var5, i3, i4, nv0Var5, false), null, 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var5, 1572864, 0, 262078);
                }
                break;
        }
        return dm3Var;
    }
}
