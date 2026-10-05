package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public void l() {
        if (this.l <= 0) {
            yb2.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        js1 js1VarX = x();
        if (js1VarX != null) {
            if (this.m) {
                yb2.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = js1VarX.b;
            long[] jArr = js1VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (p93 p93VarA = ((n93) objArr[(i2 << 3) + i4]).a(); p93VarA != null; p93VarA = p93VarA.b) {
                                    long j2 = p93VarA.a;
                                    if (j2 == jG || qx.m0(this.j, Long.valueOf(j2))) {
                                        cr2 cr2Var = a73.a;
                                        p93VarA.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
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
    */
    public t22 w() {
        HashMap mapB;
        List list;
        js1 js1Var;
        long j;
        long j2;
        js1 js1VarX = x();
        if (js1VarX != null) {
            long j3 = a73.j.b;
            mapB = a73.b(j3, this, a73.d.b(j3));
        } else {
            mapB = null;
        }
        ni0 ni0Var = ni0.f;
        synchronized (a73.c) {
            try {
                a73.c(this);
                if (js1VarX == null || js1VarX.d == 0) {
                    b();
                    hw0 hw0Var = a73.j;
                    js1 js1Var2 = hw0Var.h;
                    a73.v(hw0Var, a73.a);
                    if (js1Var2 == null || !js1Var2.h()) {
                        list = ni0Var;
                        js1Var = null;
                    } else {
                        list = a73.h;
                        js1Var = js1Var2;
                    }
                } else {
                    hw0 hw0Var2 = a73.j;
                    t22 t22VarZ = z(a73.e, js1VarX, mapB, a73.d.b(hw0Var2.b));
                    if (!t22VarZ.equals(w63.c)) {
                        return t22VarZ;
                    }
                    b();
                    js1Var = hw0Var2.h;
                    a73.v(hw0Var2, a73.a);
                    B(null);
                    hw0Var2.h = null;
                    list = a73.h;
                }
                this.m = true;
                if (js1Var != null) {
                    pr2 pr2Var = new pr2(js1Var);
                    if (!js1Var.g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((rs0) list.get(i)).f(pr2Var, this);
                        }
                    }
                }
                if (js1VarX != null && js1VarX.h()) {
                    pr2 pr2Var2 = new pr2(js1VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((rs0) list.get(i2)).f(pr2Var2, this);
                    }
                }
                synchronized (a73.c) {
                    try {
                        p();
                        a73.f();
                        if (js1Var != null) {
                            Object[] objArr = js1Var.b;
                            long[] jArr = js1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                a73.q((n93) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        }
                        if (js1VarX != null) {
                            Object[] objArr2 = js1VarX.b;
                            long[] jArr2 = js1VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                a73.q((n93) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 == length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                a73.q((n93) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return w63.c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
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
