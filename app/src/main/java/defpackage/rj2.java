package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rj2 {
    public static final rj2 f;
    public static final rj2 g;
    public static final rj2 h;
    public static final rj2 i;
    public static final /* synthetic */ rj2[] j;

    static {
        rj2 rj2Var = new rj2("Idle", 0);
        f = rj2Var;
        rj2 rj2Var2 = new rj2("Loading", 1);
        g = rj2Var2;
        rj2 rj2Var3 = new rj2("Ready", 2);
        h = rj2Var3;
        rj2 rj2Var4 = new rj2("Error", 3);
        i = rj2Var4;
        j = new rj2[]{rj2Var, rj2Var2, rj2Var3, rj2Var4};
    }

    public static rj2 valueOf(String str) {
        return (rj2) Enum.valueOf(rj2.class, str);
    }

    public static rj2[] values() {
        return (rj2[]) j.clone();
    }
}
