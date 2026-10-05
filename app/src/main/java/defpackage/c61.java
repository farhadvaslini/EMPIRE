package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c61 {
    public static final c61 f;
    public static final c61 g;
    public static final c61 h;
    public static final c61 i;
    public static final /* synthetic */ c61[] j;

    static {
        c61 c61Var = new c61("IGNORED", 0);
        f = c61Var;
        c61 c61Var2 = new c61("SCHEDULED", 1);
        g = c61Var2;
        c61 c61Var3 = new c61("DEFERRED", 2);
        h = c61Var3;
        c61 c61Var4 = new c61("IMMINENT", 3);
        i = c61Var4;
        j = new c61[]{c61Var, c61Var2, c61Var3, c61Var4};
    }

    public static c61 valueOf(String str) {
        return (c61) Enum.valueOf(c61.class, str);
    }

    public static c61[] values() {
        return (c61[]) j.clone();
    }
}
