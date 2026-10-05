package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sp1 extends mb3 implements ss0 {
    public /* synthetic */ float j;
    public final /* synthetic */ ns0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp1(ns0 ns0Var, p40 p40Var) {
        super(3, p40Var);
        this.k = ns0Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        sp1 sp1Var = new sp1(this.k, (p40) obj3);
        sp1Var.j = fFloatValue;
        dm3 dm3Var = dm3.a;
        sp1Var.o(dm3Var);
        return dm3Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        y02.Q(obj);
        this.k.h(new Float(this.j));
        return dm3.a;
    }
}
