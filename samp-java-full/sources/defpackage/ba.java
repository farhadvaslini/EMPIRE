package defpackage;

import android.os.Bundle;
import top.th1nk.samp.feature.raksamp.RaksampNativeBridge;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ba implements ts0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ba(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                ca caVar = (ca) obj5;
                ml3 ml3VarB = ((aq0) caVar.e).b((zb3) obj, (xq0) obj2, ((vq0) obj3).a, ((wq0) obj4).a);
                if (!(ml3VarB instanceof ml3)) {
                    pi piVar = new pi(ml3VarB, caVar.j);
                    caVar.j = piVar;
                    Object obj6 = piVar.i;
                    obj6.getClass();
                } else {
                    Object obj7 = ml3VarB.f;
                    obj7.getClass();
                }
                break;
            case 1:
                nu1 nu1Var = (nu1) obj5;
                qt1 qt1Var = (qt1) obj2;
                nv0 nv0Var = (nv0) obj3;
                ((Integer) obj4).getClass();
                ((sd) obj).getClass();
                qt1Var.getClass();
                Bundle bundleA = qt1Var.m.a();
                if (bundleA != null && (string = bundleA.getString("instanceId")) != null) {
                    boolean zH = nv0Var.h(nu1Var);
                    Object objO = nv0Var.O();
                    if (zH || objO == c20.a) {
                        objO = new q91(nu1Var, 2);
                        nv0Var.j0(objO);
                    }
                    vm1.m(string, (cs0) objO, null, nv0Var, 0);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ss0 ss0Var = (ss0) obj5;
                nc1 nc1Var = (nc1) obj;
                ((Integer) obj2).intValue();
                nv0 nv0Var2 = (nv0) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= nv0Var2.f(nc1Var) ? 4 : 2;
                }
                if (!nv0Var2.R(iIntValue & 1, (iIntValue & 131) != 130)) {
                    nv0Var2.U();
                } else {
                    ss0Var.e(nc1Var, nv0Var2, Integer.valueOf(iIntValue & 14));
                }
                break;
            default:
                vi2 vi2Var = (vi2) obj5;
                int iIntValue2 = ((Integer) obj).intValue();
                int iIntValue3 = ((Integer) obj2).intValue();
                int iIntValue4 = ((Integer) obj3).intValue();
                String str = (String) obj4;
                str.getClass();
                vi2Var.m.i(null);
                RaksampNativeBridge.INSTANCE.sendDialogResponse(vi2Var.c, iIntValue2, iIntValue3, iIntValue4, str);
                break;
        }
        return dm3Var;
    }
}
