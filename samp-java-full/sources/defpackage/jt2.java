package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jt2 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public jt2 f;
    public jt2 g;

    public jt2(byte[] bArr, int i, boolean z, int i2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final jt2 a() {
        jt2 jt2Var = this.f;
        if (jt2Var == this) {
            jt2Var = null;
        }
        jt2 jt2Var2 = this.g;
        jt2Var2.getClass();
        jt2Var2.f = this.f;
        jt2 jt2Var3 = this.f;
        jt2Var3.getClass();
        jt2Var3.g = this.g;
        this.f = null;
        this.g = null;
        return jt2Var;
    }

    public final void b(jt2 jt2Var) {
        jt2Var.getClass();
        jt2Var.g = this;
        jt2Var.f = this.f;
        jt2 jt2Var2 = this.f;
        jt2Var2.getClass();
        jt2Var2.g = jt2Var;
        this.f = jt2Var;
    }

    public final jt2 c() {
        this.d = true;
        return new jt2(this.a, this.b, true, this.c);
    }

    public final void d(jt2 jt2Var, int i) {
        jt2Var.getClass();
        byte[] bArr = jt2Var.a;
        if (!jt2Var.e) {
            c.q("only owner can write");
            return;
        }
        int i2 = jt2Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (jt2Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = jt2Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            uj.H(bArr, bArr, 0, i4, i2);
            jt2Var.c -= jt2Var.b;
            jt2Var.b = 0;
        }
        int i5 = jt2Var.c;
        int i6 = this.b;
        uj.H(this.a, bArr, i5, i6, i6 + i);
        jt2Var.c += i;
        this.b += i;
    }

    public jt2() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
