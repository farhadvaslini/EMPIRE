package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class r60 extends mb3 implements ns0 {
    public final /* synthetic */ z60 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ x50 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(z60 z60Var, float f, x50 x50Var, p40 p40Var) {
        super(1, p40Var);
        this.j = z60Var;
        this.k = f;
        this.l = x50Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        float f = this.k;
        x50 x50Var = this.l;
        r60 r60Var = new r60(this.j, f, x50Var, (p40) obj);
        dm3 dm3Var = dm3.a;
        r60Var.o(dm3Var);
        return dm3Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        y02.Q(obj);
        z60 z60Var = this.j;
        z60Var.f();
        p60 p60Var = new p60(z60Var, ((Number) y02.k(new Float(this.k), z60Var.b)).floatValue(), null, 0);
        x50 x50Var = this.l;
        cl3.t(x50Var, null, p60Var, 3);
        if (((Number) z60Var.i.d()).floatValue() != 0.0f) {
            cl3.t(x50Var, null, new q60(z60Var, null, 0), 3);
        }
        z60Var.g();
        return dm3.a;
    }
}
