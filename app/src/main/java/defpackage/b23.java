package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class b23 {
    public static final b23 f;
    public static final b23 g;
    public static final b23 h;
    public static final b23 i;
    public static final b23 j;
    public static final b23 k;
    public static final b23 l;
    public static final /* synthetic */ b23[] m;

    /* JADX INFO: Fake field, exist only in values array */
    b23 EF0;

    static {
        b23 b23Var = new b23("CornerExtraExtraLarge", 0);
        b23 b23Var2 = new b23("CornerExtraLarge", 1);
        f = b23Var2;
        b23 b23Var3 = new b23("CornerExtraLargeIncreased", 2);
        b23 b23Var4 = new b23("CornerExtraLargeTop", 3);
        g = b23Var4;
        b23 b23Var5 = new b23("CornerExtraSmall", 4);
        h = b23Var5;
        b23 b23Var6 = new b23("CornerExtraSmallTop", 5);
        b23 b23Var7 = new b23("CornerFull", 6);
        i = b23Var7;
        b23 b23Var8 = new b23("CornerLarge", 7);
        b23 b23Var9 = new b23("CornerLargeEnd", 8);
        b23 b23Var10 = new b23("CornerLargeIncreased", 9);
        b23 b23Var11 = new b23("CornerLargeStart", 10);
        b23 b23Var12 = new b23("CornerLargeTop", 11);
        b23 b23Var13 = new b23("CornerMedium", 12);
        j = b23Var13;
        b23 b23Var14 = new b23("CornerNone", 13);
        k = b23Var14;
        b23 b23Var15 = new b23("CornerSmall", 14);
        l = b23Var15;
        m = new b23[]{b23Var, b23Var2, b23Var3, b23Var4, b23Var5, b23Var6, b23Var7, b23Var8, b23Var9, b23Var10, b23Var11, b23Var12, b23Var13, b23Var14, b23Var15};
    }

    public static b23 valueOf(String str) {
        return (b23) Enum.valueOf(b23.class, str);
    }

    public static b23[] values() {
        return (b23[]) m.clone();
    }
}
