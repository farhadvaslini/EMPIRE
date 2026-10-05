package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fl1 {
    public static final fl1 f;
    public static final fl1 g;
    public static final fl1 h;
    public static final /* synthetic */ fl1[] i;

    static {
        fl1 fl1Var = new fl1("IsPlacedInLookahead", 0);
        f = fl1Var;
        fl1 fl1Var2 = new fl1("IsPlacedInApproach", 1);
        g = fl1Var2;
        fl1 fl1Var3 = new fl1("IsNotPlaced", 2);
        h = fl1Var3;
        i = new fl1[]{fl1Var, fl1Var2, fl1Var3};
    }

    public static fl1 valueOf(String str) {
        return (fl1) Enum.valueOf(fl1.class, str);
    }

    public static fl1[] values() {
        return (fl1[]) i.clone();
    }
}
