package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class o22 implements zo {
    public final i32 b;
    public final zo c;
    public final bb1 d;

    public o22(i32 i32Var, zo zoVar, bb1 bb1Var) {
        this.b = i32Var;
        this.c = zoVar;
        this.d = bb1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @Override // defpackage.zo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r11, float r12, float r13) {
        /*
            r10 = this;
            zo r0 = r10.c
            float r0 = r0.a(r11, r12, r13)
            r1 = 0
            int r2 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L14
            float r11 = r11 + r12
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L1e
        L12:
            r3 = r4
            goto L1e
        L14:
            float r11 = r11 + r12
            jk2 r12 = defpackage.mr3.a
            r12 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 > 0) goto L1e
            goto L12
        L1e:
            float r11 = java.lang.Math.abs(r0)
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            bb1 r12 = defpackage.bb1.g
            t02 r2 = defpackage.t02.g
            bb1 r4 = r10.d
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            i32 r10 = r10.b
            if (r11 != 0) goto L31
            goto L69
        L31:
            if (r3 == 0) goto L69
            if (r4 != r12) goto L46
            y22 r11 = r10.m()
            t02 r11 = r11.e
            if (r11 != r2) goto L46
            int r11 = r10.f
            int r11 = -r11
            int r12 = r10.p()
            int r12 = r12 + r11
            goto L48
        L46:
            int r12 = r10.f
        L48:
            float r11 = (float) r12
            float r11 = r11 * r5
        L4a:
            int r12 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r12 <= 0) goto L59
            int r12 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r12 >= 0) goto L59
            int r12 = r10.p()
            float r12 = (float) r12
            float r11 = r11 + r12
            goto L4a
        L59:
            int r12 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r12 >= 0) goto L68
            int r12 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r12 <= 0) goto L68
            int r12 = r10.p()
            float r12 = (float) r12
            float r11 = r11 - r12
            goto L59
        L68:
            return r11
        L69:
            int r11 = r10.f
            d42 r0 = r10.D
            int r11 = java.lang.Math.abs(r11)
            double r6 = (double) r11
            r8 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 >= 0) goto L7c
            return r1
        L7c:
            if (r4 != r12) goto L8f
            y22 r11 = r10.m()
            t02 r11 = r11.e
            if (r11 != r2) goto L8f
            int r11 = r10.f
            int r11 = -r11
            int r1 = r10.p()
            int r1 = r1 + r11
            goto L91
        L8f:
            int r1 = r10.f
        L91:
            float r11 = (float) r1
            float r11 = r11 * r5
            if (r4 != r12) goto Lb1
            y22 r12 = r10.m()
            t02 r12 = r12.e
            if (r12 != r2) goto Lb1
            java.lang.Object r12 = r0.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Laa
            goto Lc2
        Laa:
            int r10 = r10.p()
        Lae:
            float r10 = (float) r10
            float r11 = r11 + r10
            goto Lc2
        Lb1:
            java.lang.Object r12 = r0.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lc2
            int r10 = r10.p()
            goto Lae
        Lc2:
            float r10 = -r13
            float r10 = defpackage.y02.g(r11, r10, r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o22.a(float, float, float):float");
    }
}
