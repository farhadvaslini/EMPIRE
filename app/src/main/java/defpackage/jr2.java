package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jr2 {
    public static final jr2 f;
    public static final jr2 g;
    public static final jr2 h;
    public static final jr2 i;
    public static final jr2 j;
    public static final /* synthetic */ jr2[] k;

    static {
        jr2 jr2Var = new jr2("TopBar", 0);
        f = jr2Var;
        jr2 jr2Var2 = new jr2("MainContent", 1);
        g = jr2Var2;
        jr2 jr2Var3 = new jr2("Snackbar", 2);
        h = jr2Var3;
        jr2 jr2Var4 = new jr2("Fab", 3);
        i = jr2Var4;
        jr2 jr2Var5 = new jr2("BottomBar", 4);
        j = jr2Var5;
        k = new jr2[]{jr2Var, jr2Var2, jr2Var3, jr2Var4, jr2Var5};
    }

    public static jr2 valueOf(String str) {
        return (jr2) Enum.valueOf(jr2.class, str);
    }

    public static jr2[] values() {
        return (jr2[]) k.clone();
    }
}
