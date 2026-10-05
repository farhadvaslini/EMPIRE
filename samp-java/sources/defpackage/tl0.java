package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tl0 implements cx {
    public final File a;
    public final c43 b;
    public final ja c;
    public final AtomicBoolean d;
    public final dt1 e;

    public tl0(File file, c43 c43Var, ja jaVar) {
        c43Var.getClass();
        this.a = file;
        this.b = c43Var;
        this.c = jaVar;
        this.d = new AtomicBoolean(false);
        this.e = new dt1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:34:0x006f, B:43:0x0080, B:42:0x007d, B:39:0x0078), top: B:50:0x0020, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [tl0] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [m70] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.m70 r6, defpackage.q40 r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.rl0
            if (r0 == 0) goto L13
            r0 = r7
            rl0 r0 = (defpackage.rl0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            rl0 r0 = new rl0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.k
            int r1 = r0.m
            dt1 r2 = r5.e
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            boolean r5 = r0.i
            pl0 r6 = r0.j
            defpackage.y02.Q(r7)     // Catch: java.lang.Throwable -> L2c
            goto L61
        L2c:
            r7 = move-exception
            goto L78
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r5)
            return r4
        L34:
            defpackage.y02.Q(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.d
            boolean r7 = r7.get()
            if (r7 != 0) goto L88
            boolean r7 = r2.g()
            pl0 r1 = new pl0     // Catch: java.lang.Throwable -> L81
            java.io.File r5 = r5.a     // Catch: java.lang.Throwable -> L81
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L73
            r0.j = r1     // Catch: java.lang.Throwable -> L73
            r0.i = r7     // Catch: java.lang.Throwable -> L73
            r0.m = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r5 = r6.e(r1, r5, r0)     // Catch: java.lang.Throwable -> L73
            y50 r6 = defpackage.y50.f
            if (r5 != r6) goto L5d
            return r6
        L5d:
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r1
        L61:
            r6.close()     // Catch: java.lang.Throwable -> L66
            r6 = r4
            goto L67
        L66:
            r6 = move-exception
        L67:
            if (r6 != 0) goto L6f
            if (r5 == 0) goto L6e
            r2.i(r4)
        L6e:
            return r7
        L6f:
            throw r6     // Catch: java.lang.Throwable -> L70
        L70:
            r6 = move-exception
            r7 = r5
            goto L82
        L73:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r1
        L78:
            r6.close()     // Catch: java.lang.Throwable -> L7c
            goto L80
        L7c:
            r6 = move-exception
            defpackage.uq.j(r7, r6)     // Catch: java.lang.Throwable -> L70
        L80:
            throw r7     // Catch: java.lang.Throwable -> L70
        L81:
            r6 = move-exception
        L82:
            if (r7 == 0) goto L87
            r2.i(r4)
        L87:
            throw r6
        L88:
            java.lang.String r5 = "StorageConnection has already been disposed."
            defpackage.c.q(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.a(m70, q40):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca A[Catch: all -> 0x0102, IOException -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0102, blocks: (B:42:0x00ca, B:44:0x00d0, B:46:0x00e3, B:47:0x0101, B:54:0x010f, B:66:0x0126, B:68:0x012c, B:69:0x012f, B:61:0x011e, B:60:0x011b), top: B:76:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f A[Catch: all -> 0x0102, IOException -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0102, blocks: (B:42:0x00ca, B:44:0x00d0, B:46:0x00e3, B:47:0x0101, B:54:0x010f, B:66:0x0126, B:68:0x012c, B:69:0x012f, B:61:0x011e, B:60:0x011b), top: B:76:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v4, types: [rs0] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, p40, sl0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v6, types: [dt1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.a80 r10, defpackage.q40 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.b(a80, q40):java.lang.Object");
    }

    @Override // defpackage.cx
    public final void close() {
        this.d.set(true);
        this.c.a();
    }
}
