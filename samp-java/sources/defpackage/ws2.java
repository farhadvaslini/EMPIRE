package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, defpackage.q40 r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.ss2
            if (r0 == 0) goto L13
            r0 = r13
            ss2 r0 = (defpackage.ss2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ss2 r0 = new ss2
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.j
            int r1 = r0.l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            pk2 r11 = r0.i
            defpackage.y02.Q(r13)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L58
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L68
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r10)
            r10 = 0
            return r10
        L34:
            defpackage.y02.Q(r13)
            pk2 r6 = new pk2
            r6.<init>()
            r6.f = r11
            r10.i = r3
            ts1 r13 = defpackage.ts1.f     // Catch: java.lang.Throwable -> L65
            b72 r4 = new b72     // Catch: java.lang.Throwable -> L65
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L62
            r0.i = r6     // Catch: java.lang.Throwable -> L62
            r0.l = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r10 = r5.g(r13, r4, r0)     // Catch: java.lang.Throwable -> L62
            y50 r11 = defpackage.y50.f
            if (r10 != r11) goto L57
            return r11
        L57:
            r11 = r6
        L58:
            r5.i = r2
            long r10 = r11.f
            lp3 r12 = new lp3
            r12.<init>(r10)
            return r12
        L62:
            r0 = move-exception
        L63:
            r11 = r0
            goto L68
        L65:
            r0 = move-exception
            r5 = r10
            goto L63
        L68:
            r5.i = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws2.a(long, q40):java.lang.Object");
    }

    public final boolean b() {
        w8 w8Var;
        return this.a.c() || this.a.a() || ((w8Var = this.b) != null && w8Var.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, boolean r7, defpackage.mb3 r8) {
        /*
            r4 = this;
            dm3 r0 = defpackage.dm3.a
            if (r7 == 0) goto Ld
            rm0 r7 = r4.c
            is2 r1 = defpackage.ks2.a
            boolean r7 = r7 instanceof defpackage.s80
            if (r7 == 0) goto Ld
            goto L43
        Ld:
            t02 r7 = r4.d
            t02 r1 = defpackage.t02.g
            r2 = 0
            if (r7 != r1) goto L1a
            r7 = 1
        L15:
            long r5 = defpackage.lp3.a(r5, r2, r2, r7)
            goto L1c
        L1a:
            r7 = 2
            goto L15
        L1c:
            vs2 r7 = new vs2
            r1 = 0
            r7.<init>(r4, r1)
            w8 r1 = r4.b
            y50 r2 = defpackage.y50.f
            if (r1 == 0) goto L35
            boolean r3 = r4.b()
            if (r3 == 0) goto L35
            java.lang.Object r4 = r1.b(r5, r7, r8)
            if (r4 != r2) goto L43
            return r4
        L35:
            vs2 r7 = new vs2
            r7.<init>(r4, r8)
            r7.l = r5
            java.lang.Object r4 = r7.o(r0)
            if (r4 != r2) goto L43
            return r4
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws2.c(long, boolean, mb3):java.lang.Object");
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
