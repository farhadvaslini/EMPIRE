package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class w32 {
    public String a;
    public gh3 b;
    public zp0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public ua0 i;
    public y9 j;
    public boolean k;
    public cp1 m;
    public v32 n;
    public bb1 o;
    public long s;
    public long h = q21.a;
    public long l = 0;
    public long p = n30.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public w32(String str, gh3 gh3Var, zp0 zp0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = gh3Var;
        this.c = zp0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long f(w32 w32Var, long j, bb1 bb1Var) {
        gh3 gh3Var = w32Var.b;
        cp1 cp1Var = w32Var.m;
        ua0 ua0Var = w32Var.i;
        ua0Var.getClass();
        cp1 cp1VarZ = vr.z(cp1Var, bb1Var, gh3Var, ua0Var, w32Var.c);
        w32Var.m = cp1VarZ;
        return cp1VarZ.a(w32Var.g, j);
    }

    public final int a(int i, bb1 bb1Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = n30.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, bb1Var);
        }
        v32 v32VarE = e(bb1Var);
        long jR = br.r(v32VarE.c(), this.d, jA, this.e);
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iJ = w22.j(new y9((ca) v32VarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jR).f);
        int iJ2 = m30.j(jA);
        if (iJ < iJ2) {
            iJ = iJ2;
        }
        this.q = i;
        this.r = iJ;
        return iJ;
    }

    public final boolean b(long j, bb1 bb1Var) {
        v32 v32Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, bb1Var) : j;
        y9 y9Var = this.j;
        boolean z2 = false;
        if (y9Var != null && (v32Var = this.n) != null && !v32Var.b() && bb1Var == this.o && (m30.c(jF, this.p) || (m30.i(jF) == m30.i(this.p) && m30.k(jF) == m30.k(this.p) && m30.h(jF) >= y9Var.f && !y9Var.d.d))) {
            if (!m30.c(jF, this.p)) {
                y9 y9Var2 = this.j;
                y9Var2.getClass();
                this.l = n30.d(jF, (((long) w22.j(Math.min(y9Var2.a.i.c(), y9Var2.d()))) << 32) | (((long) w22.j(y9Var2.f)) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= y9Var2.d() && ((int) (4294967295L & r12)) >= y9Var2.f)) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        v32 v32VarE = e(bb1Var);
        long jR = br.r(v32VarE.c(), this.d, jF, this.e);
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        y9 y9Var3 = new y9((ca) v32VarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jR);
        this.p = jF;
        int iJ = w22.j(y9Var3.d());
        float f = y9Var3.f;
        this.l = n30.d(jF, (((long) w22.j(f)) & 4294967295L) | (((long) iJ) << 32));
        if (this.d != 3 && (((int) (r3 >> 32)) < y9Var3.d() || ((int) (r3 & 4294967295L)) < f)) {
            z2 = true;
        }
        this.k = z2;
        this.j = y9Var3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = n30.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(ua0 ua0Var) {
        long jA;
        ua0 ua0Var2 = this.i;
        if (ua0Var != null) {
            int i = q21.b;
            jA = q21.a(ua0Var.h(), ua0Var.G());
        } else {
            jA = q21.a;
        }
        if (ua0Var2 == null) {
            this.i = ua0Var;
            this.h = jA;
        } else if (ua0Var == null || this.h != jA) {
            this.i = ua0Var;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final v32 e(bb1 bb1Var) {
        v32 caVar = this.n;
        if (caVar == null || bb1Var != this.o || caVar.b()) {
            this.o = bb1Var;
            String str = this.a;
            gh3 gh3VarY = n32.y(this.b, bb1Var);
            ua0 ua0Var = this.i;
            ua0Var.getClass();
            zp0 zp0Var = this.c;
            boolean z = this.e;
            ni0 ni0Var = ni0.f;
            caVar = new ca(str, gh3VarY, ni0Var, ni0Var, zp0Var, ua0Var, z);
        }
        this.n = caVar;
        return caVar;
    }

    public final String toString() {
        String str = this.j != null ? "<paragraph>" : "null";
        String strB = q21.b(this.h);
        long j = this.s;
        StringBuilder sbN = nc2.n("ParagraphLayoutCache(paragraph=", str, ", lastDensity=", strB, ", history=");
        sbN.append(j);
        sbN.append(", constraints=$)");
        return sbN.toString();
    }
}
