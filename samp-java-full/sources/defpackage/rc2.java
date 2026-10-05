package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rc2 implements md1 {
    public final int a;
    public final pi b;
    public final ns0 c;
    public m30 d;
    public qa3 e;
    public gc1 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public qc2 l;
    public boolean m;
    public long n;
    public long o;
    public long p = hq1.a();
    public boolean q;
    public final /* synthetic */ yj0 r;

    public rc2(yj0 yj0Var, int i, pi piVar, ns0 ns0Var) {
        this.r = yj0Var;
        this.a = i;
        this.b = piVar;
        this.c = ns0Var;
    }

    @Override // defpackage.md1
    public final void a() {
        this.m = true;
    }

    public final void b() {
        gc1 gc1Var = this.f;
        if (gc1Var != null) {
            switch (gc1Var.a) {
                case 0:
                    break;
                default:
                    zb1 zb1VarB = gc1Var.b();
                    if ((zb1VarB != null ? zb1VarB.f : null) != null) {
                        hc1.a(gc1Var.b, gc1Var.c);
                    }
                    break;
            }
        }
        this.f = null;
        qa3 qa3Var = this.e;
        if (qa3Var != null) {
            qa3Var.a();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(za zaVar) {
        boolean zD;
        if (!this.r.a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(zaVar);
            } finally {
                Trace.endSection();
            }
        } else {
            zD = d(zaVar);
        }
        s51.J(-1L, "compose:lazy:prefetch:execute:item");
        return zD;
    }

    @Override // defpackage.md1
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01f2  */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(za zaVar) {
        long j;
        ?? r12;
        List list;
        qa3 qa3VarD;
        int i = this.a;
        long j2 = i;
        s51.J(j2, "compose:lazy:prefetch:execute:item");
        ad1 ad1Var = (ad1) ((zc1) this.r.b).b.a();
        if (!this.h) {
            int iA = ad1Var.a();
            if (i >= 0 && i < iA) {
                Object objB = ad1Var.b(i);
                Object obj = this.j;
                if (obj != null && !objB.equals(obj)) {
                    b();
                    return false;
                }
                Object objC = ad1Var.c(i);
                pi piVar = this.b;
                kk kkVar = (kk) piVar.i;
                if (piVar.h != objC || kkVar == null) {
                    is1 is1Var = (is1) piVar.g;
                    Object objG = is1Var.g(objC);
                    Object obj2 = objG;
                    if (objG == null) {
                        kk kkVar2 = new kk();
                        kkVar2.e = -1;
                        is1Var.m(objC, kkVar2);
                        obj2 = kkVar2;
                    }
                    kkVar = (kk) obj2;
                    piVar.h = objC;
                    piVar.i = kkVar;
                }
                e();
                long jA = zaVar.a();
                this.n = jA;
                this.p = hq1.a();
                this.o = 0L;
                s51.J(jA, "compose:lazy:prefetch:available_time_nanos");
                if (e()) {
                    j = 0;
                } else {
                    j = 0;
                    if (g(this.n, kkVar.a + kkVar.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(objB, objC, kkVar);
                        } finally {
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.f != null) {
                    if (!g(this.n, kkVar.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        gc1 gc1Var = this.f;
                        if (gc1Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (gc1Var.a) {
                            case 0:
                                qa3VarD = gc1Var.b.d(gc1Var.c);
                                break;
                            default:
                                hc1 hc1Var = gc1Var.b;
                                zb1 zb1VarB = gc1Var.b();
                                if (zb1VarB != null) {
                                    hc1Var.b(zb1VarB, false);
                                }
                                qa3VarD = hc1Var.d(gc1Var.c);
                                break;
                        }
                        this.e = qa3VarD;
                        this.f = null;
                        this.i = true;
                        Trace.endSection();
                        h();
                        kkVar.c = kk.a(this.o, kkVar.c);
                    } finally {
                    }
                }
                if (!this.k) {
                    if (this.n <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        qa3 qa3Var = this.e;
                        if (qa3Var == null) {
                            throw nc2.y("Should precompose before resolving nested prefetch states");
                        }
                        qk2 qk2Var = new qk2();
                        qa3Var.b(new t6(5, qk2Var));
                        List list2 = (List) qk2Var.f;
                        this.l = list2 != null ? new qc2(this, list2) : null;
                        this.k = true;
                    } finally {
                    }
                }
                qc2 qc2Var = this.l;
                if (qc2Var != null) {
                    int i2 = kkVar.e;
                    boolean z = this.m;
                    List[] listArr = qc2Var.b;
                    int i3 = qc2Var.c;
                    List list3 = qc2Var.a;
                    if (i3 < list3.size()) {
                        if (qc2Var.f.h) {
                            p21.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((nd1) list3.get(i4)).d = i2;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (qc2Var.c < list3.size()) {
                                try {
                                    if (listArr[qc2Var.c] == null) {
                                        if (zaVar.a() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = qc2Var.c;
                                        nd1 nd1Var = (nd1) list3.get(i5);
                                        ns0 ns0Var = nd1Var.a;
                                        if (ns0Var == null) {
                                            list = ni0.f;
                                        } else {
                                            ld1 ld1Var = new ld1(nd1Var, nd1Var.d);
                                            ns0Var.h(ld1Var);
                                            ArrayList arrayList = ld1Var.b;
                                            nd1Var.f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i5] = list;
                                    }
                                    List list4 = listArr[qc2Var.c];
                                    list4.getClass();
                                    while (qc2Var.d < list4.size()) {
                                        rc2 rc2Var = (rc2) list4.get(qc2Var.d);
                                        if (z) {
                                            rc2 rc2Var2 = rc2Var != null ? rc2Var : null;
                                            if (rc2Var2 != null) {
                                                r12 = 1;
                                                rc2Var2.m = true;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        qc2Var.e = r12;
                                        if (rc2Var.c(zaVar)) {
                                            return r12;
                                        }
                                        qc2Var.d += r12;
                                    }
                                    qc2Var.d = 0;
                                    qc2Var.c++;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                qc2 qc2Var2 = this.l;
                if (qc2Var2 != null && qc2Var2.e) {
                    h();
                    s51.J(j2, "compose:lazy:prefetch:execute:item");
                    qc2 qc2Var3 = this.l;
                    if (qc2Var3 != null) {
                        qc2Var3.e = false;
                    }
                }
                m30 m30Var = this.d;
                if (!this.g && m30Var != null) {
                    if (!g(this.n, kkVar.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j3 = m30Var.a;
                        if (this.h) {
                            p21.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.g) {
                            p21.a("Request was already measured!");
                        }
                        this.g = true;
                        qa3 qa3Var2 = this.e;
                        if (qa3Var2 == null) {
                            throw nc2.y("performComposition() must be called before performMeasure()");
                        }
                        int iC = qa3Var2.c();
                        for (int i6 = 0; i6 < iC; i6++) {
                            qa3Var2.d(i6, j3);
                        }
                        Trace.endSection();
                        h();
                        kkVar.d = kk.a(this.o, kkVar.d);
                        ns0 ns0Var2 = this.c;
                        if (ns0Var2 != null) {
                            ns0Var2.h(this);
                        }
                    } finally {
                    }
                }
                qc2 qc2Var4 = this.l;
                if (this.g && this.k && qc2Var4 != null) {
                    List list5 = qc2Var4.a;
                    int size2 = list5.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < size2; i7++) {
                        iMin = Math.min(iMin, ((nd1) list5.get(i7)).e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i8 = kkVar.e;
                    kkVar.e = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                    int size3 = list5.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size3; i9++) {
                        iMin2 = Math.min(iMin2, ((nd1) list5.get(i9)).f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        kkVar.d = j;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        gc1 gc1Var;
        return this.i || ((gc1Var = this.f) != null && gc1Var.c());
    }

    public final void f(Object obj, Object obj2, kk kkVar) {
        gc1 gc1Var;
        gc1 gc1Var2 = this.f;
        int i = 0;
        if (gc1Var2 == null) {
            yj0 yj0Var = this.r;
            rs0 rs0VarA = ((zc1) yj0Var.b).a(this.a, obj, obj2);
            hc1 hc1VarA = ((ra3) yj0Var.c).a();
            if (hc1VarA.f.H()) {
                hc1VarA.k(obj, rs0VarA, true);
                gc1Var = new gc1(hc1VarA, obj, 1);
            } else {
                gc1Var = new gc1(hc1VarA, obj, i);
            }
            gc1Var2 = gc1Var;
            this.f = gc1Var2;
            this.j = obj;
        }
        this.q = false;
        while (!gc1Var2.c() && !this.q) {
            pc2 pc2Var = new pc2(this, kkVar);
            switch (gc1Var2.a) {
                case 0:
                    break;
                default:
                    zb1 zb1VarB = gc1Var2.b();
                    g52 g52Var = zb1VarB != null ? zb1VarB.f : null;
                    if (g52Var != null && !g52Var.c()) {
                        t63 t63VarL = jo3.l();
                        ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
                        t63 t63VarS = jo3.s(t63VarL);
                        try {
                            g52Var.e(pc2Var);
                        } finally {
                        }
                    }
                    break;
            }
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            kkVar.b = kk.a(j, kkVar.b);
        } else {
            kkVar.a = kk.a(j, kkVar.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        long jF;
        long jA = hq1.a();
        long j = this.p;
        long j2 = Long.MAX_VALUE;
        if (((j - 1) | 1) != Long.MAX_VALUE) {
            jF = (1 | (jA - 1)) == Long.MAX_VALUE ? br.F(jA) : br.M(jA, j);
        } else if (jA == j) {
            zj zjVar = ig0.f;
            jF = 0;
        } else {
            long jF2 = br.F(j);
            zj zjVar2 = ig0.f;
            jF = ((-(jF2 >> 1)) << 1) + ((long) (((int) jF2) & 1));
            int i = kg0.a;
        }
        long j3 = jF >> 1;
        zj zjVar3 = ig0.f;
        if ((((int) jF) & 1) == 0) {
            j2 = j3;
        } else if (j3 <= 9223372036854L) {
            j2 = j3 < -9223372036854L ? Long.MIN_VALUE : j3 * 1000000;
        }
        this.o = j2;
        long j4 = this.n - j2;
        this.n = j4;
        this.p = jA;
        s51.J(j4, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        m30 m30Var = this.d;
        boolean zE = e();
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(m30Var);
        sb.append(", isComposed = ");
        by1.k(sb, zE, ", isMeasured = ", z, ", isCanceled = ");
        sb.append(z2);
        sb.append(" }");
        return sb.toString();
    }
}
