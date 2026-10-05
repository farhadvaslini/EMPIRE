package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qn3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final boolean f;

    public qn3(String str, String str2, String str3, String str4, long j, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn3)) {
            return false;
        }
        qn3 qn3Var = (qn3) obj;
        return s51.n(this.a, qn3Var.a) && s51.n(this.b, qn3Var.b) && s51.n(this.c, qn3Var.c) && s51.n(this.d, qn3Var.d) && this.e == qn3Var.e && this.f == qn3Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + nc2.c(this.e, by1.a(by1.a(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("UpdateInfo(versionName=", this.a, ", apkFileName=", this.b, ", downloadUrl=");
        nc2.w(sbN, this.c, ", sha256=", this.d, ", sizeBytes=");
        sbN.append(this.e);
        sbN.append(", isPreRelease=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
