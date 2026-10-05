package defpackage;

import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t60 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ z60 g;

    public /* synthetic */ t60(z60 z60Var, int i) {
        this.f = i;
        this.g = z60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x02cc A[PHI: r9
      0x02cc: PHI (r9v4 long) = (r9v3 long), (r9v3 long), (r9v5 long), (r9v5 long) binds: [B:109:0x02f0, B:111:0x02f5, B:94:0x02c4, B:96:0x02c9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ns0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj) {
        long j;
        a41 a41VarS;
        long j2;
        long j3;
        float f;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        z60 z60Var = this.g;
        switch (i) {
            case 0:
                gb2 gb2Var = (gb2) obj;
                gb2Var.getClass();
                z60Var.e.f(z60Var, new gy1(gb2Var.c));
                z60Var.f();
                break;
            case 1:
                ((gb2) obj).getClass();
                z60Var.f.h(z60Var);
                z60Var.g();
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                fx fxVar = z60Var.b;
                op3 op3Var = z60Var.n;
                long j4 = 1000;
                switch (b41.a.f) {
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        j = 0;
                        Instant instantNow = Instant.now();
                        instantNow.getClass();
                        a41 a41Var = a41.h;
                        a41VarS = pq.s(instantNow.getNano(), instantNow.getEpochSecond());
                        break;
                    default:
                        a41 a41Var2 = a41.h;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j5 = jCurrentTimeMillis / 1000;
                        if ((jCurrentTimeMillis ^ 1000) < 0 && j5 * 1000 != jCurrentTimeMillis) {
                            j5--;
                        }
                        long j6 = jCurrentTimeMillis % 1000;
                        j = 0;
                        a41VarS = j5 >= -31557014167219200L ? j5 <= 31556889864403199L ? pq.s((int) ((j6 + ((((j6 | (-j6)) & (j6 ^ 1000)) >> 63) & 1000)) * 1000000), j5) : a41.i : a41.h;
                        break;
                }
                int i2 = a41VarS.g;
                long j7 = a41VarS.f;
                if (j7 >= j) {
                    j2 = Long.MAX_VALUE;
                    if (j7 != 1) {
                        if (j7 != j) {
                            long j8 = j7 * 1000;
                            if (j8 / 1000 == j7) {
                                j4 = j8;
                            }
                        } else {
                            j4 = j;
                        }
                        long j9 = i2 / 1000000;
                        j3 = j4 + j9;
                        if ((j4 ^ j3) < j || (j9 ^ j4) < j) {
                            j2 = j3;
                        }
                    } else {
                        long j92 = i2 / 1000000;
                        j3 = j4 + j92;
                        if ((j4 ^ j3) < j) {
                            j2 = j3;
                        }
                    }
                } else {
                    long j10 = j7 + 1;
                    j2 = Long.MIN_VALUE;
                    if (j10 != 1) {
                        if (j10 != j) {
                            long j11 = j10 * 1000;
                            if (j11 / 1000 == j10) {
                                j4 = j11;
                            }
                        } else {
                            j4 = j;
                        }
                        long j12 = (i2 / 1000000) - 1000;
                        j3 = j4 + j12;
                        if ((j4 ^ j3) < j || (j12 ^ j4) < j) {
                        }
                    } else {
                        long j122 = (i2 / 1000000) - 1000;
                        j3 = j4 + j122;
                        if ((j4 ^ j3) < j) {
                            j2 = j3;
                        }
                    }
                }
                ((ol1) op3Var.a).a(j2, (((long) Float.floatToRawIntBits(z60Var.e())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
                cl3.t(z60Var.a, null, new p60(z60Var, lp3.b(op3Var.a(d32.h(Float.MAX_VALUE, Float.MAX_VALUE))) / (((Number) fxVar.b()).floatValue() - ((Number) fxVar.a()).floatValue()), null, 2), 3);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                hf0 hf0Var = (hf0) obj;
                hf0Var.getClass();
                float fB = z60Var.b();
                float f2 = hf0Var.f;
                gq.J(hf0Var, 10.0f * f2 * fB, f2 * 14.0f * fB, 4);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                uw0 uw0Var = (uw0) obj;
                uw0Var.getClass();
                uw0Var.m(((Number) z60Var.k.d()).floatValue());
                uw0Var.s(((Number) z60Var.l.d()).floatValue());
                float fFloatValue = ((Number) z60Var.i.d()).floatValue() / 10.0f;
                float fE = uw0Var.e();
                float f3 = 0.75f * fFloatValue;
                if (f3 < -0.2f) {
                    f3 = -0.2f;
                }
                if (f3 > 0.2f) {
                    f3 = 0.2f;
                }
                uw0Var.m(fE / (1.0f - f3));
                float fV = uw0Var.v();
                float f4 = fFloatValue * 0.25f;
                f = f4 >= -0.2f ? f4 : -0.2f;
                uw0Var.s((1.0f - (f <= 0.2f ? f : 0.2f)) * fV);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                uw0 uw0Var2 = (uw0) obj;
                uw0Var2.getClass();
                float fN = lq.N(1.0f, ((uw0Var2.h() * 16.0f) / Float.intBitsToFloat((int) (uw0Var2.a() >> 32))) + 1.0f, z60Var.b());
                uw0Var2.m(fN);
                uw0Var2.s(fN);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                hf0 hf0Var2 = (hf0) obj;
                hf0Var2.getClass();
                float fB2 = z60Var.b();
                zx.a(hf0Var2);
                rn.u(hf0Var2, hf0Var2.f * 8.0f);
                float f5 = hf0Var2.f;
                gq.J(hf0Var2, f5 * 24.0f * fB2, f5 * 24.0f * fB2, 12);
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                z60Var.f();
                break;
            case 8:
                hf0 hf0Var3 = (hf0) obj;
                hf0Var3.getClass();
                float fB3 = z60Var.b();
                rn.u(hf0Var3, (1.0f - fB3) * hf0Var3.f * 8.0f);
                float f6 = hf0Var3.f;
                gq.J(hf0Var3, 5.0f * f6 * fB3, f6 * 10.0f * fB3, 4);
                break;
            case vr.g /* 9 */:
                uw0 uw0Var3 = (uw0) obj;
                uw0Var3.getClass();
                uw0Var3.m(((Number) z60Var.k.d()).floatValue());
                uw0Var3.s(((Number) z60Var.l.d()).floatValue());
                float fFloatValue2 = ((Number) z60Var.i.d()).floatValue() / 10.0f;
                float fE2 = uw0Var3.e();
                float f7 = 0.75f * fFloatValue2;
                if (f7 < -0.2f) {
                    f7 = -0.2f;
                }
                if (f7 > 0.2f) {
                    f7 = 0.2f;
                }
                uw0Var3.m(fE2 / (1.0f - f7));
                float fV2 = uw0Var3.v();
                float f8 = fFloatValue2 * 0.25f;
                f = f8 >= -0.2f ? f8 : -0.2f;
                uw0Var3.s((1.0f - (f <= 0.2f ? f : 0.2f)) * fV2);
                break;
            case vr.h /* 10 */:
                qf0 qf0Var = (qf0) obj;
                qf0Var.getClass();
                qf0.h0(qf0Var, wx.b(1.0f - z60Var.b(), wx.c), 0L, 0L, 0.0f, null, 0, 126);
                break;
            case 11:
                hf0 hf0Var4 = (hf0) obj;
                hf0Var4.getClass();
                float fB4 = z60Var.b();
                rn.u(hf0Var4, (1.0f - fB4) * hf0Var4.f * 8.0f);
                float f9 = hf0Var4.f;
                gq.J(hf0Var4, 10.0f * f9 * fB4, f9 * 14.0f * fB4, 4);
                break;
            case vr.i /* 12 */:
                uw0 uw0Var4 = (uw0) obj;
                uw0Var4.getClass();
                uw0Var4.m(((Number) z60Var.k.d()).floatValue());
                uw0Var4.s(((Number) z60Var.l.d()).floatValue());
                float fFloatValue3 = ((Number) z60Var.i.d()).floatValue() / 50.0f;
                float fE3 = uw0Var4.e();
                float f10 = 0.75f * fFloatValue3;
                if (f10 < -0.2f) {
                    f10 = -0.2f;
                }
                if (f10 > 0.2f) {
                    f10 = 0.2f;
                }
                uw0Var4.m(fE3 / (1.0f - f10));
                float fV3 = uw0Var4.v();
                float f11 = fFloatValue3 * 0.25f;
                f = f11 >= -0.2f ? f11 : -0.2f;
                uw0Var4.s((1.0f - (f <= 0.2f ? f : 0.2f)) * fV3);
                break;
            default:
                qf0 qf0Var2 = (qf0) obj;
                qf0Var2.getClass();
                qf0.h0(qf0Var2, wx.b(1.0f - z60Var.b(), wx.c), 0L, 0L, 0.0f, null, 0, 126);
                break;
        }
        return dm3Var;
    }
}
