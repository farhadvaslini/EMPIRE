package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pc3 implements zq1 {
    public final /* synthetic */ qc3 a;

    public pc3(qc3 qc3Var) {
        this.a = qc3Var;
    }

    @Override // defpackage.zq1
    public final dn1 c(en1 en1Var, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        int i = m30.i(j);
        int size = list2.size();
        ok2 ok2Var = new ok2();
        if (size > 0) {
            ok2Var.f = i / size;
        }
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            numValueOf = Integer.valueOf(Math.max(((xm1) list2.get(i2)).y(ok2Var.f), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            jd0 jd0Var = new jd0(en1Var.X0(Math.min(((xm1) list2.get(i3)).u0(iIntValue), ok2Var.f)) - (lc3.b * 2.0f));
            jd0 jd0Var2 = new jd0(24.0f);
            if (jd0Var.compareTo(jd0Var2) < 0) {
                jd0Var = jd0Var2;
            }
            arrayList2.add(new mc3(en1Var.X0(ok2Var.f) * i3, en1Var.X0(ok2Var.f), jd0Var.f));
        }
        this.a.a.setValue(arrayList2);
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            xm1 xm1Var = (xm1) list2.get(i4);
            int i5 = ok2Var.f;
            arrayList3.add(xm1Var.t(m30.a(i5, i5, iIntValue, iIntValue)));
        }
        ArrayList arrayList4 = new ArrayList(list3.size());
        int i6 = 0;
        for (int size4 = list3.size(); i6 < size4; size4 = size4) {
            arrayList4.add(((xm1) list3.get(i6)).t(m30.b(j, 0, 0, 0, 0, 11)));
            i6++;
        }
        ArrayList arrayList5 = new ArrayList(list4.size());
        int size5 = list4.size();
        for (int i7 = 0; i7 < size5; i7++) {
            xm1 xm1Var2 = (xm1) list4.get(i7);
            int i8 = ok2Var.f;
            arrayList5.add(xm1Var2.t(m30.a(i8, i8, 0, iIntValue)));
        }
        return en1Var.I0(i, iIntValue, oi0.f, new py(arrayList3, arrayList4, arrayList5, ok2Var, iIntValue));
    }
}
