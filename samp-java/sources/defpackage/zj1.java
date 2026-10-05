package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zj1 {
    public final List a;
    public final long b;
    public final boolean c;

    public zj1(long j, List list, boolean z) {
        this.a = list;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj1)) {
            return false;
        }
        zj1 zj1Var = (zj1) obj;
        return this.a.equals(zj1Var.a) && this.b == zj1Var.b && this.c == zj1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nc2.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LogPage(lines=" + this.a + ", oldestOffset=" + this.b + ", hasEarlier=" + this.c + ")";
    }
}
