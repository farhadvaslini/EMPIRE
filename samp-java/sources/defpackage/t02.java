package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class t02 {
    public static final t02 f;
    public static final t02 g;
    public static final /* synthetic */ t02[] h;

    static {
        t02 t02Var = new t02("Vertical", 0);
        f = t02Var;
        t02 t02Var2 = new t02("Horizontal", 1);
        g = t02Var2;
        h = new t02[]{t02Var, t02Var2};
    }

    public static t02 valueOf(String str) {
        return (t02) Enum.valueOf(t02.class, str);
    }

    public static t02[] values() {
        return (t02[]) h.clone();
    }
}
