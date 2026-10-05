package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class u32 {
    public final ca a;
    public final int b;
    public final int c;

    public u32(ca caVar, int i, int i2) {
        this.a = caVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u32) {
            u32 u32Var = (u32) obj;
            if (this.a == u32Var.a && this.b == u32Var.b && this.c == u32Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + nc2.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ")";
    }
}
