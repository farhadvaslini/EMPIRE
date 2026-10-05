package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class s30 {
    public static final s30 f;
    public static final s30 g;
    public static final /* synthetic */ s30[] h;

    static {
        s30 s30Var = new s30("VIEW_APPEAR", 0);
        f = s30Var;
        s30 s30Var2 = new s30("VIEW_DISAPPEAR", 1);
        g = s30Var2;
        h = new s30[]{s30Var, s30Var2};
    }

    public static s30 valueOf(String str) {
        return (s30) Enum.valueOf(s30.class, str);
    }

    public static s30[] values() {
        return (s30[]) h.clone();
    }
}
