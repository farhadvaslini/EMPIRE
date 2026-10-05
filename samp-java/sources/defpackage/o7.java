package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class o7 extends b1 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final nr1 S;
    public final tj A;
    public final np B;
    public boolean C;
    public l7 D;
    public or1 E;
    public final pr1 F;
    public final mr1 G;
    public final mr1 H;
    public final String I;
    public final String J;
    public final pi K;
    public final or1 L;
    public wu2 M;
    public boolean N;
    public final mr1 O;
    public final v P;
    public final ArrayList Q;
    public final i7 R;
    public final h7 i;
    public int j = Integer.MIN_VALUE;
    public final i7 k = new i7(this, 0);
    public final AccessibilityManager l;
    public long m;
    public List n;
    public final k7 o;
    public int p;
    public int q;
    public s1 r;
    public s1 s;
    public boolean t;
    public final or1 u;
    public final or1 v;
    public final l83 w;
    public final l83 x;
    public int y;
    public Integer z;

    static {
        int[] iArr = {2131230727, 2131230728, 2131230739, 2131230750, 2131230753, 2131230754, 2131230755, 2131230756, 2131230757, 2131230758, 2131230729, 2131230730, 2131230731, 2131230732, 2131230733, 2131230734, 2131230735, 2131230736, 2131230737, 2131230738, 2131230740, 2131230741, 2131230742, 2131230743, 2131230744, 2131230745, 2131230746, 2131230747, 2131230748, 2131230749, 2131230751, 2131230752};
        nr1 nr1Var = f41.a;
        nr1 nr1Var2 = new nr1(32);
        int i = nr1Var2.b;
        if (i < 0) {
            c.i("");
            return;
        }
        int i2 = i + 32;
        nr1Var2.b(i2);
        int[] iArr2 = nr1Var2.a;
        int i3 = nr1Var2.b;
        if (i != i3) {
            uj.G(i2, i, i3, iArr2, iArr2);
        }
        uj.K(i, 0, 12, iArr, iArr2);
        nr1Var2.b += 32;
        S = nr1Var2;
    }

    public o7(h7 h7Var) {
        this.i = h7Var;
        Object systemService = h7Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.l = (AccessibilityManager) systemService;
        this.m = 100L;
        new Handler(Looper.getMainLooper());
        this.o = new k7(this);
        this.p = Integer.MIN_VALUE;
        this.q = Integer.MIN_VALUE;
        this.u = new or1();
        this.v = new or1();
        this.w = new l83(0);
        this.x = new l83(0);
        this.y = -1;
        this.A = new tj(0);
        this.B = lr.a(1, 6, null);
        this.C = true;
        or1 or1Var = h41.a;
        or1Var.getClass();
        this.E = or1Var;
        this.F = new pr1();
        this.G = new mr1();
        this.H = new mr1();
        this.I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.J = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.K = new pi(22);
        this.L = new or1();
        this.M = new wu2(h7Var.getSemanticsOwner().a(), or1Var);
        int i = c41.a;
        this.O = new mr1();
        h7Var.addOnAttachStateChangeListener(this);
        this.P = new v(2, this);
        this.Q = new ArrayList();
        this.R = new i7(this, 1);
    }

    public static Rect G(vr vrVar, float f, float f2) {
        if (!(vrVar instanceof w02) && !(vrVar instanceof x02)) {
            return null;
        }
        jk2 jk2VarA = vrVar.A();
        return new Rect((int) (jk2VarA.a + f), (int) (jk2VarA.b + f2), (int) (jk2VarA.c + f), (int) (jk2VarA.d + f2));
    }

    public static float[] I(vr vrVar) {
        if (!(vrVar instanceof x02)) {
            return null;
        }
        ro2 ro2Var = ((x02) vrVar).l;
        long j = ro2Var.h;
        long j2 = ro2Var.g;
        long j3 = ro2Var.f;
        long j4 = ro2Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region J(vr vrVar, float f, float f2) {
        if (!(vrVar instanceof v02)) {
            return null;
        }
        v02 v02Var = (v02) vrVar;
        jk2 jk2VarH = v02Var.A().h(f, f2);
        Region region = new Region(new Rect((int) (jk2VarH.a + 0.0f), (int) (jk2VarH.b + 0.0f), (int) (jk2VarH.c + 0.0f), (int) (jk2VarH.d + 0.0f)));
        Region region2 = new Region();
        da daVar = v02Var.l;
        if (!(daVar instanceof da)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = daVar.a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String o(vu2 vu2Var) {
        af afVar;
        if (vu2Var != null) {
            qu2 qu2Var = vu2Var.d;
            is1 is1Var = qu2Var.f;
            cv2 cv2Var = zu2.a;
            if (is1Var.c(cv2Var)) {
                return yi1.a((List) qu2Var.c(cv2Var), ",", null, 62);
            }
            cv2 cv2Var2 = zu2.G;
            if (is1Var.c(cv2Var2)) {
                Object objG = is1Var.g(cv2Var2);
                if (objG == null) {
                    objG = null;
                }
                af afVar2 = (af) objG;
                if (afVar2 != null) {
                    return afVar2.g;
                }
            } else {
                Object objG2 = is1Var.g(zu2.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (afVar = (af) qx.r0(list)) != null) {
                    return afVar.g;
                }
            }
        }
        return null;
    }

    public static final boolean s(tr2 tr2Var, float f) {
        cs0 cs0Var = tr2Var.a;
        if (f >= 0.0f || ((Number) cs0Var.a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) cs0Var.a()).floatValue() < ((Number) tr2Var.b.a()).floatValue();
        }
        return true;
    }

    public static final boolean t(tr2 tr2Var) {
        cs0 cs0Var = tr2Var.a;
        if (((Number) cs0Var.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) cs0Var.a()).floatValue();
        ((Number) tr2Var.b.a()).floatValue();
        return false;
    }

    public static final boolean u(tr2 tr2Var) {
        cs0 cs0Var = tr2Var.a;
        if (((Number) cs0Var.a()).floatValue() < ((Number) tr2Var.b.a()).floatValue()) {
            return true;
        }
        ((Number) cs0Var.a()).floatValue();
        return false;
    }

    public static /* synthetic */ void z(o7 o7Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        o7Var.y(i, i2, num, null);
    }

    public final void A(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventJ = j(v(i), 32);
        accessibilityEventJ.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventJ.getText().add(str);
        }
        x(accessibilityEventJ);
    }

    public final void B(int i) {
        l7 l7Var = this.D;
        if (l7Var != null) {
            vu2 vu2Var = l7Var.a;
            if (i != vu2Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - l7Var.f <= 1000) {
                AccessibilityEvent accessibilityEventJ = j(v(vu2Var.f), 131072);
                accessibilityEventJ.setFromIndex(l7Var.d);
                accessibilityEventJ.setToIndex(l7Var.e);
                accessibilityEventJ.setAction(l7Var.b);
                accessibilityEventJ.setMovementGranularity(l7Var.c);
                accessibilityEventJ.getText().add(o(vu2Var));
                x(accessibilityEventJ);
            }
        }
        this.D = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:293:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(defpackage.g41 r57) {
        /*
            Method dump skipped, instruction units count: 1749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7.C(g41):void");
    }

    public final void D(tb1 tb1Var, pr1 pr1Var) {
        qu2 qu2VarW;
        if (tb1Var.H() && !this.i.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(tb1Var)) {
            tb1 tb1Var2 = null;
            if (!tb1Var.L.d(8)) {
                tb1Var = tb1Var.u();
                while (true) {
                    if (tb1Var == null) {
                        tb1Var = null;
                        break;
                    } else if (tb1Var.L.d(8)) {
                        break;
                    } else {
                        tb1Var = tb1Var.u();
                    }
                }
            }
            if (tb1Var == null || (qu2VarW = tb1Var.w()) == null) {
                return;
            }
            if (!qu2VarW.h) {
                tb1 tb1VarU = tb1Var.u();
                while (true) {
                    if (tb1VarU != null) {
                        qu2 qu2VarW2 = tb1VarU.w();
                        if (qu2VarW2 != null && qu2VarW2.h) {
                            tb1Var2 = tb1VarU;
                            break;
                        }
                        tb1VarU = tb1VarU.u();
                    } else {
                        break;
                    }
                }
                if (tb1Var2 != null) {
                    tb1Var = tb1Var2;
                }
            }
            int i = tb1Var.g;
            if (pr1Var.a(i)) {
                z(this, v(i), 2048, 1, 8);
            }
        }
    }

    public final void E(tb1 tb1Var) {
        if (tb1Var.H() && !this.i.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(tb1Var)) {
            int i = tb1Var.g;
            tr2 tr2Var = (tr2) this.u.b(i);
            tr2 tr2Var2 = (tr2) this.v.b(i);
            if (tr2Var == null && tr2Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventJ = j(i, 4096);
            if (tr2Var != null) {
                accessibilityEventJ.setScrollX((int) ((Number) tr2Var.a.a()).floatValue());
                accessibilityEventJ.setMaxScrollX((int) ((Number) tr2Var.b.a()).floatValue());
            }
            if (tr2Var2 != null) {
                accessibilityEventJ.setScrollY((int) ((Number) tr2Var2.a.a()).floatValue());
                accessibilityEventJ.setMaxScrollY((int) ((Number) tr2Var2.b.a()).floatValue());
            }
            x(accessibilityEventJ);
        }
    }

    public final boolean F(vu2 vu2Var, int i, int i2, boolean z) {
        String strO;
        qu2 qu2Var = vu2Var.d;
        int i3 = vu2Var.f;
        cv2 cv2Var = pu2.j;
        if (qu2Var.f.c(cv2Var) && gv3.t(vu2Var)) {
            ss0 ss0Var = (ss0) ((y0) vu2Var.d.c(cv2Var)).b;
            if (ss0Var != null) {
                return ((Boolean) ss0Var.e(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.y) && (strO = o(vu2Var)) != null) {
            if (i < 0 || i != i2 || i2 > strO.length()) {
                i = -1;
            }
            this.y = i;
            boolean z2 = strO.length() > 0;
            x(k(v(i3), z2 ? Integer.valueOf(this.y) : null, z2 ? Integer.valueOf(this.y) : null, z2 ? Integer.valueOf(strO.length()) : null, strO));
            B(i3);
            return true;
        }
        return false;
    }

    public final Rect H(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        h7 h7Var = this.i;
        long jS = h7Var.s(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jS2 = h7Var.s((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jS >> 32);
        int i2 = (int) (jS2 >> 32);
        int i3 = (int) (jS & 4294967295L);
        int i4 = (int) (jS2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7.L():void");
    }

    @Override // defpackage.b1
    public final yl1 a(View view) {
        return this.o;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r21, defpackage.s1 r22, java.lang.String r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7.e(int, s1, java.lang.String, android.os.Bundle):void");
    }

    public final Rect f(xu2 xu2Var) {
        m41 m41Var = xu2Var.b;
        return H(m41Var.a, m41Var.b, m41Var.c, m41Var.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (defpackage.ur.A(r7, r0) == r5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:39:0x0097, B:42:0x00a6, B:43:0x00ae, B:44:0x00b1, B:45:0x00b2, B:20:0x0040, B:23:0x0047, B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:54:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cb -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.q40 r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7.g(q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(boolean r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7.h(boolean, int, long):boolean");
    }

    public final void i() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                w(this.i.getSemanticsOwner().a(), this.M);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                C(n());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent j(int i, int i2) {
        xu2 xu2Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        h7 h7Var = this.i;
        accessibilityEventObtain.setPackageName(h7Var.getContext().getPackageName());
        accessibilityEventObtain.setSource(h7Var, i);
        if (q() && (xu2Var = (xu2) n().b(i)) != null) {
            vu2 vu2Var = xu2Var.a;
            accessibilityEventObtain.setPassword(vu2Var.d.f.c(zu2.N));
            Object objG = vu2Var.d.f.g(zu2.o);
            if (objG == null) {
                objG = null;
            }
            boolean zN = s51.n(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                c1.i(accessibilityEventObtain, zN);
            }
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent k(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventJ = j(i, 8192);
        if (num != null) {
            accessibilityEventJ.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventJ.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventJ.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventJ.getText().add(charSequence);
        }
        return accessibilityEventJ;
    }

    public final int l(vu2 vu2Var) {
        qu2 qu2Var = vu2Var.d;
        if (!qu2Var.f.c(zu2.a)) {
            cv2 cv2Var = zu2.H;
            if (qu2Var.f.c(cv2Var)) {
                return (int) (((yg3) qu2Var.c(cv2Var)).a & 4294967295L);
            }
        }
        return this.y;
    }

    public final int m(vu2 vu2Var) {
        qu2 qu2Var = vu2Var.d;
        if (!qu2Var.f.c(zu2.a)) {
            cv2 cv2Var = zu2.H;
            if (qu2Var.f.c(cv2Var)) {
                return (int) (((yg3) qu2Var.c(cv2Var)).a >> 32);
            }
        }
        return this.y;
    }

    public final g41 n() {
        if (this.C) {
            this.C = false;
            h7 h7Var = this.i;
            this.E = w7.N(h7Var.getSemanticsOwner(), new u0(4));
            if (q()) {
                or1 or1Var = this.E;
                Resources resources = h7Var.getContext().getResources();
                mr1 mr1Var = this.G;
                mr1Var.a();
                mr1 mr1Var2 = this.H;
                mr1Var2.a();
                xu2 xu2Var = (xu2) or1Var.b(-1);
                vu2 vu2Var = xu2Var != null ? xu2Var.a : null;
                vu2Var.getClass();
                ArrayList arrayListB = ev2.b(vu2Var, new s(6, or1Var), new s(7, resources), vr.K(vu2Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((vu2) arrayListB.get(i - 1)).f;
                        int i3 = ((vu2) arrayListB.get(i)).f;
                        mr1Var.f(i2, i3);
                        mr1Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.E;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.n = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.n = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.l;
        if (accessibilityManager.isEnabled()) {
            this.n = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.i.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.P);
        AccessibilityManager accessibilityManager = this.l;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jk2 p(defpackage.vu2 r10, android.graphics.Rect r11, defpackage.z13 r12) {
        /*
            r9 = this;
            n7 r0 = new n7
            r0.<init>(r12)
            tb1 r10 = r10.c
            ax1 r12 = r10.L
            aq1 r12 = r12.f
            int r1 = r12.i
            r1 = r1 & 8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L76
        L14:
            if (r12 == 0) goto L76
            int r1 = r12.h
            r1 = r1 & 8
            if (r1 == 0) goto L6d
            r1 = r12
            r5 = r2
        L1e:
            if (r1 == 0) goto L6d
            boolean r6 = r1 instanceof defpackage.tu2
            if (r6 == 0) goto L30
            r6 = r1
            tu2 r6 = (defpackage.tu2) r6
            r6.K0(r0)
            boolean r6 = r0.f
            if (r6 == 0) goto L68
            r2 = r1
            goto L76
        L30:
            int r6 = r1.h
            r6 = r6 & 8
            if (r6 == 0) goto L68
            boolean r6 = r1 instanceof defpackage.ja0
            if (r6 == 0) goto L68
            r6 = r1
            ja0 r6 = (defpackage.ja0) r6
            aq1 r6 = r6.u
            r7 = r4
        L40:
            if (r6 == 0) goto L65
            int r8 = r6.h
            r8 = r8 & 8
            if (r8 == 0) goto L62
            int r7 = r7 + 1
            if (r7 != r3) goto L4e
            r1 = r6
            goto L62
        L4e:
            if (r5 != 0) goto L59
            qs1 r5 = new qs1
            r8 = 16
            aq1[] r8 = new defpackage.aq1[r8]
            r5.<init>(r8)
        L59:
            if (r1 == 0) goto L5f
            r5.b(r1)
            r1 = r2
        L5f:
            r5.b(r6)
        L62:
            aq1 r6 = r6.k
            goto L40
        L65:
            if (r7 != r3) goto L68
            goto L1e
        L68:
            aq1 r1 = defpackage.vr.j(r5)
            goto L1e
        L6d:
            int r1 = r12.i
            r1 = r1 & 8
            if (r1 == 0) goto L76
            aq1 r12 = r12.k
            goto L14
        L76:
            tu2 r2 = (defpackage.tu2) r2
            if (r2 == 0) goto Lb9
            r12 = r2
            aq1 r12 = (defpackage.aq1) r12
            aq1 r12 = r12.f
            boolean r12 = r12.s
            if (r12 != r3) goto Lb9
            ex1 r10 = defpackage.vr.W(r2)
            ab1 r12 = defpackage.vr.y(r10)
            jk2 r10 = r12.c0(r10, r4)
            float r12 = r10.a
            float r0 = r10.b
            float r1 = r10.c
            float r10 = r10.d
            android.graphics.Rect r9 = r9.H(r12, r0, r1, r10)
            int r10 = r9.left
            int r12 = r11.left
            int r10 = r10 - r12
            float r10 = (float) r10
            int r12 = r9.top
            int r11 = r11.top
            int r12 = r12 - r11
            float r11 = (float) r12
            jk2 r12 = new jk2
            int r0 = r9.width()
            float r0 = (float) r0
            float r0 = r0 + r10
            int r9 = r9.height()
            float r9 = (float) r9
            float r9 = r9 + r11
            r12.<init>(r10, r11, r0, r9)
            return r12
        Lb9:
            ax1 r9 = r10.L
            ex1 r9 = r9.d
            jk2 r9 = defpackage.vr.q(r9, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7.p(vu2, android.graphics.Rect, z13):jk2");
    }

    public final boolean q() {
        AccessibilityManager accessibilityManager = this.l;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.n;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.n = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void r(tb1 tb1Var) {
        if (this.A.add(tb1Var)) {
            this.B.l(dm3.a);
        }
    }

    public final int v(int i) {
        if (i == this.i.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.vu2 r20, defpackage.wu2 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = defpackage.o41.a
            pr1 r3 = new pr1
            r3.<init>()
            r4 = 4
            java.util.List r5 = defpackage.vu2.j(r4, r1)
            tb1 r6 = r1.c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            vu2 r10 = (defpackage.vu2) r10
            g41 r11 = r0.n()
            int r10 = r10.f
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L3d
            pr1 r11 = r2.b
            boolean r11 = r11.c(r10)
            if (r11 != 0) goto L3a
            r0.r(r6)
            return
        L3a:
            r3.a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            pr1 r2 = r2.b
            int[] r5 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.c(r15)
            if (r15 != 0) goto L80
            r0.r(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = defpackage.vu2.j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            vu2 r3 = (defpackage.vu2) r3
            or1 r4 = r0.L
            int r5 = r3.f
            java.lang.Object r4 = r4.b(r5)
            wu2 r4 = (defpackage.wu2) r4
            if (r4 == 0) goto Lb6
            g41 r5 = r0.n()
            int r6 = r3.f
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb6
            r0.w(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7.w(vu2, wu2):void");
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.t = true;
        }
        try {
            return ((Boolean) this.k.h(accessibilityEvent)).booleanValue();
        } finally {
            this.t = false;
        }
    }

    public final boolean y(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent accessibilityEventJ = j(i, i2);
        if (num != null) {
            accessibilityEventJ.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventJ.setContentDescription(yi1.a(list, ",", null, 62));
        }
        return x(accessibilityEventJ);
    }
}
