package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class z31 {
    public static final z31 f;
    public static final /* synthetic */ z31[] g;
    public static final /* synthetic */ mj0 h;

    static {
        z31 z31Var = new z31("All", 0);
        f = z31Var;
        z31[] z31VarArr = {z31Var, new z31("Enabled", 1), new z31("Disabled", 2), new z31("Updates", 3)};
        g = z31VarArr;
        h = new mj0(z31VarArr);
    }

    public static z31 valueOf(String str) {
        return (z31) Enum.valueOf(z31.class, str);
    }

    public static z31[] values() {
        return (z31[]) g.clone();
    }
}
