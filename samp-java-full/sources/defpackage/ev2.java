package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public static final ArrayList b(vu2 vu2Var, s sVar, s sVar2, List list) {
        int i;
        or1 or1Var = h41.a;
        or1 or1Var2 = new or1();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((vu2) list.get(i2), arrayList, sVar, sVar2, or1Var2);
        }
        int i3 = 1;
        char c = vu2Var.c.F == bb1.g ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                vu2 vu2Var2 = (vu2) arrayList.get(i4);
                if (i4 != 0) {
                    float f = vu2Var2.h().b;
                    float f2 = vu2Var2.h().d;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            jk2 jk2Var = (jk2) ((r32) arrayList2.get(i6)).f;
                            float f3 = jk2Var.b;
                            i = i3;
                            float f4 = jk2Var.d;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new r32(new jk2(Math.max(jk2Var.a, 0.0f), Math.max(jk2Var.b, f), Math.min(jk2Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((r32) arrayList2.get(i6)).g));
                                ((List) ((r32) arrayList2.get(i6)).g).add(vu2Var2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                    } else {
                        i = i3;
                    }
                    arrayList2.add(new r32(vu2Var2.h(), vr.N(vu2Var2)));
                    if (i4 == size2) {
                        break;
                    }
                    i4++;
                    i3 = i;
                }
            }
        }
        ux.e0(arrayList2, up0.f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            r32 r32Var = (r32) arrayList2.get(i8);
            ux.e0((List) r32Var.g, comparator);
            arrayList3.addAll((Collection) r32Var.g);
        }
        ux.e0(arrayList3, new ya(6));
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) or1Var2.b(((vu2) arrayList3.get(size5)).f);
            if (list2 != null) {
                if (((Boolean) sVar2.h(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
