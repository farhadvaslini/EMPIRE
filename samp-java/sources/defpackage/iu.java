package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class iu implements cn1 {
    @Override // defpackage.cn1
    public final int a(k51 k51Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((xm1) list.get(0)).y(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((xm1) list.get(i2)).y(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cn1
    public final int b(k51 k51Var, List list, int i) {
        int size = list.size();
        int iU0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iU0 += ((xm1) list.get(i2)).u0(i);
        }
        return iU0;
    }

    @Override // defpackage.cn1
    public final dn1 c(en1 en1Var, List list, long j) {
        Object obj;
        long j2;
        i62 i62VarT;
        Object obj2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (s51.n(r51.s((xm1) obj), "leadingIcon")) {
                break;
            }
            i++;
        }
        xm1 xm1Var = (xm1) obj;
        if (xm1Var != null) {
            j2 = j;
            i62VarT = xm1Var.t(m30.b(j2, 0, 0, 0, 0, 10));
        } else {
            j2 = j;
            i62VarT = null;
        }
        int i2 = i62VarT != null ? i62VarT.f : 0;
        int i3 = i62VarT != null ? i62VarT.g : 0;
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (s51.n(r51.s((xm1) obj2), "trailingIcon")) {
                break;
            }
            i4++;
        }
        xm1 xm1Var2 = (xm1) obj2;
        final i62 i62VarT2 = xm1Var2 != null ? xm1Var2.t(m30.b(j2, 0, 0, 0, 0, 10)) : null;
        int i5 = i62VarT2 != null ? i62VarT2.f : 0;
        final int i6 = i62VarT2 != null ? i62VarT2.g : 0;
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            xm1 xm1Var3 = (xm1) list.get(i7);
            if (s51.n(r51.s(xm1Var3), "label")) {
                final i62 i62VarT3 = xm1Var3.t(n30.j(-(i2 + i5), 0, 2, j2));
                int i8 = i62VarT3.f + i2 + i5;
                final int iMax = Math.max(i3, Math.max(i62VarT3.g, i6));
                final i62 i62Var = i62VarT;
                final int i9 = i2;
                final int i10 = i3;
                return en1Var.I0(i8, iMax, oi0.f, new ns0() { // from class: hu
                    @Override // defpackage.ns0
                    public final Object h(Object obj3) {
                        h62 h62Var = (h62) obj3;
                        i62 i62Var2 = i62Var;
                        int i11 = iMax;
                        if (i62Var2 != null) {
                            h62.F(h62Var, i62Var2, 0, Math.round(((i11 - i10) / 2.0f) * 1.0f));
                        }
                        i62 i62Var3 = i62VarT3;
                        int i12 = i9;
                        h62.F(h62Var, i62Var3, i12, 0);
                        i62 i62Var4 = i62VarT2;
                        if (i62Var4 != null) {
                            h62.F(h62Var, i62Var4, i12 + i62Var3.f, Math.round(((i11 - i6) / 2.0f) * 1.0f));
                        }
                        return dm3.a;
                    }
                });
            }
        }
        throw nc2.x("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.cn1
    public final int d(k51 k51Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((xm1) list.get(0)).x0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((xm1) list.get(i2)).x0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cn1
    public final int e(k51 k51Var, List list, int i) {
        int size = list.size();
        int iM0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM0 += ((xm1) list.get(i2)).m0(i);
        }
        return iM0;
    }
}
