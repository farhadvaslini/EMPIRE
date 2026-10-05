package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zG;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i2;
        int i3;
        long[] jArr9;
        boolean z2 = set instanceof pr2;
        is1 is1Var = this.o;
        Object obj = null;
        int i4 = 8;
        if (z2) {
            js1 js1Var = ((pr2) set).f;
            Object[] objArr = js1Var.b;
            long[] jArr10 = js1Var.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i5 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i5];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i5 << 3) + i7];
                                c2 = c3;
                                if (obj2 instanceof xj2) {
                                    ((xj2) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object objG = is1Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof js1) {
                                            js1 js1Var2 = (js1) objG;
                                            Object[] objArr2 = js1Var2.b;
                                            long[] jArr11 = js1Var2.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = i4;
                                                i2 = length;
                                                int i9 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i9];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        int i11 = 0;
                                                        while (i11 < i10) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                b((cb0) objArr2[(i9 << 3) + i11], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i8;
                                                            i11++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i10 != i8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    }
                                                    i9++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i8 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i2 = length;
                                            b((cb0) objG, z);
                                        }
                                        i3 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i2 = length;
                                i3 = 8;
                            } else {
                                jArr8 = jArr10;
                                c2 = c3;
                                j8 = j9;
                                i2 = length;
                                i3 = i4;
                            }
                            j9 = j8 >> i3;
                            i7++;
                            length = i2;
                            i4 = i3;
                            c3 = c2;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c3;
                        int i12 = length;
                        if (i6 != i4) {
                            break;
                        } else {
                            length = i12;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr10 = jArr7;
                    obj = null;
                    i4 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof xj2) {
                    ((xj2) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object objG2 = is1Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof js1) {
                            js1 js1Var3 = (js1) objG2;
                            Object[] objArr3 = js1Var3.b;
                            long[] jArr13 = js1Var3.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr13[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                b((cb0) objArr3[(i << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 == 8) {
                                            i = i != length3 ? i + 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((cb0) objG2, z);
                        }
                    }
                }
            }
        }
        is1 is1Var2 = this.l;
        js1 js1Var4 = this.m;
        if (z) {
            js1 js1Var5 = this.n;
            if (js1Var5.h()) {
                long[] jArr14 = is1Var2.a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = is1Var2.b[i18];
                                    Object obj5 = is1Var2.c[i18];
                                    if (obj5 instanceof js1) {
                                        js1 js1Var6 = (js1) obj5;
                                        Object[] objArr4 = js1Var6.b;
                                        long[] jArr15 = js1Var6.a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            xj2 xj2Var = (xj2) objArr5[i22];
                                                            if (js1Var5.c(xj2Var) || js1Var4.c(xj2Var)) {
                                                                js1Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        zG = js1Var6.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        xj2 xj2Var2 = (xj2) obj5;
                                        zG = js1Var5.c(xj2Var2) || js1Var4.c(xj2Var2);
                                    }
                                    if (zG) {
                                        is1Var2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                js1Var5.b();
                h();
                return;
            }
        }
        if (js1Var4.h()) {
            long[] jArr17 = is1Var2.a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = is1Var2.b[i26];
                                Object obj7 = is1Var2.c[i26];
                                if (obj7 instanceof js1) {
                                    js1 js1Var7 = (js1) obj7;
                                    Object[] objArr6 = js1Var7.b;
                                    long[] jArr18 = js1Var7.a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (js1Var4.c((xj2) objArr7[i30])) {
                                                            js1Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    zC = js1Var7.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = js1Var4.c((xj2) obj7);
                                }
                                if (zC) {
                                    is1Var2.l(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            h();
            js1Var4.b();
        }
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
    */
    public final void e(gs gsVar) throws Throwable {
        wi wiVar;
        zk2 zk2Var;
        zk2 zk2Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        zk2 zk2Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        gs gsVar2 = this.q;
        nv0 nv0Var = this.A;
        j20 j20VarB = nv0Var.B();
        zk2 zk2Var4 = this.z;
        zk2Var4.g(this.j, j20VarB);
        try {
            if (gsVar.k.R()) {
                try {
                    if (gsVar2.k.R() && this.v == null) {
                        zk2Var4.b();
                    }
                    return;
                } finally {
                }
            }
            g52 g52Var = this.v;
            if (g52Var == null || (wiVar = g52Var.l) == null) {
                wiVar = this.g;
            }
            try {
                Trace.beginSection(wiVar.equals(g52Var != null ? g52Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    g52 g52Var2 = this.v;
                    if (g52Var2 == null || (zk2Var = g52Var2.k) == null) {
                        zk2Var = zk2Var4;
                    }
                    j53 j53Var = this.k;
                    j20 j20VarB2 = nv0Var.B();
                    m53 m53VarE = l53.d(j53Var).e();
                    int i3 = 0;
                    try {
                        gsVar.P(wiVar, m53VarE, zk2Var, j20VarB2);
                        m53VarE.e(true);
                        wiVar.g();
                        Trace.endSection();
                        zk2Var4.c();
                        zk2Var4.d();
                        if (this.t) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.t = false;
                                is1 is1Var = this.l;
                                long[] jArr3 = is1Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = is1Var.b[i8];
                                                    Object obj2 = is1Var.c[i8];
                                                    if (obj2 instanceof js1) {
                                                        js1 js1Var = (js1) obj2;
                                                        Object[] objArr = js1Var.b;
                                                        long[] jArr4 = js1Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        zk2Var3 = zk2Var4;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((xj2) objArr[i13]).a()) {
                                                                                    js1Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 == length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = js1Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        zk2Var3 = zk2Var4;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zG = !((xj2) obj2).a();
                                                    }
                                                    if (zG) {
                                                        is1Var.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    zk2Var3 = zk2Var4;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                zk2Var4 = zk2Var3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            zk2Var2 = zk2Var4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            zk2Var2 = zk2Var4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        zk2Var4 = zk2Var2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    zk2Var2 = zk2Var4;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            zk2Var2 = zk2Var4;
                        }
                        try {
                            if (gsVar2.k.R() && this.v == null) {
                                zk2Var2.b();
                            }
                            return;
                        } finally {
                            zk2Var2.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            m53VarE.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (gsVar2.k.R() && this.v == null) {
                zk2Var4.b();
            }
            throw th;
        } finally {
        }
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
    */
    public final c61 t(xj2 xj2Var, iv0 iv0Var, Object obj) {
        synchronized (this.i) {
            try {
                l20 l20Var = this.w;
                l20 l20Var2 = null;
                if (l20Var != null) {
                    j53 j53Var = this.k;
                    int i = this.x;
                    if (j53Var.l) {
                        e20.a("Writer is active");
                    }
                    if (i < 0 || i >= j53Var.g) {
                        e20.a("Invalid group index");
                    }
                    iv0 iv0VarK = pq.k(iv0Var);
                    if (j53Var.f(iv0VarK)) {
                        int i2 = j53Var.f[(i * 5) + 3] + i;
                        int i3 = iv0VarK.a;
                        if (i > i3 || i3 >= i2) {
                            l20Var = null;
                        }
                        l20Var2 = l20Var;
                    }
                }
                if (l20Var2 == null) {
                    nv0 nv0Var = this.A;
                    if (nv0Var.F && nv0Var.f0(xj2Var, obj)) {
                        return c61.i;
                    }
                    if (obj == null) {
                        this.s.m(xj2Var, m22.l);
                    } else {
                        boolean z = obj instanceof cb0;
                        is1 is1Var = this.s;
                        if (z) {
                            Object objG = is1Var.g(xj2Var);
                            if (objG == null) {
                                n32.f(this.s, xj2Var, obj);
                            } else if (objG instanceof js1) {
                                js1 js1Var = (js1) objG;
                                Object[] objArr = js1Var.b;
                                long[] jArr = js1Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i4];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                                            for (int i6 = 0; i6 < i5; i6++) {
                                                if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == m22.l) {
                                                    break loop0;
                                                }
                                                j >>= 8;
                                            }
                                            if (i5 != 8) {
                                                break;
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                    n32.f(this.s, xj2Var, obj);
                                }
                            } else if (objG == m22.l) {
                            }
                        } else {
                            is1Var.m(xj2Var, m22.l);
                        }
                    }
                }
                if (l20Var2 != null) {
                    return l20Var2.t(xj2Var, iv0Var, obj);
                }
                this.f.l(this);
                return this.A.F ? c61.h : c61.g;
            } catch (Throwable th) {
                throw th;
            }
        }
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
    */
    public final boolean v(Set set) {
        boolean z = set instanceof pr2;
        is1 is1Var = this.o;
        is1 is1Var2 = this.l;
        if (z) {
            js1 js1Var = ((pr2) set).f;
            Object[] objArr = js1Var.b;
            long[] jArr = js1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (is1Var2.c(obj) || is1Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        } else {
            for (Object obj2 : set) {
                if (is1Var2.c(obj2) || is1Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
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
    */
    public final void y(Object obj) {
        xj2 xj2VarZ;
        int i;
        boolean z;
        int i2;
        nv0 nv0Var = this.A;
        if (nv0Var.A <= 0 && (xj2VarZ = nv0Var.z()) != null) {
            int i3 = xj2VarZ.b | 1;
            xj2VarZ.b = i3;
            if ((i3 & 32) == 0) {
                wr1 wr1Var = xj2VarZ.f;
                if (wr1Var == null) {
                    wr1Var = new wr1();
                    xj2VarZ.f = wr1Var;
                }
                int i4 = xj2VarZ.e;
                int iC = wr1Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = wr1Var.c[iC];
                }
                wr1Var.b[iC] = obj;
                wr1Var.c[iC] = i4;
                z = i == xj2VarZ.e;
            }
            this.y.v();
            if (z) {
                return;
            }
            if (obj instanceof o93) {
                ((o93) obj).f(1);
            }
            n32.f(this.l, obj, xj2VarZ);
            if (obj instanceof cb0) {
                cb0 cb0Var = (cb0) obj;
                bb0 bb0VarH = cb0Var.h();
                is1 is1Var = this.o;
                n32.x(is1Var, obj);
                wr1 wr1Var2 = bb0VarH.e;
                Object[] objArr = wr1Var2.b;
                long[] jArr = wr1Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    n93 n93Var = (n93) objArr[(i5 << 3) + i8];
                                    i2 = i6;
                                    if (n93Var instanceof o93) {
                                        ((o93) n93Var).f(1);
                                    }
                                    n32.f(is1Var, n93Var, obj);
                                } else {
                                    i2 = i6;
                                }
                                j >>= i2;
                                i8++;
                                i6 = i2;
                            }
                            if (i7 != i6) {
                                break;
                            } else if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                Object obj2 = bb0VarH.f;
                is1 is1Var2 = xj2VarZ.g;
                if (is1Var2 == null) {
                    is1Var2 = new is1();
                    xj2VarZ.g = is1Var2;
                }
                is1Var2.m(cb0Var, obj2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(Object obj) {
        synchronized (this.i) {
            try {
                u(obj);
                Object objG = this.o.g(obj);
                if (objG != null) {
                    if (objG instanceof js1) {
                        js1 js1Var = (js1) objG;
                        Object[] objArr = js1Var.b;
                        long[] jArr = js1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            u((cb0) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i == length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        u((cb0) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
