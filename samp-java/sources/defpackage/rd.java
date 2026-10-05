package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rd implements cn1 {
    public final zd a;
    public i62[] b;
    public i62[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final qd h = new qd(this, 1);
    public final qd i = new qd(this, 0);

    public rd(zd zdVar) {
        this.a = zdVar;
    }

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
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((xm1) list.get(0)).u0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((xm1) list.get(i2)).u0(i));
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
    public final dn1 c(en1 en1Var, List list, long j) {
        r32 r32Var;
        int size = list.size();
        i62[] i62VarArr = new i62[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            xm1 xm1Var = (xm1) list.get(i);
            Object objE = xm1Var.E();
            ud udVar = objE instanceof ud ? (ud) objE : null;
            if (udVar != null && ((Boolean) udVar.a.getValue()).booleanValue()) {
                i62 i62VarT = xm1Var.t(j);
                long j3 = (((long) i62VarT.g) & 4294967295L) | (((long) i62VarT.f) << 32);
                i62VarArr[i] = i62VarT;
                j2 = j3;
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            xm1 xm1Var2 = (xm1) list.get(i2);
            if (i62VarArr[i2] == null) {
                i62VarArr[i2] = xm1Var2.t(j);
            }
        }
        if (en1Var.M()) {
            r32Var = new r32(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                i62 i62Var = i62VarArr[i5];
                if (i62Var != null) {
                    Object objE2 = ((xm1) list.get(i5)).E();
                    ud udVar2 = objE2 instanceof ud ? (ud) objE2 : null;
                    if (udVar2 == null || !((Boolean) udVar2.b.getValue()).booleanValue()) {
                        int i6 = i62Var.f;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = i62Var.g;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            r32Var = new r32(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) r32Var.f).intValue();
        int iIntValue2 = ((Number) r32Var.g).intValue();
        boolean zM = en1Var.M();
        oi0 oi0Var = oi0.f;
        if (zM) {
            this.b = i62VarArr;
            this.d = iIntValue;
            this.f = iIntValue2;
            return en1Var.I0(iIntValue, iIntValue2, oi0Var, this.h);
        }
        this.a.c.setValue(new p41((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        this.c = i62VarArr;
        this.e = iIntValue;
        this.g = iIntValue2;
        return en1Var.I0(iIntValue, iIntValue2, oi0Var, this.i);
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
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((xm1) list.get(0)).m0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((xm1) list.get(i2)).m0(i));
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
}
