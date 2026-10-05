package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zk implements ic0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zk(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ic0
    public final void a() throws Exception {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((uk) obj2).b((c10) obj);
                break;
            case 1:
                ((of1) obj2).getLifecycle().b((x1) obj);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((qt1) obj2).m.j.b((ib0) obj);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((f21) obj2).a.j((d21) obj);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((le1) obj2).h.k(obj);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                Iterator it = ((List) ((e93) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((h10) obj).b().c((qt1) it.next());
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((uk) obj2).b((n10) obj);
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                os1 os1Var = (os1) obj2;
                zc2 zc2Var = (zc2) os1Var.getValue();
                if (zc2Var != null) {
                    yc2 yc2Var = new yc2(zc2Var);
                    qr1 qr1Var = (qr1) obj;
                    if (qr1Var != null) {
                        qr1Var.c(yc2Var);
                    }
                    os1Var.setValue(null);
                }
                break;
            case 8:
                ((tg3) obj2).c.remove((ns0) obj);
                break;
            case vr.g /* 9 */:
                ((gk3) obj2).k.remove((gk3) obj);
                break;
            case vr.h /* 10 */:
                gk3 gk3Var = (gk3) obj2;
                gk3Var.getClass();
                ak3 ak3Var = (ak3) ((bk3) obj).b.getValue();
                if (ak3Var != null) {
                    gk3Var.j.remove(ak3Var.f);
                }
                break;
            case 11:
                ((gk3) obj2).j.remove((ek3) obj);
                break;
            default:
                qt3 qt3Var = (qt3) obj2;
                View view = (View) obj;
                int i2 = qt3Var.u - 1;
                qt3Var.u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = mq3.a;
                    fq3.c(view, null);
                    mq3.k(view, null);
                    view.removeOnAttachStateChangeListener(qt3Var.v);
                }
                break;
        }
    }
}
