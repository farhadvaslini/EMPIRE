package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kp2 extends q40 implements gn0 {
    public final gn0 i;
    public final o50 j;
    public final int k;
    public o50 l;
    public p40 m;

    public kp2(gn0 gn0Var, o50 o50Var) {
        super(iz.h, li0.f);
        this.i = gn0Var;
        this.j = o50Var;
        this.k = ((Number) o50Var.p(new h12(5), 0)).intValue();
    }

    @Override // defpackage.ml, defpackage.z50
    public final z50 d() {
        p40 p40Var = this.m;
        if (p40Var instanceof z50) {
            return (z50) p40Var;
        }
        return null;
    }

    @Override // defpackage.q40, defpackage.p40
    public final o50 i() {
        o50 o50Var = this.l;
        return o50Var == null ? li0.f : o50Var;
    }

    @Override // defpackage.gn0
    public final Object k(Object obj, p40 p40Var) {
        try {
            Object objQ = q(p40Var, obj);
            return objQ == y50.f ? objQ : dm3.a;
        } catch (Throwable th) {
            this.l = new id0(p40Var.i(), th);
            throw th;
        }
    }

    @Override // defpackage.ml
    public final StackTraceElement n() {
        return null;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        Throwable thA = rn2.a(obj);
        if (thA != null) {
            this.l = new id0(i(), thA);
        }
        p40 p40Var = this.m;
        if (p40Var != null) {
            p40Var.t(obj);
        }
        return y50.f;
    }

    public final Object q(p40 p40Var, Object obj) {
        o50 o50VarI = p40Var.i();
        lq.r(o50VarI);
        o50 o50Var = this.l;
        if (o50Var != o50VarI) {
            if (o50Var instanceof id0) {
                throw new IllegalStateException(z93.U("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((id0) o50Var).g + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) o50VarI.p(new u(29, this), 0)).intValue() != this.k) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.j + ",\n\t\tbut emission happened in " + o50VarI + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.l = o50VarI;
        }
        this.m = p40Var;
        ss0 ss0Var = mp2.a;
        gn0 gn0Var = this.i;
        gn0Var.getClass();
        Object objE = ss0Var.e(gn0Var, obj, this);
        if (!s51.n(objE, y50.f)) {
            this.m = null;
        }
        return objE;
    }
}
