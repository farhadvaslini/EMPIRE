package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class di1 {
    public static final ci1 a;
    public static final ci1 b;

    static {
        be2 be2Var = be2.c;
        ci1 ci1Var = null;
        try {
            ci1Var = (ci1) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = ci1Var;
        b = new ci1();
    }
}
