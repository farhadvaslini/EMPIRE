package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ti0 {
    public static final ti0 f;
    public static final ti0 g;
    public static final ti0 h;
    public static final /* synthetic */ ti0[] i;

    static {
        ti0 ti0Var = new ti0("PreEnter", 0);
        f = ti0Var;
        ti0 ti0Var2 = new ti0("Visible", 1);
        g = ti0Var2;
        ti0 ti0Var3 = new ti0("PostExit", 2);
        h = ti0Var3;
        i = new ti0[]{ti0Var, ti0Var2, ti0Var3};
    }

    public static ti0 valueOf(String str) {
        return (ti0) Enum.valueOf(ti0.class, str);
    }

    public static ti0[] values() {
        return (ti0[]) i.clone();
    }
}
