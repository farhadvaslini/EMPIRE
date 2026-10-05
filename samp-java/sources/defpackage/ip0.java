package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ip0 {
    public static final ip0 b = new ip0();
    public static final ip0 c = new ip0();
    public static final ip0 d = new ip0();
    public final qs1 a = new qs1(new kp0[16]);

    /* JADX WARN: Code restructure failed: missing block: B:69:0x004b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(defpackage.ip0 r12) {
        /*
            r12.getClass()
            ip0 r0 = defpackage.ip0.b
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r12 == r0) goto Lc3
            ip0 r0 = defpackage.ip0.c
            if (r12 == r0) goto Lbf
            qs1 r12 = r12.a
            int r0 = r12.h
            if (r0 != 0) goto L1b
            java.lang.String r12 = "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r12)
            return
        L1b:
            java.lang.Object[] r12 = r12.f
            r1 = 0
            r2 = r1
        L1f:
            if (r2 >= r0) goto Lbe
            r3 = r12[r2]
            kp0 r3 = (defpackage.kp0) r3
            r4 = r3
            aq1 r4 = (defpackage.aq1) r4
            aq1 r4 = r4.f
            boolean r4 = r4.s
            if (r4 != 0) goto L33
            java.lang.String r4 = "visitChildren called on an unattached node"
            defpackage.m21.c(r4)
        L33:
            qs1 r4 = new qs1
            r5 = 16
            aq1[] r6 = new defpackage.aq1[r5]
            r4.<init>(r6)
            aq1 r3 = (defpackage.aq1) r3
            aq1 r3 = r3.f
            aq1 r6 = r3.k
            if (r6 != 0) goto L48
            defpackage.vr.h(r4, r3)
            goto L4b
        L48:
            r4.b(r6)
        L4b:
            int r3 = r4.h
            if (r3 == 0) goto Lba
            int r3 = r3 + (-1)
            java.lang.Object r3 = r4.k(r3)
            aq1 r3 = (defpackage.aq1) r3
            int r6 = r3.i
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L61
            defpackage.vr.h(r4, r3)
            goto L4b
        L61:
            if (r3 == 0) goto L4b
            int r6 = r3.h
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lb7
            r6 = 0
            r7 = r6
        L6b:
            if (r3 == 0) goto L4b
            boolean r8 = r3 instanceof defpackage.rp0
            if (r8 == 0) goto L7b
            rp0 r3 = (defpackage.rp0) r3
            r8 = 7
            boolean r3 = r3.x1(r8)
            if (r3 == 0) goto Lb2
            goto Lba
        L7b:
            int r8 = r3.h
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto Lb2
            boolean r8 = r3 instanceof defpackage.ja0
            if (r8 == 0) goto Lb2
            r8 = r3
            ja0 r8 = (defpackage.ja0) r8
            aq1 r8 = r8.u
            r9 = r1
        L8b:
            r10 = 1
            if (r8 == 0) goto Laf
            int r11 = r8.h
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto Lac
            int r9 = r9 + 1
            if (r9 != r10) goto L9a
            r3 = r8
            goto Lac
        L9a:
            if (r7 != 0) goto La3
            qs1 r7 = new qs1
            aq1[] r10 = new defpackage.aq1[r5]
            r7.<init>(r10)
        La3:
            if (r3 == 0) goto La9
            r7.b(r3)
            r3 = r6
        La9:
            r7.b(r8)
        Lac:
            aq1 r8 = r8.k
            goto L8b
        Laf:
            if (r9 != r10) goto Lb2
            goto L6b
        Lb2:
            aq1 r3 = defpackage.vr.j(r7)
            goto L6b
        Lb7:
            aq1 r3 = r3.k
            goto L61
        Lba:
            int r2 = r2 + 1
            goto L1f
        Lbe:
            return
        Lbf:
            defpackage.c.q(r1)
            return
        Lc3:
            defpackage.c.q(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ip0.a(ip0):void");
    }
}
