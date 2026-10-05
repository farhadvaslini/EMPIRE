package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dc1 extends qb1 {
    public final /* synthetic */ hc1 b;
    public final /* synthetic */ rs0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc1(hc1 hc1Var, rs0 rs0Var, String str) {
        super(str);
        this.b = hc1Var;
        this.c = rs0Var;
    }

    @Override // defpackage.cn1
    public final dn1 c(en1 en1Var, List list, long j) {
        hc1 hc1Var = this.b;
        bc1 bc1Var = hc1Var.m;
        bc1Var.f = en1Var.getLayoutDirection();
        bc1Var.g = en1Var.h();
        bc1Var.h = en1Var.G();
        boolean zM = en1Var.M();
        rs0 rs0Var = this.c;
        if (zM || hc1Var.f.n == null) {
            hc1Var.i = 0;
            dn1 dn1Var = (dn1) rs0Var.f(bc1Var, new m30(j));
            return new cc1(dn1Var, hc1Var, hc1Var.i, dn1Var, 1);
        }
        hc1Var.j = 0;
        dn1 dn1Var2 = (dn1) rs0Var.f(hc1Var.n, new m30(j));
        return new cc1(dn1Var2, hc1Var, hc1Var.j, dn1Var2, 0);
    }
}
