package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class h4 {
    public static final h4 f;
    public static final h4 g;
    public static final h4 h;
    public static final h4 i;
    public static final /* synthetic */ h4[] j;

    static {
        h4 h4Var = new h4("EmptyHost", 0);
        f = h4Var;
        h4 h4Var2 = new h4("InvalidHost", 1);
        g = h4Var2;
        h4 h4Var3 = new h4("InvalidPort", 2);
        h = h4Var3;
        h4 h4Var4 = new h4("AlreadyExists", 3);
        i = h4Var4;
        j = new h4[]{h4Var, h4Var2, h4Var3, h4Var4};
    }

    public static h4 valueOf(String str) {
        return (h4) Enum.valueOf(h4.class, str);
    }

    public static h4[] values() {
        return (h4[]) j.clone();
    }
}
