package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fn1 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final um e;
    public final bb1 f;
    public final boolean g = false;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public fn1(int i, int i2, List list, long j, Object obj, um umVar, bb1 bb1Var) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = umVar;
        this.f = bb1Var;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i62 i62Var = (i62) list.get(i3);
            iMax = Math.max(iMax, !this.g ? i62Var.g : i62Var.f);
        }
        this.h = iMax;
        this.i = new int[this.b.size() * 2];
        this.k = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.j += i;
        int[] iArr = this.i;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.g;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.j = i;
        boolean z = this.g;
        this.k = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            i62 i62Var = (i62) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.i;
            if (z) {
                iArr[i6] = Math.round((1.0f + (this.f != bb1.f ? 0.0f * (-1.0f) : 0.0f)) * ((i2 - i62Var.f) / 2.0f));
                iArr[i6 + 1] = i;
                i4 = i62Var.g;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                um umVar = this.e;
                if (umVar == null) {
                    throw nc2.y("null verticalAlignment");
                }
                iArr[i7] = umVar.a(i62Var.g, i3);
                i4 = i62Var.f;
            }
            i += i4;
        }
    }
}
