package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kg1 implements Iterator, t61 {
    public final CharSequence f;
    public int g;
    public int h;
    public int i;
    public int j;

    public kg1(CharSequence charSequence) {
        charSequence.getClass();
        this.f = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.g;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.j < 0) {
            this.g = 2;
            return false;
        }
        CharSequence charSequence = this.f;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.h; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.g = 1;
                this.j = i;
                this.i = length;
                return true;
            }
        }
        i = -1;
        this.g = 1;
        this.j = i;
        this.i = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            c.n();
            return null;
        }
        this.g = 0;
        int i = this.i;
        int i2 = this.h;
        this.h = this.j + i;
        return this.f.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
