package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class y50 {
    public static final y50 f;
    public static final y50 g;
    public static final y50 h;
    public static final /* synthetic */ y50[] i;

    static {
        y50 y50Var = new y50("COROUTINE_SUSPENDED", 0);
        f = y50Var;
        y50 y50Var2 = new y50("UNDECIDED", 1);
        g = y50Var2;
        y50 y50Var3 = new y50("RESUMED", 2);
        h = y50Var3;
        i = new y50[]{y50Var, y50Var2, y50Var3};
    }

    public static y50 valueOf(String str) {
        return (y50) Enum.valueOf(y50.class, str);
    }

    public static y50[] values() {
        return (y50[]) i.clone();
    }
}
