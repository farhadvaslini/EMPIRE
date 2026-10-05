package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class t63 {
    public y63 a;
    public long b;
    public boolean c;
    public int d;

    public t63(long j, y63 y63Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = y63Var;
        this.b = j;
        cr2 cr2Var = a73.a;
        if (j != 0) {
            y63 y63VarD = d();
            long j2 = y63VarD.h;
            long[] jArr = y63VarD.i;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = y63VarD.g;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = y63VarD.f;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (a73.c) {
                iA = a73.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(t63 t63Var) {
        a73.b.K(t63Var);
    }

    public final void a() {
        synchronized (a73.c) {
            b();
            p();
        }
    }

    public void b() {
        a73.d = a73.d.b(g());
    }

    public abstract void c();

    public y63 d() {
        return this.a;
    }

    public abstract ns0 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract ns0 i();

    public final t63 j() {
        pi piVar = a73.b;
        t63 t63Var = (t63) piVar.j();
        piVar.K(this);
        return t63Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(n93 n93Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            a73.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(y63 y63Var) {
        this.a = y63Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract t63 u(ns0 ns0Var);
}
