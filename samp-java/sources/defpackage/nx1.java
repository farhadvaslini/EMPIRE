package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class nx1 {
    public final ws2 a;
    public final rs0 b;
    public ua0 c;
    public boolean d;
    public final a31 e = new a31(10);

    public nx1(ws2 ws2Var, rs0 rs0Var, ua0 ua0Var) {
        this.a = ws2Var;
        this.b = rs0Var;
        this.c = ua0Var;
    }

    public static void a(za2 za2Var) {
        List list = za2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((gb2) list.get(i)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.rs0 r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.mx1
            if (r0 == 0) goto L13
            r0 = r6
            mx1 r0 = (defpackage.mx1) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            mx1 r0 = new mx1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)
            goto L4d
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            r4.d = r3
            hd1 r6 = new hd1
            r1 = 8
            r6.<init>(r4, r5, r2, r1)
            r0.k = r3
            wa3 r5 = new wa3
            o50 r1 = r0.g
            r1.getClass()
            r5.<init>(r0, r1)
            java.lang.Object r5 = defpackage.b32.C(r5, r3, r5, r6)
            y50 r6 = defpackage.y50.f
            if (r5 != r6) goto L4d
            return r6
        L4d:
            r5 = 0
            r4.d = r5
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx1.b(rs0, q40):java.lang.Object");
    }
}
