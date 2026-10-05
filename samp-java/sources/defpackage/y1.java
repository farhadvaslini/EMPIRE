package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class y1 implements ic0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public y1(of1 of1Var, kf1 kf1Var, qk2 qk2Var) {
        this.a = 3;
        this.c = of1Var;
        this.b = kf1Var;
        this.d = qk2Var;
    }

    @Override // defpackage.ic0
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((cs0) obj3).a();
                ((of1) obj2).getLifecycle().b((x1) obj);
                break;
            case 1:
                ((l73) obj3).remove(obj2);
                ((zd) obj).d.k(obj2);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                qt1 qt1Var = (qt1) obj2;
                ((mb0) obj3).b().c(qt1Var);
                ((l73) obj).remove(qt1Var);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((of1) obj2).getLifecycle().b((kf1) obj3);
                yk ykVar = (yk) ((qk2) obj).f;
                if (ykVar != null) {
                    ykVar.a();
                }
                break;
            default:
                eq2 eq2Var = (eq2) obj3;
                jq2 jq2Var = (jq2) obj;
                if (eq2Var.g.k(obj2) == jq2Var) {
                    Map map = eq2Var.f;
                    Map mapC = jq2Var.c();
                    if (!mapC.isEmpty()) {
                        map.put(obj2, mapC);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }

    public /* synthetic */ y1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
