package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class p92 {
    public static final p92 f;
    public static final p92 g;
    public static final p92 h;
    public static final /* synthetic */ p92[] i;

    static {
        p92 p92Var = new p92("Low", 0);
        f = p92Var;
        p92 p92Var2 = new p92("Medium", 1);
        g = p92Var2;
        p92 p92Var3 = new p92("High", 2);
        h = p92Var3;
        i = new p92[]{p92Var, p92Var2, p92Var3};
    }

    public static p92 valueOf(String str) {
        return (p92) Enum.valueOf(p92.class, str);
    }

    public static p92[] values() {
        return (p92[]) i.clone();
    }
}
