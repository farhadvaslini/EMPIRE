package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ch3 extends gq1 {
    public final String a;
    public final gh3 b;
    public final zp0 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public ch3(String str, gh3 gh3Var, zp0 zp0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = gh3Var;
        this.c = zp0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch3)) {
            return false;
        }
        ch3 ch3Var = (ch3) obj;
        return s51.n(this.a, ch3Var.a) && s51.n(this.b, ch3Var.b) && s51.n(this.c, ch3Var.c) && this.d == ch3Var.d && this.e == ch3Var.e && this.f == ch3Var.f && this.g == ch3Var.g;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        fh3 fh3Var = new fh3();
        fh3Var.t = this.a;
        fh3Var.u = this.b;
        fh3Var.v = this.c;
        fh3Var.w = this.d;
        fh3Var.x = this.e;
        fh3Var.y = this.f;
        fh3Var.z = this.g;
        return fh3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.gq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(aq1 aq1Var) {
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        zp0 zp0Var;
        zp0 zp0Var2;
        int i5;
        int i6;
        fh3 fh3Var = (fh3) aq1Var;
        fh3Var.getClass();
        gh3 gh3Var = fh3Var.u;
        boolean z4 = false;
        boolean z5 = true;
        gh3 gh3Var2 = this.b;
        if (gh3Var2 != gh3Var) {
            if (!gh3Var2.a.b(gh3Var.a)) {
                z = true;
            }
            str = fh3Var.t;
            str2 = this.a;
            if (!s51.n(str, str2)) {
                fh3Var.t = str2;
                fh3Var.D = null;
                z4 = true;
            }
            boolean z6 = !fh3Var.u.c(gh3Var2);
            fh3Var.u = gh3Var2;
            i = fh3Var.z;
            i2 = this.g;
            if (i != i2) {
                fh3Var.z = i2;
                z6 = true;
            }
            i3 = fh3Var.y;
            i4 = this.f;
            if (i3 != i4) {
                fh3Var.y = i4;
                z6 = true;
            }
            z2 = fh3Var.x;
            z3 = this.e;
            if (z2 != z3) {
                fh3Var.x = z3;
                z6 = true;
            }
            zp0Var = fh3Var.v;
            zp0Var2 = this.c;
            if (!s51.n(zp0Var, zp0Var2)) {
                fh3Var.v = zp0Var2;
                z6 = true;
            }
            i5 = fh3Var.w;
            i6 = this.d;
            if (i5 != i6) {
                z5 = z6;
            } else {
                fh3Var.w = i6;
            }
            if (!z4 || z5) {
                w32 w32VarP1 = fh3Var.p1();
                String str3 = fh3Var.t;
                gh3 gh3Var3 = fh3Var.u;
                zp0 zp0Var3 = fh3Var.v;
                int i7 = fh3Var.w;
                boolean z7 = fh3Var.x;
                int i8 = fh3Var.y;
                int i9 = fh3Var.z;
                w32VarP1.a = str3;
                w32VarP1.b = gh3Var3;
                w32VarP1.c = zp0Var3;
                w32VarP1.d = i7;
                w32VarP1.e = z7;
                w32VarP1.f = i8;
                w32VarP1.g = i9;
                w32VarP1.s = (w32VarP1.s << 2) | 2;
                w32VarP1.c();
            }
            if (fh3Var.s) {
                return;
            }
            if (z4 || (z && fh3Var.C != null)) {
                y02.w(fh3Var);
            }
            if (z4 || z5) {
                lq.J(fh3Var);
                vr.J(fh3Var);
            }
            if (z) {
                vr.J(fh3Var);
                return;
            }
            return;
        }
        gh3Var2.getClass();
        z = false;
        str = fh3Var.t;
        str2 = this.a;
        if (!s51.n(str, str2)) {
        }
        boolean z62 = !fh3Var.u.c(gh3Var2);
        fh3Var.u = gh3Var2;
        i = fh3Var.z;
        i2 = this.g;
        if (i != i2) {
        }
        i3 = fh3Var.y;
        i4 = this.f;
        if (i3 != i4) {
        }
        z2 = fh3Var.x;
        z3 = this.e;
        if (z2 != z3) {
        }
        zp0Var = fh3Var.v;
        zp0Var2 = this.c;
        if (!s51.n(zp0Var, zp0Var2)) {
        }
        i5 = fh3Var.w;
        i6 = this.d;
        if (i5 != i6) {
        }
        if (!z4) {
            w32 w32VarP12 = fh3Var.p1();
            String str32 = fh3Var.t;
            gh3 gh3Var32 = fh3Var.u;
            zp0 zp0Var32 = fh3Var.v;
            int i72 = fh3Var.w;
            boolean z72 = fh3Var.x;
            int i82 = fh3Var.y;
            int i92 = fh3Var.z;
            w32VarP12.a = str32;
            w32VarP12.b = gh3Var32;
            w32VarP12.c = zp0Var32;
            w32VarP12.d = i72;
            w32VarP12.e = z72;
            w32VarP12.f = i82;
            w32VarP12.g = i92;
            w32VarP12.s = (w32VarP12.s << 2) | 2;
            w32VarP12.c();
        }
        if (fh3Var.s) {
        }
    }

    public final int hashCode() {
        return (((by1.b(nc2.b(this.d, (this.c.hashCode() + by1.c(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
