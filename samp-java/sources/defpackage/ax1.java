package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ax1 {
    public final tb1 a;
    public final zw1 b;
    public final s21 c;
    public ex1 d;
    public final rc3 e;
    public aq1 f;
    public as1 g;
    public as1 h;
    public as1 i;
    public yw1 j;

    public ax1(tb1 tb1Var) {
        this.a = tb1Var;
        zw1 zw1Var = new zw1();
        zw1Var.i = -1;
        this.b = zw1Var;
        s21 s21Var = new s21(tb1Var);
        this.c = s21Var;
        this.d = s21Var;
        rc3 rc3Var = s21Var.i0;
        this.e = rc3Var;
        this.f = rc3Var;
        this.g = new as1();
    }

    public static final void a(ax1 ax1Var, aq1 aq1Var, ex1 ex1Var) {
        for (aq1 aq1Var2 = aq1Var.j; aq1Var2 != null; aq1Var2 = aq1Var2.j) {
            if (aq1Var2 == ax1Var.b) {
                tb1 tb1VarU = ax1Var.a.u();
                ex1Var.D = tb1VarU != null ? tb1VarU.L.c : null;
                ax1Var.d = ex1Var;
                return;
            } else {
                if ((aq1Var2.h & 2) != 0) {
                    return;
                }
                aq1Var2.o1(ex1Var);
            }
        }
    }

    public static aq1 b(zp1 zp1Var, aq1 aq1Var) {
        aq1 aq1VarF;
        if (zp1Var instanceof gq1) {
            aq1VarF = ((gq1) zp1Var).f();
            aq1VarF.h = fx1.f(aq1VarF);
        } else {
            kl klVar = new kl();
            klVar.h = fx1.d(zp1Var);
            klVar.t = zp1Var;
            klVar.v = new HashSet();
            aq1VarF = klVar;
        }
        if (aq1VarF.s) {
            m21.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        aq1VarF.n = true;
        aq1 aq1Var2 = aq1Var.k;
        if (aq1Var2 != null) {
            aq1Var2.j = aq1VarF;
            aq1VarF.k = aq1Var2;
        }
        aq1Var.k = aq1VarF;
        aq1VarF.j = aq1Var;
        return aq1VarF;
    }

    public static aq1 c(aq1 aq1Var) {
        boolean z = aq1Var.s;
        if (z) {
            wr1 wr1Var = fx1.a;
            if (!z) {
                m21.c("autoInvalidateRemovedNode called on unattached node");
            }
            fx1.a(aq1Var, -1, 2);
            aq1Var.m1();
            aq1Var.g1();
        }
        aq1 aq1Var2 = aq1Var.k;
        aq1 aq1Var3 = aq1Var.j;
        if (aq1Var2 != null) {
            aq1Var2.j = aq1Var3;
            aq1Var.k = null;
        }
        if (aq1Var3 != null) {
            aq1Var3.k = aq1Var2;
            aq1Var.j = null;
        }
        aq1Var3.getClass();
        return aq1Var3;
    }

    public static void h(zp1 zp1Var, zp1 zp1Var2, aq1 aq1Var) {
        if ((zp1Var instanceof gq1) && (zp1Var2 instanceof gq1)) {
            aq1Var.getClass();
            ((gq1) zp1Var2).g(aq1Var);
            if (aq1Var.s) {
                fx1.c(aq1Var);
                return;
            } else {
                aq1Var.o = true;
                return;
            }
        }
        if (!(aq1Var instanceof kl)) {
            m21.c("Unknown Modifier.Node type");
            return;
        }
        kl klVar = (kl) aq1Var;
        if (klVar.s) {
            klVar.q1();
        }
        klVar.t = zp1Var2;
        klVar.h = fx1.d(zp1Var2);
        if (klVar.s) {
            klVar.p1(false);
        }
        if (aq1Var.s) {
            fx1.c(aq1Var);
        } else {
            aq1Var.o = true;
        }
    }

    public final boolean d(int i) {
        return (this.f.i & i) != 0;
    }

    public final void e() {
        for (aq1 aq1Var = this.f; aq1Var != null; aq1Var = aq1Var.k) {
            aq1Var.l1();
            if (aq1Var.n) {
                wr1 wr1Var = fx1.a;
                if (!aq1Var.s) {
                    m21.c("autoInvalidateInsertedNode called on unattached node");
                }
                fx1.a(aq1Var, -1, 1);
            }
            if (aq1Var.o) {
                fx1.c(aq1Var);
            }
            aq1Var.n = false;
            aq1Var.o = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0267, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026d, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014d, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0153, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0155, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0157, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0159, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015a, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015c, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015e, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0160, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0171, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0173, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017e, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0185, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018b, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018d, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0190, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0192, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0194, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0197, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0199, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a3, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a5, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
    
        if (r0.c(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b5, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bc, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c4, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c6, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c8, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ca, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d0, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d2, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r32, defpackage.as1 r33, defpackage.as1 r34, defpackage.aq1 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax1.f(int, as1, as1, aq1, boolean):void");
    }

    public final void g() {
        tb1 tb1Var;
        nb1 nb1Var;
        p12 p12Var;
        aq1 aq1Var = this.e.j;
        ex1 ex1Var = this.c;
        while (true) {
            tb1Var = this.a;
            if (aq1Var == null) {
                break;
            }
            kb1 kb1VarN = vr.n(aq1Var);
            if (kb1VarN != null) {
                ex1 ex1Var2 = aq1Var.m;
                if (ex1Var2 != null) {
                    nb1Var = (nb1) ex1Var2;
                    kb1 kb1Var = nb1Var.i0;
                    nb1Var.Z1(kb1VarN);
                    if (kb1Var != aq1Var && (p12Var = nb1Var.a0) != null) {
                        ((tw0) p12Var).c();
                    }
                } else {
                    nb1Var = new nb1(tb1Var, kb1VarN);
                    aq1Var.o1(nb1Var);
                }
                ex1Var.D = nb1Var;
                nb1Var.C = ex1Var;
                ex1Var = nb1Var;
            } else {
                aq1Var.o1(ex1Var);
            }
            aq1Var = aq1Var.j;
        }
        tb1 tb1VarU = tb1Var.u();
        ex1Var.D = tb1VarU != null ? tb1VarU.L.c : null;
        this.d = ex1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        aq1 aq1Var = this.f;
        rc3 rc3Var = this.e;
        if (aq1Var == rc3Var) {
            sb.append("]");
        } else {
            while (true) {
                if (aq1Var == null || aq1Var == rc3Var) {
                    break;
                }
                sb.append(String.valueOf(aq1Var));
                if (aq1Var.k == rc3Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                aq1Var = aq1Var.k;
            }
        }
        return sb.toString();
    }
}
