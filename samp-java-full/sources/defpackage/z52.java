package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class z52 extends g0 implements Collection, u61 {
    public j0 f;
    public Object[] g;
    public Object[] h;
    public int i;
    public h01 j = new h01(10);
    public Object[] k;
    public Object[] l;
    public int m;

    public z52(j0 j0Var, Object[] objArr, Object[] objArr2, int i) {
        this.f = j0Var;
        this.g = objArr;
        this.h = objArr2;
        this.i = i;
        this.k = objArr;
        this.l = objArr2;
        this.m = j0Var.a();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr, int i, int i2, p3 p3Var) {
        int iE = t22.E(i2, i);
        if (i == 0) {
            Object obj = objArr[iE];
            Object[] objArrL = l(objArr);
            uj.J(objArr, objArrL, iE, iE + 1, 32);
            objArrL[31] = p3Var.a;
            p3Var.a = obj;
            return objArrL;
        }
        int iE2 = objArr[31] == null ? t22.E(C() - 1, i) : 31;
        Object[] objArrL2 = l(objArr);
        int i3 = i - 5;
        int i4 = iE + 1;
        if (i4 <= iE2) {
            while (true) {
                Object obj2 = objArrL2[iE2];
                obj2.getClass();
                objArrL2[iE2] = A((Object[]) obj2, i3, 0, p3Var);
                if (iE2 == i4) {
                    break;
                }
                iE2--;
            }
        }
        Object obj3 = objArrL2[iE];
        obj3.getClass();
        objArrL2[iE] = A((Object[]) obj3, i3, i2, p3Var);
        return objArrL2;
    }

    public final Object B(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.m - i;
        Object[] objArr2 = this.l;
        if (i4 == 1) {
            Object obj = objArr2[0];
            r(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrL = l(objArr2);
        uj.J(objArr2, objArrL, i3, i3 + 1, i4);
        objArrL[i4 - 1] = null;
        this.k = objArr;
        this.l = objArrL;
        this.m = (i + i4) - 1;
        this.i = i2;
        return obj2;
    }

    public final int C() {
        int i = this.m;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] D(Object[] objArr, int i, int i2, Object obj, p3 p3Var) {
        int iE = t22.E(i2, i);
        Object[] objArrL = l(objArr);
        if (i != 0) {
            Object obj2 = objArrL[iE];
            obj2.getClass();
            objArrL[iE] = D((Object[]) obj2, i - 5, i2, obj, p3Var);
            return objArrL;
        }
        if (objArrL != objArr) {
            ((AbstractList) this).modCount++;
        }
        p3Var.a = objArrL[iE];
        objArrL[iE] = obj;
        return objArrL;
    }

    public final void E(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrN;
        if (i3 < 1) {
            yb2.a("requires at least one nullBuffer");
        }
        Object[] objArrL = l(objArr);
        objArr2[0] = objArrL;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            uj.J(objArrL, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrN = objArrL;
            } else {
                objArrN = n();
                i3--;
                objArr2[i3] = objArrN;
            }
            int i7 = i2 - i6;
            uj.J(objArrL, objArr3, 0, i7, i2);
            uj.J(objArrL, objArrN, size + 1, i4, i7);
            objArr3 = objArrN;
        }
        Iterator it = collection.iterator();
        e(objArrL, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrN2 = n();
            e(objArrN2, 0, it);
            objArr2[i8] = objArrN2;
        }
        e(objArr3, 0, it);
    }

    public final int F() {
        int i = this.m;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.g0
    public final int a() {
        return this.m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ur.q(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iC = C();
        if (i >= iC) {
            i(this.k, i - iC, obj);
            return;
        }
        p3 p3Var = new p3(null);
        Object[] objArr = this.k;
        objArr.getClass();
        i(h(objArr, this.i, i, obj, p3Var), 0, p3Var.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrN;
        ur.q(i, this.m);
        if (i == this.m) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.m - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.l;
            Object[] objArrL = l(objArr);
            uj.J(objArr, objArrL, size2 + 1, i3, F());
            e(objArrL, i3, collection.iterator());
            this.l = objArrL;
            this.m = collection.size() + this.m;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iF = F();
        int size3 = collection.size() + this.m;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= C()) {
            objArrN = n();
            collection2 = collection;
            E(collection2, i, this.l, iF, objArr2, size, objArrN);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.l;
            if (size3 > iF) {
                int i4 = size3 - iF;
                Object[] objArrM = m(i4, objArr3);
                g(collection2, i, i4, objArr2, size, objArrM);
                objArr2 = objArr2;
                objArrN = objArrM;
            } else {
                objArrN = n();
                int i5 = iF - size3;
                uj.J(objArr3, objArrN, 0, i5, iF);
                int i6 = 32 - i5;
                Object[] objArrM2 = m(i6, this.l);
                int i7 = size - 1;
                objArr2[i7] = objArrM2;
                g(collection2, i, i6, objArr2, i7, objArrM2);
                collection2 = collection2;
            }
        }
        this.k = t(this.k, i2, objArr2);
        this.l = objArrN;
        this.m = collection2.size() + this.m;
        return true;
    }

    @Override // defpackage.g0
    public final Object b(int i) {
        ur.p(i, a());
        ((AbstractList) this).modCount++;
        int iC = C();
        if (i >= iC) {
            return B(this.k, iC, this.i, i - iC);
        }
        p3 p3Var = new p3(this.l[0]);
        Object[] objArr = this.k;
        objArr.getClass();
        B(A(objArr, this.i, i, p3Var), iC, this.i, 0);
        return p3Var.a;
    }

    public final j0 c() {
        j0 n53Var;
        Object[] objArr = this.k;
        if (objArr == this.g && this.l == this.h) {
            n53Var = this.f;
        } else {
            this.j = new h01(10);
            this.g = objArr;
            Object[] objArr2 = this.l;
            this.h = objArr2;
            n53Var = objArr == null ? objArr2.length == 0 ? n53.g : new n53(Arrays.copyOf(objArr2, this.m)) : new y52(objArr, objArr2, this.m, this.i);
        }
        this.f = n53Var;
        return n53Var;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.k == null) {
            c.q("root is null");
            return;
        }
        int i4 = i >> 5;
        e0 e0VarK = k(C() >> 5);
        int i5 = i3;
        Object[] objArrM = objArr2;
        while (e0VarK.f - 1 != i4) {
            Object[] objArr3 = (Object[]) e0VarK.previous();
            uj.J(objArr3, objArrM, 0, 32 - i2, 32);
            objArrM = m(i2, objArr3);
            i5--;
            objArr[i5] = objArrM;
        }
        Object[] objArr4 = (Object[]) e0VarK.previous();
        int iC = i3 - (((C() >> 5) - 1) - i4);
        if (iC < i3) {
            objArr2 = objArr[iC];
            objArr2.getClass();
        }
        E(collection, i, objArr4, 32, objArr, iC, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        ur.p(i, a());
        if (C() <= i) {
            objArr = this.l;
        } else {
            Object[] objArr2 = this.k;
            objArr2.getClass();
            for (int i2 = this.i; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[t22.E(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] h(Object[] objArr, int i, int i2, Object obj, p3 p3Var) {
        Object obj2;
        int iE = t22.E(i2, i);
        if (i == 0) {
            p3Var.a = objArr[31];
            Object[] objArrL = l(objArr);
            uj.J(objArr, objArrL, iE + 1, iE, 31);
            objArrL[iE] = obj;
            return objArrL;
        }
        Object[] objArrL2 = l(objArr);
        int i3 = i - 5;
        Object obj3 = objArrL2[iE];
        obj3.getClass();
        objArrL2[iE] = h((Object[]) obj3, i3, i2, obj, p3Var);
        while (true) {
            iE++;
            if (iE >= 32 || (obj2 = objArrL2[iE]) == null) {
                break;
            }
            objArrL2[iE] = h((Object[]) obj2, i3, 0, p3Var.a, p3Var);
        }
        return objArrL2;
    }

    public final void i(Object[] objArr, int i, Object obj) {
        int iF = F();
        Object[] objArrL = l(this.l);
        Object[] objArr2 = this.l;
        if (iF >= 32) {
            Object obj2 = objArr2[31];
            uj.J(objArr2, objArrL, i + 1, i, 31);
            objArrL[i] = obj;
            u(objArr, objArrL, o(obj2));
            return;
        }
        uj.J(objArr2, objArrL, i + 1, i, iF);
        objArrL[i] = obj;
        this.k = objArr;
        this.l = objArrL;
        this.m++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean j(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.j;
    }

    public final e0 k(int i) {
        Object[] objArr = this.k;
        if (objArr == null) {
            c.q("Invalid root");
            return null;
        }
        int iC = C() >> 5;
        ur.q(i, iC);
        int i2 = this.i;
        return i2 == 0 ? new ip(i, objArr) : new sk3(objArr, i, iC, i2 / 5);
    }

    public final Object[] l(Object[] objArr) {
        if (objArr == null) {
            return n();
        }
        if (j(objArr)) {
            return objArr;
        }
        Object[] objArrN = n();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        uj.L(objArr, objArrN, 0, length, 6);
        return objArrN;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ur.q(i, this.m);
        return new b62(this, i);
    }

    public final Object[] m(int i, Object[] objArr) {
        if (j(objArr)) {
            uj.J(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] objArrN = n();
        uj.J(objArr, objArrN, i, 0, 32 - i);
        return objArrN;
    }

    public final Object[] n() {
        Object[] objArr = new Object[33];
        objArr[32] = this.j;
        return objArr;
    }

    public final Object[] o(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.j;
        return objArr;
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            yb2.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iE = t22.E(i, i2);
        Object obj = objArr[iE];
        obj.getClass();
        Object objP = p((Object[]) obj, i, i2 - 5);
        if (iE < 31) {
            int i3 = iE + 1;
            if (objArr[i3] != null) {
                if (j(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrN = n();
                uj.J(objArr, objArrN, 0, 0, i3);
                objArr = objArrN;
            }
        }
        if (objP == objArr[iE]) {
            return objArr;
        }
        Object[] objArrL = l(objArr);
        objArrL[iE] = objP;
        return objArrL;
    }

    public final Object[] q(Object[] objArr, int i, int i2, p3 p3Var) {
        Object[] objArrQ;
        int iE = t22.E(i2 - 1, i);
        if (i == 5) {
            p3Var.a = objArr[iE];
            objArrQ = null;
        } else {
            Object obj = objArr[iE];
            obj.getClass();
            objArrQ = q((Object[]) obj, i - 5, i2, p3Var);
        }
        if (objArrQ == null && iE == 0) {
            return null;
        }
        Object[] objArrL = l(objArr);
        objArrL[iE] = objArrQ;
        return objArrL;
    }

    public final void r(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.k = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.l = objArr;
            this.m = i;
            this.i = i2;
            return;
        }
        p3 p3Var = new p3(null);
        objArr.getClass();
        Object[] objArrQ = q(objArr, i2, i, p3Var);
        objArrQ.getClass();
        Object obj = p3Var.a;
        obj.getClass();
        this.l = (Object[]) obj;
        this.m = i;
        if (objArrQ[1] == null) {
            this.k = (Object[]) objArrQ[0];
            this.i = i2 - 5;
        } else {
            this.k = objArrQ;
            this.i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return z(new i0(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            yb2.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            yb2.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrL = l(objArr);
        int iE = t22.E(i, i2);
        int i3 = i2 - 5;
        objArrL[iE] = s((Object[]) objArrL[iE], i, i3, it);
        while (true) {
            iE++;
            if (iE >= 32 || !it.hasNext()) {
                break;
            }
            objArrL[iE] = s((Object[]) objArrL[iE], 0, i3, it);
        }
        return objArrL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ur.p(i, a());
        if (C() > i) {
            p3 p3Var = new p3(null);
            Object[] objArr = this.k;
            objArr.getClass();
            this.k = D(objArr, this.i, i, obj, p3Var);
            return p3Var.a;
        }
        Object[] objArrL = l(this.l);
        if (objArrL != this.l) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrL[i2];
        objArrL[i2] = obj;
        this.l = objArrL;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, Object[][] objArr2) {
        a0 a0Var = new a0(1, objArr2);
        int i2 = i >> 5;
        int i3 = this.i;
        Object[] objArrS = i2 < (1 << i3) ? s(objArr, i, i3, a0Var) : l(objArr);
        while (a0Var.hasNext()) {
            this.i += 5;
            objArrS = o(objArrS);
            int i4 = this.i;
            s(objArrS, 1 << i4, i4, a0Var);
        }
        return objArrS;
    }

    public final void u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.m;
        int i2 = i >> 5;
        int i3 = this.i;
        if (i2 > (1 << i3)) {
            this.k = v(this.i + 5, o(objArr), objArr2);
            this.l = objArr3;
            this.i += 5;
            this.m++;
            return;
        }
        if (objArr == null) {
            this.k = objArr2;
            this.l = objArr3;
            this.m = i + 1;
        } else {
            this.k = v(i3, objArr, objArr2);
            this.l = objArr3;
            this.m++;
        }
    }

    public final Object[] v(int i, Object[] objArr, Object[] objArr2) {
        int iE = t22.E(a() - 1, i);
        Object[] objArrL = l(objArr);
        if (i == 5) {
            objArrL[iE] = objArr2;
            return objArrL;
        }
        objArrL[iE] = v(i - 5, (Object[]) objArrL[iE], objArr2);
        return objArrL;
    }

    public final int w(ns0 ns0Var, Object[] objArr, int i, int i2, p3 p3Var, ArrayList arrayList, ArrayList arrayList2) {
        if (j(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = p3Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrN = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) ns0Var.h(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrN = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : n();
                    i2 = 0;
                }
                objArrN[i2] = obj2;
                i2++;
            }
        }
        p3Var.a = objArrN;
        if (objArr2 != objArrN) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int x(ns0 ns0Var, Object[] objArr, int i, p3 p3Var) {
        Object[] objArrL = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) ns0Var.h(obj)).booleanValue()) {
                if (!z) {
                    objArrL = l(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrL[i2] = obj;
                i2++;
            }
        }
        p3Var.a = objArrL;
        return i2;
    }

    public final int y(ns0 ns0Var, int i, p3 p3Var) {
        int iX = x(ns0Var, this.l, i, p3Var);
        Object obj = p3Var.a;
        if (iX == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iX, i, (Object) null);
        this.l = objArr;
        this.m -= i - iX;
        return iX;
    }

    public final boolean z(ns0 ns0Var) {
        int i;
        ns0 ns0Var2 = ns0Var;
        int iF = F();
        Object[] objArrP = null;
        p3 p3Var = new p3(null);
        boolean z = false;
        if (this.k != null) {
            e0 e0VarK = k(0);
            int iX = 32;
            while (iX == 32 && e0VarK.hasNext()) {
                iX = x(ns0Var2, (Object[]) e0VarK.next(), 32, p3Var);
            }
            if (iX == 32) {
                int iY = y(ns0Var2, iF, p3Var);
                if (iY == 0) {
                    r(this.k, this.m, this.i);
                }
                if (iY != iF) {
                }
            } else {
                int i2 = (e0VarK.f - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iW = iX;
                while (e0VarK.hasNext()) {
                    iW = w(ns0Var2, (Object[]) e0VarK.next(), 32, iW, p3Var, arrayList2, arrayList);
                    ns0Var2 = ns0Var;
                }
                int iW2 = w(ns0Var, this.l, iF, iW, p3Var, arrayList2, arrayList);
                Object obj = p3Var.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iW2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrS = this.k;
                if (zIsEmpty) {
                    objArrS.getClass();
                } else {
                    objArrS = s(objArrS, i2, this.i, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    yb2.a("invalid size");
                }
                if (size == 0) {
                    this.i = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.i;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.i = i - 5;
                        Object[] objArr2 = objArrS[0];
                        objArr2.getClass();
                        objArrS = objArr2;
                    }
                    objArrP = p(objArrS, i3, i);
                }
                this.k = objArrP;
                this.l = objArr;
                this.m = size + iW2;
            }
            z = true;
        } else if (y(ns0Var2, iF, p3Var) != iF) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iF = F();
        if (iF < 32) {
            Object[] objArrL = l(this.l);
            objArrL[iF] = obj;
            this.l = objArrL;
            this.m = a() + 1;
        } else {
            u(this.k, this.l, o(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iF = F();
        Iterator it = collection.iterator();
        if (32 - iF >= collection.size()) {
            Object[] objArrL = l(this.l);
            e(objArrL, iF, it);
            this.l = objArrL;
            this.m = collection.size() + this.m;
            return true;
        }
        int size = ((collection.size() + iF) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrL2 = l(this.l);
        e(objArrL2, iF, it);
        objArr[0] = objArrL2;
        for (int i = 1; i < size; i++) {
            Object[] objArrN = n();
            e(objArrN, 0, it);
            objArr[i] = objArrN;
        }
        this.k = t(this.k, C(), objArr);
        Object[] objArrN2 = n();
        e(objArrN2, 0, it);
        this.l = objArrN2;
        this.m = collection.size() + this.m;
        return true;
    }
}
