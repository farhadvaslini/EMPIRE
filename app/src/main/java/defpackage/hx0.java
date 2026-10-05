package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hx0 {
    public static final hx0 f;
    public static final hx0 g;
    public static final hx0 h;
    public static final /* synthetic */ hx0[] i;

    static {
        hx0 hx0Var = new hx0("None", 0);
        f = hx0Var;
        hx0 hx0Var2 = new hx0("Selection", 1);
        g = hx0Var2;
        hx0 hx0Var3 = new hx0("Cursor", 2);
        h = hx0Var3;
        i = new hx0[]{hx0Var, hx0Var2, hx0Var3};
    }

    public static hx0 valueOf(String str) {
        return (hx0) Enum.valueOf(hx0.class, str);
    }

    public static hx0[] values() {
        return (hx0[]) i.clone();
    }
}
