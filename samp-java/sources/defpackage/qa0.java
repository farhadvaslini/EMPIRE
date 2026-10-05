package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qa0 implements eh0 {
    public final int a;
    public final int b;

    public qa0(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        n21.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.eh0
    public final void a(fh0 fh0Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = fh0Var.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(fh0Var.b((i5 - i4) + (-1))) && Character.isLowSurrogate(fh0Var.b(fh0Var.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iC = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i6 = iC + 1;
            int i7 = fh0Var.c;
            xh xhVar = fh0Var.a;
            if (i7 + i6 >= xhVar.c()) {
                iC = xhVar.c() - fh0Var.c;
                break;
            } else {
                iC = (Character.isHighSurrogate(fh0Var.b((fh0Var.c + i6) + (-1))) && Character.isLowSurrogate(fh0Var.b(fh0Var.c + i6))) ? iC + 2 : i6;
                i++;
            }
        }
        int i8 = fh0Var.c;
        fh0Var.a(i8, iC + i8);
        int i9 = fh0Var.b;
        fh0Var.a(i9 - i3, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa0)) {
            return false;
        }
        qa0 qa0Var = (qa0) obj;
        return this.a == qa0Var.a && this.b == qa0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return nc2.h("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", this.a, ", lengthAfterCursor=", this.b, ")");
    }
}
