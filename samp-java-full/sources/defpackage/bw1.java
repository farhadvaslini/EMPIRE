package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bw1 extends ns1 {
    public final ns1 o;
    public boolean p;

    public bw1(long j, y63 y63Var, ns0 ns0Var, ns0 ns0Var2, ns1 ns1Var) {
        super(j, y63Var, ns0Var, ns0Var2);
        this.o = ns1Var;
        ns1Var.k();
    }

    @Override // defpackage.ns1, defpackage.t63
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.ns1
    public final t22 w() {
        bw1 bw1Var;
        ns1 ns1Var = this.o;
        if (ns1Var.m || ns1Var.c) {
            return new v63(this);
        }
        js1 js1Var = this.h;
        long j = this.b;
        HashMap mapB = js1Var != null ? a73.b(ns1Var.g(), this, this.o.d()) : null;
        Object obj = a73.c;
        synchronized (obj) {
            try {
                a73.c(this);
                if (js1Var == null || js1Var.d == 0) {
                    bw1Var = this;
                    bw1Var.a();
                } else {
                    bw1Var = this;
                    t22 t22VarZ = bw1Var.z(this.o.g(), js1Var, mapB, this.o.d());
                    if (!t22VarZ.equals(w63.c)) {
                        return t22VarZ;
                    }
                    js1 js1VarX = bw1Var.o.x();
                    if (js1VarX != null) {
                        js1VarX.j(js1Var);
                    } else {
                        bw1Var.o.B(js1Var);
                        bw1Var.h = null;
                    }
                }
                if (s51.s(bw1Var.o.g(), j) < 0) {
                    bw1Var.o.v();
                }
                ns1 ns1Var2 = bw1Var.o;
                ns1Var2.r(ns1Var2.d().b(j).a(bw1Var.j));
                bw1Var.o.A(j);
                ns1 ns1Var3 = bw1Var.o;
                int i = bw1Var.d;
                bw1Var.d = -1;
                if (i >= 0) {
                    int[] iArr = ns1Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    ns1Var3.k = iArrCopyOf;
                } else {
                    ns1Var3.getClass();
                }
                ns1 ns1Var4 = bw1Var.o;
                y63 y63Var = bw1Var.j;
                ns1Var4.getClass();
                synchronized (obj) {
                    ns1Var4.j = ns1Var4.j.e(y63Var);
                    ns1 ns1Var5 = bw1Var.o;
                    int[] iArr2 = bw1Var.k;
                    ns1Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = ns1Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        ns1Var5.k = iArr2;
                    }
                }
                bw1Var.m = true;
                if (!bw1Var.p) {
                    bw1Var.p = true;
                    bw1Var.o.l();
                }
                return w63.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
