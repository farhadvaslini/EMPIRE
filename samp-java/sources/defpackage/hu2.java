package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hu2 extends pn2 implements rs0 {
    public final /* synthetic */ int h = 0;
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu2(long j, pk2 pk2Var, p40 p40Var) {
        super(p40Var);
        this.i = j;
        this.l = pk2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.h;
        dm3 dm3Var = dm3.a;
        rb3 rb3Var = (rb3) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((hu2) m(p40Var, rb3Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.h;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                hu2 hu2Var = new hu2(this.i, (pk2) obj2, p40Var);
                hu2Var.k = obj;
                return hu2Var;
            default:
                hu2 hu2Var2 = new hu2((gb2) obj2, p40Var);
                hu2Var2.k = obj;
                return hu2Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.h
            java.lang.Object r1 = r9.l
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            y50 r4 = defpackage.y50.f
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            int r0 = r9.j
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.i
            java.lang.Object r2 = r9.k
            rb3 r2 = (defpackage.rb3) r2
            defpackage.y02.Q(r10)
            goto L47
        L1d:
            defpackage.c.q(r3)
            goto L50
        L21:
            defpackage.y02.Q(r10)
            java.lang.Object r10 = r9.k
            rb3 r10 = (defpackage.rb3) r10
            gb2 r1 = (defpackage.gb2) r1
            long r0 = r1.b
            oq3 r2 = r10.F()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.k = r2
            r9.i = r0
            r9.j = r5
            r10 = 3
            java.lang.Object r10 = defpackage.cd3.b(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            gb2 r10 = (defpackage.gb2) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            pk2 r1 = (defpackage.pk2) r1
            int r0 = r9.j
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.k
            rb3 r9 = (defpackage.rb3) r9
            defpackage.y02.Q(r10)
            goto L82
        L61:
            defpackage.c.q(r3)
            goto Lb4
        L65:
            defpackage.y02.Q(r10)
            java.lang.Object r10 = r9.k
            rb3 r10 = (defpackage.rb3) r10
            long r2 = r9.i
            pt2 r0 = new pt2
            r0.<init>(r5, r1)
            r9.k = r10
            r9.j = r5
            java.lang.Object r9 = defpackage.le0.d(r10, r2, r0, r9)
            if (r9 != r4) goto L7f
            r2 = r4
            goto Lb4
        L7f:
            r8 = r10
            r10 = r9
            r9 = r8
        L82:
            gb2 r10 = (defpackage.gb2) r10
            if (r10 == 0) goto L9a
            long r0 = r1.f
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9a
            zc0 r2 = defpackage.zc0.g
            goto Lb4
        L9a:
            sb3 r9 = r9.k
            za2 r9 = r9.y
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.qx.q0(r9)
            gb2 r9 = (defpackage.gb2) r9
            boolean r10 = defpackage.w22.n(r9)
            if (r10 == 0) goto Lb2
            r9.a()
            zc0 r2 = defpackage.zc0.f
            goto Lb4
        Lb2:
            zc0 r2 = defpackage.zc0.i
        Lb4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu2.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu2(gb2 gb2Var, p40 p40Var) {
        super(p40Var);
        this.l = gb2Var;
    }
}
