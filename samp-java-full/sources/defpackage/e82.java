package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class e82 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public e82(String str, boolean z, boolean z2, boolean z3, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e82)) {
            return false;
        }
        e82 e82Var = (e82) obj;
        return this.a.equals(e82Var.a) && this.b == e82Var.b && this.c == e82Var.c && this.d == e82Var.d && this.e.equals(e82Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + by1.b(by1.b(by1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PluginControlMetadata(description=");
        sb.append(this.a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", visible=");
        by1.k(sb, this.c, ", readOnly=", this.d, ", error=");
        return nc2.j(sb, this.e, ")");
    }
}
