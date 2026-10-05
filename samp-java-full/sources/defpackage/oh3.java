package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class oh3 {
    public static final ak2 f;
    public static final oh3 g;
    public static final oh3 h;
    public static final oh3 i;
    public static final oh3 j;
    public static final /* synthetic */ oh3[] k;
    public static final /* synthetic */ mj0 l;

    static {
        oh3 oh3Var = new oh3("System", 0);
        g = oh3Var;
        oh3 oh3Var2 = new oh3("Light", 1);
        h = oh3Var2;
        oh3 oh3Var3 = new oh3("Dark", 2);
        i = oh3Var3;
        oh3 oh3Var4 = new oh3("Dynamic", 3);
        j = oh3Var4;
        oh3[] oh3VarArr = {oh3Var, oh3Var2, oh3Var3, oh3Var4};
        k = oh3VarArr;
        l = new mj0(oh3VarArr);
        f = new ak2(17);
    }

    public static oh3 valueOf(String str) {
        return (oh3) Enum.valueOf(oh3.class, str);
    }

    public static oh3[] values() {
        return (oh3[]) k.clone();
    }
}
