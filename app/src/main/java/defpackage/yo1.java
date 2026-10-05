package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yo1 implements qr2 {
    public final f0 a;
    public final fm3 b;
    public final tk0 c;

    public yo1(fm3 fm3Var, tk0 tk0Var, f0 f0Var) {
        this.b = fm3Var;
        tk0Var.getClass();
        this.c = tk0Var;
        this.a = f0Var;
    }

    @Override // defpackage.qr2
    public final int a(wv0 wv0Var) {
        this.b.getClass();
        return wv0Var.unknownFields.hashCode();
    }

    @Override // defpackage.qr2
    public final void b(Object obj, Object obj2) {
        rr2.k(this.b, obj, obj2);
    }

    @Override // defpackage.qr2
    public final void c(Object obj) {
        this.b.getClass();
        em3 em3Var = ((wv0) obj).unknownFields;
        if (em3Var.e) {
            em3Var.e = false;
        }
        this.c.getClass();
        nc2.u(obj);
        throw null;
    }

    @Override // defpackage.qr2
    public final int d(wv0 wv0Var) {
        this.b.getClass();
        em3 em3Var = wv0Var.unknownFields;
        int i = em3Var.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < em3Var.a; i2++) {
            int i3 = em3Var.b[i2] >>> 3;
            iF += nx.f(3, (jq) em3Var.c[i2]) + nx.i(i3) + nx.h(2) + (nx.h(1) * 2);
        }
        em3Var.d = iF;
        return iF;
    }

    @Override // defpackage.qr2
    public final boolean e(Object obj) {
        this.c.getClass();
        nc2.u(obj);
        throw null;
    }

    @Override // defpackage.qr2
    public final void f(Object obj, yl1 yl1Var) {
        this.c.getClass();
        nc2.u(obj);
        throw null;
    }

    @Override // defpackage.qr2
    public final boolean g(wv0 wv0Var, wv0 wv0Var2) {
        this.b.getClass();
        return wv0Var.unknownFields.equals(wv0Var2.unknownFields);
    }

    @Override // defpackage.qr2
    public final void h(Object obj, lx lxVar, sk0 sk0Var) {
        this.b.getClass();
        fm3.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.qr2
    public final wv0 i() {
        f0 f0Var = this.a;
        return f0Var instanceof wv0 ? ((wv0) f0Var).i() : ((uv0) ((wv0) f0Var).c(5)).b();
    }
}
