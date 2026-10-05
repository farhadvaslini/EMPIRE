package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class x90 {
    public static final vb2 a;

    static {
        a = new vb2((30 & 1) == 0, zs2.f, true, 0);
    }

    public static final void a(je3 je3Var, xd3 xd3Var, nv0 nv0Var, int i) {
        nv0 nv0Var2;
        Context context;
        nv0Var.b0(1904307118);
        int i2 = (nv0Var.f(je3Var) ? 4 : 2) | i | (nv0Var.h(xd3Var) ? 32 : 16);
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                nv0Var.a0(-1009482584);
                context = (Context) nv0Var.j(x7.b);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-1009433480);
                nv0Var.p(false);
                context = null;
            }
            boolean zH = nv0Var.h(xd3Var) | ((i2 & 14) == 4) | nv0Var.h(context);
            Object objO = nv0Var.O();
            if (zH || objO == c20.a) {
                objO = new v1(xd3Var, context, je3Var, 7);
                nv0Var.j0(objO);
            }
            nv0Var2 = nv0Var;
            m40.b(null, null, (ns0) objO, nv0Var2, 0, 3);
        } else {
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i, 13, je3Var, xd3Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x0655, code lost:
    
        r4 = new defpackage.x01(r21.b(), r13 | r10.a);
        r15.a.put(r2, new java.lang.ref.WeakReference(r4));
        r0 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x054b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x029d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final int r60, long r61, defpackage.nv0 r63, final int r64) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x90.b(int, long, nv0, int):void");
    }

    public static final void c(je3 je3Var, yd3 yd3Var, cs0 cs0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? nv0Var.f(je3Var) : nv0Var.h(je3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? nv0Var.f(yd3Var) : nv0Var.h(yd3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        boolean z = false;
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && nv0Var.f(yd3Var));
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (z2 || objO == zjVar) {
                objO = new ul1(new yl1(17, new u1(13, yd3Var, cs0Var)));
                nv0Var.j0(objO);
            }
            ul1 ul1Var = (ul1) objO;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && nv0Var.h(je3Var))) {
                z = true;
            }
            Object objO2 = nv0Var.O();
            if (z || objO2 == zjVar) {
                objO2 = new ja(11, je3Var);
                nv0Var.j0(objO2);
            }
            xa.a(ul1Var, (cs0) objO2, a, gq.N(1315155414, new y7(12, yd3Var, je3Var), nv0Var), nv0Var, 3456, 0);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(je3Var, yd3Var, cs0Var, i, 7);
        }
    }

    public static final void d(bq1 bq1Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(d00Var) ? 32 : 16;
        }
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            r51.f(bq1Var, he3.a, d00Var, nv0Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xb(bq1Var, d00Var, i, i3);
        }
    }
}
