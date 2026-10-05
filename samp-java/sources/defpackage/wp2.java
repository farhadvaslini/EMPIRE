package defpackage;

import java.net.Inet4Address;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wp2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public final /* synthetic */ ak2 k;
    public final /* synthetic */ sv2 l;
    public final /* synthetic */ Inet4Address m;
    public final /* synthetic */ xy2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp2(ak2 ak2Var, sv2 sv2Var, Inet4Address inet4Address, xy2 xy2Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.k = ak2Var;
        this.l = sv2Var;
        this.m = inet4Address;
        this.n = xy2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((wp2) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new wp2(this.k, this.l, this.m, this.n, p40Var, 0);
            default:
                return new wp2(this.k, this.l, this.m, this.n, p40Var, 1);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        xy2 xy2Var = this.n;
        Inet4Address inet4Address = this.m;
        sv2 sv2Var = this.l;
        ak2 ak2Var = this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                ak2Var.getClass();
                byte[] bArr = ak2Var.l(sv2Var, inet4Address, 'i', new byte[0]).a;
                h9 h9Var = new h9(bArr, oz2.i(xy2Var));
                h9Var.c(1);
                int i2 = h9Var.b;
                h9Var.b = i2 + 1;
                boolean z = (bArr[i2] & 255) != 0;
                int i3 = h9Var.i();
                int i4 = h9Var.i();
                h9Var.c(4);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, h9Var.b, 4);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                int i5 = byteBufferWrap.order(byteOrder).getInt();
                h9Var.b += 4;
                String strH = h9Var.h(i5);
                h9Var.c(4);
                int i6 = ByteBuffer.wrap(bArr, h9Var.b, 4).order(byteOrder).getInt();
                h9Var.b += 4;
                String strH2 = h9Var.h(i6);
                h9Var.c(4);
                int i7 = ByteBuffer.wrap(bArr, h9Var.b, 4).order(byteOrder).getInt();
                h9Var.b += 4;
                return new aq2(z, i3, i4, strH, strH2, h9Var.h(i7));
            default:
                y02.Q(obj);
                ak2Var.getClass();
                h9 h9Var2 = new h9(ak2Var.l(sv2Var, inet4Address, 'r', new byte[0]).a, oz2.i(xy2Var));
                byte[] bArr2 = (byte[]) h9Var2.c;
                cm1 cm1Var = new cm1(8);
                int i8 = h9Var2.i();
                for (int i9 = 0; i9 < i8; i9++) {
                    h9Var2.c(1);
                    int i10 = h9Var2.b;
                    h9Var2.b = i10 + 1;
                    String strH3 = h9Var2.h(bArr2[i10] & 255);
                    h9Var2.c(1);
                    int i11 = h9Var2.b;
                    h9Var2.b = i11 + 1;
                    String strH4 = h9Var2.h(bArr2[i11] & 255);
                    if (!y93.q0(strH3)) {
                        cm1Var.put(strH3, strH4);
                    }
                }
                return om1.W(cm1Var);
        }
    }
}
