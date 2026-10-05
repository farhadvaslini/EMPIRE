package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zl1 extends bm1 implements Iterator, t61 {
    public final /* synthetic */ int j;

    public zl1(cm1 cm1Var, int i) {
        this.j = i;
        cm1Var.getClass();
        this.i = cm1Var;
        this.g = -1;
        this.h = cm1Var.m;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.j) {
            case 0:
                b();
                int i = this.f;
                cm1 cm1Var = (cm1) this.i;
                if (i >= cm1Var.k) {
                    c.n();
                } else {
                    this.f = i + 1;
                    this.g = i;
                    am1 am1Var = new am1(cm1Var, i);
                    e();
                }
                break;
            case 1:
                b();
                int i2 = this.f;
                cm1 cm1Var2 = (cm1) this.i;
                if (i2 >= cm1Var2.k) {
                    c.n();
                } else {
                    this.f = i2 + 1;
                    this.g = i2;
                    Object obj = cm1Var2.f[i2];
                    e();
                }
                break;
            default:
                b();
                int i3 = this.f;
                cm1 cm1Var3 = (cm1) this.i;
                if (i3 >= cm1Var3.k) {
                    c.n();
                } else {
                    this.f = i3 + 1;
                    this.g = i3;
                    Object[] objArr = cm1Var3.g;
                    objArr.getClass();
                    Object obj2 = objArr[this.g];
                    e();
                }
                break;
        }
        return null;
    }
}
