package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c00 extends f4 implements rs0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c00(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.m = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(String str, p40 p40Var) {
        y81 y81Var;
        d91 d91Var;
        int i = this.m;
        dm3 dm3Var = dm3.a;
        Object obj = this.f;
        y50 y50Var = y50.f;
        switch (i) {
            case 1:
                if (p40Var instanceof y81) {
                    y81Var = (y81) p40Var;
                    int i2 = y81Var.k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        y81Var.k = i2 - Integer.MIN_VALUE;
                    } else {
                        y81Var = new y81(this, p40Var);
                    }
                }
                Object obj2 = y81Var.i;
                int i3 = y81Var.k;
                if (i3 == 0) {
                    y02.Q(obj2);
                    y81Var.k = 1;
                    if (c63.b((c63) obj, str, y81Var) == y50Var) {
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj2);
                }
                break;
            default:
                if (p40Var instanceof d91) {
                    d91Var = (d91) p40Var;
                    int i4 = d91Var.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        d91Var.k = i4 - Integer.MIN_VALUE;
                    } else {
                        d91Var = new d91(this, p40Var);
                    }
                }
                Object obj3 = d91Var.i;
                int i5 = d91Var.k;
                if (i5 == 0) {
                    y02.Q(obj3);
                    d91Var.k = 1;
                    if (c63.b((c63) obj, str, d91Var) == y50Var) {
                    }
                } else if (i5 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj3);
                }
                break;
        }
        return y50Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.m;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                d00 d00Var = (d00) obj3;
                d00Var.d(((Number) obj2).intValue(), (nv0) obj);
                break;
            case 1:
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ps2 ps2Var = (ps2) obj3;
                cl3.t(ps2Var.O.c(), null, new t0(ps2Var, ((lp3) obj).a, null, 2), 3);
                break;
            default:
                ps2 ps2Var2 = (ps2) obj3;
                cl3.t(ps2Var2.O.c(), null, new t0(ps2Var2, ((lp3) obj).a, null, 3), 3);
                break;
        }
        return dm3Var;
    }
}
