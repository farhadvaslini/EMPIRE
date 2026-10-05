package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class i61 {
    public static final i61 f;
    public static final i61 g;
    public static final i61 h;
    public static final i61 i;
    public static final i61 j;
    public static final i61 k;
    public static final i61 l;
    public static final i61 m;
    public static final i61 n;
    public static final i61 o;
    public static final /* synthetic */ i61[] p;

    static {
        i61 i61Var = new i61("VOID", 0);
        f = i61Var;
        i61 i61Var2 = new i61("INT", 1);
        g = i61Var2;
        i61 i61Var3 = new i61("LONG", 2);
        h = i61Var3;
        i61 i61Var4 = new i61("FLOAT", 3);
        i = i61Var4;
        i61 i61Var5 = new i61("DOUBLE", 4);
        j = i61Var5;
        i61 i61Var6 = new i61("BOOLEAN", 5);
        k = i61Var6;
        i61 i61Var7 = new i61("STRING", 6);
        l = i61Var7;
        jq jqVar = jq.h;
        i61 i61Var8 = new i61("BYTE_STRING", 7);
        m = i61Var8;
        i61 i61Var9 = new i61("ENUM", 8);
        n = i61Var9;
        i61 i61Var10 = new i61("MESSAGE", 9);
        o = i61Var10;
        p = new i61[]{i61Var, i61Var2, i61Var3, i61Var4, i61Var5, i61Var6, i61Var7, i61Var8, i61Var9, i61Var10};
    }

    public static i61 valueOf(String str) {
        return (i61) Enum.valueOf(i61.class, str);
    }

    public static i61[] values() {
        return (i61[]) p.clone();
    }
}
