package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bc1 implements sa3 {
    public bb1 f = bb1.g;
    public float g;
    public float h;
    public final /* synthetic */ hc1 i;

    public bc1(hc1 hc1Var) {
        this.i = hc1Var;
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.h;
    }

    @Override // defpackage.k51
    public final boolean M() {
        pb1 pb1Var = this.i.f.M.d;
        return pb1Var == pb1.i || pb1Var == pb1.g;
    }

    @Override // defpackage.sa3
    public final List e0(rs0 rs0Var, Object obj) {
        hc1 hc1Var = this.i;
        hc1Var.g();
        tb1 tb1Var = hc1Var.f;
        pb1 pb1Var = tb1Var.M.d;
        pb1 pb1Var2 = pb1.h;
        pb1 pb1Var3 = pb1.f;
        if (pb1Var != pb1Var3 && pb1Var != pb1Var2 && pb1Var != pb1.g && pb1Var != pb1.i) {
            m21.c("subcompose can only be used inside the measure or layout blocks");
        }
        is1 is1Var = hc1Var.l;
        Object objG = is1Var.g(obj);
        if (objG == null) {
            objG = (tb1) hc1Var.o.k(obj);
            if (objG != null) {
                if (hc1Var.t <= 0) {
                    m21.c("Check failed.");
                }
                hc1Var.t--;
            } else {
                objG = hc1Var.n(obj);
                if (objG == null) {
                    int i = hc1Var.i;
                    tb1 tb1Var2 = new tb1(2);
                    tb1Var.w = true;
                    tb1Var.B(i, tb1Var2);
                    tb1Var.w = false;
                    objG = tb1Var2;
                }
            }
            is1Var.m(obj, objG);
        }
        tb1 tb1Var3 = (tb1) objG;
        if (qx.s0(hc1Var.i, tb1Var.o()) != tb1Var3) {
            int i2 = ((qs1) ((yr1) tb1Var.o()).g).i(tb1Var3);
            if (i2 < hc1Var.i) {
                m21.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = hc1Var.i;
            if (i3 != i2) {
                hc1Var.j(i2, i3);
            }
        }
        hc1Var.i++;
        hc1Var.m(tb1Var3, obj, false, rs0Var);
        return (pb1Var == pb1Var3 || pb1Var == pb1Var2) ? tb1Var3.m() : tb1Var3.l();
    }

    @Override // defpackage.k51
    public final bb1 getLayoutDirection() {
        return this.f;
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.g;
    }

    @Override // defpackage.en1
    public final dn1 o0(int i, int i2, Map map, ns0 ns0Var, ns0 ns0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            m21.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new ac1(i, i2, map, ns0Var, this, this.i, ns0Var2);
    }
}
