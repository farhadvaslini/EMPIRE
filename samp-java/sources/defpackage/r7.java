package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class r7 implements ViewTranslationCallback {
    public static final r7 a = new r7();

    public final boolean onClearTranslation(View view) {
        cs0 cs0Var;
        view.getClass();
        c8 contentCaptureManager$ui = ((h7) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.k = z7.f;
        g41 g41VarE = contentCaptureManager$ui.e();
        Object[] objArr = g41VarE.c;
        long[] jArr = g41VarE.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        is1 is1Var = ((xu2) objArr[(i << 3) + i3]).a.d.f;
                        Object objG = is1Var.g(zu2.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = is1Var.g(pu2.n);
                            y0 y0Var = (y0) (objG2 != null ? objG2 : null);
                            if (y0Var != null && (cs0Var = (cs0) y0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        ns0 ns0Var;
        view.getClass();
        c8 contentCaptureManager$ui = ((h7) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.k = z7.f;
        g41 g41VarE = contentCaptureManager$ui.e();
        Object[] objArr = g41VarE.c;
        long[] jArr = g41VarE.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        is1 is1Var = ((xu2) objArr[(i << 3) + i3]).a.d.f;
                        Object objG = is1Var.g(zu2.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (s51.n(objG, Boolean.TRUE)) {
                            Object objG2 = is1Var.g(pu2.m);
                            y0 y0Var = (y0) (objG2 != null ? objG2 : null);
                            if (y0Var != null && (ns0Var = (ns0) y0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        ns0 ns0Var;
        view.getClass();
        c8 contentCaptureManager$ui = ((h7) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.k = z7.g;
        g41 g41VarE = contentCaptureManager$ui.e();
        Object[] objArr = g41VarE.c;
        long[] jArr = g41VarE.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        is1 is1Var = ((xu2) objArr[(i << 3) + i3]).a.d.f;
                        Object objG = is1Var.g(zu2.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (s51.n(objG, Boolean.FALSE)) {
                            Object objG2 = is1Var.g(pu2.m);
                            y0 y0Var = (y0) (objG2 != null ? objG2 : null);
                            if (y0Var != null && (ns0Var = (ns0) y0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
