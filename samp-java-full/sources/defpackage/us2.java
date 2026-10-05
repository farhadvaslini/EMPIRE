package defpackage;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class us2 {
    public final /* synthetic */ ws2 a;

    public us2(ws2 ws2Var) {
        this.a = ws2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0245 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141 A[PHI: r8
      0x0141: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:77:0x016f, B:66:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fH;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jD;
        boolean z;
        boolean zF;
        boolean z2;
        int i3;
        boolean z3;
        ws2 ws2Var = this.a;
        ws2Var.j = i;
        w8 w8Var = ws2Var.b;
        if (w8Var == null || !ws2Var.b()) {
            return ws2Var.d(ws2Var.k, j, i);
        }
        int i4 = ws2Var.j;
        xc1 xc1Var = ws2Var.m;
        ug0 ug0Var = w8Var.c;
        if (h43.c(w8Var.g)) {
            ws2 ws2Var2 = (ws2) xc1Var.g;
            return new gy1(ws2Var2.d(ws2Var2.k, j, ws2Var2.j)).a;
        }
        if (!w8Var.f) {
            if (ug0.g(ug0Var.f)) {
                w8Var.g(0L);
            }
            if (ug0.g(ug0Var.g)) {
                w8Var.h(0L);
            }
            if (ug0.g(ug0Var.d)) {
                w8Var.i(0L);
            }
            if (ug0.g(ug0Var.e)) {
                w8Var.f(0L);
            }
            w8Var.f = true;
        }
        int i5 = v9.a;
        float f = i4 == 2 ? 4.0f : 1.0f;
        long jF = gy1.f(f, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!ug0.g(ug0Var.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (ug0.g(ug0Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float f2 = w8Var.f(jF);
                    if (!ug0.g(ug0Var.e)) {
                        ug0Var.b().finish();
                    }
                    fIntBitsToFloat = f2 == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i6) : f2 / f;
                }
            } else {
                float fI = w8Var.i(jF);
                j2 = 4294967295L;
                if (!ug0.g(ug0Var.d)) {
                    ug0Var.e().finish();
                }
                fIntBitsToFloat = fI == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i6) : fI / f;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                if (ug0.g(ug0Var.f) && Float.intBitsToFloat(i2) < 0.0f) {
                    fH = w8Var.g(jF);
                    if (!ug0.g(ug0Var.f)) {
                        ug0Var.c().finish();
                    }
                    if (fH == Float.intBitsToFloat((int) (jF >> 32))) {
                        fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                } else if (!ug0.g(ug0Var.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    fH = w8Var.h(jF);
                    if (!ug0.g(ug0Var.g)) {
                        ug0Var.d().finish();
                    }
                    fIntBitsToFloat2 = fH == Float.intBitsToFloat((int) (jF >> 32)) ? Float.intBitsToFloat(i2) : fH / f;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!gy1.b(jFloatToRawIntBits, 0L)) {
                w8Var.d();
            }
            jD = gy1.d(j, jFloatToRawIntBits);
            ws2 ws2Var3 = (ws2) xc1Var.g;
            long j3 = new gy1(ws2Var3.d(ws2Var3.k, jD, ws2Var3.j)).a;
            long jD2 = gy1.d(jD, j3);
            if ((Float.intBitsToFloat((int) (jD >> 32)) == 0.0f || Float.intBitsToFloat((int) (jD & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (ug0.g(ug0Var.f) || ug0.g(ug0Var.d) || ug0.g(ug0Var.g) || ug0.g(ug0Var.e)))) {
                w8Var.a();
            }
            if (i4 != 1) {
                int i7 = (int) (jD2 >> 32);
                if (Float.intBitsToFloat(i7) > 0.5f) {
                    w8Var.g(jD2);
                } else if (Float.intBitsToFloat(i7) < -0.5f) {
                    w8Var.h(jD2);
                } else {
                    z2 = false;
                    i3 = (int) (jD2 & j2);
                    if (Float.intBitsToFloat(i3) <= 0.5f) {
                        w8Var.i(jD2);
                    } else if (Float.intBitsToFloat(i3) < -0.5f) {
                        w8Var.f(jD2);
                    } else {
                        z3 = false;
                        z = !z2 || z3;
                    }
                    z3 = true;
                    if (z2) {
                    }
                }
                z2 = true;
                i3 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i3) <= 0.5f) {
                }
                z3 = true;
                if (z2) {
                }
            }
            if (!gy1.b(jD, 0L)) {
                if (!ug0.f(ug0Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = ug0Var.c();
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof jw0) {
                        jw0 jw0Var = (jw0) edgeEffectC;
                        float f3 = jw0Var.b + fIntBitsToFloat3;
                        jw0Var.b = f3;
                        if (Math.abs(f3) > jw0Var.a) {
                            jw0Var.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = ug0.f(ug0Var.f);
                }
                if (ug0.f(ug0Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    EdgeEffect edgeEffectD = ug0Var.d();
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof jw0) {
                        jw0 jw0Var2 = (jw0) edgeEffectD;
                        float f4 = jw0Var2.b + fIntBitsToFloat4;
                        jw0Var2.b = f4;
                        if (Math.abs(f4) > jw0Var2.a) {
                            jw0Var2.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    zF = zF || ug0.f(ug0Var.g);
                }
                if (ug0.f(ug0Var.d) && Float.intBitsToFloat(i6) < 0.0f) {
                    EdgeEffect edgeEffectE = ug0Var.e();
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i6);
                    if (edgeEffectE instanceof jw0) {
                        jw0 jw0Var3 = (jw0) edgeEffectE;
                        float f5 = jw0Var3.b + fIntBitsToFloat5;
                        jw0Var3.b = f5;
                        if (Math.abs(f5) > jw0Var3.a) {
                            jw0Var3.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    zF = zF || ug0.f(ug0Var.d);
                }
                if (ug0.f(ug0Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    EdgeEffect edgeEffectB = ug0Var.b();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i6);
                    if (edgeEffectB instanceof jw0) {
                        jw0 jw0Var4 = (jw0) edgeEffectB;
                        float f6 = jw0Var4.b + fIntBitsToFloat6;
                        jw0Var4.b = f6;
                        if (Math.abs(f6) > jw0Var4.a) {
                            jw0Var4.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    zF = zF || ug0.f(ug0Var.e);
                }
                z = zF || z;
            }
            if (z) {
                w8Var.d();
            }
            return gy1.e(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!gy1.b(jFloatToRawIntBits, 0L)) {
        }
        jD = gy1.d(j, jFloatToRawIntBits);
        ws2 ws2Var32 = (ws2) xc1Var.g;
        long j32 = new gy1(ws2Var32.d(ws2Var32.k, jD, ws2Var32.j)).a;
        long jD22 = gy1.d(jD, j32);
        if (Float.intBitsToFloat((int) (jD >> 32)) == 0.0f) {
            w8Var.a();
        } else {
            w8Var.a();
        }
        if (i4 != 1) {
        }
        if (!gy1.b(jD, 0L)) {
        }
        if (z) {
        }
        return gy1.e(jFloatToRawIntBits, j32);
    }
}
