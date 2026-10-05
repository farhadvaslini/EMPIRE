package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wq1 extends nx1 {
    public final yl1 f;
    public final np g;
    public w83 h;

    public wq1(ws2 ws2Var, yl1 yl1Var, c00 c00Var, ua0 ua0Var) {
        super(ws2Var, c00Var, ua0Var);
        this.f = yl1Var;
        this.g = lr.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(wq1 wq1Var, ws2 ws2Var, sq1 sq1Var, float f, float f2, q40 q40Var) {
        tq1 tq1Var;
        dm3 dm3Var;
        qk2 qk2Var;
        Object obj;
        nk2 nk2Var;
        float f3;
        ws2 ws2Var2;
        a31 a31Var = wq1Var.e;
        if (q40Var instanceof tq1) {
            tq1Var = (tq1) q40Var;
            int i = tq1Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                tq1Var.n = i - Integer.MIN_VALUE;
            } else {
                tq1Var = new tq1(wq1Var, q40Var);
            }
        }
        tq1 tq1Var2 = tq1Var;
        Object obj2 = tq1Var2.l;
        int i2 = tq1Var2.n;
        dm3 dm3Var2 = dm3.a;
        Object obj3 = y50.f;
        if (i2 == 0) {
            y02.Q(obj2);
            qk2 qk2Var2 = new qk2();
            qk2Var2.f = sq1Var;
            dm3Var = dm3Var2;
            long j = sq1Var.b;
            long j2 = sq1Var.a;
            ((np3) a31Var.g).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((np3) a31Var.h).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            sq1 sq1VarG = g(wq1Var.g);
            if (sq1VarG != null) {
                long j3 = sq1VarG.b;
                long j4 = sq1VarG.a;
                ((np3) a31Var.g).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((np3) a31Var.h).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                qk2Var = qk2Var2;
                qk2Var.f = ((sq1) qk2Var.f).a(sq1VarG);
            } else {
                qk2Var = qk2Var2;
            }
            nk2 nk2Var2 = new nk2();
            float fH = ws2Var.h(ws2Var.f(((sq1) qk2Var.f).a));
            nk2Var2.f = fH;
            if (!br.n(fH)) {
                qk2 qk2Var3 = new qk2();
                qk2Var3.f = cl3.c(0.0f, 0.0f, 30);
                obj = obj3;
                rs0 uq1Var = new uq1(nk2Var2, qk2Var3, qk2Var, f, wq1Var, f2, ws2Var, null);
                tq1Var2.i = ws2Var;
                tq1Var2.j = nk2Var2;
                tq1Var2.k = f2;
                tq1Var2.n = 1;
                if (wq1Var.b(uq1Var, tq1Var2) != obj) {
                    nk2Var = nk2Var2;
                    f3 = f2;
                    ws2Var2 = ws2Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                y02.Q(obj2);
                return dm3Var2;
            }
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = tq1Var2.k;
        nk2Var = tq1Var2.j;
        ws2Var2 = tq1Var2.i;
        y02.Q(obj2);
        obj = obj3;
        dm3Var = dm3Var2;
        long jH = d32.h(((np3) a31Var.g).c(Float.MAX_VALUE), ((np3) a31Var.h).c(Float.MAX_VALUE));
        if (jH == 0) {
            float fE = ws2Var2.e(Math.signum(nk2Var.f)) * Math.min(Math.abs(nk2Var.f) / 100.0f, f3) * 1000.0f;
            if (fE == 0.0f) {
                jH = 0;
            } else {
                jH = ws2Var2.d == t02.g ? d32.h(fE, 0.0f) : d32.h(0.0f, fE);
            }
        }
        rs0 rs0Var = wq1Var.b;
        lp3 lp3Var = new lp3(jH);
        tq1Var2.i = null;
        tq1Var2.j = null;
        tq1Var2.n = 2;
        return rs0Var.f(lp3Var, tq1Var2) == obj ? obj : dm3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(wq1 wq1Var, qk2 qk2Var, nk2 nk2Var, ws2 ws2Var, qk2 qk2Var2, long j, q40 q40Var) {
        vq1 vq1Var;
        nk2 nk2Var2;
        ws2 ws2Var2;
        qk2 qk2Var3;
        boolean z;
        if (q40Var instanceof vq1) {
            vq1Var = (vq1) q40Var;
            int i = vq1Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                vq1Var.o = i - Integer.MIN_VALUE;
            } else {
                vq1Var = new vq1(q40Var);
            }
        }
        Object objP = vq1Var.n;
        int i2 = vq1Var.o;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(objP);
            if (j < 0) {
                return Boolean.FALSE;
            }
            l80 l80Var = new l80(wq1Var, p40Var, 7);
            vq1Var.i = wq1Var;
            vq1Var.j = qk2Var;
            vq1Var.k = nk2Var;
            vq1Var.l = ws2Var;
            vq1Var.m = qk2Var2;
            vq1Var.o = 1;
            objP = t22.P(j, l80Var, vq1Var);
            y50 y50Var = y50.f;
            if (objP == y50Var) {
                return y50Var;
            }
            nk2Var2 = nk2Var;
            ws2Var2 = ws2Var;
            qk2Var3 = qk2Var2;
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qk2 qk2Var4 = vq1Var.m;
            ws2 ws2Var3 = vq1Var.l;
            nk2Var2 = vq1Var.k;
            qk2 qk2Var5 = vq1Var.j;
            wq1 wq1Var2 = vq1Var.i;
            y02.Q(objP);
            qk2Var3 = qk2Var4;
            ws2Var2 = ws2Var3;
            qk2Var = qk2Var5;
            wq1Var = wq1Var2;
        }
        sq1 sq1Var = (sq1) objP;
        if (sq1Var != null) {
            boolean z2 = ((sq1) qk2Var.f).c;
            long j2 = sq1Var.a;
            qk2Var.f = new sq1(j2, sq1Var.b, z2);
            nk2Var2.f = ws2Var2.j(ws2Var2.f(j2));
            qk2Var3.f = cl3.c(0.0f, 0.0f, 30);
            a31 a31Var = wq1Var.e;
            long j3 = sq1Var.b;
            long j4 = sq1Var.a;
            ((np3) a31Var.g).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((np3) a31Var.h).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !br.n(nk2Var2.f);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static sq1 g(np npVar) {
        sq1 sq1Var = null;
        ov2 ov2VarU = b32.u(new br0(new rq1(npVar, 0), 0 == true ? 1 : 0, 2));
        while (ov2VarU.hasNext()) {
            sq1 sq1VarA = (sq1) ov2VarU.next();
            if (sq1Var != null) {
                sq1VarA = sq1Var.a(sq1VarA);
            }
            sq1Var = sq1VarA;
        }
        return sq1Var;
    }

    public final float e(us2 us2Var, float f) {
        ws2 ws2Var = this.a;
        long jI = ws2Var.i(ws2Var.e(f));
        ws2 ws2Var2 = us2Var.a;
        return ws2Var.h(ws2Var.f(ws2Var2.d(ws2Var2.k, jI, 1)));
    }

    public final boolean f(za2 za2Var) {
        long j;
        ua0 ua0Var = this.c;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.g;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : ua0Var.T(64.0f));
        float f2 = -(i > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : ua0Var.T(64.0f));
        List list = za2Var.a;
        gy1 gy1Var = new gy1(0L);
        int size = list.size();
        boolean zC = false;
        int i2 = 0;
        while (true) {
            j = gy1Var.a;
            if (i2 >= size) {
                break;
            }
            gy1Var = new gy1(gy1.e(j, ((gb2) list.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        ws2 ws2Var = this.a;
        float fJ = ws2Var.j(ws2Var.f(jFloatToRawIntBits));
        if (fJ != 0.0f) {
            qs2 qs2Var = ws2Var.a;
            zC = fJ > 0.0f ? qs2Var.c() : qs2Var.a();
        }
        if (zC) {
            return !(this.g.l(new sq1(jFloatToRawIntBits, ((gb2) qx.q0(za2Var.a)).b, false)) instanceof us);
        }
        return this.d;
    }
}
