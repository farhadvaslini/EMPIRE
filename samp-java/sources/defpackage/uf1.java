package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class uf1 extends vq3 {
    public final or1 b;

    public uf1() {
        or1 or1Var = h41.a;
        this.b = new or1();
    }

    @Override // defpackage.vq3
    public final void d() {
        or1 or1Var = this.b;
        int[] iArr = or1Var.b;
        Object[] objArr = or1Var.c;
        long[] jArr = or1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        as1 as1Var = (as1) objArr[i4];
                        Object[] objArr2 = as1Var.a;
                        int i6 = as1Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            tf1 tf1Var = (tf1) objArr2[i7];
                            mr mrVar = tf1Var.d;
                            if (mrVar != null) {
                                mrVar.cancel();
                            }
                            tf1Var.d = null;
                            wl1 wl1Var = (wl1) tf1Var.a.g;
                            wl1Var.g = true;
                            wl1Var.f = false;
                            wl1Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
