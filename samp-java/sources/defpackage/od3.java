package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.aq1 r19) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od3.g(aq1):void");
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
