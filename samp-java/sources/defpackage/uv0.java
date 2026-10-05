package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class uv0 implements Cloneable {
    public final wv0 f;
    public wv0 g;

    public uv0(wv0 wv0Var) {
        this.f = wv0Var;
        if (wv0Var.g()) {
            c.p("Default instance must be immutable.");
            throw null;
        }
        this.g = wv0Var.i();
    }

    public final wv0 a() {
        wv0 wv0VarB = b();
        wv0VarB.getClass();
        if (wv0.f(wv0VarB, true)) {
            return wv0VarB;
        }
        throw new zl3();
    }

    public final wv0 b() {
        boolean zG = this.g.g();
        wv0 wv0Var = this.g;
        if (!zG) {
            return wv0Var;
        }
        wv0Var.getClass();
        be2 be2Var = be2.c;
        be2Var.getClass();
        be2Var.a(wv0Var.getClass()).c(wv0Var);
        wv0Var.h();
        return this.g;
    }

    public final void c() {
        if (this.g.g()) {
            return;
        }
        wv0 wv0VarI = this.f.i();
        wv0 wv0Var = this.g;
        be2 be2Var = be2.c;
        be2Var.getClass();
        be2Var.a(wv0VarI.getClass()).b(wv0VarI, wv0Var);
        this.g = wv0VarI;
    }

    public final Object clone() {
        uv0 uv0Var = (uv0) this.f.c(5);
        uv0Var.g = b();
        return uv0Var;
    }
}
