package defpackage;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wr implements z13 {
    public final vo2 a = vo2.g;

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    @Override // defpackage.z13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vr a(long j, bb1 bb1Var, ua0 ua0Var) {
        double[] dArrA;
        char c;
        char c2;
        bb1Var.getClass();
        ua0Var.getClass();
        float fB = h43.b(j) * 0.5f;
        vo2 vo2Var = this.a;
        vo2Var.getClass();
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fB2 = h43.b(j) * 0.5f;
        if (fB == 0.0f) {
            return new w02(new jk2(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2));
        }
        if (vo2Var == vo2.f || (fIntBitsToFloat == fIntBitsToFloat2 && fB >= fB2)) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
            return new x02(new ro2(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        da daVarA = ga.a();
        Path path = daVarA.a;
        r40 r40Var = r40.l;
        double d = fIntBitsToFloat3;
        double d2 = fIntBitsToFloat4;
        double d3 = fB;
        double d4 = ((d * 0.5d) - d3) / d3;
        if (d4 < 0.0d) {
            d4 = 0.0d;
        }
        if (d4 > 1.0d) {
            d4 = 1.0d;
        }
        double d5 = ((0.5d * d2) - d3) / d3;
        if (d5 < 0.0d) {
            d5 = 0.0d;
        }
        if (d5 > 1.0d) {
            d5 = 1.0d;
        }
        r40Var.getClass();
        if (d4 == 0.0d) {
            c = 0;
        } else {
            if (d4 != 1.0d) {
                dArrA = d4 == d5 ? r40Var.a(d4) : r40Var.b(d4, d5);
                if (dArrA.length >= 20) {
                    double d6 = d - d3;
                    path.moveTo((float) ((dArrA[0] * d3) + d6), (float) ((dArrA[1] * d3) + 0.0d));
                    daVarA.c((float) ((dArrA[2] * d3) + d6), (float) ((dArrA[3] * d3) + 0.0d), (float) ((dArrA[4] * d3) + d6), (float) ((dArrA[5] * d3) + 0.0d), (float) ((dArrA[6] * d3) + d6), (float) ((dArrA[7] * d3) + 0.0d));
                    daVarA.c((float) ((dArrA[8] * d3) + d6), (float) ((dArrA[9] * d3) + 0.0d), (float) ((dArrA[10] * d3) + d6), (float) ((dArrA[11] * d3) + 0.0d), (float) ((dArrA[12] * d3) + d6), (float) ((dArrA[13] * d3) + 0.0d));
                    daVarA.c((float) ((dArrA[14] * d3) + d6), (float) ((dArrA[15] * d3) + 0.0d), (float) ((dArrA[16] * d3) + d6), (float) ((dArrA[17] * d3) + 0.0d), (float) ((dArrA[18] * d3) + d6), (float) ((dArrA[19] * d3) + 0.0d));
                    daVarA.e((float) ((dArrA[18] * d3) + d6), (float) (d2 - (dArrA[19] * d3)));
                    daVarA.c((float) ((dArrA[16] * d3) + d6), (float) (d2 - (dArrA[17] * d3)), (float) ((dArrA[14] * d3) + d6), (float) (d2 - (dArrA[15] * d3)), (float) ((dArrA[12] * d3) + d6), (float) (d2 - (dArrA[13] * d3)));
                    daVarA.c((float) ((dArrA[10] * d3) + d6), (float) (d2 - (dArrA[11] * d3)), (float) ((dArrA[8] * d3) + d6), (float) (d2 - (dArrA[9] * d3)), (float) ((dArrA[6] * d3) + d6), (float) (d2 - (dArrA[7] * d3)));
                    daVarA.c((float) ((dArrA[4] * d3) + d6), (float) (d2 - (dArrA[5] * d3)), (float) ((dArrA[2] * d3) + d6), (float) (d2 - (dArrA[3] * d3)), (float) ((dArrA[0] * d3) + d6), (float) (d2 - (dArrA[1] * d3)));
                    daVarA.e((float) (d3 - (dArrA[0] * d3)), (float) (d2 - (dArrA[1] * d3)));
                    daVarA.c((float) (d3 - (dArrA[2] * d3)), (float) (d2 - (dArrA[3] * d3)), (float) (d3 - (dArrA[4] * d3)), (float) (d2 - (dArrA[5] * d3)), (float) (d3 - (dArrA[6] * d3)), (float) (d2 - (dArrA[7] * d3)));
                    daVarA.c((float) (d3 - (dArrA[8] * d3)), (float) (d2 - (dArrA[9] * d3)), (float) (d3 - (dArrA[10] * d3)), (float) (d2 - (dArrA[11] * d3)), (float) (d3 - (dArrA[12] * d3)), (float) (d2 - (dArrA[13] * d3)));
                    daVarA.c((float) (d3 - (dArrA[14] * d3)), (float) (d2 - (dArrA[15] * d3)), (float) (d3 - (dArrA[16] * d3)), (float) (d2 - (dArrA[17] * d3)), (float) (d3 - (dArrA[18] * d3)), (float) (d2 - (dArrA[19] * d3)));
                    daVarA.e((float) (d3 - (dArrA[18] * d3)), (float) ((dArrA[19] * d3) + 0.0d));
                    daVarA.c((float) (d3 - (dArrA[16] * d3)), (float) ((dArrA[17] * d3) + 0.0d), (float) (d3 - (dArrA[14] * d3)), (float) ((dArrA[15] * d3) + 0.0d), (float) (d3 - (dArrA[12] * d3)), (float) ((dArrA[13] * d3) + 0.0d));
                    daVarA.c((float) (d3 - (dArrA[10] * d3)), (float) ((dArrA[11] * d3) + 0.0d), (float) (d3 - (dArrA[8] * d3)), (float) ((dArrA[9] * d3) + 0.0d), (float) (d3 - (dArrA[6] * d3)), (float) ((dArrA[7] * d3) + 0.0d));
                    daVarA.c((float) (d3 - (dArrA[4] * d3)), (float) ((dArrA[5] * d3) + 0.0d), (float) (d3 - (dArrA[2] * d3)), (float) ((dArrA[3] * d3) + 0.0d), (float) (d3 - (dArrA[0] * d3)), (float) ((dArrA[1] * d3) + 0.0d));
                    path.close();
                }
                return new v02(daVarA);
            }
            c = 1;
        }
        if (d5 == 0.0d) {
            c2 = 0;
        } else {
            if (d5 != 1.0d) {
                dArrA = d4 == d5 ? r40Var.a(d4) : r40Var.b(d4, d5);
                if (dArrA.length >= 20) {
                }
                return new v02(daVarA);
            }
            c2 = 1;
        }
        dArrA = r40Var.k[c][c2];
        if (dArrA.length >= 20) {
        }
        return new v02(daVarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wr) {
            return this.a == ((wr) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Capsule(style=" + this.a + ")";
    }
}
