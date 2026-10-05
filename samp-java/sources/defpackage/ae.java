package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ae implements cn1 {
    public final ie a;
    public boolean b;

    public ae(ie ieVar) {
        this.a = ieVar;
    }

    @Override // defpackage.cn1
    public final int a(k51 k51Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iY = ((xm1) list.get(0)).y(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iY2 = ((xm1) list.get(i2)).y(i);
                if (iY2 > iY) {
                    iY = iY2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iY;
    }

    @Override // defpackage.cn1
    public final int b(k51 k51Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iU0 = ((xm1) list.get(0)).u0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iU02 = ((xm1) list.get(i2)).u0(i);
                if (iU02 > iU0) {
                    iU0 = iU02;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iU0;
    }

    @Override // defpackage.cn1
    public final dn1 c(en1 en1Var, List list, long j) {
        d42 d42Var = this.a.b;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            i62 i62VarT = ((xm1) list.get(i)).t(j);
            iMax = Math.max(iMax, i62VarT.f);
            iMax2 = Math.max(iMax2, i62VarT.g);
            arrayList.add(i62VarT);
        }
        if (en1Var.M()) {
            this.b = true;
            d42Var.setValue(new p41((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            d42Var.setValue(new p41((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return en1Var.I0(iMax, iMax2, oi0.f, new kd(1, arrayList));
    }

    @Override // defpackage.cn1
    public final int d(k51 k51Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iX0 = ((xm1) list.get(0)).x0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iX02 = ((xm1) list.get(i2)).x0(i);
                if (iX02 > iX0) {
                    iX0 = iX02;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iX0;
    }

    @Override // defpackage.cn1
    public final int e(k51 k51Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iM0 = ((xm1) list.get(0)).m0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iM02 = ((xm1) list.get(i2)).m0(i);
                if (iM02 > iM0) {
                    iM0 = iM02;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iM0;
    }
}
