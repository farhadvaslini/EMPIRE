package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class p73 {
    public final ns0 a;
    public boolean c;
    public final pt2 d;
    public final aw2 e;
    public b4 h;
    public o73 i;
    public final AtomicReference b = new AtomicReference(null);
    public final qs1 f = new qs1(new o73[16]);
    public final Object g = new Object();
    public long j = -1;

    public p73(ns0 ns0Var) {
        this.a = ns0Var;
        int i = 9;
        this.d = new pt2(i, this);
        this.e = new aw2(i, this);
    }

    public final void a() {
        synchronized (this.g) {
            qs1 qs1Var = this.f;
            Object[] objArr = qs1Var.f;
            int i = qs1Var.h;
            for (int i2 = 0; i2 < i; i2++) {
                o73 o73Var = (o73) objArr[i2];
                o73Var.e.a();
                o73Var.f.a();
                o73Var.l.a();
                o73Var.m.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj) {
        int i;
        int i2;
        synchronized (this.g) {
            try {
                qs1 qs1Var = this.f;
                int i3 = qs1Var.h;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = qs1Var.f;
                    if (i4 < i3) {
                        o73 o73Var = (o73) objArr[i4];
                        wr1 wr1Var = (wr1) o73Var.f.k(obj);
                        if (wr1Var == null) {
                            i = i4;
                        } else {
                            Object[] objArr2 = wr1Var.b;
                            int[] iArr = wr1Var.c;
                            long[] jArr = wr1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                int i9 = (i6 << 3) + i8;
                                                i2 = i8;
                                                Object obj2 = objArr2[i9];
                                                int i10 = iArr[i9];
                                                o73Var.c(obj, obj2);
                                            } else {
                                                i2 = i8;
                                            }
                                            j >>= 8;
                                            i8 = i2 + 1;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 == length) {
                                            break;
                                        }
                                        i6++;
                                        i4 = i;
                                    }
                                }
                            }
                        }
                        if (!o73Var.f.j()) {
                            i5++;
                        } else if (i5 > 0) {
                            Object[] objArr3 = qs1Var.f;
                            objArr3[i - i5] = objArr3[i];
                        }
                        i4 = i + 1;
                    } else {
                        int i11 = i3 - i5;
                        Arrays.fill(objArr, i11, i3, (Object) null);
                        qs1Var.h = i11;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        e20.b("Unexpected notification");
                        c.d();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                qs1 qs1Var = this.f;
                Object[] objArr = qs1Var.f;
                int i = qs1Var.h;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((o73) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, ns0 ns0Var, cs0 cs0Var) {
        qs1 qs1Var;
        Object obj2;
        o73 o73Var;
        boolean z;
        o73 o73Var2;
        long j;
        long j2;
        o73 o73Var3;
        t63 kk3Var;
        long j3;
        wr1 wr1Var;
        int i;
        long j4;
        wr1 wr1Var2;
        long jG = g12.G();
        synchronized (this.g) {
            qs1Var = this.f;
            Object[] objArr = qs1Var.f;
            int i2 = qs1Var.h;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((o73) obj2).a == ns0Var) {
                    break;
                } else {
                    i3++;
                }
            }
            o73Var = (o73) obj2;
            z = true;
            if (o73Var == null) {
                ns0Var.getClass();
                cl3.i(1, ns0Var);
                o73Var = new o73(ns0Var);
                qs1Var.b(o73Var);
            }
            o73Var2 = this.i;
            j = this.j;
        }
        Object obj3 = qs1Var;
        if (j != -1) {
            obj3 = qs1Var;
            if (j != jG) {
                String name = Thread.currentThread().getName();
                StringBuilder sb = new StringBuilder("Detected multithreaded access to SnapshotStateObserver: previousThreadId=");
                sb.append(j);
                sb.append("), currentThread={id=");
                sb.append(jG);
                sb.append(", name=");
                sb.append(name);
                sb.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                yb2.a(sb.toString());
                obj3 = sb;
            }
        }
        try {
            synchronized (this.g) {
                try {
                    this.i = o73Var;
                    this.j = jG;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            aw2 aw2Var = this.e;
            Object obj4 = o73Var.b;
            wr1 wr1Var3 = o73Var.c;
            int i4 = o73Var.d;
            o73Var.b = obj;
            o73Var.c = (wr1) o73Var.f.g(obj);
            if (o73Var.d == -1) {
                o73Var.d = Long.hashCode(a73.j().g());
            }
            mv0 mv0Var = o73Var.i;
            qs1 qs1VarI = b32.i();
            try {
                qs1VarI.b(mv0Var);
                if (aw2Var == null) {
                    cs0Var.a();
                    o73Var3 = o73Var;
                } else {
                    t63 t63Var = (t63) a73.b.j();
                    if (t63Var instanceof kk3) {
                        o73Var3 = o73Var;
                        if (((kk3) t63Var).t == g12.G()) {
                            ns0 ns0Var2 = ((kk3) t63Var).r;
                            ns0 ns0Var3 = ((kk3) t63Var).s;
                            try {
                                ((kk3) t63Var).r = a73.k(aw2Var, ns0Var2, true);
                                ((kk3) t63Var).s = ns0Var3;
                                cs0Var.a();
                                ((kk3) t63Var).r = ns0Var2;
                                ((kk3) t63Var).s = ns0Var3;
                            } catch (Throwable th2) {
                                ((kk3) t63Var).r = ns0Var2;
                                ((kk3) t63Var).s = ns0Var3;
                                throw th2;
                            }
                        }
                    } else {
                        o73Var3 = o73Var;
                    }
                    if (t63Var == null || (t63Var instanceof ns1)) {
                        kk3Var = new kk3(t63Var instanceof ns1 ? (ns1) t63Var : null, aw2Var, null, true, false);
                    } else {
                        kk3Var = t63Var.u(aw2Var);
                    }
                    try {
                        t63 t63VarJ = kk3Var.j();
                        try {
                            cs0Var.a();
                            t63.q(t63VarJ);
                            kk3Var.c();
                        } catch (Throwable th3) {
                            try {
                                t63.q(t63VarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    kk3Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    qs1VarI.k(qs1VarI.h - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                qs1VarI.k(qs1VarI.h - 1);
                o73 o73Var4 = o73Var3;
                Object obj5 = o73Var4.b;
                obj5.getClass();
                int i5 = o73Var4.d;
                wr1 wr1Var4 = o73Var4.c;
                if (wr1Var4 != null) {
                    try {
                        long[] jArr = wr1Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                wr1 wr1Var5 = wr1Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            wr1Var2 = wr1Var5;
                                            Object obj6 = wr1Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = wr1Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    o73Var4.c(obj5, obj6);
                                                }
                                                if (z3) {
                                                    wr1Var2.f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j5;
                                            wr1Var2 = wr1Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        wr1Var5 = wr1Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                    }
                                    wr1Var = wr1Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    wr1Var = wr1Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                wr1Var4 = wr1Var;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                            this.i = o73Var2;
                            this.j = j2;
                        }
                        throw th;
                    }
                }
                o73Var4.b = obj4;
                o73Var4.c = wr1Var3;
                o73Var4.d = i4;
                synchronized (this.g) {
                    this.i = o73Var2;
                    this.j = j3;
                }
            } catch (Throwable th9) {
                th = th9;
                qs1VarI.k(qs1VarI.h - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void e() {
        pt2 pt2Var = this.d;
        a73.e(a73.a);
        synchronized (a73.c) {
            a73.h = qx.E0(a73.h, pt2Var);
        }
        this.h = new b4(4, pt2Var);
    }
}
