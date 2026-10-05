package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mj0 extends d0 implements lj0, RandomAccess, Serializable {
    public final Enum[] f;

    public mj0(Enum[] enumArr) {
        this.f = enumArr;
    }

    @Override // defpackage.t
    public final int a() {
        return this.f.length;
    }

    @Override // defpackage.t, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) uj.U(r2.ordinal(), this.f)) == r2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        c.i(nc2.g(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.d0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) uj.U(iOrdinal, this.f)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.d0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) uj.U(iOrdinal, this.f)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
