package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fg3 {
    public static final fg3 c = new fg3(oz2.w(0), oz2.w(0));
    public final long a;
    public final long b;

    public fg3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg3)) {
            return false;
        }
        fg3 fg3Var = (fg3) obj;
        return jh3.a(this.a, fg3Var.a) && jh3.a(this.b, fg3Var.b);
    }

    public final int hashCode() {
        kh3[] kh3VarArr = jh3.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return by1.i("TextIndent(firstLine=", jh3.d(this.a), ", restLine=", jh3.d(this.b), ")");
    }
}
