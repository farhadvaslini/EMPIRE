package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class g80 implements je {
    public final pl a;
    public final bl3 b;
    public final Object c;
    public final ue d;
    public final ue e;
    public final ue f;
    public final Object g;
    public final long h;

    public g80(h80 h80Var, bl3 bl3Var, Object obj, ue ueVar) {
        pl plVar = new pl(12, h80Var.a);
        this.a = plVar;
        this.b = bl3Var;
        this.c = obj;
        ue ueVar2 = (ue) bl3Var.a.h(obj);
        this.d = ueVar2;
        this.e = gv3.y(ueVar);
        this.g = bl3Var.b.h(plVar.w(ueVar2, ueVar));
        if (((ue) plVar.i) == null) {
            plVar.i = ueVar2.c();
        }
        ue ueVar3 = (ue) plVar.i;
        if (ueVar3 == null) {
            s51.F("velocityVector");
            throw null;
        }
        int iB = ueVar3.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            k71 k71Var = (k71) plVar.g;
            ueVar2.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((wj) k71Var.g).b(ueVar.a(i)) / (((double) tm0.a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.h = jMax;
        ue ueVarY = gv3.y(this.a.x(jMax, this.d, ueVar));
        this.f = ueVarY;
        int iB2 = ueVarY.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            ue ueVar4 = this.f;
            float fA = ueVar4.a(i2);
            this.a.getClass();
            this.a.getClass();
            ueVar4.e(y02.g(fA, -0.0f, 0.0f), i2);
        }
    }

    @Override // defpackage.je
    public final boolean a() {
        return false;
    }

    @Override // defpackage.je
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        ns0 ns0Var = this.b.b;
        pl plVar = this.a;
        ue ueVar = (ue) plVar.h;
        ue ueVar2 = this.d;
        if (ueVar == null) {
            plVar.h = ueVar2.c();
        }
        ue ueVar3 = (ue) plVar.h;
        if (ueVar3 == null) {
            s51.F("valueVector");
            throw null;
        }
        int iB = ueVar3.b();
        int i = 0;
        while (true) {
            ue ueVar4 = (ue) plVar.h;
            if (i >= iB) {
                if (ueVar4 != null) {
                    return ns0Var.h(ueVar4);
                }
                s51.F("valueVector");
                throw null;
            }
            if (ueVar4 == null) {
                s51.F("valueVector");
                throw null;
            }
            k71 k71Var = (k71) plVar.g;
            float fA = ueVar2.a(i);
            long j2 = j / 1000000;
            sm0 sm0VarA = ((wj) k71Var.g).a(this.e.a(i));
            long j3 = sm0VarA.c;
            ueVar4.e((Math.signum(sm0VarA.a) * sm0VarA.b * b9.a(j3 > 0 ? j2 / j3 : 1.0f).a) + fA, i);
            i++;
        }
    }

    @Override // defpackage.je
    public final long c() {
        return this.h;
    }

    @Override // defpackage.je
    public final bl3 d() {
        return this.b;
    }

    @Override // defpackage.je
    public final Object e() {
        return this.g;
    }

    @Override // defpackage.je
    public final ue f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.x(j, this.d, this.e);
    }
}
