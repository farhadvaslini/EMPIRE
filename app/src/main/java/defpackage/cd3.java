package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class cd3 {
    public static final af0 a = new af0(3, null, 2);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(defpackage.rb3 r5, boolean r6, defpackage.ab2 r7, defpackage.ml r8) {
        /*
            boolean r0 = r8 instanceof defpackage.tc3
            if (r0 == 0) goto L13
            r0 = r8
            tc3 r0 = (defpackage.tc3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            tc3 r0 = new tc3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.l
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.k
            ab2 r6 = r0.j
            rb3 r7 = r0.i
            defpackage.y02.Q(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r5)
            r5 = 0
            return r5
        L36:
            defpackage.y02.Q(r8)
        L39:
            r0.i = r5
            r0.j = r7
            r0.k = r6
            r0.m = r2
            java.lang.Object r8 = r5.c(r7, r0)
            y50 r1 = defpackage.y50.f
            if (r8 != r1) goto L4a
            return r1
        L4a:
            za2 r8 = (defpackage.za2) r8
            boolean r1 = e(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd3.a(rb3, boolean, ab2, ml):java.lang.Object");
    }

    public static /* synthetic */ Object b(rb3 rb3Var, ml mlVar, int i) {
        return a(rb3Var, (i & 1) != 0, (i & 2) != 0 ? ab2.g : ab2.f, mlVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(rb3 rb3Var, q40 q40Var) {
        uc3 uc3Var;
        y50 y50Var;
        int size;
        int i;
        int i2;
        int size2;
        if (q40Var instanceof uc3) {
            uc3Var = (uc3) q40Var;
            int i3 = uc3Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uc3Var.k = i3 - Integer.MIN_VALUE;
            } else {
                uc3Var = new uc3(q40Var);
            }
        }
        Object objC = uc3Var.j;
        int i4 = uc3Var.k;
        if (i4 == 0) {
            y02.Q(objC);
            uc3Var.i = rb3Var;
            uc3Var.k = 1;
            objC = rb3Var.c(ab2.g, uc3Var);
            y50Var = y50.f;
            if (objC == y50Var) {
            }
            za2 za2Var = (za2) objC;
            List list = za2Var.a;
            size = list.size();
            i = 0;
            while (i2 < size) {
            }
            List list2 = za2Var.a;
            size2 = list2.size();
            while (i < size2) {
            }
            return dm3.a;
        }
        if (i4 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rb3Var = uc3Var.i;
        y02.Q(objC);
        za2 za2Var2 = (za2) objC;
        List list3 = za2Var2.a;
        size = list3.size();
        i = 0;
        for (i2 = 0; i2 < size; i2++) {
            ((gb2) list3.get(i2)).a();
        }
        List list22 = za2Var2.a;
        size2 = list22.size();
        while (i < size2) {
            if (((gb2) list22.get(i)).d) {
                uc3Var.i = rb3Var;
                uc3Var.k = 1;
                objC = rb3Var.c(ab2.g, uc3Var);
                y50Var = y50.f;
                if (objC == y50Var) {
                    return y50Var;
                }
                za2 za2Var22 = (za2) objC;
                List list32 = za2Var22.a;
                size = list32.size();
                i = 0;
                while (i2 < size) {
                }
                List list222 = za2Var22.a;
                size2 = list222.size();
                while (i < size2) {
                }
            } else {
                i++;
            }
        }
        return dm3.a;
    }

    public static Object d(kb2 kb2Var, f53 f53Var, ns0 ns0Var, p40 p40Var, int i) {
        ss0 ss0Var = f53Var;
        if ((i & 4) != 0) {
            ss0Var = a;
        }
        Object objW = ur.w(new n9(kb2Var, ss0Var, ns0Var, (p40) null), p40Var);
        return objW == y50.f ? objW : dm3.a;
    }

    public static boolean e(za2 za2Var, boolean z) {
        List list = za2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gb2 gb2Var = (gb2) list.get(i);
            if (!(z ? w22.k(gb2Var) : w22.l(gb2Var))) {
                return false;
            }
        }
        return true;
    }

    public static w83 f(x50 x50Var, j61 j61Var, rs0 rs0Var) {
        return cl3.t(x50Var, null, new ri2(j61Var, rs0Var, (p40) null, 9), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0387  */
    /* JADX WARN: Type inference failed for: r12v17, types: [gb2] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r13v10, types: [p40] */
    /* JADX WARN: Type inference failed for: r13v13, types: [p40] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r26v1, types: [p40] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [o50, p40] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(rb3 rb3Var, x50 x50Var, xc2 xc2Var, ss0 ss0Var, ns0 ns0Var, ml mlVar) {
        yc3 yc3Var;
        x50 x50Var2;
        xc2 xc2Var2;
        ?? r5;
        ss0 ss0Var2;
        ns0 ns0Var2;
        int i;
        Object objB;
        ns0 ns0Var3;
        ns0 ns0Var4;
        xc2 xc2Var3;
        gb2 gb2Var;
        rb3 rb3Var2;
        j61 j61Var;
        x50 x50Var3;
        ns0 ns0Var5;
        xc2 xc2Var4;
        ss0 ss0Var3;
        ns0 ns0Var6;
        x50 x50Var4;
        ns0 ns0Var7;
        ns0 ns0Var8;
        gb2 gb2Var2;
        xc2 xc2Var5;
        sk1 sk1Var;
        dm3 dm3Var;
        w83 w83VarF;
        ns0 ns0Var9;
        ss0 ss0Var4;
        rb3 rb3Var3;
        ns0 ns0Var10;
        ns0 ns0Var11;
        gb2 gb2Var3;
        j61 j61Var2;
        tk1 tk1Var;
        p40 p40Var;
        xc2 xc2Var6;
        x50 x50Var5;
        gb2 gb2Var4;
        ns0 ns0Var12;
        xc2 xc2Var7;
        gb2 gb2Var5;
        j61 j61Var3;
        gb2 gb2Var6;
        rb3 rb3Var4;
        gb2 gb2Var7;
        xc2 xc2Var8;
        x50 x50Var6;
        ns0 ns0Var13;
        ns0 ns0Var14;
        ns0 ns0Var15;
        j61 j61Var4;
        gb2 gb2Var8;
        x50 x50Var7;
        ns0 ns0Var16;
        ns0 ns0Var17;
        ns0 ns0Var18;
        ?? r13;
        ?? r12;
        ns0 ns0Var19;
        tk1 tk1Var2;
        Object obj;
        j61 j61Var5;
        x50 x50Var8;
        ?? r132;
        rb3 rb3Var5 = rb3Var;
        if (mlVar instanceof yc3) {
            yc3Var = (yc3) mlVar;
            int i2 = yc3Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yc3Var.s = i2 - Integer.MIN_VALUE;
            } else {
                yc3Var = new yc3(mlVar);
            }
        }
        Object objI = yc3Var.r;
        int i3 = yc3Var.s;
        ab2 ab2Var = ab2.g;
        sk1 sk1Var2 = sk1.a;
        af0 af0Var = a;
        dm3 dm3Var2 = dm3.a;
        y50 y50Var = y50.f;
        switch (i3) {
            case 0:
                y02.Q(objI);
                yc3Var.i = rb3Var5;
                x50Var2 = x50Var;
                yc3Var.j = x50Var2;
                xc2Var2 = xc2Var;
                yc3Var.k = xc2Var2;
                r5 = 0;
                yc3Var.l = null;
                yc3Var.m = null;
                ss0Var2 = ss0Var;
                yc3Var.n = ss0Var2;
                ns0Var2 = ns0Var;
                yc3Var.o = ns0Var2;
                i = 1;
                yc3Var.s = 1;
                objB = b(rb3Var5, yc3Var, 3);
                if (objB != y50Var) {
                    ns0Var3 = null;
                    ns0Var4 = null;
                    gb2 gb2Var9 = (gb2) objB;
                    gb2Var9.a();
                    w83 w83VarT = cl3.t(x50Var2, r5, new wc3(xc2Var2, r5, i), i);
                    if (ss0Var2 == af0Var) {
                        xc2 xc2Var9 = xc2Var2;
                        xc2Var3 = xc2Var9;
                        gb2Var = gb2Var9;
                        f(x50Var2, w83VarT, new zc3(ss0Var2, xc2Var9, gb2Var9, r5, 0));
                    } else {
                        xc2Var3 = xc2Var2;
                        gb2Var = gb2Var9;
                    }
                    if (ns0Var3 != null) {
                        yc3Var.i = rb3Var5;
                        yc3Var.j = x50Var2;
                        yc3Var.k = xc2Var3;
                        yc3Var.l = ns0Var4;
                        yc3Var.m = ns0Var3;
                        yc3Var.n = ss0Var2;
                        yc3Var.o = ns0Var2;
                        yc3Var.p = w83VarT;
                        yc3Var.s = 2;
                        Object objI2 = i(rb3Var5, ab2Var, yc3Var);
                        if (objI2 != y50Var) {
                            rb3Var2 = rb3Var5;
                            j61Var = w83VarT;
                            ss0Var3 = ss0Var2;
                            ns0Var6 = ns0Var3;
                            x50Var4 = x50Var2;
                            objI = objI2;
                            ns0Var7 = ns0Var2;
                            ns0Var8 = ns0Var4;
                            gb2Var2 = (gb2) objI;
                            x50 x50Var9 = x50Var4;
                            ns0Var3 = ns0Var6;
                            xc2Var5 = xc2Var3;
                            x50Var3 = x50Var9;
                            if (gb2Var2 == null) {
                                sk1Var = sk1Var2;
                                dm3Var = dm3Var2;
                                w83VarF = f(x50Var3, j61Var, new vc3(xc2Var5, null, 3));
                            } else {
                                sk1Var = sk1Var2;
                                dm3Var = dm3Var2;
                                gb2Var2.a();
                                w83VarF = f(x50Var3, j61Var, new vc3(xc2Var5, null, 4));
                            }
                            if (gb2Var2 != null) {
                                if (ns0Var8 != null) {
                                    yc3Var.i = rb3Var2;
                                    yc3Var.j = x50Var3;
                                    yc3Var.k = xc2Var5;
                                    yc3Var.l = ns0Var8;
                                    yc3Var.m = ns0Var3;
                                    yc3Var.n = ss0Var3;
                                    yc3Var.o = ns0Var7;
                                    yc3Var.p = gb2Var2;
                                    yc3Var.q = w83VarF;
                                    yc3Var.s = 5;
                                    w83 w83Var = w83VarF;
                                    Object objI3 = rb3Var2.I(rb3Var2.F().b(), new hu2(gb2Var2, null), yc3Var);
                                    if (objI3 != y50Var) {
                                        ns0Var9 = ns0Var8;
                                        ss0Var4 = ss0Var3;
                                        rb3Var3 = rb3Var2;
                                        ns0Var10 = ns0Var3;
                                        ns0Var11 = ns0Var7;
                                        gb2Var3 = gb2Var2;
                                        objI = objI3;
                                        j61Var2 = w83Var;
                                        gb2Var4 = (gb2) objI;
                                        if (gb2Var4 == null) {
                                            p40 p40Var2 = null;
                                            w83 w83VarT2 = cl3.t(x50Var3, null, new hd1(j61Var2, xc2Var5, p40Var2, 27), 1);
                                            if (ss0Var4 != af0Var) {
                                                xc2 xc2Var10 = xc2Var5;
                                                zc3 zc3Var = new zc3(ss0Var4, xc2Var10, gb2Var4, p40Var2, 1);
                                                xc2Var7 = xc2Var10;
                                                gb2Var5 = gb2Var4;
                                                ns0Var12 = null;
                                                f(x50Var3, w83VarT2, zc3Var);
                                            } else {
                                                ns0Var12 = null;
                                                xc2Var7 = xc2Var5;
                                                gb2Var5 = gb2Var4;
                                            }
                                            if (ns0Var10 == null) {
                                                yc3Var.i = x50Var3;
                                                yc3Var.j = xc2Var7;
                                                yc3Var.k = ns0Var9;
                                                yc3Var.l = ns0Var11;
                                                yc3Var.m = w83VarT2;
                                                yc3Var.n = gb2Var3;
                                                yc3Var.o = ns0Var12;
                                                yc3Var.p = ns0Var12;
                                                yc3Var.q = ns0Var12;
                                                yc3Var.s = 6;
                                                objI = i(rb3Var3, ab2Var, yc3Var);
                                                if (objI != y50Var) {
                                                    gb2 gb2Var10 = gb2Var3;
                                                    j61Var4 = w83VarT2;
                                                    gb2Var8 = gb2Var10;
                                                    x50Var7 = x50Var3;
                                                    ns0Var16 = ns0Var11;
                                                    ns0Var17 = ns0Var9;
                                                    ns0Var18 = ns0Var12;
                                                    r12 = (gb2) objI;
                                                    r13 = ns0Var18;
                                                    if (r12 != 0) {
                                                        r12.a();
                                                        f(x50Var7, j61Var4, new vc3(xc2Var7, r13, 5));
                                                        ns0Var17.h(new gy1(r12.c));
                                                        return dm3Var;
                                                    }
                                                    f(x50Var7, j61Var4, new vc3(xc2Var7, r13, 6));
                                                    if (ns0Var16 != null) {
                                                        ns0Var16.h(new gy1(gb2Var8.c));
                                                        return dm3Var;
                                                    }
                                                }
                                            } else {
                                                yc3Var.i = rb3Var3;
                                                yc3Var.j = x50Var3;
                                                yc3Var.k = xc2Var7;
                                                yc3Var.l = ns0Var9;
                                                yc3Var.m = ns0Var10;
                                                yc3Var.n = ns0Var11;
                                                yc3Var.o = w83VarT2;
                                                yc3Var.p = gb2Var3;
                                                yc3Var.q = gb2Var5;
                                                yc3Var.s = 7;
                                                Object objH = h(rb3Var3, ab2Var, yc3Var);
                                                if (objH != y50Var) {
                                                    xc2 xc2Var11 = xc2Var7;
                                                    j61Var3 = w83VarT2;
                                                    gb2Var6 = gb2Var5;
                                                    objI = objH;
                                                    rb3Var4 = rb3Var3;
                                                    gb2Var7 = gb2Var3;
                                                    xc2Var8 = xc2Var11;
                                                    x50Var6 = x50Var3;
                                                    ns0Var13 = ns0Var11;
                                                    ns0Var14 = ns0Var10;
                                                    ns0Var15 = ns0Var9;
                                                    ns0Var19 = ns0Var12;
                                                    tk1Var2 = (tk1) objI;
                                                    if (s51.n(tk1Var2, sk1Var)) {
                                                        if (tk1Var2 instanceof rk1) {
                                                            j61 j61Var6 = j61Var3;
                                                            xc2Var7 = xc2Var8;
                                                            j61Var4 = j61Var6;
                                                            gb2Var8 = gb2Var7;
                                                            ns0Var16 = ns0Var13;
                                                            ns0Var17 = ns0Var15;
                                                            obj = ((rk1) tk1Var2).a;
                                                        } else {
                                                            if (!(tk1Var2 instanceof qk1)) {
                                                                c.k();
                                                                return null;
                                                            }
                                                            j61 j61Var7 = j61Var3;
                                                            xc2Var7 = xc2Var8;
                                                            j61Var4 = j61Var7;
                                                            gb2Var8 = gb2Var7;
                                                            ns0Var16 = ns0Var13;
                                                            ns0Var17 = ns0Var15;
                                                            obj = ns0Var19;
                                                        }
                                                        x50Var7 = x50Var6;
                                                        r12 = obj;
                                                        r13 = ns0Var19;
                                                        if (r12 != 0) {
                                                        }
                                                    } else {
                                                        ns0Var14.h(new gy1(gb2Var6.c));
                                                        yc3Var.i = x50Var6;
                                                        yc3Var.j = xc2Var8;
                                                        yc3Var.k = j61Var3;
                                                        yc3Var.l = ns0Var19;
                                                        yc3Var.m = ns0Var19;
                                                        yc3Var.n = ns0Var19;
                                                        yc3Var.o = ns0Var19;
                                                        yc3Var.p = ns0Var19;
                                                        yc3Var.q = ns0Var19;
                                                        yc3Var.s = 8;
                                                        if (c(rb3Var4, yc3Var) != y50Var) {
                                                            j61Var5 = j61Var3;
                                                            x50Var8 = x50Var6;
                                                            r132 = ns0Var19;
                                                            f(x50Var8, j61Var5, new vc3(xc2Var8, r132, 7));
                                                            return dm3Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (ns0Var11 != null) {
                                            ns0Var11.h(new gy1(gb2Var3.c));
                                            return dm3Var;
                                        }
                                    }
                                } else if (ns0Var7 != null) {
                                    ns0Var7.h(new gy1(gb2Var2.c));
                                    return dm3Var;
                                }
                            }
                            return dm3Var;
                        }
                    } else {
                        yc3Var.i = rb3Var5;
                        yc3Var.j = x50Var2;
                        yc3Var.k = xc2Var3;
                        yc3Var.l = ns0Var4;
                        yc3Var.m = ns0Var3;
                        yc3Var.n = ss0Var2;
                        yc3Var.o = ns0Var2;
                        yc3Var.p = gb2Var;
                        yc3Var.q = w83VarT;
                        yc3Var.s = 3;
                        Object objH2 = h(rb3Var5, ab2Var, yc3Var);
                        if (objH2 != y50Var) {
                            rb3Var2 = rb3Var5;
                            j61Var = w83VarT;
                            xc2 xc2Var12 = xc2Var3;
                            x50Var3 = x50Var2;
                            objI = objH2;
                            ns0Var5 = ns0Var2;
                            xc2Var4 = xc2Var12;
                            tk1Var = (tk1) objI;
                            if (s51.n(tk1Var, sk1Var2)) {
                                if (tk1Var instanceof rk1) {
                                    gb2Var2 = ((rk1) tk1Var).a;
                                } else {
                                    if (!(tk1Var instanceof qk1)) {
                                        c.k();
                                        return null;
                                    }
                                    gb2Var2 = null;
                                }
                                ns0Var7 = ns0Var5;
                                ss0Var3 = ss0Var2;
                                xc2Var5 = xc2Var4;
                                ns0Var8 = ns0Var4;
                                if (gb2Var2 == null) {
                                }
                                if (gb2Var2 != null) {
                                }
                                return dm3Var;
                            }
                            ns0Var3.h(new gy1(gb2Var.c));
                            yc3Var.i = x50Var3;
                            yc3Var.j = xc2Var4;
                            yc3Var.k = j61Var;
                            p40Var = null;
                            yc3Var.l = null;
                            yc3Var.m = null;
                            yc3Var.n = null;
                            yc3Var.o = null;
                            yc3Var.p = null;
                            yc3Var.q = null;
                            yc3Var.s = 4;
                            if (c(rb3Var2, yc3Var) != y50Var) {
                                xc2Var6 = xc2Var4;
                                x50Var5 = x50Var3;
                                f(x50Var5, j61Var, new vc3(xc2Var6, p40Var, 2));
                                return dm3Var2;
                            }
                        }
                    }
                }
                return y50Var;
            case 1:
                ns0 ns0Var20 = (ns0) yc3Var.o;
                ss0 ss0Var5 = (ss0) yc3Var.n;
                ns0 ns0Var21 = (ns0) yc3Var.m;
                ns0 ns0Var22 = yc3Var.l;
                xc2 xc2Var13 = (xc2) yc3Var.k;
                x50 x50Var10 = (x50) yc3Var.j;
                rb3 rb3Var6 = (rb3) yc3Var.i;
                y02.Q(objI);
                objB = objI;
                ns0Var4 = ns0Var22;
                x50Var2 = x50Var10;
                i = 1;
                ss0Var2 = ss0Var5;
                xc2Var2 = xc2Var13;
                ns0Var2 = ns0Var20;
                rb3Var5 = rb3Var6;
                ns0Var3 = ns0Var21;
                r5 = 0;
                gb2 gb2Var92 = (gb2) objB;
                gb2Var92.a();
                w83 w83VarT3 = cl3.t(x50Var2, r5, new wc3(xc2Var2, r5, i), i);
                if (ss0Var2 == af0Var) {
                }
                if (ns0Var3 != null) {
                }
                return y50Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                j61Var = (j61) yc3Var.p;
                ns0Var7 = (ns0) yc3Var.o;
                ss0Var3 = (ss0) yc3Var.n;
                ns0Var6 = (ns0) yc3Var.m;
                ns0Var8 = yc3Var.l;
                xc2Var3 = (xc2) yc3Var.k;
                x50Var4 = (x50) yc3Var.j;
                rb3Var2 = (rb3) yc3Var.i;
                y02.Q(objI);
                gb2Var2 = (gb2) objI;
                x50 x50Var92 = x50Var4;
                ns0Var3 = ns0Var6;
                xc2Var5 = xc2Var3;
                x50Var3 = x50Var92;
                if (gb2Var2 == null) {
                }
                if (gb2Var2 != null) {
                }
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                j61Var = (j61) yc3Var.q;
                gb2Var = (gb2) yc3Var.p;
                ns0Var5 = (ns0) yc3Var.o;
                ss0Var2 = (ss0) yc3Var.n;
                ns0Var3 = (ns0) yc3Var.m;
                ns0Var4 = yc3Var.l;
                xc2Var4 = (xc2) yc3Var.k;
                x50Var3 = (x50) yc3Var.j;
                rb3Var2 = (rb3) yc3Var.i;
                y02.Q(objI);
                tk1Var = (tk1) objI;
                if (s51.n(tk1Var, sk1Var2)) {
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                j61Var = (j61) yc3Var.k;
                xc2Var6 = (xc2) yc3Var.j;
                x50Var5 = (x50) yc3Var.i;
                y02.Q(objI);
                p40Var = null;
                f(x50Var5, j61Var, new vc3(xc2Var6, p40Var, 2));
                return dm3Var2;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                j61Var2 = (j61) yc3Var.q;
                gb2Var3 = (gb2) yc3Var.p;
                ns0 ns0Var23 = (ns0) yc3Var.o;
                ss0Var4 = (ss0) yc3Var.n;
                ns0 ns0Var24 = (ns0) yc3Var.m;
                ns0 ns0Var25 = yc3Var.l;
                xc2Var5 = (xc2) yc3Var.k;
                x50 x50Var11 = (x50) yc3Var.j;
                rb3 rb3Var7 = (rb3) yc3Var.i;
                y02.Q(objI);
                ns0Var11 = ns0Var23;
                rb3Var3 = rb3Var7;
                ns0Var9 = ns0Var25;
                ns0Var10 = ns0Var24;
                x50Var3 = x50Var11;
                sk1Var = sk1Var2;
                dm3Var = dm3Var2;
                gb2Var4 = (gb2) objI;
                if (gb2Var4 == null) {
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                gb2Var8 = (gb2) yc3Var.n;
                j61Var4 = (j61) yc3Var.m;
                ns0Var16 = yc3Var.l;
                ns0Var17 = (ns0) yc3Var.k;
                xc2Var7 = (xc2) yc3Var.j;
                x50Var7 = (x50) yc3Var.i;
                y02.Q(objI);
                dm3Var = dm3Var2;
                ns0Var18 = null;
                r12 = (gb2) objI;
                r13 = ns0Var18;
                if (r12 != 0) {
                }
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                gb2Var6 = (gb2) yc3Var.q;
                gb2 gb2Var11 = (gb2) yc3Var.p;
                j61Var3 = (j61) yc3Var.o;
                ns0Var13 = (ns0) yc3Var.n;
                ns0Var14 = (ns0) yc3Var.m;
                ns0Var15 = yc3Var.l;
                xc2 xc2Var14 = (xc2) yc3Var.k;
                x50Var6 = (x50) yc3Var.j;
                rb3 rb3Var8 = (rb3) yc3Var.i;
                y02.Q(objI);
                rb3Var4 = rb3Var8;
                sk1Var = sk1Var2;
                dm3Var = dm3Var2;
                ns0Var19 = null;
                gb2Var7 = gb2Var11;
                xc2Var8 = xc2Var14;
                tk1Var2 = (tk1) objI;
                if (s51.n(tk1Var2, sk1Var)) {
                }
                break;
            case 8:
                j61Var5 = (j61) yc3Var.k;
                xc2Var8 = (xc2) yc3Var.j;
                x50Var8 = (x50) yc3Var.i;
                y02.Q(objI);
                dm3Var = dm3Var2;
                r132 = 0;
                f(x50Var8, j61Var5, new vc3(xc2Var8, r132, 7));
                return dm3Var;
            default:
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(rb3 rb3Var, ab2 ab2Var, q40 q40Var) {
        ad3 ad3Var;
        qk2 qk2Var;
        if (q40Var instanceof ad3) {
            ad3Var = (ad3) q40Var;
            int i = ad3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ad3Var.k = i - Integer.MIN_VALUE;
            } else {
                ad3Var = new ad3(q40Var);
            }
        }
        Object obj = ad3Var.j;
        int i2 = ad3Var.k;
        p40 p40Var = null;
        try {
            if (i2 == 0) {
                y02.Q(obj);
                qk2 qk2Var2 = new qk2();
                qk2Var2.f = qk1.a;
                long jC = rb3Var.F().c();
                rs0 br0Var = new br0(ab2Var, qk2Var2, p40Var, 3);
                ad3Var.i = qk2Var2;
                ad3Var.k = 1;
                Object objH = rb3Var.H(jC, br0Var, ad3Var);
                Object obj2 = y50.f;
                if (objH == obj2) {
                    return obj2;
                }
                qk2Var = qk2Var2;
            } else {
                if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qk2Var = ad3Var.i;
                y02.Q(obj);
            }
            return qk2Var.f;
        } catch (bb2 unused) {
            return sk1.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (r0 == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(rb3 rb3Var, ab2 ab2Var, ml mlVar) {
        bd3 bd3Var;
        rb3 rb3Var2;
        bd3 bd3Var2;
        ab2 ab2Var2;
        rb3 rb3Var3;
        ab2 ab2Var3;
        int size;
        int i;
        Object objC;
        if (mlVar instanceof bd3) {
            bd3Var = (bd3) mlVar;
            int i2 = bd3Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bd3Var.l = i2 - Integer.MIN_VALUE;
            } else {
                bd3Var = new bd3(mlVar);
            }
        }
        Object objC2 = bd3Var.k;
        int i3 = bd3Var.l;
        y50 y50Var = y50.f;
        if (i3 == 0) {
            y02.Q(objC2);
            rb3Var2 = rb3Var;
            bd3Var2 = bd3Var;
            ab2Var2 = ab2Var;
            bd3Var2.i = rb3Var2;
            bd3Var2.j = ab2Var2;
            bd3Var2.l = 1;
            objC = rb3Var2.c(ab2Var2, bd3Var2);
            if (objC != y50Var) {
            }
            return y50Var;
        }
        if (i3 == 1) {
            ab2Var3 = bd3Var.j;
            rb3Var3 = bd3Var.i;
            y02.Q(objC2);
            List list = ((za2) objC2).a;
            size = list.size();
            while (i < size) {
            }
            return list.get(0);
        }
        if (i3 != 2) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ab2Var3 = bd3Var.j;
        rb3Var3 = bd3Var.i;
        y02.Q(objC2);
        ab2 ab2Var4 = ab2Var3;
        bd3Var2 = bd3Var;
        ab2Var2 = ab2Var4;
        List list2 = ((za2) objC2).a;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (((gb2) list2.get(i4)).c()) {
                break;
            }
        }
        rb3Var2 = rb3Var3;
        bd3Var2.i = rb3Var2;
        bd3Var2.j = ab2Var2;
        bd3Var2.l = 1;
        objC = rb3Var2.c(ab2Var2, bd3Var2);
        if (objC != y50Var) {
            rb3Var3 = rb3Var2;
            objC2 = objC;
            bd3 bd3Var3 = bd3Var2;
            ab2Var3 = ab2Var2;
            bd3Var = bd3Var3;
            List list3 = ((za2) objC2).a;
            size = list3.size();
            for (i = 0; i < size; i++) {
                if (!w22.m((gb2) list3.get(i))) {
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        gb2 gb2Var = (gb2) list3.get(i5);
                        if (gb2Var.c() || w22.y(gb2Var, rb3Var3.k.D, rb3Var3.E())) {
                            break;
                        }
                    }
                    bd3Var.i = rb3Var3;
                    bd3Var.j = ab2Var3;
                    bd3Var.l = 2;
                    objC2 = rb3Var3.c(ab2.h, bd3Var);
                }
            }
            return list3.get(0);
        }
        return y50Var;
    }
}
