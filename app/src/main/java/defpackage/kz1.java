package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 extends o02 {
    public static final kz1 c = new kz1(0, 2, 1);

    @Override // defpackage.o02
    public final void a(lx lxVar, wi wiVar, m53 m53Var, zk2 zk2Var, p02 p02Var) throws IllegalAccessException, InvocationTargetException {
        n41 n41Var = (n41) lxVar.e(1);
        int i = n41Var != null ? n41Var.a : 0;
        gs gsVar = (gs) lxVar.e(0);
        if (i > 0) {
            wiVar = new j01(wiVar, i);
        }
        gsVar.P(wiVar, m53Var, zk2Var, p02Var != null ? new a31(p02Var, false, m53Var, 23) : null);
    }
}
