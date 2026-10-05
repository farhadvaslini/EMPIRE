package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class p52 implements Iterator, t61 {
    public final uk3[] f;
    public int g;
    public boolean h = true;

    public p52(tk3 tk3Var, uk3[] uk3VarArr) {
        this.f = uk3VarArr;
        uk3VarArr[0].a(tk3Var.d, Integer.bitCount(tk3Var.a) * 2, 0);
        this.g = 0;
        a();
    }

    public final void a() {
        int i = this.g;
        uk3[] uk3VarArr = this.f;
        uk3 uk3Var = uk3VarArr[i];
        if (uk3Var.h < uk3Var.g) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                uk3 uk3Var2 = uk3VarArr[i];
                int i2 = uk3Var2.h;
                Object[] objArr = uk3Var2.f;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    uk3Var2.h = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.g = iB;
                return;
            }
            if (i > 0) {
                uk3 uk3Var3 = uk3VarArr[i - 1];
                int i3 = uk3Var3.h;
                int length2 = uk3Var3.f.length;
                uk3Var3.h = i3 + 1;
            }
            uk3VarArr[i].a(tk3.e.d, 0, 0);
            i--;
        }
        this.h = false;
    }

    public final int b(int i) {
        uk3[] uk3VarArr = this.f;
        uk3 uk3Var = uk3VarArr[i];
        int i2 = uk3Var.h;
        if (i2 < uk3Var.g) {
            return i;
        }
        Object[] objArr = uk3Var.f;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        tk3 tk3Var = (tk3) obj;
        if (i == 6) {
            uk3 uk3Var2 = uk3VarArr[i + 1];
            Object[] objArr2 = tk3Var.d;
            uk3Var2.a(objArr2, objArr2.length, 0);
        } else {
            uk3VarArr[i + 1].a(tk3Var.d, Integer.bitCount(tk3Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.h) {
            c.n();
            return null;
        }
        Object next = this.f[this.g].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
