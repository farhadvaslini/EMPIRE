package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class im0 {
    public final int a;
    public final String b;
    public final String c;

    public im0(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im0)) {
            return false;
        }
        im0 im0Var = (im0) obj;
        return this.a == im0Var.a && s51.n(this.b, im0Var.b) && s51.n(this.c, im0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + by1.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterItem(id=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return nc2.j(sb, this.c, ")");
    }
}
