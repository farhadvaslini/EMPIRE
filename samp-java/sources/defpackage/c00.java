package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class c00 extends f4 implements rs0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c00(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.m = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r11, defpackage.p40 r12) {
        /*
            r10 = this;
            int r0 = r10.m
            dm3 r1 = defpackage.dm3.a
            java.lang.Object r2 = r10.f
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            y50 r5 = defpackage.y50.f
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1
            switch(r0) {
                case 1: goto L47;
                default: goto L11;
            }
        L11:
            boolean r0 = r12 instanceof defpackage.d91
            if (r0 == 0) goto L22
            r0 = r12
            d91 r0 = (defpackage.d91) r0
            int r8 = r0.k
            r9 = r8 & r6
            if (r9 == 0) goto L22
            int r8 = r8 - r6
            r0.k = r8
            goto L27
        L22:
            d91 r0 = new d91
            r0.<init>(r10, r12)
        L27:
            java.lang.Object r10 = r0.i
            int r12 = r0.k
            if (r12 == 0) goto L38
            if (r12 != r7) goto L33
            defpackage.y02.Q(r10)
            goto L46
        L33:
            defpackage.c.q(r4)
            r1 = r3
            goto L46
        L38:
            defpackage.y02.Q(r10)
            c63 r2 = (defpackage.c63) r2
            r0.k = r7
            java.lang.Object r10 = defpackage.c63.b(r2, r11, r0)
            if (r10 != r5) goto L46
            r1 = r5
        L46:
            return r1
        L47:
            boolean r0 = r12 instanceof defpackage.y81
            if (r0 == 0) goto L58
            r0 = r12
            y81 r0 = (defpackage.y81) r0
            int r8 = r0.k
            r9 = r8 & r6
            if (r9 == 0) goto L58
            int r8 = r8 - r6
            r0.k = r8
            goto L5d
        L58:
            y81 r0 = new y81
            r0.<init>(r10, r12)
        L5d:
            java.lang.Object r10 = r0.i
            int r12 = r0.k
            if (r12 == 0) goto L6e
            if (r12 != r7) goto L69
            defpackage.y02.Q(r10)
            goto L7c
        L69:
            defpackage.c.q(r4)
            r1 = r3
            goto L7c
        L6e:
            defpackage.y02.Q(r10)
            c63 r2 = (defpackage.c63) r2
            r0.k = r7
            java.lang.Object r10 = defpackage.c63.b(r2, r11, r0)
            if (r10 != r5) goto L7c
            r1 = r5
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c00.d(java.lang.String, p40):java.lang.Object");
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.m;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                d00 d00Var = (d00) obj3;
                d00Var.d(((Number) obj2).intValue(), (nv0) obj);
                break;
            case 1:
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ps2 ps2Var = (ps2) obj3;
                cl3.t(ps2Var.O.c(), null, new t0(ps2Var, ((lp3) obj).a, null, 2), 3);
                break;
            default:
                ps2 ps2Var2 = (ps2) obj3;
                cl3.t(ps2Var2.O.c(), null, new t0(ps2Var2, ((lp3) obj).a, null, 3), 3);
                break;
        }
        return dm3Var;
    }
}
