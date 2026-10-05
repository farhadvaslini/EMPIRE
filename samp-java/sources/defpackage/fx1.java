package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class fx1 {
    public static final wr1 a;

    static {
        wr1 wr1Var = ay1.a;
        a = new wr1();
    }

    public static final void a(aq1 aq1Var, int i, int i2) {
        if (!(aq1Var instanceof ja0)) {
            b(aq1Var, i & aq1Var.h, i2);
            return;
        }
        ja0 ja0Var = (ja0) aq1Var;
        int i3 = ja0Var.t;
        b(aq1Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (aq1 aq1Var2 = ja0Var.u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
            a(aq1Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(aq1 aq1Var, int i, int i2) {
        if (i2 != 0 || aq1Var.e1()) {
            if ((i & 2) != 0 && (aq1Var instanceof kb1)) {
                lq.J((kb1) aq1Var);
                if (i2 == 2) {
                    vr.U(aq1Var, 2).J1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                vr.X(aq1Var).E();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                vr.X(aq1Var).X(false);
            }
            if ((i & 256) != 0 && (aq1Var instanceof dw0)) {
                if (i2 == 1) {
                    tb1 tb1VarX = vr.X(aq1Var);
                    tb1VarX.d0(tb1VarX.V + 1);
                } else if (i2 == 2) {
                    vr.X(aq1Var).d0(r0.V - 1);
                }
                if (i2 != 2) {
                    tb1 tb1VarX2 = vr.X(aq1Var);
                    if (tb1VarX2.V != 0 && !tb1VarX2.p() && !tb1VarX2.q() && !tb1VarX2.U) {
                        h7 h7Var = (h7) wb1.a(tb1VarX2);
                        a31 a31Var = h7Var.V.e;
                        a31Var.getClass();
                        if (tb1VarX2.V > 0) {
                            ((qs1) a31Var.g).b(tb1VarX2);
                            tb1VarX2.U = true;
                        }
                        h7Var.H(null);
                    }
                }
            }
            if ((i & 4) != 0 && (aq1Var instanceof of0)) {
                vr.J((of0) aq1Var);
            }
            if ((i & 8) != 0 && (aq1Var instanceof tu2)) {
                vr.X(aq1Var).x = true;
            }
            if ((i & 64) != 0 && (aq1Var instanceof f42)) {
                xb1 xb1Var = vr.X((f42) aq1Var).M;
                xb1Var.p.v = true;
                gl1 gl1Var = xb1Var.q;
                if (gl1Var != null) {
                    gl1Var.B = true;
                }
            }
            if ((i & 2048) != 0 && (aq1Var instanceof hp0)) {
                hp0 hp0Var = (hp0) aq1Var;
                dr.b = null;
                hp0Var.s0(dr.a);
                if (dr.b != null) {
                    aq1 aq1Var2 = (aq1) hp0Var;
                    if (!aq1Var2.f.s) {
                        m21.c("visitChildren called on an unattached node");
                    }
                    qs1 qs1Var = new qs1(new aq1[16]);
                    aq1 aq1Var3 = aq1Var2.f;
                    aq1 aq1Var4 = aq1Var3.k;
                    if (aq1Var4 == null) {
                        vr.h(qs1Var, aq1Var3);
                    } else {
                        qs1Var.b(aq1Var4);
                    }
                    while (true) {
                        int i3 = qs1Var.h;
                        if (i3 == 0) {
                            break;
                        }
                        aq1 aq1VarJ = (aq1) qs1Var.k(i3 - 1);
                        if ((aq1VarJ.i & 1024) == 0) {
                            vr.h(qs1Var, aq1VarJ);
                        } else {
                            while (true) {
                                if (aq1VarJ == null) {
                                    break;
                                }
                                if ((aq1VarJ.h & 1024) != 0) {
                                    qs1 qs1Var2 = null;
                                    while (aq1VarJ != null) {
                                        if (aq1VarJ instanceof rp0) {
                                            rp0 rp0Var = (rp0) aq1VarJ;
                                            zo0 zo0Var = ((ep0) ((h7) vr.Y(rp0Var)).getFocusOwner()).d;
                                            if (zo0Var.c.a(rp0Var)) {
                                                zo0Var.a();
                                            }
                                        } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                            int i4 = 0;
                                            for (aq1 aq1Var5 = ((ja0) aq1VarJ).u; aq1Var5 != null; aq1Var5 = aq1Var5.k) {
                                                if ((aq1Var5.h & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        aq1VarJ = aq1Var5;
                                                    } else {
                                                        if (qs1Var2 == null) {
                                                            qs1Var2 = new qs1(new aq1[16]);
                                                        }
                                                        if (aq1VarJ != null) {
                                                            qs1Var2.b(aq1VarJ);
                                                            aq1VarJ = null;
                                                        }
                                                        qs1Var2.b(aq1Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        aq1VarJ = vr.j(qs1Var2);
                                    }
                                } else {
                                    aq1VarJ = aq1VarJ.k;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (aq1Var instanceof so0)) {
                so0 so0Var = (so0) aq1Var;
                zo0 zo0Var2 = ((ep0) ((h7) vr.Y(so0Var)).getFocusOwner()).d;
                if (zo0Var2.d.a(so0Var)) {
                    zo0Var2.a();
                }
            }
            if ((i & 2097152) != 0 && (aq1Var instanceof y11) && i2 == 2) {
                ((y11) aq1Var).V();
            }
        }
    }

    public static final void c(aq1 aq1Var) {
        if (!aq1Var.s) {
            m21.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(aq1Var, -1, 0);
    }

    public static final int d(zp1 zp1Var) {
        int i = zp1Var instanceof ib1 ? 3 : 1;
        if (zp1Var instanceof nf0) {
            i |= 4;
        }
        if (zp1Var instanceof ru2) {
            i |= 8;
        }
        if (zp1Var instanceof mb2) {
            i |= 16;
        }
        if (zp1Var instanceof eq1) {
            i |= 32;
        }
        if (zp1Var instanceof e42) {
            i |= 64;
        }
        return zp1Var instanceof no ? 524288 | i : i;
    }

    public static final int e(aq1 aq1Var) {
        int i = aq1Var.h;
        if (i != 0) {
            return i;
        }
        Class<?> cls = aq1Var.getClass();
        wr1 wr1Var = a;
        int iD = wr1Var.d(cls);
        if (iD >= 0) {
            return wr1Var.c[iD];
        }
        int i2 = aq1Var instanceof kb1 ? 3 : 1;
        if (aq1Var instanceof of0) {
            i2 |= 4;
        }
        if (aq1Var instanceof tu2) {
            i2 |= 8;
        }
        if (aq1Var instanceof jb2) {
            i2 |= 16;
        }
        if (aq1Var instanceof dq1) {
            i2 |= 32;
        }
        if (aq1Var instanceof f42) {
            i2 |= 64;
        }
        if (aq1Var instanceof ya1) {
            i2 |= 4194432;
        } else if (aq1Var instanceof gn1) {
            i2 |= 128;
        }
        if (aq1Var instanceof dw0) {
            i2 |= 256;
        }
        if (aq1Var instanceof i23) {
            i2 |= 512;
        }
        if (aq1Var instanceof rp0) {
            i2 |= 1024;
        }
        if (aq1Var instanceof hp0) {
            i2 |= 2048;
        }
        if (aq1Var instanceof so0) {
            i2 |= 4096;
        }
        if (aq1Var instanceof i71) {
            i2 |= 8192;
        }
        if (aq1Var instanceof a7) {
            i2 |= 16384;
        }
        if (aq1Var instanceof m20) {
            i2 |= 32768;
        }
        if (aq1Var instanceof nk3) {
            i2 |= 262144;
        }
        if (aq1Var instanceof no) {
            i2 |= 524288;
        }
        if (aq1Var instanceof rp0) {
            i2 |= 1048576;
        }
        if (aq1Var instanceof y11) {
            i2 |= 2097152;
        }
        if (aq1Var instanceof sc1) {
            i2 |= 8388608;
        }
        wr1Var.g(i2, cls);
        return i2;
    }

    public static final int f(aq1 aq1Var) {
        if (!(aq1Var instanceof ja0)) {
            return e(aq1Var);
        }
        ja0 ja0Var = (ja0) aq1Var;
        int iF = ja0Var.t;
        for (aq1 aq1Var2 = ja0Var.u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
            iF |= f(aq1Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
