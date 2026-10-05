package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ub1 {
    public final m5 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public m5 h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public ub1(m5 m5Var, int i) {
        this.j = i;
        this.a = m5Var;
    }

    public final void a(i5 i5Var, int i, ex1 ex1Var) {
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jE = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (this.j) {
                    case 0:
                        p12 p12Var = ex1Var.a0;
                        if (p12Var != null) {
                            tw0 tw0Var = (tw0) p12Var;
                            float[] fArrB = tw0Var.b();
                            if (!tw0Var.x) {
                                jE = wm1.b(jE, fArrB);
                            }
                        }
                        jE = uq.E(jE, ex1Var.M);
                        break;
                    default:
                        cl1 cl1VarU1 = ex1Var.u1();
                        cl1VarU1.getClass();
                        long j = cl1VarU1.A;
                        jE = gy1.e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jE);
                        break;
                }
                ex1Var = ex1Var.D;
                ex1Var.getClass();
                if (ex1Var.equals(this.a.I())) {
                    int iRound = Math.round(i5Var instanceof ry0 ? Float.intBitsToFloat((int) (jE & 4294967295L)) : Float.intBitsToFloat((int) (jE >> 32)));
                    HashMap map = this.i;
                    if (map.containsKey(i5Var)) {
                        map.getClass();
                        Object obj = map.get(i5Var);
                        if (obj == null && !map.containsKey(i5Var)) {
                            throw new NoSuchElementException("Key " + i5Var + " is missing in the map.");
                        }
                        int iIntValue = ((Number) obj).intValue();
                        ry0 ry0Var = l5.a;
                        iRound = ((Number) i5Var.a.f(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(i5Var, Integer.valueOf(iRound));
                    return;
                }
            } while (!b(ex1Var).containsKey(i5Var));
            float fC = c(ex1Var, i5Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(ex1 ex1Var) {
        switch (this.j) {
            case 0:
                return ex1Var.d1().c();
            default:
                cl1 cl1VarU1 = ex1Var.u1();
                cl1VarU1.getClass();
                return cl1VarU1.d1().c();
        }
    }

    public final int c(ex1 ex1Var, i5 i5Var) {
        switch (this.j) {
            case 0:
                return ex1Var.z0(i5Var);
            default:
                cl1 cl1VarU1 = ex1Var.u1();
                cl1VarU1.getClass();
                return cl1VarU1.z0(i5Var);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        m5 m5Var = this.a;
        m5 m5VarK = m5Var.K();
        if (m5VarK == null) {
            return;
        }
        if (this.c) {
            m5VarK.s0();
        } else if (this.e || this.d) {
            m5VarK.requestLayout();
        }
        if (this.f) {
            m5Var.s0();
        }
        if (this.g) {
            m5Var.requestLayout();
        }
        m5VarK.c().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        s sVar = new s(3, this);
        m5 m5Var = this.a;
        m5Var.C(sVar);
        map.putAll(b(m5Var.I()));
        this.b = false;
    }

    public final void h() {
        ub1 ub1VarC;
        ub1 ub1VarC2;
        boolean zD = d();
        m5 m5Var = this.a;
        if (!zD) {
            m5 m5VarK = m5Var.K();
            if (m5VarK == null) {
                return;
            }
            m5Var = m5VarK.c().h;
            if (m5Var == null || !m5Var.c().d()) {
                m5 m5Var2 = this.h;
                if (m5Var2 == null || m5Var2.c().d()) {
                    return;
                }
                m5 m5VarK2 = m5Var2.K();
                if (m5VarK2 != null && (ub1VarC2 = m5VarK2.c()) != null) {
                    ub1VarC2.h();
                }
                m5 m5VarK3 = m5Var2.K();
                m5Var = (m5VarK3 == null || (ub1VarC = m5VarK3.c()) == null) ? null : ub1VarC.h;
            }
        }
        this.h = m5Var;
    }
}
