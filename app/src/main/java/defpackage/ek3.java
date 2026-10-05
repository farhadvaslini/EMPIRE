package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ek3 implements e93 {
    public final bl3 f;
    public final d42 g;
    public final d42 h;
    public final d42 i;
    public bt2 j;
    public dd3 k;
    public final d42 l;
    public final z32 m;
    public boolean n;
    public final d42 o;
    public ue p;
    public final b42 q;
    public boolean r;
    public final s83 s;
    public final /* synthetic */ gk3 t;

    public ek3(gk3 gk3Var, Object obj, ue ueVar, bl3 bl3Var) {
        this.t = gk3Var;
        this.f = bl3Var;
        d42 d42VarW = b32.w(obj);
        this.g = d42VarW;
        Object objH = null;
        this.h = b32.w(n92.F(0.0f, 0.0f, null, 7));
        this.i = b32.w(new dd3(b(), bl3Var, obj, d42VarW.getValue(), ueVar));
        this.l = b32.w(Boolean.TRUE);
        this.m = new z32(-1.0f);
        this.o = b32.w(obj);
        this.p = ueVar;
        this.q = new b42(a().c());
        Float f = (Float) mr3.b.get(bl3Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            ue ueVar2 = (ue) bl3Var.a.h(obj);
            int iB = ueVar2.b();
            for (int i = 0; i < iB; i++) {
                ueVar2.e(fFloatValue, i);
            }
            objH = this.f.b.h(ueVar2);
        }
        this.s = n92.F(0.0f, 0.0f, objH, 3);
    }

    public final dd3 a() {
        return (dd3) this.i.getValue();
    }

    public final mm0 b() {
        return (mm0) this.h.getValue();
    }

    public final void c(long j) {
        if (this.m.g() == -1.0f) {
            this.r = true;
            if (s51.n(a().c, a().d)) {
                e(a().c);
            } else {
                e(a().b(j));
                this.p = a().f(j);
            }
        }
    }

    public final void e(Object obj) {
        this.o.setValue(obj);
    }

    public final void f(Object obj, boolean z) {
        dd3 dd3Var = this.k;
        Object obj2 = dd3Var != null ? dd3Var.c : null;
        d42 d42Var = this.g;
        boolean zN = s51.n(obj2, d42Var.getValue());
        b42 b42Var = this.q;
        d42 d42Var2 = this.i;
        if (zN) {
            d42Var2.setValue(new dd3(this.s, this.f, obj, obj, this.p.c()));
            this.n = true;
            b42Var.h(a().c());
            return;
        }
        mm0 mm0VarB = (!z || this.r || (b() instanceof s83)) ? b() : this.s;
        gk3 gk3Var = this.t;
        d42Var2.setValue(new dd3(gk3Var.e() <= 0 ? mm0VarB : new z83(mm0VarB, gk3Var.e()), this.f, obj, d42Var.getValue(), this.p));
        b42Var.h(a().c());
        this.n = false;
        gk3Var.o(true);
        if (gk3Var.g()) {
            l73 l73Var = gk3Var.j;
            int size = l73Var.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                ek3 ek3Var = (ek3) l73Var.get(i);
                jMax = Math.max(jMax, ek3Var.q.g());
                ek3Var.c(0L);
            }
            gk3Var.o(false);
        }
    }

    public final void g(Object obj, Object obj2, mm0 mm0Var) {
        this.g.setValue(obj2);
        this.h.setValue(mm0Var);
        if (s51.n(a().d, obj) && s51.n(a().c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // defpackage.e93
    public final Object getValue() {
        return this.o.getValue();
    }

    public final void h(Object obj, mm0 mm0Var, Object obj2, ue ueVar) {
        if (this.n) {
            dd3 dd3Var = this.k;
            if (s51.n(obj, dd3Var != null ? dd3Var.c : null)) {
                return;
            }
        }
        d42 d42Var = this.g;
        boolean zN = s51.n(d42Var.getValue(), obj);
        z32 z32Var = this.m;
        if (zN && z32Var.g() == -1.0f && (obj2 == null || obj2.equals(a().d))) {
            return;
        }
        d42Var.setValue(obj);
        this.h.setValue(mm0Var);
        Object value = obj2 == null ? z32Var.g() == -3.0f ? obj : this.o.getValue() : obj2;
        if (obj2 != null) {
            e(value);
            if (ueVar != null) {
                this.p = ueVar;
            }
        }
        d42 d42Var2 = this.l;
        f(value, !((Boolean) d42Var2.getValue()).booleanValue());
        d42Var2.setValue(Boolean.valueOf(z32Var.g() == -3.0f));
        if (z32Var.g() >= 0.0f) {
            e(a().b((long) (z32Var.g() * a().c())));
        } else if (z32Var.g() == -3.0f) {
            e(obj);
        }
        this.n = false;
        z32Var.h(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.o.getValue() + ", target: " + this.g.getValue() + ", spec: " + b();
    }
}
