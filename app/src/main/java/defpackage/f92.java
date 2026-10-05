package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class f92 {
    public static final f92 f;
    public static final f92 g;
    public static final f92 h;
    public static final f92 i;
    public static final /* synthetic */ f92[] j;

    static {
        f92 f92Var = new f92("Importing", 0);
        f = f92Var;
        f92 f92Var2 = new f92("Downloading", 1);
        g = f92Var2;
        f92 f92Var3 = new f92("VerifyingInstalling", 2);
        h = f92Var3;
        f92 f92Var4 = new f92("Uninstalling", 3);
        i = f92Var4;
        j = new f92[]{f92Var, f92Var2, f92Var3, f92Var4};
    }

    public static f92 valueOf(String str) {
        return (f92) Enum.valueOf(f92.class, str);
    }

    public static f92[] values() {
        return (f92[]) j.clone();
    }
}
