package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class le1 implements gq2, dq2 {
    public final hq2 f;
    public final dq2 g;
    public final js1 h;

    public le1(gq2 gq2Var, Map map, dq2 dq2Var) {
        xc1 xc1Var = new xc1(4, gq2Var);
        r93 r93Var = iq2.a;
        this.f = new hq2(map, xc1Var);
        this.g = dq2Var;
        js1 js1Var = or2.a;
        this.h = new js1();
    }

    @Override // defpackage.gq2
    public final fq2 a(String str, cs0 cs0Var) {
        return this.f.a(str, cs0Var);
    }

    @Override // defpackage.gq2
    public final boolean b(Object obj) {
        return this.f.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // defpackage.gq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map c() {
        js1 js1Var = this.h;
        Object[] objArr = js1Var.b;
        long[] jArr = js1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.g.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.f.c();
    }

    @Override // defpackage.gq2
    public final Object d(String str) {
        return this.f.d(str);
    }

    @Override // defpackage.dq2
    public final void e(Object obj, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-858296452);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(d00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(this) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            this.g.e(obj, d00Var, nv0Var, i2 & 126);
            boolean zH = nv0Var.h(this) | nv0Var.h(obj);
            Object objO = nv0Var.O();
            if (zH || objO == c20.a) {
                objO = new i(25, this, obj);
                nv0Var.j0(objO);
            }
            rn.g(obj, (ns0) objO, nv0Var);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(this, obj, d00Var, i, 10);
        }
    }

    @Override // defpackage.dq2
    public final void f(Object obj) {
        this.g.f(obj);
    }
}
