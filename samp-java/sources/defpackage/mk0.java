package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class mk0 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ns0 g;

    public /* synthetic */ mk0(ns0 ns0Var, int i) {
        this.f = i;
        this.g = ns0Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        i22 i22Var = i22.a;
        k22 k22Var = k22.a;
        dm3 dm3Var = dm3.a;
        ns0 ns0Var = this.g;
        switch (i) {
            case 0:
                ns0Var.h(Boolean.FALSE);
                break;
            case 1:
                ns0Var.h(j22.a);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ns0Var.h(k22Var);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ns0Var.h(g22.a);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ns0Var.h(f22.a);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ns0Var.h(e22.a);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ns0Var.h(i22Var);
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                ns0Var.h(k22Var);
                break;
            case 8:
                ns0Var.h(k22Var);
                break;
            case vr.g /* 9 */:
                ns0Var.h(k22Var);
                break;
            case vr.h /* 10 */:
                ns0Var.h(k22Var);
                break;
            default:
                ns0Var.h(i22Var);
                break;
        }
        return dm3Var;
    }
}
