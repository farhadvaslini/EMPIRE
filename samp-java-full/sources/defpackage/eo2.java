package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class eo2 extends iy {
    public static final qn1 r = new qn1(9);
    public final xr3 d;
    public final float e;
    public final float f;
    public final vj3 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final yc0 k;
    public final do2 l;
    public final ao2 m;
    public final yc0 n;
    public final do2 o;
    public final ao2 p;
    public final boolean q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eo2(String str, float[] fArr, xr3 xr3Var, float[] fArr2, yc0 yc0Var, yc0 yc0Var2, float f, float f2, vj3 vj3Var, int i) {
        char c;
        float f3;
        float f4;
        boolean z;
        double d;
        super(str, 12884901888L, i);
        this.d = xr3Var;
        this.e = f;
        this.f = f2;
        this.g = vj3Var;
        this.k = yc0Var;
        int i2 = 1;
        this.l = new do2(this, i2);
        int i3 = 0;
        this.m = new ao2(this, i3);
        this.n = yc0Var2;
        this.o = new do2(this, i3);
        this.p = new ao2(this, i2);
        if (fArr.length != 6 && fArr.length != 9) {
            c.p("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr3[0] = f5 / f7;
            fArr3[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr3[2] = f8 / f10;
            fArr3[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr3[4] = f11 / f13;
            fArr3[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.h = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = xr3Var.a;
            c = 1;
            float f21 = xr3Var.b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.i = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            c = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                c.p(by1.e(fArr2.length, "Transform must have 9 entries! Has "));
                throw null;
            }
            this.i = fArr2;
        }
        this.j = pq.E(this.i);
        float fB = g12.B(fArr3);
        float[] fArr4 = ky.a;
        if (fB / g12.B(ky.b) > 0.9f) {
            float[] fArr5 = ky.a;
            float f38 = fArr3[0];
            float f39 = fArr5[0];
            float f40 = fArr3[c];
            float f41 = fArr5[c];
            float f42 = fArr3[2];
            float f43 = fArr5[2];
            float f44 = fArr3[3];
            float f45 = fArr5[3];
            float f46 = fArr3[4];
            float f47 = fArr5[4];
            float f48 = fArr3[5];
            float f49 = fArr5[5];
            f4 = 0.0f;
            float[] fArr6 = new float[6];
            fArr6[0] = f38 - f39;
            fArr6[c] = f40 - f41;
            fArr6[2] = f42 - f43;
            fArr6[3] = f44 - f45;
            fArr6[4] = f46 - f47;
            fArr6[5] = f48 - f49;
            float f50 = fArr6[0];
            float f51 = fArr6[c];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr6[2];
                float f53 = fArr6[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr6[4];
                    float f55 = fArr6[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                float[] fArr7 = ky.a;
                if (fArr3 != fArr7) {
                    for (int i4 = 0; i4 < 6; i4++) {
                        if (Float.compare(fArr3[i4], fArr7[i4]) != 0 && Math.abs(fArr3[i4] - fArr7[i4]) > 0.001f) {
                            break;
                        }
                    }
                    if (pq.p(xr3Var, rn.m0)) {
                        float[] fArr8 = ky.a;
                        eo2 eo2Var = ky.e;
                        while (d <= 1.0d) {
                        }
                        z = c;
                    }
                    z = 0;
                    break;
                }
                if (pq.p(xr3Var, rn.m0) && f == f4 && f2 == f3) {
                    float[] fArr82 = ky.a;
                    eo2 eo2Var2 = ky.e;
                    for (d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                        if (Math.abs(yc0Var.c(d) - eo2Var2.k.c(d)) <= 0.001d && Math.abs(yc0Var2.c(d) - eo2Var2.n.c(d)) <= 0.001d) {
                        }
                    }
                    z = c;
                }
                z = 0;
                break;
            }
            z = c;
            this.q = z;
        }
        f4 = 0.0f;
        int i5 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
        }
        this.q = z;
    }

    @Override // defpackage.iy
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.iy
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.iy
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.iy
    public final long d(float f, float f2, float f3) {
        double d = f;
        ao2 ao2Var = this.p;
        float fC = (float) ao2Var.c(d);
        float fC2 = (float) ao2Var.c(f2);
        float fC3 = (float) ao2Var.c(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fC3) + ((fArr[3] * fC2) + (fArr[0] * fC)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC))));
    }

    @Override // defpackage.iy
    public final float e(float f, float f2, float f3) {
        double d = f;
        ao2 ao2Var = this.p;
        float fC = (float) ao2Var.c(d);
        float fC2 = (float) ao2Var.c(f2);
        float fC3 = (float) ao2Var.c(f3);
        float[] fArr = this.i;
        return (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
    }

    @Override // defpackage.iy
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eo2.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        eo2 eo2Var = (eo2) obj;
        if (Float.compare(eo2Var.e, this.e) != 0 || Float.compare(eo2Var.f, this.f) != 0 || !s51.n(this.d, eo2Var.d) || !Arrays.equals(this.h, eo2Var.h)) {
            return false;
        }
        vj3 vj3Var = eo2Var.g;
        vj3 vj3Var2 = this.g;
        if (vj3Var2 != null) {
            return s51.n(vj3Var2, vj3Var);
        }
        if (vj3Var == null) {
            return true;
        }
        if (s51.n(this.k, eo2Var.k)) {
            return s51.n(this.n, eo2Var.n);
        }
        return false;
    }

    @Override // defpackage.iy
    public final long f(float f, float f2, float f3, float f4, iy iyVar) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        ao2 ao2Var = this.m;
        return vp.a((float) ao2Var.c(f5), (float) ao2Var.c(f6), (float) ao2Var.c(f7), f4, iyVar);
    }

    @Override // defpackage.iy
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        vj3 vj3Var = this.g;
        int iHashCode2 = iFloatToIntBits2 + (vj3Var != null ? vj3Var.hashCode() : 0);
        if (vj3Var != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public eo2(String str, float[] fArr, xr3 xr3Var, final vj3 vj3Var, int i) {
        double d;
        yc0 yc0Var;
        yc0 yc0Var2;
        double d2 = vj3Var.a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = vj3Var.g;
        double d4 = vj3Var.f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            yc0Var = new yc0() { // from class: co2
                @Override // defpackage.yc0
                public final double c(double d5) {
                    int i5 = i4;
                    vj3 vj3Var2 = vj3Var;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = ky.a;
                            return ky.a(vj3Var2, d5);
                        case 1:
                            float[] fArr3 = ky.a;
                            return ky.c(vj3Var2, d5);
                        case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = vj3Var2.b;
                            return d5 >= vj3Var2.e ? Math.pow((d6 * d5) + vj3Var2.c, vj3Var2.a) : vj3Var2.d * d5;
                        case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = vj3Var2.b;
                            double d8 = vj3Var2.c;
                            double d9 = vj3Var2.d;
                            return d5 >= vj3Var2.e ? Math.pow((d7 * d5) + d8, vj3Var2.a) + vj3Var2.f : (d9 * d5) + vj3Var2.g;
                        case oc2.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = ky.a;
                            return ky.b(vj3Var2, d5);
                        case oc2.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = ky.a;
                            return ky.d(vj3Var2, d5);
                        case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = vj3Var2.b;
                            double d11 = vj3Var2.c;
                            double d12 = vj3Var2.d;
                            return d5 >= vj3Var2.e * d12 ? (Math.pow(d5, 1.0d / vj3Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = vj3Var2.b;
                            double d14 = vj3Var2.c;
                            double d15 = vj3Var2.d;
                            return d5 >= vj3Var2.e * d15 ? (Math.pow(d5 - vj3Var2.f, 1.0d / vj3Var2.a) - d14) / d13 : (d5 - vj3Var2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                yc0Var = new yc0() { // from class: co2
                    @Override // defpackage.yc0
                    public final double c(double d5) {
                        int i52 = i5;
                        vj3 vj3Var2 = vj3Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = ky.a;
                                return ky.a(vj3Var2, d5);
                            case 1:
                                float[] fArr3 = ky.a;
                                return ky.c(vj3Var2, d5);
                            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                double d6 = vj3Var2.b;
                                return d5 >= vj3Var2.e ? Math.pow((d6 * d5) + vj3Var2.c, vj3Var2.a) : vj3Var2.d * d5;
                            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                                double d7 = vj3Var2.b;
                                double d8 = vj3Var2.c;
                                double d9 = vj3Var2.d;
                                return d5 >= vj3Var2.e ? Math.pow((d7 * d5) + d8, vj3Var2.a) + vj3Var2.f : (d9 * d5) + vj3Var2.g;
                            case oc2.LONG_FIELD_NUMBER /* 4 */:
                                float[] fArr4 = ky.a;
                                return ky.b(vj3Var2, d5);
                            case oc2.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = ky.a;
                                return ky.d(vj3Var2, d5);
                            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = vj3Var2.b;
                                double d11 = vj3Var2.c;
                                double d12 = vj3Var2.d;
                                return d5 >= vj3Var2.e * d12 ? (Math.pow(d5, 1.0d / vj3Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = vj3Var2.b;
                                double d14 = vj3Var2.c;
                                double d15 = vj3Var2.d;
                                return d5 >= vj3Var2.e * d15 ? (Math.pow(d5 - vj3Var2.f, 1.0d / vj3Var2.a) - d14) / d13 : (d5 - vj3Var2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                yc0Var = new yc0() { // from class: co2
                    @Override // defpackage.yc0
                    public final double c(double d5) {
                        int i52 = i6;
                        vj3 vj3Var2 = vj3Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = ky.a;
                                return ky.a(vj3Var2, d5);
                            case 1:
                                float[] fArr3 = ky.a;
                                return ky.c(vj3Var2, d5);
                            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                double d6 = vj3Var2.b;
                                return d5 >= vj3Var2.e ? Math.pow((d6 * d5) + vj3Var2.c, vj3Var2.a) : vj3Var2.d * d5;
                            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                                double d7 = vj3Var2.b;
                                double d8 = vj3Var2.c;
                                double d9 = vj3Var2.d;
                                return d5 >= vj3Var2.e ? Math.pow((d7 * d5) + d8, vj3Var2.a) + vj3Var2.f : (d9 * d5) + vj3Var2.g;
                            case oc2.LONG_FIELD_NUMBER /* 4 */:
                                float[] fArr4 = ky.a;
                                return ky.b(vj3Var2, d5);
                            case oc2.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = ky.a;
                                return ky.d(vj3Var2, d5);
                            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = vj3Var2.b;
                                double d11 = vj3Var2.c;
                                double d12 = vj3Var2.d;
                                return d5 >= vj3Var2.e * d12 ? (Math.pow(d5, 1.0d / vj3Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = vj3Var2.b;
                                double d14 = vj3Var2.c;
                                double d15 = vj3Var2.d;
                                return d5 >= vj3Var2.e * d15 ? (Math.pow(d5 - vj3Var2.f, 1.0d / vj3Var2.a) - d14) / d13 : (d5 - vj3Var2.g) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                yc0Var = new yc0() { // from class: co2
                    @Override // defpackage.yc0
                    public final double c(double d5) {
                        int i52 = i7;
                        vj3 vj3Var2 = vj3Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = ky.a;
                                return ky.a(vj3Var2, d5);
                            case 1:
                                float[] fArr3 = ky.a;
                                return ky.c(vj3Var2, d5);
                            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                double d6 = vj3Var2.b;
                                return d5 >= vj3Var2.e ? Math.pow((d6 * d5) + vj3Var2.c, vj3Var2.a) : vj3Var2.d * d5;
                            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                                double d7 = vj3Var2.b;
                                double d8 = vj3Var2.c;
                                double d9 = vj3Var2.d;
                                return d5 >= vj3Var2.e ? Math.pow((d7 * d5) + d8, vj3Var2.a) + vj3Var2.f : (d9 * d5) + vj3Var2.g;
                            case oc2.LONG_FIELD_NUMBER /* 4 */:
                                float[] fArr4 = ky.a;
                                return ky.b(vj3Var2, d5);
                            case oc2.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = ky.a;
                                return ky.d(vj3Var2, d5);
                            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = vj3Var2.b;
                                double d11 = vj3Var2.c;
                                double d12 = vj3Var2.d;
                                return d5 >= vj3Var2.e * d12 ? (Math.pow(d5, 1.0d / vj3Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = vj3Var2.b;
                                double d14 = vj3Var2.c;
                                double d15 = vj3Var2.d;
                                return d5 >= vj3Var2.e * d15 ? (Math.pow(d5 - vj3Var2.f, 1.0d / vj3Var2.a) - d14) / d13 : (d5 - vj3Var2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            yc0Var2 = new yc0() { // from class: co2
                @Override // defpackage.yc0
                public final double c(double d5) {
                    int i52 = i2;
                    vj3 vj3Var2 = vj3Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = ky.a;
                            return ky.a(vj3Var2, d5);
                        case 1:
                            float[] fArr3 = ky.a;
                            return ky.c(vj3Var2, d5);
                        case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = vj3Var2.b;
                            return d5 >= vj3Var2.e ? Math.pow((d6 * d5) + vj3Var2.c, vj3Var2.a) : vj3Var2.d * d5;
                        case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = vj3Var2.b;
                            double d8 = vj3Var2.c;
                            double d9 = vj3Var2.d;
                            return d5 >= vj3Var2.e ? Math.pow((d7 * d5) + d8, vj3Var2.a) + vj3Var2.f : (d9 * d5) + vj3Var2.g;
                        case oc2.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = ky.a;
                            return ky.b(vj3Var2, d5);
                        case oc2.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = ky.a;
                            return ky.d(vj3Var2, d5);
                        case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = vj3Var2.b;
                            double d11 = vj3Var2.c;
                            double d12 = vj3Var2.d;
                            return d5 >= vj3Var2.e * d12 ? (Math.pow(d5, 1.0d / vj3Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = vj3Var2.b;
                            double d14 = vj3Var2.c;
                            double d15 = vj3Var2.d;
                            return d5 >= vj3Var2.e * d15 ? (Math.pow(d5 - vj3Var2.f, 1.0d / vj3Var2.a) - d14) / d13 : (d5 - vj3Var2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            yc0Var2 = new yc0() { // from class: co2
                @Override // defpackage.yc0
                public final double c(double d5) {
                    int i52 = i3;
                    vj3 vj3Var2 = vj3Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = ky.a;
                            return ky.a(vj3Var2, d5);
                        case 1:
                            float[] fArr3 = ky.a;
                            return ky.c(vj3Var2, d5);
                        case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = vj3Var2.b;
                            return d5 >= vj3Var2.e ? Math.pow((d6 * d5) + vj3Var2.c, vj3Var2.a) : vj3Var2.d * d5;
                        case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = vj3Var2.b;
                            double d8 = vj3Var2.c;
                            double d9 = vj3Var2.d;
                            return d5 >= vj3Var2.e ? Math.pow((d7 * d5) + d8, vj3Var2.a) + vj3Var2.f : (d9 * d5) + vj3Var2.g;
                        case oc2.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = ky.a;
                            return ky.b(vj3Var2, d5);
                        case oc2.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = ky.a;
                            return ky.d(vj3Var2, d5);
                        case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = vj3Var2.b;
                            double d11 = vj3Var2.c;
                            double d12 = vj3Var2.d;
                            return d5 >= vj3Var2.e * d12 ? (Math.pow(d5, 1.0d / vj3Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = vj3Var2.b;
                            double d14 = vj3Var2.c;
                            double d15 = vj3Var2.d;
                            return d5 >= vj3Var2.e * d15 ? (Math.pow(d5 - vj3Var2.f, 1.0d / vj3Var2.a) - d14) / d13 : (d5 - vj3Var2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            yc0Var2 = new yc0() { // from class: co2
                @Override // defpackage.yc0
                public final double c(double d5) {
                    int i52 = i8;
                    vj3 vj3Var2 = vj3Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = ky.a;
                            return ky.a(vj3Var2, d5);
                        case 1:
                            float[] fArr3 = ky.a;
                            return ky.c(vj3Var2, d5);
                        case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = vj3Var2.b;
                            return d5 >= vj3Var2.e ? Math.pow((d6 * d5) + vj3Var2.c, vj3Var2.a) : vj3Var2.d * d5;
                        case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = vj3Var2.b;
                            double d8 = vj3Var2.c;
                            double d9 = vj3Var2.d;
                            return d5 >= vj3Var2.e ? Math.pow((d7 * d5) + d8, vj3Var2.a) + vj3Var2.f : (d9 * d5) + vj3Var2.g;
                        case oc2.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = ky.a;
                            return ky.b(vj3Var2, d5);
                        case oc2.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = ky.a;
                            return ky.d(vj3Var2, d5);
                        case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = vj3Var2.b;
                            double d11 = vj3Var2.c;
                            double d12 = vj3Var2.d;
                            return d5 >= vj3Var2.e * d12 ? (Math.pow(d5, 1.0d / vj3Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = vj3Var2.b;
                            double d14 = vj3Var2.c;
                            double d15 = vj3Var2.d;
                            return d5 >= vj3Var2.e * d15 ? (Math.pow(d5 - vj3Var2.f, 1.0d / vj3Var2.a) - d14) / d13 : (d5 - vj3Var2.g) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            yc0Var2 = new yc0() { // from class: co2
                @Override // defpackage.yc0
                public final double c(double d5) {
                    int i52 = i9;
                    vj3 vj3Var2 = vj3Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = ky.a;
                            return ky.a(vj3Var2, d5);
                        case 1:
                            float[] fArr3 = ky.a;
                            return ky.c(vj3Var2, d5);
                        case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = vj3Var2.b;
                            return d5 >= vj3Var2.e ? Math.pow((d6 * d5) + vj3Var2.c, vj3Var2.a) : vj3Var2.d * d5;
                        case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = vj3Var2.b;
                            double d8 = vj3Var2.c;
                            double d9 = vj3Var2.d;
                            return d5 >= vj3Var2.e ? Math.pow((d7 * d5) + d8, vj3Var2.a) + vj3Var2.f : (d9 * d5) + vj3Var2.g;
                        case oc2.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = ky.a;
                            return ky.b(vj3Var2, d5);
                        case oc2.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = ky.a;
                            return ky.d(vj3Var2, d5);
                        case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = vj3Var2.b;
                            double d11 = vj3Var2.c;
                            double d12 = vj3Var2.d;
                            return d5 >= vj3Var2.e * d12 ? (Math.pow(d5, 1.0d / vj3Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = vj3Var2.b;
                            double d14 = vj3Var2.c;
                            double d15 = vj3Var2.d;
                            return d5 >= vj3Var2.e * d15 ? (Math.pow(d5 - vj3Var2.f, 1.0d / vj3Var2.a) - d14) / d13 : (d5 - vj3Var2.g) / d15;
                    }
                }
            };
        }
        this(str, fArr, xr3Var, null, yc0Var, yc0Var2, 0.0f, 1.0f, vj3Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eo2(String str, float[] fArr, xr3 xr3Var, final double d, float f, float f2, int i) {
        yc0 yc0Var;
        yc0 yc0Var2 = r;
        if (d == 1.0d) {
            yc0Var = yc0Var2;
        } else {
            final int i2 = 0;
            yc0Var = new yc0() { // from class: bo2
                @Override // defpackage.yc0
                public final double c(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            yc0Var2 = new yc0() { // from class: bo2
                @Override // defpackage.yc0
                public final double c(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        this(str, fArr, xr3Var, null, yc0Var, yc0Var2, f, f2, new vj3(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
