package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class f31 {
    public static final f31 f;
    public static final f31 g;
    public static final f31 h;
    public static final /* synthetic */ f31[] i;

    static {
        f31 f31Var = new f31("Focused", 0);
        f = f31Var;
        f31 f31Var2 = new f31("UnfocusedEmpty", 1);
        g = f31Var2;
        f31 f31Var3 = new f31("UnfocusedNotEmpty", 2);
        h = f31Var3;
        i = new f31[]{f31Var, f31Var2, f31Var3};
    }

    public static f31 valueOf(String str) {
        return (f31) Enum.valueOf(f31.class, str);
    }

    public static f31[] values() {
        return (f31[]) i.clone();
    }
}
