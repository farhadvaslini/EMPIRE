package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class ml0 {
    public static final ml0 g;
    public static final ml0 h;
    public static final ml0[] i;
    public static final /* synthetic */ ml0[] j;
    public final int f;

    /* JADX INFO: Fake field, exist only in values array */
    ml0 EF0;

    static {
        i61 i61Var = i61.j;
        ml0 ml0Var = new ml0("DOUBLE", 0, 0, 1, i61Var);
        i61 i61Var2 = i61.i;
        ml0 ml0Var2 = new ml0("FLOAT", 1, 1, 1, i61Var2);
        i61 i61Var3 = i61.h;
        ml0 ml0Var3 = new ml0("INT64", 2, 2, 1, i61Var3);
        ml0 ml0Var4 = new ml0("UINT64", 3, 3, 1, i61Var3);
        i61 i61Var4 = i61.g;
        ml0 ml0Var5 = new ml0("INT32", 4, 4, 1, i61Var4);
        ml0 ml0Var6 = new ml0("FIXED64", 5, 5, 1, i61Var3);
        ml0 ml0Var7 = new ml0("FIXED32", 6, 6, 1, i61Var4);
        i61 i61Var5 = i61.k;
        ml0 ml0Var8 = new ml0("BOOL", 7, 7, 1, i61Var5);
        i61 i61Var6 = i61.l;
        ml0 ml0Var9 = new ml0("STRING", 8, 8, 1, i61Var6);
        i61 i61Var7 = i61.o;
        ml0 ml0Var10 = new ml0("MESSAGE", 9, 9, 1, i61Var7);
        i61 i61Var8 = i61.m;
        ml0 ml0Var11 = new ml0("BYTES", 10, 10, 1, i61Var8);
        ml0 ml0Var12 = new ml0("UINT32", 11, 11, 1, i61Var4);
        i61 i61Var9 = i61.n;
        ml0 ml0Var13 = new ml0("ENUM", 12, 12, 1, i61Var9);
        ml0 ml0Var14 = new ml0("SFIXED32", 13, 13, 1, i61Var4);
        ml0 ml0Var15 = new ml0("SFIXED64", 14, 14, 1, i61Var3);
        ml0 ml0Var16 = new ml0("SINT32", 15, 15, 1, i61Var4);
        ml0 ml0Var17 = new ml0("SINT64", 16, 16, 1, i61Var3);
        ml0 ml0Var18 = new ml0("GROUP", 17, 17, 1, i61Var7);
        ml0 ml0Var19 = new ml0("DOUBLE_LIST", 18, 18, 2, i61Var);
        ml0 ml0Var20 = new ml0("FLOAT_LIST", 19, 19, 2, i61Var2);
        ml0 ml0Var21 = new ml0("INT64_LIST", 20, 20, 2, i61Var3);
        ml0 ml0Var22 = new ml0("UINT64_LIST", 21, 21, 2, i61Var3);
        ml0 ml0Var23 = new ml0("INT32_LIST", 22, 22, 2, i61Var4);
        ml0 ml0Var24 = new ml0("FIXED64_LIST", 23, 23, 2, i61Var3);
        ml0 ml0Var25 = new ml0("FIXED32_LIST", 24, 24, 2, i61Var4);
        ml0 ml0Var26 = new ml0("BOOL_LIST", 25, 25, 2, i61Var5);
        ml0 ml0Var27 = new ml0("STRING_LIST", 26, 26, 2, i61Var6);
        ml0 ml0Var28 = new ml0("MESSAGE_LIST", 27, 27, 2, i61Var7);
        ml0 ml0Var29 = new ml0("BYTES_LIST", 28, 28, 2, i61Var8);
        ml0 ml0Var30 = new ml0("UINT32_LIST", 29, 29, 2, i61Var4);
        ml0 ml0Var31 = new ml0("ENUM_LIST", 30, 30, 2, i61Var9);
        ml0 ml0Var32 = new ml0("SFIXED32_LIST", 31, 31, 2, i61Var4);
        ml0 ml0Var33 = new ml0("SFIXED64_LIST", 32, 32, 2, i61Var3);
        ml0 ml0Var34 = new ml0("SINT32_LIST", 33, 33, 2, i61Var4);
        ml0 ml0Var35 = new ml0("SINT64_LIST", 34, 34, 2, i61Var3);
        ml0 ml0Var36 = new ml0("DOUBLE_LIST_PACKED", 35, 35, 3, i61Var);
        g = ml0Var36;
        ml0 ml0Var37 = new ml0("FLOAT_LIST_PACKED", 36, 36, 3, i61Var2);
        ml0 ml0Var38 = new ml0("INT64_LIST_PACKED", 37, 37, 3, i61Var3);
        ml0 ml0Var39 = new ml0("UINT64_LIST_PACKED", 38, 38, 3, i61Var3);
        ml0 ml0Var40 = new ml0("INT32_LIST_PACKED", 39, 39, 3, i61Var4);
        ml0 ml0Var41 = new ml0("FIXED64_LIST_PACKED", 40, 40, 3, i61Var3);
        ml0 ml0Var42 = new ml0("FIXED32_LIST_PACKED", 41, 41, 3, i61Var4);
        ml0 ml0Var43 = new ml0("BOOL_LIST_PACKED", 42, 42, 3, i61Var5);
        ml0 ml0Var44 = new ml0("UINT32_LIST_PACKED", 43, 43, 3, i61Var4);
        ml0 ml0Var45 = new ml0("ENUM_LIST_PACKED", 44, 44, 3, i61Var9);
        ml0 ml0Var46 = new ml0("SFIXED32_LIST_PACKED", 45, 45, 3, i61Var4);
        ml0 ml0Var47 = new ml0("SFIXED64_LIST_PACKED", 46, 46, 3, i61Var3);
        ml0 ml0Var48 = new ml0("SINT32_LIST_PACKED", 47, 47, 3, i61Var4);
        ml0 ml0Var49 = new ml0("SINT64_LIST_PACKED", 48, 48, 3, i61Var3);
        h = ml0Var49;
        j = new ml0[]{ml0Var, ml0Var2, ml0Var3, ml0Var4, ml0Var5, ml0Var6, ml0Var7, ml0Var8, ml0Var9, ml0Var10, ml0Var11, ml0Var12, ml0Var13, ml0Var14, ml0Var15, ml0Var16, ml0Var17, ml0Var18, ml0Var19, ml0Var20, ml0Var21, ml0Var22, ml0Var23, ml0Var24, ml0Var25, ml0Var26, ml0Var27, ml0Var28, ml0Var29, ml0Var30, ml0Var31, ml0Var32, ml0Var33, ml0Var34, ml0Var35, ml0Var36, ml0Var37, ml0Var38, ml0Var39, ml0Var40, ml0Var41, ml0Var42, ml0Var43, ml0Var44, ml0Var45, ml0Var46, ml0Var47, ml0Var48, ml0Var49, new ml0("GROUP_LIST", 49, 49, 2, i61Var7), new ml0("MAP", 50, 50, 4, i61.f)};
        ml0[] ml0VarArrValues = values();
        i = new ml0[ml0VarArrValues.length];
        for (ml0 ml0Var50 : ml0VarArrValues) {
            i[ml0Var50.f] = ml0Var50;
        }
    }

    public ml0(String str, int i2, int i3, int i4, i61 i61Var) {
        this.f = i3;
        int iZ = nc2.z(i4);
        if (iZ == 1 || iZ == 3) {
            i61Var.getClass();
        }
        if (i4 == 1) {
            i61Var.ordinal();
        }
    }

    public static ml0 valueOf(String str) {
        return (ml0) Enum.valueOf(ml0.class, str);
    }

    public static ml0[] values() {
        return (ml0[]) j.clone();
    }
}
