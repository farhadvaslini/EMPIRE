package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class wj2 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ wj2(int i, l73 l73Var, qt0 qt0Var) {
        this.f = 2;
        this.g = i;
        this.h = l73Var;
        this.i = qt0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        f20 f20Var;
        dm3 dm3Var;
        f20 f20Var2;
        dm3 dm3Var2;
        int i;
        int i2 = this.f;
        int i3 = 2;
        dm3 dm3Var3 = dm3.a;
        int i4 = 0;
        int i5 = this.g;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i2) {
            case 0:
                xj2 xj2Var = (xj2) obj3;
                wr1 wr1Var = (wr1) obj2;
                f20 f20Var3 = (f20) obj;
                if (xj2Var.e == i5 && s51.n(wr1Var, xj2Var.f) && (f20Var3 instanceof l20)) {
                    long[] jArr = wr1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j = jArr[i6];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8;
                                int i8 = 8 - ((~(i6 - length)) >>> 31);
                                int i9 = i4;
                                while (i9 < i8) {
                                    if ((255 & j) < 128) {
                                        int i10 = (i6 << 3) + i9;
                                        Object obj4 = wr1Var.b[i10];
                                        boolean z = wr1Var.c[i10] != i5;
                                        if (z) {
                                            i = i7;
                                            l20 l20Var = (l20) f20Var3;
                                            f20Var2 = f20Var3;
                                            is1 is1Var = l20Var.l;
                                            n32.w(is1Var, obj4, xj2Var);
                                            dm3Var2 = dm3Var3;
                                            if (obj4 instanceof cb0) {
                                                cb0 cb0Var = (cb0) obj4;
                                                if (!is1Var.c(cb0Var)) {
                                                    n32.x(l20Var.o, cb0Var);
                                                }
                                                is1 is1Var2 = xj2Var.g;
                                                if (is1Var2 != null) {
                                                    is1Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            f20Var2 = f20Var3;
                                            dm3Var2 = dm3Var3;
                                            i = i7;
                                        }
                                        if (z) {
                                            wr1Var.f(i10);
                                        }
                                    } else {
                                        f20Var2 = f20Var3;
                                        dm3Var2 = dm3Var3;
                                        i = i7;
                                    }
                                    j >>= i;
                                    i9++;
                                    i7 = i;
                                    f20Var3 = f20Var2;
                                    dm3Var3 = dm3Var2;
                                }
                                f20Var = f20Var3;
                                dm3Var = dm3Var3;
                                if (i8 != i7) {
                                }
                            } else {
                                f20Var = f20Var3;
                                dm3Var = dm3Var3;
                            }
                            if (i6 != length) {
                                i6++;
                                f20Var3 = f20Var;
                                dm3Var3 = dm3Var;
                                i4 = 0;
                            }
                        }
                    }
                }
                break;
            case 1:
                as2 as2Var = (as2) obj3;
                i62 i62Var = (i62) obj2;
                h62 h62Var = (h62) obj;
                int iG = as2Var.t.a.g();
                if (iG < 0) {
                    iG = 0;
                }
                if (iG <= i5) {
                    i5 = iG;
                }
                int i11 = -i5;
                boolean z2 = as2Var.u;
                int i12 = z2 ? 0 : i11;
                if (!z2) {
                    i11 = 0;
                }
                h62Var.f = true;
                h62.H(h62Var, i62Var, i12, i11);
                h62Var.f = false;
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                l73 l73Var = (l73) obj3;
                qt0 qt0Var = (qt0) obj2;
                ((Boolean) obj).getClass();
                boolean z3 = !((Boolean) l73Var.get(i5)).booleanValue();
                l73Var.set(i5, Boolean.valueOf(z3));
                if (i5 == 0) {
                    i3 = 0;
                } else if (i5 == 1) {
                    i3 = 1;
                } else if (i5 != 2) {
                    i3 = 3;
                    if (i5 != 3) {
                        i3 = 4;
                        if (i5 == 4) {
                        }
                    }
                }
                qt0Var.f(Integer.valueOf(i3), Boolean.valueOf(z3));
                break;
            default:
                zp3 zp3Var = (zp3) obj3;
                i62 i62Var2 = (i62) obj2;
                h62 h62Var2 = (h62) obj;
                int i13 = zp3Var.b;
                lf3 lf3Var = zp3Var.a;
                xj3 xj3Var = zp3Var.c;
                qg3 qg3Var = (qg3) zp3Var.d.a();
                lf3Var.a(t02.f, y02.d(h62Var2, i13, xj3Var, qg3Var != null ? qg3Var.a : null, false, i62Var2.f), i5, i62Var2.g);
                h62.F(h62Var2, i62Var2, 0, Math.round(-lf3Var.a.g()));
                break;
        }
        return dm3Var3;
    }

    public /* synthetic */ wj2(int i, int i2, Object obj, Object obj2) {
        this.f = i2;
        this.h = obj;
        this.g = i;
        this.i = obj2;
    }

    public /* synthetic */ wj2(zp3 zp3Var, i62 i62Var, int i) {
        this.f = 3;
        this.h = zp3Var;
        this.i = i62Var;
        this.g = i;
    }
}
