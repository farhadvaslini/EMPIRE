package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nu3 {
    public static final nu3 f;
    public static final nu3 g;
    public static final nu3 h;
    public static final nu3 i;
    public static final nu3 j;
    public static final nu3 k;
    public static final nu3 l;
    public static final nu3 m;
    public static final nu3 n;
    public static final /* synthetic */ nu3[] o;

    static {
        nu3 nu3Var = new nu3("INT", 0);
        f = nu3Var;
        nu3 nu3Var2 = new nu3("LONG", 1);
        g = nu3Var2;
        nu3 nu3Var3 = new nu3("FLOAT", 2);
        h = nu3Var3;
        nu3 nu3Var4 = new nu3("DOUBLE", 3);
        i = nu3Var4;
        nu3 nu3Var5 = new nu3("BOOLEAN", 4);
        j = nu3Var5;
        nu3 nu3Var6 = new nu3("STRING", 5);
        k = nu3Var6;
        jq jqVar = jq.h;
        nu3 nu3Var7 = new nu3("BYTE_STRING", 6);
        l = nu3Var7;
        nu3 nu3Var8 = new nu3("ENUM", 7);
        m = nu3Var8;
        nu3 nu3Var9 = new nu3("MESSAGE", 8);
        n = nu3Var9;
        o = new nu3[]{nu3Var, nu3Var2, nu3Var3, nu3Var4, nu3Var5, nu3Var6, nu3Var7, nu3Var8, nu3Var9};
    }

    public static nu3 valueOf(String str) {
        return (nu3) Enum.valueOf(nu3.class, str);
    }

    public static nu3[] values() {
        return (nu3[]) o.clone();
    }
}
