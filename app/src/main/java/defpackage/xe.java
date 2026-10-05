package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xe {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public xe(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final ze a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            n21.b("Item.end should be set first");
        }
        return new ze(this.a, this.b, i, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        return s51.n(this.a, xeVar.a) && this.b == xeVar.b && this.c == xeVar.c && s51.n(this.d, xeVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + nc2.b(this.c, nc2.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public /* synthetic */ xe(h83 h83Var, int i, int i2, int i3) {
        this(h83Var, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, "");
    }
}
