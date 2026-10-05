package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class p51 {
    public static final p51 f;
    public static final p51 g;
    public static final /* synthetic */ p51[] h;

    static {
        p51 p51Var = new p51("Width", 0);
        f = p51Var;
        p51 p51Var2 = new p51("Height", 1);
        g = p51Var2;
        h = new p51[]{p51Var, p51Var2};
    }

    public static p51 valueOf(String str) {
        return (p51) Enum.valueOf(p51.class, str);
    }

    public static p51[] values() {
        return (p51[]) h.clone();
    }
}
