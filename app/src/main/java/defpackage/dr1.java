package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dr1 {
    public af a;
    public zp0 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public cp1 h;
    public ua0 j;
    public gh3 k;
    public qk l;
    public bb1 m;
    public pg3 n;
    public long q;
    public long i = q21.a;
    public int o = -1;
    public int p = -1;

    public dr1(af afVar, gh3 gh3Var, zp0 zp0Var, int i, boolean z, int i2, int i3, List list) {
        this.a = afVar;
        this.b = zp0Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = gh3Var;
    }

    public final int a(int i, bb1 bb1Var) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = n30.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            cp1 cp1Var = this.h;
            gh3 gh3Var = this.k;
            ua0 ua0Var = this.j;
            ua0Var.getClass();
            cp1 cp1VarZ = vr.z(cp1Var, bb1Var, gh3Var, ua0Var, this.b);
            this.h = cp1VarZ;
            jA = cp1VarZ.a(this.f, jA);
        }
        int iJ = w22.j(b(jA, bb1Var).e);
        int iJ2 = m30.j(jA);
        if (iJ < iJ2) {
            iJ = iJ2;
        }
        this.o = i;
        this.p = iJ;
        return iJ;
    }

    public final br1 b(long j, bb1 bb1Var) {
        qk qkVarE = e(bb1Var);
        long jR = br.r(qkVarE.c(), this.c, j, this.d);
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new br1(qkVarE, jR, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, bb1 bb1Var) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            cp1 cp1Var = this.h;
            gh3 gh3Var = this.k;
            ua0 ua0Var = this.j;
            ua0Var.getClass();
            cp1 cp1VarZ = vr.z(cp1Var, bb1Var, gh3Var, ua0Var, this.b);
            this.h = cp1VarZ;
            j = cp1VarZ.a(this.f, j);
        }
        pg3 pg3Var = this.n;
        if (pg3Var != null) {
            br1 br1Var = pg3Var.b;
            og3 og3Var = pg3Var.a;
            if (!br1Var.a.b()) {
                bb1 bb1Var2 = og3Var.h;
                long j2 = og3Var.j;
                if (bb1Var == bb1Var2 && (m30.c(j, j2) || (m30.i(j) == m30.i(j2) && m30.k(j) == m30.k(j2) && m30.h(j) >= br1Var.e && !br1Var.c))) {
                    pg3 pg3Var2 = this.n;
                    pg3Var2.getClass();
                    if (m30.c(j, pg3Var2.a.j)) {
                        return false;
                    }
                    pg3 pg3Var3 = this.n;
                    pg3Var3.getClass();
                    this.n = f(bb1Var, j, pg3Var3.b);
                    return true;
                }
            }
        }
        this.n = f(bb1Var, j, b(j, bb1Var));
        return true;
    }

    public final void d(ua0 ua0Var) {
        long jA;
        ua0 ua0Var2 = this.j;
        if (ua0Var != null) {
            int i = q21.b;
            jA = q21.a(ua0Var.h(), ua0Var.G());
        } else {
            jA = q21.a;
        }
        if (ua0Var2 == null) {
            this.j = ua0Var;
            this.i = jA;
        } else if (ua0Var == null || this.i != jA) {
            this.j = ua0Var;
            this.i = jA;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final qk e(bb1 bb1Var) {
        qk qkVar = this.l;
        if (qkVar == null || bb1Var != this.m || qkVar.b()) {
            this.m = bb1Var;
            af afVar = this.a;
            gh3 gh3VarY = n32.y(this.k, bb1Var);
            ua0 ua0Var = this.j;
            ua0Var.getClass();
            zp0 zp0Var = this.b;
            List list = this.g;
            if (list == null) {
                list = ni0.f;
            }
            qkVar = new qk(afVar, ua0Var, zp0Var, gh3VarY, list, this.d);
        }
        this.l = qkVar;
        return qkVar;
    }

    public final pg3 f(bb1 bb1Var, long j, br1 br1Var) {
        float fMin = Math.min(br1Var.a.c(), br1Var.d);
        af afVar = this.a;
        gh3 gh3Var = this.k;
        List list = this.g;
        if (list == null) {
            list = ni0.f;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        ua0 ua0Var = this.j;
        ua0Var.getClass();
        return new pg3(new og3(afVar, gh3Var, list, i, z, i2, ua0Var, bb1Var, this.b, j), br1Var, n30.d(j, (((long) w22.j(fMin)) << 32) | (((long) w22.j(br1Var.e)) & 4294967295L)));
    }

    public final void g(af afVar, gh3 gh3Var, zp0 zp0Var, int i, boolean z, int i2, int i3, List list) {
        this.a = afVar;
        boolean zC = gh3Var.c(this.k);
        this.k = gh3Var;
        if (!zC) {
            this.q <<= 2;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
        this.b = zp0Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.q = (this.q << 2) | 2;
        this.l = null;
        this.n = null;
        this.p = -1;
        this.o = -1;
    }

    public final String toString() {
        og3 og3Var;
        Object m30Var = "null";
        String str = this.n != null ? "<TextLayoutResult>" : "null";
        String strB = q21.b(this.i);
        long j = this.q;
        pg3 pg3Var = this.n;
        if (pg3Var != null && (og3Var = pg3Var.a) != null) {
            m30Var = new m30(og3Var.j);
        }
        StringBuilder sbN = nc2.n("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", strB, ", history=");
        sbN.append(j);
        sbN.append(", constraints=");
        sbN.append(m30Var);
        sbN.append(")");
        return sbN.toString();
    }
}
