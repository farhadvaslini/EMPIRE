package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class f21 {
    public final qs1 a = new qs1(new d21[16]);
    public final d42 b = b32.w(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final d42 d = b32.w(Boolean.TRUE);

    public final void a(int i, nv0 nv0Var) {
        nv0Var.b0(-318043801);
        int i2 = (nv0Var.h(this) ? 4 : 2) | i;
        if (nv0Var.R(i2 & 1, (i2 & 3) != 2)) {
            Object objO = nv0Var.O();
            p40 p40Var = null;
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = b32.w(null);
                nv0Var.j0(objO);
            }
            os1 os1Var = (os1) objO;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                nv0Var.a0(-144841960);
                boolean zH = nv0Var.h(this);
                Object objO2 = nv0Var.O();
                if (zH || objO2 == zjVar) {
                    objO2 = new n9(os1Var, this, p40Var, 7);
                    nv0Var.j0(objO2);
                }
                rn.l((rs0) objO2, nv0Var, this);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-143455237);
                nv0Var.p(false);
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new u(i, 15, this);
        }
    }
}
