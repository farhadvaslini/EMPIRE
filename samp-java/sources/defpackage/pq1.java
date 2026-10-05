package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pq1 {
    public static final pq1 f;
    public static final pq1 g;
    public static final pq1 h;
    public static final pq1 i;
    public static final pq1 j;
    public static final /* synthetic */ pq1[] k;

    static {
        pq1 pq1Var = new pq1("DefaultSpatial", 0);
        f = pq1Var;
        pq1 pq1Var2 = new pq1("FastSpatial", 1);
        g = pq1Var2;
        pq1 pq1Var3 = new pq1("SlowSpatial", 2);
        pq1 pq1Var4 = new pq1("DefaultEffects", 3);
        h = pq1Var4;
        pq1 pq1Var5 = new pq1("FastEffects", 4);
        i = pq1Var5;
        pq1 pq1Var6 = new pq1("SlowEffects", 5);
        j = pq1Var6;
        k = new pq1[]{pq1Var, pq1Var2, pq1Var3, pq1Var4, pq1Var5, pq1Var6};
    }

    public static pq1 valueOf(String str) {
        return (pq1) Enum.valueOf(pq1.class, str);
    }

    public static pq1[] values() {
        return (pq1[]) k.clone();
    }
}
