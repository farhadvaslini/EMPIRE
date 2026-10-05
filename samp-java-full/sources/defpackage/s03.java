package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s03 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ns0 h;

    public /* synthetic */ s03(int i, ns0 ns0Var, boolean z) {
        this.f = i;
        this.g = z;
        this.h = ns0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    br.j(this.g, this.h, null, null, nv0Var, 0);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    br.j(this.g, this.h, null, null, nv0Var2, 0);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    br.j(this.g, this.h, null, null, nv0Var3, 0);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nv0Var4.U();
                } else {
                    br.j(this.g, this.h, null, null, nv0Var4, 0);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    nv0Var5.U();
                } else {
                    br.j(this.g, this.h, null, null, nv0Var5, 0);
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nv0Var6.U();
                } else {
                    br.j(this.g, this.h, null, null, nv0Var6, 0);
                }
                break;
            default:
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    nv0Var7.U();
                } else {
                    br.j(this.g, this.h, null, null, nv0Var7, 0);
                }
                break;
        }
        return dm3Var;
    }
}
