package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final Object a(m70 m70Var, q40 q40Var) throws Throwable {
        rl0 rl0Var;
        ?? G;
        Throwable th;
        pl0 pl0Var;
        ?? r5;
        if (q40Var instanceof rl0) {
            rl0Var = (rl0) q40Var;
            int i = rl0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                rl0Var.m = i - Integer.MIN_VALUE;
            } else {
                rl0Var = new rl0(this, q40Var);
            }
        }
        Object obj = rl0Var.k;
        int i2 = rl0Var.m;
        dt1 dt1Var = this.e;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = rl0Var.i;
                pl0Var = rl0Var.j;
                try {
                    y02.Q(obj);
                    r5 = this;
                    try {
                        pl0Var.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r5 != 0) {
                        dt1Var.i(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        pl0Var.close();
                    } catch (Throwable th4) {
                        uq.j(th, th4);
                    }
                    throw th;
                }
            }
            y02.Q(obj);
            if (this.d.get()) {
                c.q("StorageConnection has already been disposed.");
                return null;
            }
            G = dt1Var.g();
            try {
                pl0 pl0Var2 = new pl0(this.a);
                try {
                    Boolean boolValueOf = Boolean.valueOf((boolean) G);
                    rl0Var.j = pl0Var2;
                    rl0Var.i = G;
                    rl0Var.m = 1;
                    Object objE = m70Var.e(pl0Var2, boolValueOf, rl0Var);
                    y50 y50Var = y50.f;
                    if (objE == y50Var) {
                        return y50Var;
                    }
                    obj = objE;
                    r5 = G == true ? 1 : 0;
                    pl0Var = pl0Var2;
                    pl0Var.close();
                    th = null;
                    if (th == null) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    this = G == true ? 1 : 0;
                    pl0Var = pl0Var2;
                    pl0Var.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (G != 0) {
                    dt1Var.i(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            G = this;
        }
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
    */
    public final Object b(a80 a80Var, q40 q40Var) throws Throwable {
        ?? sl0Var;
        ?? r11;
        ?? r10;
        ?? r9;
        File file;
        dm0 dm0Var;
        Throwable th;
        dm0 dm0Var2;
        ?? r1;
        File file2;
        if (q40Var instanceof sl0) {
            sl0 sl0Var2 = (sl0) q40Var;
            int i = sl0Var2.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                sl0Var2.n = i - Integer.MIN_VALUE;
                sl0Var = sl0Var2;
            } else {
                sl0Var = new sl0(this, q40Var);
            }
        }
        Object obj = sl0Var.l;
        int i2 = sl0Var.n;
        File file3 = this.a;
        y50 y50Var = y50.f;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                try {
                    try {
                        if (i2 == 0) {
                            y02.Q(obj);
                            if (this.d.get()) {
                                c.q("StorageConnection has already been disposed.");
                                return null;
                            }
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException("Unable to create parent directories of " + file3);
                                }
                            }
                            sl0Var.i = a80Var;
                            ?? r92 = this.e;
                            sl0Var.j = r92;
                            sl0Var.n = 1;
                            Object objF = r92.f(sl0Var);
                            r9 = r92;
                            r10 = a80Var;
                            if (objF != y50Var) {
                            }
                            return y50Var;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                c.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            dm0Var2 = sl0Var.k;
                            File file4 = (File) sl0Var.j;
                            bt1 bt1Var = (bt1) sl0Var.i;
                            try {
                                y02.Q(obj);
                                r1 = bt1Var;
                                file2 = file4;
                                try {
                                    dm0Var2.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    try {
                                        Files.move(file2.toPath(), file3.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                    } catch (IOException unused) {
                                        throw new IOException("Unable to rename " + file2 + " to " + file3 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                ((dt1) r1).i(null);
                                return dm3.a;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    dm0Var2.close();
                                } catch (Throwable th5) {
                                    uq.j(th, th5);
                                }
                                throw th;
                            }
                        }
                        bt1 bt1Var2 = (bt1) sl0Var.j;
                        rs0 rs0Var = (rs0) sl0Var.i;
                        y02.Q(obj);
                        r9 = bt1Var2;
                        r10 = rs0Var;
                        sl0Var.i = r9;
                        sl0Var.j = file;
                        sl0Var.k = dm0Var;
                        sl0Var.n = 2;
                        if (r10.f(dm0Var, sl0Var) != y50Var) {
                            r1 = r9;
                            file2 = file;
                            dm0Var2 = dm0Var;
                            dm0Var2.close();
                            th = null;
                            if (th == null) {
                            }
                        }
                        return y50Var;
                    } catch (Throwable th6) {
                        th = th6;
                        dm0Var2 = dm0Var;
                        dm0Var2.close();
                        throw th;
                    }
                    dm0Var = new dm0(file);
                } catch (IOException e) {
                    e = e;
                    r11 = file;
                    if (!r11.exists()) {
                        throw e;
                    }
                    r11.delete();
                    throw e;
                }
                file = new File(file3.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                sl0Var = r9;
                th = th7;
                ((dt1) sl0Var).i(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            r11 = a80Var;
        }
    }

    @Override // defpackage.cx
    public final void close() {
        this.d.set(true);
        this.c.a();
    }
}
