package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sk0 {
    public static volatile sk0 a;
    public static final sk0 b;

    static {
        sk0 sk0Var = new sk0();
        Map map = Collections.EMPTY_MAP;
        b = sk0Var;
    }

    public static sk0 a() {
        sk0 sk0Var;
        be2 be2Var = be2.c;
        sk0 sk0Var2 = a;
        if (sk0Var2 != null) {
            return sk0Var2;
        }
        synchronized (sk0.class) {
            try {
                sk0Var = a;
                if (sk0Var == null) {
                    Class cls = rk0.a;
                    sk0 sk0Var3 = null;
                    if (cls != null) {
                        try {
                            sk0Var3 = (sk0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    sk0Var = sk0Var3 != null ? sk0Var3 : b;
                    a = sk0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sk0Var;
    }
}
