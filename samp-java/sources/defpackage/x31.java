package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class x31 {
    public final String a;
    public final lw b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;

    public x31(String str, lw lwVar, long j, long j2, String str2, String str3) {
        this.a = str;
        this.b = lwVar;
        this.c = j;
        this.d = j2;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x31)) {
            return false;
        }
        x31 x31Var = (x31) obj;
        return this.a.equals(x31Var.a) && this.b == x31Var.b && this.c == x31Var.c && this.d == x31Var.d && s51.n(this.e, x31Var.e) && s51.n(this.f, x31Var.f);
    }

    public final int hashCode() {
        int iC = nc2.c(this.d, nc2.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "InstalledCleoScript(fileName=" + this.a + ", kind=" + this.b + ", sizeBytes=" + this.c + ", modifiedAtMillis=" + this.d + ", packageId=" + this.e + ", packageVersion=" + this.f + ")";
    }
}
