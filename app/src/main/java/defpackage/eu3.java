package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class eu3 implements mf1 {
    public final /* synthetic */ n40 f;
    public final /* synthetic */ ic g;
    public final /* synthetic */ ek2 h;
    public final /* synthetic */ qk2 i;

    public eu3(n40 n40Var, ic icVar, ek2 ek2Var, qk2 qk2Var) {
        this.f = n40Var;
        this.g = icVar;
        this.h = ek2Var;
        this.i = qk2Var;
    }

    @Override // defpackage.mf1
    public final void i(of1 of1Var, ef1 ef1Var) {
        boolean z;
        hr hrVarY = null;
        switch (du3.a[ef1Var.ordinal()]) {
            case 1:
                cl3.t(this.f, null, new n9(this.i, this.h, of1Var, this, null, 19), 1);
                return;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ic icVar = this.g;
                if (icVar != null) {
                    yj0 yj0Var = (yj0) icVar.h;
                    synchronized (yj0Var.b) {
                        try {
                            synchronized (yj0Var.b) {
                                z = yj0Var.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) yj0Var.c;
                                yj0Var.c = (ArrayList) yj0Var.d;
                                yj0Var.d = arrayList;
                                yj0Var.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((p40) arrayList.get(i)).t(dm3.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                ek2 ek2Var = this.h;
                synchronized (ek2Var.c) {
                    if (ek2Var.t) {
                        ek2Var.t = false;
                        hrVarY = ek2Var.y();
                    }
                    break;
                }
                if (hrVarY != null) {
                    ((jr) hrVarY).t(dm3.a);
                    return;
                }
                return;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ek2 ek2Var2 = this.h;
                synchronized (ek2Var2.c) {
                    ek2Var2.t = true;
                }
                return;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                this.h.x();
                return;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                c.k();
                return;
        }
    }
}
