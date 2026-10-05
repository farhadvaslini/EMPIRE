package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ot2 implements zq1 {
    public final x50 a;
    public final s83 b;
    public ed c;
    public Integer d;

    public ot2(x50 x50Var, s83 s83Var) {
        this.a = x50Var;
        this.b = s83Var;
    }

    @Override // defpackage.zq1
    public final dn1 c(en1 en1Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i = 1;
        List list3 = (List) arrayList.get(1);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((xm1) list2.get(i2)).t(j));
        }
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int i3 = ((i62) obj).f;
            int size2 = arrayList2.size() - 1;
            if (1 <= size2) {
                int i4 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i4);
                    int i5 = ((i62) obj4).f;
                    if (i3 < i5) {
                        obj = obj4;
                        i3 = i5;
                    }
                    if (i4 == size2) {
                        break;
                    }
                    i4++;
                }
            }
        }
        i62 i62Var = (i62) obj;
        int i6 = i62Var != null ? i62Var.f : 0;
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i7 = 0; i7 < size3; i7++) {
            arrayList3.add(((xm1) list3.get(i7)).t(j));
        }
        if (arrayList3.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList3.get(0);
            int i8 = ((i62) obj2).f;
            int size4 = arrayList3.size() - 1;
            if (1 <= size4) {
                int i9 = 1;
                while (true) {
                    Object obj5 = arrayList3.get(i9);
                    int i10 = ((i62) obj5).f;
                    if (i8 < i10) {
                        obj2 = obj5;
                        i8 = i10;
                    }
                    if (i9 == size4) {
                        break;
                    }
                    i9++;
                }
            }
        }
        i62 i62Var2 = (i62) obj2;
        Integer numValueOf = i62Var2 != null ? Integer.valueOf(i62Var2.f) : null;
        if (arrayList3.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList3.get(0);
            int i11 = ((i62) obj3).g;
            int size5 = arrayList3.size() - 1;
            if (1 <= size5) {
                while (true) {
                    Object obj6 = arrayList3.get(i);
                    int i12 = ((i62) obj6).g;
                    if (i11 < i12) {
                        obj3 = obj6;
                        i11 = i12;
                    }
                    if (i == size5) {
                        break;
                    }
                    i++;
                }
            }
        }
        i62 i62Var3 = (i62) obj3;
        int i13 = i62Var3 != null ? i62Var3.g : 0;
        float f = qt2.c;
        int iIntValue = (numValueOf != null ? numValueOf.intValue() : 0) + en1Var.p0(8.0f) + Math.max(en1Var.p0(f), i6);
        int i14 = i6 == 0 ? (-(en1Var.p0(8.0f) + en1Var.p0(f))) / 2 : 0;
        Integer num = this.d;
        if (num == null) {
            this.d = Integer.valueOf(i14);
        } else {
            ed edVar = this.c;
            if (edVar == null) {
                edVar = new ed(num, rn.g1, null, 12);
                this.c = edVar;
            }
            if (((Number) edVar.e.getValue()).intValue() != i14) {
                cl3.t(this.a, null, new ia1(edVar, i14, this, null), 3);
            }
        }
        return en1Var.I0(iIntValue, i13, oi0.f, new fo(arrayList2, en1Var, this, i14, arrayList3, i13));
    }
}
