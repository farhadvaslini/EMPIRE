package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lb2 {
    public static final lb2 f;
    public static final lb2 g;
    public static final lb2 h;
    public static final /* synthetic */ lb2[] i;

    static {
        lb2 lb2Var = new lb2("Unknown", 0);
        f = lb2Var;
        lb2 lb2Var2 = new lb2("Dispatching", 1);
        g = lb2Var2;
        lb2 lb2Var3 = new lb2("NotDispatching", 2);
        h = lb2Var3;
        i = new lb2[]{lb2Var, lb2Var2, lb2Var3};
    }

    public static lb2 valueOf(String str) {
        return (lb2) Enum.valueOf(lb2.class, str);
    }

    public static lb2[] values() {
        return (lb2[]) i.clone();
    }
}
