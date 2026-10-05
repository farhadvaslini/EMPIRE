package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.wq1 r19, defpackage.ws2 r20, defpackage.sq1 r21, float r22, float r23, defpackage.q40 r24) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq1.c(wq1, ws2, sq1, float, float, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.wq1 r11, defpackage.qk2 r12, defpackage.nk2 r13, defpackage.ws2 r14, defpackage.qk2 r15, long r16, defpackage.q40 r18) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq1.d(wq1, qk2, nk2, ws2, qk2, long, q40):java.lang.Object");
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
