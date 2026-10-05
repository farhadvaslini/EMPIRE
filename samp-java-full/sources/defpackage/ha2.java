package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ha2 {
    public final String a;
    public final String b;
    public final ga2 c;
    public final String d;
    public final long e;
    public final int f;

    public ha2(String str, String str2, ga2 ga2Var, String str3, long j, int i) {
        this.a = str;
        this.b = str2;
        this.c = ga2Var;
        this.d = str3;
        this.e = j;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha2)) {
            return false;
        }
        ha2 ha2Var = (ha2) obj;
        return this.a.equals(ha2Var.a) && this.b.equals(ha2Var.b) && this.c == ha2Var.c && s51.n(this.d, ha2Var.d) && this.e == ha2Var.e && this.f == ha2Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + by1.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return Integer.hashCode(this.f) + nc2.c(this.e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("PluginRuntimeStatus(pluginId=", this.a, ", version=", this.b, ", state=");
        sbN.append(this.c);
        sbN.append(", lastError=");
        sbN.append(this.d);
        sbN.append(", memoryBytes=");
        sbN.append(this.e);
        sbN.append(", recentErrors=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
