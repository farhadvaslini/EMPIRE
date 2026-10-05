package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vp2 {
    public final byte[] a;
    public final long b;

    public vp2(byte[] bArr, long j) {
        this.a = bArr;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp2)) {
            return false;
        }
        vp2 vp2Var = (vp2) obj;
        return this.a.equals(vp2Var.a) && this.b == vp2Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "QueryResponse(data=" + Arrays.toString(this.a) + ", roundTripMillis=" + this.b + ")";
    }
}
