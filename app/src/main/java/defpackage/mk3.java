package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mk3 {
    public static final mk3 f;
    public static final mk3 g;
    public static final mk3 h;
    public static final /* synthetic */ mk3[] i;

    static {
        mk3 mk3Var = new mk3("ContinueTraversal", 0);
        f = mk3Var;
        mk3 mk3Var2 = new mk3("SkipSubtreeAndContinueTraversal", 1);
        g = mk3Var2;
        mk3 mk3Var3 = new mk3("CancelTraversal", 2);
        h = mk3Var3;
        i = new mk3[]{mk3Var, mk3Var2, mk3Var3};
    }

    public static mk3 valueOf(String str) {
        return (mk3) Enum.valueOf(mk3.class, str);
    }

    public static mk3[] values() {
        return (mk3[]) i.clone();
    }
}
