package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jk1 extends mb3 implements rs0 {
    public int j;
    public final /* synthetic */ Context k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;
    public final /* synthetic */ os1 n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ os1 q;
    public final /* synthetic */ os1 r;
    public final /* synthetic */ b42 s;
    public final /* synthetic */ os1 t;
    public final /* synthetic */ a42 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk1(Context context, String str, String str2, os1 os1Var, String str3, String str4, os1 os1Var2, os1 os1Var3, b42 b42Var, os1 os1Var4, a42 a42Var, p40 p40Var) {
        super(2, p40Var);
        this.k = context;
        this.l = str;
        this.m = str2;
        this.n = os1Var;
        this.o = str3;
        this.p = str4;
        this.q = os1Var2;
        this.r = os1Var3;
        this.s = b42Var;
        this.t = os1Var4;
        this.u = a42Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((jk1) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new jk1(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, p40Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (defpackage.uq.h(r11.n, r11.m, r11.o, r11.p, r11.q, r11.r, r11.s, r11.t, r11.u, r11) == r10) goto L15;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.j
            r1 = 0
            r2 = 2
            r3 = 1
            y50 r10 = defpackage.y50.f
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.y02.Q(r12)
            goto L4f
        L11:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r0)
            return r1
        L17:
            defpackage.y02.Q(r12)
            goto L33
        L1b:
            defpackage.y02.Q(r12)
            j90 r0 = defpackage.ac0.a
            x80 r0 = defpackage.x80.h
            hm r4 = new hm
            java.lang.String r5 = r11.m
            r6 = 5
            r4.<init>(r5, r1, r6)
            r11.j = r3
            java.lang.Object r0 = defpackage.cl3.G(r0, r4, r11)
            if (r0 != r10) goto L33
            goto L4e
        L33:
            r11.j = r2
            os1 r0 = r11.n
            java.lang.String r1 = r11.m
            java.lang.String r2 = r11.o
            java.lang.String r3 = r11.p
            os1 r4 = r11.q
            os1 r5 = r11.r
            b42 r6 = r11.s
            os1 r7 = r11.t
            a42 r8 = r11.u
            r9 = r11
            java.lang.Object r0 = defpackage.uq.h(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r10) goto L4f
        L4e:
            return r10
        L4f:
            java.lang.String r0 = r11.l
            r1 = 0
            android.content.Context r2 = r11.k
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            dm3 r0 = defpackage.dm3.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk1.o(java.lang.Object):java.lang.Object");
    }
}
