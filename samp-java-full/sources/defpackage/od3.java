package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class od3 extends gq1 {
    public final af a;
    public final gh3 b;
    public final zp0 c;
    public final ns0 d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final List i;
    public final ns0 j;
    public final ns0 k;

    public od3(af afVar, gh3 gh3Var, zp0 zp0Var, ns0 ns0Var, int i, boolean z, int i2, int i3, List list, ns0 ns0Var2, ns0 ns0Var3) {
        this.a = afVar;
        this.b = gh3Var;
        this.c = zp0Var;
        this.d = ns0Var;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = ns0Var2;
        this.k = ns0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od3)) {
            return false;
        }
        od3 od3Var = (od3) obj;
        return s51.n(this.a, od3Var.a) && s51.n(this.b, od3Var.b) && s51.n(this.i, od3Var.i) && s51.n(this.c, od3Var.c) && this.d == od3Var.d && this.k == od3Var.k && this.e == od3Var.e && this.f == od3Var.f && this.g == od3Var.g && this.h == od3Var.h && this.j == od3Var.j;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        rd3 rd3Var = new rd3();
        rd3Var.t = this.a;
        rd3Var.u = this.b;
        rd3Var.v = this.c;
        rd3Var.w = this.d;
        rd3Var.x = this.e;
        rd3Var.y = this.f;
        rd3Var.z = this.g;
        rd3Var.A = this.h;
        rd3Var.B = this.i;
        rd3Var.C = this.j;
        rd3Var.D = this.k;
        return rd3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.gq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(aq1 aq1Var) {
        boolean z;
        boolean zN;
        boolean z2;
        List list;
        List list2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        zp0 zp0Var;
        zp0 zp0Var2;
        int i5;
        int i6;
        ns0 ns0Var;
        ns0 ns0Var2;
        ns0 ns0Var3;
        ns0 ns0Var4;
        ns0 ns0Var5;
        ns0 ns0Var6;
        rd3 rd3Var = (rd3) aq1Var;
        gh3 gh3Var = rd3Var.u;
        boolean z5 = false;
        boolean z6 = true;
        gh3 gh3Var2 = this.b;
        if (gh3Var2 != gh3Var) {
            if (!gh3Var2.a.b(gh3Var.a)) {
                z = true;
            }
            String str = rd3Var.t.g;
            af afVar = this.a;
            zN = s51.n(str, afVar.g);
            z2 = zN || !s51.n(rd3Var.t.f, afVar.f);
            if (z2) {
                rd3Var.t = afVar;
            }
            if (!zN) {
                rd3Var.H = null;
            }
            boolean z7 = !rd3Var.u.c(gh3Var2);
            rd3Var.u = gh3Var2;
            list = rd3Var.B;
            list2 = this.i;
            if (!s51.n(list, list2)) {
                rd3Var.B = list2;
                z7 = true;
            }
            i = rd3Var.A;
            i2 = this.h;
            if (i != i2) {
                rd3Var.A = i2;
                z7 = true;
            }
            i3 = rd3Var.z;
            i4 = this.g;
            if (i3 != i4) {
                rd3Var.z = i4;
                z7 = true;
            }
            z3 = rd3Var.y;
            z4 = this.f;
            if (z3 != z4) {
                rd3Var.y = z4;
                z7 = true;
            }
            zp0Var = rd3Var.v;
            zp0Var2 = this.c;
            if (!s51.n(zp0Var, zp0Var2)) {
                rd3Var.v = zp0Var2;
                z7 = true;
            }
            i5 = rd3Var.x;
            i6 = this.e;
            if (i5 != i6) {
                rd3Var.x = i6;
                z7 = true;
            }
            ns0Var = rd3Var.w;
            ns0Var2 = this.d;
            if (ns0Var != ns0Var2) {
                rd3Var.w = ns0Var2;
                z5 = true;
            }
            ns0Var3 = rd3Var.C;
            ns0Var4 = this.j;
            if (ns0Var3 != ns0Var4) {
                rd3Var.C = ns0Var4;
                z5 = true;
            }
            ns0Var5 = rd3Var.D;
            ns0Var6 = this.k;
            if (ns0Var5 == ns0Var6) {
                rd3Var.D = ns0Var6;
            } else {
                z6 = z5;
            }
            if (!z2 || z7 || z6) {
                rd3Var.p1().g(rd3Var.t, rd3Var.u, rd3Var.v, rd3Var.x, rd3Var.y, rd3Var.z, rd3Var.A, rd3Var.B);
            }
            if (rd3Var.s) {
                return;
            }
            if (z2 || (z && rd3Var.G != null)) {
                y02.w(rd3Var);
            }
            if (z2 || z7 || z6) {
                lq.J(rd3Var);
                vr.J(rd3Var);
            }
            if (z) {
                vr.J(rd3Var);
                return;
            }
            return;
        }
        gh3Var2.getClass();
        z = false;
        String str2 = rd3Var.t.g;
        af afVar2 = this.a;
        zN = s51.n(str2, afVar2.g);
        if (zN) {
        }
        if (z2) {
        }
        if (!zN) {
        }
        boolean z72 = !rd3Var.u.c(gh3Var2);
        rd3Var.u = gh3Var2;
        list = rd3Var.B;
        list2 = this.i;
        if (!s51.n(list, list2)) {
        }
        i = rd3Var.A;
        i2 = this.h;
        if (i != i2) {
        }
        i3 = rd3Var.z;
        i4 = this.g;
        if (i3 != i4) {
        }
        z3 = rd3Var.y;
        z4 = this.f;
        if (z3 != z4) {
        }
        zp0Var = rd3Var.v;
        zp0Var2 = this.c;
        if (!s51.n(zp0Var, zp0Var2)) {
        }
        i5 = rd3Var.x;
        i6 = this.e;
        if (i5 != i6) {
        }
        ns0Var = rd3Var.w;
        ns0Var2 = this.d;
        if (ns0Var != ns0Var2) {
        }
        ns0Var3 = rd3Var.C;
        ns0Var4 = this.j;
        if (ns0Var3 != ns0Var4) {
        }
        ns0Var5 = rd3Var.D;
        ns0Var6 = this.k;
        if (ns0Var5 == ns0Var6) {
        }
        if (!z2) {
            rd3Var.p1().g(rd3Var.t, rd3Var.u, rd3Var.v, rd3Var.x, rd3Var.y, rd3Var.z, rd3Var.A, rd3Var.B);
        }
        if (rd3Var.s) {
        }
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + by1.c(this.b, this.a.hashCode() * 31, 31)) * 31;
        ns0 ns0Var = this.d;
        int iB = (((by1.b(nc2.b(this.e, (iHashCode + (ns0Var != null ? ns0Var.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int iHashCode2 = (iB + (list != null ? list.hashCode() : 0)) * 31;
        ns0 ns0Var2 = this.j;
        int iHashCode3 = (iHashCode2 + (ns0Var2 != null ? ns0Var2.hashCode() : 0)) * 29791;
        ns0 ns0Var3 = this.k;
        return iHashCode3 + (ns0Var3 != null ? ns0Var3.hashCode() : 0);
    }
}
