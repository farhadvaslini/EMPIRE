package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class a0 implements Iterator, t61 {
    public final /* synthetic */ int f;
    public int g;
    public final Object h;

    public /* synthetic */ a0(int i, Object obj) {
        this.f = i;
        this.h = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (this.g < ((d0) obj).a()) {
                }
                break;
            case 1:
                if (this.g < ((Object[]) obj).length) {
                }
                break;
            default:
                if (this.g < ((l83) obj).e()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    c.n();
                    return null;
                }
                int i2 = this.g;
                this.g = i2 + 1;
                return ((d0) obj).get(i2);
            case 1:
                try {
                    int i3 = this.g;
                    this.g = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.g--;
                    c.m(e.getMessage());
                    return null;
                }
            default:
                int i4 = this.g;
                this.g = i4 + 1;
                return ((l83) obj).f(i4);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
