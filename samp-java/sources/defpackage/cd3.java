package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class cd3 {
    public static final af0 a = new af0(3, null, 2);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.rb3 r5, boolean r6, defpackage.ab2 r7, defpackage.ml r8) {
        /*
            boolean r0 = r8 instanceof defpackage.tc3
            if (r0 == 0) goto L13
            r0 = r8
            tc3 r0 = (defpackage.tc3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            tc3 r0 = new tc3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.l
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.k
            ab2 r6 = r0.j
            rb3 r7 = r0.i
            defpackage.y02.Q(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r5)
            r5 = 0
            return r5
        L36:
            defpackage.y02.Q(r8)
        L39:
            r0.i = r5
            r0.j = r7
            r0.k = r6
            r0.m = r2
            java.lang.Object r8 = r5.c(r7, r0)
            y50 r1 = defpackage.y50.f
            if (r8 != r1) goto L4a
            return r1
        L4a:
            za2 r8 = (defpackage.za2) r8
            boolean r1 = e(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd3.a(rb3, boolean, ab2, ml):java.lang.Object");
    }

    public static /* synthetic */ Object b(rb3 rb3Var, ml mlVar, int i) {
        return a(rb3Var, (i & 1) != 0, (i & 2) != 0 ? ab2.g : ab2.f, mlVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.rb3 r7, defpackage.q40 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.uc3
            if (r0 == 0) goto L13
            r0 = r8
            uc3 r0 = (defpackage.uc3) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            uc3 r0 = new uc3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            rb3 r7 = r0.i
            defpackage.y02.Q(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.y02.Q(r8)
        L31:
            r0.i = r7
            r0.k = r2
            ab2 r8 = defpackage.ab2.g
            java.lang.Object r8 = r7.c(r8, r0)
            y50 r1 = defpackage.y50.f
            if (r8 != r1) goto L40
            return r1
        L40:
            za2 r8 = (defpackage.za2) r8
            java.util.List r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            gb2 r6 = (defpackage.gb2) r6
            r6.a()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.util.List r8 = r8.a
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6e
            java.lang.Object r3 = r8.get(r4)
            gb2 r3 = (defpackage.gb2) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L6b
            goto L31
        L6b:
            int r4 = r4 + 1
            goto L5e
        L6e:
            dm3 r7 = defpackage.dm3.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd3.c(rb3, q40):java.lang.Object");
    }

    public static Object d(kb2 kb2Var, f53 f53Var, ns0 ns0Var, p40 p40Var, int i) {
        ss0 ss0Var = f53Var;
        if ((i & 4) != 0) {
            ss0Var = a;
        }
        Object objW = ur.w(new n9(kb2Var, ss0Var, ns0Var, (p40) null), p40Var);
        return objW == y50.f ? objW : dm3.a;
    }

    public static boolean e(za2 za2Var, boolean z) {
        List list = za2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gb2 gb2Var = (gb2) list.get(i);
            if (!(z ? w22.k(gb2Var) : w22.l(gb2Var))) {
                return false;
            }
        }
        return true;
    }

    public static w83 f(x50 x50Var, j61 j61Var, rs0 rs0Var) {
        return cl3.t(x50Var, null, new ri2(j61Var, rs0Var, (p40) null, 9), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0387  */
    /* JADX WARN: Type inference failed for: r12v17, types: [gb2] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r13v10, types: [p40] */
    /* JADX WARN: Type inference failed for: r13v13, types: [p40] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r26v1, types: [p40] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [o50, p40] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.rb3 r22, defpackage.x50 r23, defpackage.xc2 r24, defpackage.ss0 r25, defpackage.ns0 r26, defpackage.ml r27) {
        /*
            Method dump skipped, instruction units count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd3.g(rb3, x50, xc2, ss0, ns0, ml):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.rb3 r7, defpackage.ab2 r8, defpackage.q40 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ad3
            if (r0 == 0) goto L13
            r0 = r9
            ad3 r0 = (defpackage.ad3) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            ad3 r0 = new ad3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.j
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            qk2 r7 = r0.i
            defpackage.y02.Q(r9)     // Catch: defpackage.bb2 -> L59
            goto L56
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r7)
            return r2
        L2e:
            defpackage.y02.Q(r9)
            qk2 r9 = new qk2
            r9.<init>()
            qk1 r1 = defpackage.qk1.a
            r9.f = r1
            oq3 r1 = r7.F()     // Catch: defpackage.bb2 -> L59
            long r4 = r1.c()     // Catch: defpackage.bb2 -> L59
            br0 r1 = new br0     // Catch: defpackage.bb2 -> L59
            r6 = 3
            r1.<init>(r8, r9, r2, r6)     // Catch: defpackage.bb2 -> L59
            r0.i = r9     // Catch: defpackage.bb2 -> L59
            r0.k = r3     // Catch: defpackage.bb2 -> L59
            java.lang.Object r7 = r7.H(r4, r1, r0)     // Catch: defpackage.bb2 -> L59
            y50 r8 = defpackage.y50.f
            if (r7 != r8) goto L55
            return r8
        L55:
            r7 = r9
        L56:
            java.lang.Object r7 = r7.f
            return r7
        L59:
            sk1 r7 = defpackage.sk1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd3.h(rb3, ab2, q40):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (r0 == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.rb3 r17, defpackage.ab2 r18, defpackage.ml r19) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd3.i(rb3, ab2, ml):java.lang.Object");
    }
}
