package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rr implements qf0 {
    public final qr f;
    public final pi g;
    public w9 h;
    public w9 i;

    public rr() {
        xa0 xa0Var = gv3.s;
        qr qrVar = new qr();
        qrVar.a = xa0Var;
        qrVar.b = bb1.f;
        qrVar.c = ki0.a;
        qrVar.d = 0L;
        this.f = qrVar;
        this.g = new pi(this);
    }

    public static w9 c(rr rrVar, long j, rf0 rf0Var, float f, int i) {
        w9 w9VarY = rrVar.y(rf0Var);
        if (f != 1.0f) {
            j = wx.b(wx.d(j) * f, j);
        }
        if (!wx.c(w9VarY.c(), j)) {
            w9VarY.h(j);
        }
        if (((Shader) w9VarY.c) != null) {
            w9VarY.l(null);
        }
        if (!s51.n((yx) w9VarY.d, null)) {
            w9VarY.i(null);
        }
        if (w9VarY.a != i) {
            w9VarY.g(i);
        }
        if (((Paint) w9VarY.b).isFilterBitmap()) {
            return w9VarY;
        }
        w9VarY.j(1);
        return w9VarY;
    }

    @Override // defpackage.qf0
    public final void A(da daVar, long j, float f, rf0 rf0Var) {
        this.f.c.h(daVar, c(this, j, rf0Var, f, 3));
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.f.a.G();
    }

    @Override // defpackage.qf0
    public final void O0(long j, float f, long j2, rf0 rf0Var) {
        this.f.c.d(f, j2, c(this, j, rf0Var, 1.0f, 3));
    }

    @Override // defpackage.qf0
    public final void S(long j, long j2, long j3, long j4, rf0 rf0Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f.c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), c(this, j, rf0Var, 1.0f, 3));
    }

    @Override // defpackage.qf0
    public final void W(long j, long j2, long j3, float f, rf0 rf0Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), c(this, j, rf0Var, f, i));
    }

    @Override // defpackage.qf0
    public final void X(long j, float f, float f2, long j2, long j3, float f3, ga3 ga3Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, c(this, j, ga3Var, f3, 3));
    }

    @Override // defpackage.qf0
    public final pi Z() {
        return this.g;
    }

    @Override // defpackage.qf0
    public final bb1 getLayoutDirection() {
        return this.f.b;
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.f.a.h();
    }

    public final w9 i(dp dpVar, rf0 rf0Var, float f, yx yxVar, int i, int i2) {
        w9 w9VarY = y(rf0Var);
        Paint paint = (Paint) w9VarY.b;
        if (dpVar != null) {
            dpVar.a(f, a(), w9VarY);
        } else {
            if (((Shader) w9VarY.c) != null) {
                w9VarY.l(null);
            }
            long jC = w9VarY.c();
            long j = wx.b;
            if (!wx.c(jC, j)) {
                w9VarY.h(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                w9VarY.f(f);
            }
        }
        if (!s51.n((yx) w9VarY.d, yxVar)) {
            w9VarY.i(yxVar);
        }
        if (w9VarY.a != i) {
            w9VarY.g(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return w9VarY;
        }
        w9VarY.j(i2);
        return w9VarY;
    }

    public final void t(g9 g9Var, xm xmVar) {
        this.f.c.a(g9Var, i(null, fm0.a, 1.0f, xmVar, 3, 1));
    }

    @Override // defpackage.qf0
    public final void v0(long j, long j2, long j3, float f, int i) {
        pr prVar = this.f.c;
        w9 w9VarD = this.i;
        if (w9VarD == null) {
            w9VarD = cl3.d();
            w9VarD.p(1);
            this.i = w9VarD;
        }
        Paint paint = (Paint) w9VarD.b;
        if (!wx.c(w9VarD.c(), j)) {
            w9VarD.h(j);
        }
        if (((Shader) w9VarD.c) != null) {
            w9VarD.l(null);
        }
        if (!s51.n((yx) w9VarD.d, null)) {
            w9VarD.i(null);
        }
        if (w9VarD.a != 3) {
            w9VarD.g(3);
        }
        if (paint.getStrokeWidth() != f) {
            w9VarD.o(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (w9VarD.d() != i) {
            w9VarD.m(i);
        }
        if (w9VarD.e() != 0) {
            w9VarD.n(0);
        }
        if (!s51.n(null, null)) {
            w9VarD.k(null);
        }
        if (!paint.isFilterBitmap()) {
            w9VarD.j(1);
        }
        prVar.m(j2, j3, w9VarD);
    }

    @Override // defpackage.qf0
    public final void w0(g9 g9Var, long j, long j2, long j3, float f, yx yxVar, int i) {
        this.f.c.e(g9Var, j, j2, j3, i(null, fm0.a, f, yxVar, 3, i));
    }

    @Override // defpackage.qf0
    public final void x(dp dpVar, long j, long j2, float f, rf0 rf0Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.f.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), i(dpVar, rf0Var, f, null, i, 1));
    }

    public final w9 y(rf0 rf0Var) {
        if (s51.n(rf0Var, fm0.a)) {
            w9 w9Var = this.h;
            if (w9Var != null) {
                return w9Var;
            }
            w9 w9VarD = cl3.d();
            w9VarD.p(0);
            this.h = w9VarD;
            return w9VarD;
        }
        if (!(rf0Var instanceof ga3)) {
            c.k();
            return null;
        }
        w9 w9VarD2 = this.i;
        if (w9VarD2 == null) {
            w9VarD2 = cl3.d();
            w9VarD2.p(1);
            this.i = w9VarD2;
        }
        Paint paint = (Paint) w9VarD2.b;
        float strokeWidth = paint.getStrokeWidth();
        ga3 ga3Var = (ga3) rf0Var;
        float f = ga3Var.a;
        if (strokeWidth != f) {
            w9VarD2.o(f);
        }
        int iD = w9VarD2.d();
        int i = ga3Var.c;
        if (iD != i) {
            w9VarD2.m(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = ga3Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iE = w9VarD2.e();
        int i2 = ga3Var.d;
        if (iE != i2) {
            w9VarD2.n(i2);
        }
        if (!s51.n(null, null)) {
            w9VarD2.k(null);
        }
        return w9VarD2;
    }

    @Override // defpackage.qf0
    public final void z(da daVar, dp dpVar, float f, rf0 rf0Var, int i) {
        this.f.c.h(daVar, i(dpVar, rf0Var, f, null, i, 1));
    }
}
