package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wa implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;

    public /* synthetic */ wa(int i, ArrayList arrayList) {
        this.f = i;
        this.g = arrayList;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        ArrayList arrayList = this.g;
        switch (i) {
            case 0:
                h62 h62Var = (h62) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i2 = 0;
                    while (true) {
                        h62.F(h62Var, (i62) arrayList.get(i2), 0, 0);
                        if (i2 != size) {
                            i2++;
                        }
                    }
                }
                break;
            case 1:
                arrayList.get(((Number) obj).intValue());
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                arrayList.get(((Number) obj).intValue());
                break;
            default:
                arrayList.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
