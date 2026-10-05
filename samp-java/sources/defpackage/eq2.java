package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class eq2 implements dq2 {
    public static final ar2 j = new ar2(0, new h12(6), new rh2(2));
    public final Map f;
    public final is1 g;
    public gq2 h;
    public final xc1 i;

    public eq2(Map map) {
        this.f = map;
        long[] jArr = nr2.a;
        this.g = new is1();
        this.i = new xc1(23, this);
    }

    @Override // defpackage.dq2
    public final void e(Object obj, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(533563200);
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
            nv0Var.c0(obj);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                xc1 xc1Var = this.i;
                if (!((Boolean) xc1Var.h(obj)).booleanValue()) {
                    qn1.m(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.f.get(obj);
                r93 r93Var = iq2.a;
                jq2 jq2Var = new jq2(new hq2(map, xc1Var));
                nv0Var.j0(jq2Var);
                objO = jq2Var;
            }
            jq2 jq2Var2 = (jq2) objO;
            vr.d(new he2[]{iq2.a.a(jq2Var2), nj1.a.a(jq2Var2)}, d00Var, nv0Var, (i2 & 112) | 8);
            boolean zH = nv0Var.h(this) | nv0Var.h(obj) | nv0Var.h(jq2Var2);
            Object objO2 = nv0Var.O();
            if (zH || objO2 == zjVar) {
                objO2 = new v1(this, obj, jq2Var2, 22);
                nv0Var.j0(objO2);
            }
            rn.g(dm3.a, (ns0) objO2, nv0Var);
            if (nv0Var.y && nv0Var.G.i == nv0Var.z) {
                nv0Var.z = -1;
                nv0Var.y = false;
            }
            nv0Var.p(false);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(this, obj, d00Var, i, 13);
        }
    }

    @Override // defpackage.dq2
    public final void f(Object obj) {
        if (this.g.k(obj) == null) {
            this.f.remove(obj);
        }
    }
}
