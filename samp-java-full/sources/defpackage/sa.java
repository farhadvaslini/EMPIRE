package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sa implements cn1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ sa(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.cn1
    public final dn1 c(en1 en1Var, List list, long j) {
        ArrayList arrayList;
        int i;
        int i2;
        r32 r32Var;
        int i3 = this.a;
        oi0 oi0Var = oi0.f;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                ((rb2) obj).setParentLayoutDirection((bb1) obj2);
                return en1Var.I0(0, 0, oi0Var, new u0(19));
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj3 = list.get(i4);
                    if (!(((xm1) obj3).E() instanceof zg3)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((cs0) obj2).a();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        jk2 jk2Var = (jk2) list2.get(i5);
                        if (jk2Var != null) {
                            float f = jk2Var.b;
                            float f2 = jk2Var.a;
                            xm1 xm1Var = (xm1) arrayList2.get(i5);
                            int iFloor = (int) Math.floor(jk2Var.c - f2);
                            float f3 = jk2Var.d - f;
                            i = size2;
                            i2 = i5;
                            r32Var = new r32(xm1Var.t(n30.b(0, iFloor, 0, (int) Math.floor(f3), 5)), new i41((((long) Math.round(f)) & 4294967295L) | (((long) Math.round(f2)) << 32)));
                        } else {
                            i = size2;
                            i2 = i5;
                            r32Var = null;
                        }
                        if (r32Var != null) {
                            arrayList3.add(r32Var);
                        }
                        i5 = i2 + 1;
                        size2 = i;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    Object obj4 = list.get(i6);
                    if (((xm1) obj4).E() instanceof zg3) {
                        arrayList4.add(obj4);
                    }
                }
                return en1Var.I0(m30.i(j), m30.h(j), oi0Var, new er1(25, arrayList, s51.j(arrayList4, (cs0) obj)));
        }
    }
}
