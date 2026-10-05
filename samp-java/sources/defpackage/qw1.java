package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qw1 {
    public static final qw1 g;
    public static final qw1 h;
    public static final qw1 i;
    public static final qw1 j;
    public static final qw1 k;
    public static final qw1 l;
    public static final qw1 m;
    public static final qw1 n;
    public static final /* synthetic */ qw1[] o;
    public static final /* synthetic */ mj0 p;
    public final int f;

    static {
        qw1 qw1Var = new qw1(0, 2131624023, "Session");
        g = qw1Var;
        qw1 qw1Var2 = new qw1(1, 2131624022, "Player");
        h = qw1Var2;
        qw1 qw1Var3 = new qw1(2, 2131624020, "Camera");
        i = qw1Var3;
        qw1 qw1Var4 = new qw1(3, 2131624026, "Vehicle");
        j = qw1Var4;
        qw1 qw1Var5 = new qw1(4, 2131624027, "World");
        k = qw1Var5;
        qw1 qw1Var6 = new qw1(5, 2131624021, "Interface");
        l = qw1Var6;
        qw1 qw1Var7 = new qw1(6, 2131624019, "Animation");
        m = qw1Var7;
        qw1 qw1Var8 = new qw1(7, 2131624025, "Sync");
        n = qw1Var8;
        qw1[] qw1VarArr = {qw1Var, qw1Var2, qw1Var3, qw1Var4, qw1Var5, qw1Var6, qw1Var7, qw1Var8};
        o = qw1VarArr;
        p = new mj0(qw1VarArr);
    }

    public qw1(int i2, int i3, String str) {
        this.f = i3;
    }

    public static qw1 valueOf(String str) {
        return (qw1) Enum.valueOf(qw1.class, str);
    }

    public static qw1[] values() {
        return (qw1[]) o.clone();
    }
}
