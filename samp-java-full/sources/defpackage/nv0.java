package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final Object J(l20 l20Var, l20 l20Var2, Integer num, List list, cs0 cs0Var) {
        Object objA;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                r32 r32Var = (r32) list.get(i2);
                xj2 xj2Var = (xj2) r32Var.f;
                Object obj = r32Var.g;
                if (obj != null) {
                    f0(xj2Var, obj);
                } else {
                    f0(xj2Var, null);
                }
            }
            if (l20Var == null) {
                objA = cs0Var.a();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (l20Var2 == null || l20Var2 == l20Var || iIntValue < 0) {
                    objA = cs0Var.a();
                } else {
                    l20Var.w = l20Var2;
                    l20Var.x = iIntValue;
                    try {
                        objA = cs0Var.a();
                        l20Var.w = null;
                        l20Var.x = 0;
                    } catch (Throwable th) {
                        l20Var.w = null;
                        l20Var.x = 0;
                        throw th;
                    }
                }
                if (objA == null) {
                }
            }
            this.F = z;
            this.k = i;
            return objA;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
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
    */
    public final void K() {
        b61 b61Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        boolean z;
        wr1 wr1Var;
        long j2;
        int iU;
        int i8;
        int iHashCode;
        Object objB;
        m22 m22Var = m22.u;
        boolean z2 = this.F;
        this.F = true;
        i53 i53Var = this.G;
        int i9 = i53Var.i;
        int i10 = (i9 * 5) + 3;
        int i11 = i53Var.b[i10] + i9;
        int i12 = this.k;
        long j3 = this.T;
        int i13 = this.l;
        int i14 = this.m;
        int i15 = i53Var.g;
        ArrayList arrayList = this.s;
        int iU2 = s51.u(i15, arrayList);
        if (iU2 < 0) {
            iU2 = -(iU2 + 1);
        }
        if (iU2 < arrayList.size()) {
            b61Var = (b61) arrayList.get(iU2);
            if (b61Var.b >= i11) {
                b61Var = null;
            }
        }
        int i16 = 1;
        int i17 = i9;
        int i18 = 0;
        while (b61Var != null) {
            xj2 xj2Var = b61Var.a;
            int i19 = b61Var.b;
            m22 m22Var2 = m22Var;
            int iU3 = s51.u(i19, arrayList);
            if (iU3 >= 0) {
            }
            Object obj = b61Var.c;
            if (obj == null) {
                xj2Var.getClass();
                i3 = i11;
                i = i10;
                i2 = i12;
            } else {
                int i20 = 8;
                is1 is1Var = xj2Var.g;
                if (is1Var == null) {
                    i3 = i11;
                    i = i10;
                    i2 = i12;
                } else {
                    i = i10;
                    if (obj instanceof cb0) {
                        cb0 cb0Var = (cb0) obj;
                        h73 h73Var = cb0Var.h;
                        if (h73Var == null) {
                            h73Var = m22Var2;
                        }
                        i2 = i12;
                        i6 = !h73Var.d(cb0Var.h().f, is1Var.g(cb0Var)) ? 1 : 0;
                        i3 = i11;
                        i4 = i13;
                        i5 = i14;
                    } else {
                        i2 = i12;
                        if (obj instanceof js1) {
                            js1 js1Var = (js1) obj;
                            if (js1Var.h()) {
                                Object[] objArr = js1Var.b;
                                long[] jArr = js1Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    i4 = i13;
                                    i5 = i14;
                                    int i21 = 0;
                                    while (true) {
                                        long j4 = jArr[i21];
                                        i3 = i11;
                                        Object[] objArr2 = objArr;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j4 & 255) < 128) {
                                                    i7 = i23;
                                                    Object obj2 = objArr2[(i21 << 3) + i23];
                                                    j = j4;
                                                    if (!(obj2 instanceof cb0)) {
                                                        break;
                                                    }
                                                    cb0 cb0Var2 = (cb0) obj2;
                                                    h73 h73Var2 = cb0Var2.h;
                                                    if (h73Var2 == null) {
                                                        h73Var2 = m22Var2;
                                                    }
                                                    if (!h73Var2.d(cb0Var2.h().f, is1Var.g(cb0Var2))) {
                                                        break;
                                                    }
                                                } else {
                                                    i7 = i23;
                                                    j = j4;
                                                }
                                                j4 = j >> i20;
                                                i23 = i7 + 1;
                                            }
                                            if (i22 != i20) {
                                                break;
                                            }
                                            if (i21 == length) {
                                                break;
                                            }
                                            i21++;
                                            i11 = i3;
                                            objArr = objArr2;
                                            i20 = 8;
                                        }
                                    }
                                } else {
                                    i3 = i11;
                                    i4 = i13;
                                    i5 = i14;
                                }
                                i6 = 0;
                            }
                        } else {
                            i3 = i11;
                        }
                    }
                    if (i6 == 0) {
                        this.G.r(i19);
                        int i24 = this.G.g;
                        N(i17, i24, i9);
                        int iQ = this.G.q(i24);
                        while (iQ != i9 && !this.G.l(iQ)) {
                            iQ = this.G.q(iQ);
                        }
                        int iL0 = this.G.l(iQ) ? 0 : i2;
                        if (iQ != i24) {
                            int iL02 = (l0(iQ) - this.G.o(i24)) + iL0;
                            while (iL0 < iL02 && iQ != i19) {
                                iQ++;
                                while (iQ < i19) {
                                    i53 i53Var2 = this.G;
                                    int i25 = i53Var2.b[(iQ * 5) + 3] + iQ;
                                    if (i19 >= i25) {
                                        iL0 += i53Var2.l(iQ) ? i16 : l0(iQ);
                                        iQ = i25;
                                    }
                                }
                                break;
                            }
                        }
                        this.k = iL0;
                        this.m = I(i24);
                        int iQ2 = this.G.q(i24);
                        long jRotateLeft = 0;
                        int i26 = 3;
                        int i27 = 0;
                        while (true) {
                            if (iQ2 < 0) {
                                break;
                            }
                            if (iQ2 == i9) {
                                jRotateLeft ^= Long.rotateLeft(j3, i27);
                                break;
                            }
                            i53 i53Var3 = this.G;
                            boolean zK = i53Var3.k(iQ2);
                            int[] iArr = i53Var3.b;
                            if (zK) {
                                Object objP = i53Var3.p(iArr, iQ2);
                                if (objP != null) {
                                    iHashCode = objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode();
                                    i8 = i24;
                                } else {
                                    i8 = i24;
                                    iHashCode = 0;
                                }
                            } else {
                                int i28 = i53Var3.i(iQ2);
                                i8 = i24;
                                iHashCode = (i28 != 207 || (objB = i53Var3.b(iArr, iQ2)) == null || objB.equals(c20.a)) ? i28 : objB.hashCode();
                            }
                            if (iHashCode == 126665345) {
                                jRotateLeft ^= Long.rotateLeft(iHashCode, i27);
                                break;
                            }
                            jRotateLeft = (jRotateLeft ^ Long.rotateLeft(iHashCode, i26)) ^ Long.rotateLeft(this.G.k(iQ2) ? 0 : I(iQ2), i27);
                            i26 = (i26 + 6) % 64;
                            i27 = (i27 + 6) % 64;
                            iQ2 = this.G.q(iQ2);
                            i24 = i8;
                        }
                        this.T = jRotateLeft;
                        this.K = null;
                        rs0 rs0Var = xj2Var.d;
                        if (rs0Var == null) {
                            c.q("Invalid restart scope");
                            return;
                        }
                        rs0Var.f(this, Integer.valueOf(i16));
                        this.K = null;
                        i53 i53Var4 = this.G;
                        int i29 = i53Var4.b[i] + i9;
                        int i30 = i53Var4.g;
                        if (i30 < i9 || i30 > i29) {
                            e20.a("Index " + i9 + " is not a parent of " + i30);
                        }
                        i53Var4.i = i9;
                        i53Var4.h = i29;
                        i53Var4.l = 0;
                        i53Var4.m = 0;
                        z = z2;
                        i17 = i8;
                        i18 = i16;
                    } else {
                        ArrayList arrayList2 = this.E;
                        arrayList2.add(xj2Var);
                        this.g.v();
                        l20 l20Var = xj2Var.a;
                        if (l20Var == null || (wr1Var = xj2Var.f) == null) {
                            z = z2;
                        } else {
                            xj2Var.d(i16);
                            try {
                                Object[] objArr3 = wr1Var.b;
                                int[] iArr2 = wr1Var.c;
                                long[] jArr2 = wr1Var.a;
                                int length2 = jArr2.length - 2;
                                z = z2;
                                if (length2 >= 0) {
                                    int i31 = 0;
                                    while (true) {
                                        long j5 = jArr2[i31];
                                        long[] jArr3 = jArr2;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i32 = 8 - ((~(i31 - length2)) >>> 31);
                                            int i33 = 0;
                                            while (i33 < i32) {
                                                if ((j5 & 255) < 128) {
                                                    int i34 = (i31 << 3) + i33;
                                                    j2 = j5;
                                                    Object obj3 = objArr4[i34];
                                                    int i35 = iArr2[i34];
                                                    l20Var.y(obj3);
                                                } else {
                                                    j2 = j5;
                                                }
                                                i33++;
                                                j5 = j2 >> 8;
                                            }
                                            if (i32 != 8) {
                                                break;
                                            }
                                        }
                                        if (i31 == length2) {
                                            break;
                                        }
                                        i31++;
                                        objArr3 = objArr4;
                                        jArr2 = jArr3;
                                    }
                                }
                                xj2Var.d(false);
                            } catch (Throwable th) {
                                xj2Var.d(false);
                                throw th;
                            }
                        }
                        i16 = 1;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    iU = s51.u(this.G.g, arrayList);
                    if (iU < 0) {
                        iU = -(iU + 1);
                    }
                    if (iU >= arrayList.size()) {
                        b61 b61Var2 = (b61) arrayList.get(iU);
                        i11 = i3;
                        b61Var = b61Var2.b < i11 ? b61Var2 : null;
                        z2 = z;
                        m22Var = m22Var2;
                        i10 = i;
                        i12 = i2;
                        i13 = i4;
                        i14 = i5;
                    } else {
                        i11 = i3;
                    }
                    z2 = z;
                    m22Var = m22Var2;
                    i10 = i;
                    i12 = i2;
                    i13 = i4;
                    i14 = i5;
                }
            }
            i4 = i13;
            i5 = i14;
            i6 = i16;
            if (i6 == 0) {
            }
            iU = s51.u(this.G.g, arrayList);
            if (iU < 0) {
            }
            if (iU >= arrayList.size()) {
            }
            z2 = z;
            m22Var = m22Var2;
            i10 = i;
            i12 = i2;
            i13 = i4;
            i14 = i5;
        }
        boolean z3 = z2;
        int i36 = i12;
        int i37 = i13;
        int i38 = i14;
        if (i18 != 0) {
            N(i17, i9, i9);
            this.G.t();
            int iL03 = l0(i9);
            this.k = i36 + iL03;
            this.l = i37 + iL03;
            this.m = i38;
        } else {
            T();
        }
        this.T = j3;
        this.F = z3;
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
    */
    public final void N(int i, int i2, int i3) {
        i53 i53Var = this.G;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (i53Var.q(i) == i2) {
                    i3 = i2;
                } else if (i53Var.q(i2) == i) {
                    i3 = i;
                } else if (i53Var.q(i) == i53Var.q(i2)) {
                    i3 = i53Var.q(i);
                } else {
                    int iQ = i;
                    int i4 = 0;
                    while (iQ > 0 && iQ != i3) {
                        iQ = i53Var.q(iQ);
                        i4++;
                    }
                    int iQ2 = i2;
                    int i5 = 0;
                    while (iQ2 > 0 && iQ2 != i3) {
                        iQ2 = i53Var.q(iQ2);
                        i5++;
                    }
                    int i6 = i4 - i5;
                    int iQ3 = i;
                    for (int i7 = 0; i7 < i6; i7++) {
                        iQ3 = i53Var.q(iQ3);
                    }
                    int i8 = i5 - i4;
                    int iQ4 = i2;
                    for (int i9 = 0; i9 < i8; i9++) {
                        iQ4 = i53Var.q(iQ4);
                    }
                    i3 = iQ3;
                    for (int iQ5 = iQ4; i3 != iQ5; iQ5 = i53Var.q(iQ5)) {
                        i3 = i53Var.q(i3);
                    }
                }
            }
        }
        while (i > 0 && i != i3) {
            if (i53Var.l(i)) {
                this.M.a();
            }
            i = i53Var.q(i);
        }
        o(i2, i3);
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
    */
    public final void S() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        i53 i53Var = this.G;
        int iG = i53Var.g();
        int[] iArr = i53Var.b;
        int i = i53Var.g;
        Object objP = i < i53Var.h ? i53Var.p(iArr, i) : null;
        Object objF = i53Var.f();
        int i2 = this.m;
        zj zjVar = c20.a;
        if (objP != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        } else {
            if (objF != null && iG == 207 && !objF.equals(zjVar)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
                Z(null, (iArr[(i53Var.g * 5) + 1] & 1073741824) != 0);
                K();
                i53Var.e();
                if (objP == null) {
                    if (objP instanceof Enum) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                        return;
                    } else {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                        return;
                    }
                }
                if (objF == null || iG != 207 || objF.equals(zjVar)) {
                    this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
                    return;
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                    return;
                }
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
        }
        this.T = jRotateLeft;
        Z(null, (iArr[(i53Var.g * 5) + 1] & 1073741824) != 0);
        K();
        i53Var.e();
        if (objP == null) {
        }
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
    */
    public final void V(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        qv0 qv0Var;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Object obj3 = obj;
        if (this.r) {
            e20.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i9 = this.m;
        Object obj4 = c20.a;
        if (obj3 != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode())), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i9);
                if (obj3 == null) {
                    this.m++;
                }
                boolean z3 = i2 == 0;
                if (!this.S) {
                    this.G.k++;
                    m53 m53Var = this.I;
                    int i10 = m53Var.t;
                    if (z3) {
                        m53Var.Q(obj4, true, obj4, i);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        m53Var.Q(obj3, false, obj2, i);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        m53Var.Q(obj3, false, obj4, i);
                    }
                    qv0 qv0Var2 = this.j;
                    if (qv0Var2 != null) {
                        int i11 = (-2) - i10;
                        g71 g71Var = new g71(-1, i, i11, -1);
                        qv0Var2.e.i(i11, new cx0(-1, this.k - qv0Var2.b, 0));
                        qv0Var2.d.add(g71Var);
                    }
                    v(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.y;
                if (this.j == null) {
                    int iG = this.G.g();
                    if (!z4 && iG == i) {
                        i53 i53Var = this.G;
                        int i12 = i53Var.g;
                        if (s51.n(obj3, i12 < i53Var.h ? i53Var.p(i53Var.b, i12) : null)) {
                            Z(obj2, z3);
                            z = z4;
                        }
                    }
                    i53 i53Var2 = this.G;
                    int[] iArr = i53Var2.b;
                    ArrayList arrayList = new ArrayList();
                    if (i53Var2.k <= 0) {
                        int i13 = i53Var2.g;
                        while (i13 < i53Var2.h) {
                            int i14 = i13 * 5;
                            int i15 = iArr[i14];
                            Object objP = i53Var2.p(iArr, i13);
                            int i16 = iArr[i14 + 1];
                            if ((i16 & 1073741824) != 0) {
                                z2 = z4;
                                i8 = 1;
                            } else {
                                z2 = z4;
                                i8 = i16 & 67108863;
                            }
                            arrayList.add(new g71(objP, i15, i13, i8));
                            i13 += iArr[i14 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.j = new qv0(this.k, arrayList);
                } else {
                    z = z4;
                }
                qv0 qv0Var3 = this.j;
                if (qv0Var3 != null) {
                    ArrayList arrayList2 = qv0Var3.d;
                    or1 or1Var = qv0Var3.e;
                    int i17 = qv0Var3.b;
                    Object r61Var = obj3 != null ? new r61(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                    is1 is1Var = ((jr1) qv0Var3.f.getValue()).a;
                    Object objG = is1Var.g(r61Var);
                    if (objG == null) {
                        objG = null;
                    } else if (objG instanceof as1) {
                        as1 as1Var = (as1) objG;
                        Object objL = as1Var.l(0);
                        if (as1Var.i()) {
                            is1Var.k(r61Var);
                        }
                        if (as1Var.b == 1) {
                            is1Var.m(r61Var, as1Var.f());
                        }
                        objG = objL;
                    } else {
                        is1Var.k(r61Var);
                    }
                    g71 g71Var2 = (g71) objG;
                    if (z || g71Var2 == null) {
                        this.G.k++;
                        this.S = true;
                        this.K = null;
                        if (this.I.w) {
                            m53 m53VarE = this.H.e();
                            this.I = m53VarE;
                            m53VarE.M();
                            this.J = false;
                            this.K = null;
                        }
                        this.I.d();
                        m53 m53Var2 = this.I;
                        int i18 = m53Var2.t;
                        if (z3) {
                            m53Var2.Q(obj4, true, obj4, i);
                            i3 = 0;
                        } else if (obj2 != null) {
                            if (obj != null) {
                                obj4 = obj;
                            }
                            i3 = 0;
                            m53Var2.Q(obj4, false, obj2, i);
                        } else {
                            i3 = 0;
                            m53Var2.Q(obj == null ? obj4 : obj, false, obj4, i);
                        }
                        this.N = this.I.b(i18);
                        int i19 = (-2) - i18;
                        g71 g71Var3 = new g71(-1, i, i19, -1);
                        or1Var.i(i19, new cx0(-1, this.k - i17, i3));
                        arrayList2.add(g71Var3);
                        qv0Var = new qv0(z3 ? i3 : this.k, new ArrayList());
                    } else {
                        int i20 = g71Var2.c;
                        arrayList2.add(g71Var2);
                        cx0 cx0Var = (cx0) or1Var.b(i20);
                        this.k = (cx0Var != null ? cx0Var.b : -1) + i17;
                        cx0 cx0Var2 = (cx0) or1Var.b(i20);
                        int i21 = cx0Var2 != null ? cx0Var2.a : -1;
                        int i22 = qv0Var3.c;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = or1Var.c;
                            long[] jArr = or1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) < 128) {
                                                i7 = i24;
                                                cx0 cx0Var3 = (cx0) objArr3[(i25 << 3) + i27];
                                                i6 = i23;
                                                int i28 = cx0Var3.a;
                                                if (i28 == i21) {
                                                    cx0Var3.a = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    cx0Var3.a = i28 + 1;
                                                }
                                            } else {
                                                i6 = i23;
                                                i7 = i24;
                                            }
                                            j >>= i7;
                                            i27++;
                                            i23 = i6;
                                            i24 = i7;
                                        }
                                        i4 = i23;
                                        if (i26 != i24) {
                                            break;
                                        }
                                    } else {
                                        i4 = i23;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    i23 = i4;
                                    i24 = 8;
                                }
                            } else {
                                i4 = i23;
                            }
                        } else {
                            i4 = i23;
                            if (i22 > i21) {
                                Object[] objArr4 = or1Var.c;
                                long[] jArr2 = or1Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j2 = jArr2[i29];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j2 & 255) >= 128) {
                                                    objArr2 = objArr4;
                                                } else {
                                                    cx0 cx0Var4 = (cx0) objArr4[(i29 << 3) + i31];
                                                    int i32 = cx0Var4.a;
                                                    if (i32 == i21) {
                                                        cx0Var4.a = i22;
                                                        objArr2 = objArr4;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            cx0Var4.a = i32 - 1;
                                                        }
                                                    }
                                                }
                                                j2 >>= 8;
                                                i31++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        d20 d20Var = this.M;
                        int i33 = d20Var.f;
                        nv0 nv0Var = d20Var.a;
                        d20Var.f = (i20 - nv0Var.G.g) + i33;
                        this.G.r(i20);
                        if (i4 > 0) {
                            d20Var.d(false);
                            q41 q41Var = d20Var.d;
                            i53 i53Var3 = nv0Var.G;
                            if (i53Var3.c > 0 && q41Var.a(-2) != (i5 = i53Var3.i)) {
                                if (!d20Var.c && d20Var.e) {
                                    d20Var.d(false);
                                    d20Var.b.k.S(vz1.c);
                                    d20Var.c = true;
                                }
                                if (i5 > 0) {
                                    iv0 iv0VarA = i53Var3.a(i5);
                                    q41Var.c(i5);
                                    d20Var.d(false);
                                    q02 q02Var = d20Var.b.k;
                                    q02Var.S(uz1.c);
                                    uq.I(q02Var, 0, iv0VarA);
                                    d20Var.c = true;
                                }
                            }
                            q02 q02Var2 = d20Var.b.k;
                            q02Var2.S(zz1.c);
                            q02Var2.m[q02Var2.n - q02Var2.k[q02Var2.l - 1].a] = i4;
                        }
                        Z(obj2, z3);
                        qv0Var = null;
                    }
                } else {
                    qv0Var = null;
                }
                v(z3, qv0Var);
                return;
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i9);
        }
        this.T = jRotateLeft;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.S) {
        }
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
    */
    public final nv0 b0(int i) {
        xj2 xj2Var;
        boolean z;
        a0(i);
        boolean z2 = this.S;
        yl1 yl1Var = this.g;
        ArrayList arrayList = this.E;
        l20 l20Var = this.h;
        if (z2) {
            xj2 xj2Var2 = new xj2(l20Var);
            arrayList.add(xj2Var2);
            k0(xj2Var2);
            xj2Var2.e = this.B;
            xj2Var2.b &= -17;
            yl1Var.v();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iU = s51.u(i2, arrayList2);
        b61 b61Var = iU >= 0 ? (b61) arrayList2.remove(iU) : null;
        Object objM = this.G.m();
        if (s51.n(objM, c20.a)) {
            xj2Var = new xj2(l20Var);
            k0(xj2Var);
        } else {
            objM.getClass();
            xj2Var = (xj2) objM;
        }
        if (b61Var == null) {
            int i3 = xj2Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                xj2Var.b = i3 & (-65);
            }
            z = z3;
        }
        int i4 = xj2Var.b;
        xj2Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(xj2Var);
        xj2Var.e = this.B;
        xj2Var.b &= -17;
        yl1Var.v();
        int i5 = xj2Var.b;
        if ((i5 & 256) != 0) {
            xj2Var.b = (i5 & (-257)) | 512;
            q02 q02Var = this.M.b.k;
            q02Var.S(i02.c);
            uq.I(q02Var, 0, xj2Var);
            if (!this.y) {
                int i6 = xj2Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    xj2Var.b = i6 | 1024;
                }
            }
        }
        return this;
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
    */
    public final void g0(is1 is1Var) {
        ArrayList arrayList = this.s;
        for (int iC = vr.C(arrayList); -1 < iC; iC--) {
            b61 b61Var = (b61) arrayList.get(iC);
            iv0 iv0Var = b61Var.a.c;
            iv0 iv0VarK = iv0Var != null ? pq.k(iv0Var) : null;
            if (iv0VarK == null || !iv0VarK.a()) {
                arrayList.remove(iC);
            } else {
                int i = b61Var.b;
                int i2 = iv0VarK.a;
                if (i != i2) {
                    b61Var.b = i2;
                }
            }
        }
        Object[] objArr = is1Var.b;
        Object[] objArr2 = is1Var.c;
        long[] jArr = is1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            xj2 xj2Var = (xj2) obj;
                            iv0 iv0Var2 = xj2Var.c;
                            if (iv0Var2 != null) {
                                int i7 = pq.k(iv0Var2).a;
                                if (obj2 == m22.l) {
                                    obj2 = null;
                                }
                                arrayList.add(new b61(xj2Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        ux.e0(arrayList, s51.l);
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
    */
    public final void p(boolean z) {
        long jRotateRight;
        q41 q41Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        q41 q41Var2;
        int i7;
        int i8;
        ArrayList arrayList2;
        js1 js1Var;
        int i9;
        int i10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i11;
        qv0 qv0Var;
        int i12;
        Object[] objArr;
        long[] jArr;
        int i13;
        Object[] objArr2;
        long[] jArr2;
        int i14;
        Object[] objArr3;
        long[] jArr3;
        int i15;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        q41 q41Var3 = this.n;
        int i16 = q41Var3.a[q41Var3.b - 2] - 1;
        boolean z2 = this.S;
        zj zjVar = c20.a;
        if (z2) {
            m53 m53Var = this.I;
            int i17 = m53Var.v;
            int iS = m53Var.s(i17);
            Object objT = this.I.t(i17);
            Object objQ = this.I.q(i17);
            if (objT != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objT instanceof Enum ? ((Enum) objT).ordinal() : objT.hashCode()));
            } else if (objQ == null || iS != 207 || objQ.equals(zjVar)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i16), 3) ^ ((long) iS);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i16), 3) ^ ((long) objQ.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            i53 i53Var = this.G;
            int i18 = i53Var.i;
            int i19 = i53Var.i(i18);
            i53 i53Var2 = this.G;
            Object objP = i53Var2.p(i53Var2.b, i18);
            i53 i53Var3 = this.G;
            Object objB = i53Var3.b(i53Var3.b, i18);
            if (objP != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode()));
            } else if (objB == null || i19 != 207 || objB.equals(zjVar)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i16), 3) ^ ((long) i19);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i16), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i20 = this.l;
        qv0 qv0Var2 = this.j;
        ArrayList arrayList5 = this.s;
        d20 d20Var = this.M;
        if (qv0Var2 != null) {
            or1 or1Var = qv0Var2.e;
            int i21 = qv0Var2.b;
            ArrayList arrayList6 = qv0Var2.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = qv0Var2.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i22 = 0; i22 < size; i22++) {
                    hashSet2.add(arrayList7.get(i22));
                }
                i = -1;
                js1 js1Var2 = or2.a;
                js1 js1Var3 = new js1();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (i23 < size3) {
                    g71 g71Var = (g71) arrayList6.get(i23);
                    if (hashSet2.contains(g71Var)) {
                        q41Var2 = q41Var3;
                        i7 = i23;
                        if (!js1Var3.c(g71Var)) {
                            int i26 = i24;
                            if (i26 < size2) {
                                g71 g71Var2 = (g71) arrayList7.get(i26);
                                if (g71Var2 != g71Var) {
                                    cx0 cx0Var = (cx0) or1Var.b(g71Var2.c);
                                    int i27 = cx0Var != null ? cx0Var.b : -1;
                                    js1Var3.a(g71Var2);
                                    i8 = i26;
                                    i11 = i25;
                                    qv0Var = qv0Var2;
                                    if (i27 != i11) {
                                        cx0 cx0Var2 = (cx0) or1Var.b(g71Var2.c);
                                        int i28 = cx0Var2 != null ? cx0Var2.c : g71Var2.d;
                                        js1Var = js1Var3;
                                        int i29 = i27 + i21;
                                        i9 = size2;
                                        int i30 = i11 + i21;
                                        if (i28 > 0) {
                                            i10 = i21;
                                            int i31 = d20Var.l;
                                            if (i31 > 0) {
                                                arrayList3 = arrayList6;
                                                if (d20Var.j == i29 - i31 && d20Var.k == i30 - i31) {
                                                    d20Var.l = i31 + i28;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            d20Var.c();
                                            d20Var.j = i29;
                                            d20Var.k = i30;
                                            d20Var.l = i28;
                                        } else {
                                            i10 = i21;
                                            arrayList3 = arrayList6;
                                            d20Var.getClass();
                                        }
                                        if (i27 > i11) {
                                            Object[] objArr5 = or1Var.c;
                                            long[] jArr5 = or1Var.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i32 = 0;
                                                while (true) {
                                                    long j = jArr5[i32];
                                                    int i33 = i28;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i34 = 8 - ((~(i32 - length)) >>> 31);
                                                        int i35 = 0;
                                                        while (i35 < i34) {
                                                            if ((j & 255) < 128) {
                                                                i15 = i35;
                                                                cx0 cx0Var3 = (cx0) objArr5[(i32 << 3) + i35];
                                                                objArr4 = objArr5;
                                                                int i36 = cx0Var3.b;
                                                                jArr4 = jArr5;
                                                                if (i27 <= i36 && i36 < i27 + i33) {
                                                                    cx0Var3.b = (i36 - i27) + i11;
                                                                } else if (i11 <= i36 && i36 < i27) {
                                                                    cx0Var3.b = i36 + i33;
                                                                }
                                                            } else {
                                                                i15 = i35;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i35 = i15 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i34 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i32 == length) {
                                                        break;
                                                    }
                                                    i32++;
                                                    arrayList5 = arrayList2;
                                                    i28 = i33;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i37 = i28;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i11 > i27) {
                                                Object[] objArr6 = or1Var.c;
                                                long[] jArr6 = or1Var.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i38 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i38];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i39 = 8 - ((~(i38 - length2)) >>> 31);
                                                            int i40 = 0;
                                                            while (i40 < i39) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    cx0 cx0Var4 = (cx0) objArr6[(i38 << 3) + i40];
                                                                    jArr2 = jArr6;
                                                                    int i41 = cx0Var4.b;
                                                                    i14 = i27;
                                                                    if (i27 <= i41 && i41 < i14 + i37) {
                                                                        cx0Var4.b = (i41 - i14) + i11;
                                                                    } else if (i14 + 1 <= i41 && i41 < i11) {
                                                                        cx0Var4.b = i41 - i37;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i14 = i27;
                                                                }
                                                                j2 >>= 8;
                                                                i40++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i27 = i14;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i27;
                                                            if (i39 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i27;
                                                        }
                                                        if (i38 == length2) {
                                                            break;
                                                        }
                                                        i38++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i27 = i13;
                                                    }
                                                }
                                            }
                                        }
                                        i12 = i7;
                                    } else {
                                        arrayList2 = arrayList5;
                                        js1Var = js1Var3;
                                        i9 = size2;
                                        i10 = i21;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i12 = i7;
                                } else {
                                    i8 = i26;
                                    arrayList2 = arrayList5;
                                    js1Var = js1Var3;
                                    i9 = size2;
                                    i10 = i21;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i11 = i25;
                                    qv0Var = qv0Var2;
                                    i12 = i7 + 1;
                                }
                                i24 = i8 + 1;
                                cx0 cx0Var5 = (cx0) or1Var.b(g71Var2.c);
                                int i42 = i11 + (cx0Var5 != null ? cx0Var5.c : g71Var2.d);
                                i23 = i12;
                                qv0Var2 = qv0Var;
                                js1Var3 = js1Var;
                                size2 = i9;
                                i21 = i10;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i25 = i42;
                                q41Var3 = q41Var2;
                            } else {
                                i24 = i26;
                                q41Var3 = q41Var2;
                                i23 = i7;
                            }
                        }
                    } else {
                        q41Var2 = q41Var3;
                        cx0 cx0Var6 = (cx0) or1Var.b(g71Var.c);
                        int i43 = cx0Var6 != null ? cx0Var6.b : -1;
                        int i44 = g71Var.c;
                        i7 = i23;
                        d20Var.e(i43 + i21, g71Var.d);
                        qv0Var2.a(i44, 0);
                        d20Var.f = (i44 - d20Var.a.G.g) + d20Var.f;
                        this.G.r(i44);
                        L();
                        this.G.s();
                        s51.k(arrayList5, i44, this.G.b[(i44 * 5) + 3] + i44);
                    }
                    i23 = i7 + 1;
                    q41Var3 = q41Var2;
                }
                q41Var = q41Var3;
                arrayList = arrayList5;
                d20Var.c();
                if (arrayList6.size() > 0) {
                    i53 i53Var4 = this.G;
                    d20Var.f = (i53Var4.h - d20Var.a.G.g) + d20Var.f;
                    i53Var4.t();
                }
            } else {
                q41Var = q41Var3;
                arrayList = arrayList5;
                i = -1;
            }
        }
        boolean z3 = this.S;
        if (!z3) {
            i53 i53Var5 = this.G;
            int i45 = i53Var5.m - i53Var5.l;
            if (i45 > 0) {
                if (i45 > 0) {
                    d20Var.d(false);
                    q41 q41Var4 = d20Var.d;
                    i53 i53Var6 = d20Var.a.G;
                    if (i53Var6.c > 0 && q41Var4.a(-2) != (i6 = i53Var6.i)) {
                        if (!d20Var.c && d20Var.e) {
                            d20Var.d(false);
                            d20Var.b.k.S(vz1.c);
                            d20Var.c = true;
                        }
                        if (i6 > 0) {
                            iv0 iv0VarA = i53Var6.a(i6);
                            q41Var4.c(i6);
                            d20Var.d(false);
                            q02 q02Var = d20Var.b.k;
                            q02Var.S(uz1.c);
                            uq.I(q02Var, 0, iv0VarA);
                            d20Var.c = true;
                        }
                    }
                    q02 q02Var2 = d20Var.b.k;
                    q02Var2.S(j02.c);
                    q02Var2.m[q02Var2.n - q02Var2.k[q02Var2.l - 1].a] = i45;
                } else {
                    d20Var.getClass();
                }
            }
        }
        int i46 = this.k;
        while (true) {
            i53 i53Var7 = this.G;
            if (i53Var7.k > 0 || (i5 = i53Var7.g) == i53Var7.h) {
                break;
            }
            L();
            d20Var.e(i46, this.G.s());
            s51.k(arrayList, i5, this.G.g);
        }
        if (z3) {
            if (z) {
                qm0 qm0Var = this.O;
                q02 q02Var3 = qm0Var.l;
                if (q02Var3.l == 0) {
                    e20.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                q02 q02Var4 = qm0Var.k;
                o02[] o02VarArr = q02Var3.k;
                int i47 = q02Var3.l - 1;
                q02Var3.l = i47;
                o02 o02Var = o02VarArr[i47];
                o02VarArr[i47] = null;
                q02Var4.S(o02Var);
                Object[] objArr7 = q02Var3.o;
                Object[] objArr8 = q02Var4.o;
                int i48 = q02Var4.p;
                int i49 = o02Var.b;
                int i50 = q02Var3.p;
                int i51 = i50 - i49;
                System.arraycopy(objArr7, i51, objArr8, i48 - i49, i50 - i51);
                Object[] objArr9 = q02Var3.o;
                int i52 = q02Var3.p;
                Arrays.fill(objArr9, i52 - i49, i52, (Object) null);
                int[] iArr = q02Var3.m;
                int[] iArr2 = q02Var4.m;
                int i53 = q02Var4.n;
                int i54 = o02Var.a;
                int i55 = q02Var3.n;
                uj.G(i53 - i54, i55 - i54, i55, iArr, iArr2);
                q02Var3.p -= i49;
                q02Var3.n -= i54;
                i20 = 1;
            }
            if (this.G.k <= 0) {
                yb2.a("Unbalanced begin/end empty");
            }
            r4.k--;
            m53 m53Var2 = this.I;
            int i56 = m53Var2.v;
            m53Var2.j();
            if (this.G.k <= 0) {
                int i57 = (-2) - i56;
                this.I.k();
                this.I.e(true);
                iv0 iv0Var = this.N;
                boolean zR = this.O.k.R();
                j53 j53Var = this.H;
                if (zR) {
                    d20Var.b();
                    d20Var.d(false);
                    q41 q41Var5 = d20Var.d;
                    i53 i53Var8 = d20Var.a.G;
                    if (i53Var8.c <= 0 || q41Var5.a(-2) == (i4 = i53Var8.i)) {
                        i3 = 1;
                        d20Var.c();
                        q02 q02Var5 = d20Var.b.k;
                        q02Var5.S(xz1.c);
                        uq.J(q02Var5, 0, iv0Var, i3, j53Var);
                        r3 = 0;
                    } else {
                        if (!d20Var.c && d20Var.e) {
                            d20Var.d(false);
                            d20Var.b.k.S(vz1.c);
                            d20Var.c = true;
                        }
                        if (i4 > 0) {
                            iv0 iv0VarA2 = i53Var8.a(i4);
                            q41Var5.c(i4);
                            d20Var.d(false);
                            q02 q02Var6 = d20Var.b.k;
                            q02Var6.S(uz1.c);
                            uq.I(q02Var6, 0, iv0VarA2);
                            i3 = 1;
                            d20Var.c = true;
                        }
                        d20Var.c();
                        q02 q02Var52 = d20Var.b.k;
                        q02Var52.S(xz1.c);
                        uq.J(q02Var52, 0, iv0Var, i3, j53Var);
                        r3 = 0;
                    }
                } else {
                    qm0 qm0Var2 = this.O;
                    d20Var.b();
                    d20Var.d(false);
                    q41 q41Var6 = d20Var.d;
                    i53 i53Var9 = d20Var.a.G;
                    if (i53Var9.c > 0 && q41Var6.a(-2) != (i2 = i53Var9.i)) {
                        if (!d20Var.c && d20Var.e) {
                            d20Var.d(false);
                            d20Var.b.k.S(vz1.c);
                            d20Var.c = true;
                        }
                        if (i2 > 0) {
                            iv0 iv0VarA3 = i53Var9.a(i2);
                            q41Var6.c(i2);
                            d20Var.d(false);
                            q02 q02Var7 = d20Var.b.k;
                            q02Var7.S(uz1.c);
                            uq.I(q02Var7, 0, iv0VarA3);
                            d20Var.c = true;
                        }
                    }
                    d20Var.c();
                    q02 q02Var8 = d20Var.b.k;
                    q02Var8.S(yz1.c);
                    int i58 = q02Var8.p - q02Var8.k[q02Var8.l - 1].b;
                    Object[] objArr10 = q02Var8.o;
                    objArr10[i58] = iv0Var;
                    objArr10[i58 + 1] = j53Var;
                    objArr10[i58 + 2] = qm0Var2;
                    this.O = new qm0();
                    r3 = 0;
                }
                this.S = r3;
                if (this.c.g != 0) {
                    h0(i57, r3);
                    i0(i57, i20);
                }
            }
        } else {
            if (z) {
                d20Var.a();
            }
            int i59 = d20Var.a.G.i;
            q41 q41Var7 = d20Var.d;
            int i60 = i;
            if (q41Var7.a(i60) > i59) {
                e20.a("Missed recording an endGroup");
            }
            if (q41Var7.a(i60) == i59) {
                d20Var.d(false);
                q41Var7.b();
                d20Var.b.k.S(rz1.c);
            }
            int i61 = this.G.i;
            if (i20 != l0(i61)) {
                i0(i61, i20);
            }
            if (z) {
                i20 = 1;
            }
            this.G.e();
            d20Var.c();
        }
        qv0 qv0Var3 = (qv0) this.i.remove(r3.size() - 1);
        if (qv0Var3 != null && !z3) {
            qv0Var3.c++;
        }
        this.j = qv0Var3;
        this.k = q41Var.b() + i20;
        this.m = q41Var.b();
        this.l = q41Var.b() + i20;
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
    */
    public final xj2 t() {
        xj2 xj2Var;
        iv0 iv0VarA;
        wj2 wj2Var;
        int i;
        ArrayList arrayList = this.E;
        xj2 xj2Var2 = !arrayList.isEmpty() ? (xj2) arrayList.remove(arrayList.size() - 1) : null;
        int i2 = 0;
        if (xj2Var2 != null) {
            xj2Var2.b &= -9;
            this.g.v();
            int i3 = this.B;
            wr1 wr1Var = xj2Var2.f;
            if (wr1Var == null || (xj2Var2.b & 16) != 0) {
                wj2Var = null;
                d20 d20Var = this.M;
                if (wj2Var != null) {
                    q02 q02Var = d20Var.b.k;
                    q02Var.S(qz1.c);
                    uq.J(q02Var, 0, wj2Var, 1, this.h);
                }
                i = xj2Var2.b;
                if ((i & 512) != 0) {
                    xj2Var2.b = i & (-513);
                    q02 q02Var2 = d20Var.b.k;
                    q02Var2.S(tz1.c);
                    uq.I(q02Var2, 0, xj2Var2);
                    int i4 = xj2Var2.b;
                    xj2Var2.b = i4 & (-129);
                    if ((i4 & 1024) != 0) {
                        xj2Var2.b = i4 & (-1153);
                        if (this.z == this.G.i) {
                            this.y = false;
                            this.z = -1;
                        }
                    }
                }
            } else {
                Object[] objArr = wr1Var.b;
                int[] iArr = wr1Var.c;
                long[] jArr = wr1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    loop0: while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j & 255) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    Object obj = objArr[i8];
                                    if (iArr[i8] != i3) {
                                        wj2Var = new wj2(i3, i2, xj2Var2, wr1Var);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    wj2Var = null;
                    d20 d20Var2 = this.M;
                    if (wj2Var != null) {
                    }
                    i = xj2Var2.b;
                    if ((i & 512) != 0) {
                    }
                }
            }
        }
        if (xj2Var2 != null) {
            int i9 = xj2Var2.b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.q)) {
                if (xj2Var2.c == null) {
                    if (this.S) {
                        m53 m53Var = this.I;
                        iv0VarA = m53Var.b(m53Var.v);
                    } else {
                        i53 i53Var = this.G;
                        iv0VarA = i53Var.a(i53Var.i);
                    }
                    xj2Var2.c = iv0VarA;
                }
                xj2Var2.b &= -5;
                xj2Var = xj2Var2;
            } else {
                xj2Var = null;
            }
        }
        p(false);
        return xj2Var;
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
