package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class a60 {
    public static final a60 f;
    public static final a60 g;
    public static final a60 h;
    public static final a60 i;
    public static final /* synthetic */ a60[] j;

    static {
        a60 a60Var = new a60("DEFAULT", 0);
        f = a60Var;
        a60 a60Var2 = new a60("LAZY", 1);
        g = a60Var2;
        a60 a60Var3 = new a60("ATOMIC", 2);
        h = a60Var3;
        a60 a60Var4 = new a60("UNDISPATCHED", 3);
        i = a60Var4;
        j = new a60[]{a60Var, a60Var2, a60Var3, a60Var4};
    }

    public static a60 valueOf(String str) {
        return (a60) Enum.valueOf(a60.class, str);
    }

    public static a60[] values() {
        return (a60[]) j.clone();
    }
}
