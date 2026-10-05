package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tb0 {
    public static final tb0 f;
    public static final tb0 g;
    public static final tb0 h;
    public static final /* synthetic */ tb0[] i;

    static {
        tb0 tb0Var = new tb0("Vertical", 0);
        f = tb0Var;
        tb0 tb0Var2 = new tb0("Horizontal", 1);
        g = tb0Var2;
        tb0 tb0Var3 = new tb0("Both", 2);
        h = tb0Var3;
        i = new tb0[]{tb0Var, tb0Var2, tb0Var3};
    }

    public static tb0 valueOf(String str) {
        return (tb0) Enum.valueOf(tb0.class, str);
    }

    public static tb0[] values() {
        return (tb0[]) i.clone();
    }
}
