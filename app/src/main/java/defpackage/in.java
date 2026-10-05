package defpackage;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class in implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ in(long j, float[] fArr, ok2 ok2Var, nk2 nk2Var) {
        this.f = 1;
        this.g = j;
        this.h = fArr;
        this.i = ok2Var;
        this.j = nk2Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) throws Throwable {
        long j;
        boolean z;
        float fA;
        float fA2;
        pi piVar;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                jk2 jk2Var = (jk2) obj4;
                qk2 qk2Var = (qk2) obj3;
                long j2 = this.g;
                yx yxVar = (yx) obj2;
                vb1 vb1Var = (vb1) obj;
                vb1Var.c();
                float f = jk2Var.a;
                float f2 = jk2Var.b;
                rr rrVar = vb1Var.f;
                ((yl1) rrVar.g.g).H(f, f2);
                try {
                    qf0.E0(vb1Var, (g9) qk2Var.f, j2, 0L, 0.0f, yxVar, 0, 890);
                    return dm3Var;
                } finally {
                    ((yl1) rrVar.g.g).H(-f, -f2);
                }
            case 1:
                float[] fArr = (float[]) obj4;
                ok2 ok2Var = (ok2) obj3;
                nk2 nk2Var = (nk2) obj2;
                t32 t32Var = (t32) obj;
                int i2 = t32Var.b;
                y9 y9Var = t32Var.a;
                int iE = t32Var.c;
                long j3 = this.g;
                int iF = i2 > yg3.f(j3) ? t32Var.b : yg3.f(j3);
                if (iE >= yg3.e(j3)) {
                    iE = yg3.e(j3);
                }
                long jF = d32.f(t32Var.d(iF), t32Var.d(iE));
                int i3 = ok2Var.f;
                ng3 ng3Var = y9Var.d;
                int iF2 = yg3.f(jF);
                int iE2 = yg3.e(jF);
                Layout layout = ng3Var.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    n21.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    n21.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    n21.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    n21.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i3 < (iE2 - iF2) * 4) {
                    n21.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iG = ng3Var.g(iF2);
                int iG2 = ng3Var.g(iE2 - 1);
                sy0 sy0Var = new sy0(ng3Var);
                if (iG <= iG2) {
                    while (true) {
                        int lineStart = layout.getLineStart(iG);
                        int iF3 = ng3Var.f(iG);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fI = ng3Var.i(iG);
                        float fE = ng3Var.e(iG);
                        j = jF;
                        int i4 = i3;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(iG) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z3 || zIsRtlCharAt) {
                                if (z3 && zIsRtlCharAt) {
                                    z2 = false;
                                    float fA3 = sy0Var.a(iMax, false, false, false);
                                    z = z3;
                                    fA = sy0Var.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !zIsRtlCharAt) {
                                        fA = sy0Var.a(iMax, false, false, false);
                                        fA2 = sy0Var.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = sy0Var.a(iMax, false, false, true);
                                        fA = sy0Var.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i4] = fA;
                                fArr[i4 + 1] = fI;
                                fArr[i4 + 2] = fA2;
                                fArr[i4 + 3] = fE;
                                i4 += 4;
                                iMax++;
                                z3 = z;
                            } else {
                                fA = sy0Var.a(iMax, z2, z2, true);
                                z = z3;
                                fA2 = sy0Var.a(iMax + 1, true, true, true);
                            }
                            z2 = false;
                            fArr[i4] = fA;
                            fArr[i4 + 1] = fI;
                            fArr[i4 + 2] = fA2;
                            fArr[i4 + 3] = fE;
                            i4 += 4;
                            iMax++;
                            z3 = z;
                        }
                        if (iG != iG2) {
                            iG++;
                            jF = j;
                            i3 = i4;
                        }
                    }
                } else {
                    j = jF;
                }
                int iD = (yg3.d(j) * 4) + ok2Var.f;
                for (int i5 = ok2Var.f; i5 < iD; i5 += 4) {
                    int i6 = i5 + 1;
                    float f3 = fArr[i6];
                    float f4 = nk2Var.f;
                    fArr[i6] = f3 + f4;
                    int i7 = i5 + 3;
                    fArr[i7] = fArr[i7] + f4;
                }
                ok2Var.f = iD;
                nk2Var.f += y9Var.f;
                return dm3Var;
            default:
                long j4 = this.g;
                da daVar = (da) obj2;
                qf0 qf0Var = (qf0) obj;
                float fA4 = ((ym0) obj4).a();
                float fMax = (Math.max(Math.min(1.0f, fA4) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                float fG = y02.g(Math.abs(fA4) - 1.0f, 0.0f, 2.0f);
                float fPow = (((0.4f * fMax) - 0.25f) + (fG - (((float) Math.pow(fG, 2.0d)) / 4.0f))) * 0.5f;
                float f5 = fPow * 360.0f;
                float f6 = ((0.8f * fMax) + fPow) * 360.0f;
                wj wjVar = new wj(fPow, f5, f6, Math.min(1.0f, fMax));
                float fFloatValue = ((Number) ((e93) obj3).getValue()).floatValue();
                long jY0 = qf0Var.y0();
                pi piVarZ = qf0Var.Z();
                long jA = piVarZ.A();
                piVarZ.k().l();
                try {
                    ((yl1) piVarZ.g).F(fPow, jY0);
                    float fT = (qf0Var.T(2.5f) / 2.0f) + qf0Var.T(5.5f);
                    long jP = d32.p(qf0Var.a());
                    int i8 = (int) (jP >> 32);
                    int i9 = (int) (jP & 4294967295L);
                    jk2 jk2Var2 = new jk2(Float.intBitsToFloat(i8) - fT, Float.intBitsToFloat(i9) - fT, Float.intBitsToFloat(i8) + fT, Float.intBitsToFloat(i9) + fT);
                    piVar = piVarZ;
                    try {
                        qf0Var.X(j4, f5, f6 - f5, jk2Var2.d(), jk2Var2.c(), (768 & 64) != 0 ? 1.0f : fFloatValue, new ga3(qf0Var.T(2.5f), 0.0f, 0, 0, null, 26));
                        t22.x(qf0Var, daVar, jk2Var2, j4, fFloatValue, wjVar);
                        nc2.t(piVar, jA);
                        return dm3Var;
                    } catch (Throwable th) {
                        th = th;
                        nc2.t(piVar, jA);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    piVar = piVarZ;
                }
                break;
        }
    }

    public /* synthetic */ in(Object obj, Object obj2, long j, Object obj3, int i) {
        this.f = i;
        this.h = obj;
        this.i = obj2;
        this.g = j;
        this.j = obj3;
    }
}
