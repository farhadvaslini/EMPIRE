package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class i62 {
    public int f;
    public int g;
    public long h = 0;
    public long i = j62.b;
    public long j = 0;

    public Object E() {
        return null;
    }

    public int F0() {
        return (int) (this.h & 4294967295L);
    }

    public int G0() {
        return (int) (this.h >> 32);
    }

    public final void J0() {
        this.f = y02.h((int) (this.h >> 32), m30.k(this.i), m30.i(this.i));
        int iH = y02.h((int) (this.h & 4294967295L), m30.j(this.i), m30.h(this.i));
        this.g = iH;
        int i = this.f;
        long j = this.h;
        this.j = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iH - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void K0(long j, float f, ns0 ns0Var);

    public final void L0(long j) {
        if (p41.b(this.h, j)) {
            return;
        }
        this.h = j;
        J0();
    }

    public final void M0(long j) {
        if (m30.c(this.i, j)) {
            return;
        }
        this.i = j;
        J0();
    }

    public abstract int z0(i5 i5Var);
}
