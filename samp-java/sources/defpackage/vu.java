package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vu {
    public final String a;
    public final String b;
    public final String c;
    public final lw d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final String i;

    public vu(String str, String str2, String str3, lw lwVar, String str4, String str5, String str6, long j, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        str7.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = lwVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = j;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu)) {
            return false;
        }
        vu vuVar = (vu) obj;
        return s51.n(this.a, vuVar.a) && s51.n(this.b, vuVar.b) && s51.n(this.c, vuVar.c) && this.d == vuVar.d && s51.n(this.e, vuVar.e) && s51.n(this.f, vuVar.f) && s51.n(this.g, vuVar.g) && this.h == vuVar.h && s51.n(this.i, vuVar.i);
    }

    public final int hashCode() {
        int iA = by1.a((this.d.hashCode() + by1.a(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        String str = this.f;
        return this.i.hashCode() + nc2.c(this.h, by1.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("CleoCatalogEntry(id=", this.a, ", name=", this.b, ", version=");
        sbN.append(this.c);
        sbN.append(", kind=");
        sbN.append(this.d);
        sbN.append(", description=");
        nc2.w(sbN, this.e, ", author=", this.f, ", packageUrl=");
        sbN.append(this.g);
        sbN.append(", sizeBytes=");
        sbN.append(this.h);
        sbN.append(", sha256=");
        sbN.append(this.i);
        sbN.append(")");
        return sbN.toString();
    }
}
