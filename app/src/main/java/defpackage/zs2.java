package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zs2 {
    public static final zs2 f;
    public static final zs2 g;
    public static final /* synthetic */ zs2[] h;

    static {
        zs2 zs2Var = new zs2("Inherit", 0);
        f = zs2Var;
        zs2 zs2Var2 = new zs2("SecureOn", 1);
        g = zs2Var2;
        h = new zs2[]{zs2Var, zs2Var2, new zs2("SecureOff", 2)};
    }

    public static zs2 valueOf(String str) {
        return (zs2) Enum.valueOf(zs2.class, str);
    }

    public static zs2[] values() {
        return (zs2[]) h.clone();
    }
}
