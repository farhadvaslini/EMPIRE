package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wc1 {
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public wc1(int i) {
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.a = b32.w(bool);
                this.b = new z32(1.0f);
                this.c = b32.w(bool);
                this.d = new z32(1.0f);
                this.e = b32.w(bool);
                this.f = b32.w(new wj3(wj3.b));
                this.g = b32.w(bool);
                this.h = b32.w(new wx(wx.f));
                break;
            default:
                long[] jArr = nr2.a;
                this.a = new is1();
                js1 js1Var = or2.a;
                this.c = new js1();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                this.g = new ArrayList();
                this.h = new ArrayList();
                break;
        }
    }

    public static int e(int[] iArr, fe1 fe1Var) {
        fe1Var.getClass();
        int i = fe1Var.l + fe1Var.m + iArr[0];
        iArr[0] = i;
        return Math.max(0, i);
    }

    public long a() {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        nc2.u(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(int i, int i2, ArrayList arrayList, h9 h9Var, ce1 ce1Var, boolean z, boolean z2, int i3, int i4) throws Throwable {
        ArrayList arrayList2;
        ArrayList arrayList3;
        Throwable th;
        is1 is1Var;
        int i5;
        wc1 wc1Var;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        ArrayList arrayList4 = (ArrayList) this.e;
        ArrayList arrayList5 = (ArrayList) this.d;
        js1 js1Var = (js1) this.c;
        Object obj = this.a;
        is1 is1Var2 = (is1) obj;
        ArrayList arrayList6 = (ArrayList) this.g;
        ArrayList arrayList7 = (ArrayList) this.f;
        h9 h9Var2 = (h9) this.b;
        this.b = h9Var;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            fe1 fe1Var = (fe1) arrayList.get(i9);
            Object obj2 = obj;
            int i10 = size;
            int i11 = 0;
            for (int size2 = fe1Var.b.size(); i11 < size2; size2 = size2) {
                ((i62) fe1Var.b.get(i11)).E();
                i11++;
            }
            i9++;
            size = i10;
            obj = obj2;
        }
        Object obj3 = obj;
        if (is1Var2.i()) {
            c();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr3 = is1Var2.b;
        long[] jArr = is1Var2.a;
        int i12 = 2;
        int length = jArr.length - 2;
        boolean z4 = z3;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j = jArr[i13];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j & 255) < 128) {
                            i8 = i15;
                            js1Var.a(objArr3[(i13 << 3) + i15]);
                        } else {
                            i8 = i15;
                        }
                        j >>= 8;
                        i15 = i8 + 1;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 == length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i16 = 0; i16 < size3; i16++) {
            fe1 fe1Var2 = (fe1) arrayList.get(i16);
            Object obj4 = fe1Var2.g;
            List list = fe1Var2.b;
            js1Var.l(obj4);
            int size4 = list.size();
            for (int i17 = 0; i17 < size4; i17++) {
                ((i62) list.get(i17)).E();
            }
            nc2.u(((is1) obj3).k(fe1Var2.g));
        }
        int[] iArr = new int[1];
        if (z4 && h9Var2 != null) {
            if (arrayList5.isEmpty()) {
                i7 = 0;
            } else {
                if (arrayList5.size() > 1) {
                    ux.e0(arrayList5, new vc1(h9Var2, i12));
                }
                if (arrayList5.size() > 0) {
                    fe1 fe1Var3 = (fe1) arrayList5.get(0);
                    e(iArr, fe1Var3);
                    Object objG = is1Var2.g(fe1Var3.g);
                    objG.getClass();
                    nc2.u(objG);
                    fe1Var3.b(0);
                    throw null;
                }
                i7 = 0;
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    ux.e0(arrayList4, new vc1(h9Var2, i7));
                }
                if (arrayList4.size() > 0) {
                    fe1 fe1Var4 = (fe1) arrayList4.get(i7);
                    e(iArr, fe1Var4);
                    Object objG2 = is1Var2.g(fe1Var4.g);
                    objG2.getClass();
                    nc2.u(objG2);
                    fe1Var4.b(i7);
                    throw null;
                }
                Arrays.fill(iArr, i7, 1, i7);
            }
        }
        Object[] objArr4 = js1Var.b;
        long[] jArr2 = js1Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            th = null;
            is1Var = is1Var2;
            int i18 = 0;
            while (true) {
                long j2 = jArr2[i18];
                arrayList2 = arrayList4;
                arrayList3 = arrayList5;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j2 & 255) < 128) {
                            objArr2 = objArr4;
                            nc2.u(is1Var.g(objArr2[(i18 << 3) + i20]));
                        } else {
                            objArr2 = objArr4;
                        }
                        j2 >>= 8;
                        i20++;
                        objArr4 = objArr2;
                    }
                    objArr = objArr4;
                    if (i19 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr4;
                }
                if (i18 == length2) {
                    break;
                }
                i18++;
                arrayList4 = arrayList2;
                arrayList5 = arrayList3;
                objArr4 = objArr;
            }
        } else {
            arrayList2 = arrayList4;
            arrayList3 = arrayList5;
            th = null;
            is1Var = is1Var2;
        }
        if (arrayList7.isEmpty()) {
            i5 = 1;
            wc1Var = this;
            i6 = i;
        } else {
            if (arrayList7.size() > 1) {
                ux.e0(arrayList7, new vc1(h9Var, 3));
            }
            int size5 = arrayList7.size();
            for (int i21 = 0; i21 < size5; i21++) {
                fe1 fe1Var5 = (fe1) arrayList7.get(i21);
                Object objG3 = is1Var.g(fe1Var5.g);
                objG3.getClass();
                nc2.u(objG3);
                fe1Var5.d((z ? (int) (((fe1) qx.q0(arrayList)).b(0) & 4294967295L) : 0) - e(iArr, fe1Var5), i, i2);
                if (z4) {
                    d(fe1Var5, true);
                    throw th;
                }
            }
            wc1Var = this;
            i6 = i;
            i5 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > i5) {
                ux.e0(arrayList6, new vc1(h9Var, i5));
            }
            int size6 = arrayList6.size();
            for (int i22 = 0; i22 < size6; i22++) {
                fe1 fe1Var6 = (fe1) arrayList6.get(i22);
                Object objG4 = is1Var.g(fe1Var6.g);
                objG4.getClass();
                nc2.u(objG4);
                fe1Var6.d((0 - (fe1Var6.l + fe1Var6.m)) + e(iArr, fe1Var6), i6, i2);
                if (z4) {
                    wc1Var.d(fe1Var6, true);
                    throw th;
                }
            }
        }
        Collections.reverse(arrayList7);
        arrayList.addAll(0, arrayList7);
        arrayList.addAll(arrayList6);
        arrayList3.clear();
        arrayList2.clear();
        arrayList7.clear();
        arrayList6.clear();
        js1Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c() {
        is1 is1Var = (is1) this.a;
        if (is1Var.j()) {
            Object[] objArr = is1Var.c;
            long[] jArr = is1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                nc2.u(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            is1Var.a();
        }
    }

    public void d(fe1 fe1Var, boolean z) {
        Object objG = ((is1) this.a).g(fe1Var.g);
        objG.getClass();
        nc2.u(objG);
        throw null;
    }
}
