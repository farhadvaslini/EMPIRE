package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ac1 implements dn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ ns0 d;
    public final /* synthetic */ bc1 e;
    public final /* synthetic */ hc1 f;
    public final /* synthetic */ ns0 g;

    public ac1(int i, int i2, Map map, ns0 ns0Var, bc1 bc1Var, hc1 hc1Var, ns0 ns0Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = ns0Var;
        this.e = bc1Var;
        this.f = hc1Var;
        this.g = ns0Var2;
    }

    @Override // defpackage.dn1
    public final void a() {
        r21 r21Var;
        tb1 tb1Var = this.f.f;
        boolean zM = this.e.M();
        ns0 ns0Var = this.g;
        if (!zM || (r21Var = tb1Var.L.c.j0) == null) {
            ns0Var.h(tb1Var.L.c.u);
        } else {
            ns0Var.h(r21Var.u);
        }
    }

    @Override // defpackage.dn1
    public final Map c() {
        return this.c;
    }

    @Override // defpackage.dn1
    public final int d() {
        return this.b;
    }

    @Override // defpackage.dn1
    public final ns0 e() {
        return this.d;
    }

    @Override // defpackage.dn1
    public final int g() {
        return this.a;
    }
}
