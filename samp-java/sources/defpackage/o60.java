package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class o60 {
    public static final o60 f;
    public static final o60 g;
    public static final o60 h;
    public static final /* synthetic */ o60[] i;

    static {
        o60 o60Var = new o60("None", 0);
        f = o60Var;
        o60 o60Var2 = new o60("Cancelled", 1);
        g = o60Var2;
        o60 o60Var3 = new o60("Redirected", 2);
        h = o60Var3;
        i = new o60[]{o60Var, o60Var2, o60Var3, new o60("RedirectCancelled", 3)};
    }

    public static o60 valueOf(String str) {
        return (o60) Enum.valueOf(o60.class, str);
    }

    public static o60[] values() {
        return (o60[]) i.clone();
    }
}
