package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class h60 {
    public static final h60 f;
    public static final h60 g;
    public static final h60 h;
    public static final /* synthetic */ h60[] i;

    static {
        h60 h60Var = new h60("CROSSED", 0);
        f = h60Var;
        h60 h60Var2 = new h60("NOT_CROSSED", 1);
        g = h60Var2;
        h60 h60Var3 = new h60("COLLAPSED", 2);
        h = h60Var3;
        i = new h60[]{h60Var, h60Var2, h60Var3};
    }

    public static h60 valueOf(String str) {
        return (h60) Enum.valueOf(h60.class, str);
    }

    public static h60[] values() {
        return (h60[]) i.clone();
    }
}
