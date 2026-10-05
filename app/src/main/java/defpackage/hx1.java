package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hx1 {
    public static final hx1 f;
    public static final hx1 g;
    public static final /* synthetic */ hx1[] h;

    static {
        hx1 hx1Var = new hx1("Min", 0);
        f = hx1Var;
        hx1 hx1Var2 = new hx1("Max", 1);
        g = hx1Var2;
        h = new hx1[]{hx1Var, hx1Var2};
    }

    public static hx1 valueOf(String str) {
        return (hx1) Enum.valueOf(hx1.class, str);
    }

    public static hx1[] values() {
        return (hx1[]) h.clone();
    }
}
