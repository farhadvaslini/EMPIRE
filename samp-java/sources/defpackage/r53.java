package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class r53 {
    public static final r53 f;
    public static final /* synthetic */ r53[] g;

    static {
        r53 r53Var = new r53("Short", 0);
        f = r53Var;
        g = new r53[]{r53Var, new r53("Long", 1), new r53("Indefinite", 2)};
    }

    public static r53 valueOf(String str) {
        return (r53) Enum.valueOf(r53.class, str);
    }

    public static r53[] values() {
        return (r53[]) g.clone();
    }
}
