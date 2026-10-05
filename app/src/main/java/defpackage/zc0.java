package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zc0 {
    public static final zc0 f;
    public static final zc0 g;
    public static final zc0 h;
    public static final zc0 i;
    public static final /* synthetic */ zc0[] j;

    static {
        zc0 zc0Var = new zc0("Up", 0);
        f = zc0Var;
        zc0 zc0Var2 = new zc0("Drag", 1);
        g = zc0Var2;
        zc0 zc0Var3 = new zc0("Timeout", 2);
        h = zc0Var3;
        zc0 zc0Var4 = new zc0("Cancel", 3);
        i = zc0Var4;
        j = new zc0[]{zc0Var, zc0Var2, zc0Var3, zc0Var4};
    }

    public static zc0 valueOf(String str) {
        return (zc0) Enum.valueOf(zc0.class, str);
    }

    public static zc0[] values() {
        return (zc0[]) j.clone();
    }
}
