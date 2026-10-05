package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class in1 {
    public static final in1 f;
    public static final in1 g;
    public static final /* synthetic */ in1[] h;

    static {
        in1 in1Var = new in1("Width", 0);
        f = in1Var;
        in1 in1Var2 = new in1("Height", 1);
        g = in1Var2;
        h = new in1[]{in1Var, in1Var2};
    }

    public static in1 valueOf(String str) {
        return (in1) Enum.valueOf(in1.class, str);
    }

    public static in1[] values() {
        return (in1[]) h.clone();
    }
}
