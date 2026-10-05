package defpackage;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class ur {
    public static w01 a;
    public static w01 b;
    public static w01 c;

    public static final Object A(long j, p40 p40Var) {
        if (j > 0) {
            jr jrVar = new jr(1, vr.I(p40Var));
            jrVar.s();
            if (j < Long.MAX_VALUE) {
                D(jrVar.j).i(j, jrVar);
            }
            Object objQ = jrVar.q();
            if (objQ == y50.f) {
                return objQ;
            }
        }
        return dm3.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.k(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(defpackage.gn0 r7, defpackage.js r8, boolean r9, defpackage.p40 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.ln0
            if (r0 == 0) goto L13
            r0 = r10
            ln0 r0 = (defpackage.ln0) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            ln0 r0 = new ln0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.m
            int r1 = r0.n
            r2 = 2
            r3 = 1
            r4 = 0
            y50 r5 = defpackage.y50.f
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            boolean r9 = r0.l
            kp r7 = r0.k
            js r8 = r0.j
            gn0 r1 = r0.i
            defpackage.y02.Q(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r7)
            return r4
        L3d:
            boolean r9 = r0.l
            kp r7 = r0.k
            js r8 = r0.j
            gn0 r1 = r0.i
            defpackage.y02.Q(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.y02.Q(r10)
            boolean r10 = r7 instanceof defpackage.xh3
            if (r10 != 0) goto La9
            kp r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.i = r7     // Catch: java.lang.Throwable -> L35
            r0.j = r8     // Catch: java.lang.Throwable -> L35
            r0.k = r10     // Catch: java.lang.Throwable -> L35
            r0.l = r9     // Catch: java.lang.Throwable -> L35
            r0.n = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.i = r1     // Catch: java.lang.Throwable -> L35
            r0.j = r8     // Catch: java.lang.Throwable -> L35
            r0.k = r7     // Catch: java.lang.Throwable -> L35
            r0.l = r9     // Catch: java.lang.Throwable -> L35
            r0.n = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.k(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.c(r4)
        L8b:
            dm3 r7 = defpackage.dm3.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto La8
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L99
            r4 = r7
            java.util.concurrent.CancellationException r4 = (java.util.concurrent.CancellationException) r4
        L99:
            if (r4 != 0) goto La5
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r4.<init>(r9)
            r4.initCause(r7)
        La5:
            r8.c(r4)
        La8:
            throw r10
        La9:
            xh3 r7 = (defpackage.xh3) r7
            java.lang.Throwable r7 = r7.f
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.B(gn0, js, boolean, p40):java.lang.Object");
    }

    public static final boolean C(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final ga0 D(o50 o50Var) {
        m50 m50VarM = o50Var.m(f5.L);
        ga0 ga0Var = m50VarM instanceof ga0 ? (ga0) m50VarM : null;
        return ga0Var == null ? q80.a : ga0Var;
    }

    public static final long E(KeyEvent keyEvent) {
        return gq.h(keyEvent.getKeyCode());
    }

    public static final int F(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final int G(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final boolean H(x50 x50Var) {
        j61 j61Var = (j61) x50Var.h().m(f5.b0);
        if (j61Var != null) {
            return j61Var.b();
        }
        return true;
    }

    public static boolean I(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static lc1 J(pe1 pe1Var, cs0 cs0Var) {
        m22 m22Var = m22.z;
        int iOrdinal = pe1Var.ordinal();
        if (iOrdinal == 0) {
            return new xb3(cs0Var);
        }
        if (iOrdinal == 1) {
            op2 op2Var = new op2();
            op2Var.f = cs0Var;
            op2Var.g = m22Var;
            return op2Var;
        }
        if (iOrdinal != 2) {
            c.k();
            return null;
        }
        lm3 lm3Var = new lm3();
        lm3Var.f = cs0Var;
        lm3Var.g = m22Var;
        return lm3Var;
    }

    public static void K(GameActivity gameActivity, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        Object systemService = gameActivity.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager == null) {
            return;
        }
        if (!y93.q0(str3)) {
            str = str3 + "\n" + str;
        }
        Notification notificationBuild = new Notification.Builder(gameActivity, "server_connection").setContentTitle(str2).setContentText(str).setStyle(new Notification.BigTextStyle().bigText(str2 + "\n" + str)).setSmallIcon(R.drawable.ic_menu_compass).setOngoing(true).setOnlyAlertOnce(true).build();
        notificationBuild.getClass();
        notificationManager.notify(1001, notificationBuild);
    }

    public static ap1 L(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            c.r("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    ap1 ap1Var = new ap1();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    ap1Var.i = byteBufferDuplicate;
                    ap1Var.f = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    ap1Var.g = i6;
                    ap1Var.h = ((ByteBuffer) ap1Var.i).getShort(i6);
                    return ap1Var;
                }
            }
        }
        c.r("Cannot read metadata.");
        return null;
    }

    public static final f21 M(nv0 nv0Var) {
        Object objO = nv0Var.O();
        if (objO == c20.a) {
            objO = new f21();
            nv0Var.j0(objO);
        }
        f21 f21Var = (f21) objO;
        f21Var.a(0, nv0Var);
        return f21Var;
    }

    public static final void N(jr jrVar, p40 p40Var, boolean z) {
        Object objR = jrVar.r();
        Throwable thE = jrVar.e(objR);
        Object qn2Var = thE != null ? new qn2(thE) : jrVar.f(objR);
        if (!z) {
            p40Var.t(qn2Var);
            return;
        }
        p40Var.getClass();
        wb0 wb0Var = (wb0) p40Var;
        q40 q40Var = wb0Var.j;
        Object obj = wb0Var.l;
        o50 o50VarI = q40Var.i();
        Object objF = cl3.F(o50VarI, obj);
        xl3 xl3VarP = objF != cl3.v0 ? uq.P(q40Var, o50VarI, objF) : null;
        try {
            q40Var.t(qn2Var);
            if (xl3VarP == null || xl3VarP.t0()) {
                cl3.A(o50VarI, objF);
            }
        } catch (Throwable th) {
            if (xl3VarP == null || xl3VarP.t0()) {
                cl3.A(o50VarI, objF);
            }
            throw th;
        }
    }

    public static final void O(s1 s1Var, vu2 vu2Var) {
        Object objG = vu2Var.k().f.g(zu2.g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            qn1.b();
            return;
        }
        vu2 vu2VarL = vu2Var.l();
        if (vu2VarL == null) {
            return;
        }
        Object objG2 = vu2VarL.k().f.g(zu2.e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = vu2VarL.k().f.g(zu2.f);
            px pxVar = (px) (objG3 != null ? objG3 : null);
            if (pxVar == null || (pxVar.a >= 0 && pxVar.b >= 0)) {
                if (vu2Var.k().f.c(zu2.K)) {
                    ArrayList arrayList = new ArrayList();
                    List listI = vu2VarL.i((4 & 1) != 0 ? !vu2VarL.b : false, (4 & 2) == 0);
                    int size = listI.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        vu2 vu2Var2 = (vu2) listI.get(i2);
                        if (vu2Var2.k().f.c(zu2.K)) {
                            arrayList.add(vu2Var2);
                            if (vu2Var2.c.v() < vu2Var.c.v()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zN = n(arrayList);
                    int i3 = zN ? 0 : i;
                    int i4 = zN ? i : 0;
                    Object objG4 = vu2Var.k().f.g(zu2.K);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    s1Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i4, 1, false, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    public static void P(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            o1.g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            o1.g(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            R(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            R(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            R(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        R(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public static void Q(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            gh0.b(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static void R(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static final long S(long j) {
        return n30.a(m30.k(j), m30.i(j), m30.j(j), m30.h(j));
    }

    public static final n6 a(g9 g9Var) {
        Canvas canvas = o6.a;
        n6 n6Var = new n6();
        n6Var.a = new Canvas(s51.o(g9Var));
        return n6Var;
    }

    public static final void b(sf3 sf3Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(2080741862);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(sf3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(d00Var) ? 32 : 16;
        }
        int i3 = 1;
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            lr.b(sf3Var, d00Var, nv0Var, i2 & 126);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ez(sf3Var, d00Var, i, i3);
        }
    }

    public static final n40 c(o50 o50Var) {
        if (o50Var.m(f5.b0) == null) {
            o50Var = o50Var.k(new l61(null));
        }
        return new n40(o50Var);
    }

    public static final void d(d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(-709502251);
        byte b2 = 0;
        if (nv0Var.R(i & 1, (i & 3) != 2)) {
            r93 r93Var = iq2.a;
            gq2 gq2Var = (gq2) nv0Var.j(r93Var);
            eq2 eq2VarD = y02.D(nv0Var);
            Object[] objArr = {gq2Var};
            ar2 ar2Var = new ar2(b2, new z00(23, b2), new i(26, gq2Var, eq2VarD));
            boolean zH = nv0Var.h(gq2Var) | nv0Var.h(eq2VarD);
            Object objO = nv0Var.O();
            if (zH || objO == c20.a) {
                objO = new me1(b2, gq2Var, eq2VarD);
                nv0Var.j0(objO);
            }
            le1 le1Var = (le1) oz2.H(objArr, ar2Var, (cs0) objO, nv0Var, 0);
            vr.c(r93Var.a(le1Var), gq.N(-412824043, new y7(25, d00Var, le1Var), nv0Var), nv0Var, 56);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w4(d00Var, i, 3);
        }
    }

    public static final void e(d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(441837433);
        byte b2 = 0;
        int i2 = 5;
        if (nv0Var.R(i & 1, (i & 3) != 2)) {
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = new il1();
                nv0Var.j0(objO);
            }
            il1 il1Var = (il1) objO;
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar) {
                objO2 = new x91(20);
                nv0Var.j0(objO2);
            }
            cs0 cs0Var = (cs0) objO2;
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(cs0Var);
            } else {
                nv0Var.m0();
            }
            fi1 fi1Var = new fi1(i2);
            if (nv0Var.S) {
                nv0Var.b(new pt2(14, fi1Var), dm3.a);
            }
            y02.F(new z00(27, b2), nv0Var, il1Var);
            d00Var.e(il1Var, nv0Var, 48);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w4(d00Var, i, i2);
        }
    }

    public static final void f(nu1 nu1Var, bq1 bq1Var, h5 h5Var, ns0 ns0Var, ns0 ns0Var2, ns0 ns0Var3, ns0 ns0Var4, ns0 ns0Var5, nv0 nv0Var, int i) {
        h5 h5Var2;
        h5 h5Var3;
        nv0Var.b0(1840250294);
        int i2 = i | (nv0Var.h(nu1Var) ? 4 : 2) | 805334016;
        char c2 = nv0Var.h(ns0Var5) ? (char) 4 : (char) 2;
        if ((306783379 & i2) == 306783378 && (c2 & 3) == 2 && nv0Var.D()) {
            nv0Var.U();
            h5Var3 = h5Var;
        } else {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                h5Var2 = f5.g;
            } else {
                nv0Var.U();
                h5Var2 = h5Var;
            }
            nv0Var.q();
            boolean z = (c2 & 14) == 4;
            Object objO = nv0Var.O();
            if (z || objO == c20.a) {
                ju1 ju1Var = new ju1(nu1Var.b.s);
                ns0Var5.h(ju1Var);
                objO = ju1Var.c();
                nv0Var.j0(objO);
            }
            h5Var3 = h5Var2;
            g(nu1Var, (iu1) objO, bq1Var, h5Var3, ns0Var, ns0Var2, ns0Var3, ns0Var4, nv0Var, (i2 & 8078) | 115040256);
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ny0(nu1Var, bq1Var, h5Var3, ns0Var, ns0Var2, ns0Var3, ns0Var4, ns0Var5, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0636  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.nu1 r45, defpackage.iu1 r46, defpackage.bq1 r47, defpackage.h5 r48, final defpackage.ns0 r49, final defpackage.ns0 r50, final defpackage.ns0 r51, final defpackage.ns0 r52, defpackage.nv0 r53, int r54) {
        /*
            Method dump skipped, instruction units count: 2802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.g(nu1, iu1, bq1, h5, ns0, ns0, ns0, ns0, nv0, int):void");
    }

    public static final void h(cs0 cs0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-1646555525);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(cs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (nv0Var.R(i2 & 1, (i2 & 3) != 2)) {
            i((View) nv0Var.j(x7.f), (ua0) nv0Var.j(s20.h), cs0Var, nv0Var, (i2 << 6) & 896);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new h8(i, i3, cs0Var);
        }
    }

    public static final void i(View view, ua0 ua0Var, cs0 cs0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-1319522472);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(ua0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = nv0Var.h(view) | ((i2 & 896) == 256);
            Object objO = nv0Var.O();
            if (zH || objO == c20.a) {
                objO = new i(i3, view, cs0Var);
                nv0Var.j0(objO);
            }
            rn.h(view, ua0Var, (ns0) objO, nv0Var);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(view, ua0Var, cs0Var, i, 8);
        }
    }

    public static final int j(int i, qs1 qs1Var) {
        int i2 = qs1Var.h - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = qs1Var.f;
            int i5 = ((h51) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((h51) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final Integer k(String str) {
        Object qn2Var;
        try {
            int length = str.length();
            if (length == 6) {
                String strSubstring = str.substring(0, 2);
                r(16);
                int i = Integer.parseInt(strSubstring, 16);
                String strSubstring2 = str.substring(2, 4);
                r(16);
                int i2 = Integer.parseInt(strSubstring2, 16);
                String strSubstring3 = str.substring(4, 6);
                r(16);
                qn2Var = Integer.valueOf(Color.rgb(i, i2, Integer.parseInt(strSubstring3, 16)));
            } else if (length != 8) {
                qn2Var = null;
            } else {
                r(16);
                long j = Long.parseLong(str, 16);
                qn2Var = Integer.valueOf(Color.rgb((int) ((j >>> 24) & 255), (int) ((j >>> 16) & 255), (int) ((j >>> 8) & 255)));
            }
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        return (Integer) (qn2Var instanceof qn2 ? null : qn2Var);
    }

    public static final d21 l(f21 f21Var, float f, float f2, c21 c21Var, nv0 nv0Var) {
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        Object objO = nv0Var.O();
        zj zjVar = c20.a;
        if (objO == zjVar) {
            objO = new d21(f21Var, fValueOf, fValueOf2, c21Var);
            nv0Var.j0(objO);
        }
        d21 d21Var = (d21) objO;
        boolean zH = nv0Var.h(c21Var);
        Object objO2 = nv0Var.O();
        if (zH || objO2 == zjVar) {
            objO2 = new n8(fValueOf, d21Var, fValueOf2, c21Var, 1);
            nv0Var.j0(objO2);
        }
        rn.t((cs0) objO2, nv0Var);
        boolean zH2 = nv0Var.h(f21Var);
        Object objO3 = nv0Var.O();
        if (zH2 || objO3 == zjVar) {
            objO3 = new i(19, f21Var, d21Var);
            nv0Var.j0(objO3);
        }
        rn.g(d21Var, (ns0) objO3, nv0Var);
        return d21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(defpackage.q40 r4) {
        /*
            boolean r0 = r4 instanceof defpackage.ha0
            if (r0 == 0) goto L13
            r0 = r4
            ha0 r0 = (defpackage.ha0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            ha0 r0 = new ha0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.i
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return
        L27:
            defpackage.y02.Q(r4)
            goto L45
        L2b:
            defpackage.y02.Q(r4)
            r0.j = r2
            jr r4 = new jr
            p40 r0 = defpackage.vr.I(r0)
            r4.<init>(r2, r0)
            r4.s()
            java.lang.Object r4 = r4.q()
            y50 r0 = defpackage.y50.f
            if (r4 != r0) goto L45
            return
        L45:
            defpackage.c.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.m(q40):void");
    }

    public static final boolean n(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = ni0.f;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    vu2 vu2Var = (vu2) obj2;
                    vu2 vu2Var2 = (vu2) obj;
                    arrayList2.add(new gy1((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (vu2Var2.g().b() >> 32)) - Float.intBitsToFloat((int) (vu2Var.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (vu2Var2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (vu2Var.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((gy1) qx.q0(list)).a;
            } else {
                if (list.isEmpty()) {
                    yi1.c("Empty collection can't be reduced.");
                }
                Object objQ0 = qx.q0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objQ0 = new gy1(gy1.e(((gy1) objQ0).a, ((gy1) list.get(i2)).a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((gy1) objQ0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void o(x50 x50Var, CancellationException cancellationException) {
        j61 j61Var = (j61) x50Var.h().m(f5.b0);
        if (j61Var != null) {
            j61Var.c(cancellationException);
        } else {
            c.h(x50Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final void p(int i, int i2) {
        if (i < 0 || i >= i2) {
            c.i(nc2.g(i, i2, "index: ", ", size: "));
        }
    }

    public static final void q(int i, int i2) {
        if (i < 0 || i > i2) {
            c.i(nc2.g(i, i2, "index: ", ", size: "));
        }
    }

    public static void r(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbM = nc2.m("radix ", " was not in valid range ", i);
            sbM.append(new l41(2, 36, 1));
            throw new IllegalArgumentException(sbM.toString());
        }
    }

    public static final void s(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbL = nc2.l("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            sbL.append(i3);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        if (i <= i2) {
            return;
        }
        c.p(nc2.g(i, i2, "fromIndex: ", " > toIndex: "));
    }

    public static int t(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static long u(long j, ic1 ic1Var) {
        ic1 ic1Var2 = ic1.f;
        return n30.a(ic1Var == ic1Var2 ? m30.k(j) : m30.j(j), ic1Var == ic1Var2 ? m30.i(j) : m30.h(j), ic1Var == ic1Var2 ? m30.j(j) : m30.k(j), ic1Var == ic1Var2 ? m30.h(j) : m30.i(j));
    }

    public static long v(int i, long j) {
        return n30.a(0, m30.i(j), (i & 4) != 0 ? m30.j(j) : 0, m30.h(j));
    }

    public static final Object w(rs0 rs0Var, p40 p40Var) {
        sr2 sr2Var = new sr2(p40Var, p40Var.i());
        return b32.C(sr2Var, true, sr2Var, rs0Var);
    }

    public static final aq0 x(Context context) {
        m22 m22Var = new m22(23);
        context.getApplicationContext();
        return new aq0(m22Var, new c9(Build.VERSION.SDK_INT >= 31 ? yq0.a.a(context) : 0));
    }

    public static void y(ContextWrapper contextWrapper) {
        Object systemService = contextWrapper.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager == null) {
            return;
        }
        notificationManager.createNotificationChannelGroup(new NotificationChannelGroup("samp_group", contextWrapper.getString(2131624434)));
        NotificationChannel notificationChannel = new NotificationChannel("server_connection", contextWrapper.getString(2131624437), 2);
        notificationChannel.setDescription(contextWrapper.getString(2131624438));
        notificationChannel.setGroup("samp_group");
        notificationChannel.setShowBadge(true);
        notificationManager.createNotificationChannel(notificationChannel);
        NotificationChannel notificationChannel2 = new NotificationChannel("raksamp_instances", contextWrapper.getString(2131624435), 2);
        notificationChannel2.setDescription(contextWrapper.getString(2131624436));
        notificationChannel2.setGroup("samp_group");
        notificationChannel2.setShowBadge(true);
        notificationManager.createNotificationChannel(notificationChannel2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object z(m20 m20Var, ee2 ee2Var) {
        if (!((aq1) m20Var).f.s) {
            m21.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        n52 n52Var = (n52) vr.X(m20Var).H;
        n52Var.getClass();
        return vp.Q(n52Var, ee2Var);
    }
}
