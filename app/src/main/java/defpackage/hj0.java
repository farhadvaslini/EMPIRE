package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hj0 extends n51 implements ya1 {
    public u23 A;
    public cs0 B;
    public vi0 C;
    public long D;
    public h5 E;
    public final gj0 F;
    public final gj0 G;
    public gk3 u;
    public bk3 v;
    public bk3 w;
    public bk3 x;
    public ij0 y;
    public ek0 z;

    public hj0(gk3 gk3Var, bk3 bk3Var, bk3 bk3Var2, bk3 bk3Var3, ij0 ij0Var, ek0 ek0Var, u23 u23Var, cs0 cs0Var, vi0 vi0Var) {
        super(1);
        this.u = gk3Var;
        this.v = bk3Var;
        this.w = bk3Var2;
        this.x = bk3Var3;
        this.y = ij0Var;
        this.z = ek0Var;
        this.A = u23Var;
        this.B = cs0Var;
        this.C = vi0Var;
        this.D = -9223372034707292160L;
        n30.b(0, 0, 0, 0, 15);
        this.F = new gj0(this, 0);
        this.G = new gj0(this, 1);
    }

    @Override // defpackage.ya1
    public final void J(ab1 ab1Var) {
        this.A.e = ab1Var;
    }

    @Override // defpackage.aq1
    public final void h1() {
        this.D = -9223372034707292160L;
    }

    public final h5 r1() {
        h5 h5Var;
        h5 h5Var2;
        if (this.u.f().b(ti0.f, ti0.g)) {
            hs hsVar = this.y.a.c;
            if (hsVar != null && (h5Var2 = hsVar.a) != null) {
                return h5Var2;
            }
            hs hsVar2 = this.z.a.c;
            if (hsVar2 != null) {
                return hsVar2.a;
            }
            return null;
        }
        hs hsVar3 = this.z.a.c;
        if (hsVar3 != null && (h5Var = hsVar3.a) != null) {
            return h5Var;
        }
        hs hsVar4 = this.y.a.c;
        if (hsVar4 != null) {
            return hsVar4.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    @Override // defpackage.n51, defpackage.kb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        ak3 ak3VarA;
        ak3 ak3VarA2;
        wj3 wj3Var;
        ak3 ak3VarA3;
        zi0 zi0Var;
        long j2;
        zi0 zi0Var2;
        long j3;
        ak3 ak3VarA4;
        if (this.u.a.h() == this.u.d.getValue()) {
            this.E = null;
        } else if (this.E == null) {
            h5 h5VarR1 = r1();
            if (h5VarR1 == null) {
                h5VarR1 = f5.g;
            }
            this.E = h5VarR1;
        }
        boolean zM = en1Var.M();
        oi0 oi0Var = oi0.f;
        if (zM) {
            i62 i62VarT = xm1Var.t(j);
            long j4 = (((long) i62VarT.f) << 32) | (((long) i62VarT.g) & 4294967295L);
            this.D = j4;
            return en1Var.I0((int) (j4 >> 32), (int) (j4 & 4294967295L), oi0Var, new fe(i62VarT, 1));
        }
        if (!((Boolean) this.B.a()).booleanValue()) {
            i62 i62VarT2 = xm1Var.t(j);
            return en1Var.I0(i62VarT2.f, i62VarT2.g, oi0Var, new fe(i62VarT2, 2));
        }
        vi0 vi0Var = this.C;
        bk3 bk3Var = vi0Var.a;
        u23 u23Var = vi0Var.b;
        bk3 bk3Var2 = vi0Var.c;
        gk3 gk3Var = vi0Var.d;
        ij0 ij0Var = vi0Var.e;
        fk3 fk3Var = ij0Var.a;
        ek0 ek0Var = vi0Var.f;
        bk3 bk3Var3 = vi0Var.g;
        if (bk3Var != null) {
            ak3VarA = bk3Var.a(new xi0(ij0Var, ek0Var, 0), u23Var.c() ? Float.valueOf(u23Var.g) : null, null, new yi0(ij0Var, ek0Var, u23Var, 0));
        } else {
            ak3VarA = null;
        }
        if (bk3Var2 != null) {
            ak3VarA2 = bk3Var2.a(new xi0(ij0Var, ek0Var, 1), u23Var.c() ? Float.valueOf(u23Var.h) : null, u23Var.a(), new yi0(ij0Var, ek0Var, u23Var, 1));
        } else {
            ak3VarA2 = null;
        }
        if (gk3Var.a.h() == ti0.f) {
            kr2 kr2Var = fk3Var.d;
            if (kr2Var != null) {
                wj3Var = new wj3(kr2Var.b);
            } else {
                kr2 kr2Var2 = ek0Var.a.d;
                wj3Var = kr2Var2 != null ? new wj3(kr2Var2.b) : null;
            }
        } else {
            kr2 kr2Var3 = ek0Var.a.d;
            if (kr2Var3 != null) {
                wj3Var = new wj3(kr2Var3.b);
            } else {
                kr2 kr2Var4 = fk3Var.d;
                if (kr2Var4 != null) {
                    wj3Var = new wj3(kr2Var4.b);
                }
            }
        }
        if (bk3Var3 != null) {
            ak3VarA3 = bk3Var3.a(hd.q, u23Var.c() ? new wj3(u23Var.i) : null, null, new zi0(wj3Var, ij0Var, ek0Var, u23Var));
        } else {
            ak3VarA3 = null;
        }
        zi0 zi0Var3 = new zi0(u23Var, ak3VarA, ak3VarA2, ak3VarA3);
        i62 i62VarT3 = xm1Var.t(j);
        long j5 = (((long) i62VarT3.f) << 32) | (((long) i62VarT3.g) & 4294967295L);
        long j6 = !p41.b(this.D, -9223372034707292160L) ? this.D : j5;
        bk3 bk3Var4 = this.v;
        ak3 ak3VarA5 = bk3Var4 != null ? bk3Var4.a(this.F, null, null, new fj0(this, j6, 0)) : null;
        long jD = n30.d(j, ak3VarA5 != null ? ((p41) ak3VarA5.getValue()).a : j5);
        bk3 bk3Var5 = this.w;
        if (bk3Var5 != null) {
            zi0Var = zi0Var3;
            j2 = ((i41) bk3Var5.a(hd.t, null, null, new fj0(this, j6, 2)).getValue()).a;
        } else {
            zi0Var = zi0Var3;
            j2 = 0;
        }
        long j7 = j2;
        bk3 bk3Var6 = this.x;
        if (bk3Var6 != null) {
            u23 u23Var2 = this.A;
            zi0Var2 = zi0Var;
            j3 = j5;
            ak3VarA4 = bk3Var6.a(this.G, u23Var2.c() ? new i41(u23Var2.j) : null, this.A.b(), new fj0(this, j6, 1));
        } else {
            zi0Var2 = zi0Var;
            j3 = j5;
            ak3VarA4 = null;
        }
        return en1Var.I0((int) (jD >> 32), (int) (jD & 4294967295L), oi0Var, new ej0(this, ak3VarA4, j3, j6, jD, i62VarT3, j7, zi0Var2));
    }
}
