package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class uk0 {
    public static final tk0 a = new tk0();
    public static final tk0 b;

    static {
        be2 be2Var = be2.c;
        tk0 tk0Var = null;
        try {
            tk0Var = (tk0) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = tk0Var;
    }
}
