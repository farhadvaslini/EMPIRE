package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bc extends TextPaint {
    public w9 a;
    public ne3 b;
    public int c;
    public r13 d;
    public wx e;
    public dp f;
    public cb0 g;
    public h43 h;
    public rf0 i;

    public final w9 a() {
        w9 w9Var = this.a;
        if (w9Var != null) {
            return w9Var;
        }
        w9 w9Var2 = new w9(this);
        this.a = w9Var2;
        return w9Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().g(i);
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final defpackage.dp r4, final long r5, float r7) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Ld
            r3.g = r0
            r3.f = r0
            r3.h = r0
            r3.setShader(r0)
            return
        Ld:
            boolean r1 = r4 instanceof defpackage.w73
            if (r1 == 0) goto L1d
            w73 r4 = (defpackage.w73) r4
            long r4 = r4.a
            long r4 = defpackage.b32.v(r7, r4)
            r3.d(r4)
            return
        L1d:
            boolean r1 = r4 instanceof defpackage.o13
            if (r1 == 0) goto L6d
            dp r1 = r3.f
            boolean r1 = defpackage.s51.n(r1, r4)
            if (r1 == 0) goto L37
            h43 r1 = r3.h
            if (r1 != 0) goto L2f
            r1 = 0
            goto L35
        L2f:
            long r1 = r1.a
            boolean r1 = defpackage.h43.a(r1, r5)
        L35:
            if (r1 != 0) goto L54
        L37:
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L54
            r3.f = r4
            h43 r1 = new h43
            r1.<init>(r5)
            r3.h = r1
            ac r1 = new ac
            r1.<init>()
            cb0 r4 = defpackage.b32.j(r1)
            r3.g = r4
        L54:
            w9 r4 = r3.a()
            cb0 r5 = r3.g
            if (r5 == 0) goto L63
            java.lang.Object r5 = r5.getValue()
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            goto L64
        L63:
            r5 = r0
        L64:
            r4.l(r5)
            r3.e = r0
            defpackage.f80.O(r3, r7)
            return
        L6d:
            defpackage.c.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc.c(dp, long, float):void");
    }

    public final void d(long j) {
        wx wxVar = this.e;
        if ((wxVar == null ? false : wx.c(wxVar.a, j)) || j == 16) {
            return;
        }
        this.e = new wx(j);
        setColor(vp.T(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(rf0 rf0Var) {
        if (rf0Var == null || s51.n(this.i, rf0Var)) {
            return;
        }
        this.i = rf0Var;
        if (rf0Var.equals(fm0.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(rf0Var instanceof ga3)) {
            c.k();
            return;
        }
        a().p(1);
        ga3 ga3Var = (ga3) rf0Var;
        a().o(ga3Var.a);
        w9 w9VarA = a();
        ((Paint) w9VarA.b).setStrokeMiter(ga3Var.b);
        a().n(ga3Var.d);
        a().m(ga3Var.c);
        a().k(null);
    }

    public final void f(r13 r13Var) {
        if (r13Var == null || s51.n(this.d, r13Var)) {
            return;
        }
        this.d = r13Var;
        if (r13Var.equals(r13.d)) {
            clearShadowLayer();
            return;
        }
        r13 r13Var2 = this.d;
        float f = r13Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (r13Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), vp.T(this.d.a));
    }

    public final void g(ne3 ne3Var) {
        if (ne3Var == null || s51.n(this.b, ne3Var)) {
            return;
        }
        this.b = ne3Var;
        int i = ne3Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
