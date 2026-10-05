package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ef1 {
    private static final /* synthetic */ lj0 $ENTRIES;
    private static final /* synthetic */ ef1[] $VALUES;
    public static final cf1 Companion;
    public static final ef1 ON_ANY;
    public static final ef1 ON_CREATE;
    public static final ef1 ON_DESTROY;
    public static final ef1 ON_PAUSE;
    public static final ef1 ON_RESUME;
    public static final ef1 ON_START;
    public static final ef1 ON_STOP;

    static {
        ef1 ef1Var = new ef1("ON_CREATE", 0);
        ON_CREATE = ef1Var;
        ef1 ef1Var2 = new ef1("ON_START", 1);
        ON_START = ef1Var2;
        ef1 ef1Var3 = new ef1("ON_RESUME", 2);
        ON_RESUME = ef1Var3;
        ef1 ef1Var4 = new ef1("ON_PAUSE", 3);
        ON_PAUSE = ef1Var4;
        ef1 ef1Var5 = new ef1("ON_STOP", 4);
        ON_STOP = ef1Var5;
        ef1 ef1Var6 = new ef1("ON_DESTROY", 5);
        ON_DESTROY = ef1Var6;
        ef1 ef1Var7 = new ef1("ON_ANY", 6);
        ON_ANY = ef1Var7;
        ef1[] ef1VarArr = {ef1Var, ef1Var2, ef1Var3, ef1Var4, ef1Var5, ef1Var6, ef1Var7};
        $VALUES = ef1VarArr;
        $ENTRIES = new mj0(ef1VarArr);
        Companion = new cf1();
    }

    public static ef1 valueOf(String str) {
        return (ef1) Enum.valueOf(ef1.class, str);
    }

    public static ef1[] values() {
        return (ef1[]) $VALUES.clone();
    }

    public final ff1 a() {
        switch (df1.a[ordinal()]) {
            case 1:
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ff1.h;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ff1.i;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ff1.j;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return ff1.f;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                c.k();
                return null;
        }
    }
}
