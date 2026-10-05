package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class o63 implements rm0 {
    public final a31 a;
    public final h80 b;
    public final s83 c;
    public final ub0 d = ks2.b;

    public o63(a31 a31Var, h80 h80Var, s83 s83Var) {
        this.a = a31Var;
        this.b = h80Var;
        this.c = s83Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o63 o63Var, cs2 cs2Var, float f, float f2, l63 l63Var, q40 q40Var) {
        n63 n63Var;
        xi k71Var;
        if (q40Var instanceof n63) {
            n63Var = (n63) q40Var;
            int i = n63Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                n63Var.k = i - Integer.MIN_VALUE;
            } else {
                n63Var = new n63(o63Var, q40Var);
            }
        }
        n63 n63Var2 = n63Var;
        Object objD = n63Var2.i;
        int i2 = n63Var2.k;
        if (i2 == 0) {
            y02.Q(objD);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return cl3.c(f, f2, 28);
            }
            n63Var2.k = 1;
            h80 h80Var = o63Var.b;
            if (Math.abs(((qe) new pl(12, h80Var.a).w(new qe(0.0f), new qe(f2))).a) >= Math.abs(f)) {
                k71Var = new yl1(19, h80Var);
            } else {
                k71Var = new k71(21, o63Var.c);
            }
            objD = k71Var.d(cs2Var, new Float(f), new Float(f2), l63Var, n63Var2);
            y50 y50Var = y50.f;
            if (objD == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objD);
        }
        return ((le) objD).b;
    }

    @Override // defpackage.rm0
    public Object a(ts2 ts2Var, float f, p40 p40Var) {
        return d(ts2Var, f, w7.h0, (q40) p40Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cs2 cs2Var, float f, ns0 ns0Var, q40 q40Var) {
        k63 k63Var;
        ns0 ns0Var2;
        if (q40Var instanceof k63) {
            k63Var = (k63) q40Var;
            int i = k63Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                k63Var.l = i - Integer.MIN_VALUE;
            } else {
                k63Var = new k63(this, q40Var);
            }
        }
        Object objG = k63Var.j;
        int i2 = k63Var.l;
        if (i2 == 0) {
            y02.Q(objG);
            r80 r80Var = new r80(this, f, ns0Var, cs2Var, null);
            k63Var.i = ns0Var;
            k63Var.l = 1;
            objG = cl3.G(this.d, r80Var, k63Var);
            y50 y50Var = y50.f;
            if (objG == y50Var) {
                return y50Var;
            }
            ns0Var2 = ns0Var;
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ns0Var2 = k63Var.i;
            y02.Q(objG);
        }
        le leVar = (le) objG;
        ns0Var2.h(new Float(0.0f));
        return leVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cs2 cs2Var, float f, ns0 ns0Var, q40 q40Var) {
        m63 m63Var;
        if (q40Var instanceof m63) {
            m63Var = (m63) q40Var;
            int i = m63Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                m63Var.k = i - Integer.MIN_VALUE;
            } else {
                m63Var = new m63(this, q40Var);
            }
        }
        Object objC = m63Var.i;
        int i2 = m63Var.k;
        if (i2 == 0) {
            y02.Q(objC);
            m63Var.k = 1;
            objC = c(cs2Var, f, ns0Var, m63Var);
            Object obj = y50.f;
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objC);
        }
        le leVar = (le) objC;
        return new Float(leVar.a.floatValue() != 0.0f ? ((Number) leVar.b.a()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o63) {
            o63 o63Var = (o63) obj;
            return o63Var.c.equals(this.c) && s51.n(o63Var.b, this.b) && o63Var.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
