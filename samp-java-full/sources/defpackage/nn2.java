package defpackage;

import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final String h() throws IllegalAccessException, InvocationTargetException {
        Charset charsetForName;
        String str;
        rp rpVarF = f();
        String th = null;
        try {
            jn1 jn1VarC = c();
            if (jn1VarC != null) {
                uk2 uk2Var = jn1.c;
                String[] strArr = jn1VarC.b;
                int i = 0;
                int iM = g12.M(0, strArr.length - 1, 2);
                if (iM >= 0) {
                    while (!fa3.Z(strArr[i], "charset", true)) {
                        if (i == iM) {
                            str = null;
                            break;
                        }
                        i += 2;
                    }
                    str = strArr[i + 1];
                    if (str != null) {
                        charsetForName = null;
                        if (charsetForName == null) {
                            charsetForName = ys.a;
                        }
                        String strY = rpVarF.y(lv3.f(rpVarF, charsetForName));
                        try {
                            rpVarF.close();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        String str2 = th;
                        th = strY;
                        th = str2;
                    } else {
                        try {
                            charsetForName = Charset.forName(str);
                        } catch (IllegalArgumentException unused) {
                            charsetForName = null;
                        }
                        if (charsetForName == null) {
                        }
                        String strY2 = rpVarF.y(lv3.f(rpVarF, charsetForName));
                        rpVarF.close();
                        String str22 = th;
                        th = strY2;
                        th = str22;
                    }
                } else {
                    str = null;
                    if (str != null) {
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (rpVarF != null) {
                try {
                    rpVarF.close();
                } catch (Throwable th4) {
                    uq.j(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
