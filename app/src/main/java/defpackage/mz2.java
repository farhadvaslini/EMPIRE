package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mz2 implements eh0 {
    public final af a;
    public final int b;

    public mz2(int i, String str) {
        this.a = new af(str);
        this.b = i;
    }

    @Override // defpackage.eh0
    public final void a(fh0 fh0Var) {
        int i = fh0Var.d;
        af afVar = this.a;
        if (i != -1) {
            int i2 = fh0Var.e;
            String str = afVar.g;
            String str2 = afVar.g;
            fh0Var.d(i, i2, str);
            if (str2.length() > 0) {
                fh0Var.e(i, str2.length() + i);
            }
        } else {
            int i3 = fh0Var.b;
            int i4 = fh0Var.c;
            String str3 = afVar.g;
            String str4 = afVar.g;
            fh0Var.d(i3, i4, str3);
            if (str4.length() > 0) {
                fh0Var.e(i3, str4.length() + i3);
            }
        }
        int i5 = fh0Var.b;
        int i6 = fh0Var.c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.b;
        int iH = y02.h(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - afVar.g.length(), 0, fh0Var.a.c());
        fh0Var.f(iH, iH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz2)) {
            return false;
        }
        mz2 mz2Var = (mz2) obj;
        return s51.n(this.a.g, mz2Var.a.g) && this.b == mz2Var.b;
    }

    public final int hashCode() {
        return (this.a.g.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + this.a.g + "', newCursorPosition=" + this.b + ")";
    }
}
