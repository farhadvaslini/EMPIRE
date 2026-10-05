package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zz1 extends o02 {
    public static final zz1 c = new zz1(1, 0, 2);

    @Override // defpackage.o02
    public final void a(lx lxVar, wi wiVar, m53 m53Var, zk2 zk2Var, p02 p02Var) {
        int[] iArr;
        iv0 iv0Var;
        int iC;
        int iD = lxVar.d(0);
        if (m53Var.n != 0) {
            e20.a("Cannot move a group while inserting");
        }
        if (iD < 0) {
            e20.a("Parameter offset is out of bounds");
        }
        if (iD == 0) {
            return;
        }
        int i = m53Var.t;
        int i2 = m53Var.v;
        int i3 = m53Var.u;
        int i4 = i;
        while (true) {
            iArr = m53Var.b;
            if (iD <= 0) {
                break;
            }
            i4 += iArr[(m53Var.r(i4) * 5) + 3];
            if (i4 > i3) {
                e20.a("Parameter offset is out of bounds");
            }
            iD--;
        }
        int i5 = iArr[(m53Var.r(i4) * 5) + 3];
        int iG = m53Var.g(m53Var.b, m53Var.r(m53Var.t));
        int iG2 = m53Var.g(m53Var.b, m53Var.r(i4));
        int i6 = i4 + i5;
        int iG3 = m53Var.g(m53Var.b, m53Var.r(i6));
        int i7 = iG3 - iG2;
        m53Var.x(i7, Math.max(m53Var.t - 1, 0));
        m53Var.w(i5);
        int[] iArr2 = m53Var.b;
        int iR = m53Var.r(i6) * 5;
        uj.G(m53Var.r(i) * 5, iR, (i5 * 5) + iR, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = m53Var.c;
            int iH = m53Var.h(iG2 + i7);
            System.arraycopy(objArr, iH, objArr, iG, m53Var.h(iG3 + i7) - iH);
        }
        int i8 = iG2 + i7;
        int i9 = i8 - iG;
        int i10 = m53Var.k;
        int i11 = m53Var.l;
        int length = m53Var.c.length;
        int i12 = m53Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iR2 = m53Var.r(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iR2 * 5) + 4] = m53.i(m53.i(m53Var.g(iArr2, iR2) - i15, i12 < iR2 ? 0 : i10, i11, length), m53Var.k, m53Var.l, m53Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iP = m53Var.p();
        int iA = l53.a(m53Var.d, i6, iP);
        ArrayList arrayList = new ArrayList();
        if (iA >= 0) {
            while (iA < m53Var.d.size() && (iC = m53Var.c((iv0Var = (iv0) m53Var.d.get(iA)))) >= i6 && iC < i16) {
                arrayList.add(iv0Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            iv0 iv0Var2 = (iv0) arrayList.get(i18);
            int iC2 = m53Var.c(iv0Var2) + i17;
            if (iC2 >= m53Var.g) {
                iv0Var2.a = -(iP - iC2);
            } else {
                iv0Var2.a = iC2;
            }
            m53Var.d.add(l53.a(m53Var.d, iC2, iP), iv0Var2);
        }
        if (m53Var.I(i6, i5)) {
            e20.a("Unexpectedly removed anchors");
        }
        m53Var.m(i2, m53Var.u, i);
        if (i7 > 0) {
            m53Var.J(i8, i7, i6 - 1);
        }
    }
}
