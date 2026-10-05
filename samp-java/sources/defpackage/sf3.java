package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sf3 {
    public final g51 A;
    public boolean B;
    public final yl3 a;
    public ye1 d;
    public cs0 g;
    public ax h;
    public x50 i;
    public c72 j;
    public px0 k;
    public ip0 l;
    public final d42 m;
    public final d42 n;
    public long o;
    public yg3 p;
    public long q;
    public final d42 r;
    public final d42 s;
    public int t;
    public bg3 u;
    public g51 v;
    public yg3 w;
    public final d42 x;
    public final ar2 y;
    public final qf3 z;
    public iy1 b = no3.a;
    public ns0 c = new n20(23);
    public final d42 e = b32.w(new bg3((String) null, 0, 7));
    public nr3 f = m22.B;

    public sf3(yl3 yl3Var) {
        this.a = yl3Var;
        Boolean bool = Boolean.TRUE;
        this.m = b32.w(bool);
        this.n = b32.w(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = b32.w(null);
        this.s = b32.w(null);
        this.t = -1;
        this.u = new bg3((String) null, 0L, 7);
        this.x = b32.w(Boolean.FALSE);
        ar2 ar2Var = new ar2(2);
        ar2Var.h = yi3.f;
        this.y = ar2Var;
        this.z = new qf3(this);
        this.A = new g51(this);
    }

    public static final r32 a(sf3 sf3Var) {
        String str;
        yg3 yg3Var;
        af afVarM = sf3Var.m();
        if (afVarM == null || (str = afVarM.g) == null || (yg3Var = sf3Var.w) == null) {
            return null;
        }
        long j = yg3Var.a;
        return new r32(str, new yg3(d32.f(sf3Var.b.r((int) (j >> 32)), sf3Var.b.r((int) (j & 4294967295L)))));
    }

    public static final void b(sf3 sf3Var, yg3 yg3Var) {
        af afVarM;
        String str;
        x50 x50Var;
        if (yg3Var == null) {
            return;
        }
        long j = yg3Var.a;
        c72 c72Var = sf3Var.j;
        if (c72Var == null || (afVarM = sf3Var.m()) == null || (str = afVarM.g) == null) {
            return;
        }
        iy1 iy1Var = sf3Var.b;
        long jF = d32.f(iy1Var.r((int) (j >> 32)), iy1Var.r((int) (j & 4294967295L)));
        if (str.length() <= 0 || yg3.c(jF) || (x50Var = sf3Var.i) == null) {
            return;
        }
        cl3.t(x50Var, null, new w30(c72Var, str, jF, yg3Var, sf3Var, iy1Var, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long c(defpackage.sf3 r21, defpackage.bg3 r22, long r23, boolean r25, boolean r26, defpackage.qn1 r27, boolean r28, defpackage.qx0 r29) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf3.c(sf3, bg3, long, boolean, boolean, qn1, boolean, qx0):long");
    }

    public static bg3 e(af afVar, long j) {
        return new bg3(afVar, j, (yg3) null);
    }

    public final w83 d(boolean z) {
        x50 x50Var = this.i;
        p40 p40Var = null;
        if (x50Var != null) {
            return cl3.t(x50Var, null, new fo3(this, z, p40Var, 2), 1);
        }
        return null;
    }

    public final void f() {
        x50 x50Var = this.i;
        if (x50Var != null) {
            cl3.t(x50Var, null, new mf3(this, null, 1), 1);
        }
    }

    public final void g(gy1 gy1Var) {
        if (!yg3.c(n().b)) {
            ye1 ye1Var = this.d;
            qg3 qg3VarD = ye1Var != null ? ye1Var.d() : null;
            int iE = (gy1Var == null || qg3VarD == null) ? yg3.e(n().b) : this.b.n(qg3VarD.b(gy1Var.a, true));
            bg3 bg3VarA = bg3.a(n(), null, d32.f(iE, iE), 5);
            this.c.h(bg3VarA);
            this.w = new yg3(bg3VarA.b);
        }
        q((gy1Var == null || n().a.g.length() <= 0) ? hx0.f : hx0.h);
        t(false);
    }

    public final void h(boolean z) {
        ip0 ip0Var;
        ye1 ye1Var = this.d;
        if (ye1Var != null && !ye1Var.b() && (ip0Var = this.l) != null) {
            ip0.a(ip0Var);
        }
        this.u = n();
        t(z);
        q(hx0.g);
    }

    public final gy1 i() {
        return (gy1) this.s.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long l(boolean z) {
        qg3 qg3VarD;
        long j;
        ye1 ye1Var = this.d;
        if (ye1Var == null || (qg3VarD = ye1Var.d()) == null) {
            return 9205357640488583168L;
        }
        pg3 pg3Var = qg3VarD.a;
        br1 br1Var = pg3Var.b;
        af afVarM = m();
        if (afVarM == null) {
            return 9205357640488583168L;
        }
        if (!s51.n(afVarM.g, pg3Var.a.a.g)) {
            return 9205357640488583168L;
        }
        bg3 bg3VarN = n();
        if (z) {
            long j2 = bg3VarN.b;
            int i = yg3.c;
            j = j2 >> 32;
        } else {
            long j3 = bg3VarN.b;
            int i2 = yg3.c;
            j = j3 & 4294967295L;
        }
        int iR = this.b.r((int) j);
        boolean zG = yg3.g(n().b);
        long j4 = pg3Var.c;
        int iD = br1Var.d(iR);
        if (iD >= br1Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = pg3Var.a(((!z || zG) && (z || !zG)) ? Math.max(iR + (-1), 0) : iR) == pg3Var.h(iR);
        br1Var.l(iR);
        int length = ((af) br1Var.a.a).g.length();
        ArrayList arrayList = br1Var.h;
        t32 t32Var = (t32) arrayList.get(iR == length ? vr.C(arrayList) : lr.A(iR, arrayList));
        y9 y9Var = t32Var.a;
        int iD2 = t32Var.d(iR);
        ng3 ng3Var = y9Var.d;
        return (((long) Float.floatToRawIntBits(y02.g(br1Var.b(iD), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(y02.g(z2 ? ng3Var.j(iD2, false) : ng3Var.k(iD2, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    public final af m() {
        ye1 ye1Var = this.d;
        if (ye1Var != null) {
            return (af) ye1Var.a.b;
        }
        return null;
    }

    public final bg3 n() {
        return (bg3) this.e.getValue();
    }

    public final void o() {
        w83 w83Var;
        me3 me3Var = (me3) this.y.g;
        if (me3Var == null || (w83Var = me3Var.z) == null) {
            return;
        }
        w83Var.c(null);
        me3Var.z = null;
    }

    public final void p() {
        x50 x50Var = this.i;
        if (x50Var != null) {
            cl3.t(x50Var, null, new mf3(this, null, 2), 1);
        }
    }

    public final void q(hx0 hx0Var) {
        ye1 ye1Var = this.d;
        if (ye1Var != null) {
            if (ye1Var.a() == hx0Var) {
                ye1Var = null;
            }
            if (ye1Var != null) {
                ye1Var.k.setValue(hx0Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (((java.lang.Boolean) r4.q.getValue()).booleanValue() == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r6 = this;
            t63 r0 = defpackage.jo3.l()
            r1 = 0
            if (r0 == 0) goto Lc
            ns0 r2 = r0.e()
            goto Ld
        Lc:
            r2 = r1
        Ld:
            t63 r3 = defpackage.jo3.s(r0)
            boolean r4 = r6.k()     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L72
            ye1 r4 = r6.d     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L2a
            d42 r4 = r4.q     // Catch: java.lang.Throwable -> L70
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L70
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L70
            if (r4 != 0) goto L2a
            goto L72
        L2a:
            defpackage.jo3.v(r0, r3, r2)
            ar2 r6 = r6.y
            java.lang.Object r0 = r6.h
            yi3 r0 = (defpackage.yi3) r0
            yi3 r2 = defpackage.yi3.f
            if (r0 == r2) goto L38
            goto L3d
        L38:
            java.lang.String r0 = "ToolbarRequester is not initialized."
            defpackage.p21.c(r0)
        L3d:
            java.lang.Object r6 = r6.g
            me3 r6 = (defpackage.me3) r6
            if (r6 == 0) goto L6f
            boolean r0 = r6.s
            if (r0 == 0) goto L6f
            w83 r0 = r6.z
            r2 = 1
            if (r0 == 0) goto L53
            boolean r0 = r0.b()
            if (r0 != r2) goto L53
            goto L6f
        L53:
            t20 r0 = defpackage.he3.b
            java.lang.Object r0 = defpackage.ur.z(r6, r0)
            ge3 r0 = (defpackage.ge3) r0
            if (r0 != 0) goto L5e
            goto L6f
        L5e:
            x50 r3 = r6.d1()
            ri2 r4 = new ri2
            r5 = 10
            r4.<init>(r6, r0, r1, r5)
            w83 r0 = defpackage.cl3.t(r3, r1, r4, r2)
            r6.z = r0
        L6f:
            return
        L70:
            r6 = move-exception
            goto L76
        L72:
            defpackage.jo3.v(r0, r3, r2)
            return
        L76:
            defpackage.jo3.v(r0, r3, r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf3.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.q40 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rf3
            if (r0 == 0) goto L13
            r0 = r5
            rf3 r0 = (defpackage.rf3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            rf3 r0 = new rf3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.j
            int r1 = r0.l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            sf3 r4 = r0.i
            defpackage.y02.Q(r5)
            goto L5c
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2e:
            defpackage.y02.Q(r5)
            ax r5 = r4.h
            if (r5 == 0) goto L7d
            r0.i = r4
            r0.l = r3
            boolean r0 = r5 instanceof defpackage.q6
            if (r0 == 0) goto L67
            q6 r5 = (defpackage.q6) r5
            a31 r5 = r5.a
            android.content.ClipboardManager r5 = r5.s()
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            if (r5 != 0) goto L4d
            r5 = 0
            goto L53
        L4d:
            java.lang.String r0 = "text/*"
            boolean r5 = r5.hasMimeType(r0)
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            y50 r0 = defpackage.y50.f
            if (r5 != r0) goto L5c
            return r0
        L5c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            d42 r4 = r4.x
            r4.setValue(r5)
            goto L7d
        L67:
            java.lang.Class r4 = r5.getClass()
            lu r4 = defpackage.rk2.a(r4)
            java.lang.String r4 = r4.b()
            java.lang.String r5 = "Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received "
            java.lang.String r4 = defpackage.by1.g(r5, r4)
            defpackage.c.g(r4)
            return r2
        L7d:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf3.s(q40):java.lang.Object");
    }

    public final void t(boolean z) {
        ye1 ye1Var = this.d;
        if (ye1Var != null) {
            ye1Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            r();
        } else {
            o();
        }
    }
}
