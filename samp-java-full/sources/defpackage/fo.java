package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fo implements ns0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ en1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ fo(i62 i62Var, xm1 xm1Var, en1 en1Var, int i, int i2, ho hoVar) {
        this.j = i62Var;
        this.k = xm1Var;
        this.g = en1Var;
        this.h = i;
        this.i = i2;
        this.l = hoVar;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        en1 en1Var = this.g;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                eo.b((h62) obj, (i62) obj4, (xm1) obj3, en1Var.getLayoutDirection(), this.h, this.i, ((ho) obj2).a);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj4;
                ot2 ot2Var = (ot2) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                h62 h62Var = (h62) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    int i3 = this.i;
                    if (i2 >= size) {
                        int iP0 = en1Var.p0(8.0f) + en1Var.p0(qt2.c);
                        ed edVar = ot2Var.c;
                        int iIntValue = iP0 + (edVar != null ? ((Number) edVar.d()).intValue() : this.h);
                        int size2 = arrayList2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            i62 i62Var = (i62) arrayList2.get(i4);
                            h62Var.C(i62Var, iIntValue, (i3 - i62Var.g) / 2, 0.0f);
                        }
                    } else {
                        i62 i62Var2 = (i62) arrayList.get(i2);
                        h62Var.C(i62Var2, 0, (i3 - i62Var2.g) / 2, 0.0f);
                        i2++;
                    }
                    break;
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ fo(ArrayList arrayList, en1 en1Var, ot2 ot2Var, int i, ArrayList arrayList2, int i2) {
        this.j = arrayList;
        this.g = en1Var;
        this.k = ot2Var;
        this.h = i;
        this.l = arrayList2;
        this.i = i2;
    }
}
