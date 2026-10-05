package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ju2 {
    public static final ju2 f;
    public static final ju2 g;
    public static final ju2 h;
    public static final /* synthetic */ ju2[] i;

    static {
        ju2 ju2Var = new ju2("Left", 0);
        f = ju2Var;
        ju2 ju2Var2 = new ju2("Middle", 1);
        g = ju2Var2;
        ju2 ju2Var3 = new ju2("Right", 2);
        h = ju2Var3;
        i = new ju2[]{ju2Var, ju2Var2, ju2Var3};
    }

    public static ju2 valueOf(String str) {
        return (ju2) Enum.valueOf(ju2.class, str);
    }

    public static ju2[] values() {
        return (ju2[]) i.clone();
    }
}
