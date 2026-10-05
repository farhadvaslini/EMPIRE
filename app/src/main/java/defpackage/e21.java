package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class e21 extends mb3 implements rs0 {
    public /* synthetic */ float j;

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((e21) m((p40) obj2, Float.valueOf(((Number) obj).floatValue()))).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        e21 e21Var = new e21(2, p40Var);
        e21Var.j = ((Number) obj).floatValue();
        return e21Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        y02.Q(obj);
        return Boolean.valueOf(this.j > 0.0f);
    }
}
