package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class iq extends jq {
    public final int j;
    public final int k;

    public iq(byte[] bArr, int i, int i2) {
        super(bArr);
        jq.b(i, i + i2, bArr.length);
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.jq
    public final byte a(int i) {
        int i2 = this.k;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.g[this.j + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(by1.e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(nc2.g(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.jq
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.g, this.j, bArr, 0, i);
    }

    @Override // defpackage.jq
    public final int f() {
        return this.j;
    }

    @Override // defpackage.jq
    public final byte g(int i) {
        return this.g[this.j + i];
    }

    @Override // defpackage.jq
    public final int size() {
        return this.k;
    }
}
