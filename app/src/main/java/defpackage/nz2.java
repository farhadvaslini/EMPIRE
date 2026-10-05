package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nz2 implements eh0 {
    public final int a;
    public final int b;

    public nz2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.eh0
    public final void a(fh0 fh0Var) {
        int iH = y02.h(this.a, 0, fh0Var.a.c());
        int iH2 = y02.h(this.b, 0, fh0Var.a.c());
        if (iH < iH2) {
            fh0Var.f(iH, iH2);
        } else {
            fh0Var.f(iH2, iH);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz2)) {
            return false;
        }
        nz2 nz2Var = (nz2) obj;
        return this.a == nz2Var.a && this.b == nz2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return nc2.h("SetSelectionCommand(start=", this.a, ", end=", this.b, ")");
    }
}
