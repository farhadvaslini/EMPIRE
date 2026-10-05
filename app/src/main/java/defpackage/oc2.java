package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class oc2 extends wv0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final oc2 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile i42 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        oc2 oc2Var = new oc2();
        DEFAULT_INSTANCE = oc2Var;
        wv0.j(oc2.class, oc2Var);
    }

    public static mc2 D() {
        return (mc2) ((uv0) DEFAULT_INSTANCE.c(5));
    }

    public static void l(oc2 oc2Var, long j) {
        oc2Var.valueCase_ = 4;
        oc2Var.value_ = Long.valueOf(j);
    }

    public static void m(oc2 oc2Var, String str) {
        oc2Var.getClass();
        oc2Var.valueCase_ = 5;
        oc2Var.value_ = str;
    }

    public static void n(oc2 oc2Var, lc2 lc2Var) {
        oc2Var.getClass();
        oc2Var.value_ = lc2Var;
        oc2Var.valueCase_ = 6;
    }

    public static void o(oc2 oc2Var, double d) {
        oc2Var.valueCase_ = 7;
        oc2Var.value_ = Double.valueOf(d);
    }

    public static void p(oc2 oc2Var, jq jqVar) {
        oc2Var.getClass();
        oc2Var.valueCase_ = 8;
        oc2Var.value_ = jqVar;
    }

    public static void q(oc2 oc2Var, boolean z) {
        oc2Var.valueCase_ = 1;
        oc2Var.value_ = Boolean.valueOf(z);
    }

    public static void r(oc2 oc2Var, float f) {
        oc2Var.valueCase_ = 2;
        oc2Var.value_ = Float.valueOf(f);
    }

    public static void s(oc2 oc2Var, int i) {
        oc2Var.valueCase_ = 3;
        oc2Var.value_ = Integer.valueOf(i);
    }

    public static oc2 v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final lc2 B() {
        return this.valueCase_ == 6 ? (lc2) this.value_ : lc2.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // defpackage.wv0
    public final Object c(int i) {
        i42 vv0Var;
        switch (nc2.z(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new yi2(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", lc2.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new oc2();
            case LONG_FIELD_NUMBER /* 4 */:
                return new mc2(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                i42 i42Var = PARSER;
                if (i42Var != null) {
                    return i42Var;
                }
                synchronized (oc2.class) {
                    try {
                        vv0Var = PARSER;
                        if (vv0Var == null) {
                            vv0Var = new vv0();
                            PARSER = vv0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return vv0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final jq u() {
        return this.valueCase_ == 8 ? (jq) this.value_ : jq.h;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
