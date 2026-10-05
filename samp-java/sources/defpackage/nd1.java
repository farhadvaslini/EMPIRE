package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nd1 {
    public final ns0 a;
    public yj0 c;
    public int f;
    public final pi b = new pi(15);
    public int d = -1;
    public int e = -1;

    public nd1(ns0 ns0Var) {
        this.a = ns0Var;
    }

    public final md1 a(int i, long j, boolean z, ns0 ns0Var) {
        yj0 yj0Var = this.c;
        if (yj0Var == null) {
            return hg0.a;
        }
        sc2 sc2Var = (sc2) yj0Var.d;
        boolean z2 = sc2Var instanceof ab;
        rc2 rc2Var = new rc2(yj0Var, i, this.b, ns0Var);
        rc2Var.d = new m30(j);
        if (!z2) {
            sc2Var.a(rc2Var);
        } else if (z) {
            ab abVar = (ab) sc2Var;
            abVar.g.add(new ed2(1, rc2Var));
            if (!abVar.h) {
                abVar.h = true;
                abVar.f.post(abVar);
            }
        } else {
            ab abVar2 = (ab) sc2Var;
            abVar2.g.add(new ed2(0, rc2Var));
            if (!abVar2.h) {
                abVar2.h = true;
                abVar2.f.post(abVar2);
            }
        }
        s51.J(i, "compose:lazy:schedule_prefetch:index");
        return rc2Var;
    }
}
