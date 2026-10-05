package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class az extends r {
    public cs0 P;
    public boolean Q;
    public final sr1 R;
    public final sr1 S;
    public gb2 T;
    public w83 U;
    public w83 V;
    public boolean W;
    public boolean X;
    public long Y;
    public boolean Z;
    public q11 a0;
    public w83 b0;
    public w83 c0;
    public boolean d0;
    public boolean e0;
    public long f0;
    public boolean g0;

    public az(cs0 cs0Var, cs0 cs0Var2, qr1 qr1Var) {
        super(qr1Var, null, false, true, null, null, cs0Var);
        this.P = cs0Var2;
        this.Q = true;
        int i = pk1.a;
        this.R = new sr1(6);
        this.S = new sr1(6);
        this.Y = -1L;
        this.f0 = -1L;
    }

    @Override // defpackage.r
    public final void B1() {
        J1();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // defpackage.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C1(android.view.KeyEvent r7) {
        /*
            r6 = this;
            long r0 = defpackage.ur.E(r7)
            cs0 r7 = r6.P
            r2 = 0
            if (r7 == 0) goto L25
            sr1 r7 = r6.R
            java.lang.Object r3 = r7.d(r0)
            if (r3 != 0) goto L25
            x50 r3 = r6.d1()
            zy r4 = new zy
            r5 = 2
            r4.<init>(r6, r2, r5)
            r5 = 3
            w83 r2 = defpackage.cl3.t(r3, r2, r4, r5)
            r7.g(r0, r2)
            r7 = 1
            goto L26
        L25:
            r7 = 0
        L26:
            sr1 r6 = r6.S
            java.lang.Object r6 = r6.d(r0)
            yy r6 = (defpackage.yy) r6
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az.C1(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.r
    public final void D1(KeyEvent keyEvent) {
        long jE = ur.E(keyEvent);
        sr1 sr1Var = this.R;
        boolean z = false;
        if (sr1Var.d(jE) != null) {
            j61 j61Var = (j61) sr1Var.d(jE);
            if (j61Var != null) {
                if (j61Var.b()) {
                    j61Var.c(null);
                } else {
                    z = true;
                }
            }
            sr1Var.f(jE);
        }
        if (z) {
            return;
        }
        E1();
    }

    public final void G1(boolean z) {
        if (z) {
            this.a0 = null;
            w83 w83Var = this.b0;
            if (w83Var != null) {
                w83Var.c(null);
            }
            this.b0 = null;
            w83 w83Var2 = this.c0;
            if (w83Var2 != null) {
                w83Var2.c(null);
            }
            this.c0 = null;
            this.d0 = false;
            this.e0 = false;
            this.f0 = -1L;
            this.g0 = false;
        } else {
            this.T = null;
            w83 w83Var3 = this.U;
            if (w83Var3 != null) {
                w83Var3.c(null);
            }
            this.U = null;
            w83 w83Var4 = this.V;
            if (w83Var4 != null) {
                w83Var4.c(null);
            }
            this.V = null;
            this.W = false;
            this.X = false;
            this.Y = -1L;
            this.Z = false;
        }
        w1(z);
    }

    public final void H1(long j, q11 q11Var) {
        if (this.A && !this.g0) {
            x1(q11Var.c, true);
            this.f0 = j;
            if (!this.e0 && !this.d0) {
                E1();
            }
        }
        this.a0 = null;
        this.g0 = false;
        this.d0 = false;
        w83 w83Var = this.b0;
        if (w83Var != null) {
            w83Var.c(null);
        }
        this.b0 = null;
        this.e0 = false;
    }

    public final void I1(long j, gb2 gb2Var) {
        if (this.A && !this.Z) {
            x1(gb2Var.c, false);
            this.Y = j;
            if (!this.X && !this.W) {
                E1();
            }
        }
        this.T = null;
        this.Z = false;
        this.W = false;
        w83 w83Var = this.U;
        if (w83Var != null) {
            w83Var.c(null);
        }
        this.U = null;
        this.X = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1() {
        /*
            r24 = this;
            r0 = r24
            sr1 r1 = r0.R
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            r14 = 0
            if (r4 < 0) goto L5c
            r15 = r14
            r16 = 128(0x80, double:6.3E-322)
        L1a:
            r6 = r3[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r8 = ~r6
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r15 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L2e:
            if (r9 >= r8) goto L4e
            long r20 = r6 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L46
            int r20 = r15 << 3
            int r20 = r20 + r9
            r20 = r2[r20]
            r21 = r10
            r10 = r20
            j61 r10 = (defpackage.j61) r10
            r10.c(r5)
            goto L48
        L46:
            r21 = r10
        L48:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            r10 = r21
            goto L2e
        L4e:
            r21 = r10
            if (r8 != r13) goto L62
            goto L55
        L53:
            r21 = r10
        L55:
            if (r15 == r4) goto L62
            int r15 = r15 + 1
            r10 = r21
            goto L1a
        L5c:
            r21 = r10
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L62:
            r1.a()
            sr1 r0 = r0.S
            java.lang.Object[] r1 = r0.c
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto La2
            r4 = r14
        L71:
            r6 = r2[r4]
            long r8 = ~r6
            long r8 = r8 << r21
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L9d
            int r8 = r4 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L84:
            if (r9 >= r8) goto L9b
            long r22 = r6 & r18
            int r10 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r10 < 0) goto L90
            long r6 = r6 >> r13
            int r9 = r9 + 1
            goto L84
        L90:
            int r0 = r4 << 3
            int r0 = r0 + r9
            r0 = r1[r0]
            yy r0 = (defpackage.yy) r0
            r0.getClass()
            throw r5
        L9b:
            if (r8 != r13) goto La2
        L9d:
            if (r4 == r3) goto La2
            int r4 = r4 + 1
            goto L71
        La2:
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az.J1():void");
    }

    @Override // defpackage.jb2
    public final void L0() {
        zy0 zy0Var;
        qr1 qr1Var = this.v;
        if (qr1Var != null && (zy0Var = this.I) != null) {
            qr1Var.c(new az0(zy0Var));
        }
        this.I = null;
        G1(false);
    }

    @Override // defpackage.y11
    public final void V() {
        G1(true);
    }

    @Override // defpackage.y11
    public final void c0(h9 h9Var, ab2 ab2Var) {
        ArrayList arrayList = (ArrayList) h9Var.c;
        A1();
        if (this.A && this.E == null) {
            bw0 bw0Var = new bw0(this);
            p1(bw0Var);
            this.E = bw0Var;
        }
        int i = 0;
        if (ab2Var != ab2.g) {
            if (ab2Var != ab2.h || this.a0 == null || this.e0) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                q11 q11Var = (q11) arrayList.get(i);
                if (q11Var.i && q11Var != this.a0) {
                    G1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.a0 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (lr.q((q11) arrayList.get(i2))) {
                    q11 q11Var2 = (q11) arrayList.get(0);
                    q11Var2.i = true;
                    this.a0 = q11Var2;
                    if (this.A) {
                        w83 w83Var = this.c0;
                        if (w83Var != null && w83Var.b()) {
                            ((oq3) ur.z(this, s20.t)).getClass();
                            if (q11Var2.b - this.f0 < 40) {
                                this.g0 = true;
                                return;
                            }
                            this.d0 = true;
                            w83 w83Var2 = this.c0;
                            if (w83Var2 != null) {
                                w83Var2.c(null);
                            }
                            this.c0 = null;
                        }
                        this.e0 = false;
                        y1(q11Var2);
                        if (this.P != null) {
                            this.b0 = cl3.t(d1(), null, new zy(this, null, 1), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.e0) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                q11 q11Var3 = (q11) arrayList.get(i3);
                if (!q11Var3.h || q11Var3.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((q11) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            q11 q11Var4 = (q11) arrayList.get(0);
            q11Var4.i = true;
            long j = q11Var4.b;
            q11 q11Var5 = this.a0;
            q11Var5.getClass();
            H1(j, q11Var5);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            q11 q11Var6 = (q11) arrayList.get(i4);
            if (q11Var6.i || !q11Var6.h || q11Var6.d) {
                float fD = ((oq3) ur.z(this, s20.t)).d();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    q11 q11Var7 = (q11) arrayList.get(i5);
                    long j2 = q11Var7.c;
                    q11 q11Var8 = this.a0;
                    q11Var8.getClass();
                    boolean z = Math.abs(gy1.c(gy1.d(j2, q11Var8.c))) > fD;
                    if (q11Var7.i || z) {
                        G1(true);
                        return;
                    }
                }
                return;
            }
        }
        q11 q11Var9 = (q11) arrayList.get(0);
        q11Var9.i = true;
        long j3 = q11Var9.b;
        q11 q11Var10 = this.a0;
        q11Var10.getClass();
        H1(j3, q11Var10);
    }

    @Override // defpackage.r, defpackage.jb2
    public final void i0(za2 za2Var, ab2 ab2Var, long j) {
        super.i0(za2Var, ab2Var, j);
        if (ab2Var != ab2.g) {
            if (ab2Var != ab2.h || this.T == null || this.X) {
                return;
            }
            List list = za2Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                gb2 gb2Var = (gb2) list.get(i);
                if (gb2Var.c() && gb2Var != this.T) {
                    G1(false);
                    return;
                }
            }
            return;
        }
        if (this.T == null) {
            if (cd3.e(za2Var, true)) {
                gb2 gb2Var2 = (gb2) za2Var.a.get(0);
                gb2Var2.a();
                this.T = gb2Var2;
                if (this.A) {
                    w83 w83Var = this.V;
                    if (w83Var != null && w83Var.b()) {
                        ((oq3) ur.z(this, s20.t)).getClass();
                        if (gb2Var2.b - this.Y < 40) {
                            this.Z = true;
                            return;
                        }
                        this.W = true;
                        w83 w83Var2 = this.V;
                        if (w83Var2 != null) {
                            w83Var2.c(null);
                        }
                        this.V = null;
                    }
                    this.X = false;
                    z1(gb2Var2);
                    if (this.P != null) {
                        this.U = cl3.t(d1(), null, new zy(this, null, 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = za2Var.c == 2;
        List list2 = za2Var.a;
        if (z && !this.X && this.A && this.P != null) {
            w83 w83Var3 = this.U;
            if (w83Var3 != null) {
                w83Var3.c(null);
            }
            this.U = null;
            cs0 cs0Var = this.P;
            if (cs0Var != null) {
                cs0Var.a();
            }
            if (this.Q) {
                ((n62) ((px0) ur.z(this, s20.l))).a(0);
            }
            this.X = true;
        }
        if (this.X) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!w22.n((gb2) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((gb2) list2.get(i3)).a();
                    }
                    return;
                }
            }
            gb2 gb2Var3 = (gb2) list2.get(0);
            gb2Var3.a();
            long j2 = gb2Var3.b;
            gb2 gb2Var4 = this.T;
            gb2Var4.getClass();
            I1(j2, gb2Var4);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!w22.m((gb2) list2.get(i4))) {
                long jV1 = v1(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    gb2 gb2Var5 = (gb2) list2.get(i5);
                    if (gb2Var5.c() || w22.y(gb2Var5, j, jV1)) {
                        G1(false);
                        return;
                    }
                }
                return;
            }
        }
        gb2 gb2Var6 = (gb2) list2.get(0);
        gb2Var6.a();
        long j3 = gb2Var6.b;
        gb2 gb2Var7 = this.T;
        gb2Var7.getClass();
        I1(j3, gb2Var7);
    }

    @Override // defpackage.aq1
    public final void j1() {
        J1();
    }

    @Override // defpackage.r
    public final void s1(dv2 dv2Var) {
        if (this.P != null) {
            ja jaVar = new ja(7, this);
            a71[] a71VarArr = bv2.a;
            dv2Var.a(pu2.c, new y0(null, jaVar));
        }
    }
}
