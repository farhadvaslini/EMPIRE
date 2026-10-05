package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jc1 extends gq1 {
    public final float a;
    public final boolean b;

    public jc1(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        jc1 jc1Var = obj instanceof jc1 ? (jc1) obj : null;
        return jc1Var != null && this.a == jc1Var.a && this.b == jc1Var.b;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        kc1 kc1Var = new kc1();
        kc1Var.t = this.a;
        kc1Var.u = this.b;
        return kc1Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        kc1 kc1Var = (kc1) aq1Var;
        kc1Var.t = this.a;
        kc1Var.u = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
