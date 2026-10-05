package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pb1 {
    public static final pb1 f;
    public static final pb1 g;
    public static final pb1 h;
    public static final pb1 i;
    public static final pb1 j;
    public static final /* synthetic */ pb1[] k;

    static {
        pb1 pb1Var = new pb1("Measuring", 0);
        f = pb1Var;
        pb1 pb1Var2 = new pb1("LookaheadMeasuring", 1);
        g = pb1Var2;
        pb1 pb1Var3 = new pb1("LayingOut", 2);
        h = pb1Var3;
        pb1 pb1Var4 = new pb1("LookaheadLayingOut", 3);
        i = pb1Var4;
        pb1 pb1Var5 = new pb1("Idle", 4);
        j = pb1Var5;
        k = new pb1[]{pb1Var, pb1Var2, pb1Var3, pb1Var4, pb1Var5};
    }

    public static pb1 valueOf(String str) {
        return (pb1) Enum.valueOf(pb1.class, str);
    }

    public static pb1[] values() {
        return (pb1[]) k.clone();
    }
}
