package defpackage;

import android.os.Looper;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ik3 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ik3(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                return new zk(10, (gk3) obj3, (bk3) obj2);
            case 1:
                u10 u10Var = (u10) obj3;
                int i2 = 27;
                ((it2) u10Var).z(new p73(new er1(i2, Thread.currentThread(), (x50) obj2)));
                return new c4(15, u10Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                um3 um3Var = (um3) obj3;
                ((Long) obj).getClass();
                float f = um3Var.e;
                um3Var.e = 0.0f;
                ((ns0) obj2).h(Float.valueOf(f));
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                qt3 qt3Var = (qt3) obj3;
                View view = (View) obj2;
                qt3Var.a(view);
                return new zk(12, qt3Var, view);
            default:
                tu3 tu3Var = (tu3) obj3;
                d00 d00Var = (d00) obj2;
                a20 a20Var = (a20) obj;
                if (!tu3Var.h) {
                    of1 of1VarD = a20Var.d();
                    View view2 = a20Var.a;
                    gf1 lifecycle = of1VarD.getLifecycle();
                    tu3Var.j = d00Var;
                    if (tu3Var.i == null) {
                        if (s51.n(Looper.myLooper(), view2.getHandler().getLooper())) {
                            tu3Var.i = lifecycle;
                            lifecycle.a(tu3Var);
                        } else {
                            view2.post(new a8(7, tu3Var, lifecycle));
                        }
                    } else if (((rf1) lifecycle).i.compareTo(ff1.h) >= 0) {
                        tu3Var.g.A(new d00(-1723985096, new w1(tu3Var, a20Var, d00Var, 22), true));
                    }
                }
                return dm3Var;
        }
    }
}
