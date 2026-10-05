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
/* JADX INFO: loaded from: classes.dex */
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
    */
    public static List c(File file, long j) {
        ?? qn2Var;
        r32 r32Var;
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if (1 > length || length > j) {
            return null;
        }
        try {
            List<String> listI0 = qx.I0(em0.Y(file, ys.a), 128);
            qn2Var = new ArrayList();
            for (String str : listI0) {
                int iN0 = y93.n0(str, '=', 0, 6);
                if (iN0 <= 0) {
                    r32Var = null;
                } else {
                    String strSubstring = str.substring(0, iN0);
                    String strSubstring2 = str.substring(iN0 + 1);
                    if (d.c(strSubstring) && strSubstring2.length() <= 256) {
                        r32Var = new r32(strSubstring, strSubstring2);
                    }
                }
                if (r32Var != null) {
                    qn2Var.add(r32Var);
                }
            }
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        return (List) (qn2Var instanceof qn2 ? 0 : qn2Var);
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
