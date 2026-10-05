package defpackage;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class r02 extends d0 implements RandomAccess {
    public final kq[] f;
    public final int[] g;

    public r02(kq[] kqVarArr, int[] iArr) {
        this.f = kqVarArr;
        this.g = iArr;
    }

    @Override // defpackage.t
    public final int a() {
        return this.f.length;
    }

    @Override // defpackage.t, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof kq) {
            return super.contains((kq) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f[i];
    }

    @Override // defpackage.d0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof kq) {
            return super.indexOf((kq) obj);
        }
        return -1;
    }

    @Override // defpackage.d0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof kq) {
            return super.lastIndexOf((kq) obj);
        }
        return -1;
    }
}
