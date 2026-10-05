package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fx0 {
    public static final fx0 f;
    public static final fx0 g;
    public static final fx0 h;
    public static final /* synthetic */ fx0[] i;

    static {
        fx0 fx0Var = new fx0("Cursor", 0);
        f = fx0Var;
        fx0 fx0Var2 = new fx0("SelectionStart", 1);
        g = fx0Var2;
        fx0 fx0Var3 = new fx0("SelectionEnd", 2);
        h = fx0Var3;
        i = new fx0[]{fx0Var, fx0Var2, fx0Var3};
    }

    public static fx0 valueOf(String str) {
        return (fx0) Enum.valueOf(fx0.class, str);
    }

    public static fx0[] values() {
        return (fx0[]) i.clone();
    }
}
