package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fe1 {
    public final int a;
    public final List b;
    public final g5 c;
    public final bb1 d;
    public final int e;
    public final long f;
    public final Object g;
    public final Object h;
    public final wc1 i;
    public int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public boolean o;
    public int p = Integer.MIN_VALUE;
    public final int[] q;

    public fe1(int i, List list, g5 g5Var, bb1 bb1Var, int i2, int i3, int i4, long j, Object obj, Object obj2, wc1 wc1Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = g5Var;
        this.d = bb1Var;
        this.e = i4;
        this.f = j;
        this.g = obj;
        this.h = obj2;
        this.i = wc1Var;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i62 i62Var = (i62) list.get(i6);
            i5 += i62Var.g;
            iMax = Math.max(iMax, i62Var.f);
        }
        this.k = i5;
        this.n = iMax;
        this.q = new int[this.b.size() * 2];
        this.m = this.e;
        this.l = i5;
    }

    public final int a() {
        int i = this.l + this.m;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final long b(int i) {
        if (i == 0 && this.b.size() == 0) {
            return ((long) this.j) & 4294967295L;
        }
        int i2 = i * 2;
        int[] iArr = this.q;
        int i3 = iArr[i2];
        return (((long) iArr[i2 + 1]) & 4294967295L) | (((long) i3) << 32);
    }

    public final void c(h62 h62Var) {
        if (this.p == Integer.MIN_VALUE) {
            p21.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            i62 i62Var = (i62) list.get(i);
            int i2 = i62Var.g;
            long jB = b(i);
            nc2.u(((is1) this.i.a).g(this.g));
            h62.J(h62Var, i62Var, i41.c(jB, this.f), null, 6);
        }
    }

    public final void d(int i, int i2, int i3) {
        this.j = i;
        this.p = i3;
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            i62 i62Var = (i62) list.get(i4);
            int i5 = i4 * 2;
            g5 g5Var = this.c;
            if (g5Var == null) {
                throw nc2.y("null horizontalAlignment when isVertical == true");
            }
            int iA = g5Var.a(i62Var.f, i2, this.d);
            int[] iArr = this.q;
            iArr[i5] = iA;
            iArr[i5 + 1] = i;
            i += i62Var.g;
        }
    }
}
