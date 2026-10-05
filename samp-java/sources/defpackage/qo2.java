package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qo2 extends qb1 {
    public static final qo2 c = new qo2(0, "Undefined intrinsics block and it is required");
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qo2(int i, String str) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.cn1
    public final dn1 c(en1 en1Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                oi0 oi0Var = oi0.f;
                if (size == 0) {
                    return en1Var.I0(m30.k(j), m30.j(j), oi0Var, new u0(19));
                }
                if (size == 1) {
                    i62 i62VarT = ((xm1) list.get(0)).t(j);
                    return en1Var.I0(n30.g(i62VarT.f, j), n30.f(i62VarT.g, j), oi0Var, new z6(i62VarT, 9));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    i62 i62VarT2 = ((xm1) list.get(i)).t(j);
                    iMax = Math.max(i62VarT2.f, iMax);
                    iMax2 = Math.max(i62VarT2.g, iMax2);
                    arrayList.add(i62VarT2);
                }
                return en1Var.I0(n30.g(iMax, j), n30.f(iMax2, j), oi0Var, new o8(3, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
