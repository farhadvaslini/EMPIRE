package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t6 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ qk2 g;

    public /* synthetic */ t6(int i, qk2 qk2Var) {
        this.f = i;
        this.g = qk2Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        boolean z = true;
        qk2 qk2Var = this.g;
        switch (i) {
            case 0:
                qk2Var.f = (rp0) obj;
                return Boolean.TRUE;
            case 1:
                aw0 aw0Var = (aw0) obj;
                if (s51.n(aw0Var.V0(), "waiting")) {
                    qk2Var.f = aw0Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                yy0 yy0Var = (yy0) obj;
                Object obj2 = qk2Var.f;
                if (obj2 == null && yy0Var.v) {
                    qk2Var.f = yy0Var;
                } else if (obj2 != null) {
                    yy0Var.getClass();
                }
                return Boolean.TRUE;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                String str = (String) obj;
                str.getClass();
                Object obj3 = qk2Var.f;
                if (obj3 != null && ((Bundle) obj3).containsKey(str)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ia0 ia0Var = (nk3) obj;
                if (((aq1) ia0Var).f.s) {
                    qk2Var.f = ia0Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                nk3 nk3Var = (nk3) obj;
                nk3Var.getClass();
                nd1 nd1Var = ((pk3) nk3Var).t;
                List listN = (List) qk2Var.f;
                if (listN != null) {
                    listN.add(nd1Var);
                } else {
                    listN = vr.N(nd1Var);
                }
                qk2Var.f = listN;
                return mk3.g;
        }
    }
}
