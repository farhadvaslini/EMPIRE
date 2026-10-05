package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class c93 {
    public final long a;
    public final long b;

    public c93(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            qn1.h("stopTimeout(", j, " ms) cannot be negative");
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        qn1.h("replayExpiration(", j2, " ms) cannot be negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c93)) {
            return false;
        }
        c93 c93Var = (c93) obj;
        return this.a == c93Var.a && this.b == c93Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        ai1 ai1Var = new ai1(2);
        long j = this.a;
        if (j > 0) {
            ai1Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            ai1Var.add("replayExpiration=" + j2 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + qx.x0(vr.r(ai1Var), null, null, null, null, 63) + ')';
    }
}
