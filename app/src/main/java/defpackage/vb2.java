package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vb2 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    public vb2(boolean z, zs2 zs2Var, boolean z2, int i) {
        t20 t20Var = xa.a;
        int i2 = !z ? 262152 : 262144;
        i2 = zs2Var == zs2.g ? i2 | 8192 : i2;
        this(z2 ? i2 : i2 | 512, zs2Var == zs2.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb2)) {
            return false;
        }
        vb2 vb2Var = (vb2) obj;
        return this.a == vb2Var.a && this.b == vb2Var.b && this.c == vb2Var.c && this.d == vb2Var.d && this.e == vb2Var.e && this.f == vb2Var.f;
    }

    public final int hashCode() {
        return (by1.b(by1.b(by1.b(by1.b(by1.b(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public vb2(boolean z) {
        this(z, zs2.f, true, 0);
    }

    public vb2(int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = 1002;
    }
}
