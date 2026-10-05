package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fp3 implements bp3 {
    public final nr1 f;
    public final or1 g;
    public final int h;
    public final ng0 i;
    public int[] j = ap3.a;
    public float[] k;
    public ue l;
    public ue m;
    public ue n;
    public ue o;
    public float[] p;
    public float[] q;
    public yl1 r;

    public fp3(nr1 nr1Var, or1 or1Var, int i, ng0 ng0Var) {
        this.f = nr1Var;
        this.g = or1Var;
        this.h = i;
        this.i = ng0Var;
        float[] fArr = ap3.b;
        this.k = fArr;
        this.p = fArr;
        this.q = fArr;
        this.r = ap3.c;
    }

    public final int c(int i) {
        int i2;
        nr1 nr1Var = this.f;
        int i3 = nr1Var.b;
        int i4 = 0;
        if (i3 <= 0) {
            c.i("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = nr1Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float d(int i, int i2, boolean z) {
        ng0 ng0Var;
        float f;
        nr1 nr1Var = this.f;
        if (i >= nr1Var.b - 1) {
            f = i2;
        } else {
            int iC = nr1Var.c(i);
            int iC2 = nr1Var.c(i + 1);
            if (i2 != iC) {
                int i3 = iC2 - iC;
                ep3 ep3Var = (ep3) this.g.b(iC);
                if (ep3Var == null || (ng0Var = ep3Var.b) == null) {
                    ng0Var = this.i;
                }
                float f2 = i3;
                float fB = ng0Var.b((i2 - iC) / f2);
                return z ? fB : ((f2 * fB) + iC) / 1000.0f;
            }
            f = iC;
        }
        return f / 1000.0f;
    }

    public final void e(ue ueVar, ue ueVar2, ue ueVar3) {
        float[] fArr;
        boolean z = this.r != ap3.c;
        ue ueVar4 = this.l;
        or1 or1Var = this.g;
        nr1 nr1Var = this.f;
        if (ueVar4 == null) {
            this.l = ueVar.c();
            this.m = ueVar3.c();
            int i = nr1Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = nr1Var.c(i2) / 1000.0f;
            }
            this.k = fArr2;
            int i3 = nr1Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.j = iArr;
        }
        if (z) {
            if (this.r != ap3.c && s51.n(this.n, ueVar) && s51.n(this.o, ueVar2)) {
                return;
            }
            this.n = ueVar;
            this.o = ueVar2;
            int iB = ueVar.b() + (ueVar.b() % 2);
            this.p = new float[iB];
            this.q = new float[iB];
            int i5 = nr1Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = nr1Var.c(i6);
                ep3 ep3Var = (ep3) or1Var.b(iC);
                if (iC == 0 && ep3Var == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = ueVar.a(i7);
                    }
                } else if (iC == this.h && ep3Var == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = ueVar2.a(i8);
                    }
                } else {
                    ep3Var.getClass();
                    ue ueVar5 = ep3Var.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = ueVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.r = new yl1(this.j, this.k, fArr3);
        }
    }

    @Override // defpackage.bp3
    public final int k() {
        return 0;
    }

    @Override // defpackage.zo3
    public final ue l(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        long j2 = j / 1000000;
        int[] iArr = ap3.a;
        long j3 = this.h;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return ueVar3;
        }
        e(ueVar, ueVar2, ueVar3);
        ue ueVar4 = this.m;
        ueVar4.getClass();
        int i = 0;
        if (this.r != ap3.c) {
            int i2 = (int) j4;
            float fD = d(c(i2), i2, false);
            float[] fArr = this.q;
            ej[][] ejVarArr = (ej[][]) this.r.g;
            float f = ejVarArr[0][0].a;
            float f2 = ejVarArr[ejVarArr.length - 1][0].b;
            if (fD < f) {
                fD = f;
            }
            if (fD <= f2) {
                f2 = fD;
            }
            int length = fArr.length;
            boolean z = false;
            for (ej[] ejVarArr2 : ejVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    ej ejVar = ejVarArr2[i4];
                    if (f2 <= ejVar.b) {
                        if (ejVar.p) {
                            fArr[i3] = ejVar.q;
                            fArr[i3 + 1] = ejVar.r;
                        } else {
                            ejVar.c(f2);
                            fArr[i3] = ejVar.a();
                            fArr[i3 + 1] = ejVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                ueVar4.e(fArr[i], i);
                i++;
            }
        } else {
            ue ueVarP = p((j4 - 1) * 1000000, ueVar, ueVar2, ueVar3);
            ue ueVarP2 = p(j4 * 1000000, ueVar, ueVar2, ueVar3);
            int iB = ueVarP.b();
            while (i < iB) {
                ueVar4.e((ueVarP.a(i) - ueVarP2.a(i)) * 1000.0f, i);
                i++;
            }
        }
        return ueVar4;
    }

    @Override // defpackage.bp3
    public final int o() {
        return this.h;
    }

    @Override // defpackage.zo3
    public final ue p(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        ue ueVar4;
        ue ueVar5;
        ej[][] ejVarArr;
        ue ueVar6 = ueVar;
        long j2 = j / 1000000;
        int[] iArr = ap3.a;
        int i = this.h;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        or1 or1Var = this.g;
        ep3 ep3Var = (ep3) or1Var.b(i2);
        if (ep3Var != null) {
            return ep3Var.a;
        }
        if (i2 >= i) {
            return ueVar2;
        }
        if (i2 <= 0) {
            return ueVar6;
        }
        e(ueVar6, ueVar2, ueVar3);
        ue ueVar7 = this.l;
        ueVar7.getClass();
        int i3 = 0;
        if (this.r != ap3.c) {
            float fD = d(c(i2), i2, false);
            float[] fArr = this.p;
            ej[][] ejVarArr2 = (ej[][]) this.r.g;
            int length = ejVarArr2.length - 1;
            float f = ejVarArr2[0][0].a;
            float f2 = ejVarArr2[length][0].b;
            int length2 = fArr.length;
            if (fD < f || fD > f2) {
                if (fD > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fD - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    ej ejVar = ejVarArr2[length][i5];
                    boolean z = ejVar.p;
                    float f4 = ejVar.r;
                    float f5 = ejVar.q;
                    if (z) {
                        float f6 = ejVar.a;
                        float f7 = ejVar.k;
                        float f8 = ejVar.c;
                        ejVarArr = ejVarArr2;
                        fArr[i4] = (f5 * f3) + ((ejVar.e - f8) * (f - f6) * f7) + f8;
                        float f9 = (f - f6) * f7;
                        float f10 = ejVar.d;
                        fArr[i4 + 1] = (f4 * f3) + ((ejVar.f - f10) * f9) + f10;
                    } else {
                        ejVarArr = ejVarArr2;
                        ejVar.c(f);
                        fArr[i4] = (ejVar.a() * f3) + (ejVar.n * ejVar.h) + f5;
                        fArr[i4 + 1] = (ejVar.b() * f3) + (ejVar.o * ejVar.i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    ejVarArr2 = ejVarArr;
                }
            } else {
                int length3 = ejVarArr2.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        ej ejVar2 = ejVarArr2[i6][i8];
                        if (fD <= ejVar2.b) {
                            if (ejVar2.p) {
                                float f11 = ejVar2.a;
                                float f12 = ejVar2.k;
                                float f13 = ejVar2.c;
                                fArr[i7] = ((ejVar2.e - f13) * (fD - f11) * f12) + f13;
                                float f14 = ejVar2.d;
                                fArr[i7 + 1] = ((ejVar2.f - f14) * (fD - f11) * f12) + f14;
                            } else {
                                ejVar2.c(fD);
                                fArr[i7] = (ejVar2.n * ejVar2.h) + ejVar2.q;
                                fArr[i7 + 1] = (ejVar2.o * ejVar2.i) + ejVar2.r;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                ueVar7.e(fArr[i9], i9);
            }
        } else {
            int iC = c(i2);
            float fD2 = d(iC, i2, true);
            nr1 nr1Var = this.f;
            ep3 ep3Var2 = (ep3) or1Var.b(nr1Var.c(iC));
            if (ep3Var2 != null && (ueVar5 = ep3Var2.a) != null) {
                ueVar6 = ueVar5;
            }
            ep3 ep3Var3 = (ep3) or1Var.b(nr1Var.c(iC + 1));
            if (ep3Var3 == null || (ueVar4 = ep3Var3.a) == null) {
                ueVar4 = ueVar2;
            }
            int iB = ueVar7.b();
            for (int i10 = 0; i10 < iB; i10++) {
                ueVar7.e((ueVar4.a(i10) * fD2) + ((1.0f - fD2) * ueVar6.a(i10)), i10);
            }
        }
        return ueVar7;
    }
}
