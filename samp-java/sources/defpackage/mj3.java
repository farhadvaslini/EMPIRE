package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mj3 implements cn1 {
    public final ym0 a;
    public final float b;

    public mj3(ym0 ym0Var, float f) {
        this.a = ym0Var;
        this.b = f;
    }

    @Override // defpackage.cn1
    public final int a(k51 k51Var, List list, int i) {
        Integer numValueOf;
        int iP0 = k51Var.p0(this.b);
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
        return Math.max(iP0, numValueOf != null ? numValueOf.intValue() : 0);
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
    public final dn1 c(final en1 en1Var, List list, final long j) {
        int i;
        final mj3 mj3Var = this;
        int size = list.size();
        final int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            xm1 xm1Var = (xm1) list.get(i3);
            if (s51.n(r51.s(xm1Var), "navigationIcon")) {
                final i62 i62VarT = xm1Var.t(m30.b(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    xm1 xm1Var2 = (xm1) list.get(i4);
                    if (s51.n(r51.s(xm1Var2), "actionIcons")) {
                        final i62 i62VarT2 = xm1Var2.t(m30.b(j, 0, 0, 0, 0, 14));
                        if (m30.i(j) == Integer.MAX_VALUE) {
                            i = m30.i(j);
                        } else {
                            i = (m30.i(j) - i62VarT.f) - i62VarT2.f;
                            if (i < 0) {
                                i = 0;
                            }
                        }
                        int i5 = i;
                        int size3 = list.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            xm1 xm1Var3 = (xm1) list.get(i6);
                            if (s51.n(r51.s(xm1Var3), "title")) {
                                final i62 i62VarT3 = xm1Var3.t(m30.b(j, 0, i5, 0, 0, 12));
                                ry0 ry0Var = l5.b;
                                final int iZ0 = i62VarT3.z0(ry0Var) != Integer.MIN_VALUE ? i62VarT3.z0(ry0Var) : 0;
                                float fA = mj3Var.a.a();
                                int iM = Float.isNaN(fA) ? 0 : vm1.M(fA);
                                final int iMax = Math.max(en1Var.p0(mj3Var.b), i62VarT3.g);
                                if (m30.h(j) == Integer.MAX_VALUE) {
                                    i2 = iMax;
                                } else {
                                    int i7 = iM + iMax;
                                    if (i7 >= 0) {
                                        i2 = i7;
                                    }
                                }
                                return en1Var.I0(m30.i(j), i2, oi0.f, new ns0(i2, i62VarT3, i62VarT2, j, en1Var, mj3Var, iZ0, iMax) { // from class: lj3
                                    public final /* synthetic */ int g;
                                    public final /* synthetic */ i62 h;
                                    public final /* synthetic */ i62 i;
                                    public final /* synthetic */ long j;
                                    public final /* synthetic */ en1 k;

                                    @Override // defpackage.ns0
                                    public final Object h(Object obj) {
                                        int i8;
                                        h62 h62Var = (h62) obj;
                                        i62 i62Var = this.f;
                                        int i9 = i62Var.g;
                                        int i10 = this.g;
                                        h62.F(h62Var, i62Var, 0, (i10 - i9) / 2);
                                        int iMax2 = Math.max(this.k.p0(tf.c), i62Var.f);
                                        i62 i62Var2 = this.i;
                                        int i11 = i62Var2.f;
                                        i62 i62Var3 = this.h;
                                        int i12 = i62Var3.f;
                                        long j2 = this.j;
                                        int iRound = Math.round((1.0f - 1.0f) * ((m30.i(j2) - i12) / 2.0f));
                                        if (iRound >= iMax2) {
                                            if (i62Var3.f + iRound > m30.i(j2) - i11) {
                                                i8 = (m30.i(j2) - i11) - (i62Var3.f + iRound);
                                            }
                                            h62.F(h62Var, i62Var3, iRound, (i10 - i62Var3.g) / 2);
                                            h62.F(h62Var, i62Var2, m30.i(j2) - i62Var2.f, (i10 - i62Var2.g) / 2);
                                            return dm3.a;
                                        }
                                        i8 = iMax2 - iRound;
                                        iRound += i8;
                                        h62.F(h62Var, i62Var3, iRound, (i10 - i62Var3.g) / 2);
                                        h62.F(h62Var, i62Var2, m30.i(j2) - i62Var2.f, (i10 - i62Var2.g) / 2);
                                        return dm3.a;
                                    }
                                });
                            }
                            i6++;
                            mj3Var = this;
                        }
                        throw nc2.x("Collection contains no element matching the predicate.");
                    }
                    i4++;
                    mj3Var = this;
                }
                throw nc2.x("Collection contains no element matching the predicate.");
            }
            i3++;
            mj3Var = this;
        }
        throw nc2.x("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.cn1
    public final int d(k51 k51Var, List list, int i) {
        Integer numValueOf;
        int iP0 = k51Var.p0(this.b);
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
        return Math.max(iP0, numValueOf != null ? numValueOf.intValue() : 0);
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
