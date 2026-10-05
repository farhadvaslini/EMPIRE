package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class y52 extends j0 {
    public final Object[] f;
    public final Object[] g;
    public final int h;
    public final int i;

    public y52(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.f = objArr;
        this.g = objArr2;
        this.h = i;
        this.i = i2;
        if (!(a() > 32)) {
            yb2.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] j(Object[] objArr, int i, int i2, Object obj, p3 p3Var) {
        int iE = t22.E(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iE == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            uj.J(objArr, objArrCopyOf, iE + 1, iE, 31);
            p3Var.a = objArr[31];
            objArrCopyOf[iE] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iE];
        obj2.getClass();
        objArrCopyOf2[iE] = j((Object[]) obj2, i3, i2, obj, p3Var);
        while (true) {
            iE++;
            if (iE >= 32 || objArrCopyOf2[iE] == null) {
                break;
            }
            Object obj3 = objArr[iE];
            obj3.getClass();
            objArrCopyOf2[iE] = j((Object[]) obj3, i3, 0, p3Var.a, p3Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] l(Object[] objArr, int i, int i2, p3 p3Var) {
        Object[] objArrL;
        int iE = t22.E(i2, i);
        if (i == 5) {
            p3Var.a = objArr[iE];
            objArrL = null;
        } else {
            Object obj = objArr[iE];
            obj.getClass();
            objArrL = l((Object[]) obj, i - 5, i2, p3Var);
        }
        if (objArrL == null && iE == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iE] = objArrL;
        return objArrCopyOf;
    }

    public static Object[] r(int i, int i2, Object obj, Object[] objArr) {
        int iE = t22.E(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iE] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iE];
        obj2.getClass();
        objArrCopyOf[iE] = r(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // defpackage.t
    public final int a() {
        return this.h;
    }

    @Override // defpackage.j0
    public final j0 b(int i, Object obj) {
        int i2 = this.h;
        ur.q(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int iQ = q();
        Object[] objArr = this.f;
        if (i >= iQ) {
            return k(objArr, i - iQ, obj);
        }
        p3 p3Var = new p3(null);
        return k(j(objArr, this.i, i, obj, p3Var), 0, p3Var.a);
    }

    @Override // defpackage.j0
    public final j0 c(Object obj) {
        int iQ = q();
        int i = this.h;
        int i2 = i - iQ;
        Object[] objArr = this.f;
        Object[] objArr2 = this.g;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new y52(objArr, objArrCopyOf, i + 1, this.i);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m(objArr, objArr2, objArr3);
    }

    @Override // defpackage.j0
    public final z52 f() {
        return new z52(this, this.f, this.g, this.i);
    }

    @Override // defpackage.j0
    public final j0 g(i0 i0Var) {
        z52 z52Var = new z52(this, this.f, this.g, this.i);
        z52Var.z(i0Var);
        return z52Var.c();
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        ur.p(i, a());
        if (q() <= i) {
            objArr = this.g;
        } else {
            Object[] objArr2 = this.f;
            for (int i2 = this.i; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[t22.E(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.j0
    public final j0 h(int i) {
        ur.p(i, a());
        int iQ = q();
        int i2 = this.i;
        Object[] objArr = this.f;
        return i >= iQ ? p(objArr, iQ, i2, i - iQ) : p(o(objArr, i2, i, new p3(this.g[0])), iQ, i2, 0);
    }

    @Override // defpackage.j0
    public final j0 i(int i, Object obj) {
        int i2 = this.h;
        ur.p(i, i2);
        int iQ = q();
        Object[] objArr = this.f;
        Object[] objArr2 = this.g;
        int i3 = this.i;
        if (iQ > i) {
            return new y52(r(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new y52(objArr, objArrCopyOf, i2, i3);
    }

    public final y52 k(Object[] objArr, int i, Object obj) {
        int iQ = q();
        int i2 = this.h;
        int i3 = i2 - iQ;
        Object[] objArr2 = this.g;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            uj.J(objArr2, objArrCopyOf, i + 1, i, i3);
            objArrCopyOf[i] = obj;
            return new y52(objArr, objArrCopyOf, i2 + 1, this.i);
        }
        Object obj2 = objArr2[31];
        uj.J(objArr2, objArrCopyOf, i + 1, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m(objArr, objArrCopyOf, objArr3);
    }

    @Override // defpackage.d0, java.util.List
    public final ListIterator listIterator(int i) {
        ur.q(i, this.h);
        return new a62(this.f, this.g, i, this.h, (this.i / 5) + 1);
    }

    public final y52 m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.h;
        int i2 = i >> 5;
        int i3 = this.i;
        if (i2 <= (1 << i3)) {
            return new y52(n(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new y52(n(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] n(int i, Object[] objArr, Object[] objArr2) {
        int iE = t22.E(a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iE] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iE] = n(i - 5, (Object[]) objArrCopyOf[iE], objArr2);
        return objArrCopyOf;
    }

    public final Object[] o(Object[] objArr, int i, int i2, p3 p3Var) {
        int iE = t22.E(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iE == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            uj.J(objArr, objArrCopyOf, iE, iE + 1, 32);
            objArrCopyOf[31] = p3Var.a;
            p3Var.a = objArr[iE];
            return objArrCopyOf;
        }
        int iE2 = objArr[31] == null ? t22.E(q() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iE + 1;
        if (i4 <= iE2) {
            while (true) {
                Object obj = objArrCopyOf2[iE2];
                obj.getClass();
                objArrCopyOf2[iE2] = o((Object[]) obj, i3, 0, p3Var);
                if (iE2 == i4) {
                    break;
                }
                iE2--;
            }
        }
        Object obj2 = objArrCopyOf2[iE];
        obj2.getClass();
        objArrCopyOf2[iE] = o((Object[]) obj2, i3, i2, p3Var);
        return objArrCopyOf2;
    }

    public final j0 p(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.h - i;
        if (i4 != 1) {
            Object[] objArr2 = this.g;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                uj.J(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new y52(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new n53(objArr);
        }
        p3 p3Var = new p3(null);
        Object[] objArrL = l(objArr, i2, i - 1, p3Var);
        objArrL.getClass();
        Object obj = p3Var.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrL[1] != null) {
            return new y52(objArrL, objArr3, i, i2);
        }
        Object obj2 = objArrL[0];
        obj2.getClass();
        return new y52((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int q() {
        return (this.h - 1) & (-32);
    }
}
