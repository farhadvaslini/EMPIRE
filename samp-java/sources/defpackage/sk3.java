package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sk3 extends e0 {
    public int h;
    public Object[] i;
    public boolean j;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public sk3(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.h = i3;
        Object[] objArr2 = new Object[i3];
        this.i = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.j = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.f & 31;
        Object obj = this.i[this.h - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.h - i2) * 5;
        while (i2 < this.h) {
            Object[] objArr = this.i;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[t22.E(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (t22.E(this.f, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.f, ((this.h - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            c.n();
            return null;
        }
        Object objA = a();
        int i = this.f + 1;
        this.f = i;
        if (i == this.g) {
            this.j = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            c.n();
            return null;
        }
        this.f--;
        if (this.j) {
            this.j = false;
            return a();
        }
        c(31);
        return a();
    }
}
