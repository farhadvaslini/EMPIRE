package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class n53 extends j0 {
    public static final n53 g = new n53(new Object[0]);
    public final Object[] f;

    public n53(Object[] objArr) {
        this.f = objArr;
    }

    @Override // defpackage.t
    public final int a() {
        return this.f.length;
    }

    @Override // defpackage.j0
    public final j0 b(int i, Object obj) {
        Object[] objArr = this.f;
        ur.q(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            uj.L(objArr, objArr2, 0, i, 6);
            uj.J(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new n53(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        uj.J(objArr, objArrCopyOf, i + 1, i, objArr.length - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new y52(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.j0
    public final j0 c(Object obj) {
        Object[] objArr = this.f;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new n53(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new y52(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.j0
    public final j0 e(Collection collection) {
        Object[] objArr = this.f;
        if (collection.size() + objArr.length > 32) {
            z52 z52VarF = f();
            z52VarF.addAll(collection);
            return z52VarF.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new n53(objArrCopyOf);
    }

    @Override // defpackage.j0
    public final z52 f() {
        return new z52(this, null, this.f, 0);
    }

    @Override // defpackage.j0
    public final j0 g(i0 i0Var) {
        Object[] objArr = this.f;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) i0Var.h(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? g : new n53(uj.N(objArrCopyOf, 0, length));
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.f;
        ur.p(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.j0
    public final j0 h(int i) {
        Object[] objArr = this.f;
        ur.p(i, objArr.length);
        if (objArr.length == 1) {
            return g;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        uj.J(objArr, objArrCopyOf, i, i + 1, objArr.length);
        return new n53(objArrCopyOf);
    }

    @Override // defpackage.j0
    public final j0 i(int i, Object obj) {
        Object[] objArr = this.f;
        ur.p(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new n53(objArrCopyOf);
    }

    @Override // defpackage.d0, java.util.List
    public final int indexOf(Object obj) {
        return uj.V(this.f, obj);
    }

    @Override // defpackage.d0, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.d0, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f;
        ur.q(i, objArr.length);
        return new ip(objArr, i, objArr.length);
    }
}
