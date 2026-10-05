package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map c() {
        /*
            r14 = this;
            js1 r0 = r14.h
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            dq2 r11 = r14.g
            r11.f(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            hq2 r14 = r14.f
            java.util.Map r14 = r14.c()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le1.c():java.util.Map");
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
