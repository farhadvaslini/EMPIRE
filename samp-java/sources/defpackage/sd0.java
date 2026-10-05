package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sd0 {
    public static final sd0 f;
    public static final sd0 g;
    public static final sd0 h;
    public static final /* synthetic */ sd0[] i;

    static {
        sd0 sd0Var = new sd0("Yes", 0);
        f = sd0Var;
        sd0 sd0Var2 = new sd0("No", 1);
        g = sd0Var2;
        sd0 sd0Var3 = new sd0("NotInitialized", 2);
        h = sd0Var3;
        i = new sd0[]{sd0Var, sd0Var2, sd0Var3};
    }

    public static sd0 valueOf(String str) {
        return (sd0) Enum.valueOf(sd0.class, str);
    }

    public static sd0[] values() {
        return (sd0[]) i.clone();
    }
}
