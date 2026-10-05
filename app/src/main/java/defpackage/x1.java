package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 implements mf1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ x1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.mf1
    public final void i(of1 of1Var, ef1 ef1Var) {
        int i = this.f;
        int i2 = 0;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((ns0) obj).h(ef1Var);
                break;
            case 1:
                tw twVar = (tw) obj;
                if (ef1Var == ef1.ON_RESUME) {
                    twVar.j();
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                wt1 wt1Var = (wt1) obj;
                wt1Var.q = ef1Var.a();
                if (wt1Var.c != null) {
                    ArrayList arrayListO0 = qx.O0(wt1Var.f);
                    int size = arrayListO0.size();
                    while (i2 < size) {
                        Object obj2 = arrayListO0.get(i2);
                        i2++;
                        qt1 qt1Var = (qt1) obj2;
                        qt1Var.getClass();
                        st1 st1Var = qt1Var.m;
                        st1Var.getClass();
                        st1Var.a.i = ef1Var.a();
                        st1Var.d = ef1Var.a();
                        st1Var.b();
                    }
                }
                break;
            default:
                vq2 vq2Var = (vq2) obj;
                if (ef1Var == ef1.ON_START) {
                    vq2Var.h = true;
                } else if (ef1Var == ef1.ON_STOP) {
                    vq2Var.h = false;
                }
                break;
        }
    }
}
