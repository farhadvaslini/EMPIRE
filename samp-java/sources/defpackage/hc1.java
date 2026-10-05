package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hc1 implements j10 {
    public final tb1 f;
    public g20 g;
    public ua3 h;
    public int i;
    public int j;
    public final is1 k;
    public final is1 l;
    public final bc1 m;
    public final yb1 n;
    public final is1 o;
    public final ta3 p;
    public final is1 q;
    public final qs1 r;
    public int s;
    public int t;
    public final String u;

    public hc1(tb1 tb1Var, ua3 ua3Var) {
        this.f = tb1Var;
        this.h = ua3Var;
        long[] jArr = nr2.a;
        this.k = new is1();
        this.l = new is1();
        this.m = new bc1(this);
        this.n = new yb1(this);
        this.o = new is1();
        this.p = new ta3();
        this.q = new is1();
        this.r = new qs1(new Object[16]);
        this.u = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void a(hc1 hc1Var, Object obj) {
        tb1 tb1Var = hc1Var.f;
        hc1Var.g();
        tb1 tb1Var2 = (tb1) hc1Var.o.k(obj);
        if (tb1Var2 != null) {
            if (hc1Var.t <= 0) {
                m21.c("No pre-composed items to dispose");
            }
            int i = ((qs1) ((yr1) tb1Var.o()).g).i(tb1Var2);
            if (i < ((qs1) ((yr1) tb1Var.o()).g).h - hc1Var.t) {
                m21.c("Item is not in pre-composed item range");
            }
            hc1Var.s++;
            hc1Var.t--;
            zb1 zb1Var = (zb1) hc1Var.k.g(tb1Var2);
            if (zb1Var != null) {
                c(zb1Var);
            }
            int i2 = (((qs1) ((yr1) tb1Var.o()).g).h - hc1Var.t) - hc1Var.s;
            hc1Var.j(i, i2);
            hc1Var.e(i2);
        }
        if (hc1Var.r.h(obj)) {
            tb1.Y(tb1Var, true, 6);
        }
    }

    public static void c(zb1 zb1Var) {
        js1 js1Var;
        g52 g52Var = zb1Var.f;
        if (g52Var != null) {
            g52Var.h.set(i52.g);
            zk2 zk2Var = g52Var.k;
            if (zk2Var.d.h()) {
                js1Var = zk2Var.d;
                js1 js1Var2 = or2.a;
                zk2Var.d = new js1();
                zk2Var.c.g();
            } else {
                js1Var = null;
            }
            zk2Var.b();
            l20 l20Var = g52Var.a;
            l20Var.v = null;
            if (js1Var != null) {
                l20Var.z.k = js1Var;
                l20Var.B = 2;
            }
            zb1Var.f = null;
            l20 l20Var2 = zb1Var.c;
            if (l20Var2 != null) {
                l20Var2.m();
            }
            zb1Var.c = null;
        }
    }

    public final void b(zb1 zb1Var, boolean z) {
        g52 g52Var = zb1Var.f;
        if (g52Var != null) {
            t63 t63VarL = jo3.l();
            ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
            t63 t63VarS = jo3.s(t63VarL);
            try {
                tb1 tb1Var = this.f;
                tb1Var.w = true;
                if (z) {
                    while (!g52Var.c()) {
                        try {
                            g52Var.e(new c(26));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                g52Var.a();
                zb1Var.f = null;
                tb1Var.w = false;
            } finally {
                jo3.v(t63VarL, t63VarS, ns0VarE);
            }
        }
    }

    public final qa3 d(Object obj) {
        return !this.f.H() ? new ec1() : new fc1(this, obj);
    }

    public final void e(int i) {
        boolean z;
        boolean z2 = false;
        this.s = 0;
        List listO = this.f.o();
        yr1 yr1Var = (yr1) listO;
        int i2 = (((qs1) yr1Var.g).h - this.t) - 1;
        if (i <= i2) {
            this.p.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.k.g((tb1) yr1Var.get(i3));
                    objG.getClass();
                    ((bs1) this.p.g).a(((zb1) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.h.b(this.p);
            t63 t63VarL = jo3.l();
            ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
            t63 t63VarS = jo3.s(t63VarL);
            z = false;
            while (i2 >= i) {
                try {
                    tb1 tb1Var = (tb1) ((yr1) listO).get(i2);
                    Object objG2 = this.k.g(tb1Var);
                    objG2.getClass();
                    zb1 zb1Var = (zb1) objG2;
                    Object obj = zb1Var.a;
                    if (((bs1) this.p.g).c(obj)) {
                        this.s++;
                        if (((Boolean) zb1Var.g.getValue()).booleanValue()) {
                            xb1 xb1Var = tb1Var.M;
                            bn1 bn1Var = xb1Var.p;
                            rb1 rb1Var = rb1.h;
                            bn1Var.q = rb1Var;
                            gl1 gl1Var = xb1Var.q;
                            if (gl1Var != null) {
                                gl1Var.o = rb1Var;
                            }
                            l(zb1Var, false);
                            if (zb1Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        tb1 tb1Var2 = this.f;
                        tb1Var2.w = true;
                        this.k.k(tb1Var);
                        l20 l20Var = zb1Var.c;
                        if (l20Var != null) {
                            l20Var.m();
                        }
                        this.f.S(i2, 1);
                        tb1Var2.w = false;
                    }
                    this.l.k(obj);
                    i2--;
                } catch (Throwable th) {
                    jo3.v(t63VarL, t63VarS, ns0VarE);
                    throw th;
                }
            }
            jo3.v(t63VarL, t63VarS, ns0VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (a73.c) {
                js1 js1Var = a73.j.h;
                if (js1Var != null) {
                    if (js1Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                a73.a();
            }
        }
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // defpackage.j10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            tb1 r2 = r0.f
            r2.w = r1
            is1 r1 = r0.k
            java.lang.Object[] r3 = r1.c
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            zb1 r13 = (defpackage.zb1) r13
            l20 r13 = r13.c
            if (r13 == 0) goto L47
            r13.m()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.R()
            r2.w = r6
            r1.a()
            is1 r1 = r0.l
            r1.a()
            r0.t = r6
            r0.s = r6
            is1 r1 = r0.o
            r1.a()
            r0.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc1.f():void");
    }

    public final void g() {
        int i = ((qs1) ((yr1) this.f.o()).g).h;
        int i2 = this.k.e;
        if (i2 != i) {
            m21.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.s;
        int i4 = this.t;
        if ((i - i3) - i4 < 0) {
            StringBuilder sbL = nc2.l("Incorrect state. Total children ", i, ". Reusable children ", i3, ". Precomposed children ");
            sbL.append(i4);
            m21.a(sbL.toString());
        }
        int i5 = this.o.e;
        int i6 = this.t;
        if (i5 == i6) {
            return;
        }
        m21.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    @Override // defpackage.j10
    public final void h() {
        i(true);
    }

    public final void i(boolean z) {
        this.t = 0;
        this.o.a();
        List listO = this.f.o();
        int i = ((qs1) ((yr1) listO).g).h;
        if (this.s != i) {
            this.s = i;
            t63 t63VarL = jo3.l();
            ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
            t63 t63VarS = jo3.s(t63VarL);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    tb1 tb1Var = (tb1) ((yr1) listO).get(i2);
                    zb1 zb1Var = (zb1) this.k.g(tb1Var);
                    if (zb1Var != null && ((Boolean) zb1Var.g.getValue()).booleanValue()) {
                        xb1 xb1Var = tb1Var.M;
                        bn1 bn1Var = xb1Var.p;
                        rb1 rb1Var = rb1.h;
                        bn1Var.q = rb1Var;
                        gl1 gl1Var = xb1Var.q;
                        if (gl1Var != null) {
                            gl1Var.o = rb1Var;
                        }
                        l(zb1Var, z);
                        zb1Var.a = n92.l0;
                    }
                } catch (Throwable th) {
                    jo3.v(t63VarL, t63VarS, ns0VarE);
                    throw th;
                }
            }
            jo3.v(t63VarL, t63VarS, ns0VarE);
            this.l.a();
        }
        g();
    }

    public final void j(int i, int i2) {
        tb1 tb1Var = this.f;
        tb1Var.w = true;
        tb1Var.L(i, i2, 1);
        tb1Var.w = false;
    }

    public final void k(Object obj, rs0 rs0Var, boolean z) {
        tb1 tb1Var = this.f;
        if (tb1Var.H()) {
            g();
            if (this.l.c(obj)) {
                return;
            }
            this.q.k(obj);
            is1 is1Var = this.o;
            Object objG = is1Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((qs1) ((yr1) tb1Var.o()).g).i(objG), ((qs1) ((yr1) tb1Var.o()).g).h);
                    this.t++;
                } else {
                    int i = ((qs1) ((yr1) tb1Var.o()).g).h;
                    tb1 tb1Var2 = new tb1(2);
                    tb1Var.w = true;
                    tb1Var.B(i, tb1Var2);
                    tb1Var.w = false;
                    this.t++;
                    objG = tb1Var2;
                }
                is1Var.m(obj, objG);
            }
            m((tb1) objG, obj, z, rs0Var);
        }
    }

    public final void l(zb1 zb1Var, boolean z) {
        l20 l20Var;
        if (z || !zb1Var.h) {
            zb1Var.g = b32.w(Boolean.FALSE);
        } else {
            zb1Var.g.setValue(Boolean.FALSE);
        }
        if (zb1Var.f != null) {
            c(zb1Var);
            return;
        }
        if (z) {
            l20 l20Var2 = zb1Var.c;
            if (l20Var2 != null) {
                l20Var2.l();
                return;
            }
            return;
        }
        u02 u02VarM8getOutOfFrameExecutor = ((h7) wb1.a(this.f)).m8getOutOfFrameExecutor();
        if (u02VarM8getOutOfFrameExecutor != null) {
            ((h7) u02VarM8getOutOfFrameExecutor).G(new ja(23, zb1Var));
        } else {
            if (zb1Var.h || (l20Var = zb1Var.c) == null) {
                return;
            }
            l20Var.l();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d5, B:66:0x00d9, B:78:0x011d, B:67:0x00e6, B:68:0x00f1, B:70:0x00f5, B:72:0x010a, B:76:0x0114, B:75:0x010f, B:77:0x011a, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:81:0x0127, B:82:0x0131), top: B:85:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d5, B:66:0x00d9, B:78:0x011d, B:67:0x00e6, B:68:0x00f1, B:70:0x00f5, B:72:0x010a, B:76:0x0114, B:75:0x010f, B:77:0x011a, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:81:0x0127, B:82:0x0131), top: B:85:0x0076 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.tb1 r10, java.lang.Object r11, boolean r12, defpackage.rs0 r13) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc1.m(tb1, java.lang.Object, boolean, rs0):void");
    }

    public final tb1 n(Object obj) {
        is1 is1Var;
        int i;
        if (this.s == 0) {
            return null;
        }
        yr1 yr1Var = (yr1) this.f.o();
        int i2 = ((qs1) yr1Var.g).h - this.t;
        int i3 = i2 - this.s;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            is1Var = this.k;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = is1Var.g((tb1) yr1Var.get(i5));
            objG.getClass();
            if (s51.n(((zb1) objG).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object objG2 = is1Var.g((tb1) yr1Var.get(i4));
                objG2.getClass();
                zb1 zb1Var = (zb1) objG2;
                Object obj2 = zb1Var.a;
                if (obj2 == n92.l0 || this.h.k(obj, obj2)) {
                    zb1Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.s--;
        tb1 tb1Var = (tb1) yr1Var.get(i3);
        Object objG3 = is1Var.g(tb1Var);
        objG3.getClass();
        zb1 zb1Var2 = (zb1) objG3;
        zb1Var2.g = b32.w(Boolean.TRUE);
        zb1Var2.e = true;
        zb1Var2.d = true;
        return tb1Var;
    }
}
