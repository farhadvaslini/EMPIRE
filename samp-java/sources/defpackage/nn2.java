package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class nn2 implements Closeable {
    public static final mn2 f;

    static {
        kq kqVar = kq.i;
        kqVar.getClass();
        hp hpVar = new hp();
        hpVar.p(kqVar);
        f = new mn2(kqVar.f.length, hpVar);
    }

    public abstract long b();

    public abstract jn1 c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        jv3.a(f());
    }

    public abstract rp f();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #3 {all -> 0x004c, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x001c, B:9:0x0025, B:19:0x003b, B:16:0x0033, B:18:0x0039), top: B:40:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r8 = this;
            rp r0 = r8.f()
            r1 = 0
            jn1 r8 = r8.c()     // Catch: java.lang.Throwable -> L4c
            if (r8 == 0) goto L39
            uk2 r2 = defpackage.jn1.c     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = "charset"
            java.lang.String[] r8 = r8.b     // Catch: java.lang.Throwable -> L4c
            int r3 = r8.length     // Catch: java.lang.Throwable -> L4c
            int r3 = r3 + (-1)
            r4 = 2
            r5 = 0
            int r3 = defpackage.g12.M(r5, r3, r4)     // Catch: java.lang.Throwable -> L4c
            if (r3 < 0) goto L2e
        L1c:
            r4 = r8[r5]     // Catch: java.lang.Throwable -> L4c
            r6 = 1
            boolean r4 = defpackage.fa3.Z(r4, r2, r6)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L29
            int r5 = r5 + r6
            r8 = r8[r5]     // Catch: java.lang.Throwable -> L4c
            goto L2f
        L29:
            if (r5 == r3) goto L2e
            int r5 = r5 + 2
            goto L1c
        L2e:
            r8 = r1
        L2f:
            if (r8 != 0) goto L33
        L31:
            r8 = r1
            goto L37
        L33:
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)     // Catch: java.lang.IllegalArgumentException -> L31 java.lang.Throwable -> L4c
        L37:
            if (r8 != 0) goto L3b
        L39:
            java.nio.charset.Charset r8 = defpackage.ys.a     // Catch: java.lang.Throwable -> L4c
        L3b:
            java.nio.charset.Charset r8 = defpackage.lv3.f(r0, r8)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = r0.y(r8)     // Catch: java.lang.Throwable -> L4c
            r0.close()     // Catch: java.lang.Throwable -> L47
            goto L48
        L47:
            r1 = move-exception
        L48:
            r7 = r1
            r1 = r8
            r8 = r7
            goto L57
        L4c:
            r8 = move-exception
            if (r0 == 0) goto L57
            r0.close()     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r0 = move-exception
            defpackage.uq.j(r8, r0)
        L57:
            if (r8 != 0) goto L5a
            return r1
        L5a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn2.h():java.lang.String");
    }
}
