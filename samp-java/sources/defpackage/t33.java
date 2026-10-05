package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class t33 {
    public static final t33 f;
    public static final t33 g;
    public static final t33 h;
    public static final /* synthetic */ t33[] i;

    static {
        t33 t33Var = new t33("Hidden", 0);
        f = t33Var;
        t33 t33Var2 = new t33("Expanded", 1);
        g = t33Var2;
        t33 t33Var3 = new t33("PartiallyExpanded", 2);
        h = t33Var3;
        i = new t33[]{t33Var, t33Var2, t33Var3};
    }

    public static t33 valueOf(String str) {
        return (t33) Enum.valueOf(t33.class, str);
    }

    public static t33[] values() {
        return (t33[]) i.clone();
    }
}
