package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class v50 {
    public static final v50 f;
    public static final v50 g;
    public static final v50 h;
    public static final v50 i;
    public static final v50 j;
    public static final /* synthetic */ v50[] k;

    static {
        v50 v50Var = new v50("CPU_ACQUIRED", 0);
        f = v50Var;
        v50 v50Var2 = new v50("BLOCKING", 1);
        g = v50Var2;
        v50 v50Var3 = new v50("PARKING", 2);
        h = v50Var3;
        v50 v50Var4 = new v50("DORMANT", 3);
        i = v50Var4;
        v50 v50Var5 = new v50("TERMINATED", 4);
        j = v50Var5;
        k = new v50[]{v50Var, v50Var2, v50Var3, v50Var4, v50Var5};
    }

    public static v50 valueOf(String str) {
        return (v50) Enum.valueOf(v50.class, str);
    }

    public static v50[] values() {
        return (v50[]) k.clone();
    }
}
