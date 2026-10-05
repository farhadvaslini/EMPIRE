package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c83 implements g83 {
    public final String a;
    public final String b;

    public c83(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c83)) {
            return false;
        }
        c83 c83Var = (c83) obj;
        return this.a.equals(c83Var.a) && s51.n(this.b, c83Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return by1.i("Error(message=", this.a, ", sourceUrl=", this.b, ")");
    }
}
