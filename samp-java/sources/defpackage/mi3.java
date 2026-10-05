package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mi3 {
    public static final mi3 f;
    public static final mi3 g;
    public static final mi3 h;
    public static final /* synthetic */ mi3[] i;

    static {
        mi3 mi3Var = new mi3("On", 0);
        f = mi3Var;
        mi3 mi3Var2 = new mi3("Off", 1);
        g = mi3Var2;
        mi3 mi3Var3 = new mi3("Indeterminate", 2);
        h = mi3Var3;
        i = new mi3[]{mi3Var, mi3Var2, mi3Var3};
    }

    public static mi3 valueOf(String str) {
        return (mi3) Enum.valueOf(mi3.class, str);
    }

    public static mi3[] values() {
        return (mi3[]) i.clone();
    }
}
