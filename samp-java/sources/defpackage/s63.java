package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class s63 implements jg0 {
    public final int a;

    public s63(int i) {
        this.a = i;
    }

    @Override // defpackage.oe
    public final bp3 a(bl3 bl3Var) {
        u13 u13Var = new u13();
        u13Var.f = this.a;
        return u13Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s63) && ((s63) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
