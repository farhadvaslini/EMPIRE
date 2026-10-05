package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c02 extends o02 {
    public static final c02 c = new c02(0, 1, 1);

    @Override // defpackage.o02
    public final void a(lx lxVar, wi wiVar, m53 m53Var, zk2 zk2Var, p02 p02Var) {
        xj2 xj2Var = (xj2) lxVar.e(0);
        Set set = zk2Var.a;
        if (set == null) {
            return;
        }
        h52 h52Var = new h52(set);
        is1 is1Var = zk2Var.i;
        if (is1Var == null) {
            long[] jArr = nr2.a;
            is1Var = new is1();
            zk2Var.i = is1Var;
        }
        is1Var.m(xj2Var, h52Var);
        zk2Var.e.b(new rv0(h52Var, -1));
    }
}
