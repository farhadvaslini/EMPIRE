package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xk2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final lk g;

    public xk2(long j, long j2, long j3, long j4, long j5, float[] fArr, lk lkVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = lkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && xk2.class == obj.getClass()) {
            xk2 xk2Var = (xk2) obj;
            if (this.a == xk2Var.a && this.b == xk2Var.b && this.e == xk2Var.e && i41.a(this.c, xk2Var.c) && i41.a(this.d, xk2Var.d)) {
                float[] fArr = xk2Var.f;
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    zEquals = fArr == null;
                    return zEquals && this.g == xk2Var.g;
                }
                if (fArr != null) {
                    zEquals = fArr2.equals(fArr);
                }
                if (zEquals) {
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = nc2.c(this.d, nc2.c(this.c, nc2.c(this.e, nc2.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iC + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
