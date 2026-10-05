package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oc implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ pq3 g;

    public /* synthetic */ oc(pq3 pq3Var, int i) {
        this.f = i;
        this.g = pq3Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        pq3 pq3Var = this.g;
        switch (i) {
            case 0:
                tc.j(pq3Var);
                break;
            case 1:
                pq3Var.E.C();
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                pq3Var.G.saveHierarchyState(sparseArray);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                pq3.n(pq3Var);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                pq3Var.K.h(pq3Var.G);
                break;
            default:
                pq3Var.J.h(pq3Var.G);
                break;
        }
        return dm3Var;
    }
}
