package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tz1 extends o02 {
    public static final tz1 c = new tz1(0, 1, 1);

    @Override // defpackage.o02
    public final void a(lx lxVar, wi wiVar, m53 m53Var, zk2 zk2Var, p02 p02Var) {
        qs1 qs1Var;
        xj2 xj2Var = (xj2) lxVar.e(0);
        is1 is1Var = zk2Var.i;
        if (is1Var == null || ((h52) is1Var.g(xj2Var)) == null) {
            return;
        }
        ArrayList arrayList = zk2Var.j;
        if (arrayList != null && (qs1Var = (qs1) arrayList.remove(arrayList.size() - 1)) != null) {
            zk2Var.e = qs1Var;
        }
        is1Var.k(xj2Var);
    }
}
