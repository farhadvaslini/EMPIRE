package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class s83 implements mm0 {
    public final float a;
    public final float b;
    public final Object c;

    public s83(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.oe
    public final zo3 a(bl3 bl3Var) {
        Object obj = this.c;
        return new k71(this.a, this.b, obj == null ? null : (ue) bl3Var.a.h(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s83) {
            s83 s83Var = (s83) obj;
            if (s83Var.a == this.a && s83Var.b == this.b && s51.n(s83Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + nc2.a((obj != null ? obj.hashCode() : 0) * 31, this.a, 31);
    }

    public /* synthetic */ s83(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
