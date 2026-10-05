package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ai3 extends aq1 implements kb1 {
    public float A;
    public t41 t;
    public boolean u;
    public s83 v;
    public boolean w;
    public ed x;
    public ed y;
    public float z;

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.aq1
    public final void h1() {
        cl3.t(d1(), null, new l80(this, null, 17), 3);
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        float f = gv3.t0;
        int i = 0;
        int i2 = 1;
        float fT = en1Var.T(this.w ? gv3.m0 : ((xm1Var.y(m30.i(j)) != 0 && xm1Var.u0(m30.h(j)) != 0) || this.u) ? wb3.a : wb3.b);
        ed edVar = this.y;
        int iFloatValue = (int) (edVar != null ? ((Number) edVar.d()).floatValue() : fT);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            o21.a("width and height must be >= 0");
        }
        i62 i62VarT = xm1Var.t(n30.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fT2 = en1Var.T((wb3.d - en1Var.a1(fT)) / 2.0f);
        float fT3 = en1Var.T((wb3.c - wb3.a) - wb3.e);
        boolean z = this.w;
        if (z && this.u) {
            fT2 = fT3 - en1Var.T(f);
        } else if (z && !this.u) {
            fT2 = en1Var.T(f);
        } else if (this.u) {
            fT2 = fT3;
        }
        ed edVar2 = this.y;
        p40 p40Var = null;
        Float f2 = edVar2 != null ? (Float) edVar2.e.getValue() : null;
        if (f2 == null || f2.floatValue() != fT) {
            cl3.t(d1(), null, new zh3(this, fT, p40Var, i), 3);
        }
        ed edVar3 = this.x;
        Float f3 = edVar3 != null ? (Float) edVar3.e.getValue() : null;
        if (f3 == null || f3.floatValue() != fT2) {
            cl3.t(d1(), null, new zh3(this, fT2, p40Var, i2), 3);
        }
        if (Float.isNaN(this.A) && Float.isNaN(this.z)) {
            this.A = fT;
            this.z = fT2;
        }
        return en1Var.I0(iFloatValue, iFloatValue, oi0.f, new j8(i62VarT, this, fT2, 2));
    }
}
