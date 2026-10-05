package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qu1 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ e93 g;

    public /* synthetic */ qu1(e93 e93Var, int i) {
        this.f = i;
        this.g = e93Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        e93 e93Var = this.g;
        switch (i) {
            case 0:
                List list = (List) e93Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (s51.n(((qt1) obj).g.f, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return Float.valueOf(((Number) e93Var.getValue()).floatValue());
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return Float.valueOf(((Number) e93Var.getValue()).floatValue());
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return Float.valueOf(((Number) e93Var.getValue()).floatValue());
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return Float.valueOf(((Number) e93Var.getValue()).floatValue());
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new gy1(((gy1) e93Var.getValue()).a);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                re reVar = mu2.a;
                return new gy1(((gy1) e93Var.getValue()).a);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.valueOf(((Number) e93Var.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) e93Var.getValue()).floatValue() > 0.0f);
        }
    }
}
