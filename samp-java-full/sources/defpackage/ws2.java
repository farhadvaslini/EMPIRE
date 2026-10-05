package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ws2 {
    public qs2 a;
    public w8 b;
    public rm0 c;
    public t02 d;
    public boolean e;
    public gw1 f;
    public final ps2 g;
    public final ns2 h;
    public boolean i;
    public int j = 1;
    public cs2 k = ks2.a;
    public final us2 l = new us2(this);
    public final xc1 m = new xc1(25, this);

    public ws2(qs2 qs2Var, w8 w8Var, rm0 rm0Var, t02 t02Var, boolean z, gw1 gw1Var, ps2 ps2Var, ns2 ns2Var) {
        this.a = qs2Var;
        this.b = w8Var;
        this.c = rm0Var;
        this.d = t02Var;
        this.e = z;
        this.f = gw1Var;
        this.g = ps2Var;
        this.h = ns2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, q40 q40Var) throws Throwable {
        ss2 ss2Var;
        ws2 ws2Var;
        Throwable th;
        pk2 pk2Var;
        if (q40Var instanceof ss2) {
            ss2Var = (ss2) q40Var;
            int i = ss2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ss2Var.l = i - Integer.MIN_VALUE;
            } else {
                ss2Var = new ss2(this, q40Var);
            }
        }
        Object obj = ss2Var.j;
        int i2 = ss2Var.l;
        if (i2 != 0) {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pk2Var = ss2Var.i;
            try {
                y02.Q(obj);
                ws2Var = this;
                ws2Var.i = false;
                return new lp3(pk2Var.f);
            } catch (Throwable th2) {
                th = th2;
                ws2Var = this;
                ws2Var.i = false;
                throw th;
            }
        }
        y02.Q(obj);
        pk2 pk2Var2 = new pk2();
        pk2Var2.f = j;
        this.i = true;
        try {
            ts1 ts1Var = ts1.f;
            ws2Var = this;
            try {
                b72 b72Var = new b72(ws2Var, pk2Var2, j, (p40) null);
                ss2Var.i = pk2Var2;
                ss2Var.l = 1;
                Object objG = ws2Var.g(ts1Var, b72Var, ss2Var);
                y50 y50Var = y50.f;
                if (objG == y50Var) {
                    return y50Var;
                }
                pk2Var = pk2Var2;
                ws2Var.i = false;
                return new lp3(pk2Var.f);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                ws2Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            ws2Var = this;
        }
    }

    public final boolean b() {
        w8 w8Var;
        return this.a.c() || this.a.a() || ((w8Var = this.b) != null && w8Var.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j, boolean z, mb3 mb3Var) {
        dm3 dm3Var = dm3.a;
        if (z) {
            rm0 rm0Var = this.c;
            is2 is2Var = ks2.a;
            if (!(rm0Var instanceof s80)) {
                long jA = lp3.a(j, 0.0f, 0.0f, this.d == t02.g ? 1 : 2);
                vs2 vs2Var = new vs2(this, null);
                w8 w8Var = this.b;
                y50 y50Var = y50.f;
                if (w8Var == null || !b()) {
                    vs2 vs2Var2 = new vs2(this, mb3Var);
                    vs2Var2.l = jA;
                    Object objO = vs2Var2.o(dm3Var);
                    if (objO == y50Var) {
                        return objO;
                    }
                } else {
                    Object objB = w8Var.b(jA, vs2Var, mb3Var);
                    if (objB == y50Var) {
                        return objB;
                    }
                }
            }
        }
        return dm3Var;
    }

    public final long d(cs2 cs2Var, long j, int i) {
        kw1 kw1Var = this.f.a;
        kw1 kw1VarQ1 = kw1Var != null ? kw1Var.q1() : null;
        long jQ0 = kw1VarQ1 != null ? kw1VarQ1.Q0(i, j) : 0L;
        long jD = gy1.d(j, jQ0);
        long jF = f(i(cs2Var.a(h(f(this.d == t02.g ? gy1.a(jD, 0.0f, 1) : gy1.a(jD, 0.0f, 2))))));
        ps2 ps2Var = this.g;
        if (ps2Var.s) {
            ViewTreeObserver viewTreeObserver = ((h7) vr.Y(ps2Var)).getViewTreeObserver();
            try {
                if (h7.S0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    h7.S0 = declaredMethod;
                }
                Method method = h7.S0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jD2 = gy1.d(jD, jF);
        kw1 kw1Var2 = this.f.a;
        kw1 kw1VarQ12 = kw1Var2 != null ? kw1Var2.q1() : null;
        return gy1.e(gy1.e(jQ0, jF), kw1VarQ12 != null ? kw1VarQ12.l0(jF, i, jD2) : 0L);
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? gy1.f(-1.0f, j) : j;
    }

    public final Object g(ts1 ts1Var, rs0 rs0Var, q40 q40Var) {
        Object objD = this.a.d(ts1Var, new ri2(this, rs0Var, (p40) null, 4), q40Var);
        return objD == y50.f ? objD : dm3.a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat((int) (this.d == t02.g ? j >> 32 : j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == t02.g) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        t02 t02Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (t02Var == t02.f) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (t02Var == t02.g) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
