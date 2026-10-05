package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ed {
    public final bl3 a;
    public final Object b;
    public final pe c;
    public final d42 d;
    public final d42 e;
    public final at1 f;
    public final s83 g;
    public final ue h;
    public final ue i;
    public final ue j;
    public final ue k;

    public ed(Object obj, bl3 bl3Var, Object obj2) {
        this.a = bl3Var;
        this.b = obj2;
        pe peVar = new pe(bl3Var, obj, null, 60);
        this.c = peVar;
        this.d = b32.w(Boolean.FALSE);
        this.e = b32.w(obj);
        this.f = new at1();
        this.g = new s83(obj2);
        ue ueVar = peVar.h;
        boolean z = ueVar instanceof qe;
        ue ueVar2 = z ? gv3.e : ueVar instanceof re ? gv3.f : ueVar instanceof se ? gv3.g : gv3.h;
        this.h = ueVar2;
        ue ueVar3 = z ? gv3.a : ueVar instanceof re ? gv3.b : ueVar instanceof se ? gv3.c : gv3.d;
        this.i = ueVar3;
        this.j = ueVar2;
        this.k = ueVar3;
    }

    public static final Object a(ed edVar, Object obj) {
        bl3 bl3Var = edVar.a;
        ue ueVar = edVar.k;
        ue ueVar2 = edVar.j;
        if (!s51.n(ueVar2, edVar.h) || !s51.n(ueVar, edVar.i)) {
            ue ueVar3 = (ue) bl3Var.a.h(obj);
            int iB = ueVar3.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (ueVar3.a(i) < ueVar2.a(i) || ueVar3.a(i) > ueVar.a(i)) {
                    ueVar3.e(y02.g(ueVar3.a(i), ueVar2.a(i), ueVar.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return bl3Var.b.h(ueVar3);
            }
        }
        return obj;
    }

    public static final void b(ed edVar) {
        pe peVar = edVar.c;
        peVar.h.d();
        peVar.i = Long.MIN_VALUE;
        edVar.d.setValue(Boolean.FALSE);
    }

    public static Object c(ed edVar, Object obj, oe oeVar, ns0 ns0Var, p40 p40Var, int i) {
        if ((i & 2) != 0) {
            oeVar = edVar.g;
        }
        oe oeVar2 = oeVar;
        Object objH = edVar.a.b.h(edVar.c.h);
        if ((i & 8) != 0) {
            ns0Var = null;
        }
        ns0 ns0Var2 = ns0Var;
        Object objD = edVar.d();
        bl3 bl3Var = edVar.a;
        return at1.a(edVar.f, new cd(edVar, objH, new dd3(oeVar2, bl3Var, objD, obj, (ue) bl3Var.a.h(objH)), edVar.c.i, ns0Var2, null), p40Var);
    }

    public final Object d() {
        return this.c.g.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object f(p40 p40Var, Object obj) {
        Object objA = at1.a(this.f, new dd(this, obj, null), p40Var);
        return objA == y50.f ? objA : dm3.a;
    }

    public /* synthetic */ ed(Object obj, bl3 bl3Var, Object obj2, int i) {
        this(obj, bl3Var, (i & 4) != 0 ? null : obj2);
    }
}
