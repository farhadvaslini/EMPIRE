package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ln2 implements Closeable {
    public final ll2 f;
    public final de2 g;
    public final String h;
    public final int i;
    public final mx0 j;
    public final ux0 k;
    public final nn2 l;
    public final q73 m;
    public final ln2 n;
    public final ln2 o;
    public final ln2 p;
    public final long q;
    public final long r;
    public final yj0 s;
    public final uj3 t;
    public final boolean u;

    public ln2(ll2 ll2Var, de2 de2Var, String str, int i, mx0 mx0Var, ux0 ux0Var, nn2 nn2Var, q73 q73Var, ln2 ln2Var, ln2 ln2Var2, ln2 ln2Var3, long j, long j2, yj0 yj0Var, uj3 uj3Var) {
        ll2Var.getClass();
        de2Var.getClass();
        str.getClass();
        nn2Var.getClass();
        uj3Var.getClass();
        this.f = ll2Var;
        this.g = de2Var;
        this.h = str;
        this.i = i;
        this.j = mx0Var;
        this.k = ux0Var;
        this.l = nn2Var;
        this.m = q73Var;
        this.n = ln2Var;
        this.o = ln2Var2;
        this.p = ln2Var3;
        this.q = j;
        this.r = j2;
        this.s = yj0Var;
        this.t = uj3Var;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.u = z;
    }

    public static String b(ln2 ln2Var, String str) {
        ln2Var.getClass();
        String strA = ln2Var.k.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    public final kn2 c() {
        kn2 kn2Var = new kn2();
        kn2Var.c = -1;
        kn2Var.g = nn2.f;
        kn2Var.o = uj3.e;
        kn2Var.a = this.f;
        kn2Var.b = this.g;
        kn2Var.c = this.i;
        kn2Var.d = this.h;
        kn2Var.e = this.j;
        kn2Var.f = this.k.c();
        kn2Var.g = this.l;
        kn2Var.h = this.m;
        kn2Var.i = this.n;
        kn2Var.j = this.o;
        kn2Var.k = this.p;
        kn2Var.l = this.q;
        kn2Var.m = this.r;
        kn2Var.n = this.s;
        kn2Var.o = this.t;
        return kn2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.l.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.g + ", code=" + this.i + ", message=" + this.h + ", url=" + this.f.a + '}';
    }
}
