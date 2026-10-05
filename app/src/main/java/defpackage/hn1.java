package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hn1 {
    public static final hn1 f;
    public static final hn1 g;
    public static final /* synthetic */ hn1[] h;

    static {
        hn1 hn1Var = new hn1("Min", 0);
        f = hn1Var;
        hn1 hn1Var2 = new hn1("Max", 1);
        g = hn1Var2;
        h = new hn1[]{hn1Var, hn1Var2};
    }

    public static hn1 valueOf(String str) {
        return (hn1) Enum.valueOf(hn1.class, str);
    }

    public static hn1[] values() {
        return (hn1[]) h.clone();
    }
}
