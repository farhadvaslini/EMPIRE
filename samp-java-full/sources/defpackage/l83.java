package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class l83 implements Cloneable {
    public /* synthetic */ boolean f;
    public /* synthetic */ int[] g;
    public /* synthetic */ Object[] h;
    public /* synthetic */ int i;

    public l83(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.g = new int[i5];
        this.h = new Object[i5];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l83 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        l83 l83Var = (l83) objClone;
        l83Var.g = (int[]) this.g.clone();
        l83Var.h = (Object[]) this.h.clone();
        return l83Var;
    }

    public final Object b(int i) {
        Object obj;
        int iD = w7.D(this.i, i, this.g);
        if (iD < 0 || (obj = this.h[iD]) == r51.I1) {
            return null;
        }
        return obj;
    }

    public final int c(int i) {
        if (this.f) {
            r51.j(this);
        }
        return this.g[i];
    }

    public final void d(int i, Object obj) {
        int iD = w7.D(this.i, i, this.g);
        if (iD >= 0) {
            this.h[iD] = obj;
            return;
        }
        int i2 = ~iD;
        int i3 = this.i;
        if (i2 < i3) {
            Object[] objArr = this.h;
            if (objArr[i2] == r51.I1) {
                this.g[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f && i3 >= this.g.length) {
            r51.j(this);
            i2 = ~w7.D(this.i, i, this.g);
        }
        int i4 = this.i;
        if (i4 >= this.g.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.g = Arrays.copyOf(this.g, i8);
            this.h = Arrays.copyOf(this.h, i8);
        }
        int i9 = this.i;
        if (i9 - i2 != 0) {
            int[] iArr = this.g;
            int i10 = i2 + 1;
            uj.G(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.h;
            uj.J(objArr2, objArr2, i10, i2, this.i);
        }
        this.g[i2] = i;
        this.h[i2] = obj;
        this.i++;
    }

    public final int e() {
        if (this.f) {
            r51.j(this);
        }
        return this.i;
    }

    public final Object f(int i) {
        if (this.f) {
            r51.j(this);
        }
        Object[] objArr = this.h;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (e() <= 0) {
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
            Object objF = f(i2);
            if (objF != this) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
