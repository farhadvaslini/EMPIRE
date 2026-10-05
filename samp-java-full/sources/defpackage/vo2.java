package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vo2 {
    public static final vo2 f;
    public static final vo2 g;
    public static final /* synthetic */ vo2[] h;

    static {
        vo2 vo2Var = new vo2("Circular", 0);
        f = vo2Var;
        vo2 vo2Var2 = new vo2("Continuous", 1);
        g = vo2Var2;
        h = new vo2[]{vo2Var, vo2Var2};
    }

    public static vo2 valueOf(String str) {
        return (vo2) Enum.valueOf(vo2.class, str);
    }

    public static vo2[] values() {
        return (vo2[]) h.clone();
    }
}
