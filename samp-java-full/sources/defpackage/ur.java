package defpackage;

import android.R;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public static final Object B(gn0 gn0Var, js jsVar, boolean z, p40 p40Var) throws Throwable {
        ln0 ln0Var;
        kp it;
        kp kpVar;
        gn0 gn0Var2;
        Object objB;
        if (p40Var instanceof ln0) {
            ln0Var = (ln0) p40Var;
            int i = ln0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ln0Var.n = i - Integer.MIN_VALUE;
            } else {
                ln0Var = new ln0(p40Var);
            }
        }
        Object obj = ln0Var.m;
        int i2 = ln0Var.n;
        CancellationException cancellationException = null;
        y50 y50Var = y50.f;
        try {
            if (i2 == 0) {
                y02.Q(obj);
                if (gn0Var instanceof xh3) {
                    throw ((xh3) gn0Var).f;
                }
                it = jsVar.iterator();
                ln0Var.i = gn0Var;
                ln0Var.j = jsVar;
                ln0Var.k = it;
                ln0Var.l = z;
                ln0Var.n = 1;
                objB = it.b(ln0Var);
                if (objB != y50Var) {
                }
            } else if (i2 == 1) {
                z = ln0Var.l;
                kpVar = ln0Var.k;
                jsVar = ln0Var.j;
                gn0Var2 = ln0Var.i;
                y02.Q(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = ln0Var.l;
                kpVar = ln0Var.k;
                jsVar = ln0Var.j;
                gn0Var2 = ln0Var.i;
                y02.Q(obj);
                it = kpVar;
                gn0Var = gn0Var2;
                ln0Var.i = gn0Var;
                ln0Var.j = jsVar;
                ln0Var.k = it;
                ln0Var.l = z;
                ln0Var.n = 1;
                objB = it.b(ln0Var);
                if (objB != y50Var) {
                    return y50Var;
                }
                gn0Var2 = gn0Var;
                kpVar = it;
                obj = objB;
                if (((Boolean) obj).booleanValue()) {
                    if (z) {
                        jsVar.c(null);
                    }
                    return dm3.a;
                }
                Object objC = kpVar.c();
                ln0Var.i = gn0Var2;
                ln0Var.j = jsVar;
                ln0Var.k = kpVar;
                ln0Var.l = z;
                ln0Var.n = 2;
            }
        } finally {
        }
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
    */
    public static final void g(nu1 nu1Var, iu1 iu1Var, bq1 bq1Var, h5 h5Var, final ns0 ns0Var, final ns0 ns0Var2, final ns0 ns0Var3, final ns0 ns0Var4, nv0 nv0Var, int i) {
        zv1 zv1Var;
        int i2;
        of1 of1Var;
        h10 h10Var;
        os1 os1Var;
        boolean z;
        Object obj;
        h10 h10Var2;
        nv0 nv0Var2;
        zv1 zv1Var2;
        zv1 zv1Var3;
        final h10 h10Var3;
        vr1 vr1Var;
        qt1 qt1Var;
        boolean z2;
        ns0 ns0Var5;
        gk3 gk3Var;
        it2 it2Var;
        final e93 e93Var;
        vr1 vr1Var2;
        h10 h10Var4;
        Object obj2;
        it2 it2Var2;
        int[] intArray;
        int[] iArr;
        int[] iArr2;
        ArrayList arrayList;
        String strW;
        fu1 fu1VarA;
        iu1 iu1Var2;
        int i3;
        Bundle bundle;
        int i4;
        fu1 fu1VarA2;
        iu1 iu1Var3;
        nv0Var.b0(-1964664536);
        int i5 = (i & 6) == 0 ? (nv0Var.h(nu1Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= nv0Var.h(iu1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= nv0Var.f(h5Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= nv0Var.h(ns0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= nv0Var.h(ns0Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= nv0Var.h(ns0Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= nv0Var.h(ns0Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= nv0Var.h(null) ? 67108864 : 33554432;
        }
        int i6 = i5;
        if ((38347923 & i6) == 38347922 && nv0Var.D()) {
            nv0Var.U();
            nv0Var2 = nv0Var;
        } else {
            nv0Var.W();
            if ((i & 1) != 0 && !nv0Var.A()) {
                nv0Var.U();
            }
            nv0Var.q();
            of1 of1Var2 = (of1) nv0Var.j(ij1.a);
            cr3 cr3VarA = oj1.a(nv0Var);
            if (cr3VarA == null) {
                c.q("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            br3 viewModelStore = cr3VarA.getViewModelStore();
            nu1Var.getClass();
            wt1 wt1Var = nu1Var.b;
            wt1Var.getClass();
            zv1 zv1Var4 = wt1Var.s;
            if (!s51.n(wt1Var.o, lq.F(viewModelStore))) {
                if (!wt1Var.f.isEmpty()) {
                    c.q("ViewModelStore should be set before setGraph call");
                    return;
                }
                wt1Var.o = lq.F(viewModelStore);
            }
            iu1Var.getClass();
            LinkedHashMap linkedHashMap = wt1Var.t;
            lu1 lu1Var = iu1Var.k;
            mj<qt1> mjVar = wt1Var.f;
            if (!mjVar.isEmpty() && wt1Var.h() == ff1.f) {
                c.q("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            boolean z3 = false;
            if (s51.n(wt1Var.c, iu1Var)) {
                zv1Var = zv1Var4;
                i2 = i6;
                of1Var = of1Var2;
                h10Var = null;
                int iE = lu1Var.b.e();
                for (int i7 = 0; i7 < iE; i7++) {
                    fu1 fu1Var = (fu1) lu1Var.b.f(i7);
                    iu1 iu1Var4 = wt1Var.c;
                    iu1Var4.getClass();
                    int iC = iu1Var4.k.b.c(i7);
                    iu1 iu1Var5 = wt1Var.c;
                    iu1Var5.getClass();
                    l83 l83Var = iu1Var5.k.b;
                    if (l83Var.f) {
                        r51.j(l83Var);
                    }
                    int iD = w7.D(l83Var.i, iC, l83Var.g);
                    if (iD >= 0) {
                        Object[] objArr = l83Var.h;
                        Object obj3 = objArr[iD];
                        objArr[iD] = fu1Var;
                    }
                }
                for (qt1 qt1Var2 : mjVar) {
                    int i8 = fu1.j;
                    qm1 qm1Var = new qm1(pv2.L(pq.y(qt1Var2.g)));
                    fu1 fu1VarA3 = wt1Var.c;
                    fu1VarA3.getClass();
                    Iterator it = qm1Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((yn2) it).g;
                        if (listIterator.hasPrevious()) {
                            fu1 fu1Var2 = (fu1) listIterator.previous();
                            if (!s51.n(fu1Var2, wt1Var.c) || !fu1VarA3.equals(iu1Var)) {
                                if (fu1VarA3 instanceof iu1) {
                                    fu1VarA3 = ((iu1) fu1VarA3).k.a(fu1Var2.g.a);
                                    fu1VarA3.getClass();
                                }
                            }
                        }
                    }
                    qt1Var2.g = fu1VarA3;
                }
            } else {
                iu1 iu1Var6 = wt1Var.c;
                if (iu1Var6 != null) {
                    ArrayList arrayList2 = new ArrayList(wt1Var.l.keySet());
                    int size = arrayList2.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj4 = arrayList2.get(i9);
                        int i10 = i9 + 1;
                        Integer num = (Integer) obj4;
                        num.getClass();
                        ArrayList arrayList3 = arrayList2;
                        int iIntValue = num.intValue();
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((ut1) it2.next()).d = true;
                            i10 = i10;
                        }
                        int i11 = i10;
                        boolean zQ = wt1Var.q(iIntValue, null, new vu1(z3, true, -1, z3, z3, -1, -1));
                        for (Iterator it3 = linkedHashMap.values().iterator(); it3.hasNext(); it3 = it3) {
                            ((ut1) it3.next()).d = false;
                            zQ = zQ;
                        }
                        if (zQ) {
                            wt1Var.m(iIntValue, true, false);
                        }
                        arrayList2 = arrayList3;
                        i9 = i11;
                        z3 = false;
                    }
                    wt1Var.m(iu1Var6.g.a, true, false);
                }
                wt1Var.c = iu1Var;
                zv1 zv1Var5 = wt1Var.s;
                nu1 nu1Var2 = wt1Var.a;
                qh0 qh0Var = nu1Var2.c;
                Bundle bundle2 = wt1Var.d;
                if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        jo3.q("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size2 = stringArrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        String str = stringArrayList.get(i12);
                        i12++;
                        ArrayList<String> arrayList4 = stringArrayList;
                        String str2 = str;
                        zv1Var5.b(str2);
                        if (bundle2.containsKey(str2) && bundle2.getBundle(str2) == null) {
                            jo3.q(str2);
                            throw null;
                        }
                        stringArrayList = arrayList4;
                    }
                }
                Bundle[] bundleArr = wt1Var.e;
                if (bundleArr != null) {
                    int length = bundleArr.length;
                    int i13 = 0;
                    while (i13 < length) {
                        Bundle[] bundleArr2 = bundleArr;
                        Bundle bundle3 = bundleArr2[i13];
                        bundle3.getClass();
                        int i14 = length;
                        bundle3.setClassLoader(tt1.class.getClassLoader());
                        String string = bundle3.getString("nav-entry-state:id");
                        if (string == null) {
                            jo3.q("nav-entry-state:id");
                            throw null;
                        }
                        int iK = g12.K("nav-entry-state:destination-id", bundle3);
                        int i15 = i13;
                        Bundle bundle4 = bundle3.getBundle("nav-entry-state:args");
                        if (bundle4 == null) {
                            jo3.q("nav-entry-state:args");
                            throw null;
                        }
                        Bundle bundle5 = bundle3.getBundle("nav-entry-state:saved-state");
                        if (bundle5 == null) {
                            jo3.q("nav-entry-state:saved-state");
                            throw null;
                        }
                        fu1 fu1VarC = wt1Var.c(iK, null);
                        if (fu1VarC == null) {
                            int i16 = fu1.j;
                            throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + pq.w(qh0Var, iK) + " cannot be found from the current destination " + wt1Var.f());
                        }
                        ff1 ff1VarH = wt1Var.h();
                        xt1 xt1Var = wt1Var.o;
                        qh0Var.getClass();
                        ff1VarH.getClass();
                        Context context = qh0Var.a;
                        bundle4.setClassLoader(context != null ? context.getClassLoader() : null);
                        qt1 qt1Var3 = new qt1(qh0Var, fu1VarC, bundle4, ff1VarH, xt1Var, string, bundle5);
                        yv1 yv1VarB = zv1Var5.b(fu1VarC.f);
                        Object obj5 = linkedHashMap.get(yv1VarB);
                        Object obj6 = obj5;
                        if (obj5 == null) {
                            ut1 ut1Var = new ut1(nu1Var2, yv1VarB);
                            linkedHashMap.put(yv1VarB, ut1Var);
                            obj6 = ut1Var;
                        }
                        mjVar.addLast(qt1Var3);
                        ((ut1) obj6).a(qt1Var3);
                        iu1 iu1Var7 = qt1Var3.g.h;
                        if (iu1Var7 != null) {
                            wt1Var.j(qt1Var3, wt1Var.e(iu1Var7.g.a));
                        }
                        i13 = i15 + 1;
                        bundleArr = bundleArr2;
                        length = i14;
                    }
                    wt1Var.b.a();
                    wt1Var.e = null;
                }
                Collection collectionValues = om1.b0(zv1Var5.a).values();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj7 : collectionValues) {
                    if (!((yv1) obj7).b) {
                        arrayList5.add(obj7);
                    }
                }
                int size3 = arrayList5.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj8 = arrayList5.get(i17);
                    i17++;
                    yv1 yv1Var = (yv1) obj8;
                    Object ut1Var2 = linkedHashMap.get(yv1Var);
                    if (ut1Var2 == null) {
                        yv1Var.getClass();
                        ut1Var2 = new ut1(nu1Var2, yv1Var);
                        linkedHashMap.put(yv1Var, ut1Var2);
                    }
                    yv1Var.getClass();
                    yv1Var.a = (ut1) ut1Var2;
                    yv1Var.b = true;
                }
                if (wt1Var.c == null || !mjVar.isEmpty()) {
                    zv1Var = zv1Var4;
                    i2 = i6;
                    of1Var = of1Var2;
                    h10Var = null;
                    wt1Var.b();
                } else {
                    Activity activity = nu1Var2.d;
                    if (nu1Var2.e || activity == null) {
                        zv1Var = zv1Var4;
                        i2 = i6;
                        of1Var = of1Var2;
                        iu1 iu1Var8 = wt1Var.c;
                        iu1Var8.getClass();
                        h10Var = null;
                        wt1Var.k(iu1Var8, null, null);
                    } else {
                        Intent intent = activity.getIntent();
                        wt1 wt1Var2 = nu1Var2.b;
                        if (intent != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception e) {
                                    i2 = i6;
                                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                                    intArray = null;
                                }
                            } else {
                                intArray = null;
                            }
                            i2 = i6;
                            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                            Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle6 != null) {
                                bundleU.putAll(bundle6);
                            }
                            if (intArray == null || intArray.length == 0) {
                                iu1 iu1VarI = wt1Var2.i();
                                iArr = intArray;
                                of1Var = of1Var2;
                                zv1Var = zv1Var4;
                                eu1 eu1VarF = iu1VarI.f(new pi(intent.getData(), intent.getAction(), intent.getType(), 12), iu1VarI);
                                if (eu1VarF != null) {
                                    fu1 fu1Var3 = eu1VarF.f;
                                    int[] iArrB = fu1Var3.b(null);
                                    Bundle bundleA = fu1Var3.a(eu1VarF.g);
                                    if (bundleA != null) {
                                        bundleU.putAll(bundleA);
                                    }
                                    iArr2 = iArrB;
                                    arrayList = null;
                                }
                                if (iArr2 == null && iArr2.length != 0) {
                                    wt1Var2.getClass();
                                    iu1 iu1Var9 = wt1Var2.c;
                                    int length2 = iArr2.length;
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= length2) {
                                            strW = null;
                                            break;
                                        }
                                        int i19 = iArr2[i18];
                                        if (i18 == 0) {
                                            i4 = length2;
                                            iu1 iu1Var10 = wt1Var2.c;
                                            iu1Var10.getClass();
                                            fu1VarA2 = iu1Var10.g.a == i19 ? wt1Var2.c : null;
                                        } else {
                                            i4 = length2;
                                            iu1Var9.getClass();
                                            fu1VarA2 = iu1Var9.k.a(i19);
                                        }
                                        if (fu1VarA2 == null) {
                                            int i20 = fu1.j;
                                            strW = pq.w(wt1Var2.a.c, i19);
                                            break;
                                        }
                                        if (i18 != iArr2.length - 1 && (fu1VarA2 instanceof iu1)) {
                                            while (true) {
                                                iu1Var3 = (iu1) fu1VarA2;
                                                iu1Var3.getClass();
                                                lu1 lu1Var2 = iu1Var3.k;
                                                if (!(lu1Var2.a(lu1Var2.c) instanceof iu1)) {
                                                    break;
                                                } else {
                                                    fu1VarA2 = lu1Var2.a(lu1Var2.c);
                                                }
                                            }
                                            iu1Var9 = iu1Var3;
                                        }
                                        i18++;
                                        length2 = i4;
                                    }
                                    if (strW != null) {
                                        Log.i("NavController", "Could not find destination " + strW + " in the navigation graph, ignoring the deep link from " + intent);
                                    } else {
                                        bundleU.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                        int length3 = iArr2.length;
                                        Bundle[] bundleArr3 = new Bundle[length3];
                                        for (int i21 = 0; i21 < length3; i21++) {
                                            Bundle bundleU2 = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                                            bundleU2.putAll(bundleU);
                                            if (arrayList != null && (bundle = (Bundle) arrayList.get(i21)) != null) {
                                                bundleU2.putAll(bundle);
                                            }
                                            bundleArr3[i21] = bundleU2;
                                        }
                                        int flags = intent.getFlags();
                                        int i22 = 268435456 & flags;
                                        if (i22 != 0 && (flags & 32768) == 0) {
                                            intent.addFlags(32768);
                                            jd3 jd3Var = new jd3(nu1Var2.a);
                                            ComponentName component = intent.getComponent();
                                            if (component == null) {
                                                component = intent.resolveActivity(jd3Var.g.getPackageManager());
                                            }
                                            if (component != null) {
                                                jd3Var.a(component);
                                            }
                                            jd3Var.f.add(intent);
                                            jd3Var.b();
                                            activity.finish();
                                            activity.overridePendingTransition(0, 0);
                                        } else if (i22 != 0) {
                                            if (wt1Var2.f.isEmpty()) {
                                                i3 = 0;
                                            } else {
                                                iu1 iu1Var11 = wt1Var2.c;
                                                iu1Var11.getClass();
                                                i3 = 0;
                                                wt1Var2.m(iu1Var11.g.a, true, false);
                                            }
                                            while (i3 < iArr2.length) {
                                                int i23 = iArr2[i3];
                                                int i24 = i3 + 1;
                                                Bundle bundle7 = bundleArr3[i3];
                                                fu1 fu1VarC2 = wt1Var2.c(i23, null);
                                                if (fu1VarC2 == null) {
                                                    int i25 = fu1.j;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + pq.w(qh0Var, i23) + " cannot be found from the current destination " + wt1Var2.f());
                                                }
                                                er1 er1Var = new er1(1, fu1VarC2, nu1Var2);
                                                wu1 wu1Var = new wu1();
                                                er1Var.h(wu1Var);
                                                int i26 = wu1Var.b;
                                                boolean z4 = wu1Var.c;
                                                bl0 bl0Var = wu1Var.a;
                                                wt1Var2.k(fu1VarC2, bundle7, new vu1(false, false, i26, false, z4, bl0Var.a, bl0Var.b));
                                                i3 = i24;
                                            }
                                            nu1Var2.e = true;
                                        } else {
                                            iu1 iu1Var12 = wt1Var2.c;
                                            int length4 = iArr2.length;
                                            for (int i27 = 0; i27 < length4; i27++) {
                                                int i28 = iArr2[i27];
                                                Bundle bundle8 = bundleArr3[i27];
                                                if (i27 == 0) {
                                                    fu1VarA = wt1Var2.c;
                                                } else {
                                                    iu1Var12.getClass();
                                                    fu1VarA = iu1Var12.k.a(i28);
                                                }
                                                if (fu1VarA == null) {
                                                    int i29 = fu1.j;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + pq.w(qh0Var, i28) + " cannot be found in graph " + iu1Var12);
                                                }
                                                if (i27 == iArr2.length - 1) {
                                                    iu1 iu1Var13 = wt1Var2.c;
                                                    iu1Var13.getClass();
                                                    wt1Var2.k(fu1VarA, bundle8, new vu1(false, false, iu1Var13.g.a, true, false, 0, 0));
                                                } else if (fu1VarA instanceof iu1) {
                                                    while (true) {
                                                        iu1Var2 = (iu1) fu1VarA;
                                                        iu1Var2.getClass();
                                                        lu1 lu1Var3 = iu1Var2.k;
                                                        if (!(lu1Var3.a(lu1Var3.c) instanceof iu1)) {
                                                            break;
                                                        } else {
                                                            fu1VarA = lu1Var3.a(lu1Var3.c);
                                                        }
                                                    }
                                                    iu1Var12 = iu1Var2;
                                                }
                                            }
                                            nu1Var2.e = true;
                                        }
                                        h10Var = null;
                                    }
                                }
                            } else {
                                iArr = intArray;
                                zv1Var = zv1Var4;
                                of1Var = of1Var2;
                            }
                            arrayList = parcelableArrayList;
                            iArr2 = iArr;
                            if (iArr2 == null) {
                            }
                        }
                        iu1 iu1Var82 = wt1Var.c;
                        iu1Var82.getClass();
                        h10Var = null;
                        wt1Var.k(iu1Var82, null, null);
                    }
                }
            }
            zv1 zv1Var6 = zv1Var;
            yv1 yv1VarB2 = zv1Var6.b("composable");
            h10 h10Var5 = yv1VarB2 instanceof h10 ? (h10) yv1VarB2 : h10Var;
            if (h10Var5 == null) {
                xj2 xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    xj2VarT.d = new pu1(nu1Var, iu1Var, bq1Var, h5Var, ns0Var, ns0Var2, ns0Var3, ns0Var4, i, 2);
                    return;
                }
                return;
            }
            os1 os1VarE = b32.e(h10Var5.b().e, nv0Var);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            Object obj9 = objO;
            if (objO == zjVar) {
                z32 z32Var = new z32(0.0f);
                nv0Var.j0(z32Var);
                obj9 = z32Var;
            }
            z32 z32Var2 = (z32) obj9;
            Object objO2 = nv0Var.O();
            Object obj10 = objO2;
            if (objO2 == zjVar) {
                d42 d42VarW = b32.w(Boolean.FALSE);
                nv0Var.j0(d42VarW);
                obj10 = d42VarW;
            }
            final os1 os1Var2 = (os1) obj10;
            boolean z5 = ((List) os1VarE.getValue()).size() > 1;
            boolean zF = nv0Var.f(os1VarE) | nv0Var.h(h10Var5);
            Object objO3 = nv0Var.O();
            if (zF || objO3 == zjVar) {
                objO3 = new m9(h10Var5, os1VarE, z32Var2, os1Var2, (p40) null, 7);
                os1Var = os1VarE;
                nv0Var.j0(objO3);
            } else {
                os1Var = os1VarE;
            }
            gq.j(z5, (rs0) objO3, nv0Var, 0);
            of1 of1Var3 = of1Var;
            boolean zH = nv0Var.h(nu1Var) | nv0Var.h(of1Var3);
            Object objO4 = nv0Var.O();
            Object obj11 = objO4;
            if (zH || objO4 == zjVar) {
                er1 er1Var2 = new er1(3, nu1Var, of1Var3);
                nv0Var.j0(er1Var2);
                obj11 = er1Var2;
            }
            rn.g(of1Var3, (ns0) obj11, nv0Var);
            eq2 eq2VarD = y02.D(nv0Var);
            os1 os1VarE2 = b32.e(wt1Var.i, nv0Var);
            Object objO5 = nv0Var.O();
            if (objO5 == zjVar) {
                z = false;
                cb0 cb0VarJ = b32.j(new qu1(os1VarE2, false ? 1 : 0));
                nv0Var.j0(cb0VarJ);
                obj = cb0VarJ;
            } else {
                z = false;
                obj = objO5;
            }
            e93 e93Var2 = (e93) obj;
            qt1 qt1Var4 = (qt1) qx.z0((List) e93Var2.getValue());
            Object objO6 = nv0Var.O();
            Object obj12 = objO6;
            if (objO6 == zjVar) {
                int i30 = yx1.a;
                vr1 vr1Var3 = new vr1(6);
                nv0Var.j0(vr1Var3);
                obj12 = vr1Var3;
            }
            vr1 vr1Var4 = (vr1) obj12;
            if (qt1Var4 != null) {
                nv0Var.a0(-1797563167);
                boolean zH2 = nv0Var.h(h10Var5) | (((((i2 & 3670016) ^ 1572864) <= 1048576 || !nv0Var.f(ns0Var3)) && (i2 & 1572864) != 1048576) ? z : true) | ((i2 & 57344) == 16384 ? true : z);
                Object objO7 = nv0Var.O();
                if (zH2 != 0 || objO7 == zjVar) {
                    final int i31 = 0;
                    zv1Var3 = zv1Var6;
                    h10Var3 = h10Var5;
                    vr1Var = vr1Var4;
                    qt1Var = qt1Var4;
                    z2 = true;
                    ns0 ns0Var6 = new ns0() { // from class: ru1
                        @Override // defpackage.ns0
                        public final Object h(Object obj13) {
                            int i32 = i31;
                            os1 os1Var3 = os1Var2;
                            ns0 ns0Var7 = ns0Var;
                            ns0 ns0Var8 = ns0Var3;
                            h10 h10Var6 = h10Var3;
                            td tdVar = (td) obj13;
                            switch (i32) {
                                case 0:
                                    fu1 fu1Var4 = ((qt1) tdVar.c()).g;
                                    fu1Var4.getClass();
                                    g10 g10Var = (g10) fu1Var4;
                                    if (((Boolean) h10Var6.c.getValue()).booleanValue() || ((Boolean) os1Var3.getValue()).booleanValue()) {
                                        int i33 = fu1.j;
                                        for (fu1 fu1Var5 : pq.y(g10Var)) {
                                        }
                                        return (ij0) ns0Var8.h(tdVar);
                                    }
                                    int i34 = fu1.j;
                                    for (fu1 fu1Var6 : pq.y(g10Var)) {
                                    }
                                    return (ij0) ns0Var7.h(tdVar);
                                default:
                                    fu1 fu1Var7 = ((qt1) tdVar.a()).g;
                                    fu1Var7.getClass();
                                    g10 g10Var2 = (g10) fu1Var7;
                                    if (((Boolean) h10Var6.c.getValue()).booleanValue() || ((Boolean) os1Var3.getValue()).booleanValue()) {
                                        int i35 = fu1.j;
                                        for (fu1 fu1Var8 : pq.y(g10Var2)) {
                                        }
                                        return (ek0) ns0Var8.h(tdVar);
                                    }
                                    int i36 = fu1.j;
                                    for (fu1 fu1Var9 : pq.y(g10Var2)) {
                                    }
                                    return (ek0) ns0Var7.h(tdVar);
                            }
                        }
                    };
                    nv0Var.j0(ns0Var6);
                    objO7 = ns0Var6;
                } else {
                    zv1Var3 = zv1Var6;
                    h10Var3 = h10Var5;
                    vr1Var = vr1Var4;
                    qt1Var = qt1Var4;
                    z2 = true;
                }
                ns0 ns0Var7 = (ns0) objO7;
                boolean zH3 = nv0Var.h(h10Var3) | (((((i2 & 29360128) ^ 12582912) <= 8388608 || !nv0Var.f(ns0Var4)) && (i2 & 12582912) != 8388608) ? z : z2) | ((i2 & 458752) == 131072 ? z2 : z);
                Object objO8 = nv0Var.O();
                if (zH3 != 0 || objO8 == zjVar) {
                    final int i32 = 1;
                    ns0Var5 = ns0Var7;
                    ns0 ns0Var8 = new ns0() { // from class: ru1
                        @Override // defpackage.ns0
                        public final Object h(Object obj13) {
                            int i322 = i32;
                            os1 os1Var3 = os1Var2;
                            ns0 ns0Var72 = ns0Var2;
                            ns0 ns0Var82 = ns0Var4;
                            h10 h10Var6 = h10Var3;
                            td tdVar = (td) obj13;
                            switch (i322) {
                                case 0:
                                    fu1 fu1Var4 = ((qt1) tdVar.c()).g;
                                    fu1Var4.getClass();
                                    g10 g10Var = (g10) fu1Var4;
                                    if (((Boolean) h10Var6.c.getValue()).booleanValue() || ((Boolean) os1Var3.getValue()).booleanValue()) {
                                        int i33 = fu1.j;
                                        for (fu1 fu1Var5 : pq.y(g10Var)) {
                                        }
                                        return (ij0) ns0Var82.h(tdVar);
                                    }
                                    int i34 = fu1.j;
                                    for (fu1 fu1Var6 : pq.y(g10Var)) {
                                    }
                                    return (ij0) ns0Var72.h(tdVar);
                                default:
                                    fu1 fu1Var7 = ((qt1) tdVar.a()).g;
                                    fu1Var7.getClass();
                                    g10 g10Var2 = (g10) fu1Var7;
                                    if (((Boolean) h10Var6.c.getValue()).booleanValue() || ((Boolean) os1Var3.getValue()).booleanValue()) {
                                        int i35 = fu1.j;
                                        for (fu1 fu1Var8 : pq.y(g10Var2)) {
                                        }
                                        return (ek0) ns0Var82.h(tdVar);
                                    }
                                    int i36 = fu1.j;
                                    for (fu1 fu1Var9 : pq.y(g10Var2)) {
                                    }
                                    return (ek0) ns0Var72.h(tdVar);
                            }
                        }
                    };
                    nv0Var.j0(ns0Var8);
                    objO8 = ns0Var8;
                } else {
                    ns0Var5 = ns0Var7;
                }
                final ns0 ns0Var9 = (ns0) objO8;
                boolean z6 = (i2 & 234881024) == 67108864 ? z2 : z;
                Object objO9 = nv0Var.O();
                Object obj13 = objO9;
                if (z6 || objO9 == zjVar) {
                    fi1 fi1Var = new fi1(24);
                    nv0Var.j0(fi1Var);
                    obj13 = fi1Var;
                }
                final ns0 ns0Var10 = (ns0) obj13;
                Boolean bool = Boolean.TRUE;
                boolean zH4 = nv0Var.h(h10Var3);
                Object objO10 = nv0Var.O();
                Object obj14 = objO10;
                if (zH4 || objO10 == zjVar) {
                    er1 er1Var3 = new er1(2, e93Var2, h10Var3);
                    nv0Var.j0(er1Var3);
                    obj14 = er1Var3;
                }
                rn.g(bool, (ns0) obj14, nv0Var);
                Object objO11 = nv0Var.O();
                Object obj15 = objO11;
                if (objO11 == zjVar) {
                    it2 it2Var3 = new it2(qt1Var);
                    nv0Var.j0(it2Var3);
                    obj15 = it2Var3;
                }
                it2 it2Var4 = (it2) obj15;
                final os1 os1Var3 = os1Var2;
                gk3 gk3VarZ = w7.Z(it2Var4, "entry", nv0Var, 56, 0);
                if (((Boolean) os1Var3.getValue()).booleanValue()) {
                    nv0Var.a0(-1795329152);
                    Float fValueOf = Float.valueOf(z32Var2.g());
                    boolean zF2 = nv0Var.f(os1Var) | nv0Var.h(it2Var4);
                    Object objO12 = nv0Var.O();
                    if (zF2 || objO12 == zjVar) {
                        h10Var2 = null;
                        objO12 = new l(it2Var4, os1Var, z32Var2, false ? 1 : 0, 25);
                        it2Var2 = it2Var4;
                        nv0Var.j0(objO12);
                    } else {
                        it2Var2 = it2Var4;
                        h10Var2 = null;
                    }
                    rn.l((rs0) objO12, nv0Var, fValueOf);
                    nv0Var.p(false);
                    gk3Var = gk3VarZ;
                    it2Var = it2Var2;
                } else {
                    h10Var2 = null;
                    boolean z7 = false;
                    nv0Var.a0(-1794910745);
                    boolean zH5 = nv0Var.h(it2Var4) | nv0Var.h(qt1Var) | nv0Var.f(gk3VarZ);
                    Object objO13 = nv0Var.O();
                    if (zH5 || objO13 == zjVar) {
                        gk3Var = gk3VarZ;
                        it2Var = it2Var4;
                        objO13 = new n9((Object) it2Var, (Object) qt1Var, (Object) gk3Var, (p40) (z7 ? 1 : 0), 9);
                        nv0Var.j0(objO13);
                    } else {
                        gk3Var = gk3VarZ;
                        it2Var = it2Var4;
                    }
                    rn.l((rs0) objO13, nv0Var, qt1Var);
                    nv0Var.p(false);
                }
                boolean zH6 = nv0Var.h(vr1Var) | nv0Var.h(h10Var3) | nv0Var.f(ns0Var5) | nv0Var.f(ns0Var9) | nv0Var.f(ns0Var10);
                Object objO14 = nv0Var.O();
                if (zH6 || objO14 == zjVar) {
                    final h10 h10Var6 = h10Var3;
                    final vr1 vr1Var5 = vr1Var;
                    final ns0 ns0Var11 = ns0Var5;
                    e93Var = e93Var2;
                    objO14 = new ns0() { // from class: ou1
                        @Override // defpackage.ns0
                        public final Object h(Object obj16) {
                            float f;
                            td tdVar = (td) obj16;
                            if (!((List) e93Var.getValue()).contains(tdVar.a())) {
                                return w7.c0(ij0.b, ek0.b);
                            }
                            String str3 = ((qt1) tdVar.a()).k;
                            vr1 vr1Var6 = vr1Var5;
                            int iB = vr1Var6.b(str3);
                            if (iB >= 0) {
                                f = vr1Var6.c[iB];
                            } else {
                                vr1Var6.d(str3, 0.0f);
                                f = 0.0f;
                            }
                            if (!s51.n(((qt1) tdVar.c()).k, ((qt1) tdVar.a()).k)) {
                                f = (((Boolean) h10Var6.c.getValue()).booleanValue() || ((Boolean) os1Var3.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                            }
                            vr1Var6.d(((qt1) tdVar.c()).k, f);
                            return new e40((ij0) ns0Var11.h(tdVar), (ek0) ns0Var9.h(tdVar), f, (l43) ns0Var10.h(tdVar));
                        }
                    };
                    vr1Var2 = vr1Var5;
                    h10Var4 = h10Var6;
                    os1Var3 = os1Var3;
                    nv0Var.j0(objO14);
                } else {
                    h10Var4 = h10Var3;
                    e93Var = e93Var2;
                    vr1Var2 = vr1Var;
                }
                ns0 ns0Var12 = (ns0) objO14;
                Object objO15 = nv0Var.O();
                Object obj16 = objO15;
                if (objO15 == zjVar) {
                    fi1 fi1Var2 = new fi1(23);
                    nv0Var.j0(fi1Var2);
                    obj16 = fi1Var2;
                }
                e93 e93Var3 = e93Var;
                qt1 qt1Var5 = qt1Var;
                gk3 gk3Var2 = gk3Var;
                zv1Var2 = zv1Var3;
                w7.a(gk3Var2, bq1Var, ns0Var12, h5Var, (ns0) obj16, gq.N(820763100, new tu1(it2Var, qt1Var5, eq2VarD, os1Var3, e93Var3, 0), nv0Var), nv0Var, ((i2 >> 3) & 112) | 221184 | (i2 & 7168));
                nv0Var2 = nv0Var;
                Object objH = gk3Var2.a.h();
                Object value = gk3Var2.d.getValue();
                boolean zF3 = nv0Var2.f(gk3Var2) | nv0Var2.h(nu1Var) | nv0Var2.h(qt1Var5) | nv0Var2.h(h10Var4) | nv0Var2.h(vr1Var2);
                Object objO16 = nv0Var2.O();
                if (zF3 || objO16 == zjVar) {
                    obj2 = value;
                    uu1 uu1Var = new uu1(gk3Var2, nu1Var, qt1Var5, vr1Var2, e93Var3, h10Var4, null);
                    nv0Var2.j0(uu1Var);
                    objO16 = uu1Var;
                } else {
                    obj2 = value;
                }
                rn.m(objH, obj2, (rs0) objO16, nv0Var2);
                nv0Var2.p(false);
            } else {
                h10Var2 = h10Var;
                nv0Var2 = nv0Var;
                zv1Var2 = zv1Var6;
                nv0Var2.a0(-1789758886);
                nv0Var2.p(z);
            }
            yv1 yv1VarB3 = zv1Var2.b("dialog");
            mb0 mb0Var = yv1VarB3 instanceof mb0 ? (mb0) yv1VarB3 : h10Var2;
            if (mb0Var == 0) {
                xj2 xj2VarT2 = nv0Var2.t();
                if (xj2VarT2 != null) {
                    xj2VarT2.d = new pu1(nu1Var, iu1Var, bq1Var, h5Var, ns0Var, ns0Var2, ns0Var3, ns0Var4, i, 0);
                    return;
                }
                return;
            }
            uq.a(mb0Var, nv0Var2, 0);
        }
        xj2 xj2VarT3 = nv0Var2.t();
        if (xj2VarT3 != null) {
            xj2VarT3.d = new pu1(nu1Var, iu1Var, bq1Var, h5Var, ns0Var, ns0Var2, ns0Var3, ns0Var4, i, 1);
        }
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
    */
    public static final void m(q40 q40Var) {
        ha0 ha0Var;
        if (q40Var instanceof ha0) {
            ha0Var = (ha0) q40Var;
            int i = ha0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ha0Var.j = i - Integer.MIN_VALUE;
            } else {
                ha0Var = new ha0(q40Var);
            }
        }
        Object obj = ha0Var.i;
        int i2 = ha0Var.j;
        if (i2 == 0) {
            y02.Q(obj);
            ha0Var.j = 1;
            jr jrVar = new jr(1, vr.I(ha0Var));
            jrVar.s();
            if (jrVar.q() == y50.f) {
                return;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            y02.Q(obj);
        }
        c.d();
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
        notificationManager.createNotificationChannelGroup(new NotificationChannelGroup("samp_group", contextWrapper.getString(top.th1nk.samp.R.string.notif_channel_group)));
        NotificationChannel notificationChannel = new NotificationChannel("server_connection", contextWrapper.getString(top.th1nk.samp.R.string.notif_channel_server), 2);
        notificationChannel.setDescription(contextWrapper.getString(top.th1nk.samp.R.string.notif_channel_server_desc));
        notificationChannel.setGroup("samp_group");
        notificationChannel.setShowBadge(true);
        notificationManager.createNotificationChannel(notificationChannel);
        NotificationChannel notificationChannel2 = new NotificationChannel("raksamp_instances", contextWrapper.getString(top.th1nk.samp.R.string.notif_channel_raksamp), 2);
        notificationChannel2.setDescription(contextWrapper.getString(top.th1nk.samp.R.string.notif_channel_raksamp_desc));
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
