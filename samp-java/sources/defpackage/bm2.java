package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bm2 {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;

    public bm2(String str, String str2, long j, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2)) {
            return false;
        }
        bm2 bm2Var = (bm2) obj;
        return this.a.equals(bm2Var.a) && this.b.equals(bm2Var.b) && this.c == bm2Var.c && this.d.equals(bm2Var.d) && this.e.equals(bm2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + by1.a(nc2.c(this.c, by1.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("ResourceSource(name=", this.a, ", url=", this.b, ", sizeBytes=");
        sbN.append(this.c);
        sbN.append(", checksum=");
        sbN.append(this.d);
        sbN.append(", description=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
