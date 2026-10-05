package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qw0 {
    public boolean A;
    public RectF B;
    public final sw0 a;
    public Outline f;
    public float j;
    public vr k;
    public da l;
    public da m;
    public boolean n;
    public rr o;
    public w9 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public ua0 b = gv3.s;
    public bb1 c = bb1.f;
    public ns0 d = hd.u;
    public final kd e = new kd(5, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final ot r = new ot();

    static {
        s51.n(Build.FINGERPRINT, "robolectric");
    }

    public qw0(sw0 sw0Var) {
        this.a = sw0Var;
        sw0Var.o(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.A;
            Outline outline2 = null;
            sw0 sw0Var = this.a;
            if (z || sw0Var.P() > 0.0f) {
                da daVar = this.l;
                if (daVar != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = daVar instanceof da;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = daVar.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.v, this.w);
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = daVar;
                    if (outline != null) {
                        outline.setAlpha(sw0Var.t());
                        outline2 = outline;
                    }
                    sw0Var.C(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.A) {
                        sw0Var.o(false);
                        sw0Var.E();
                    } else {
                        sw0Var.o(this.A);
                    }
                } else {
                    sw0Var.o(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jT = lr.T(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    long j3 = j2 == 9205357640488583168L ? jT : j2;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(sw0Var.t());
                    sw0Var.C(outline5, lr.Q(j3));
                }
            } else {
                sw0Var.o(false);
                sw0Var.C(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        if (this.s && this.q == 0) {
            ot otVar = this.r;
            qw0 qw0Var = (qw0) otVar.b;
            if (qw0Var != null) {
                qw0Var.q--;
                qw0Var.b();
                otVar.b = null;
            }
            js1 js1Var = (js1) otVar.d;
            if (js1Var != null) {
                Object[] objArr = js1Var.b;
                long[] jArr = js1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.q--;
                                    ((qw0) objArr[(i << 3) + i3]).b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                js1Var.b();
            }
            this.a.E();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(qf0 qf0Var) {
        ot otVar = this.r;
        otVar.c = (qw0) otVar.b;
        js1 js1Var = (js1) otVar.d;
        if (js1Var != null && js1Var.h()) {
            js1 js1Var2 = (js1) otVar.e;
            if (js1Var2 == null) {
                js1 js1Var3 = or2.a;
                js1Var2 = new js1();
                otVar.e = js1Var2;
            }
            js1Var2.j(js1Var);
            js1Var.b();
        }
        otVar.a = true;
        this.d.h(qf0Var);
        otVar.a = false;
        qw0 qw0Var = (qw0) otVar.c;
        if (qw0Var != null) {
            qw0Var.q--;
            qw0Var.b();
        }
        js1 js1Var4 = (js1) otVar.e;
        if (js1Var4 == null || !js1Var4.h()) {
            return;
        }
        Object[] objArr = js1Var4.b;
        long[] jArr = js1Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.q--;
                            ((qw0) objArr[(i << 3) + i3]).b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        js1Var4.b();
    }

    public final vr d() {
        vr w02Var;
        vr vrVar = this.k;
        da daVar = this.l;
        if (vrVar != null) {
            return vrVar;
        }
        if (daVar != null) {
            v02 v02Var = new v02(daVar);
            this.k = v02Var;
            return v02Var;
        }
        long jT = lr.T(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jT = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jT >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jT & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            w02Var = new x02(w22.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            w02Var = new w02(new jk2(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = w02Var;
        return w02Var;
    }

    public final void e(ua0 ua0Var, bb1 bb1Var, long j, ns0 ns0Var) {
        boolean zB = p41.b(this.u, j);
        sw0 sw0Var = this.a;
        if (!zB) {
            this.u = j;
            long j2 = this.t;
            sw0Var.G(j, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = ua0Var;
        this.c = bb1Var;
        this.d = ns0Var;
        sw0Var.F(ua0Var, bb1Var, this, this.e);
    }

    public final void f(float f) {
        sw0 sw0Var = this.a;
        if (sw0Var.t() == f) {
            return;
        }
        sw0Var.d(f);
    }

    public final void g(long j, long j2, float f) {
        float f2 = this.v;
        long jE = gy1.e(j, (((long) Float.floatToRawIntBits(this.w)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (gy1.b(this.h, jE) && h43.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = jE;
        this.i = j2;
        this.j = f;
        a();
    }
}
