package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class r52 extends p52 {
    public final q52 i;
    public Object j;
    public boolean k;
    public int l;

    public r52(q52 q52Var, uk3[] uk3VarArr) {
        super(q52Var.h, uk3VarArr);
        this.i = q52Var;
        this.l = q52Var.j;
    }

    public final void c(int i, tk3 tk3Var, Object obj, int i2) {
        int i3 = i2 * 5;
        uk3[] uk3VarArr = this.f;
        if (i3 <= 30) {
            int iY = 1 << oz2.y(i, i3);
            if (tk3Var.h(iY)) {
                uk3VarArr[i2].a(tk3Var.d, Integer.bitCount(tk3Var.a) * 2, tk3Var.f(iY));
                this.g = i2;
                return;
            } else {
                int iT = tk3Var.t(iY);
                tk3 tk3VarS = tk3Var.s(iT);
                uk3VarArr[i2].a(tk3Var.d, Integer.bitCount(tk3Var.a) * 2, iT);
                c(i, tk3VarS, obj, i2 + 1);
                return;
            }
        }
        uk3 uk3Var = uk3VarArr[i2];
        Object[] objArr = tk3Var.d;
        uk3Var.a(objArr, objArr.length, 0);
        while (true) {
            uk3 uk3Var2 = uk3VarArr[i2];
            if (s51.n(uk3Var2.f[uk3Var2.h], obj)) {
                this.g = i2;
                return;
            } else {
                uk3VarArr[i2].h += 2;
            }
        }
    }

    @Override // defpackage.p52, java.util.Iterator
    public final Object next() {
        if (this.i.j != this.l) {
            throw new ConcurrentModificationException();
        }
        if (!this.h) {
            c.n();
            return null;
        }
        uk3 uk3Var = this.f[this.g];
        this.j = uk3Var.f[uk3Var.h];
        this.k = true;
        return super.next();
    }

    @Override // defpackage.p52, java.util.Iterator
    public final void remove() {
        if (!this.k) {
            throw new IllegalStateException();
        }
        boolean z = this.h;
        q52 q52Var = this.i;
        if (!z) {
            cl3.g(q52Var).remove(this.j);
        } else {
            if (!z) {
                c.n();
                return;
            }
            uk3 uk3Var = this.f[this.g];
            Object obj = uk3Var.f[uk3Var.h];
            cl3.g(q52Var).remove(this.j);
            c(obj != null ? obj.hashCode() : 0, q52Var.h, obj, 0);
        }
        this.j = null;
        this.k = false;
        this.l = q52Var.j;
    }
}
