package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hg3 {
    public static final hg3 f;
    public static final hg3 g;
    public static final hg3 h;
    public static final hg3 i;
    public static final /* synthetic */ hg3[] j;

    static {
        hg3 hg3Var = new hg3("StartInput", 0);
        f = hg3Var;
        hg3 hg3Var2 = new hg3("StopInput", 1);
        g = hg3Var2;
        hg3 hg3Var3 = new hg3("ShowKeyboard", 2);
        h = hg3Var3;
        hg3 hg3Var4 = new hg3("HideKeyboard", 3);
        i = hg3Var4;
        j = new hg3[]{hg3Var, hg3Var2, hg3Var3, hg3Var4};
    }

    public static hg3 valueOf(String str) {
        return (hg3) Enum.valueOf(hg3.class, str);
    }

    public static hg3[] values() {
        return (hg3[]) j.clone();
    }
}
