package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lz2 implements eh0 {
    public final int a;
    public final int b;

    public lz2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.eh0
    public final void a(fh0 fh0Var) {
        boolean z = fh0Var.d != -1;
        xh xhVar = fh0Var.a;
        if (z) {
            fh0Var.d = -1;
            fh0Var.e = -1;
        }
        int iH = y02.h(this.a, 0, xhVar.c());
        int iH2 = y02.h(this.b, 0, xhVar.c());
        if (iH != iH2) {
            if (iH < iH2) {
                fh0Var.e(iH, iH2);
            } else {
                fh0Var.e(iH2, iH);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz2)) {
            return false;
        }
        lz2 lz2Var = (lz2) obj;
        return this.a == lz2Var.a && this.b == lz2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return nc2.h("SetComposingRegionCommand(start=", this.a, ", end=", this.b, ")");
    }
}
