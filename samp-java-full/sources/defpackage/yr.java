package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yr {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public yr(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e93 a(boolean z, qr1 qr1Var, nv0 nv0Var, int i) {
        ed edVar;
        nv0Var.a0(-1763481333);
        float f = this.a;
        Object obj = c20.a;
        if (qr1Var == null) {
            nv0Var.a0(167751211);
            Object objO = nv0Var.O();
            Object obj2 = objO;
            if (objO == obj) {
                Object objW = b32.w(new jd0(f));
                nv0Var.j0(objW);
                obj2 = objW;
            }
            os1 os1Var = (os1) obj2;
            nv0Var.p(false);
            nv0Var.p(false);
            return os1Var;
        }
        nv0Var.a0(167824247);
        nv0Var.p(false);
        Object objO2 = nv0Var.O();
        Object obj3 = objO2;
        if (objO2 == obj) {
            Object l73Var = new l73();
            nv0Var.j0(l73Var);
            obj3 = l73Var;
        }
        l73 l73Var2 = (l73) obj3;
        int i2 = 1;
        boolean z2 = (((i & 112) ^ 48) > 32 && nv0Var.f(qr1Var)) || (i & 48) == 32;
        Object objO3 = nv0Var.O();
        p40 p40Var = null;
        Object obj4 = objO3;
        if (z2 || objO3 == obj) {
            Object zpVar = new zp(qr1Var, l73Var2, p40Var, i2);
            nv0Var.j0(zpVar);
            obj4 = zpVar;
        }
        rn.l((rs0) obj4, nv0Var, qr1Var);
        s41 s41Var = (s41) qx.z0(l73Var2);
        if (z) {
            if (s41Var instanceof zc2) {
                f = this.b;
            } else if (s41Var instanceof zy0) {
                f = this.c;
            } else if (s41Var instanceof wo0) {
                f = 0.0f;
            } else if (s41Var instanceof ue0) {
                f = this.d;
            }
        }
        Object objO4 = nv0Var.O();
        Object obj5 = objO4;
        if (objO4 == obj) {
            Object edVar2 = new ed(new jd0(f), rn.h1, null, 12);
            nv0Var.j0(edVar2);
            obj5 = edVar2;
        }
        ed edVar3 = (ed) obj5;
        jd0 jd0Var = new jd0(f);
        int i3 = (nv0Var.h(edVar3) ? 1 : 0) | (nv0Var.c(f) ? 1 : 0) | (((((i & 14) ^ 6) <= 4 || !nv0Var.g(z)) && (i & 6) != 4) ? 0 : 1);
        if ((((i & 896) ^ 384) <= 256 || !nv0Var.f(this)) && (i & 384) != 256) {
            i2 = 0;
        }
        int i4 = i3 | i2 | (nv0Var.h(s41Var) ? 1 : 0);
        Object objO5 = nv0Var.O();
        if (i4 != 0 || objO5 == obj) {
            edVar = edVar3;
            Object aqVar = new aq(edVar, f, z, this, s41Var, null, 1);
            nv0Var.j0(aqVar);
            objO5 = aqVar;
        } else {
            edVar = edVar3;
        }
        rn.l((rs0) objO5, nv0Var, jd0Var);
        pe peVar = edVar.c;
        nv0Var.p(false);
        return peVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yr)) {
            return false;
        }
        yr yrVar = (yr) obj;
        return jd0.b(this.a, yrVar.a) && jd0.b(this.b, yrVar.b) && jd0.b(0.0f, 0.0f) && jd0.b(this.c, yrVar.c) && jd0.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + nc2.a(nc2.a(nc2.a(Float.hashCode(this.a) * 31, this.b, 31), 0.0f, 31), this.c, 31);
    }
}
