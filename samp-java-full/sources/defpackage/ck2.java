package defpackage;

import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck2 implements ns0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ List g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ck2(ek2 ek2Var, js1 js1Var, js1 js1Var2, List list, List list2, js1 js1Var3, List list3, js1 js1Var4, Set set) {
        this.h = ek2Var;
        this.i = js1Var;
        this.j = js1Var2;
        this.g = list;
        this.m = list2;
        this.k = js1Var3;
        this.n = list3;
        this.l = js1Var4;
        this.o = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0237 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v2, types: [t63] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6, types: [t63] */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r29v8, types: [t63] */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [l20, ns0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ek2] */
    @Override // defpackage.ns0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj) {
        boolean z;
        t63 lk3Var;
        int i;
        List list;
        List list2;
        long j;
        long j2;
        int i2;
        boolean z2;
        ?? r2 = 0;
        switch (this.f) {
            case 0:
                ?? r4 = (ek2) this.h;
                js1 js1Var = (js1) this.i;
                js1 js1Var2 = (js1) this.j;
                List list3 = this.g;
                List list4 = (List) this.m;
                js1 js1Var3 = (js1) this.k;
                List list5 = (List) this.n;
                js1 js1Var4 = (js1) this.l;
                Set set = (Set) this.o;
                long jLongValue = ((Long) obj).longValue();
                synchronized (r4.c) {
                    z = r4.z();
                }
                if (z) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((qk) r4.a.h).h(new i8(1, jLongValue));
                        synchronized (a73.c) {
                            js1 js1Var5 = a73.j.h;
                            if (js1Var5 != null) {
                                z2 = js1Var5.h();
                            }
                        }
                        if (z2) {
                            a73.a();
                        }
                    } finally {
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    r4.K();
                    synchronized (r4.c) {
                        try {
                            qs1 qs1Var = r4.i;
                            Object[] objArr = qs1Var.f;
                            int i3 = qs1Var.h;
                            for (int i4 = 0; i4 < i3; i4++) {
                                list3.add((l20) objArr[i4]);
                            }
                            r4.i.g();
                        } finally {
                        }
                    }
                    js1Var.b();
                    while (true) {
                        if (list3.isEmpty() && list4.isEmpty()) {
                            t63 t63VarJ = a73.j();
                            if (t63VarJ instanceof ns1) {
                                lk3Var = new kk3((ns1) t63VarJ, null, null, true, false);
                                i = 0;
                            } else {
                                i = 0;
                                lk3Var = new lk3(t63VarJ, r2, true, false);
                            }
                            try {
                                t63 t63VarJ2 = lk3Var.j();
                                try {
                                    if (list5.isEmpty()) {
                                        int i5 = 8;
                                        if (js1Var3.h()) {
                                        }
                                        if (js1Var4.h()) {
                                        }
                                        t63.q(obj);
                                        lk3Var.c();
                                        synchronized (r4.c) {
                                        }
                                    } else {
                                        try {
                                            int size = list5.size();
                                            for (int i6 = i; i6 < size; i6++) {
                                                js1Var4.a((l20) list5.get(i6));
                                            }
                                            int size2 = list5.size();
                                            for (int i7 = i; i7 < size2; i7++) {
                                                ((l20) list5.get(i7)).d();
                                            }
                                            int i52 = 8;
                                            try {
                                                if (js1Var3.h()) {
                                                    obj = t63VarJ2;
                                                    j = 128;
                                                    j2 = 255;
                                                } else {
                                                    try {
                                                        js1Var4.j(js1Var3);
                                                        Object[] objArr2 = js1Var3.b;
                                                        j = 128;
                                                        long[] jArr = js1Var3.a;
                                                        int length = jArr.length - 2;
                                                        obj = t63VarJ2;
                                                        if (length >= 0) {
                                                            int i8 = 0;
                                                            j2 = 255;
                                                            while (true) {
                                                                try {
                                                                    long j3 = jArr[i8];
                                                                    list = list3;
                                                                    list2 = list4;
                                                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                                                                        for (int i10 = 0; i10 < i9; i10++) {
                                                                            if ((j3 & 255) < 128) {
                                                                                try {
                                                                                    ((l20) objArr2[(i8 << 3) + i10]).f();
                                                                                } catch (Throwable th) {
                                                                                    th = th;
                                                                                    try {
                                                                                        r4.J(th, null);
                                                                                        dk2.q(r4, list, list2, list5, js1Var3, js1Var4, js1Var, js1Var2);
                                                                                        js1Var3.b();
                                                                                        t63.q(obj);
                                                                                        return dm3.a;
                                                                                    } finally {
                                                                                    }
                                                                                }
                                                                            }
                                                                            j3 >>= 8;
                                                                        }
                                                                        if (i9 == 8) {
                                                                            if (i8 != length) {
                                                                                i8++;
                                                                                list3 = list;
                                                                                list4 = list2;
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    list = list3;
                                                                    list2 = list4;
                                                                    r4.J(th, null);
                                                                    dk2.q(r4, list, list2, list5, js1Var3, js1Var4, js1Var, js1Var2);
                                                                    js1Var3.b();
                                                                    t63.q(obj);
                                                                    return dm3.a;
                                                                }
                                                            }
                                                        } else {
                                                            list = list3;
                                                            list2 = list4;
                                                            j2 = 255;
                                                        }
                                                        list3 = list;
                                                        list4 = list2;
                                                        obj = obj;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        obj = t63VarJ2;
                                                    }
                                                }
                                                if (js1Var4.h()) {
                                                    try {
                                                        Object[] objArr3 = js1Var4.b;
                                                        long[] jArr2 = js1Var4.a;
                                                        int length2 = jArr2.length - 2;
                                                        if (length2 >= 0) {
                                                            int i11 = 0;
                                                            while (true) {
                                                                long j4 = jArr2[i11];
                                                                int i12 = i52;
                                                                long[] jArr3 = jArr2;
                                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i13 = 8 - ((~(i11 - length2)) >>> 31);
                                                                    for (int i14 = 0; i14 < i13; i14++) {
                                                                        if ((j4 & j2) < j) {
                                                                            ((l20) objArr3[(i11 << 3) + i14]).g();
                                                                        }
                                                                        j4 >>= i12;
                                                                    }
                                                                    i2 = i12;
                                                                    if (i13 == i2) {
                                                                    }
                                                                } else {
                                                                    i2 = i12;
                                                                }
                                                                if (i11 != length2) {
                                                                    i11++;
                                                                    i52 = i2;
                                                                    jArr2 = jArr3;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th4) {
                                                        try {
                                                            r4.J(th4, null);
                                                            dk2.q(r4, list3, list4, list5, js1Var3, js1Var4, js1Var, js1Var2);
                                                            t63.q(obj);
                                                            return dm3.a;
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                t63.q(obj);
                                                lk3Var.c();
                                                synchronized (r4.c) {
                                                    if (r4.y() != null) {
                                                        e20.a("unexpected to get continuation here");
                                                        break;
                                                    }
                                                }
                                                a73.j().m();
                                                js1Var2.b();
                                                js1Var.b();
                                                r4.q = null;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                t63.q(obj);
                                                throw th;
                                            }
                                        } catch (Throwable th6) {
                                            try {
                                                r4.J(th6, r2);
                                                dk2.q(r4, list3, list4, list5, js1Var3, js1Var4, js1Var, js1Var2);
                                                t63.q(t63VarJ2);
                                                return dm3.a;
                                            } finally {
                                                list5.clear();
                                            }
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    obj = t63VarJ2;
                                    t63.q(obj);
                                    throw th;
                                }
                            } finally {
                                lk3Var.c();
                            }
                        } else {
                            try {
                                int size3 = list3.size();
                                for (int i15 = 0; i15 < size3; i15++) {
                                    l20 l20Var = (l20) list3.get(i15);
                                    l20 l20VarI = r4.I(l20Var, js1Var);
                                    if (l20VarI != null) {
                                        list5.add(l20VarI);
                                    }
                                    js1Var2.a(l20Var);
                                }
                                list3.clear();
                                if (js1Var.h() || r4.i.h != 0) {
                                    synchronized (r4.c) {
                                        try {
                                            List listD = r4.D();
                                            int size4 = listD.size();
                                            for (int i16 = 0; i16 < size4; i16++) {
                                                l20 l20Var2 = (l20) listD.get(i16);
                                                if (!js1Var2.c(l20Var2) && l20Var2.v(set)) {
                                                    list3.add(l20Var2);
                                                }
                                            }
                                            qs1 qs1Var2 = r4.i;
                                            int i17 = qs1Var2.h;
                                            int i18 = 0;
                                            int i19 = 0;
                                            while (true) {
                                                Object[] objArr4 = qs1Var2.f;
                                                if (i18 < i17) {
                                                    l20 l20Var3 = (l20) objArr4[i18];
                                                    if (!js1Var2.c(l20Var3) && !list3.contains(l20Var3)) {
                                                        list3.add(l20Var3);
                                                        i19++;
                                                    } else if (i19 > 0) {
                                                        Object[] objArr5 = qs1Var2.f;
                                                        objArr5[i18 - i19] = objArr5[i18];
                                                    }
                                                    i18++;
                                                } else {
                                                    int i20 = i17 - i19;
                                                    Arrays.fill(objArr4, i20, i17, (Object) null);
                                                    qs1Var2.h = i20;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                if (list3.isEmpty()) {
                                    try {
                                        dk2.r(list4, r4);
                                        while (!list4.isEmpty()) {
                                            List listH = r4.H(list4, js1Var);
                                            js1Var3.getClass();
                                            Iterator it = listH.iterator();
                                            while (it.hasNext()) {
                                                js1Var3.k(it.next());
                                            }
                                            dk2.r(list4, r4);
                                        }
                                    } catch (Throwable th8) {
                                        r4.J(th8, null);
                                        dk2.q(r4, list3, list4, list5, js1Var3, js1Var4, js1Var, js1Var2);
                                    }
                                    break;
                                }
                                r2 = 0;
                            } catch (Throwable th9) {
                                try {
                                    r4.J(th9, null);
                                    dk2.q(r4, list3, list4, list5, js1Var3, js1Var4, js1Var, js1Var2);
                                } finally {
                                    list3.clear();
                                }
                            }
                        }
                        return dm3.a;
                    }
                } finally {
                }
            default:
                List list6 = this.g;
                String str = (String) this.h;
                cs0 cs0Var = (cs0) this.i;
                cs0 cs0Var2 = (cs0) this.j;
                ns0 ns0Var = (ns0) this.k;
                ns0 ns0Var2 = (ns0) this.l;
                rs0 rs0Var = (rs0) this.m;
                ns0 ns0Var3 = (ns0) this.n;
                ns0 ns0Var4 = (ns0) this.o;
                ae1 ae1Var = (ae1) obj;
                ae1Var.getClass();
                if (list6.isEmpty()) {
                    ae1.W(ae1Var, null, new d00(-1983789629, new dz2(str, cs0Var, cs0Var2, 1), true), 3);
                } else {
                    ae1Var.X(list6.size(), new la(26, new cr2(23), list6), new jw(15, list6), new d00(802480018, new iz2(list6, ns0Var, ns0Var2, rs0Var, ns0Var3, ns0Var4), true));
                }
                return dm3.a;
        }
    }

    public /* synthetic */ ck2(List list, String str, cs0 cs0Var, cs0 cs0Var2, ns0 ns0Var, ns0 ns0Var2, rs0 rs0Var, ns0 ns0Var3, ns0 ns0Var4) {
        this.g = list;
        this.h = str;
        this.i = cs0Var;
        this.j = cs0Var2;
        this.k = ns0Var;
        this.l = ns0Var2;
        this.m = rs0Var;
        this.n = ns0Var3;
        this.o = ns0Var4;
    }
}
