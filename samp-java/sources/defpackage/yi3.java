package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yi3 {
    public static final yi3 f;
    public static final yi3 g;
    public static final yi3 h;
    public static final /* synthetic */ yi3[] i;

    static {
        yi3 yi3Var = new yi3("Uninitialized", 0);
        f = yi3Var;
        yi3 yi3Var2 = new yi3("Detached", 1);
        g = yi3Var2;
        yi3 yi3Var3 = new yi3("Attached", 2);
        h = yi3Var3;
        i = new yi3[]{yi3Var, yi3Var2, yi3Var3};
    }

    public static yi3 valueOf(String str) {
        return (yi3) Enum.valueOf(yi3.class, str);
    }

    public static yi3[] values() {
        return (yi3[]) i.clone();
    }
}
