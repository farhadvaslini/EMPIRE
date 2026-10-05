package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class z83 implements oe {
    public final oe a;
    public final long b;

    public z83(mm0 mm0Var, long j) {
        this.a = mm0Var;
        this.b = j;
    }

    @Override // defpackage.oe
    public final zo3 a(bl3 bl3Var) {
        return new a93(this.a.a(bl3Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z83)) {
            return false;
        }
        z83 z83Var = (z83) obj;
        return z83Var.b == this.b && s51.n(z83Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
