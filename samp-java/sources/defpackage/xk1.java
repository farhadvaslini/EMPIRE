package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xk1 implements Cloneable {
    public /* synthetic */ boolean f;
    public /* synthetic */ long[] g;
    public /* synthetic */ Object[] h;
    public /* synthetic */ int i;

    public xk1(int i) {
        if (i == 0) {
            this.g = w7.r;
            this.h = w7.s;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.g = new long[i5];
        this.h = new Object[i5];
    }

    public final void a() {
        int i = this.i;
        Object[] objArr = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.i = 0;
        this.f = false;
    }

    public final Object b(long j) {
        Object obj;
        int iE = w7.E(this.g, this.i, j);
        if (iE < 0 || (obj = this.h[iE]) == r51.D1) {
            return null;
        }
        return obj;
    }

    public final long c(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.i)) {
            c.p(by1.e(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.f) {
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != r51.D1) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f = false;
            this.i = i3;
        }
        return this.g[i];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        xk1 xk1Var = (xk1) objClone;
        xk1Var.g = (long[]) this.g.clone();
        xk1Var.h = (Object[]) this.h.clone();
        return xk1Var;
    }

    public final void d(long j, Object obj) {
        Object obj2 = r51.D1;
        int iE = w7.E(this.g, this.i, j);
        if (iE >= 0) {
            this.h[iE] = obj;
            return;
        }
        int i = ~iE;
        int i2 = this.i;
        if (i < i2) {
            Object[] objArr = this.h;
            if (objArr[i] == obj2) {
                this.g[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f) {
            long[] jArr = this.g;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.h;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f = false;
                this.i = i3;
                i = ~w7.E(this.g, i3, j);
            }
        }
        int i5 = this.i;
        if (i5 >= this.g.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.g = Arrays.copyOf(this.g, i9);
            this.h = Arrays.copyOf(this.h, i9);
        }
        int i10 = this.i;
        if (i10 - i != 0) {
            long[] jArr2 = this.g;
            int i11 = i + 1;
            uj.I(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.h;
            uj.J(objArr3, objArr3, i11, i, this.i);
        }
        this.g[i] = j;
        this.h[i] = obj;
        this.i++;
    }

    public final void e(long j) {
        int iE = w7.E(this.g, this.i, j);
        if (iE >= 0) {
            Object[] objArr = this.h;
            Object obj = objArr[iE];
            Object obj2 = r51.D1;
            if (obj != obj2) {
                objArr[iE] = obj2;
                this.f = true;
            }
        }
    }

    public final int f() {
        if (this.f) {
            int i = this.i;
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != r51.D1) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f = false;
            this.i = i2;
        }
        return this.i;
    }

    public final Object g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.i)) {
            c.p(by1.e(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.f) {
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != r51.D1) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f = false;
            this.i = i3;
        }
        return this.h[i];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.i * 28);
        sb.append('{');
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object objG = g(i2);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ xk1() {
        this(10);
    }
}
