package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class o92 {
    public final String a;
    public final String b;
    public final String c;

    public o92(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o92)) {
            return false;
        }
        o92 o92Var = (o92) obj;
        return this.a.equals(o92Var.a) && this.b.equals(o92Var.b) && this.c.equals(o92Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + by1.a(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nc2.j(nc2.n("PluginPermissionMetadata(labelKey=", this.a, ", risk=", this.b, ", since="), this.c, ", revocable=true)");
    }
}
