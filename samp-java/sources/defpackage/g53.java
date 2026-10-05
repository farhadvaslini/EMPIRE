package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class g53 {
    public static final float a = n92.j0;
    public static final float b;
    public static final long c;
    public static final float d;
    public static final float e;
    public static final xp3 f;

    static {
        float f2 = n92.h0;
        b = f2;
        float f3 = n92.f0;
        c = uq.b(f2, f3);
        uq.b(f3, f2);
        d = 6.0f;
        e = 2.0f;
        f = new xp3(b53.m);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final float r18, final defpackage.ns0 r19, defpackage.bq1 r20, boolean r21, final defpackage.ex r22, final int r23, defpackage.cs0 r24, defpackage.r43 r25, defpackage.qr1 r26, defpackage.nv0 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g53.a(float, ns0, bq1, boolean, ex, int, cs0, r43, qr1, nv0, int, int):void");
    }

    public static final void b(final float f2, final ns0 ns0Var, final bq1 bq1Var, final boolean z, final cs0 cs0Var, r43 r43Var, final qr1 qr1Var, final int i, final d00 d00Var, final d00 d00Var2, final ex exVar, nv0 nv0Var, final int i2, final int i3) {
        int i4;
        r43 r43Var2;
        qr1 qr1Var2;
        d00 d00Var3;
        int i5;
        nv0Var.b0(985901935);
        if ((i2 & 6) == 0) {
            i4 = (nv0Var.c(f2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= nv0Var.g(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= nv0Var.h(cs0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            r43Var2 = r43Var;
            i4 |= nv0Var.f(r43Var2) ? 131072 : 65536;
        } else {
            r43Var2 = r43Var;
        }
        if ((1572864 & i2) == 0) {
            qr1Var2 = qr1Var;
            i4 |= nv0Var.f(qr1Var2) ? 1048576 : 524288;
        } else {
            qr1Var2 = qr1Var;
        }
        if ((12582912 & i2) == 0) {
            i4 |= nv0Var.d(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            d00Var3 = d00Var;
            i4 |= nv0Var.h(d00Var3) ? 67108864 : 33554432;
        } else {
            d00Var3 = d00Var;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= nv0Var.h(d00Var2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (nv0Var.f(exVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (nv0Var.R(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            nv0Var.W();
            if ((i2 & 1) != 0 && !nv0Var.A()) {
                nv0Var.U();
            }
            nv0Var.q();
            boolean z2 = ((29360128 & i4) == 8388608) | ((((i5 & 14) ^ 6) > 4 && nv0Var.f(exVar)) || (i5 & 6) == 4);
            Object objO = nv0Var.O();
            if (z2 || objO == c20.a) {
                objO = new h53(f2, i, cs0Var, exVar);
                nv0Var.j0(objO);
            }
            h53 h53Var = (h53) objO;
            h53Var.g = cs0Var;
            h53Var.j = ns0Var;
            h53Var.c(f2);
            int i6 = ((i4 >> 3) & 1008) | ((i4 >> 6) & 57344);
            int i7 = i4 >> 9;
            c(h53Var, bq1Var, z, null, qr1Var2, d00Var3, d00Var2, nv0Var, i6 | (458752 & i7) | (i7 & 3670016));
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final r43 r43Var3 = r43Var2;
            xj2VarT.d = new rs0() { // from class: z43
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(i2 | 1);
                    int iY2 = jo3.y(i3);
                    g53.b(f2, ns0Var, bq1Var, z, cs0Var, r43Var3, qr1Var, i, d00Var, d00Var2, exVar, (nv0) obj, iY, iY2);
                    return dm3.a;
                }
            };
        }
    }

    public static final void c(h53 h53Var, bq1 bq1Var, boolean z, r43 r43Var, qr1 qr1Var, d00 d00Var, d00 d00Var2, nv0 nv0Var, int i) {
        int i2;
        r43 r43Var2;
        int i3;
        r43 r43VarD;
        nv0Var.b0(409861960);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(h53Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.f(qr1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.h(d00Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= nv0Var.h(d00Var2) ? 1048576 : 524288;
        }
        if (nv0Var.R(i2 & 1, (599187 & i2) != 599186)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                x43 x43Var = x43.a;
                i3 = i2 & (-7169);
                r43VarD = x43.d(nv0Var);
            } else {
                nv0Var.U();
                i3 = i2 & (-7169);
                r43VarD = r43Var;
            }
            nv0Var.q();
            if (h53Var.f < 0) {
                c.p("steps should be >= 0");
                return;
            } else {
                int i4 = i3 >> 3;
                d(bq1Var, h53Var, z, qr1Var, d00Var, d00Var2, nv0Var, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                r43Var2 = r43VarD;
            }
        } else {
            nv0Var.U();
            r43Var2 = r43Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gt(h53Var, bq1Var, z, r43Var2, qr1Var, d00Var, d00Var2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(bq1 bq1Var, h53 h53Var, boolean z, qr1 qr1Var, d00 d00Var, d00 d00Var2, nv0 nv0Var, int i) {
        int i2;
        d00 d00Var3;
        h53 h53Var2;
        Object[] objArr;
        t02 t02Var;
        bq1 nb3Var;
        boolean z2;
        ex exVar = h53Var.h;
        nv0Var.b0(898172835);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(h53Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.f(qr1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.h(d00Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.h(d00Var2) ? 131072 : 65536;
        }
        int i3 = i2;
        int i4 = 1;
        boolean z3 = false;
        if (nv0Var.R(i3 & 1, (i3 & 74899) != 74898)) {
            boolean z4 = nv0Var.j(s20.n) == bb1.g;
            h53Var.o = z4;
            z32 z32Var = h53Var.i;
            t02 t02Var2 = h53Var.r;
            if (t02Var2 == t02.g && z4) {
                objArr = false;
                z3 = true;
            } else {
                objArr = false;
            }
            yp1 yp1Var = yp1.a;
            if (z) {
                v8 v8Var = new v8(7, h53Var);
                za2 za2Var = ob3.a;
                t02Var = t02Var2;
                nb3Var = new nb3(h53Var, qr1Var, null, v8Var, 4);
            } else {
                t02Var = t02Var2;
                nb3Var = yp1Var;
            }
            t02 t02Var3 = h53Var.r;
            boolean zBooleanValue = ((Boolean) h53Var.s.getValue()).booleanValue();
            boolean zH = nv0Var.h(h53Var);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (zH || objO == zjVar) {
                objO = new m10(h53Var, null, i4);
                nv0Var.j0(objO);
            }
            bq1 bq1Var2 = nb3Var;
            bq1 bq1VarA = bf0.a(yp1Var, h53Var, t02Var3, z, qr1Var, zBooleanValue, (ss0) objO, z3, 32);
            s43 s43Var = s43.f;
            t02 t02Var4 = t02.f;
            t02 t02Var5 = t02Var;
            bq1 bq1VarR = t02Var5 == t02Var4 ? j43.r(r51.u(yp1Var, s43Var)) : j43.t(r51.u(yp1Var, s43Var));
            ry0 ry0Var = w41.a;
            bq1 bq1VarD = bq1Var.d(ep1.a);
            float f2 = b;
            float f3 = a;
            float f4 = f3;
            if (t02Var5 != t02Var4) {
                f3 = f2;
            }
            if (t02Var5 == t02Var4) {
                f4 = f2;
            }
            bq1 bq1VarA2 = su2.a(j43.j(bq1VarD, f3, f4, 0.0f, 0.0f, 12), false, new wk(z, h53Var));
            bq1 bq1Var3 = bq1VarR;
            bq1 bq1VarQ = r51.q(su2.a(bq1VarA2.d(t02Var5 == t02Var4 ? b2.b : b2.a), true, new yd2(z32Var.g(), new ex(exVar.f, exVar.g), h53Var.f, 0)), z, qr1Var);
            int i5 = h53Var.f;
            float fG = z32Var.g();
            ns0 ns0Var = h53Var.j;
            boolean z5 = z3;
            cs0 cs0Var = h53Var.g;
            if (i5 < 0) {
                c.p("steps should be >= 0");
                return;
            }
            h53Var2 = h53Var;
            bq1 bq1VarD2 = vm1.E(bq1VarQ, new e53(z, ns0Var, exVar, i5, z5, fG, cs0Var)).d(bq1Var2).d(bq1VarA);
            boolean zH2 = nv0Var.h(h53Var2);
            Object objO2 = nv0Var.O();
            if (zH2 || objO2 == zjVar) {
                objO2 = new rg1(1, h53Var2);
                nv0Var.j0(objO2);
            }
            cn1 cn1Var = (cn1) objO2;
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarD2);
            w10.c.getClass();
            nv0Var.d0();
            boolean z6 = nv0Var.S;
            x91 x91Var = tb1.Y;
            if (z6) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            z00 z00Var = f5.E;
            y02.F(z00Var, nv0Var, cn1Var);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var, n52VarL);
            z00 z00Var3 = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var3);
            }
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var, bq1VarM);
            boolean zH3 = nv0Var.h(h53Var2);
            Object objO3 = nv0Var.O();
            if (zH3 || objO3 == zjVar) {
                z2 = false;
                objO3 = new a53(h53Var2, 0 == true ? 1 : 0);
                nv0Var.j0(objO3);
            } else {
                z2 = false;
            }
            bq1 bq1VarW = cl3.w(bq1Var3, (ns0) objO3);
            vm vmVar = f5.g;
            cn1 cn1VarD = eo.d(vmVar, z2);
            int iC2 = lq.C(nv0Var);
            n52 n52VarL2 = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, bq1VarW);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, cn1VarD);
            y02.F(z00Var2, nv0Var, n52VarL2);
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC2))) {
                nc2.q(iC2, nv0Var, iC2, z00Var3);
            }
            y02.F(z00Var4, nv0Var, bq1VarM2);
            int i6 = (i3 >> 3) & 14;
            d00Var.e(h53Var2, nv0Var, Integer.valueOf(((i3 >> 9) & 112) | i6));
            nv0Var.p(true);
            bq1 bq1VarU = r51.u(yp1Var, s43.g);
            cn1 cn1VarD2 = eo.d(vmVar, false);
            int iC3 = lq.C(nv0Var);
            n52 n52VarL3 = nv0Var.l();
            bq1 bq1VarM3 = lr.M(nv0Var, bq1VarU);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, cn1VarD2);
            y02.F(z00Var2, nv0Var, n52VarL3);
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC3))) {
                nc2.q(iC3, nv0Var, iC3, z00Var3);
            }
            y02.F(z00Var4, nv0Var, bq1VarM3);
            d00Var3 = d00Var2;
            d00Var3.e(h53Var2, nv0Var, Integer.valueOf(i6 | ((i3 >> 12) & 112)));
            nv0Var.p(true);
            nv0Var.p(true);
        } else {
            d00Var3 = d00Var2;
            h53Var2 = h53Var;
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gm(bq1Var, h53Var2, z, qr1Var, d00Var, d00Var3, i);
        }
    }

    public static final float e(float f2, float[] fArr, float f3, float f4) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f5 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f5);
            } else {
                float fAbs = Math.abs(lq.N(f3, f4, f5) - f2);
                if (1 <= length) {
                    while (true) {
                        float f6 = fArr[i];
                        float fAbs2 = Math.abs(lq.N(f3, f4, f6) - f2);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f5 = f6;
                            fAbs = fAbs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(f5);
            }
        }
        return fValueOf != null ? lq.N(f3, f4, fValueOf.floatValue()) : f2;
    }
}
