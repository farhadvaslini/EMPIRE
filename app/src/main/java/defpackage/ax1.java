package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final void f(int i, as1 as1Var, as1 as1Var2, aq1 aq1Var, boolean z) {
        int i2;
        as1 as1Var3;
        as1 as1Var4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        yw1 yw1Var = this.j;
        if (yw1Var == null) {
            i2 = i;
            as1Var3 = as1Var;
            as1Var4 = as1Var2;
            yw1Var = new yw1(this, aq1Var, i2, as1Var3, as1Var4, z);
            this.j = yw1Var;
        } else {
            i2 = i;
            as1Var3 = as1Var;
            as1Var4 = as1Var2;
            yw1Var.c = aq1Var;
            yw1Var.a = i2;
            yw1Var.d = as1Var3;
            yw1Var.e = as1Var4;
            yw1Var.b = z;
        }
        ax1 ax1Var = (ax1) yw1Var.f;
        this.j = null;
        int i9 = as1Var3.b - i2;
        int i10 = as1Var4.b - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        q41 q41Var = new q41(i11 * 3);
        q41 q41Var2 = new q41(i11 * 4);
        int i12 = 0;
        q41Var2.e(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = q41Var2.b;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = q41Var2.a;
            int i15 = i12;
            int i16 = i14 - 1;
            q41Var2.b = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            q41Var2.b = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            q41Var2.b = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            q41Var2.b = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 < 1 || i26 < 1) {
                iArr = iArr4;
                iArr2 = iArr5;
            } else {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                                if (iArr7[i36 + 1 + i29] > iArr7[(i4 - 1) + i29]) {
                                }
                                int i37 = ((i6 - i23) + i19) - i4;
                                int i38 = i37 - ((i31 != 0 ? 1 : i15) & (i6 == i5 ? 1 : i15));
                                int i39 = i5;
                                i7 = i37;
                                while (i6 < i21 && i7 < i17 && yw1Var.c(i6, i7)) {
                                    i6++;
                                    i7++;
                                }
                                iArr7[i29 + i4] = i6;
                                if (i35 != 0) {
                                    int i40 = i7;
                                    int i41 = i32 - i4;
                                    i8 = i24;
                                    if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                        iArr2[i15] = i39;
                                        iArr2[1] = i38;
                                        iArr2[c4] = i6;
                                        iArr2[3] = i40;
                                        iArr2[4] = i15;
                                        c = 1;
                                        break;
                                    }
                                } else {
                                    i8 = i24;
                                }
                                i36 = i4 + 2;
                                iArr5 = iArr2;
                                i24 = i8;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i372 = ((i6 - i23) + i19) - i4;
                            int i382 = i372 - ((i31 != 0 ? 1 : i15) & (i6 == i5 ? 1 : i15));
                            int i392 = i5;
                            i7 = i372;
                            while (i6 < i21) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 != 0) {
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i3722 = ((i6 - i23) + i19) - i4;
                        int i3822 = i3722 - ((i31 != 0 ? 1 : i15) & (i6 == i5 ? 1 : i15));
                        int i3922 = i5;
                        i7 = i3722;
                        while (i6 < i21) {
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 != 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int iMin = iArr2[c4] - i42;
                        if (i44 != iMin) {
                            iMin = Math.min(iMin, i44);
                            int i45 = iArr2[4];
                            int i46 = i45 != 0 ? 1 : i15;
                            int i47 = iArr2[3];
                            c2 = 1;
                            int i48 = iArr2[1];
                            int i49 = i47 - i48;
                            int i50 = iArr2[c4];
                            int i51 = iArr2[i15];
                            int i52 = i42 + (((i49 > i50 - i51 ? 1 : i15) | i46) ^ 1);
                            i43 += (((i47 - i48 > i50 - i51 ? 1 : i15) ^ 1) | (i45 != 0 ? 1 : i15)) ^ 1;
                            i42 = i52;
                        } else {
                            c2 = 1;
                        }
                        q41Var.d(i42, i43, iMin);
                    } else {
                        c2 = c;
                    }
                    q41Var2.e(i23, iArr2[i15], i19, iArr2[c2]);
                    q41Var2.e(iArr2[c4], i21, iArr2[3], i17);
                }
                iArr = iArr4;
                iArr2 = iArr5;
            }
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i53 = i12;
        int i54 = q41Var.b;
        if (i54 % 3 != 0) {
            m21.c("Array size not a multiple of 3");
        }
        if (i54 > 3) {
            i3 = i53;
            q41Var.f(i3, i54 - 3);
        } else {
            i3 = i53;
        }
        q41Var.d(i9, i10, i3);
        int i55 = i3;
        int i56 = i55;
        int i57 = i56;
        while (i55 < q41Var.b) {
            int[] iArr8 = q41Var.a;
            int i58 = iArr8[i55];
            int i59 = iArr8[i55 + 2];
            int i60 = i58 - i59;
            int i61 = iArr8[i55 + 1] - i59;
            i55 += 3;
            while (i56 < i60) {
                aq1 aq1Var2 = ((aq1) yw1Var.c).k;
                aq1Var2.getClass();
                if ((aq1Var2.h & 2) != 0) {
                    ex1 ex1Var = aq1Var2.m;
                    ex1Var.getClass();
                    ex1 ex1Var2 = ex1Var.D;
                    ex1 ex1Var3 = ex1Var.C;
                    ex1Var3.getClass();
                    if (ex1Var2 != null) {
                        ex1Var2.C = ex1Var3;
                    }
                    ex1Var3.D = ex1Var2;
                    a(ax1Var, (aq1) yw1Var.c, ex1Var3);
                }
                yw1Var.c = c(aq1Var2);
                i56++;
            }
            while (i57 < i61) {
                aq1 aq1VarB = b((zp1) ((as1) yw1Var.e).g(yw1Var.a + i57), (aq1) yw1Var.c);
                yw1Var.c = aq1VarB;
                if (yw1Var.b) {
                    aq1 aq1Var3 = aq1VarB.k;
                    aq1Var3.getClass();
                    ex1 ex1Var4 = aq1Var3.m;
                    ex1Var4.getClass();
                    kb1 kb1VarN = vr.n((aq1) yw1Var.c);
                    if (kb1VarN != null) {
                        nb1 nb1Var = new nb1(ax1Var.a, kb1VarN);
                        ((aq1) yw1Var.c).o1(nb1Var);
                        a(ax1Var, (aq1) yw1Var.c, nb1Var);
                        nb1Var.D = ex1Var4.D;
                        nb1Var.C = ex1Var4;
                        ex1Var4.D = nb1Var;
                    } else {
                        ((aq1) yw1Var.c).o1(ex1Var4);
                    }
                    ((aq1) yw1Var.c).f1();
                    ((aq1) yw1Var.c).l1();
                    aq1 aq1Var4 = (aq1) yw1Var.c;
                    wr1 wr1Var = fx1.a;
                    if (!aq1Var4.s) {
                        m21.c("autoInvalidateInsertedNode called on unattached node");
                    }
                    fx1.a(aq1Var4, -1, 1);
                } else {
                    aq1VarB.n = true;
                }
                i57++;
            }
            while (true) {
                int i62 = i59 - 1;
                if (i59 > 0) {
                    aq1 aq1Var5 = ((aq1) yw1Var.c).k;
                    aq1Var5.getClass();
                    yw1Var.c = aq1Var5;
                    zp1 zp1Var = (zp1) ((as1) yw1Var.d).g(yw1Var.a + i56);
                    zp1 zp1Var2 = (zp1) ((as1) yw1Var.e).g(yw1Var.a + i57);
                    if (!s51.n(zp1Var, zp1Var2)) {
                        h(zp1Var, zp1Var2, (aq1) yw1Var.c);
                    }
                    i56++;
                    i57++;
                    i59 = i62;
                }
            }
        }
        this.j = yw1Var;
        int i63 = i3;
        for (aq1 aq1Var6 = this.e.j; aq1Var6 != null && aq1Var6 != this.b; aq1Var6 = aq1Var6.j) {
            i63 |= aq1Var6.h;
            aq1Var6.i = i63;
        }
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
