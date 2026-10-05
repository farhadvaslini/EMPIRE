package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l20 implements f20 {
    public final nv0 A;
    public int B;
    public final g20 f;
    public final tl3 g;
    public final AtomicReference h = new AtomicReference(null);
    public final Object i = new Object();
    public final ls1 j;
    public final j53 k;
    public final is1 l;
    public final js1 m;
    public final js1 n;
    public final is1 o;
    public final gs p;
    public final gs q;
    public final is1 r;
    public is1 s;
    public boolean t;
    public u33 u;
    public g52 v;
    public l20 w;
    public int x;
    public final yl1 y;
    public final zk2 z;

    public l20(g20 g20Var, tl3 tl3Var) {
        this.f = g20Var;
        this.g = tl3Var;
        ls1 ls1Var = new ls1(new js1());
        this.j = ls1Var;
        j53 j53Var = new j53();
        if (g20Var.d()) {
            j53Var.p = new or1();
        }
        if (g20Var.f()) {
            j53Var.b();
        }
        this.k = j53Var;
        this.l = n32.j();
        this.m = new js1();
        this.n = new js1();
        this.o = n32.j();
        gs gsVar = new gs();
        this.p = gsVar;
        gs gsVar2 = new gs();
        this.q = gsVar2;
        this.r = n32.j();
        this.s = n32.j();
        yl1 yl1Var = new yl1(13, g20Var);
        this.y = yl1Var;
        this.z = new zk2();
        nv0 nv0Var = new nv0(tl3Var, g20Var, l53.d(j53Var), ls1Var, gsVar, gsVar2, yl1Var, this);
        g20Var.p(nv0Var);
        this.A = nv0Var;
    }

    public final void A(rs0 rs0Var) {
        boolean zI = i();
        q();
        g20 g20Var = this.f;
        if (!zI) {
            g20Var.a(this, rs0Var);
            return;
        }
        nv0 nv0Var = this.A;
        nv0Var.z = 0;
        nv0Var.y = true;
        g20Var.a(this, rs0Var);
        if (nv0Var.F || nv0Var.z != 0) {
            yb2.a("Cannot disable reuse from root if it was caused by other groups");
        }
        nv0Var.z = -1;
        nv0Var.y = false;
    }

    public final void a() {
        this.h.set(null);
        this.p.k.P();
        this.q.k.P();
        ls1 ls1Var = this.j;
        if (ls1Var.f.g()) {
            return;
        }
        zk2 zk2Var = this.z;
        try {
            zk2Var.g(ls1Var, this.A.B());
            zk2Var.b();
        } finally {
            zk2Var.a();
        }
    }

    public final void b(Object obj, boolean z) {
        Object objG = this.l.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof js1;
        c61 c61Var = c61.f;
        js1 js1Var = this.m;
        js1 js1Var2 = this.n;
        is1 is1Var = this.r;
        if (!z2) {
            xj2 xj2Var = (xj2) objG;
            if (n32.w(is1Var, obj, xj2Var) || xj2Var.b(obj) == c61Var) {
                return;
            }
            if (xj2Var.g == null || z) {
                js1Var.a(xj2Var);
                return;
            } else {
                js1Var2.a(xj2Var);
                return;
            }
        }
        js1 js1Var3 = (js1) objG;
        Object[] objArr = js1Var3.b;
        long[] jArr = js1Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        xj2 xj2Var2 = (xj2) objArr[(i << 3) + i3];
                        if (!n32.w(is1Var, obj, xj2Var2) && xj2Var2.b(obj) != c61Var) {
                            if (xj2Var2.g == null || z) {
                                js1Var.a(xj2Var2);
                            } else {
                                js1Var2.a(xj2Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:220:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.Set r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l20.c(java.util.Set, boolean):void");
    }

    public final void d() {
        synchronized (this.i) {
            try {
                e(this.p);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.j.f.g()) {
                        zk2 zk2Var = this.z;
                        try {
                            zk2Var.g(this.j, this.A.B());
                            zk2Var.b();
                            zk2Var.a();
                        } catch (Throwable th2) {
                            zk2Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.gs r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l20.e(gs):void");
    }

    public final void f() {
        synchronized (this.i) {
            try {
                gs gsVar = this.q;
                gsVar.getClass();
                if (!gsVar.k.R()) {
                    e(this.q);
                }
            } catch (Throwable th) {
                try {
                    if (!this.j.f.g()) {
                        zk2 zk2Var = this.z;
                        try {
                            zk2Var.g(this.j, this.A.B());
                            zk2Var.b();
                            zk2Var.a();
                        } catch (Throwable th2) {
                            zk2Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void g() {
        zk2 zk2Var;
        synchronized (this.i) {
            try {
                this.A.v = null;
                if (!this.j.f.g()) {
                    zk2Var = this.z;
                    try {
                        zk2Var.g(this.j, this.A.B());
                        zk2Var.b();
                        zk2Var.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.j.f.g()) {
                        zk2Var = this.z;
                        try {
                            zk2Var.g(this.j, this.A.B());
                            zk2Var.b();
                            zk2Var.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        is1 is1Var = this.o;
        long[] jArr3 = is1Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = is1Var.b[i10];
                            Object obj2 = is1Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof js1;
                            j5 = j8;
                            is1 is1Var2 = this.l;
                            if (z) {
                                js1 js1Var = (js1) obj2;
                                Object[] objArr = js1Var.b;
                                long[] jArr4 = js1Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!is1Var2.c((cb0) objArr[i15])) {
                                                        js1Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = js1Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zG = !is1Var2.c((cb0) obj2);
                            }
                            if (zG) {
                                is1Var.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        js1 js1Var2 = this.n;
        if (!js1Var2.h()) {
            return;
        }
        Object[] objArr2 = js1Var2.b;
        long[] jArr5 = js1Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((xj2) objArr2[i20]).g == null) {
                            js1Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.i) {
            z = true;
            if (this.B != 1) {
                z = false;
            }
            if (z) {
                this.B = 0;
            }
        }
        return z;
    }

    public final void j(rs0 rs0Var) {
        try {
            synchronized (this.i) {
                n();
                is1 is1Var = this.s;
                this.s = n32.j();
                try {
                    nv0 nv0Var = this.A;
                    u33 u33Var = this.u;
                    if (!nv0Var.e.k.R()) {
                        e20.a("Expected applyChanges() to have been called");
                    }
                    nv0Var.P = u33Var;
                    try {
                        nv0Var.n(is1Var, rs0Var);
                    } finally {
                        nv0Var.P = null;
                    }
                } catch (Throwable th) {
                    this.s = is1Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.j.f.g()) {
                    zk2 zk2Var = this.z;
                    try {
                        zk2Var.g(this.j, this.A.B());
                        zk2Var.b();
                        zk2Var.a();
                    } catch (Throwable th3) {
                        zk2Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final g52 k(boolean z, rs0 rs0Var) {
        if (this.v != null) {
            yb2.b("A pausable composition is in progress");
        }
        g52 g52Var = new g52(this, this.f, this.A, this.j, rs0Var, z, this.g, this.i);
        this.v = g52Var;
        return g52Var;
    }

    public final void l() {
        synchronized (this.i) {
            try {
                if (this.v != null) {
                    yb2.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.k.g == 0;
                if (!z || !this.j.f.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        zk2 zk2Var = this.z;
                        try {
                            zk2Var.g(this.j, this.A.B());
                            if (!z) {
                                j53 j53Var = this.k;
                                zk2 zk2Var2 = this.z;
                                m53 m53VarE = j53Var.e();
                                try {
                                    m53VarE.n(m53VarE.t, new y7(15, zk2Var2, m53VarE));
                                    m53VarE.e(true);
                                    this.g.g();
                                    zk2Var.c();
                                } catch (Throwable th) {
                                    m53VarE.e(false);
                                    throw th;
                                }
                            }
                            zk2Var.b();
                            zk2Var.a();
                        } catch (Throwable th2) {
                            zk2Var.a();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.l.a();
                this.o.a();
                this.s.a();
                this.p.k.P();
                this.q.k.P();
                nv0 nv0Var = this.A;
                nv0Var.E.clear();
                nv0Var.s.clear();
                nv0Var.e.k.P();
                nv0Var.v = null;
                this.B = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void m() {
        synchronized (this.i) {
            try {
                if (this.A.F) {
                    yb2.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.B != 3) {
                    this.B = 3;
                    gs gsVar = this.A.L;
                    if (gsVar != null) {
                        e(gsVar);
                    }
                    boolean z = this.k.g == 0;
                    if (!z || !this.j.f.g()) {
                        zk2 zk2Var = this.z;
                        try {
                            zk2Var.g(this.j, this.A.B());
                            if (!z) {
                                j53 j53Var = this.k;
                                zk2 zk2Var2 = this.z;
                                m53 m53VarE = j53Var.e();
                                try {
                                    m53VarE.n(m53VarE.t, new u(7, zk2Var2));
                                    m53VarE.H();
                                    m53VarE.e(true);
                                    this.g.a();
                                    this.g.g();
                                    zk2Var.c();
                                } catch (Throwable th) {
                                    m53VarE.e(false);
                                    throw th;
                                }
                            }
                            zk2Var.b();
                            zk2Var.a();
                        } catch (Throwable th2) {
                            zk2Var.a();
                            throw th2;
                        }
                    }
                    this.r.a();
                    nv0 nv0Var = this.A;
                    nv0Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        nv0Var.b.u(nv0Var);
                        nv0Var.E.clear();
                        nv0Var.s.clear();
                        nv0Var.e.k.P();
                        nv0Var.v = null;
                        nv0Var.a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f.v(this);
    }

    public final void n() {
        Object obj = cl3.U;
        AtomicReference atomicReference = this.h;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                e20.b("pending composition has not been applied");
                c.d();
                return;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                e20.b("corrupt pendingModifications drain: " + atomicReference);
                c.d();
                return;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.h;
        Object andSet = atomicReference.getAndSet(null);
        if (s51.n(andSet, cl3.U)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.v == null) {
                e20.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            e20.b("corrupt pendingModifications drain: " + atomicReference);
            c.d();
        }
    }

    public final void p() {
        si0 si0Var = si0.f;
        AtomicReference atomicReference = this.h;
        Object andSet = atomicReference.getAndSet(si0Var);
        if (s51.n(andSet, cl3.U) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            e20.b("corrupt pendingModifications drain: " + atomicReference);
            c.d();
            return;
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        int i = this.B;
        if (i != 0) {
            yb2.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.v == null) {
            return;
        }
        yb2.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        ls1 ls1Var = this.j;
        nv0 nv0Var = this.A;
        if (arrayList.size() > 0) {
            ((yq1) ((r32) arrayList.get(0)).f).getClass();
            e20.a("Check failed");
        }
        try {
            nv0Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    nv0Var.E(arrayList);
                    nv0Var.i();
                } catch (Throwable th) {
                    nv0Var.a();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!ls1Var.f.g()) {
                    zk2 zk2Var = this.z;
                    try {
                        zk2Var.g(ls1Var, nv0Var.B());
                        zk2Var.b();
                        zk2Var.a();
                    } catch (Throwable th3) {
                        zk2Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final c61 s(xj2 xj2Var, Object obj) {
        l20 l20Var;
        int i = xj2Var.b;
        if ((i & 2) != 0) {
            xj2Var.b = i | 4;
        }
        iv0 iv0Var = xj2Var.c;
        if (iv0Var == null || !iv0Var.a()) {
            return c61.f;
        }
        j53 j53Var = this.k;
        j53Var.getClass();
        iv0 iv0Var2 = xj2Var.c;
        if (iv0Var2 != null && j53Var.f(pq.k(iv0Var2))) {
            if (xj2Var.d == null) {
                return c61.f;
            }
            c61 c61VarT = t(xj2Var, iv0Var, obj);
            if (c61VarT != c61.f) {
                this.y.v();
            }
            return c61VarT;
        }
        synchronized (this.i) {
            l20Var = this.w;
        }
        if (l20Var != null) {
            nv0 nv0Var = l20Var.A;
            if (nv0Var.F && nv0Var.f0(xj2Var, obj)) {
                return c61.i;
            }
        }
        return c61.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:79:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], EDGE_INSN: B:80:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.c61 t(defpackage.xj2 r20, defpackage.iv0 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l20.t(xj2, iv0, java.lang.Object):c61");
    }

    public final void u(Object obj) {
        Object objG = this.l.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof js1;
        c61 c61Var = c61.i;
        is1 is1Var = this.r;
        if (!z) {
            xj2 xj2Var = (xj2) objG;
            if (xj2Var.b(obj) != c61Var || (obj instanceof cb0)) {
                return;
            }
            n32.f(is1Var, obj, xj2Var);
            return;
        }
        js1 js1Var = (js1) objG;
        Object[] objArr = js1Var.b;
        long[] jArr = js1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        xj2 xj2Var2 = (xj2) objArr[(i << 3) + i3];
                        if (xj2Var2.b(obj) == c61Var && !(obj instanceof cb0)) {
                            n32.f(is1Var, obj, xj2Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.pr2
            is1 r3 = r0.o
            is1 r0 = r0.l
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            pr2 r1 = (defpackage.pr2) r1
            js1 r1 = r1.f
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.c(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.c(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.c(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l20.v(java.util.Set):boolean");
    }

    public final boolean w() {
        synchronized (this.i) {
            g52 g52Var = this.v;
            boolean z = false;
            if (g52Var != null && (g52Var.h.get() != i52.j || g52Var.i != g12.G())) {
                AtomicReference atomicReference = g52Var.h;
                i52 i52Var = i52.k;
                i52 i52Var2 = i52.i;
                while (!atomicReference.compareAndSet(i52Var, i52Var2) && atomicReference.get() == i52Var) {
                }
                g52Var.l.f.a(9);
                return false;
            }
            n();
            try {
                is1 is1Var = this.s;
                this.s = n32.j();
                try {
                    nv0 nv0Var = this.A;
                    u33 u33Var = this.u;
                    q02 q02Var = nv0Var.e.k;
                    if (!q02Var.R()) {
                        e20.a("Expected applyChanges() to have been called");
                    }
                    if (is1Var.e > 0 || !nv0Var.s.isEmpty()) {
                        nv0Var.P = u33Var;
                        try {
                            nv0Var.n(is1Var, null);
                            nv0Var.P = null;
                            z = !q02Var.R();
                        } catch (Throwable th) {
                            nv0Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.s = is1Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.j.f.g()) {
                        zk2 zk2Var = this.z;
                        try {
                            zk2Var.g(this.j, this.A.B());
                            zk2Var.b();
                            zk2Var.a();
                        } catch (Throwable th4) {
                            zk2Var.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(pr2 pr2Var) {
        Object obj;
        while (true) {
            Object obj2 = this.h.get();
            if (obj2 == null || obj2.equals(cl3.U)) {
                obj = pr2Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, pr2Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.h).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = pr2Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.i) {
                    o();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l20.y(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.i
            monitor-enter(r0)
            r14.u(r15)     // Catch: java.lang.Throwable -> L4f
            is1 r1 = r14.o     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof defpackage.js1     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            js1 r15 = (defpackage.js1) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            cb0 r10 = (defpackage.cb0) r10     // Catch: java.lang.Throwable -> L4f
            r14.u(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r14 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            cb0 r15 = (defpackage.cb0) r15     // Catch: java.lang.Throwable -> L4f
            r14.u(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l20.z(java.lang.Object):void");
    }
}
