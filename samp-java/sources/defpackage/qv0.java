package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qv0 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final or1 e;
    public final xb3 f;

    public qv0(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            yb2.a("Invalid start index");
        }
        this.d = new ArrayList();
        or1 or1Var = new or1();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            g71 g71Var = (g71) this.a.get(i3);
            int i4 = g71Var.c;
            int i5 = g71Var.d;
            or1Var.i(i4, new cx0(i3, i2, i5));
            i2 += i5;
        }
        this.e = or1Var;
        this.f = new xb3(new p90(1, this));
    }

    public final boolean a(int i, int i2) {
        cx0 cx0Var;
        int i3;
        int i4;
        or1 or1Var = this.e;
        cx0 cx0Var2 = (cx0) or1Var.b(i);
        if (cx0Var2 == null) {
            return false;
        }
        int i5 = cx0Var2.b;
        int i6 = i2 - cx0Var2.c;
        cx0Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = or1Var.c;
        long[] jArr = or1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (cx0Var = (cx0) objArr[(i7 << 3) + i9]).b) >= i5 && cx0Var != cx0Var2 && (i4 = i3 + i6) >= 0) {
                        cx0Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
