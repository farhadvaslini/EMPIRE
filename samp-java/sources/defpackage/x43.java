package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class x43 {
    public static final x43 a = new x43();
    public static final float b;
    public static final float c;
    public static final da d;

    static {
        float f = n92.k0;
        b = f;
        c = f;
        d = ga.a();
    }

    public static r43 d(nv0 nv0Var) {
        fy fyVar = (fy) nv0Var.j(hy.a);
        r43 r43Var = fyVar.n0;
        if (r43Var != null) {
            return r43Var;
        }
        long jD = hy.d(fyVar, n92.e0);
        gy gyVar = n92.X;
        long jD2 = hy.d(fyVar, gyVar);
        gy gyVar2 = n92.i0;
        long jD3 = hy.d(fyVar, gyVar2);
        long jD4 = hy.d(fyVar, gyVar2);
        long jD5 = hy.d(fyVar, gyVar);
        long jX = vp.x(wx.b(n92.b0, hy.d(fyVar, n92.a0)), fyVar.p);
        gy gyVar3 = n92.Y;
        long jD6 = hy.d(fyVar, gyVar3);
        float f = n92.Z;
        long jB = wx.b(f, jD6);
        gy gyVar4 = n92.c0;
        long jD7 = hy.d(fyVar, gyVar4);
        float f2 = n92.d0;
        r43 r43Var2 = new r43(jD, jD2, jD3, jD4, jD5, jX, jB, wx.b(f2, jD7), wx.b(f2, hy.d(fyVar, gyVar4)), wx.b(f, hy.d(fyVar, gyVar3)));
        fyVar.n0 = r43Var2;
        return r43Var2;
    }

    public static void e(qf0 qf0Var, t02 t02Var, long j, long j2, long j3, float f, float f2) {
        ro2 ro2Var;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (t02Var == t02.f) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            jk2 jk2VarB = b32.b(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            ro2Var = new ro2(jk2VarB.a, jk2VarB.b, jk2VarB.c, jk2VarB.d, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
            jk2 jk2VarB2 = b32.b(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
            ro2Var = new ro2(jk2VarB2.a, jk2VarB2.b, jk2VarB2.c, jk2VarB2.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        da daVar = d;
        da.b(daVar, ro2Var);
        qf0.b1(qf0Var, daVar, j3, 0.0f, null, 60);
        daVar.h();
    }

    public final void a(final qr1 qr1Var, bq1 bq1Var, final r43 r43Var, final boolean z, long j, nv0 nv0Var, final int i) {
        final bq1 bq1Var2;
        final long j2;
        bq1 bq1Var3;
        nv0Var.b0(-290277409);
        int i2 = i | (nv0Var.f(qr1Var) ? 4 : 2) | 48 | (nv0Var.f(r43Var) ? 256 : 128) | (nv0Var.g(z) ? 2048 : 1024) | 24576;
        if (nv0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                j2 = g53.c;
                bq1Var3 = yp1.a;
            } else {
                nv0Var.U();
                bq1Var3 = bq1Var;
                j2 = j;
            }
            nv0Var.q();
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = new l73();
                nv0Var.j0(objO);
            }
            l73 l73Var = (l73) objO;
            boolean z2 = (i2 & 14) == 4;
            Object objO2 = nv0Var.O();
            if (z2 || objO2 == zjVar) {
                objO2 = new hd1(qr1Var, l73Var, null, 23);
                nv0Var.j0(objO2);
            }
            rn.l((rs0) objO2, nv0Var, qr1Var);
            long jFloatToRawIntBits = !l73Var.isEmpty() ? (((long) Float.floatToRawIntBits(md0.b(j2) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(md0.a(j2))) & 4294967295L) : j2;
            gm0 gm0Var = j43.a;
            oz2.g(nv0Var, gv3.v(cl3.o(j43.l(bq1Var3, md0.b(jFloatToRawIntBits), md0.a(jFloatToRawIntBits)), qr1Var), z ? r43Var.a : r43Var.f, g23.a(n92.g0, nv0Var)));
            bq1Var2 = bq1Var3;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            j2 = j;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(qr1Var, bq1Var2, r43Var, z, j2, i) { // from class: u43
                public final /* synthetic */ qr1 g;
                public final /* synthetic */ bq1 h;
                public final /* synthetic */ r43 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ long k;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(196609);
                    this.f.a(this.g, this.h, this.i, this.j, this.k, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public final void b(final h53 h53Var, bq1 bq1Var, final boolean z, final r43 r43Var, rs0 rs0Var, ss0 ss0Var, float f, float f2, nv0 nv0Var, final int i) {
        int i2;
        final bq1 bq1Var2;
        final rs0 rs0Var2;
        final ss0 ss0Var2;
        final float f3;
        final float f4;
        int i3;
        rs0 rs0Var3;
        float f5;
        ss0 ss0Var3;
        bq1 bq1Var3;
        float f6;
        nv0Var.b0(49984771);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(h53Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= nv0Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= nv0Var.f(r43Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            i5 |= nv0Var.f(this) ? 67108864 : 33554432;
        }
        if (nv0Var.R(i5 & 1, (38347923 & i5) != 38347922)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                boolean z2 = ((((i5 & 7168) ^ 3072) > 2048 && nv0Var.f(r43Var)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object objO = nv0Var.O();
                zj zjVar = c20.a;
                if (z2 || objO == zjVar) {
                    objO = new lv(r43Var, z);
                    nv0Var.j0(objO);
                }
                rs0 rs0Var4 = (rs0) objO;
                i3 = i5 & (-57345);
                Object objO2 = nv0Var.O();
                if (objO2 == zjVar) {
                    objO2 = i00.i;
                    nv0Var.j0(objO2);
                }
                float f7 = g53.d;
                rs0Var3 = rs0Var4;
                f5 = g53.e;
                ss0Var3 = (ss0) objO2;
                bq1Var3 = yp1.a;
                f6 = f7;
            } else {
                nv0Var.U();
                i3 = i5 & (-57345);
                bq1Var3 = bq1Var;
                rs0Var3 = rs0Var;
                ss0Var3 = ss0Var;
                f6 = f;
                f5 = f2;
            }
            nv0Var.q();
            int i6 = i3 << 3;
            c(h53Var, bq1Var3, z, r43Var, rs0Var3, ss0Var3, f6, f5, nv0Var, 805306416 | (i3 & 14) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024), ((i3 >> 21) & 112) | 6);
            bq1Var2 = bq1Var3;
            f4 = f5;
            f3 = f6;
            ss0Var2 = ss0Var3;
            rs0Var2 = rs0Var3;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            rs0Var2 = rs0Var;
            ss0Var2 = ss0Var;
            f3 = f;
            f4 = f2;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: t43
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f.b(h53Var, bq1Var2, z, r43Var, rs0Var2, ss0Var2, f3, f4, (nv0) obj, jo3.y(i | 1));
                    return dm3.a;
                }
            };
        }
    }

    public final void c(final h53 h53Var, final bq1 bq1Var, final boolean z, final r43 r43Var, final rs0 rs0Var, final ss0 ss0Var, final float f, final float f2, nv0 nv0Var, final int i, final int i2) {
        int i3;
        int i4;
        nv0 nv0Var2;
        int i5;
        long j;
        nv0Var.b0(133396521);
        if ((i & 6) == 0) {
            i3 = (nv0Var.h(h53Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= nv0Var.c(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= nv0Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= nv0Var.f(r43Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= nv0Var.h(rs0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= nv0Var.h(ss0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= nv0Var.c(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= nv0Var.c(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= nv0Var.g(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (nv0Var.g(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (nv0Var.R(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            final long jA = r43Var.a(z, false);
            final long jA2 = r43Var.a(z, true);
            long j2 = z ? r43Var.e : r43Var.j;
            if (z) {
                i5 = i3;
                j = r43Var.c;
            } else {
                i5 = i3;
                j = r43Var.h;
            }
            bq1 bq1VarD = h53Var.r == t02.f ? j43.o(bq1Var, g53.a).d(j43.b) : j43.e(j43.c(bq1Var, 1.0f), g53.a);
            int i6 = i5 & 112;
            boolean zH = (i6 == 32) | nv0Var.h(h53Var);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (zH || objO == zjVar) {
                objO = new ir(16, h53Var);
                nv0Var.j0(objO);
            }
            bq1 bq1VarD2 = bq1VarD.d(vm1.C(yp1.a, (ss0) objO));
            boolean zH2 = (i6 == 32) | nv0Var.h(h53Var) | nv0Var.e(jA) | nv0Var.e(jA2) | nv0Var.e(j2) | nv0Var.e(j) | ((i5 & 29360128) == 8388608) | ((i5 & 234881024) == 67108864) | ((i5 & 458752) == 131072) | ((i5 & 3670016) == 1048576) | ((i5 & 1879048192) == 536870912) | ((i4 & 14) == 4);
            Object objO2 = nv0Var.O();
            if (zH2 || objO2 == zjVar) {
                nv0Var2 = nv0Var;
                final long j3 = j2;
                final long j4 = j;
                ns0 ns0Var = new ns0() { // from class: v43
                    /* JADX WARN: Removed duplicated region for block: B:100:0x0250  */
                    /* JADX WARN: Removed duplicated region for block: B:135:0x0327  */
                    @Override // defpackage.ns0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object h(java.lang.Object r30) {
                        /*
                            Method dump skipped, instruction units count: 956
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.v43.h(java.lang.Object):java.lang.Object");
                    }
                };
                nv0Var2.j0(ns0Var);
                objO2 = ns0Var;
            } else {
                nv0Var2 = nv0Var;
            }
            vr.a(0, (ns0) objO2, nv0Var2, bq1VarD2);
        } else {
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: w43
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f.c(h53Var, bq1Var, z, r43Var, rs0Var, ss0Var, f, f2, (nv0) obj, jo3.y(i | 1), jo3.y(i2));
                    return dm3.a;
                }
            };
        }
    }
}
