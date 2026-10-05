package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class uh1 extends mb3 implements rs0 {
    public /* synthetic */ boolean j;
    public final /* synthetic */ z60 k;
    public final /* synthetic */ z32 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh1(z60 z60Var, z32 z32Var, p40 p40Var) {
        super(2, p40Var);
        this.k = z60Var;
        this.l = z32Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        uh1 uh1Var = (uh1) m((p40) obj2, bool);
        dm3 dm3Var = dm3.a;
        uh1Var.o(dm3Var);
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        uh1 uh1Var = new uh1(this.k, this.l, p40Var);
        uh1Var.j = ((Boolean) obj).booleanValue();
        return uh1Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        boolean z = this.j;
        y02.Q(obj);
        float f = z ? 1.0f : 0.0f;
        z32 z32Var = this.l;
        if (f != z32Var.g()) {
            z32Var.h(f);
            this.k.a(f);
        }
        return dm3.a;
    }
}
