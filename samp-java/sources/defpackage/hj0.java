package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dn1 t(defpackage.en1 r24, defpackage.xm1 r25, long r26) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj0.t(en1, xm1, long):dn1");
    }
}
