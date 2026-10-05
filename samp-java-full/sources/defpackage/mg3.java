package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class mg3 {
    public static final t20 a = new t20(new f62(19));

    public static final void a(gh3 gh3Var, rs0 rs0Var, nv0 nv0Var, int i) {
        nv0Var.b0(15327438);
        int i2 = (nv0Var.f(gh3Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(rs0Var) ? 32 : 16;
        }
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            t20 t20Var = a;
            vr.c(t20Var.a(((gh3) nv0Var.j(t20Var)).d(gh3Var)), rs0Var, nv0Var, (i2 & 112) | 8);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xc(i, 13, gh3Var, rs0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, bq1 bq1Var, long j, long j2, xq0 xq0Var, zb3 zb3Var, long j3, ld3 ld3Var, long j4, int i, boolean z, int i2, int i3, gh3 gh3Var, nv0 nv0Var, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        long j5;
        int i10;
        xq0 xq0Var2;
        int i11;
        zb3 zb3Var2;
        int i12;
        int i13;
        ld3 ld3Var2;
        int i14;
        int i15;
        long j6;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        final bq1 bq1Var2;
        final int i23;
        final int i24;
        final int i25;
        final gh3 gh3Var2;
        final xq0 xq0Var3;
        final zb3 zb3Var3;
        final long j7;
        final long j8;
        final ld3 ld3Var3;
        final long j9;
        final long j10;
        final boolean z2;
        xj2 xj2VarT;
        bq1 bq1Var3;
        long j11;
        long j12;
        int i26;
        boolean z3;
        int i27;
        gh3 gh3Var3;
        long jB;
        bq1 bq1Var4;
        nv0Var.b0(1809465675);
        if ((i4 & 6) == 0) {
            i7 = (nv0Var.f(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i28 = i6 & 2;
        if (i28 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i7 |= nv0Var.f(bq1Var) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= nv0Var.e(j) ? 256 : 128;
            }
            int i29 = i7 | 3072;
            i9 = i6 & 16;
            if (i9 == 0) {
                i29 = i7 | 27648;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i4 & 24576) == 0) {
                    i29 |= nv0Var.e(j5) ? 16384 : 8192;
                }
            }
            int i30 = i29 | 196608;
            i10 = i6 & 64;
            if (i10 == 0) {
                i30 = i29 | 1769472;
            } else {
                if ((1572864 & i4) == 0) {
                    xq0Var2 = xq0Var;
                    i30 |= nv0Var.f(xq0Var2) ? 1048576 : 524288;
                }
                i11 = i6 & 128;
                int i31 = 4194304;
                if (i11 != 0) {
                    i30 |= 12582912;
                    zb3Var2 = zb3Var;
                } else {
                    zb3Var2 = zb3Var;
                    if ((i4 & 12582912) == 0) {
                        i30 |= nv0Var.f(zb3Var2) ? 8388608 : 4194304;
                    }
                }
                i12 = i30 | 905969664;
                i13 = i6 & 1024;
                if (i13 != 0) {
                    i14 = i5 | 6;
                    ld3Var2 = ld3Var;
                } else {
                    ld3Var2 = ld3Var;
                    i14 = i5 | (nv0Var.f(ld3Var2) ? 4 : 2);
                }
                i15 = i6 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                    j6 = j4;
                } else {
                    j6 = j4;
                    if ((i5 & 48) == 0) {
                        i14 |= nv0Var.e(j6) ? 32 : 16;
                    }
                }
                int i32 = i14;
                i16 = i6 & 4096;
                if (i16 != 0) {
                    i32 |= 384;
                    i17 = i16;
                } else {
                    i17 = i16;
                    if ((i5 & 384) == 0) {
                        i32 |= nv0Var.d(i) ? 256 : 128;
                    }
                    i18 = i6 & 8192;
                    if (i18 == 0) {
                        i32 |= 3072;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if ((i5 & 3072) == 0) {
                            i32 |= nv0Var.g(z) ? 2048 : 1024;
                        }
                        i20 = i6 & 16384;
                        if (i20 == 0) {
                            i21 = i20;
                            if ((i5 & 24576) == 0) {
                                i32 |= nv0Var.d(i2) ? 16384 : 8192;
                            }
                            int i33 = i32 | 1769472;
                            if ((i6 & 131072) == 0 && nv0Var.f(gh3Var)) {
                                i31 = 8388608;
                            }
                            i22 = i33 | i31;
                            int i34 = 1;
                            if (nv0Var.R(i12 & 1, (i12 & 306783379) == 306783378 || (4793491 & i22) != 4793490)) {
                                nv0Var.U();
                                bq1Var2 = bq1Var;
                                i23 = i;
                                i24 = i2;
                                i25 = i3;
                                gh3Var2 = gh3Var;
                                xq0Var3 = xq0Var2;
                                zb3Var3 = zb3Var2;
                                j7 = j6;
                                j8 = j5;
                                ld3Var3 = ld3Var2;
                                j9 = j;
                                j10 = j3;
                                z2 = z;
                            } else {
                                nv0Var.W();
                                if ((i4 & 1) == 0 || nv0Var.A()) {
                                    bq1Var3 = i28 != 0 ? yp1.a : bq1Var;
                                    j11 = i8 != 0 ? wx.g : j;
                                    if (i9 != 0) {
                                        j5 = jh3.c;
                                    }
                                    if (i10 != 0) {
                                        xq0Var2 = null;
                                    }
                                    if (i11 != 0) {
                                        zb3Var2 = null;
                                    }
                                    j12 = jh3.c;
                                    if (i13 != 0) {
                                        ld3Var2 = null;
                                    }
                                    if (i15 != 0) {
                                        j6 = j12;
                                    }
                                    i26 = i17 != 0 ? 1 : i;
                                    z3 = i19 != 0 ? true : z;
                                    i27 = i21 != 0 ? Integer.MAX_VALUE : i2;
                                    if ((i6 & 131072) != 0) {
                                        gh3Var3 = (gh3) nv0Var.j(a);
                                        i22 &= -29360129;
                                    }
                                    nv0Var.q();
                                    nv0Var.a0(-565217106);
                                    if (j11 == 16) {
                                        bq1Var4 = bq1Var3;
                                        jB = j11;
                                    } else {
                                        nv0Var.a0(-565216333);
                                        jB = gh3Var3.b();
                                        if (jB != 16) {
                                            bq1Var4 = bq1Var3;
                                        } else {
                                            bq1Var4 = bq1Var3;
                                            jB = ((wx) nv0Var.j(t30.a)).a;
                                        }
                                        nv0Var.p(false);
                                    }
                                    nv0Var.p(false);
                                    int i35 = i22 << 6;
                                    bq1 bq1Var5 = bq1Var4;
                                    s51.b(str, bq1Var5, gh3.e(gh3Var3, jB, j5, xq0Var2, zb3Var2, j12, ld3Var2 != null ? ld3Var2.a : 0, j6, 16609104), i26, z3, i27, i34, nv0Var, (i12 & 126) | 3072 | (57344 & i35) | (458752 & i35) | (i35 & 3670016) | 12582912 | ((i12 << 18) & 1879048192), 256);
                                    bq1Var2 = bq1Var5;
                                    i24 = i27;
                                    gh3Var2 = gh3Var3;
                                    i25 = i34;
                                    i23 = i26;
                                    xq0Var3 = xq0Var2;
                                    ld3 ld3Var4 = ld3Var2;
                                    z2 = z3;
                                    zb3Var3 = zb3Var2;
                                    j7 = j6;
                                    j8 = j5;
                                    ld3Var3 = ld3Var4;
                                    j10 = j12;
                                    j9 = j11;
                                } else {
                                    nv0Var.U();
                                    if ((i6 & 131072) != 0) {
                                        i22 &= -29360129;
                                    }
                                    bq1Var3 = bq1Var;
                                    j11 = j;
                                    j12 = j3;
                                    i26 = i;
                                    z3 = z;
                                    i27 = i2;
                                    i34 = i3;
                                }
                                gh3Var3 = gh3Var;
                                nv0Var.q();
                                nv0Var.a0(-565217106);
                                if (j11 == 16) {
                                }
                                nv0Var.p(false);
                                int i352 = i22 << 6;
                                bq1 bq1Var52 = bq1Var4;
                                s51.b(str, bq1Var52, gh3.e(gh3Var3, jB, j5, xq0Var2, zb3Var2, j12, ld3Var2 != null ? ld3Var2.a : 0, j6, 16609104), i26, z3, i27, i34, nv0Var, (i12 & 126) | 3072 | (57344 & i352) | (458752 & i352) | (i352 & 3670016) | 12582912 | ((i12 << 18) & 1879048192), 256);
                                bq1Var2 = bq1Var52;
                                i24 = i27;
                                gh3Var2 = gh3Var3;
                                i25 = i34;
                                i23 = i26;
                                xq0Var3 = xq0Var2;
                                ld3 ld3Var42 = ld3Var2;
                                z2 = z3;
                                zb3Var3 = zb3Var2;
                                j7 = j6;
                                j8 = j5;
                                ld3Var3 = ld3Var42;
                                j10 = j12;
                                j9 = j11;
                            }
                            xj2VarT = nv0Var.t();
                            if (xj2VarT == null) {
                                xj2VarT.d = new rs0() { // from class: lg3
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int iY = jo3.y(i4 | 1);
                                        int iY2 = jo3.y(i5);
                                        mg3.b(str, bq1Var2, j9, j8, xq0Var3, zb3Var3, j10, ld3Var3, j7, i23, z2, i24, i25, gh3Var2, (nv0) obj, iY, iY2, i6);
                                        return dm3.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i32 |= 24576;
                        i21 = i20;
                        int i332 = i32 | 1769472;
                        if ((i6 & 131072) == 0) {
                            i31 = 8388608;
                        }
                        i22 = i332 | i31;
                        int i342 = 1;
                        if (nv0Var.R(i12 & 1, (i12 & 306783379) == 306783378 || (4793491 & i22) != 4793490)) {
                        }
                        xj2VarT = nv0Var.t();
                        if (xj2VarT == null) {
                        }
                    }
                    i20 = i6 & 16384;
                    if (i20 == 0) {
                    }
                    int i3322 = i32 | 1769472;
                    if ((i6 & 131072) == 0) {
                    }
                    i22 = i3322 | i31;
                    int i3422 = 1;
                    if (nv0Var.R(i12 & 1, (i12 & 306783379) == 306783378 || (4793491 & i22) != 4793490)) {
                    }
                    xj2VarT = nv0Var.t();
                    if (xj2VarT == null) {
                    }
                }
                i18 = i6 & 8192;
                if (i18 == 0) {
                }
                i20 = i6 & 16384;
                if (i20 == 0) {
                }
                int i33222 = i32 | 1769472;
                if ((i6 & 131072) == 0) {
                }
                i22 = i33222 | i31;
                int i34222 = 1;
                if (nv0Var.R(i12 & 1, (i12 & 306783379) == 306783378 || (4793491 & i22) != 4793490)) {
                }
                xj2VarT = nv0Var.t();
                if (xj2VarT == null) {
                }
            }
            xq0Var2 = xq0Var;
            i11 = i6 & 128;
            int i312 = 4194304;
            if (i11 != 0) {
            }
            i12 = i30 | 905969664;
            i13 = i6 & 1024;
            if (i13 != 0) {
            }
            i15 = i6 & 2048;
            if (i15 != 0) {
            }
            int i322 = i14;
            i16 = i6 & 4096;
            if (i16 != 0) {
            }
            i18 = i6 & 8192;
            if (i18 == 0) {
            }
            i20 = i6 & 16384;
            if (i20 == 0) {
            }
            int i332222 = i322 | 1769472;
            if ((i6 & 131072) == 0) {
            }
            i22 = i332222 | i312;
            int i342222 = 1;
            if (nv0Var.R(i12 & 1, (i12 & 306783379) == 306783378 || (4793491 & i22) != 4793490)) {
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        int i292 = i7 | 3072;
        i9 = i6 & 16;
        if (i9 == 0) {
        }
        int i302 = i292 | 196608;
        i10 = i6 & 64;
        if (i10 == 0) {
        }
        xq0Var2 = xq0Var;
        i11 = i6 & 128;
        int i3122 = 4194304;
        if (i11 != 0) {
        }
        i12 = i302 | 905969664;
        i13 = i6 & 1024;
        if (i13 != 0) {
        }
        i15 = i6 & 2048;
        if (i15 != 0) {
        }
        int i3222 = i14;
        i16 = i6 & 4096;
        if (i16 != 0) {
        }
        i18 = i6 & 8192;
        if (i18 == 0) {
        }
        i20 = i6 & 16384;
        if (i20 == 0) {
        }
        int i3322222 = i3222 | 1769472;
        if ((i6 & 131072) == 0) {
        }
        i22 = i3322222 | i3122;
        int i3422222 = 1;
        if (nv0Var.R(i12 & 1, (i12 & 306783379) == 306783378 || (4793491 & i22) != 4793490)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT == null) {
        }
    }

    public static final void c(final af afVar, bq1 bq1Var, long j, long j2, long j3, long j4, final int i, boolean z, final int i2, int i3, Map map, ns0 ns0Var, final gh3 gh3Var, nv0 nv0Var, final int i4, final int i5) {
        bq1 bq1Var2;
        int i6;
        final long j5;
        final long j6;
        final long j7;
        final boolean z2;
        final int i7;
        final Map map2;
        final ns0 ns0Var2;
        final bq1 bq1Var3;
        final long j8;
        bq1 bq1Var4;
        Map map3;
        long j9;
        ns0 ns0Var3;
        boolean z3;
        long j10;
        long j11;
        long j12;
        long j13;
        nv0Var.b0(292247417);
        int i8 = i4 | (nv0Var.f(afVar) ? 4 : 2);
        int i9 = i5 & 2;
        if (i9 != 0) {
            i6 = i8 | 48;
            bq1Var2 = bq1Var;
        } else {
            bq1Var2 = bq1Var;
            i6 = i8 | (nv0Var.f(bq1Var2) ? 32 : 16);
        }
        int i10 = i6 | 920350080;
        int i11 = 1;
        if (nv0Var.R(i10 & 1, ((306783379 & i10) == 306783378 && (((nv0Var.f(gh3Var) ? (char) 0 : (char) 0) | 28086) & 38347923) == 38347922) ? false : true)) {
            nv0Var.W();
            int i12 = i4 & 1;
            zj zjVar = c20.a;
            if (i12 == 0 || nv0Var.A()) {
                bq1Var4 = i9 != 0 ? yp1.a : bq1Var2;
                long j14 = wx.g;
                long j15 = jh3.c;
                Object objO = nv0Var.O();
                if (objO == zjVar) {
                    objO = new db3(12);
                    nv0Var.j0(objO);
                }
                map3 = oi0.f;
                j9 = j14;
                ns0Var3 = (ns0) objO;
                z3 = true;
                j10 = j15;
                j11 = j10;
                j12 = j11;
            } else {
                nv0Var.U();
                j9 = j;
                j10 = j2;
                j11 = j3;
                j12 = j4;
                z3 = z;
                map3 = map;
                ns0Var3 = ns0Var;
                bq1Var4 = bq1Var2;
                i11 = i3;
            }
            nv0Var.q();
            nv0Var.a0(1676919644);
            if (j9 != 16) {
                j13 = j9;
            } else {
                nv0Var.a0(1676920417);
                long jB = gh3Var.b();
                if (jB == 16) {
                    jB = ((wx) nv0Var.j(t30.a)).a;
                }
                nv0Var.p(false);
                j13 = jB;
            }
            nv0Var.p(false);
            int i13 = i11;
            long j16 = ((fy) nv0Var.j(hy.a)).a;
            boolean zE = nv0Var.e(j16);
            Object objO2 = nv0Var.O();
            if (zE || objO2 == zjVar) {
                objO2 = new ug3(new h83(j16, 0L, (xq0) null, (vq0) null, (wq0) null, (zb3) null, (String) null, 0L, (nl) null, (eg3) null, (qj1) null, 0L, ne3.c, (r13) null, 61438), null, null, null);
                nv0Var.j0(objO2);
            }
            ug3 ug3Var = (ug3) objO2;
            boolean zF = nv0Var.f(ug3Var) | ((i10 & 14) == 4);
            Object objO3 = nv0Var.O();
            if (zF || objO3 == zjVar) {
                objO3 = afVar.b(new aw2(14, ug3Var));
                nv0Var.j0(objO3);
            }
            s51.a((af) objO3, bq1Var4, gh3.e(gh3Var, j13, j10, null, null, j11, 0, j12, 16609104), ns0Var3, i, z3, i2, i13, map3, nv0Var, (i10 & 112) | 115043328, 6);
            ns0Var2 = ns0Var3;
            j5 = j10;
            bq1Var3 = bq1Var4;
            z2 = z3;
            i7 = i13;
            map2 = map3;
            j6 = j11;
            j7 = j12;
            j8 = j9;
        } else {
            nv0Var.U();
            j5 = j2;
            j6 = j3;
            j7 = j4;
            z2 = z;
            i7 = i3;
            map2 = map;
            ns0Var2 = ns0Var;
            bq1Var3 = bq1Var2;
            j8 = j;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(bq1Var3, j8, j5, j6, j7, i, z2, i2, i7, map2, ns0Var2, gh3Var, i4, i5) { // from class: kg3
                public final /* synthetic */ bq1 g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ int l;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ int n;
                public final /* synthetic */ int o;
                public final /* synthetic */ Map p;
                public final /* synthetic */ ns0 q;
                public final /* synthetic */ gh3 r;
                public final /* synthetic */ int s;

                {
                    this.s = i5;
                }

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1);
                    mg3.c(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (nv0) obj, iY, this.s);
                    return dm3.a;
                }
            };
        }
    }
}
