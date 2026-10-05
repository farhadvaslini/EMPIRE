package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ok0 {
    public final /* synthetic */ ip0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ os1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ t73 g;
    public final /* synthetic */ os1 h;
    public final /* synthetic */ ns0 i;
    public final /* synthetic */ a42 j;
    public final /* synthetic */ a42 k;

    public ok0(ip0 ip0Var, boolean z, os1 os1Var, String str, String str2, String str3, t73 t73Var, os1 os1Var2, ns0 ns0Var, a42 a42Var, a42 a42Var2) {
        this.a = ip0Var;
        this.b = z;
        this.c = os1Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = t73Var;
        this.h = os1Var2;
        this.i = ns0Var;
        this.j = a42Var;
        this.k = a42Var2;
    }

    public final void a(final boolean z, final cs0 cs0Var, bq1 bq1Var, es2 es2Var, boolean z2, z13 z13Var, long j, float f, final d00 d00Var, nv0 nv0Var, final int i, final int i2) {
        int i3;
        final bq1 bq1Var2;
        final es2 es2Var2;
        final boolean z3;
        final z13 z13Var2;
        final long j2;
        final float f2;
        int i4;
        es2 es2Var3;
        bq1 bq1Var3;
        boolean z4;
        es2 es2Var4;
        bq1 bq1Var4;
        z13 z13Var3;
        long j3;
        es2 es2Var5;
        bq1 bq1Var5;
        boolean z5;
        nv0Var.b0(-126848451);
        int i5 = i | (nv0Var.g(z) ? 4 : 2) | (nv0Var.h(cs0Var) ? 32 : 16) | 919168384;
        if ((i2 & 6) == 0) {
            i3 = i2 | (nv0Var.h(d00Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.f(this) ? 32 : 16;
        }
        if (nv0Var.R(i5 & 1, ((306783379 & i5) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                es2 es2VarA = n92.A(nv0Var);
                float f3 = on1.a;
                z13 z13VarA = g23.a(s51.w, nv0Var);
                long jE = hy.e(s51.u, nv0Var);
                i4 = i5 & (-4135937);
                es2Var3 = es2VarA;
                f2 = on1.a;
                bq1Var3 = yp1.a;
                z4 = true;
                j2 = jE;
                z13Var2 = z13VarA;
            } else {
                nv0Var.U();
                bq1Var3 = bq1Var;
                z4 = z2;
                z13Var2 = z13Var;
                j2 = j;
                f2 = f;
                i4 = i5 & (-4135937);
                es2Var3 = es2Var;
            }
            nv0Var.q();
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                Object d42Var = new d42(dm3.a, f5.f0);
                nv0Var.j0(d42Var);
                objO = d42Var;
            }
            os1 os1Var = (os1) objO;
            ua0 ua0Var = (ua0) nv0Var.j(s20.h);
            WeakHashMap weakHashMap = qt3.w;
            int i6 = ak2.e(nv0Var).f.e().b;
            if (z) {
                es2Var4 = es2Var3;
                nv0Var.a0(629991660);
                Object objO2 = nv0Var.O();
                if (objO2 == obj) {
                    bq1Var4 = bq1Var3;
                    objO2 = new yb(os1Var, 5);
                    nv0Var.j0(objO2);
                } else {
                    bq1Var4 = bq1Var3;
                }
                ur.h((cs0) objO2, nv0Var, 6);
                nv0Var.p(false);
            } else {
                es2Var4 = es2Var3;
                bq1Var4 = bq1Var3;
                nv0Var.a0(630077189);
                nv0Var.p(false);
            }
            Object objO3 = nv0Var.O();
            if (objO3 == obj) {
                objO3 = new ps1(Boolean.FALSE);
                nv0Var.j0(objO3);
            }
            ps1 ps1Var = (ps1) objO3;
            boolean z6 = z4;
            ps1Var.c.setValue(Boolean.valueOf(z));
            if (((Boolean) ps1Var.b.getValue()).booleanValue() || ((Boolean) ps1Var.c.getValue()).booleanValue()) {
                nv0Var.a0(630396489);
                Object objO4 = nv0Var.O();
                if (objO4 == obj) {
                    z13Var3 = z13Var2;
                    j3 = j2;
                    objO4 = b32.w(new wj3(wj3.b));
                    nv0Var.j0(objO4);
                } else {
                    z13Var3 = z13Var2;
                    j3 = j2;
                }
                os1 os1Var2 = (os1) objO4;
                boolean zF = nv0Var.f(ua0Var) | nv0Var.d(i6);
                Object objO5 = nv0Var.O();
                if (zF || objO5 == obj) {
                    objO5 = new pk0(ua0Var, i6, os1Var, new l8(os1Var2, 2));
                    nv0Var.j0(objO5);
                }
                pk0 pk0Var = (pk0) objO5;
                ((hk0) this.h.getValue()).getClass();
                ((Boolean) this.c.getValue()).getClass();
                es2Var5 = es2Var4;
                z13Var2 = z13Var3;
                j2 = j3;
                bq1Var5 = bq1Var4;
                z5 = z6;
                xa.a(pk0Var, cs0Var, new vb2(!((Boolean) s51.y(0, 7, nv0Var).getValue()).booleanValue() ? 393248 : 393216, true), gq.N(2063119149, new jk0(this, bq1Var5, z5, ps1Var, os1Var2, es2Var5, z13Var2, j2, f2, d00Var), nv0Var), nv0Var, (i4 & 112) | 3072, 0);
                nv0Var.p(false);
            } else {
                nv0Var.a0(631807237);
                nv0Var.p(false);
                es2Var5 = es2Var4;
                bq1Var5 = bq1Var4;
                z5 = z6;
            }
            bq1Var2 = bq1Var5;
            es2Var2 = es2Var5;
            z3 = z5;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            es2Var2 = es2Var;
            z3 = z2;
            z13Var2 = z13Var;
            j2 = j;
            f2 = f;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(z, cs0Var, bq1Var2, es2Var2, z3, z13Var2, j2, f2, d00Var, i, i2) { // from class: ik0
                public final /* synthetic */ boolean g;
                public final /* synthetic */ cs0 h;
                public final /* synthetic */ bq1 i;
                public final /* synthetic */ es2 j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ z13 l;
                public final /* synthetic */ long m;
                public final /* synthetic */ float n;
                public final /* synthetic */ d00 o;
                public final /* synthetic */ int p;

                {
                    this.p = i2;
                }

                @Override // defpackage.rs0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = jo3.y(1);
                    int iY2 = jo3.y(this.p);
                    this.f.a(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (nv0) obj2, iY, iY2);
                    return dm3.a;
                }
            };
        }
    }

    public final bq1 b(bq1 bq1Var, boolean z) {
        bq1 bq1VarB = f80.B(bq1Var, this.a);
        os1 os1Var = this.h;
        bq1 bq1VarD = bq1VarB.d(new fk0(new yb(os1Var, 6)));
        bq1 bq1VarA = yp1.a;
        if (z) {
            ns0 ns0Var = this.i;
            boolean z2 = this.b;
            mc0 mc0Var = new mc0(os1Var, ns0Var, z2);
            bq1VarA = su2.a(vm1.F(ob3.a(bq1VarA, mc0Var, new v8(2, mc0Var)), new la(mc0Var, z2, this.c)), false, new i(z2, this.d, this.e, this.f, mc0Var, this.g));
        }
        return bq1VarD.d(bq1VarA);
    }
}
