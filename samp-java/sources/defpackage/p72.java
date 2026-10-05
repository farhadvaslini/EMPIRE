package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class p72 {
    public static final p72 g;
    public static final p72 h;
    public static final /* synthetic */ p72[] i;
    public static final /* synthetic */ mj0 j;
    public final String f;

    static {
        p72 p72Var = new p72("Immediate", "immediate", 0);
        g = p72Var;
        p72 p72Var2 = new p72("RestartRequired", "restart-required", 1);
        h = p72Var2;
        p72[] p72VarArr = {p72Var, p72Var2};
        i = p72VarArr;
        j = new mj0(p72VarArr);
    }

    public p72(String str, String str2, int i2) {
        this.f = str2;
    }

    public static p72 valueOf(String str) {
        return (p72) Enum.valueOf(p72.class, str);
    }

    public static p72[] values() {
        return (p72[]) i.clone();
    }
}
