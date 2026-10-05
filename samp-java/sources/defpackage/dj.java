package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dj implements bj, en1, hl1 {
    public final nb1 f;
    public i23 g;
    public boolean h;

    public dj(nb1 nb1Var, i23 i23Var) {
        this.f = nb1Var;
        this.g = i23Var;
    }

    @Override // defpackage.ua0
    public final long C0(long j) {
        return this.f.C0(j);
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.f.G();
    }

    @Override // defpackage.ua0
    public final float H0(long j) {
        return this.f.H0(j);
    }

    @Override // defpackage.en1
    public final dn1 I0(int i, int i2, Map map, ns0 ns0Var) {
        return this.f.o0(i, i2, map, null, ns0Var);
    }

    @Override // defpackage.k51
    public final boolean M() {
        return false;
    }

    @Override // defpackage.ua0
    public final long P0(float f) {
        return this.f.P0(f);
    }

    @Override // defpackage.ua0
    public final long Q(float f) {
        return this.f.Q(f);
    }

    @Override // defpackage.ua0
    public final long R(long j) {
        return this.f.R(j);
    }

    @Override // defpackage.ua0
    public final float T(float f) {
        return this.f.h() * f;
    }

    @Override // defpackage.ua0
    public final float X0(int i) {
        return this.f.X0(i);
    }

    @Override // defpackage.ua0
    public final float a1(float f) {
        return f / this.f.h();
    }

    @Override // defpackage.hl1
    public final ab1 c(ab1 ab1Var) {
        dl1 dl1Var;
        if (ab1Var instanceof dl1) {
            return ab1Var;
        }
        if (ab1Var instanceof ex1) {
            cl1 cl1VarU1 = ((ex1) ab1Var).u1();
            return (cl1VarU1 == null || (dl1Var = cl1VarU1.C) == null) ? ab1Var : dl1Var;
        }
        m21.b("Unsupported LayoutCoordinates");
        c.d();
        return null;
    }

    @Override // defpackage.ua0
    public final int f0(long j) {
        return this.f.f0(j);
    }

    @Override // defpackage.k51
    public final bb1 getLayoutDirection() {
        return this.f.z.F;
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.f.h();
    }

    @Override // defpackage.ua0
    public final float j0(long j) {
        return this.f.j0(j);
    }

    @Override // defpackage.en1
    public final dn1 o0(int i, int i2, Map map, ns0 ns0Var, ns0 ns0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            m21.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new cj(i, i2, map, ns0Var, ns0Var2, this, 0);
    }

    @Override // defpackage.ua0
    public final int p0(float f) {
        return this.f.p0(f);
    }
}
