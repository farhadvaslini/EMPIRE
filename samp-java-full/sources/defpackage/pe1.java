package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pe1 {
    public static final pe1 f;
    public static final /* synthetic */ pe1[] g;

    /* JADX INFO: Fake field, exist only in values array */
    pe1 EF0;

    static {
        pe1 pe1Var = new pe1("SYNCHRONIZED", 0);
        pe1 pe1Var2 = new pe1("PUBLICATION", 1);
        pe1 pe1Var3 = new pe1("NONE", 2);
        f = pe1Var3;
        g = new pe1[]{pe1Var, pe1Var2, pe1Var3};
    }

    public static pe1 valueOf(String str) {
        return (pe1) Enum.valueOf(pe1.class, str);
    }

    public static pe1[] values() {
        return (pe1[]) g.clone();
    }
}
