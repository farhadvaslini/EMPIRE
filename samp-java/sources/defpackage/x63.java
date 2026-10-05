package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class x63 extends pn2 implements rs0 {
    public long[] h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ y63 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x63(y63 y63Var, p40 p40Var) {
        super(p40Var);
        this.m = y63Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((x63) m((p40) obj2, (ov2) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        x63 x63Var = new x63(this.m, p40Var);
        x63Var.l = obj;
        return x63Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            y63 r1 = r0.m
            long r2 = r1.f
            long r4 = r1.h
            long r6 = r1.g
            int r8 = r0.k
            r9 = 0
            r12 = 64
            r13 = 3
            r14 = 2
            r16 = 0
            r18 = 1
            r10 = 1
            y50 r11 = defpackage.y50.f
            if (r8 == 0) goto L4b
            if (r8 == r10) goto L3c
            if (r8 == r14) goto L32
            if (r8 != r13) goto L2c
            int r1 = r0.i
            java.lang.Object r6 = r0.l
            ov2 r6 = (defpackage.ov2) r6
            defpackage.y02.Q(r23)
            r7 = r13
            goto Lbe
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r0)
            return r9
        L32:
            int r1 = r0.i
            java.lang.Object r8 = r0.l
            ov2 r8 = (defpackage.ov2) r8
            defpackage.y02.Q(r23)
            goto L93
        L3c:
            int r1 = r0.j
            int r8 = r0.i
            long[] r15 = r0.h
            java.lang.Object r13 = r0.l
            ov2 r13 = (defpackage.ov2) r13
            defpackage.y02.Q(r23)
            int r8 = r8 + r10
            goto L59
        L4b:
            defpackage.y02.Q(r23)
            java.lang.Object r8 = r0.l
            r13 = r8
            ov2 r13 = (defpackage.ov2) r13
            long[] r15 = r1.i
            if (r15 == 0) goto L70
            int r1 = r15.length
            r8 = 0
        L59:
            if (r8 >= r1) goto L70
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.l = r13
            r0.h = r15
            r0.i = r8
            r0.j = r1
            r0.k = r10
            r13.b(r4, r0)
            return r11
        L70:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L96
            r8 = r13
            r1 = 0
        L76:
            if (r1 >= r12) goto L95
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r13 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r13 == 0) goto L93
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.l = r8
            r0.h = r9
            r0.i = r1
            r0.k = r14
            r8.b(r2, r0)
            return r11
        L93:
            int r1 = r1 + r10
            goto L76
        L95:
            r13 = r8
        L96:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r13
            r15 = 0
        L9c:
            if (r15 >= r12) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            r1 = 64
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.l = r6
            r0.h = r9
            r0.i = r15
            r7 = 3
            r0.k = r7
            r6.b(r1, r0)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9c
        Lc1:
            dm3 r0 = defpackage.dm3.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x63.o(java.lang.Object):java.lang.Object");
    }
}
