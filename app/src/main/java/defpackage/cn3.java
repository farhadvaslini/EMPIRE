package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cn3 {
    public final String a;
    public final String b;
    public final long c;

    public cn3(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn3)) {
            return false;
        }
        cn3 cn3Var = (cn3) obj;
        return s51.n(this.a, cn3Var.a) && s51.n(this.b, cn3Var.b) && this.c == cn3Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + by1.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("ReleaseAsset(name=", this.a, ", browserDownloadUrl=", this.b, ", sizeBytes=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
