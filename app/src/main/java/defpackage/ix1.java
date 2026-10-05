package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ix1 {
    public static final ix1 f;
    public static final ix1 g;
    public static final /* synthetic */ ix1[] h;

    static {
        ix1 ix1Var = new ix1("Width", 0);
        f = ix1Var;
        ix1 ix1Var2 = new ix1("Height", 1);
        g = ix1Var2;
        h = new ix1[]{ix1Var, ix1Var2};
    }

    public static ix1 valueOf(String str) {
        return (ix1) Enum.valueOf(ix1.class, str);
    }

    public static ix1[] values() {
        return (ix1[]) h.clone();
    }
}
