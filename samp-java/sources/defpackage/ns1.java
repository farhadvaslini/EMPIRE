package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class ns1 extends t63 {
    public static final int[] n = new int[0];
    public final ns0 e;
    public final ns0 f;
    public int g;
    public js1 h;
    public ArrayList i;
    public y63 j;
    public int[] k;
    public int l;
    public boolean m;

    public ns1(long j, y63 y63Var, ns0 ns0Var, ns0 ns0Var2) {
        super(j, y63Var);
        this.e = ns0Var;
        this.f = ns0Var2;
        this.j = y63.j;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (a73.c) {
            this.j = this.j.f(j);
        }
    }

    public void B(js1 js1Var) {
        this.h = js1Var;
    }

    public ns1 C(ns0 ns0Var, ns0 ns0Var2) {
        bw1 bw1Var;
        if (this.c) {
            yb2.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            yb2.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = a73.c;
        synchronized (obj) {
            long j = a73.e;
            a73.e = j + 1;
            a73.d = a73.d.f(j);
            y63 y63VarD = d();
            r(y63VarD.f(j));
            bw1Var = new bw1(j, a73.d(y63VarD, g() + 1, j), a73.k(ns0Var, e(), true), a73.l(ns0Var2, i()), this);
        }
        if (this.m || this.c) {
            return bw1Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = a73.e;
            a73.e = j2 + 1;
            s(j2);
            a73.d = a73.d.f(g());
        }
        r(a73.d(d(), jG + 1, g()));
        return bw1Var;
    }

    @Override // defpackage.t63
    public final void b() {
        a73.d = a73.d.b(g()).a(this.j);
    }

    @Override // defpackage.t63
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (a73.c) {
            o();
        }
        l();
    }

    @Override // defpackage.t63
    public boolean f() {
        return false;
    }

    @Override // defpackage.t63
    public int h() {
        return this.g;
    }

    @Override // defpackage.t63
    public ns0 i() {
        return this.f;
    }

    @Override // defpackage.t63
    public void k() {
        this.l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // defpackage.t63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            defpackage.yb2.a(r1)
        Lc:
            int r1 = r0.l
            int r1 = r1 + (-1)
            r0.l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.m
            if (r1 != 0) goto L94
            js1 r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            defpackage.yb2.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            n93 r13 = (defpackage.n93) r13
            p93 r13 = r13.a()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            y63 r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = defpackage.qx.m0(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            cr2 r6 = defpackage.a73.a
            r14 = 0
            r13.a = r14
        L83:
            p93 r13 = r13.b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns1.l():void");
    }

    @Override // defpackage.t63
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.t63
    public void n(n93 n93Var) {
        js1 js1VarX = x();
        if (js1VarX == null) {
            js1 js1Var = or2.a;
            js1VarX = new js1();
            B(js1VarX);
        }
        js1VarX.a(n93Var);
    }

    @Override // defpackage.t63
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            a73.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.t63
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.t63
    public t63 u(ns0 ns0Var) {
        cw1 cw1Var;
        if (this.c) {
            yb2.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            yb2.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = a73.c;
        synchronized (obj) {
            long j = a73.e;
            a73.e = j + 1;
            a73.d = a73.d.f(j);
            cw1Var = new cw1(j, a73.d(d(), jG + 1, j), a73.k(ns0Var, e(), true), this);
        }
        if (this.m || this.c) {
            return cw1Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = a73.e;
            a73.e = j2 + 1;
            s(j2);
            a73.d = a73.d.f(g());
        }
        r(a73.d(d(), jG2 + 1, g()));
        return cw1Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (a73.c) {
            long j = a73.e;
            a73.e = j + 1;
            s(j);
            a73.d = a73.d.f(g());
        }
        r(a73.d(d(), jG + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.t22 w() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns1.w():t22");
    }

    public js1 x() {
        return this.h;
    }

    @Override // defpackage.t63
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public ns0 e() {
        return this.e;
    }

    public final t22 z(long j, js1 js1Var, HashMap map, y63 y63Var) {
        ArrayList arrayList;
        ArrayList arrayListD0;
        ArrayList arrayList2;
        y63 y63Var2;
        Object[] objArr;
        long[] jArr;
        y63 y63Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        p93 p93VarB;
        y63 y63VarE = d().f(g()).e(this.j);
        Object[] objArr3 = js1Var.b;
        long[] jArr3 = js1Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListD0 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            n93 n93Var = (n93) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            p93 p93VarA = n93Var.a();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            p93 p93VarS = a73.s(p93VarA, j, y63Var);
                            if (p93VarS == null) {
                                arrayList3 = arrayListD0;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListD0;
                                j2 = j3;
                                p93 p93VarS2 = a73.s(p93VarA, g(), y63VarE);
                                if (p93VarS2 != null && p93VarS2.a != 1 && !p93VarS.equals(p93VarS2)) {
                                    y63Var3 = y63VarE;
                                    p93 p93VarS3 = a73.s(p93VarA, g(), d());
                                    if (p93VarS3 == null) {
                                        a73.r();
                                        throw null;
                                    }
                                    if (map == null || (p93VarB = (p93) map.get(p93VarS)) == null) {
                                        p93VarB = n93Var.b(p93VarS2, p93VarS, p93VarS3);
                                    }
                                    if (p93VarB == null) {
                                        return new v63(this);
                                    }
                                    if (!p93VarB.equals(p93VarS3)) {
                                        if (p93VarB.equals(p93VarS)) {
                                            ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList5.add(new r32(n93Var, p93VarS.b(g())));
                                            arrayListD0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayListD0.add(n93Var);
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(!p93VarB.equals(p93VarS2) ? new r32(n93Var, p93VarB) : new r32(n93Var, p93VarS2.b(g())));
                                        }
                                    }
                                    arrayListD0 = arrayList3;
                                }
                                arrayList2 = arrayList4;
                                arrayListD0 = arrayList3;
                            }
                            y63Var3 = y63VarE;
                            arrayList2 = arrayList4;
                            arrayListD0 = arrayList3;
                        } else {
                            y63Var3 = y63VarE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        y63VarE = y63Var3;
                    }
                    y63Var2 = y63VarE;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    y63Var2 = y63VarE;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                y63VarE = y63Var2;
            }
        } else {
            arrayList = null;
            arrayListD0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                r32 r32Var = (r32) arrayList2.get(i5);
                n93 n93Var2 = (n93) r32Var.f;
                p93 p93Var = (p93) r32Var.g;
                p93Var.a = j;
                synchronized (a73.c) {
                    p93Var.b = n93Var2.a();
                    n93Var2.c(p93Var);
                }
            }
        }
        if (arrayListD0 != null) {
            int size2 = arrayListD0.size();
            for (int i6 = 0; i6 < size2; i6++) {
                js1Var.l((n93) arrayListD0.get(i6));
            }
            ArrayList arrayList6 = this.i;
            if (arrayList6 != null) {
                arrayListD0 = qx.D0(arrayList6, arrayListD0);
            }
            this.i = arrayListD0;
        }
        return w63.c;
    }
}
