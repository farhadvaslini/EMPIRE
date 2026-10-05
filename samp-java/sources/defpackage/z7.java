package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class z7 {
    public static final z7 f;
    public static final z7 g;
    public static final /* synthetic */ z7[] h;

    static {
        z7 z7Var = new z7("SHOW_ORIGINAL", 0);
        f = z7Var;
        z7 z7Var2 = new z7("SHOW_TRANSLATED", 1);
        g = z7Var2;
        h = new z7[]{z7Var, z7Var2};
    }

    public static z7 valueOf(String str) {
        return (z7) Enum.valueOf(z7.class, str);
    }

    public static z7[] values() {
        return (z7[]) h.clone();
    }
}
