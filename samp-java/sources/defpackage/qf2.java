package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qf2 {
    public static final h01 g;
    public static final qf2 h;
    public static final /* synthetic */ qf2[] i;
    public static final /* synthetic */ mj0 j;
    public final String f;

    static {
        qf2 qf2Var = new qf2("TOP_LEFT", "top_left", 0);
        h = qf2Var;
        qf2[] qf2VarArr = {qf2Var, new qf2("BOTTOM_LEFT", "bottom_left", 1)};
        i = qf2VarArr;
        j = new mj0(qf2VarArr);
        g = new h01(28);
    }

    public qf2(String str, String str2, int i2) {
        this.f = str2;
    }

    public static qf2 valueOf(String str) {
        return (qf2) Enum.valueOf(qf2.class, str);
    }

    public static qf2[] values() {
        return (qf2[]) i.clone();
    }
}
