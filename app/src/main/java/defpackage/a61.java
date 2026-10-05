package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class a61 {
    public static final a61 f;
    public static final a61 g;
    public static final a61 h;
    public static final a61 i;
    public static final /* synthetic */ a61[] j;

    static {
        a61 a61Var = new a61("LookaheadMeasurement", 0);
        f = a61Var;
        a61 a61Var2 = new a61("LookaheadPlacement", 1);
        g = a61Var2;
        a61 a61Var3 = new a61("Measurement", 2);
        h = a61Var3;
        a61 a61Var4 = new a61("Placement", 3);
        i = a61Var4;
        j = new a61[]{a61Var, a61Var2, a61Var3, a61Var4};
    }

    public static a61 valueOf(String str) {
        return (a61) Enum.valueOf(a61.class, str);
    }

    public static a61[] values() {
        return (a61[]) j.clone();
    }
}
