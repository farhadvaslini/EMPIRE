package defpackage;

import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class y9 {
    public final ca a;
    public final int b;
    public final long c;
    public final ng3 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y9(defpackage.ca r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9.<init>(ca, int, int, long):void");
    }

    public static final void a(y9 y9Var, pr prVar) {
        y9Var.getClass();
        Canvas canvasA = o6.a(prVar);
        ng3 ng3Var = y9Var.d;
        if (ng3Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, y9Var.d(), y9Var.f);
        }
        int i = ng3Var.h;
        if (canvasA.getClipBounds(ng3Var.p)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal threadLocal = rg3.a;
            Object nd3Var = threadLocal.get();
            if (nd3Var == null) {
                nd3Var = new nd3();
                threadLocal.set(nd3Var);
            }
            nd3 nd3Var2 = (nd3) nd3Var;
            nd3Var2.a = canvasA;
            try {
                ng3Var.f.draw(nd3Var2);
                if (i != 0) {
                    canvasA.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                nd3Var2.a = null;
            }
        }
        if (ng3Var.d) {
            canvasA.restore();
        }
    }

    public final ng3 b(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        w62 w62Var;
        float fD = d();
        ca caVar = this.a;
        bc bcVar = caVar.g;
        int i8 = caVar.l;
        gb1 gb1Var = caVar.i;
        gh3 gh3Var = caVar.b;
        z9 z9Var = aa.a;
        k72 k72Var = gh3Var.c;
        return new ng3(charSequence, fD, bcVar, i, truncateAt, i8, (k72Var == null || (w62Var = k72Var.b) == null) ? false : w62Var.a, i3, i5, i6, i7, i4, i2, gb1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Type inference failed for: r10v26, types: [j9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(defpackage.jk2 r11, int r12, defpackage.qn1 r13) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9.c(jk2, int, qn1):long");
    }

    public final float d() {
        return m30.i(this.c);
    }

    public final void e(pr prVar, long j, r13 r13Var, ne3 ne3Var, rf0 rf0Var) {
        bc bcVar = this.a.g;
        int i = bcVar.c;
        bcVar.d(j);
        bcVar.f(r13Var);
        bcVar.g(ne3Var);
        bcVar.e(rf0Var);
        bcVar.b(3);
        a(this, prVar);
        bcVar.b(i);
    }

    public final void f(pr prVar, dp dpVar, float f, r13 r13Var, ne3 ne3Var, rf0 rf0Var) {
        bc bcVar = this.a.g;
        int i = bcVar.c;
        bcVar.c(dpVar, (((long) Float.floatToRawIntBits(d())) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L), f);
        bcVar.f(r13Var);
        bcVar.g(ne3Var);
        bcVar.e(rf0Var);
        bcVar.b(3);
        a(this, prVar);
        bcVar.b(i);
    }
}
