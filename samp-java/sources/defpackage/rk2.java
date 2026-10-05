package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class rk2 {
    public static final sk2 a;

    static {
        sk2 sk2Var = null;
        try {
            sk2Var = (sk2) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (sk2Var == null) {
            sk2Var = new sk2();
        }
        a = sk2Var;
    }

    public static lu a(Class cls) {
        a.getClass();
        return new lu(cls);
    }
}
