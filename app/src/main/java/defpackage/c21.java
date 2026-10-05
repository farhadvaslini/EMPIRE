package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c21 implements oe {
    public final jg0 a;
    public final gl2 b;

    public c21(jg0 jg0Var, gl2 gl2Var) {
        this.a = jg0Var;
        this.b = gl2Var;
        if (jg0Var instanceof zk3) {
            zk3 zk3Var = (zk3) jg0Var;
            if (zk3Var.a != 0 || zk3Var.b != 0) {
                return;
            }
        } else if (jg0Var instanceof s63) {
            if (((s63) jg0Var).a != 0) {
                return;
            }
        } else if (!(jg0Var instanceof s71) || ((s71) jg0Var).a.a != 0) {
            return;
        }
        c.p("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.oe
    public final zo3 a(bl3 bl3Var) {
        return new dp3(this.a.a(bl3Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c21)) {
            return false;
        }
        c21 c21Var = (c21) obj;
        return c21Var.a.equals(this.a) && c21Var.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
