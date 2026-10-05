package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ds1 implements x61, Set, t61 {
    public final bs1 f;
    public final bs1 g;

    public ds1(bs1 bs1Var) {
        bs1Var.getClass();
        this.f = bs1Var;
        this.g = bs1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.g.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        bs1 bs1Var = this.g;
        bs1Var.getClass();
        int i = bs1Var.g;
        for (Object obj : collection) {
            int iD = bs1Var.d(obj);
            bs1Var.b[iD] = obj;
            long[] jArr = bs1Var.c;
            int i2 = bs1Var.d;
            jArr[iD] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iD) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            bs1Var.d = iD;
            if (bs1Var.e == Integer.MAX_VALUE) {
                bs1Var.e = iD;
            }
        }
        return i != bs1Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.g.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ds1.class != obj.getClass()) {
            return false;
        }
        return s51.n(this.f, ((ds1) obj).f);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new yv0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.g.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int iNumberOfTrailingZeros;
        collection.getClass();
        bs1 bs1Var = this.g;
        bs1Var.getClass();
        int i2 = bs1Var.g;
        Iterator it = collection.iterator();
        while (true) {
            int i3 = 1;
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i5 = iHashCode ^ (iHashCode << 16);
            int i6 = i5 & 127;
            int i7 = bs1Var.f;
            int i8 = (i5 >>> 7) & i7;
            while (true) {
                long[] jArr = bs1Var.a;
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                long j = ((jArr[i9 + i3] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
                long j2 = (((long) i6) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i8) & i7;
                    int i11 = i3;
                    if (s51.n(bs1Var.b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i3 = i11;
                }
                i4 += 8;
                i8 = (i8 + i4) & i7;
                i3 = i;
            }
            if (iNumberOfTrailingZeros >= 0) {
                bs1Var.h(iNumberOfTrailingZeros);
            }
        }
        return i2 != bs1Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.g.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return f80.S(this, objArr);
    }

    public final String toString() {
        return this.f.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return f80.R(this);
    }
}
