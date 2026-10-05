package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class us1 {
    public static final us1 f;
    public static final /* synthetic */ us1[] g;

    static {
        us1 us1Var = new us1("Default", 0);
        f = us1Var;
        g = new us1[]{us1Var, new us1("UserInput", 1), new us1("PreventUserInput", 2)};
    }

    public static us1 valueOf(String str) {
        return (us1) Enum.valueOf(us1.class, str);
    }

    public static us1[] values() {
        return (us1[]) g.clone();
    }
}
