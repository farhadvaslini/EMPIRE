package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class i52 {
    public static final i52 f;
    public static final i52 g;
    public static final i52 h;
    public static final i52 i;
    public static final i52 j;
    public static final i52 k;
    public static final i52 l;
    public static final /* synthetic */ i52[] m;

    static {
        i52 i52Var = new i52("Invalid", 0);
        f = i52Var;
        i52 i52Var2 = new i52("Cancelled", 1);
        g = i52Var2;
        i52 i52Var3 = new i52("InitialPending", 2);
        h = i52Var3;
        i52 i52Var4 = new i52("RecomposePending", 3);
        i = i52Var4;
        i52 i52Var5 = new i52("Recomposing", 4);
        j = i52Var5;
        i52 i52Var6 = new i52("ApplyPending", 5);
        k = i52Var6;
        i52 i52Var7 = new i52("Applied", 6);
        l = i52Var7;
        m = new i52[]{i52Var, i52Var2, i52Var3, i52Var4, i52Var5, i52Var6, i52Var7};
    }

    public static i52 valueOf(String str) {
        return (i52) Enum.valueOf(i52.class, str);
    }

    public static i52[] values() {
        return (i52[]) m.clone();
    }
}
