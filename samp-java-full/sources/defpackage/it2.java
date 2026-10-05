package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class it2 extends u10 {
    public static final qe s = new qe(0.0f);
    public static final qe t = new qe(1.0f);
    public final d42 b;
    public final d42 c;
    public Object d;
    public gk3 e;
    public long f;
    public final it1 g;
    public p73 h;
    public final z32 i;
    public jr j;
    public final dt1 k;
    public final at1 l;
    public long m;
    public final as1 n;
    public bt2 o;
    public final at2 p;
    public float q;
    public final at2 r;

    /* JADX WARN: Type inference failed for: r3v6, types: [at2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [at2] */
    public it2(qt1 qt1Var) {
        super(3);
        this.b = b32.w(qt1Var);
        this.c = b32.w(qt1Var);
        this.d = qt1Var;
        this.g = new it1(16, this);
        this.i = new z32(0.0f);
        this.k = new dt1();
        this.l = new at1();
        this.m = Long.MIN_VALUE;
        this.n = new as1();
        final int i = 0;
        this.p = new ns0(this) { // from class: at2
            public final /* synthetic */ it2 g;

            {
                this.g = this;
            }

            @Override // defpackage.ns0
            public final Object h(Object obj) {
                int i2 = i;
                dm3 dm3Var = dm3.a;
                it2 it2Var = this.g;
                long jLongValue = ((Long) obj).longValue();
                switch (i2) {
                    case 0:
                        it2Var.m = jLongValue;
                        break;
                    default:
                        long j = jLongValue - it2Var.m;
                        it2Var.m = jLongValue;
                        long jN = vm1.N(j / ((double) it2Var.q));
                        as1 as1Var = it2Var.n;
                        if (as1Var.j()) {
                            Object[] objArr = as1Var.a;
                            int i3 = as1Var.b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                bt2 bt2Var = (bt2) objArr[i5];
                                it2.v(bt2Var, jN);
                                bt2Var.c = true;
                            }
                            gk3 gk3Var = it2Var.e;
                            if (gk3Var != null) {
                                gk3Var.p();
                            }
                            int i6 = as1Var.b;
                            Object[] objArr2 = as1Var.a;
                            l41 l41VarS = y02.S(0, i6);
                            int i7 = l41VarS.f;
                            int i8 = l41VarS.g;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((bt2) objArr2[i7]).c) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            uj.O(i6 - i4, i6, null, objArr2);
                            as1Var.b -= i4;
                        }
                        bt2 bt2Var2 = it2Var.o;
                        if (bt2Var2 != null) {
                            bt2Var2.g = it2Var.f;
                            it2.v(bt2Var2, jN);
                            it2Var.y(bt2Var2.d);
                            if (bt2Var2.d == 1.0f) {
                                it2Var.o = null;
                            }
                            it2Var.x();
                        }
                        break;
                }
                return dm3Var;
            }
        };
        final int i2 = 1;
        this.r = new ns0(this) { // from class: at2
            public final /* synthetic */ it2 g;

            {
                this.g = this;
            }

            @Override // defpackage.ns0
            public final Object h(Object obj) {
                int i22 = i2;
                dm3 dm3Var = dm3.a;
                it2 it2Var = this.g;
                long jLongValue = ((Long) obj).longValue();
                switch (i22) {
                    case 0:
                        it2Var.m = jLongValue;
                        break;
                    default:
                        long j = jLongValue - it2Var.m;
                        it2Var.m = jLongValue;
                        long jN = vm1.N(j / ((double) it2Var.q));
                        as1 as1Var = it2Var.n;
                        if (as1Var.j()) {
                            Object[] objArr = as1Var.a;
                            int i3 = as1Var.b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                bt2 bt2Var = (bt2) objArr[i5];
                                it2.v(bt2Var, jN);
                                bt2Var.c = true;
                            }
                            gk3 gk3Var = it2Var.e;
                            if (gk3Var != null) {
                                gk3Var.p();
                            }
                            int i6 = as1Var.b;
                            Object[] objArr2 = as1Var.a;
                            l41 l41VarS = y02.S(0, i6);
                            int i7 = l41VarS.f;
                            int i8 = l41VarS.g;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((bt2) objArr2[i7]).c) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            uj.O(i6 - i4, i6, null, objArr2);
                            as1Var.b -= i4;
                        }
                        bt2 bt2Var2 = it2Var.o;
                        if (bt2Var2 != null) {
                            bt2Var2.g = it2Var.f;
                            it2.v(bt2Var2, jN);
                            it2Var.y(bt2Var2.d);
                            if (bt2Var2.d == 1.0f) {
                                it2Var.o = null;
                            }
                            it2Var.x();
                        }
                        break;
                }
                return dm3Var;
            }
        };
    }

    public static final void p(it2 it2Var) {
        z32 z32Var = it2Var.i;
        gk3 gk3Var = it2Var.e;
        if (gk3Var == null) {
            return;
        }
        bt2 bt2Var = it2Var.o;
        if (bt2Var == null) {
            if (it2Var.f <= 0 || z32Var.g() == 1.0f || s51.n(it2Var.c.getValue(), it2Var.b.getValue())) {
                bt2Var = null;
            } else {
                bt2Var = new bt2();
                bt2Var.d = z32Var.g();
                long j = it2Var.f;
                bt2Var.g = j;
                bt2Var.h = vm1.N((1.0d - ((double) z32Var.g())) * j);
                bt2Var.e.e(z32Var.g(), 0);
            }
        }
        if (bt2Var != null) {
            bt2Var.g = it2Var.f;
            it2Var.n.b(bt2Var);
            gk3Var.m(bt2Var);
        }
        it2Var.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(it2 it2Var, q40 q40Var) {
        dt2 dt2Var;
        as1 as1Var = it2Var.n;
        if (q40Var instanceof dt2) {
            dt2Var = (dt2) q40Var;
            int i = dt2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dt2Var.k = i - Integer.MIN_VALUE;
            } else {
                dt2Var = new dt2(it2Var, q40Var);
            }
        }
        o50 o50Var = dt2Var.g;
        Object obj = dt2Var.i;
        int i2 = dt2Var.k;
        dm3 dm3Var = dm3.a;
        Object obj2 = y50.f;
        if (i2 == 0) {
            y02.Q(obj);
            if (as1Var.i() && it2Var.o == null) {
                return dm3Var;
            }
            o50Var.getClass();
            if (t22.y(o50Var) == 0.0f) {
                it2Var.u();
                it2Var.m = Long.MIN_VALUE;
                return dm3Var;
            }
            if (it2Var.m == Long.MIN_VALUE) {
                at2 at2Var = it2Var.p;
                dt2Var.k = 1;
                o50Var.getClass();
                if (lq.I(o50Var).a(at2Var, dt2Var) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y02.Q(obj);
        do {
            if (!as1Var.j() && it2Var.o == null) {
                it2Var.m = Long.MIN_VALUE;
                return dm3Var;
            }
            dt2Var.k = 2;
        } while (it2Var.t(dt2Var) != obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(it2 it2Var, q40 q40Var) {
        gt2 gt2Var;
        Object value;
        Object obj;
        dt1 dt1Var = it2Var.k;
        if (q40Var instanceof gt2) {
            gt2Var = (gt2) q40Var;
            int i = gt2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                gt2Var.l = i - Integer.MIN_VALUE;
            } else {
                gt2Var = new gt2(it2Var, q40Var);
            }
        }
        Object obj2 = gt2Var.j;
        int i2 = gt2Var.l;
        y50 y50Var = y50.f;
        if (i2 == 0) {
            y02.Q(obj2);
            value = it2Var.b.getValue();
            gt2Var.i = value;
            gt2Var.l = 1;
            if (dt1Var.f(gt2Var) != y50Var) {
            }
            return y50Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = gt2Var.i;
            y02.Q(obj2);
            if (!s51.n(obj2, obj)) {
                return dm3.a;
            }
            it2Var.m = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        Object obj3 = gt2Var.i;
        y02.Q(obj2);
        value = obj3;
        gt2Var.i = value;
        gt2Var.l = 2;
        jr jrVar = new jr(1, vr.I(gt2Var));
        jrVar.s();
        it2Var.j = jrVar;
        dt1Var.i(null);
        Object objQ = jrVar.q();
        if (objQ != y50Var) {
            obj = value;
            obj2 = objQ;
            if (!s51.n(obj2, obj)) {
            }
        }
        return y50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(it2 it2Var, q40 q40Var) {
        ht2 ht2Var;
        Object value;
        Object obj;
        dt1 dt1Var = it2Var.k;
        if (q40Var instanceof ht2) {
            ht2Var = (ht2) q40Var;
            int i = ht2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ht2Var.l = i - Integer.MIN_VALUE;
            } else {
                ht2Var = new ht2(it2Var, q40Var);
            }
        }
        Object obj2 = ht2Var.j;
        int i2 = ht2Var.l;
        y50 y50Var = y50.f;
        if (i2 == 0) {
            y02.Q(obj2);
            value = it2Var.b.getValue();
            ht2Var.i = value;
            ht2Var.l = 1;
            if (dt1Var.f(ht2Var) != y50Var) {
            }
            return y50Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = ht2Var.i;
            y02.Q(obj2);
            if (!s51.n(obj2, obj)) {
                it2Var.m = Long.MIN_VALUE;
                throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
            }
            return dm3.a;
        }
        Object obj3 = ht2Var.i;
        y02.Q(obj2);
        value = obj3;
        if (s51.n(value, it2Var.d)) {
            dt1Var.i(null);
            return dm3.a;
        }
        ht2Var.i = value;
        ht2Var.l = 2;
        jr jrVar = new jr(1, vr.I(ht2Var));
        jrVar.s();
        it2Var.j = jrVar;
        dt1Var.i(null);
        Object objQ = jrVar.q();
        if (objQ != y50Var) {
            obj = value;
            obj2 = objQ;
            if (!s51.n(obj2, obj)) {
            }
            return dm3.a;
        }
        return y50Var;
    }

    public static void v(bt2 bt2Var, long j) {
        long j2 = bt2Var.a + j;
        bt2Var.a = j2;
        long j3 = bt2Var.h;
        if (j2 >= j3) {
            bt2Var.d = 1.0f;
            return;
        }
        cp3 cp3Var = bt2Var.b;
        qe qeVar = bt2Var.e;
        if (cp3Var == null) {
            float f = j2 / j3;
            bt2Var.d = (f * 1.0f) + ((1.0f - f) * qeVar.a(0));
            return;
        }
        qe qeVar2 = bt2Var.f;
        if (qeVar2 == null) {
            qeVar2 = s;
        }
        bt2Var.d = y02.g(((qe) cp3Var.p(j2, qeVar, t, qeVar2)).a(0), 0.0f, 1.0f);
    }

    @Override // defpackage.u10
    public final Object h() {
        return this.c.getValue();
    }

    @Override // defpackage.u10
    public final Object i() {
        return this.b.getValue();
    }

    @Override // defpackage.u10
    public final void m(Object obj) {
        this.c.setValue(obj);
    }

    @Override // defpackage.u10
    public final void n(gk3 gk3Var) {
        gk3 gk3Var2 = this.e;
        if (gk3Var2 != null && !gk3Var.equals(gk3Var2)) {
            ac2.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + gk3Var);
        }
        this.e = gk3Var;
    }

    @Override // defpackage.u10
    public final void o() {
        this.e = null;
        p73 p73Var = this.h;
        if (p73Var != null) {
            p73Var.b(this);
        }
    }

    public final Object t(q40 q40Var) {
        float fY = t22.y(q40Var.i());
        dm3 dm3Var = dm3.a;
        if (fY <= 0.0f) {
            u();
            return dm3Var;
        }
        this.q = fY;
        Object objA = lq.I(q40Var.i()).a(this.r, q40Var);
        return objA == y50.f ? objA : dm3Var;
    }

    public final void u() {
        gk3 gk3Var = this.e;
        if (gk3Var != null) {
            gk3Var.c();
        }
        this.n.e();
        if (this.o != null) {
            this.o = null;
            y(1.0f);
            x();
        }
    }

    public final Object w(float f, Object obj, mb3 mb3Var) {
        if (0.0f > f || f > 1.0f) {
            ac2.a("Expecting fraction between 0 and 1. Got " + f);
        }
        gk3 gk3Var = this.e;
        if (gk3Var != null) {
            Object objA = at1.a(this.l, new ft2(obj, this.b.getValue(), this, gk3Var, f, null), mb3Var);
            if (objA == y50.f) {
                return objA;
            }
        }
        return dm3.a;
    }

    public final void x() {
        gk3 gk3Var = this.e;
        if (gk3Var == null) {
            return;
        }
        gk3Var.l(vm1.N(((double) this.i.g()) * ((Number) gk3Var.m.getValue()).longValue()));
    }

    public final void y(float f) {
        this.i.h(f);
    }

    public final void z(p73 p73Var) {
        b4 b4Var;
        if (s51.n(this.h, p73Var)) {
            return;
        }
        p73 p73Var2 = this.h;
        if (p73Var2 != null) {
            p73Var2.b(this);
        }
        p73 p73Var3 = this.h;
        if (p73Var3 != null && (b4Var = p73Var3.h) != null) {
            b4Var.b();
        }
        this.h = p73Var;
        if (p73Var != null) {
            p73Var.e();
        }
        p73 p73Var4 = this.h;
        if (p73Var4 != null) {
            p73Var4.d(this, w7.i0, this.g);
        }
    }
}
