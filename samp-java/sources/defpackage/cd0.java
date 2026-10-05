package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cd0 {
    public final long a;
    public final long b;
    public final long c;

    public cd0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd0)) {
            return false;
        }
        cd0 cd0Var = (cd0) obj;
        return this.a == cd0Var.a && this.b == cd0Var.b && this.c == cd0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + nc2.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "DownloadProgress(downloadedBytes=" + this.a + ", totalBytes=" + this.b + ", speedBytesPerSec=" + this.c + ")";
    }
}
