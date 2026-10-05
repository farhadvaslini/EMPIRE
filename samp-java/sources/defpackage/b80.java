package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class b80 implements e70 {
    public final ql0 a;
    public final x50 b;
    public final p70 c;
    public int e;
    public w83 f;
    public final pl h;
    public final xb3 i;
    public final xb3 j;
    public final pl k;
    public final dt1 d = new dt1();
    public final yl1 g = new yl1(18);

    public b80(ql0 ql0Var, List list, h01 h01Var, x50 x50Var) {
        this.a = ql0Var;
        this.b = x50Var;
        p40 p40Var = null;
        this.c = new p70(3, new l(this, p40Var, 11));
        this.h = new pl(this, list);
        final byte b = 0;
        this.i = new xb3(new cs0(this) { // from class: f70
            public final /* synthetic */ b80 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() throws IOException {
                int i = b;
                b80 b80Var = this.g;
                switch (i) {
                    case 0:
                        ql0 ql0Var2 = b80Var.a;
                        File canonicalFile = ((File) ql0Var2.b.a()).getCanonicalFile();
                        synchronized (ql0.d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = ql0.c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new tl0(canonicalFile, (c43) ql0Var2.a.h(canonicalFile), new ja(14, canonicalFile));
                    default:
                        return ((tl0) b80Var.i.getValue()).b;
                }
            }
        });
        final int i = 1;
        this.j = new xb3(new cs0(this) { // from class: f70
            public final /* synthetic */ b80 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() throws IOException {
                int i2 = i;
                b80 b80Var = this.g;
                switch (i2) {
                    case 0:
                        ql0 ql0Var2 = b80Var.a;
                        File canonicalFile = ((File) ql0Var2.b.a()).getCanonicalFile();
                        synchronized (ql0.d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = ql0.c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new tl0(canonicalFile, (c43) ql0Var2.a.h(canonicalFile), new ja(14, canonicalFile));
                    default:
                        return ((tl0) b80Var.i.getValue()).b;
                }
            }
        });
        this.k = new pl(x50Var, new s(18, this), new z00(17, b), new j(this, p40Var, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.b80 r4, defpackage.q40 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.q70
            if (r0 == 0) goto L13
            r0 = r5
            q70 r0 = (defpackage.q70) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            q70 r0 = new q70
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.j
            int r1 = r0.l
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            dt1 r0 = r0.i
            defpackage.y02.Q(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r3
        L2e:
            defpackage.y02.Q(r5)
            dt1 r5 = r4.d
            r0.i = r5
            r0.l = r2
            java.lang.Object r0 = r5.f(r0)
            y50 r1 = defpackage.y50.f
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            int r5 = r4.e     // Catch: java.lang.Throwable -> L51
            int r5 = r5 + (-1)
            r4.e = r5     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L55
            w83 r5 = r4.f     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L53
            r5.c(r3)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r4 = move-exception
            goto L5b
        L53:
            r4.f = r3     // Catch: java.lang.Throwable -> L51
        L55:
            r0.i(r3)
            dm3 r4 = defpackage.dm3.a
            return r4
        L5b:
            r0.i(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b80.c(b80, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.b80 r7, defpackage.uo1 r8, defpackage.q40 r9) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            boolean r0 = r9 instanceof defpackage.s70
            if (r0 == 0) goto L13
            r0 = r9
            s70 r0 = (defpackage.s70) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            s70 r0 = new s70
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.j
            int r1 = r0.l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            gz r7 = r0.i
            defpackage.y02.Q(r9)     // Catch: java.lang.Throwable -> L28
            goto L63
        L28:
            r8 = move-exception
            goto L5e
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r7)
            return r2
        L30:
            defpackage.y02.Q(r9)
            gz r9 = r8.b
            o50 r1 = r8.d     // Catch: java.lang.Throwable -> L58
            o50 r4 = r0.g     // Catch: java.lang.Throwable -> L5b
            r4.getClass()     // Catch: java.lang.Throwable -> L5b
            o50 r1 = r1.k(r4)     // Catch: java.lang.Throwable -> L58
            j r4 = new j     // Catch: java.lang.Throwable -> L58
            r5 = 19
            r4.<init>(r7, r8, r2, r5)     // Catch: java.lang.Throwable -> L58
            r0.i = r9     // Catch: java.lang.Throwable -> L58
            r0.l = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = defpackage.cl3.G(r1, r4, r0)     // Catch: java.lang.Throwable -> L58
            y50 r8 = defpackage.y50.f
            if (r7 != r8) goto L54
            return r8
        L54:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L63
        L58:
            r8 = move-exception
        L59:
            r7 = r9
            goto L5e
        L5b:
            r7 = move-exception
            r8 = r7
            goto L59
        L5e:
            qn2 r9 = new qn2
            r9.<init>(r8)
        L63:
            java.lang.Throwable r8 = defpackage.rn2.a(r9)
            if (r8 != 0) goto L6d
            r7.Y(r9)
            goto L79
        L6d:
            r7.getClass()
            jz r9 = new jz
            r0 = 0
            r9.<init>(r8, r0)
            r7.Y(r9)
        L79:
            dm3 r7 = defpackage.dm3.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b80.d(b80, uo1, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.b80 r4, defpackage.q40 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.t70
            if (r0 == 0) goto L13
            r0 = r5
            t70 r0 = (defpackage.t70) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            t70 r0 = new t70
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.j
            int r1 = r0.l
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            dt1 r0 = r0.i
            defpackage.y02.Q(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r3
        L2e:
            defpackage.y02.Q(r5)
            dt1 r5 = r4.d
            r0.i = r5
            r0.l = r2
            java.lang.Object r0 = r5.f(r0)
            y50 r1 = defpackage.y50.f
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            int r5 = r4.e     // Catch: java.lang.Throwable -> L57
            int r5 = r5 + r2
            r4.e = r5     // Catch: java.lang.Throwable -> L57
            if (r5 != r2) goto L59
            x50 r5 = r4.b     // Catch: java.lang.Throwable -> L57
            k70 r1 = new k70     // Catch: java.lang.Throwable -> L57
            r1.<init>(r4, r3, r2)     // Catch: java.lang.Throwable -> L57
            r2 = 3
            w83 r5 = defpackage.cl3.t(r5, r3, r1, r2)     // Catch: java.lang.Throwable -> L57
            r4.f = r5     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r4 = move-exception
            goto L5f
        L59:
            r0.i(r3)
            dm3 r4 = defpackage.dm3.a
            return r4
        L5f:
            r0.i(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b80.e(b80, q40):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r1.C(r0) == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.b80 r6, defpackage.q40 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.u70
            if (r0 == 0) goto L13
            r0 = r7
            u70 r0 = (defpackage.u70) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            u70 r0 = new u70
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.j
            int r1 = r0.l
            r2 = 2
            r3 = 1
            y50 r4 = defpackage.y50.f
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            int r0 = r0.i
            defpackage.y02.Q(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r6)
            r6 = 0
            return r6
        L35:
            defpackage.y02.Q(r7)
            goto L49
        L39:
            defpackage.y02.Q(r7)
            c43 r7 = r6.i()
            r0.l = r3
            java.lang.Integer r7 = r7.a()
            if (r7 != r4) goto L49
            goto L5b
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            pl r1 = r6.h     // Catch: java.lang.Throwable -> L5f
            r0.i = r7     // Catch: java.lang.Throwable -> L5f
            r0.l = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r1.C(r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 != r4) goto L5c
        L5b:
            return r4
        L5c:
            dm3 r6 = defpackage.dm3.a
            return r6
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            yl1 r6 = r6.g
            zi2 r1 = new zi2
            r1.<init>(r7, r0)
            r6.I(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b80.f(b80, q40):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r11 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r11 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.b80 r9, boolean r10, defpackage.p40 r11) {
        /*
            yl1 r0 = r9.g
            boolean r1 = r11 instanceof defpackage.v70
            if (r1 == 0) goto L15
            r1 = r11
            v70 r1 = (defpackage.v70) r1
            int r2 = r1.m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.m = r2
            goto L1a
        L15:
            v70 r1 = new v70
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.k
            int r2 = r1.m
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            y50 r7 = defpackage.y50.f
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            defpackage.y02.Q(r11)
            goto La3
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r9)
            return r6
        L37:
            defpackage.y02.Q(r11)
            goto L8b
        L3b:
            boolean r10 = r1.i
            d93 r2 = r1.j
            defpackage.y02.Q(r11)
            goto L5f
        L43:
            defpackage.y02.Q(r11)
            d93 r2 = r0.A()
            boolean r11 = r2 instanceof defpackage.ul3
            if (r11 != 0) goto Lb7
            c43 r11 = r9.i()
            r1.j = r2
            r1.i = r10
            r1.m = r5
            java.lang.Integer r11 = r11.a()
            if (r11 != r7) goto L5f
            goto La2
        L5f:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            boolean r5 = r2 instanceof defpackage.a70
            if (r5 == 0) goto L6f
            r8 = r2
            a70 r8 = (defpackage.a70) r8
            int r8 = r8.a
            goto L70
        L6f:
            r8 = -1
        L70:
            if (r5 == 0) goto L75
            if (r11 != r8) goto L75
            return r2
        L75:
            if (r10 == 0) goto L8e
            c43 r10 = r9.i()
            x5 r11 = new x5
            r11.<init>(r9, r6, r3)
            r1.j = r6
            r1.m = r4
            java.lang.Object r11 = r10.b(r11, r1)
            if (r11 != r7) goto L8b
            goto La2
        L8b:
            r32 r11 = (defpackage.r32) r11
            goto La5
        L8e:
            c43 r10 = r9.i()
            w70 r11 = new w70
            r2 = 0
            r11.<init>(r9, r8, r6, r2)
            r1.j = r6
            r1.m = r3
            java.lang.Object r11 = r10.c(r11, r1)
            if (r11 != r7) goto La3
        La2:
            return r7
        La3:
            r32 r11 = (defpackage.r32) r11
        La5:
            java.lang.Object r9 = r11.f
            d93 r9 = (defpackage.d93) r9
            java.lang.Object r10 = r11.g
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lb6
            r0.I(r9)
        Lb6:
            return r9
        Lb7:
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.c.q(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b80.g(b80, boolean, p40):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
    
        if (r10 != r5) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2 A[Catch: c60 -> 0x0097, TryCatch #0 {c60 -> 0x0097, blocks: (B:36:0x0092, B:68:0x0114, B:41:0x009c, B:65:0x00f9, B:44:0x00a6, B:60:0x00dd, B:47:0x00ac, B:55:0x00c2, B:56:0x00c6, B:51:0x00b5, B:62:0x00e9), top: B:72:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.b80 r8, boolean r9, defpackage.q40 r10) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b80.h(b80, boolean, q40):java.lang.Object");
    }

    @Override // defpackage.e70
    public final Object a(rs0 rs0Var, q40 q40Var) {
        ho3 ho3Var = (ho3) q40Var.i().m(m22.A);
        if (ho3Var != null) {
            ho3Var.a(this);
        }
        return cl3.G(new ho3(ho3Var, this), new l(this, rs0Var, null, 12), q40Var);
    }

    @Override // defpackage.e70
    public final fn0 b() {
        return this.c;
    }

    public final c43 i() {
        return (c43) this.j.getValue();
    }

    public final Object j(q40 q40Var) {
        return ((tl0) this.i.getValue()).a(new m70(3, (p40) null), q40Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r10, boolean r11, defpackage.q40 r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.z70
            if (r0 == 0) goto L13
            r0 = r12
            z70 r0 = (defpackage.z70) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            z70 r0 = new z70
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.j
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ok2 r9 = r0.i
            defpackage.y02.Q(r12)
            goto L55
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r9)
            r9 = 0
            return r9
        L2e:
            defpackage.y02.Q(r12)
            ok2 r4 = new ok2
            r4.<init>()
            xb3 r12 = r9.i
            java.lang.Object r12 = r12.getValue()
            tl0 r12 = (defpackage.tl0) r12
            a80 r3 = new a80
            r8 = 0
            r5 = r9
            r6 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.i = r4
            r0.l = r2
            java.lang.Object r9 = r12.b(r3, r0)
            y50 r10 = defpackage.y50.f
            if (r9 != r10) goto L54
            return r10
        L54:
            r9 = r4
        L55:
            int r9 = r9.f
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b80.k(java.lang.Object, boolean, q40):java.lang.Object");
    }
}
