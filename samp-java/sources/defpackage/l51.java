package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l51 {
    public static final l51 f;
    public static final l51 g;
    public static final /* synthetic */ l51[] h;

    static {
        l51 l51Var = new l51("Min", 0);
        f = l51Var;
        l51 l51Var2 = new l51("Max", 1);
        g = l51Var2;
        h = new l51[]{l51Var, l51Var2};
    }

    public static l51 valueOf(String str) {
        return (l51) Enum.valueOf(l51.class, str);
    }

    public static l51[] values() {
        return (l51[]) h.clone();
    }
}
