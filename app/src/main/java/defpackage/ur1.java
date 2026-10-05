package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ur1 extends gm1 implements v61 {
    public final t52 i;
    public Object j;

    public ur1(t52 t52Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.i = t52Var;
        this.j = obj2;
    }

    @Override // defpackage.gm1, java.util.Map.Entry
    public final Object getValue() {
        return this.j;
    }

    @Override // defpackage.gm1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.j;
        this.j = obj;
        r52 r52Var = (r52) this.i.g;
        q52 q52Var = r52Var.i;
        Object obj3 = this.g;
        if (!q52Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = r52Var.h;
        if (!z) {
            q52Var.put(obj3, obj);
        } else {
            if (!z) {
                c.n();
                return null;
            }
            uk3 uk3Var = r52Var.f[r52Var.g];
            Object obj4 = uk3Var.f[uk3Var.h];
            q52Var.put(obj3, obj);
            r52Var.c(obj4 != null ? obj4.hashCode() : 0, q52Var.h, obj4, 0);
        }
        r52Var.l = q52Var.j;
        return obj2;
    }
}
