package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ab2 {
    public static final ab2 f;
    public static final ab2 g;
    public static final ab2 h;
    public static final /* synthetic */ ab2[] i;

    static {
        ab2 ab2Var = new ab2("Initial", 0);
        f = ab2Var;
        ab2 ab2Var2 = new ab2("Main", 1);
        g = ab2Var2;
        ab2 ab2Var3 = new ab2("Final", 2);
        h = ab2Var3;
        i = new ab2[]{ab2Var, ab2Var2, ab2Var3};
    }

    public static ab2 valueOf(String str) {
        return (ab2) Enum.valueOf(ab2.class, str);
    }

    public static ab2[] values() {
        return (ab2[]) i.clone();
    }
}
