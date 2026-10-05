package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sl2 {
    public static final sl2 f;
    public static final sl2 g;
    public static final /* synthetic */ sl2[] h;

    static {
        sl2 sl2Var = new sl2("Ltr", 0);
        f = sl2Var;
        sl2 sl2Var2 = new sl2("Rtl", 1);
        g = sl2Var2;
        h = new sl2[]{sl2Var, sl2Var2};
    }

    public static sl2 valueOf(String str) {
        return (sl2) Enum.valueOf(sl2.class, str);
    }

    public static sl2[] values() {
        return (sl2[]) h.clone();
    }
}
