package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ts1 {
    public static final ts1 f;
    public static final ts1 g;
    public static final ts1 h;
    public static final /* synthetic */ ts1[] i;

    static {
        ts1 ts1Var = new ts1("Default", 0);
        f = ts1Var;
        ts1 ts1Var2 = new ts1("UserInput", 1);
        g = ts1Var2;
        ts1 ts1Var3 = new ts1("PreventUserInput", 2);
        h = ts1Var3;
        i = new ts1[]{ts1Var, ts1Var2, ts1Var3};
    }

    public static ts1 valueOf(String str) {
        return (ts1) Enum.valueOf(ts1.class, str);
    }

    public static ts1[] values() {
        return (ts1[]) i.clone();
    }
}
