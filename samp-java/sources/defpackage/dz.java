package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dz implements eh0 {
    public final af a;
    public final int b;

    public dz(int i, String str) {
        this(new af(str), i);
    }

    @Override // defpackage.eh0
    public final void a(fh0 fh0Var) {
        int i = fh0Var.d;
        af afVar = this.a;
        if (i != -1) {
            fh0Var.d(i, fh0Var.e, afVar.g);
        } else {
            fh0Var.d(fh0Var.b, fh0Var.c, afVar.g);
        }
        int i2 = fh0Var.b;
        int i3 = fh0Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iH = y02.h(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - afVar.g.length(), 0, fh0Var.a.c());
        fh0Var.f(iH, iH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz)) {
            return false;
        }
        dz dzVar = (dz) obj;
        return s51.n(this.a.g, dzVar.a.g) && this.b == dzVar.b;
    }

    public final int hashCode() {
        return (this.a.g.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + this.a.g + "', newCursorPosition=" + this.b + ")";
    }

    public dz(af afVar, int i) {
        this.a = afVar;
        this.b = i;
    }
}
