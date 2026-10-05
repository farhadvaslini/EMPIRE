package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class ev2 {
    public static final Comparator[] a;
    public static final av2 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new w92(4, new w92(3, i == 0 ? up0.e : up0.c));
            i++;
        }
        a = comparatorArr;
        b = new av2(2);
    }

    public static final void a(vu2 vu2Var, ArrayList arrayList, s sVar, s sVar2, or1 or1Var) {
        qu2 qu2Var = vu2Var.d;
        Object objG = qu2Var.f.g(zu2.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) sVar2.h(vu2Var)).booleanValue()) && ((Boolean) sVar.h(vu2Var)).booleanValue()) {
            arrayList.add(vu2Var);
        }
        if (zBooleanValue) {
            or1Var.i(vu2Var.f, b(vu2Var, sVar, sVar2, vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0)));
            return;
        }
        List listI = vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0);
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            a((vu2) listI.get(i), arrayList, sVar, sVar2, or1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(defpackage.vu2 r17, defpackage.s r18, defpackage.s r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev2.b(vu2, s, s, java.util.List):java.util.ArrayList");
    }
}
