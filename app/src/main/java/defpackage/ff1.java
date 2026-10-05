package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ff1 {
    public static final ff1 f;
    public static final ff1 g;
    public static final ff1 h;
    public static final ff1 i;
    public static final ff1 j;
    public static final /* synthetic */ ff1[] k;

    static {
        ff1 ff1Var = new ff1("DESTROYED", 0);
        f = ff1Var;
        ff1 ff1Var2 = new ff1("INITIALIZED", 1);
        g = ff1Var2;
        ff1 ff1Var3 = new ff1("CREATED", 2);
        h = ff1Var3;
        ff1 ff1Var4 = new ff1("STARTED", 3);
        i = ff1Var4;
        ff1 ff1Var5 = new ff1("RESUMED", 4);
        j = ff1Var5;
        k = new ff1[]{ff1Var, ff1Var2, ff1Var3, ff1Var4, ff1Var5};
    }

    public static ff1 valueOf(String str) {
        return (ff1) Enum.valueOf(ff1.class, str);
    }

    public static ff1[] values() {
        return (ff1[]) k.clone();
    }
}
