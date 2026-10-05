package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class mu3 {
    public static final iu3 h;
    public static final ju3 i;
    public static final ku3 j;
    public static final /* synthetic */ mu3[] k;
    public final nu3 f;
    public final int g;

    /* JADX INFO: Fake field, exist only in values array */
    mu3 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    mu3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    mu3 EF2;

    static {
        mu3 mu3Var = new mu3("DOUBLE", 0, nu3.i, 1);
        mu3 mu3Var2 = new mu3("FLOAT", 1, nu3.h, 5);
        nu3 nu3Var = nu3.g;
        mu3 mu3Var3 = new mu3("INT64", 2, nu3Var, 0);
        mu3 mu3Var4 = new mu3("UINT64", 3, nu3Var, 0);
        nu3 nu3Var2 = nu3.f;
        mu3 mu3Var5 = new mu3("INT32", 4, nu3Var2, 0);
        mu3 mu3Var6 = new mu3("FIXED64", 5, nu3Var, 1);
        mu3 mu3Var7 = new mu3("FIXED32", 6, nu3Var2, 5);
        mu3 mu3Var8 = new mu3("BOOL", 7, nu3.j, 0);
        iu3 iu3Var = new iu3("STRING", 8, nu3.k, 2);
        h = iu3Var;
        nu3 nu3Var3 = nu3.n;
        ju3 ju3Var = new ju3("GROUP", 9, nu3Var3, 3);
        i = ju3Var;
        ku3 ku3Var = new ku3("MESSAGE", 10, nu3Var3, 2);
        j = ku3Var;
        k = new mu3[]{mu3Var, mu3Var2, mu3Var3, mu3Var4, mu3Var5, mu3Var6, mu3Var7, mu3Var8, iu3Var, ju3Var, ku3Var, new lu3("BYTES", 11, nu3.l, 2), new mu3("UINT32", 12, nu3Var2, 0), new mu3("ENUM", 13, nu3.m, 0), new mu3("SFIXED32", 14, nu3Var2, 5), new mu3("SFIXED64", 15, nu3Var, 1), new mu3("SINT32", 16, nu3Var2, 0), new mu3("SINT64", 17, nu3Var, 0)};
    }

    public mu3(String str, int i2, nu3 nu3Var, int i3) {
        this.f = nu3Var;
        this.g = i3;
    }

    public static mu3 valueOf(String str) {
        return (mu3) Enum.valueOf(mu3.class, str);
    }

    public static mu3[] values() {
        return (mu3[]) k.clone();
    }
}
