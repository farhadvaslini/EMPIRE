package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class aa2 {
    public final String a;
    public final String b;
    public final String c;

    public aa2(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa2)) {
            return false;
        }
        aa2 aa2Var = (aa2) obj;
        return s51.n(this.a, aa2Var.a) && s51.n(this.b, aa2Var.b) && s51.n(this.c, aa2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + by1.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return nc2.j(nc2.n("PluginRollbackCandidate(pluginId=", this.a, ", currentVersion=", this.b, ", targetVersion="), this.c, ")");
    }
}
