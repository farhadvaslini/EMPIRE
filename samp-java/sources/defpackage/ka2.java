package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ka2 {
    public static final ka2 f;
    public static final ka2 g;
    public static final ka2 h;
    public static final /* synthetic */ ka2[] i;

    static {
        ka2 ka2Var = new ka2("Success", 0);
        f = ka2Var;
        ka2 ka2Var2 = new ka2("PluginNotRemoved", 1);
        g = ka2Var2;
        ka2 ka2Var3 = new ka2("DataNotRemoved", 2);
        h = ka2Var3;
        i = new ka2[]{ka2Var, ka2Var2, ka2Var3};
    }

    public static ka2 valueOf(String str) {
        return (ka2) Enum.valueOf(ka2.class, str);
    }

    public static ka2[] values() {
        return (ka2[]) i.clone();
    }
}
