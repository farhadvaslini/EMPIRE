package defpackage;

import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class kf1 implements mf1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ Object i;

    public /* synthetic */ kf1(Object obj, Serializable serializable, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = serializable;
        this.i = obj2;
    }

    @Override // defpackage.mf1
    public final void i(of1 of1Var, ef1 ef1Var) {
        int i = this.f;
        ef1 ef1Var2 = null;
        Object obj = this.i;
        Serializable serializable = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                vf1 vf1Var = (vf1) obj2;
                qk2 qk2Var = (qk2) serializable;
                ns0 ns0Var = (ns0) obj;
                int i2 = lf1.a[ef1Var.ordinal()];
                if (i2 == 1) {
                    qk2Var.f = ns0Var.h(vf1Var);
                    break;
                } else if (i2 == 2) {
                    yk ykVar = (yk) qk2Var.f;
                    if (ykVar != null) {
                        ykVar.a();
                    }
                    qk2Var.f = null;
                    break;
                }
                break;
            default:
                sn1 sn1Var = (sn1) obj2;
                ff1 ff1Var = (ff1) serializable;
                qo1 qo1Var = (qo1) obj;
                sn1Var.getClass();
                Runnable runnable = sn1Var.a;
                CopyOnWriteArrayList copyOnWriteArrayList = sn1Var.b;
                ef1.Companion.getClass();
                int iOrdinal = ff1Var.ordinal();
                if (iOrdinal == 2) {
                    ef1Var2 = ef1.ON_CREATE;
                } else if (iOrdinal == 3) {
                    ef1Var2 = ef1.ON_START;
                } else if (iOrdinal == 4) {
                    ef1Var2 = ef1.ON_RESUME;
                }
                if (ef1Var == ef1Var2) {
                    copyOnWriteArrayList.add(qo1Var);
                    runnable.run();
                } else if (ef1Var == ef1.ON_DESTROY) {
                    sn1Var.d(qo1Var);
                } else if (ef1Var == cf1.a(ff1Var)) {
                    copyOnWriteArrayList.remove(qo1Var);
                    runnable.run();
                }
                break;
        }
    }
}
