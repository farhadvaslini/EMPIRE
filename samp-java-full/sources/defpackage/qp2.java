package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qp2 {
    public static final ak2 h;
    public static final qp2 i;
    public static final /* synthetic */ qp2[] j;
    public static final /* synthetic */ mj0 k;
    public final String f;
    public final int g;

    static {
        qp2 qp2Var = new qp2(0, 0, "V037R4", "0.3.7-R4");
        i = qp2Var;
        qp2[] qp2VarArr = {qp2Var, new qp2(1, 1, "V03DLR1", "0.3.DL-R1")};
        j = qp2VarArr;
        k = new mj0(qp2VarArr);
        h = new ak2(1);
    }

    public qp2(int i2, int i3, String str, String str2) {
        this.f = str2;
        this.g = i3;
    }

    public static qp2 valueOf(String str) {
        return (qp2) Enum.valueOf(qp2.class, str);
    }

    public static qp2[] values() {
        return (qp2[]) j.clone();
    }
}
