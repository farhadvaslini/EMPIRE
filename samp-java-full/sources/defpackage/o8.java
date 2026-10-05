package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o8 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;

    public /* synthetic */ o8(int i, ArrayList arrayList) {
        this.f = i;
        this.g = arrayList;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i;
        int i2 = this.f;
        dm3 dm3Var = dm3.a;
        int i3 = 0;
        ArrayList arrayList = this.g;
        switch (i2) {
            case 0:
                h62 h62Var = (h62) obj;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    h62.F(h62Var, (i62) arrayList.get(i4), 0, 0);
                }
                break;
            case 1:
                h62 h62Var2 = (h62) obj;
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    h62.F(h62Var2, (i62) arrayList.get(i5), 0, 0);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                h62 h62Var3 = (h62) obj;
                int size3 = arrayList.size();
                int i6 = 0;
                while (i6 < size3) {
                    fn1 fn1Var = (fn1) arrayList.get(i6);
                    List list = fn1Var.b;
                    boolean z = fn1Var.g;
                    if (fn1Var.k == Integer.MIN_VALUE) {
                        p21.a("position() should be called first");
                    }
                    int size4 = list.size();
                    int i7 = i3;
                    while (i7 < size4) {
                        i62 i62Var = (i62) list.get(i7);
                        int[] iArr = fn1Var.i;
                        int i8 = i7 * 2;
                        List list2 = list;
                        long jC = i41.c((((long) iArr[i8]) << 32) | (((long) iArr[i8 + 1]) & 4294967295L), fn1Var.c);
                        if (z) {
                            h62.J(h62Var3, i62Var, jC, null, 6);
                            i = i6;
                        } else {
                            s12 s12Var = j62.a;
                            if (h62Var3.y() == bb1.f || h62Var3.B() == 0) {
                                i = i6;
                                h62.c(h62Var3, i62Var);
                                i62Var.K0(i41.c(jC, i62Var.j), 0.0f, s12Var);
                            } else {
                                i = i6;
                                int iB = (h62Var3.B() - i62Var.f) - ((int) (jC >> 32));
                                h62.c(h62Var3, i62Var);
                                i62Var.K0(i41.c((((long) ((int) (jC & 4294967295L))) & 4294967295L) | (((long) iB) << 32), i62Var.j), 0.0f, s12Var);
                            }
                        }
                        i7++;
                        i6 = i;
                        list = list2;
                    }
                    i6++;
                    i3 = 0;
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                h62 h62Var4 = (h62) obj;
                int size5 = arrayList.size();
                for (int i9 = 0; i9 < size5; i9++) {
                    h62.H(h62Var4, (i62) arrayList.get(i9), 0, 0);
                }
                break;
            default:
                h62 h62Var5 = (h62) obj;
                int size6 = arrayList.size();
                for (int i10 = 0; i10 < size6; i10++) {
                    h62Var5.C((i62) arrayList.get(i10), 0, 0, 0.0f);
                }
                break;
        }
        return dm3Var;
    }
}
