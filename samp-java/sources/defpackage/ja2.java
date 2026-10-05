package defpackage;

import android.content.ContextWrapper;
import java.io.File;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ja2 {
    public static final uk2 d = new uk2("^[a-z]+$");
    public static final uk2 e = new uk2("^[0-9a-f-]{36}$");
    public static final uk2 f = new uk2("^[a-z][a-z0-9]*(?:\\.[a-z0-9][a-z0-9_-]*)+$");
    public static final uk2 g = new uk2("^[A-Za-z0-9_.:-]{1,96}$");
    public final File a;
    public final File b;
    public final File c;

    public ja2(ContextWrapper contextWrapper) {
        contextWrapper.getClass();
        File externalFilesDir = contextWrapper.getApplicationContext().getExternalFilesDir(null);
        externalFilesDir = externalFilesDir == null ? contextWrapper.getApplicationContext().getFilesDir() : externalFilesDir;
        this.a = externalFilesDir;
        this.b = new File(externalFilesDir, "plugin_session.active");
        this.c = new File(externalFilesDir, "plugin_crash.marker");
    }

    public static String a(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (s51.n(((r32) next).f, str)) {
                break;
            }
        }
        r32 r32Var = (r32) next;
        if (r32Var != null) {
            return (String) r32Var.g;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r7v2, types: [qn2] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List c(java.io.File r6, long r7) {
        /*
            boolean r0 = r6.isFile()
            r1 = 0
            if (r0 == 0) goto L78
            long r2 = r6.length()
            r4 = 1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L78
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 > 0) goto L78
            java.nio.charset.Charset r7 = defpackage.ys.a     // Catch: java.lang.Throwable -> L63
            java.util.ArrayList r6 = defpackage.em0.Y(r6, r7)     // Catch: java.lang.Throwable -> L63
            r7 = 128(0x80, float:1.8E-43)
            java.util.List r6 = defpackage.qx.I0(r6, r7)     // Catch: java.lang.Throwable -> L63
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L63
            r7.<init>()     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L63
        L2a:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L63
            if (r8 == 0) goto L70
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L63
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L63
            r0 = 61
            r2 = 6
            r3 = 0
            int r0 = defpackage.y93.n0(r8, r0, r3, r2)     // Catch: java.lang.Throwable -> L63
            if (r0 > 0) goto L42
        L40:
            r0 = r1
            goto L65
        L42:
            java.lang.String r2 = r8.substring(r3, r0)     // Catch: java.lang.Throwable -> L63
            int r0 = r0 + 1
            java.lang.String r8 = r8.substring(r0)     // Catch: java.lang.Throwable -> L63
            uk2 r0 = defpackage.ja2.d     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.c(r2)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L40
            int r0 = r8.length()     // Catch: java.lang.Throwable -> L63
            r3 = 256(0x100, float:3.59E-43)
            if (r0 <= r3) goto L5d
            goto L40
        L5d:
            r32 r0 = new r32     // Catch: java.lang.Throwable -> L63
            r0.<init>(r2, r8)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r6 = move-exception
            goto L6b
        L65:
            if (r0 == 0) goto L2a
            r7.add(r0)     // Catch: java.lang.Throwable -> L63
            goto L2a
        L6b:
            qn2 r7 = new qn2
            r7.<init>(r6)
        L70:
            boolean r6 = r7 instanceof defpackage.qn2
            if (r6 == 0) goto L75
            goto L76
        L75:
            r1 = r7
        L76:
            java.util.List r1 = (java.util.List) r1
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja2.c(java.io.File, long):java.util.List");
    }

    public final void b() {
        try {
            List listC = c(this.b, 16384L);
            if (listC == null) {
                throw new IllegalStateException("Active plugin session is unavailable");
            }
            String strA = a("session", listC);
            if (strA != null) {
                if (!e.c(strA)) {
                    strA = null;
                }
                if (strA != null) {
                    List listL = pv2.L(new sc3(new jm0(new vj(1, listC), true, new s12(13)), new s12(14), 1));
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listL) {
                        if (f.c((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    f(strA, qx.I0(arrayList, 64), ia2.Closing);
                    return;
                }
            }
            throw new IllegalStateException("Active plugin session is invalid");
        } catch (Throwable unused) {
        }
    }

    public final q92 d() {
        String strA;
        List listC = c(this.b, 16384L);
        if (listC != null && s51.n(a("schema", listC), "1") && (strA = a("session", listC)) != null) {
            String str = e.c(strA) ? strA : null;
            if (str != null) {
                List listL = pv2.L(new sc3(new jm0(new vj(1, listC), true, new s12(13)), new s12(14), 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Object obj : listL) {
                    if (f.c((String) obj)) {
                        linkedHashSet.add(obj);
                    }
                }
                Set setR0 = qx.R0(qx.I0(linkedHashSet, 64));
                List listC2 = c(this.c, 4096L);
                if (listC2 == null || !s51.n(a("schema", listC2), "1") || !s51.n(a("session", listC2), str)) {
                    listC2 = null;
                }
                if (listC2 != null) {
                    String strA2 = a("plugin", listC2);
                    String str2 = (strA2 == null || !setR0.contains(strA2)) ? null : strA2;
                    String strA3 = a("callback", listC2);
                    String str3 = (strA3 == null || y93.q0(strA3) || !g.c(strA3)) ? null : strA3;
                    String strA4 = a("signal", listC2);
                    return new q92(str, setR0, strA4 != null ? fa3.f0(strA4) : null, str2, str3, null);
                }
            }
        }
        return null;
    }

    public final void e(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(rx.d0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((fa2) obj).a);
        }
        f(str, arrayList2, ia2.Active);
    }

    public final void f(String str, List list, ia2 ia2Var) {
        ai1 ai1VarX = vr.x();
        ai1VarX.add("schema=1");
        ai1VarX.add("session=".concat(str));
        ai1VarX.add("state=".concat(ia2Var.f));
        Iterator it = qx.I0(list, 64).iterator();
        while (it.hasNext()) {
            ai1VarX.add("plugin=" + ((String) it.next()));
        }
        ai1 ai1VarR = vr.r(ai1VarX);
        File file = this.b;
        String strX0 = qx.x0(ai1VarR, "\n", null, "\n", null, 58);
        File file2 = this.a;
        file2.mkdirs();
        File file3 = new File(file2, "plugin_session.active.tmp");
        em0.a0(file3, strX0, ys.a);
        try {
            try {
                Files.move(file3.toPath(), file.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
                file3.delete();
            } catch (AtomicMoveNotSupportedException unused) {
                Files.move(file3.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
                file3.delete();
            }
        } catch (Throwable th) {
            file3.delete();
            throw th;
        }
    }
}
