package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bk2 {
    public static final bk2 f;
    public static final bk2 g;
    public static final bk2 h;
    public static final bk2 i;
    public static final bk2 j;
    public static final bk2 k;
    public static final /* synthetic */ bk2[] l;

    static {
        bk2 bk2Var = new bk2("ShutDown", 0);
        f = bk2Var;
        bk2 bk2Var2 = new bk2("ShuttingDown", 1);
        g = bk2Var2;
        bk2 bk2Var3 = new bk2("Inactive", 2);
        h = bk2Var3;
        bk2 bk2Var4 = new bk2("InactivePendingWork", 3);
        i = bk2Var4;
        bk2 bk2Var5 = new bk2("Idle", 4);
        j = bk2Var5;
        bk2 bk2Var6 = new bk2("PendingWork", 5);
        k = bk2Var6;
        l = new bk2[]{bk2Var, bk2Var2, bk2Var3, bk2Var4, bk2Var5, bk2Var6};
    }

    public static bk2 valueOf(String str) {
        return (bk2) Enum.valueOf(bk2.class, str);
    }

    public static bk2[] values() {
        return (bk2[]) l.clone();
    }
}
