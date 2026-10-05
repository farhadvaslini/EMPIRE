package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ks1 extends pn2 implements rs0 {
    public yv0 h;
    public ls1 i;
    public long[] j;
    public int k;
    public int l;
    public int m;
    public int n;
    public long o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ls1 r;
    public final /* synthetic */ yv0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks1(ls1 ls1Var, yv0 yv0Var, p40 p40Var) {
        super(p40Var);
        this.r = ls1Var;
        this.s = yv0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((ks1) m((p40) obj2, (ov2) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        ks1 ks1Var = new ks1(this.r, this.s, p40Var);
        ks1Var.q = obj;
        return ks1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.p
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.n
            int r5 = r0.m
            long r6 = r0.o
            int r8 = r0.l
            int r9 = r0.k
            long[] r10 = r0.j
            ls1 r11 = r0.i
            yv0 r12 = r0.h
            java.lang.Object r13 = r0.q
            ov2 r13 = (defpackage.ov2) r13
            defpackage.y02.Q(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.y02.Q(r21)
            java.lang.Object r1 = r0.q
            ov2 r1 = (defpackage.ov2) r1
            ls1 r5 = r0.r
            js1 r6 = r5.g
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            yv0 r8 = r0.s
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.g = r2
            js1 r3 = r11.g
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.q = r13
            r0.h = r12
            r0.i = r11
            r0.j = r10
            r0.k = r9
            r0.l = r8
            r0.o = r6
            r0.m = r5
            r0.n = r1
            r0.p = r4
            r13.b(r2, r0)
            y50 r0 = defpackage.y50.f
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            dm3 r0 = defpackage.dm3.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks1.o(java.lang.Object):java.lang.Object");
    }
}
