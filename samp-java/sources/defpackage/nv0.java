package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nv0 {
    public int A;
    public int B;
    public boolean C;
    public final mv0 D;
    public final ArrayList E;
    public boolean F;
    public i53 G;
    public j53 H;
    public m53 I;
    public boolean J;
    public n52 K;
    public gs L;
    public final d20 M;
    public iv0 N;
    public qm0 O;
    public u33 P;
    public final j20 Q;
    public final o50 R;
    public boolean S;
    public long T;
    public ov0 U;
    public final tl3 a;
    public final g20 b;
    public final j53 c;
    public final ls1 d;
    public final gs e;
    public final gs f;
    public final yl1 g;
    public final l20 h;
    public qv0 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public mr1 p;
    public boolean q;
    public boolean r;
    public or1 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final q41 n = new q41();
    public final ArrayList s = new ArrayList();
    public final q41 t = new q41();
    public n52 u = n52.i;
    public final q41 x = new q41();
    public int z = -1;

    public nv0(tl3 tl3Var, g20 g20Var, j53 j53Var, ls1 ls1Var, gs gsVar, gs gsVar2, yl1 yl1Var, l20 l20Var) {
        this.a = tl3Var;
        this.b = g20Var;
        this.c = j53Var;
        this.d = ls1Var;
        this.e = gsVar;
        this.f = gsVar2;
        this.g = yl1Var;
        this.h = l20Var;
        this.C = g20Var.f() || g20Var.d();
        this.D = new mv0(0, this);
        this.E = new ArrayList();
        i53 i53VarC = j53Var.c();
        i53VarC.c();
        this.G = i53VarC;
        j53 j53Var2 = new j53();
        if (g20Var.f()) {
            j53Var2.b();
        }
        if (g20Var.d()) {
            j53Var2.p = new or1();
        }
        this.H = j53Var2;
        m53 m53VarE = j53Var2.e();
        m53VarE.e(true);
        this.I = m53VarE;
        this.M = new d20(this, gsVar);
        i53 i53VarC2 = this.H.c();
        try {
            iv0 iv0VarA = i53VarC2.a(0);
            i53VarC2.c();
            this.N = iv0VarA;
            this.O = new qm0();
            this.Q = new j20(this);
            o50 o50VarJ = g20Var.j();
            o50 o50VarB = B();
            this.R = o50VarJ.k(o50VarB == null ? li0.f : o50VarB);
        } catch (Throwable th) {
            i53VarC2.c();
            throw th;
        }
    }

    public static final int Q(nv0 nv0Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        i53 i53Var;
        i53 i53Var2 = nv0Var.G;
        int i7 = 0;
        if (i53Var2.j(i)) {
            int i8 = i53Var2.i(i);
            Object objP = i53Var2.p(i53Var2.b, i);
            if (i8 == 206 && s51.n(objP, e20.e)) {
                Object objH = i53Var2.h(i, 0);
                rv0 rv0Var = objH instanceof rv0 ? (rv0) objH : null;
                al2 al2Var = rv0Var != null ? rv0Var.a : null;
                kv0 kv0Var = al2Var instanceof kv0 ? (kv0) al2Var : null;
                if (kv0Var != null) {
                    js1 js1Var = kv0Var.f.e;
                    Object[] objArr = js1Var.b;
                    long[] jArr3 = js1Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j = jArr3[i9];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = i7;
                                while (i12 < i11) {
                                    if ((255 & j) < 128) {
                                        nv0 nv0Var2 = (nv0) objArr[(i9 << 3) + i12];
                                        j53 j53Var = nv0Var2.c;
                                        if (j53Var.g <= 0 || (j53Var.f[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            i5 = i7;
                                            i6 = i10;
                                        } else {
                                            l20 l20Var = nv0Var2.h;
                                            synchronized (l20Var.i) {
                                                l20Var.p();
                                                i6 = i10;
                                                is1 is1Var = l20Var.s;
                                                l20Var.s = n32.j();
                                                try {
                                                    l20Var.A.g0(is1Var);
                                                } finally {
                                                }
                                            }
                                            gs gsVar = new gs();
                                            nv0Var2.L = gsVar;
                                            i53 i53VarC = nv0Var2.c.c();
                                            try {
                                                nv0Var2.G = i53VarC;
                                                d20 d20Var = nv0Var2.M;
                                                gs gsVar2 = d20Var.b;
                                                try {
                                                    d20Var.b = gsVar;
                                                    nv0Var2.P(0);
                                                    d20 d20Var2 = nv0Var2.M;
                                                    d20Var2.b();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (d20Var2.c) {
                                                            i53Var = i53VarC;
                                                            try {
                                                                d20Var2.b.k.S(h02.c);
                                                                if (d20Var2.c) {
                                                                    d20Var2.d(false);
                                                                    d20Var2.d(false);
                                                                    d20Var2.b.k.S(rz1.c);
                                                                    i5 = 0;
                                                                    d20Var2.c = false;
                                                                }
                                                                d20Var.b = gsVar2;
                                                                i53Var.c();
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                d20Var.b = gsVar2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            i53Var = i53VarC;
                                                        }
                                                        d20Var.b = gsVar2;
                                                        i53Var.c();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        i53Var.c();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i53Var = i53VarC;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                i53Var = i53VarC;
                                            }
                                        }
                                        nv0Var.b.r(nv0Var2.h);
                                    } else {
                                        jArr2 = jArr3;
                                        i5 = i7;
                                        i6 = i10;
                                    }
                                    j >>= i6;
                                    i12++;
                                    i10 = i6;
                                    i7 = i5;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                i4 = i7;
                                if (i11 != i10) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                i4 = i7;
                            }
                            if (i9 == length) {
                                break;
                            }
                            i9++;
                            i7 = i4;
                            jArr3 = jArr;
                        }
                    }
                }
                return i53Var2.o(i);
            }
            i3 = 1;
            if (!i53Var2.l(i)) {
                return i53Var2.o(i);
            }
        } else {
            i3 = 1;
            if (i53Var2.d(i)) {
                int i13 = i53Var2.b[(i * 5) + 3] + i;
                int iQ = 0;
                for (int i14 = i + 1; i14 < i13; i14 += i53Var2.b[(i14 * 5) + 3]) {
                    boolean zL = i53Var2.l(i14);
                    if (zL) {
                        nv0Var.M.c();
                        d20 d20Var3 = nv0Var.M;
                        Object objN = i53Var2.n(i14);
                        d20Var3.c();
                        d20Var3.h.add(objN);
                    }
                    iQ += Q(nv0Var, i14, zL || z, zL ? 0 : i2 + iQ);
                    if (zL) {
                        nv0Var.M.c();
                        nv0Var.M.a();
                    }
                }
                if (!i53Var2.l(i)) {
                    return iQ;
                }
            } else if (!i53Var2.l(i)) {
                return i53Var2.o(i);
            }
        }
        return i3;
    }

    public final boolean A() {
        if (!D() || this.w) {
            return true;
        }
        xj2 xj2VarZ = z();
        return (xj2VarZ == null || (xj2VarZ.b & 4) == 0) ? false : true;
    }

    public final j20 B() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean C() {
        return this.S;
    }

    public final boolean D() {
        xj2 xj2VarZ;
        return (this.S || this.y || this.w || (xj2VarZ = z()) == null || (xj2VarZ.b & 8) != 0) ? false : true;
    }

    public final void E(ArrayList arrayList) {
        nv0 nv0Var = this;
        gs gsVar = nv0Var.f;
        d20 d20Var = nv0Var.M;
        gs gsVar2 = d20Var.b;
        try {
            d20Var.b = gsVar;
            gsVar.k.S(f02.c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                r32 r32Var = (r32) arrayList.get(i);
                yq1 yq1Var = (yq1) r32Var.f;
                yq1Var.getClass();
                iv0 iv0VarK = pq.k(null);
                j53 j53VarD = l53.d(null);
                int iA = j53VarD.a(iv0VarK);
                n41 n41Var = new n41();
                d20Var.b();
                q02 q02Var = d20Var.b.k;
                q02Var.S(oz1.c);
                uq.J(q02Var, 0, n41Var, 1, iv0VarK);
                if (j53VarD == nv0Var.H) {
                    if (!nv0Var.I.w) {
                        e20.a("Check failed");
                    }
                    nv0Var.w();
                }
                i53 i53VarC = j53VarD.c();
                try {
                    i53VarC.r(iA);
                    d20Var.f = iA;
                    gs gsVar3 = new gs();
                    nv0Var.J(null, null, null, ni0.f, new ok(nv0Var, gsVar3, i53VarC, yq1Var));
                    gs gsVar4 = d20Var.b;
                    gsVar4.getClass();
                    if (!gsVar3.k.R()) {
                        q02 q02Var2 = gsVar4.k;
                        q02Var2.S(kz1.c);
                        uq.J(q02Var2, 0, gsVar3, 1, n41Var);
                    }
                    i53VarC.c();
                    d20Var.b.k.S(h02.c);
                    i++;
                    nv0Var = this;
                } catch (Throwable th) {
                    i53VarC.c();
                    throw th;
                }
            }
            d20Var.b();
            d20Var.b.k.S(sz1.c);
            d20Var.f = 0;
            d20Var.b = gsVar2;
        } catch (Throwable th2) {
            d20Var.b = gsVar2;
            throw th2;
        }
    }

    public final void F(n52 n52Var, Object obj) {
        Y(126665345, null);
        G();
        k0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                m53.z(this.I);
            }
            boolean z = (this.S || s51.n(this.G.f(), n52Var)) ? false : true;
            if (z) {
                M(n52Var);
            }
            V(202, 0, e20.c, n52Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            br.G(this, new d00(-59194059, new u(13, obj), true));
            this.w = z2;
        } finally {
        }
    }

    public final Object G() {
        boolean z = this.S;
        zj zjVar = c20.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof vn2)) {
                return objM;
            }
        } else if (this.r) {
            e20.a("A call to createNode(), emitNode() or useNode() expected");
            return zjVar;
        }
        return zjVar;
    }

    public final List H() {
        g20 g20Var = this.b;
        f20 f20VarH = g20Var.h();
        l20 l20Var = f20VarH != null ? (l20) f20VarH : null;
        if (l20Var != null) {
            j53 j53Var = l20Var.k;
            i53 i53VarC = l53.d(j53Var).c();
            try {
                Integer numR = pq.r(i53VarC, g20Var, 0, i53VarC.c);
                if (numR != null) {
                    i53VarC = l53.d(j53Var).c();
                    try {
                        ArrayList arrayListV = pq.V(i53VarC, numR.intValue(), 0);
                        i53VarC.c();
                        return qx.D0(arrayListV, l20Var.A.H());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return ni0.f;
    }

    public final int I(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:20:0x003c, B:22:0x0044, B:24:0x004a, B:25:0x004e, B:26:0x004f, B:28:0x0055, B:21:0x0040), top: B:33:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(defpackage.l20 r9, defpackage.l20 r10, java.lang.Integer r11, java.util.List r12, defpackage.cs0 r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            r32 r6 = (defpackage.r32) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.f     // Catch: java.lang.Throwable -> L24
            xj2 r7 = (defpackage.xj2) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.g     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.f0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L5e
        L26:
            r8.f0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L55
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L4f
            if (r10 == r9) goto L4f
            if (r11 < 0) goto L4f
            r9.w = r10     // Catch: java.lang.Throwable -> L24
            r9.x = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L49
            r9.w = r5     // Catch: java.lang.Throwable -> L24
            r9.x = r2     // Catch: java.lang.Throwable -> L24
            goto L53
        L49:
            r10 = move-exception
            r9.w = r5     // Catch: java.lang.Throwable -> L24
            r9.x = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L4f:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L24
        L53:
            if (r10 != 0) goto L59
        L55:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L24
        L59:
            r8.F = r0
            r8.k = r1
            return r10
        L5e:
            r8.F = r0
            r8.k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv0.J(l20, l20, java.lang.Integer, java.util.List, cs0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
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
    public final void K() {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv0.K():void");
    }

    public final void L() throws Throwable {
        int i;
        P(this.G.g);
        d20 d20Var = this.M;
        d20Var.d(false);
        q41 q41Var = d20Var.d;
        nv0 nv0Var = d20Var.a;
        i53 i53Var = nv0Var.G;
        if (i53Var.c > 0 && q41Var.a(-2) != (i = i53Var.i)) {
            if (!d20Var.c && d20Var.e) {
                d20Var.d(false);
                d20Var.b.k.S(vz1.c);
                d20Var.c = true;
            }
            if (i > 0) {
                iv0 iv0VarA = i53Var.a(i);
                q41Var.c(i);
                d20Var.d(false);
                q02 q02Var = d20Var.b.k;
                q02Var.S(uz1.c);
                uq.I(q02Var, 0, iv0VarA);
                d20Var.c = true;
            }
        }
        d20Var.b.k.S(d02.c);
        int i2 = d20Var.f;
        i53 i53Var2 = nv0Var.G;
        d20Var.f = i53Var2.b[(i53Var2.g * 5) + 3] + i2;
    }

    public final void M(n52 n52Var) {
        or1 or1Var = this.v;
        if (or1Var == null) {
            or1Var = new or1();
            this.v = or1Var;
        }
        or1Var.i(this.G.g, n52Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(int r7, int r8, int r9) {
        /*
            r6 = this;
            i53 r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            d20 r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv0.N(int, int, int):void");
    }

    public final Object O() {
        boolean z = this.S;
        zj zjVar = c20.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof vn2)) {
                return objM instanceof rv0 ? ((rv0) objM).a : objM;
            }
        } else if (this.r) {
            e20.a("A call to createNode(), emitNode() or useNode() expected");
            return zjVar;
        }
        return zjVar;
    }

    public final void P(int i) throws Throwable {
        boolean zL = this.G.l(i);
        d20 d20Var = this.M;
        if (zL) {
            d20Var.c();
            Object objN = this.G.n(i);
            d20Var.c();
            d20Var.h.add(objN);
        }
        Q(this, i, zL, 0);
        d20Var.c();
        if (zL) {
            d20Var.a();
        }
    }

    public final boolean R(int i, boolean z) {
        xj2 xj2VarZ;
        if ((i & 1) == 0 && (this.S || this.y)) {
            u33 u33Var = this.P;
            if (u33Var != null && (xj2VarZ = z()) != null && u33Var.a()) {
                int i2 = xj2VarZ.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                xj2VarZ.b = i3;
                xj2VarZ.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                q02 q02Var = this.M.b.k;
                q02Var.S(c02.c);
                uq.I(q02Var, 0, xj2VarZ);
                this.b.q(xj2VarZ);
                return false;
            }
        } else if (!z && D()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv0.S():void");
    }

    public final void T() {
        i53 i53Var = this.G;
        int i = i53Var.i;
        this.l = i >= 0 ? i53Var.b[(i * 5) + 1] & 67108863 : 0;
        i53Var.t();
    }

    public final void U() {
        if (this.l != 0) {
            e20.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        xj2 xj2VarZ = z();
        if (xj2VarZ != null) {
            int i = xj2VarZ.b;
            if ((i & 128) == 0) {
                xj2VarZ.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            T();
        } else {
            K();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(int r27, int r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv0.V(int, int, java.lang.Object, java.lang.Object):void");
    }

    public final void W() {
        V(-127, 0, null, null);
    }

    public final void X(int i, hz1 hz1Var) {
        V(i, 0, hz1Var, null);
    }

    public final void Y(int i, Object obj) {
        V(i, 0, obj, null);
    }

    public final void Z(Object obj, boolean z) {
        if (z) {
            i53 i53Var = this.G;
            if (i53Var.k <= 0) {
                if ((i53Var.b[(i53Var.g * 5) + 1] & 1073741824) == 0) {
                    yb2.a("Expected a node group");
                }
                i53Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            d20 d20Var = this.M;
            d20Var.getClass();
            d20Var.d(false);
            q02 q02Var = d20Var.b.k;
            q02Var.S(k02.c);
            uq.I(q02Var, 0, obj);
        }
        this.G.u();
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        qm0 qm0Var = this.O;
        qm0Var.l.P();
        qm0Var.k.P();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        i53 i53Var = this.G;
        if (!i53Var.f) {
            i53Var.c();
        }
        if (this.I.w) {
            return;
        }
        w();
    }

    public final void a0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            V(i, 0, null, null);
            return;
        }
        if (this.r) {
            e20.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        i53 i53Var = this.G;
        boolean z = this.S;
        zj zjVar = c20.a;
        if (z) {
            i53Var.k++;
            this.I.Q(zjVar, false, zjVar, i);
            v(false, null);
            return;
        }
        if (i53Var.g() == i && ((i3 = i53Var.g) >= i53Var.h || (i53Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            i53Var.u();
            v(false, null);
            return;
        }
        if (i53Var.k <= 0 && (i2 = i53Var.g) != i53Var.h) {
            int i4 = this.k;
            L();
            this.M.e(i4, i53Var.s());
            s51.k(this.s, i2, i53Var.g);
        }
        i53Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            m53 m53VarE = this.H.e();
            this.I = m53VarE;
            m53VarE.M();
            this.J = false;
            this.K = null;
        }
        m53 m53Var = this.I;
        m53Var.d();
        int i5 = m53Var.t;
        m53Var.Q(zjVar, false, zjVar, i);
        this.N = m53Var.b(i5);
        v(false, null);
    }

    public final void b(rs0 rs0Var, Object obj) {
        if (this.S) {
            q02 q02Var = this.O.k;
            q02Var.S(l02.c);
            uq.I(q02Var, 0, obj);
            cl3.i(2, rs0Var);
            uq.I(q02Var, 1, rs0Var);
            return;
        }
        d20 d20Var = this.M;
        d20Var.b();
        q02 q02Var2 = d20Var.b.k;
        q02Var2.S(l02.c);
        cl3.i(2, rs0Var);
        uq.J(q02Var2, 0, obj, 1, rs0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nv0 b0(int r7) {
        /*
            r6 = this;
            r6.a0(r7)
            boolean r7 = r6.S
            yl1 r0 = r6.g
            java.util.ArrayList r1 = r6.E
            l20 r2 = r6.h
            if (r7 == 0) goto L26
            xj2 r7 = new xj2
            r7.<init>(r2)
            r1.add(r7)
            r6.k0(r7)
            int r1 = r6.B
            r7.e = r1
            int r1 = r7.b
            r1 = r1 & (-17)
            r7.b = r1
            r0.v()
            return r6
        L26:
            i53 r7 = r6.G
            int r7 = r7.i
            java.util.ArrayList r3 = r6.s
            int r7 = defpackage.s51.u(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            b61 r7 = (defpackage.b61) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            i53 r3 = r6.G
            java.lang.Object r3 = r3.m()
            zj r4 = defpackage.c20.a
            boolean r4 = defpackage.s51.n(r3, r4)
            if (r4 == 0) goto L51
            xj2 r3 = new xj2
            r3.<init>(r2)
            r6.k0(r3)
            goto L56
        L51:
            r3.getClass()
            xj2 r3 = (defpackage.xj2) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.b
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.b = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.b
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.e = r7
            int r7 = r3.b
            r7 = r7 & (-17)
            r3.b = r7
            r0.v()
            int r7 = r3.b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lba
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.b = r7
            d20 r7 = r6.M
            gs r7 = r7.b
            q02 r7 = r7.k
            i02 r0 = defpackage.i02.c
            r7.S(r0)
            defpackage.uq.I(r7, r2, r3)
            boolean r7 = r6.y
            if (r7 != 0) goto Lba
            int r7 = r3.b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lba
            r6.y = r4
            i53 r0 = r6.G
            int r0 = r0.i
            r6.z = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.b = r7
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv0.b0(int):nv0");
    }

    public final boolean c(float f) {
        Object objG = G();
        if ((objG instanceof Float) && f == ((Number) objG).floatValue()) {
            return false;
        }
        k0(Float.valueOf(f));
        return true;
    }

    public final void c0(Object obj) {
        if (!this.S && this.G.g() == 207 && !s51.n(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        V(207, 0, null, obj);
    }

    public final boolean d(int i) {
        Object objG = G();
        if ((objG instanceof Integer) && i == ((Number) objG).intValue()) {
            return false;
        }
        k0(Integer.valueOf(i));
        return true;
    }

    public final void d0() {
        V(125, 2, null, null);
        this.r = true;
    }

    public final boolean e(long j) {
        Object objG = G();
        if ((objG instanceof Long) && j == ((Number) objG).longValue()) {
            return false;
        }
        k0(Long.valueOf(j));
        return true;
    }

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
    public final void e0() {
        this.m = 0;
        this.G = this.c.c();
        V(100, 0, null, null);
        g20 g20Var = this.b;
        g20Var.t();
        n52 n52VarI = g20Var.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(n52VarI);
        this.K = null;
        if (!this.q) {
            this.q = g20Var.e();
        }
        if (!this.C) {
            this.C = g20Var.f();
        }
        if (this.C) {
            r93 r93Var = k20.a;
            r93Var.getClass();
            n52VarI = n52VarI.d(r93Var, new s93(B()));
        }
        this.u = n52VarI;
        Set set = (Set) vp.Q(n52VarI, s31.a);
        if (set != null) {
            set.add(x());
            g20Var.o(set);
        }
        V(Long.hashCode(g20Var.g()), 0, null, null);
    }

    public final boolean f(Object obj) {
        if (s51.n(G(), obj)) {
            return false;
        }
        k0(obj);
        return true;
    }

    public final boolean f0(xj2 xj2Var, Object obj) {
        iv0 iv0Var = xj2Var.c;
        if (iv0Var == null) {
            return false;
        }
        int iA = this.G.a.a(pq.k(iv0Var));
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iU = s51.u(iA, arrayList);
        if (iU < 0) {
            int i = -(iU + 1);
            if (!(obj instanceof cb0)) {
                obj = null;
            }
            arrayList.add(i, new b61(xj2Var, iA, obj));
            return true;
        }
        b61 b61Var = (b61) arrayList.get(iU);
        if (!(obj instanceof cb0)) {
            b61Var.c = null;
            return true;
        }
        Object obj2 = b61Var.c;
        if (obj2 == null) {
            b61Var.c = obj;
            return true;
        }
        if (obj2 instanceof js1) {
            ((js1) obj2).a(obj);
            return true;
        }
        js1 js1Var = or2.a;
        js1 js1Var2 = new js1(2);
        js1Var2.k(obj2);
        js1Var2.k(obj);
        b61Var.c = js1Var2;
        return true;
    }

    public final boolean g(boolean z) {
        Object objG = G();
        if ((objG instanceof Boolean) && z == ((Boolean) objG).booleanValue()) {
            return false;
        }
        k0(Boolean.valueOf(z));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0(defpackage.is1 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r0 = r0.s
            int r2 = defpackage.vr.C(r0)
        La:
            r4 = -1
            if (r4 >= r2) goto L36
            java.lang.Object r4 = r0.get(r2)
            b61 r4 = (defpackage.b61) r4
            xj2 r5 = r4.a
            iv0 r5 = r5.c
            if (r5 == 0) goto L1e
            iv0 r3 = defpackage.pq.k(r5)
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L30
            boolean r5 = r3.a()
            if (r5 == 0) goto L30
            int r5 = r4.b
            int r3 = r3.a
            if (r5 == r3) goto L33
            r4.b = r3
            goto L33
        L30:
            r0.remove(r2)
        L33:
            int r2 = r2 + (-1)
            goto La
        L36:
            java.lang.Object[] r2 = r1.b
            java.lang.Object[] r4 = r1.c
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L96
            r6 = 0
            r7 = r6
        L43:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L91
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L5d:
            if (r12 >= r10) goto L8f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r4[r13]
            r14.getClass()
            xj2 r14 = (defpackage.xj2) r14
            iv0 r15 = r14.c
            if (r15 == 0) goto L8b
            iv0 r15 = defpackage.pq.k(r15)
            int r15 = r15.a
            m22 r3 = defpackage.m22.l
            if (r13 != r3) goto L83
            r13 = 0
        L83:
            b61 r3 = new b61
            r3.<init>(r14, r15, r13)
            r0.add(r3)
        L8b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L5d
        L8f:
            if (r10 != r11) goto L96
        L91:
            if (r7 == r5) goto L96
            int r7 = r7 + 1
            goto L43
        L96:
            ya r1 = defpackage.s51.l
            defpackage.ux.e0(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv0.g0(is1):void");
    }

    public final boolean h(Object obj) {
        if (G() == obj) {
            return false;
        }
        k0(obj);
        return true;
    }

    public final void h0(int i, int i2) {
        if (l0(i) != i2) {
            if (i < 0) {
                mr1 mr1Var = this.p;
                if (mr1Var == null) {
                    mr1Var = new mr1();
                    this.p = mr1Var;
                }
                mr1Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        d20 d20Var = this.M;
        d20Var.c = false;
        d20Var.d.b = 0;
        d20Var.f = 0;
        d20Var.e = true;
        d20Var.g = 0;
        d20Var.h.clear();
        d20Var.i = -1;
        d20Var.j = -1;
        d20Var.k = -1;
        d20Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0(int i, int i2) {
        int iL0 = l0(i);
        if (iL0 != i2) {
            int i3 = i2 - iL0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iL02 = l0(i) + i3;
                h0(i, iL02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        qv0 qv0Var = (qv0) arrayList.get(i4);
                        if (qv0Var != null && qv0Var.a(i, iL02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                i53 i53Var = this.G;
                if (i < 0) {
                    i = i53Var.i;
                } else if (i53Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final Object j(ee2 ee2Var) {
        return vp.Q(l(), ee2Var);
    }

    public final void j0(Object obj) {
        if (obj instanceof al2) {
            rv0 rv0Var = new rv0((al2) obj, this.m - 1);
            if (this.S) {
                q02 q02Var = this.M.b.k;
                q02Var.S(b02.c);
                uq.I(q02Var, 0, rv0Var);
            }
            this.d.add(obj);
            obj = rv0Var;
        }
        k0(obj);
    }

    public final void k(cs0 cs0Var) {
        if (!this.r) {
            e20.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            e20.a("createNode() can only be called when inserting");
        }
        q41 q41Var = this.n;
        int i = q41Var.a[q41Var.b - 1];
        m53 m53Var = this.I;
        iv0 iv0VarB = m53Var.b(m53Var.v);
        this.l++;
        qm0 qm0Var = this.O;
        q02 q02Var = qm0Var.k;
        q02Var.S(wz1.d);
        uq.I(q02Var, 0, cs0Var);
        q02Var.m[q02Var.n - q02Var.k[q02Var.l - 1].a] = i;
        uq.I(q02Var, 1, iv0VarB);
        q02 q02Var2 = qm0Var.l;
        q02Var2.S(wz1.e);
        q02Var2.m[q02Var2.n - q02Var2.k[q02Var2.l - 1].a] = i;
        uq.I(q02Var2, 0, iv0VarB);
    }

    public final void k0(Object obj) {
        if (this.S) {
            m53 m53Var = this.I;
            if (m53Var.n <= 0 || m53Var.i == m53Var.k) {
                m53Var.F(obj);
                return;
            }
            or1 or1Var = m53Var.s;
            if (or1Var == null) {
                or1Var = new or1();
            }
            m53Var.s = or1Var;
            int i = m53Var.v;
            Object objB = or1Var.b(i);
            if (objB == null) {
                objB = new as1();
                or1Var.i(i, objB);
            }
            ((as1) objB).b(obj);
            return;
        }
        i53 i53Var = this.G;
        boolean z = i53Var.n;
        d20 d20Var = this.M;
        if (!z) {
            iv0 iv0VarA = i53Var.a(i53Var.i);
            q02 q02Var = d20Var.b.k;
            q02Var.S(jz1.c);
            uq.J(q02Var, 0, iv0VarA, 1, obj);
            return;
        }
        int iB = (i53Var.l - l53.b(i53Var.b, i53Var.i)) - 1;
        if (d20Var.a.G.i - d20Var.f >= 0) {
            d20Var.d(true);
            q02 q02Var2 = d20Var.b.k;
            q02Var2.S(wz1.g);
            uq.I(q02Var2, 0, obj);
            q02Var2.m[q02Var2.n - q02Var2.k[q02Var2.l - 1].a] = iB;
            return;
        }
        i53 i53Var2 = this.G;
        iv0 iv0VarA2 = i53Var2.a(i53Var2.i);
        q02 q02Var3 = d20Var.b.k;
        q02Var3.S(wz1.f);
        uq.J(q02Var3, 0, obj, 1, iv0VarA2);
        q02Var3.m[q02Var3.n - q02Var3.k[q02Var3.l - 1].a] = iB;
    }

    public final n52 l() {
        n52 n52Var;
        n52 n52Var2 = this.K;
        if (n52Var2 != null) {
            return n52Var2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        hz1 hz1Var = e20.c;
        if (z && this.J) {
            int iE = this.I.v;
            while (iE > 0) {
                if (this.I.s(iE) == 202 && s51.n(this.I.t(iE), hz1Var)) {
                    Object objQ = this.I.q(iE);
                    objQ.getClass();
                    n52 n52Var3 = (n52) objQ;
                    this.K = n52Var3;
                    return n52Var3;
                }
                m53 m53Var = this.I;
                iE = m53Var.E(m53Var.b, iE);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    i53 i53Var = this.G;
                    if (s51.n(i53Var.p(i53Var.b, iQ), hz1Var)) {
                        or1 or1Var = this.v;
                        if (or1Var == null || (n52Var = (n52) or1Var.b(iQ)) == null) {
                            i53 i53Var2 = this.G;
                            Object objB = i53Var2.b(i53Var2.b, iQ);
                            objB.getClass();
                            n52Var = (n52) objB;
                        }
                        this.K = n52Var;
                        return n52Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        n52 n52Var4 = this.u;
        this.K = n52Var4;
        return n52Var4;
    }

    public final int l0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        mr1 mr1Var = this.p;
        if (mr1Var != null && mr1Var.c(i) >= 0) {
            int iC = mr1Var.c(i);
            if (iC >= 0) {
                return mr1Var.c[iC];
            }
            c.m(by1.e(i, "Cannot find value for key "));
        }
        return 0;
    }

    public final t10 m() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        ai1 ai1VarX = vr.x();
        m53 m53Var = this.I;
        ai1VarX.addAll(pq.l(m53Var, null, m53Var.t, null));
        i53 i53Var = this.G;
        boolean z = i53Var.f;
        int[] iArr = i53Var.b;
        if (z || i53Var.c == 0) {
            collection = ni0.f;
        } else {
            aj2 aj2Var = new aj2(i53Var);
            int iQ = i53Var.i;
            Object objValueOf = Integer.valueOf(i53Var.l - l53.b(iArr, iQ));
            while (iQ >= 0) {
                aj2Var.j(i53Var.i(iQ), i53Var.k(iQ) ? i53Var.p(iArr, iQ) : c20.a, i53Var.a.g(iQ), objValueOf);
                objValueOf = i53Var.a(iQ);
                iQ = i53Var.q(iQ);
            }
            collection = (ArrayList) aj2Var.a;
        }
        ai1VarX.addAll(collection);
        ai1VarX.addAll(H());
        return new t10(vr.r(ai1VarX), this.C);
    }

    public final void m0() {
        if (!this.r) {
            e20.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            e20.a("useNode() called while inserting");
        }
        i53 i53Var = this.G;
        Object objN = i53Var.n(i53Var.i);
        d20 d20Var = this.M;
        d20Var.c();
        d20Var.h.add(objN);
        if (this.y && (objN instanceof j10)) {
            d20Var.b();
            d20Var.b.k.S(n02.c);
        }
    }

    public final void n(is1 is1Var, rs0 rs0Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            e20.a("Reentrant composition is not supported");
        }
        this.g.v();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(a73.j().g());
            this.v = null;
            g0(is1Var);
            this.k = 0;
            this.F = true;
            try {
                e0();
                Object objG = G();
                if (objG != rs0Var && rs0Var != null) {
                    k0(rs0Var);
                }
                mv0 mv0Var = this.D;
                qs1 qs1VarI = b32.i();
                try {
                    qs1VarI.b(mv0Var);
                    hz1 hz1Var = e20.a;
                    if (rs0Var != null) {
                        X(200, hz1Var);
                        br.G(this, rs0Var);
                        p(false);
                    } else if (!this.w || objG == null || objG.equals(c20.a)) {
                        S();
                    } else {
                        X(200, hz1Var);
                        cl3.i(2, objG);
                        br.G(this, (rs0) objG);
                        p(false);
                    }
                    qs1VarI.k(qs1VarI.h - 1);
                    u();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        e20.a("Check failed");
                    }
                    w();
                } catch (Throwable th) {
                    qs1VarI.k(qs1VarI.h - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            d20 d20Var = this.M;
            d20Var.c();
            d20Var.h.add(objN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x050c  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r43) {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv0.p(boolean):void");
    }

    public final void q() {
        p(false);
        xj2 xj2VarZ = z();
        if (xj2VarZ != null) {
            int i = xj2VarZ.b;
            if ((i & 1) != 0) {
                xj2VarZ.b = i | 2;
            }
        }
    }

    public final void r() {
        p(true);
    }

    public final void s() {
        p(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[EDGE_INSN: B:61:0x0085->B:29:0x0085 BREAK  A[LOOP:0: B:16:0x003f->B:28:0x0081], EDGE_INSN: B:62:0x0085->B:29:0x0085 BREAK  A[LOOP:0: B:16:0x003f->B:28:0x0081]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xj2 t() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv0.t():xj2");
    }

    public final void u() {
        p(false);
        this.b.c();
        p(false);
        d20 d20Var = this.M;
        if (d20Var.c) {
            d20Var.d(false);
            d20Var.d(false);
            d20Var.b.k.S(rz1.c);
            d20Var.c = false;
        }
        d20Var.b();
        if (d20Var.d.b != 0) {
            e20.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            e20.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void v(boolean z, qv0 qv0Var) {
        this.i.add(this.j);
        this.j = qv0Var;
        int i = this.l;
        q41 q41Var = this.n;
        q41Var.c(i);
        q41Var.c(this.m);
        q41Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void w() {
        j53 j53Var = new j53();
        if (this.C) {
            j53Var.b();
        }
        if (this.b.d()) {
            j53Var.p = new or1();
        }
        this.H = j53Var;
        m53 m53VarE = j53Var.e();
        m53VarE.e(true);
        this.I = m53VarE;
    }

    public final i20 x() {
        ov0 ov0Var = this.U;
        if (ov0Var != null) {
            return ov0Var;
        }
        ov0 ov0Var2 = new ov0(this.h);
        this.U = ov0Var2;
        return ov0Var2;
    }

    public final n52 y() {
        return l();
    }

    public final xj2 z() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (xj2) arrayList.get(arrayList.size() - 1);
    }
}
