package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ga2 {
    public static final ga2 f;
    public static final ga2 g;
    public static final ga2 h;
    public static final /* synthetic */ ga2[] i;

    static {
        ga2 ga2Var = new ga2("Running", 0);
        f = ga2Var;
        ga2 ga2Var2 = new ga2("Disabled", 1);
        g = ga2Var2;
        ga2 ga2Var3 = new ga2("Failed", 2);
        h = ga2Var3;
        i = new ga2[]{ga2Var, ga2Var2, ga2Var3};
    }

    public static ga2 valueOf(String str) {
        return (ga2) Enum.valueOf(ga2.class, str);
    }

    public static ga2[] values() {
        return (ga2[]) i.clone();
    }
}
