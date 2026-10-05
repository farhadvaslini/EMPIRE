package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zo0 {
    public final ep0 a;
    public final h7 b;
    public final js1 c;
    public final js1 d;
    public boolean e;

    public zo0(ep0 ep0Var, h7 h7Var) {
        this.a = ep0Var;
        this.b = h7Var;
        js1 js1Var = or2.a;
        this.c = new js1();
        this.d = new js1();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        c7 c7Var = new c7(0, this, zo0.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 8);
        as1 as1Var = this.b.v0;
        if (as1Var.h(c7Var) < 0) {
            as1Var.b(c7Var);
        }
        this.e = true;
    }
}
