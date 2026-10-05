package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zk3 implements jg0 {
    public final int a;
    public final int b;
    public final ng0 c;

    public zk3(int i, int i2, ng0 ng0Var) {
        this.a = i;
        this.b = i2;
        this.c = ng0Var;
    }

    @Override // defpackage.oe
    public final zo3 a(bl3 bl3Var) {
        return new j01(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zk3) {
            zk3 zk3Var = (zk3) obj;
            if (zk3Var.a == this.a && zk3Var.b == this.b && s51.n(zk3Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.jg0, defpackage.oe
    public final bp3 a(bl3 bl3Var) {
        return new j01(this.a, this.b, this.c);
    }
}
