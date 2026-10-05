package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class eo0 extends mb3 implements rs0 {
    public /* synthetic */ int j;

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((eo0) m((p40) obj2, Integer.valueOf(((Number) obj).intValue()))).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        eo0 eo0Var = new eo0(2, p40Var);
        eo0Var.j = ((Number) obj).intValue();
        return eo0Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        y02.Q(obj);
        return Boolean.valueOf(i > 0);
    }
}
