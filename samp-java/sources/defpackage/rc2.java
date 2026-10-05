package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.za r22) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.d(za):boolean");
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
