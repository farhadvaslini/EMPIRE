package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dd3 implements je {
    public final zo3 a;
    public final bl3 b;
    public Object c;
    public Object d;
    public ue e;
    public ue f;
    public final ue g;
    public long h;
    public ue i;

    public dd3(oe oeVar, bl3 bl3Var, Object obj, Object obj2, ue ueVar) {
        this.a = oeVar.a(bl3Var);
        this.b = bl3Var;
        this.c = obj2;
        this.d = obj;
        this.e = (ue) bl3Var.a.h(obj);
        ns0 ns0Var = bl3Var.a;
        this.f = (ue) ns0Var.h(obj2);
        this.g = ueVar != null ? gv3.y(ueVar) : ((ue) ns0Var.h(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.je
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.je
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        ue ueVarP = this.a.p(j, this.e, this.f, this.g);
        int iB = ueVarP.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(ueVarP.a(i))) {
                ac2.b("AnimationVector cannot contain a NaN. " + ueVarP + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.h(ueVarP);
    }

    @Override // defpackage.je
    public final long c() {
        if (this.h < 0) {
            this.h = this.a.b(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.je
    public final bl3 d() {
        return this.b;
    }

    @Override // defpackage.je
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.je
    public final ue f(long j) {
        if (!g(j)) {
            return this.a.l(j, this.e, this.f, this.g);
        }
        ue ueVar = this.i;
        if (ueVar != null) {
            return ueVar;
        }
        ue ueVarQ = this.a.q(this.e, this.f, this.g);
        this.i = ueVarQ;
        return ueVarQ;
    }

    public final void h(Object obj) {
        if (s51.n(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (ue) this.b.a.h(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (s51.n(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (ue) this.b.a.h(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
