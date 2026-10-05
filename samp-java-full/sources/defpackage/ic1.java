package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ic1 {
    public static final ic1 f;
    public static final /* synthetic */ ic1[] g;

    static {
        ic1 ic1Var = new ic1("Horizontal", 0);
        f = ic1Var;
        g = new ic1[]{ic1Var, new ic1("Vertical", 1)};
    }

    public static ic1 valueOf(String str) {
        return (ic1) Enum.valueOf(ic1.class, str);
    }

    public static ic1[] values() {
        return (ic1[]) g.clone();
    }
}
