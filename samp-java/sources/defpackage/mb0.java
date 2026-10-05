package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
@xv1("dialog")
public final class mb0 extends yv1 {
    @Override // defpackage.yv1
    public final fu1 a() {
        d00 d00Var = j00.a;
        return new lb0(this);
    }

    @Override // defpackage.yv1
    public final void d(List list, vu1 vu1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((qt1) it.next());
        }
    }

    @Override // defpackage.yv1
    public final void e(qt1 qt1Var, boolean z) {
        b().e(qt1Var, z);
        int iT0 = qx.t0((Iterable) b().f.f.getValue(), qt1Var);
        int i = 0;
        for (Object obj : (Iterable) b().f.f.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                vr.b0();
                throw null;
            }
            qt1 qt1Var2 = (qt1) obj;
            if (i > iT0) {
                b().c(qt1Var2);
            }
            i = i2;
        }
    }
}
