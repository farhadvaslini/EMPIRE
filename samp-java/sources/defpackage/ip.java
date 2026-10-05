package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ip extends e0 {
    public final /* synthetic */ int h = 1;
    public final Object i;

    public ip(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.i = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    c.n();
                } else {
                    int i2 = this.f;
                    this.f = i2 + 1;
                }
                break;
            default:
                if (!hasNext()) {
                    c.n();
                } else {
                    this.f++;
                }
                break;
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    c.n();
                } else {
                    int i2 = this.f - 1;
                    this.f = i2;
                }
                break;
            default:
                if (!hasPrevious()) {
                    c.n();
                } else {
                    this.f--;
                }
                break;
        }
        return null;
    }

    public ip(int i, Object obj) {
        super(i, 1);
        this.i = obj;
    }
}
