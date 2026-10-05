package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cm0 {
    public static final cm0 f;
    public static final cm0 g;
    public static final /* synthetic */ cm0[] h;

    static {
        cm0 cm0Var = new cm0("TOP_DOWN", 0);
        f = cm0Var;
        cm0 cm0Var2 = new cm0("BOTTOM_UP", 1);
        g = cm0Var2;
        h = new cm0[]{cm0Var, cm0Var2};
    }

    public static cm0 valueOf(String str) {
        return (cm0) Enum.valueOf(cm0.class, str);
    }

    public static cm0[] values() {
        return (cm0[]) h.clone();
    }
}
