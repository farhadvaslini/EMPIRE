package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.aq1 r11) {
        /*
            r10 = this;
            fh3 r11 = (defpackage.fh3) r11
            r11.getClass()
            gh3 r0 = r11.u
            r1 = 0
            r2 = 1
            gh3 r3 = r10.b
            if (r3 == r0) goto L1a
            h83 r4 = r3.a
            h83 r0 = r0.a
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L18
            goto L1d
        L18:
            r0 = r2
            goto L1e
        L1a:
            r3.getClass()
        L1d:
            r0 = r1
        L1e:
            java.lang.String r4 = r11.t
            java.lang.String r5 = r10.a
            boolean r4 = defpackage.s51.n(r4, r5)
            if (r4 == 0) goto L29
            goto L2f
        L29:
            r11.t = r5
            r1 = 0
            r11.D = r1
            r1 = r2
        L2f:
            gh3 r4 = r11.u
            boolean r4 = r4.c(r3)
            r4 = r4 ^ r2
            r11.u = r3
            int r3 = r11.z
            int r5 = r10.g
            if (r3 == r5) goto L41
            r11.z = r5
            r4 = r2
        L41:
            int r3 = r11.y
            int r5 = r10.f
            if (r3 == r5) goto L4a
            r11.y = r5
            r4 = r2
        L4a:
            boolean r3 = r11.x
            boolean r5 = r10.e
            if (r3 == r5) goto L53
            r11.x = r5
            r4 = r2
        L53:
            zp0 r3 = r11.v
            zp0 r5 = r10.c
            boolean r3 = defpackage.s51.n(r3, r5)
            if (r3 != 0) goto L60
            r11.v = r5
            r4 = r2
        L60:
            int r3 = r11.w
            int r10 = r10.d
            if (r3 != r10) goto L68
            r2 = r4
            goto L6a
        L68:
            r11.w = r10
        L6a:
            if (r1 != 0) goto L6e
            if (r2 == 0) goto L9a
        L6e:
            w32 r10 = r11.p1()
            java.lang.String r3 = r11.t
            gh3 r4 = r11.u
            zp0 r5 = r11.v
            int r6 = r11.w
            boolean r7 = r11.x
            int r8 = r11.y
            int r9 = r11.z
            r10.a = r3
            r10.b = r4
            r10.c = r5
            r10.d = r6
            r10.e = r7
            r10.f = r8
            r10.g = r9
            long r3 = r10.s
            r5 = 2
            long r3 = r3 << r5
            r5 = 2
            long r3 = r3 | r5
            r10.s = r3
            r10.c()
        L9a:
            boolean r10 = r11.s
            if (r10 != 0) goto L9f
            goto Lb9
        L9f:
            if (r1 != 0) goto La7
            if (r0 == 0) goto Laa
            dh3 r10 = r11.C
            if (r10 == 0) goto Laa
        La7:
            defpackage.y02.w(r11)
        Laa:
            if (r1 != 0) goto Lae
            if (r2 == 0) goto Lb4
        Lae:
            defpackage.lq.J(r11)
            defpackage.vr.J(r11)
        Lb4:
            if (r0 == 0) goto Lb9
            defpackage.vr.J(r11)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch3.g(aq1):void");
    }

    public final int hashCode() {
        return (((by1.b(nc2.b(this.d, (this.c.hashCode() + by1.c(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
