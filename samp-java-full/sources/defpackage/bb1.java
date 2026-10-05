package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bb1 {
    public static final bb1 f;
    public static final bb1 g;
    public static final /* synthetic */ bb1[] h;

    static {
        bb1 bb1Var = new bb1("Ltr", 0);
        f = bb1Var;
        bb1 bb1Var2 = new bb1("Rtl", 1);
        g = bb1Var2;
        h = new bb1[]{bb1Var, bb1Var2};
    }

    public static bb1 valueOf(String str) {
        return (bb1) Enum.valueOf(bb1.class, str);
    }

    public static bb1[] values() {
        return (bb1[]) h.clone();
    }
}
