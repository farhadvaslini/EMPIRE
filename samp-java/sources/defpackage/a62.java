package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class a62 extends e0 {
    public final Object[] h;
    public final sk3 i;

    public a62(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.h = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.i = new sk3(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            c.n();
            return null;
        }
        sk3 sk3Var = this.i;
        if (sk3Var.hasNext()) {
            this.f++;
            return sk3Var.next();
        }
        int i = this.f;
        this.f = i + 1;
        return this.h[i - sk3Var.g];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            c.n();
            return null;
        }
        int i = this.f;
        sk3 sk3Var = this.i;
        int i2 = sk3Var.g;
        if (i <= i2) {
            this.f = i - 1;
            return sk3Var.previous();
        }
        int i3 = i - 1;
        this.f = i3;
        return this.h[i3 - i2];
    }
}
