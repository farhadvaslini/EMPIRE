package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
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
    */
    public final void C(g41 g41Var) {
        Integer num;
        ArrayList arrayList;
        ArrayList arrayList2;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        Integer num4;
        int i5;
        int i6;
        qu2 qu2Var;
        vu2 vu2Var;
        boolean z;
        int i7;
        boolean z2;
        boolean z3;
        is1 is1Var;
        tb1 tb1Var;
        int i8;
        qu2 qu2Var2;
        Integer num5;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j;
        int i9;
        int i10;
        tb1 tb1Var2;
        vu2 vu2Var2;
        int i11;
        int i12;
        is1 is1Var2;
        int i13;
        Integer num6;
        bs2 bs2Var;
        boolean z4;
        bs2 bs2Var2;
        zs0 zs0Var;
        boolean z5;
        int i14;
        String str;
        int i15;
        int i16;
        AccessibilityEvent accessibilityEventK;
        ArrayList arrayList7;
        o7 o7Var = this;
        g41 g41Var2 = g41Var;
        Integer num7 = 64;
        ArrayList arrayList8 = o7Var.Q;
        ArrayList arrayList9 = new ArrayList(arrayList8);
        arrayList8.clear();
        int[] iArr3 = g41Var2.b;
        long[] jArr3 = g41Var2.a;
        int i17 = 2;
        int length = jArr3.length - 2;
        int i18 = 0;
        Integer num8 = 0;
        if (length < 0) {
            return;
        }
        int i19 = 0;
        while (true) {
            long j2 = jArr3[i19];
            int i20 = i17;
            int i21 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i22 = 8;
                int i23 = 8 - ((~(i19 - i21)) >>> 31);
                long j3 = j2;
                int i24 = i18;
                while (i24 < i23) {
                    if ((j3 & 255) < 128) {
                        int i25 = iArr3[(i19 << 3) + i24];
                        wu2 wu2Var = (wu2) o7Var.L.b(i25);
                        if (wu2Var == null) {
                            i2 = i24;
                            num3 = num7;
                            arrayList3 = arrayList9;
                            arrayList4 = arrayList8;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i3 = i23;
                            i4 = i19;
                            num4 = num8;
                            i5 = i22;
                            i6 = i20;
                        } else {
                            qu2 qu2Var3 = wu2Var.a;
                            is1 is1Var3 = qu2Var3.f;
                            xu2 xu2Var = (xu2) g41Var2.b(i25);
                            int i26 = i22;
                            vu2 vu2Var3 = xu2Var != null ? xu2Var.a : null;
                            if (vu2Var3 == null) {
                                throw nc2.d("no value for specified key");
                            }
                            tb1 tb1Var3 = vu2Var3.c;
                            qu2 qu2Var4 = vu2Var3.d;
                            iArr2 = iArr3;
                            int i27 = vu2Var3.f;
                            jArr2 = jArr3;
                            is1 is1Var4 = qu2Var4.f;
                            i4 = i19;
                            Object[] objArr = is1Var4.b;
                            Object[] objArr2 = is1Var4.c;
                            long[] jArr4 = is1Var4.a;
                            i2 = i24;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                tb1 tb1Var4 = tb1Var3;
                                i3 = i23;
                                int i28 = 0;
                                z2 = false;
                                while (true) {
                                    long j4 = jArr4[i28];
                                    vu2 vu2Var4 = vu2Var3;
                                    int i29 = i28;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                        int i31 = 0;
                                        while (i31 < i30) {
                                            if ((j4 & 255) < 128) {
                                                int i32 = (i29 << 3) + i31;
                                                Object obj = objArr[i32];
                                                int i33 = length2;
                                                Object obj2 = objArr2[i32];
                                                qu2Var2 = qu2Var3;
                                                cv2 cv2Var = (cv2) obj;
                                                j = j4;
                                                cv2 cv2Var2 = zu2.v;
                                                if (s51.n(cv2Var, cv2Var2) || s51.n(cv2Var, zu2.w)) {
                                                    int size = arrayList9.size();
                                                    i9 = i31;
                                                    int i34 = 0;
                                                    while (true) {
                                                        if (i34 >= size) {
                                                            bs2Var = null;
                                                            break;
                                                        }
                                                        int i35 = size;
                                                        if (((bs2) arrayList9.get(i34)).f == i25) {
                                                            bs2Var = (bs2) arrayList9.get(i34);
                                                            break;
                                                        } else {
                                                            i34++;
                                                            size = i35;
                                                        }
                                                    }
                                                    if (bs2Var != null) {
                                                        z4 = false;
                                                    } else {
                                                        bs2Var = new bs2(i25, arrayList8);
                                                        z4 = true;
                                                    }
                                                    arrayList8.add(bs2Var);
                                                } else {
                                                    i9 = i31;
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    cv2 cv2Var3 = zu2.d;
                                                    if (s51.n(cv2Var, cv2Var3)) {
                                                        obj2.getClass();
                                                        String str2 = (String) obj2;
                                                        boolean zC = is1Var3.c(cv2Var3);
                                                        int i36 = i26;
                                                        if (zC) {
                                                            o7Var.A(i25, i36, str2);
                                                        }
                                                    } else {
                                                        int i37 = i26;
                                                        if (s51.n(cv2Var, zu2.b)) {
                                                            z(o7Var, o7Var.v(i25), 2048, num7, i37);
                                                            z(o7Var, o7Var.v(i25), 2048, num8, i37);
                                                        } else if (s51.n(cv2Var, zu2.L)) {
                                                            z(o7Var, o7Var.v(i25), 2048, 8192, 8);
                                                            z(o7Var, o7Var.v(i25), 2048, num8, 8);
                                                        } else if (s51.n(cv2Var, zu2.O)) {
                                                            z(o7Var, o7Var.v(i25), 2048, 3072, 8);
                                                        } else if (s51.n(cv2Var, zu2.c)) {
                                                            z(o7Var, o7Var.v(i25), 2048, num7, 8);
                                                            z(o7Var, o7Var.v(i25), 2048, num8, 8);
                                                        } else {
                                                            cv2 cv2Var4 = zu2.K;
                                                            arrayList5 = arrayList9;
                                                            if (s51.n(cv2Var, cv2Var4)) {
                                                                Object objG = is1Var4.g(zu2.z);
                                                                if (objG == null) {
                                                                    objG = null;
                                                                }
                                                                no2 no2Var = (no2) objG;
                                                                if (no2Var != null && no2Var.a == 4) {
                                                                    Object objG2 = is1Var4.g(cv2Var4);
                                                                    if (objG2 == null) {
                                                                        objG2 = null;
                                                                    }
                                                                    if (s51.n(objG2, Boolean.TRUE)) {
                                                                        AccessibilityEvent accessibilityEventJ = o7Var.j(o7Var.v(i25), 4);
                                                                        vu2Var2 = vu2Var4;
                                                                        tb1Var2 = tb1Var4;
                                                                        vu2 vu2Var5 = new vu2(vu2Var2.a, true, tb1Var2, qu2Var4);
                                                                        Object objG3 = vu2Var5.k().f.g(zu2.a);
                                                                        if (objG3 == null) {
                                                                            objG3 = null;
                                                                        }
                                                                        List list = (List) objG3;
                                                                        i12 = i30;
                                                                        String strA = list != null ? yi1.a(list, ",", null, 62) : null;
                                                                        Object objG4 = vu2Var5.k().f.g(zu2.C);
                                                                        if (objG4 == null) {
                                                                            objG4 = null;
                                                                        }
                                                                        List list2 = (List) objG4;
                                                                        arrayList7 = arrayList8;
                                                                        String strA2 = list2 != null ? yi1.a(list2, ",", null, 62) : null;
                                                                        if (strA != null) {
                                                                            accessibilityEventJ.setContentDescription(strA);
                                                                        }
                                                                        if (strA2 != null) {
                                                                            accessibilityEventJ.getText().add(strA2);
                                                                        }
                                                                        o7Var.x(accessibilityEventJ);
                                                                    } else {
                                                                        arrayList7 = arrayList8;
                                                                        tb1Var2 = tb1Var4;
                                                                        vu2Var2 = vu2Var4;
                                                                        i12 = i30;
                                                                        z(o7Var, o7Var.v(i25), 2048, num8, 8);
                                                                    }
                                                                } else {
                                                                    arrayList7 = arrayList8;
                                                                    tb1Var2 = tb1Var4;
                                                                    vu2Var2 = vu2Var4;
                                                                    i12 = i30;
                                                                    z(o7Var, o7Var.v(i25), 2048, num7, 8);
                                                                    z(o7Var, o7Var.v(i25), 2048, num8, 8);
                                                                }
                                                                num6 = num8;
                                                                i13 = i25;
                                                                is1Var2 = is1Var3;
                                                                num5 = num7;
                                                                i10 = i20;
                                                                arrayList6 = arrayList7;
                                                                i11 = i33;
                                                            } else {
                                                                ArrayList arrayList10 = arrayList8;
                                                                tb1Var2 = tb1Var4;
                                                                vu2Var2 = vu2Var4;
                                                                i12 = i30;
                                                                if (s51.n(cv2Var, zu2.a)) {
                                                                    int iV = o7Var.v(i25);
                                                                    obj2.getClass();
                                                                    o7Var.y(iV, 2048, 4, (List) obj2);
                                                                    num6 = num8;
                                                                    i13 = i25;
                                                                    is1Var2 = is1Var3;
                                                                    num5 = num7;
                                                                } else {
                                                                    cv2 cv2Var5 = zu2.G;
                                                                    String str3 = "";
                                                                    if (s51.n(cv2Var, cv2Var5)) {
                                                                        if (is1Var4.c(pu2.k)) {
                                                                            Object objG5 = is1Var3.g(cv2Var5);
                                                                            if (objG5 == null) {
                                                                                objG5 = null;
                                                                            }
                                                                            af afVar = (af) objG5;
                                                                            if (afVar == null) {
                                                                                afVar = "";
                                                                            }
                                                                            Object objG6 = is1Var4.g(cv2Var5);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            CharSequence charSequence = (af) objG6;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            CharSequence charSequenceK = K(charSequence);
                                                                            int length3 = afVar.length();
                                                                            int length4 = charSequence.length();
                                                                            int i38 = length3 > length4 ? length4 : length3;
                                                                            Integer num9 = num8;
                                                                            int i39 = 0;
                                                                            while (true) {
                                                                                num5 = num7;
                                                                                if (i39 >= i38) {
                                                                                    i15 = length3;
                                                                                    break;
                                                                                }
                                                                                i15 = length3;
                                                                                if (afVar.charAt(i39) != charSequence.charAt(i39)) {
                                                                                    break;
                                                                                }
                                                                                i39++;
                                                                                length3 = i15;
                                                                                num7 = num5;
                                                                            }
                                                                            int i40 = 0;
                                                                            while (true) {
                                                                                if (i40 >= i38 - i39) {
                                                                                    i16 = i40;
                                                                                    break;
                                                                                }
                                                                                i16 = i40;
                                                                                if (afVar.charAt((i15 - 1) - i40) != charSequence.charAt((length4 - 1) - i16)) {
                                                                                    break;
                                                                                } else {
                                                                                    i40 = i16 + 1;
                                                                                }
                                                                            }
                                                                            int i41 = (i15 - i16) - i39;
                                                                            int i42 = (length4 - i16) - i39;
                                                                            cv2 cv2Var6 = zu2.N;
                                                                            boolean zC2 = is1Var3.c(cv2Var6);
                                                                            boolean zC3 = is1Var4.c(cv2Var6);
                                                                            boolean zC4 = is1Var3.c(zu2.G);
                                                                            boolean z6 = zC4 && !zC2 && zC3;
                                                                            boolean z7 = zC4 && zC2 && !zC3;
                                                                            if (z6 || z7) {
                                                                                i13 = i25;
                                                                                is1Var2 = is1Var3;
                                                                                num8 = num9;
                                                                                accessibilityEventK = o7Var.k(o7Var.v(i25), num8, num9, Integer.valueOf(length4), charSequenceK);
                                                                            } else {
                                                                                accessibilityEventK = o7Var.j(o7Var.v(i25), 16);
                                                                                accessibilityEventK.setFromIndex(i39);
                                                                                accessibilityEventK.setRemovedCount(i41);
                                                                                accessibilityEventK.setAddedCount(i42);
                                                                                accessibilityEventK.setBeforeText(afVar);
                                                                                accessibilityEventK.getText().add(charSequenceK);
                                                                                i13 = i25;
                                                                                is1Var2 = is1Var3;
                                                                                num8 = num9;
                                                                            }
                                                                            accessibilityEventK.setClassName("android.widget.EditText");
                                                                            if (Build.VERSION.SDK_INT >= 37) {
                                                                                j7.a(vu2Var2, accessibilityEventK);
                                                                            }
                                                                            o7Var.x(accessibilityEventK);
                                                                            if (z6 || z7) {
                                                                                long j5 = ((yg3) qu2Var4.c(zu2.H)).a;
                                                                                accessibilityEventK.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventK.setToIndex((int) (j5 & 4294967295L));
                                                                                o7Var.x(accessibilityEventK);
                                                                            }
                                                                        } else {
                                                                            i13 = i25;
                                                                            is1Var2 = is1Var3;
                                                                            num5 = num7;
                                                                            z(o7Var, o7Var.v(i13), 2048, Integer.valueOf(i20), 8);
                                                                        }
                                                                        num6 = num8;
                                                                    } else {
                                                                        i13 = i25;
                                                                        is1Var2 = is1Var3;
                                                                        num5 = num7;
                                                                        i11 = i33;
                                                                        cv2 cv2Var7 = zu2.H;
                                                                        if (s51.n(cv2Var, cv2Var7)) {
                                                                            Object objG7 = is1Var4.g(cv2Var5);
                                                                            if (objG7 == null) {
                                                                                objG7 = null;
                                                                            }
                                                                            af afVar2 = (af) objG7;
                                                                            if (afVar2 != null && (str = afVar2.g) != null) {
                                                                                str3 = str;
                                                                            }
                                                                            long j6 = ((yg3) qu2Var4.c(cv2Var7)).a;
                                                                            num6 = num8;
                                                                            o7Var = this;
                                                                            o7Var.x(o7Var.k(o7Var.v(i13), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str3.length()), K(str3)));
                                                                            o7Var.B(i27);
                                                                        } else {
                                                                            num6 = num8;
                                                                            if (s51.n(cv2Var, cv2Var2) || s51.n(cv2Var, zu2.w)) {
                                                                                o7Var.r(tb1Var2);
                                                                                int size2 = arrayList10.size();
                                                                                int i43 = 0;
                                                                                while (true) {
                                                                                    if (i43 >= size2) {
                                                                                        arrayList6 = arrayList10;
                                                                                        bs2Var2 = null;
                                                                                        break;
                                                                                    }
                                                                                    arrayList6 = arrayList10;
                                                                                    if (((bs2) arrayList6.get(i43)).f == i13) {
                                                                                        bs2Var2 = (bs2) arrayList6.get(i43);
                                                                                        break;
                                                                                    } else {
                                                                                        i43++;
                                                                                        arrayList10 = arrayList6;
                                                                                    }
                                                                                }
                                                                                bs2Var2.getClass();
                                                                                Object objG8 = is1Var4.g(cv2Var2);
                                                                                if (objG8 == null) {
                                                                                    objG8 = null;
                                                                                }
                                                                                bs2Var2.j = (tr2) objG8;
                                                                                Object objG9 = is1Var4.g(zu2.w);
                                                                                if (objG9 == null) {
                                                                                    objG9 = null;
                                                                                }
                                                                                bs2Var2.k = (tr2) objG9;
                                                                                if (bs2Var2.g.contains(bs2Var2)) {
                                                                                    i10 = i20;
                                                                                    o7Var.i.getSnapshotObserver().a.d(bs2Var2, o7Var.R, new u1(i10, bs2Var2, o7Var));
                                                                                } else {
                                                                                    i10 = i20;
                                                                                }
                                                                            } else if (s51.n(cv2Var, zu2.l)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i14 = 8;
                                                                                    o7Var.x(o7Var.j(o7Var.v(i27), 8));
                                                                                } else {
                                                                                    i14 = 8;
                                                                                }
                                                                                z(o7Var, o7Var.v(i27), 2048, num6, i14);
                                                                            } else {
                                                                                cv2 cv2Var8 = pu2.x;
                                                                                if (s51.n(cv2Var, cv2Var8)) {
                                                                                    List list3 = (List) qu2Var4.c(cv2Var8);
                                                                                    Object objG10 = is1Var2.g(cv2Var8);
                                                                                    if (objG10 == null) {
                                                                                        objG10 = null;
                                                                                    }
                                                                                    List list4 = (List) objG10;
                                                                                    if (list4 != null) {
                                                                                        js1 js1Var = or2.a;
                                                                                        js1 js1Var2 = new js1();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            qn1.b();
                                                                                            return;
                                                                                        }
                                                                                        js1 js1Var3 = new js1();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            qn1.b();
                                                                                            return;
                                                                                        }
                                                                                        z5 = z2 || !js1Var2.equals(js1Var3);
                                                                                    } else {
                                                                                        z5 = z2 || !list3.isEmpty();
                                                                                    }
                                                                                    z2 = z5;
                                                                                } else if (z2 || !(obj2 instanceof y0)) {
                                                                                    z2 = true;
                                                                                } else {
                                                                                    y0 y0Var = (y0) obj2;
                                                                                    Object objG11 = is1Var2.g(cv2Var);
                                                                                    if (objG11 == null) {
                                                                                        objG11 = null;
                                                                                    }
                                                                                    if (y0Var != objG11) {
                                                                                        if (objG11 instanceof y0) {
                                                                                            String str4 = y0Var.a;
                                                                                            y0 y0Var2 = (y0) objG11;
                                                                                            zs0 zs0Var2 = y0Var2.b;
                                                                                            if (s51.n(str4, y0Var2.a) && (((zs0Var = y0Var.b) != null || zs0Var2 == null) && (zs0Var == null || zs0Var2 != null))) {
                                                                                            }
                                                                                        }
                                                                                        z2 = true;
                                                                                    }
                                                                                    z2 = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        i10 = i20;
                                                                        arrayList6 = arrayList10;
                                                                    }
                                                                }
                                                                i10 = i20;
                                                                arrayList6 = arrayList10;
                                                                i11 = i33;
                                                            }
                                                        }
                                                    }
                                                    num5 = num7;
                                                    arrayList5 = arrayList9;
                                                    arrayList6 = arrayList8;
                                                    i10 = i20;
                                                    tb1Var2 = tb1Var4;
                                                    vu2Var2 = vu2Var4;
                                                    i11 = i33;
                                                } else {
                                                    Object objG12 = is1Var3.g(cv2Var);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (!s51.n(obj2, objG12)) {
                                                    }
                                                    num5 = num7;
                                                    arrayList5 = arrayList9;
                                                    arrayList6 = arrayList8;
                                                    i10 = i20;
                                                    tb1Var2 = tb1Var4;
                                                    vu2Var2 = vu2Var4;
                                                    i11 = i33;
                                                }
                                                i26 = 8;
                                                i20 = i10;
                                                is1Var3 = is1Var2;
                                                tb1Var4 = tb1Var2;
                                                i30 = i12;
                                                i31 = i9 + 1;
                                                i25 = i13;
                                                vu2Var4 = vu2Var2;
                                                j4 = j >> 8;
                                                arrayList8 = arrayList6;
                                                length2 = i11;
                                                num8 = num6;
                                                qu2Var3 = qu2Var2;
                                                arrayList9 = arrayList5;
                                                num7 = num5;
                                            } else {
                                                qu2Var2 = qu2Var3;
                                                num5 = num7;
                                                arrayList5 = arrayList9;
                                                arrayList6 = arrayList8;
                                                j = j4;
                                                i9 = i31;
                                                i10 = i20;
                                                tb1Var2 = tb1Var4;
                                                vu2Var2 = vu2Var4;
                                                i11 = length2;
                                            }
                                            num6 = num8;
                                            i13 = i25;
                                            i12 = i30;
                                            is1Var2 = is1Var3;
                                            i26 = 8;
                                            i20 = i10;
                                            is1Var3 = is1Var2;
                                            tb1Var4 = tb1Var2;
                                            i30 = i12;
                                            i31 = i9 + 1;
                                            i25 = i13;
                                            vu2Var4 = vu2Var2;
                                            j4 = j >> 8;
                                            arrayList8 = arrayList6;
                                            length2 = i11;
                                            num8 = num6;
                                            qu2Var3 = qu2Var2;
                                            arrayList9 = arrayList5;
                                            num7 = num5;
                                        }
                                        qu2Var = qu2Var3;
                                        num3 = num7;
                                        arrayList3 = arrayList9;
                                        arrayList4 = arrayList8;
                                        i6 = i20;
                                        tb1Var = tb1Var4;
                                        vu2Var = vu2Var4;
                                        z = true;
                                        i8 = length2;
                                        num4 = num8;
                                        i7 = i25;
                                        int i44 = i30;
                                        is1Var = is1Var3;
                                        if (i44 != i26) {
                                            break;
                                        }
                                    } else {
                                        qu2Var = qu2Var3;
                                        is1Var = is1Var3;
                                        num3 = num7;
                                        arrayList3 = arrayList9;
                                        arrayList4 = arrayList8;
                                        i6 = i20;
                                        tb1Var = tb1Var4;
                                        vu2Var = vu2Var4;
                                        z = true;
                                        i8 = length2;
                                        num4 = num8;
                                        i7 = i25;
                                    }
                                    if (i29 == i8) {
                                        break;
                                    }
                                    num8 = num4;
                                    i25 = i7;
                                    i20 = i6;
                                    is1Var3 = is1Var;
                                    tb1Var4 = tb1Var;
                                    arrayList9 = arrayList3;
                                    i26 = 8;
                                    i28 = i29 + 1;
                                    arrayList8 = arrayList4;
                                    length2 = i8;
                                    vu2Var3 = vu2Var;
                                    qu2Var3 = qu2Var;
                                    num7 = num3;
                                }
                            } else {
                                qu2Var = qu2Var3;
                                num3 = num7;
                                arrayList3 = arrayList9;
                                arrayList4 = arrayList8;
                                i3 = i23;
                                vu2Var = vu2Var3;
                                i6 = i20;
                                z = true;
                                num4 = num8;
                                i7 = i25;
                                z2 = false;
                            }
                            if (!z2) {
                                Iterator it = qu2Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    } else {
                                        if (!vu2Var.k().f.c((cv2) ((Map.Entry) it.next()).getKey())) {
                                            z3 = z;
                                            break;
                                        }
                                    }
                                }
                                z2 = z3;
                            }
                            if (z2) {
                                i5 = 8;
                                z(o7Var, o7Var.v(i7), 2048, num4, 8);
                            } else {
                                i5 = 8;
                            }
                        }
                    }
                    j3 >>= i5;
                    i24 = i2 + 1;
                    g41Var2 = g41Var;
                    arrayList8 = arrayList4;
                    num8 = num4;
                    i20 = i6;
                    i22 = i5;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i19 = i4;
                    i23 = i3;
                    arrayList9 = arrayList3;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList9;
                arrayList2 = arrayList8;
                iArr = iArr3;
                jArr = jArr3;
                int i45 = i23;
                int i46 = i19;
                num2 = num8;
                int i47 = i22;
                i17 = i20;
                if (i45 != i47) {
                    return;
                } else {
                    i = i46;
                }
            } else {
                num = num7;
                arrayList = arrayList9;
                arrayList2 = arrayList8;
                iArr = iArr3;
                jArr = jArr3;
                i17 = i20;
                num2 = num8;
                i = i19;
            }
            if (i == i21) {
                return;
            }
            i19 = i + 1;
            g41Var2 = g41Var;
            length = i21;
            arrayList8 = arrayList2;
            num8 = num2;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList9 = arrayList;
            num7 = num;
            i18 = 0;
        }
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
    */
    public final void L() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int iNumberOfTrailingZeros;
        char c2;
        pr1 pr1Var = new pr1();
        pr1 pr1Var2 = this.F;
        int[] iArr = pr1Var2.b;
        long[] jArr3 = pr1Var2.a;
        int length = jArr3.length - 2;
        or1 or1Var = this.L;
        int i3 = 8;
        if (length >= 0) {
            int i4 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i4];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j5 & 255) < 128) {
                            int i7 = iArr[(i4 << 3) + i6];
                            c2 = c3;
                            xu2 xu2Var = (xu2) n().b(i7);
                            vu2 vu2Var = xu2Var != null ? xu2Var.a : null;
                            if (vu2Var != null) {
                                if (!vu2Var.d.f.c(zu2.d)) {
                                    pr1Var.a(i7);
                                    wu2 wu2Var = (wu2) or1Var.b(i7);
                                    if (wu2Var != null) {
                                        Object objG = wu2Var.a.f.g(zu2.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    A(i7, 32, obj);
                                }
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i6++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = pr1Var.b;
        long[] jArr4 = pr1Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j6 = jArr4[i8];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j6 & j2) < j) {
                            int i11 = iArr2[(i8 << 3) + i10];
                            int iHashCode = Integer.hashCode(i11) * (-862048943);
                            int i12 = iHashCode ^ (iHashCode << 16);
                            int i13 = i12 & 127;
                            int i14 = pr1Var2.c;
                            int i15 = (i12 >>> 7) & i14;
                            i = i3;
                            int i16 = 0;
                            while (true) {
                                long[] jArr5 = pr1Var2.a;
                                int i17 = i15 >> 3;
                                jArr2 = jArr4;
                                int i18 = (i15 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i17] >>> i18) | ((jArr5[i17 + 1] << (64 - i18)) & ((-i18) >> 63));
                                int i19 = i14;
                                long j8 = (((long) i13) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j9) >> 3)) & i19;
                                    int i20 = i19;
                                    if (pr1Var2.b[iNumberOfTrailingZeros] == i11) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i19 = i20;
                                }
                                i16 += 8;
                                i15 = (i15 + i16) & i2;
                                jArr4 = jArr2;
                                i14 = i2;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                pr1Var2.g(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i3;
                        }
                        j6 = j4 >> i;
                        i10++;
                        i3 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i9 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                jArr4 = jArr;
                i3 = 8;
            }
        }
        or1Var.c();
        g41 g41VarN = n();
        int[] iArr3 = g41VarN.b;
        Object[] objArr = g41VarN.c;
        long[] jArr6 = g41VarN.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            vu2 vu2Var2 = ((xu2) objArr[i25]).a;
                            qu2 qu2Var = vu2Var2.d;
                            cv2 cv2Var = zu2.d;
                            if (qu2Var.f.c(cv2Var) && pr1Var2.a(i26)) {
                                A(i26, 16, (String) vu2Var2.d.c(cv2Var));
                            }
                            or1Var.i(i26, new wu2(vu2Var2, n()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.M = new wu2(this.i.getSemanticsOwner().a(), n());
    }

    @Override // defpackage.b1
    public final yl1 a(View view) {
        return this.o;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i, s1 s1Var, String str, Bundle bundle) {
        vu2 vu2Var;
        RectF[] rectFArr;
        int i2;
        int i3;
        int i4;
        pg3 pg3Var;
        jk2 jk2Var;
        AccessibilityNodeInfo accessibilityNodeInfo = s1Var.a;
        xu2 xu2Var = (xu2) n().b(i);
        if (xu2Var == null || (vu2Var = xu2Var.a) == null) {
            return;
        }
        tb1 tb1Var = vu2Var.c;
        qu2 qu2Var = vu2Var.d;
        is1 is1Var = qu2Var.f;
        String strO = o(vu2Var);
        if (s51.n(str, this.I)) {
            int iD = this.G.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (s51.n(str, this.J)) {
            int iD2 = this.H.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = is1Var.c(pu2.a);
        h7 h7Var = this.i;
        int i5 = 0;
        if (zC && bundle != null && s51.n(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i7 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i7 > 0 && i6 >= 0) {
                if (i6 < (strO != null ? strO.length() : Integer.MAX_VALUE)) {
                    pg3 pg3VarD = t22.D(qu2Var);
                    if (pg3VarD == null) {
                        rectFArr = null;
                    } else {
                        s21 s21Var = tb1Var.L.c;
                        if (!s21Var.i0.s) {
                            s21Var = null;
                        }
                        if (s21Var != null) {
                            long jK0 = s21Var.k0(0L);
                            jk2 jk2VarG = vu2Var.g();
                            RectF[] rectFArr2 = new RectF[i7];
                            while (i5 < i7) {
                                int i8 = i6 + i5;
                                if (i8 >= pg3VarD.a.a.g.length()) {
                                    i3 = i6;
                                    i4 = i7;
                                    pg3Var = pg3VarD;
                                    jk2Var = jk2VarG;
                                    i2 = i5;
                                } else {
                                    jk2 jk2VarI = pg3VarD.b(i8).i(jK0);
                                    jk2 jk2VarE = jk2VarI.g(jk2VarG) ? jk2VarI.e(jk2VarG) : null;
                                    if (jk2VarE != null) {
                                        i2 = i5;
                                        long jS = h7Var.s((((long) Float.floatToRawIntBits(jk2VarE.a)) << 32) | (((long) Float.floatToRawIntBits(jk2VarE.b)) & 4294967295L));
                                        long jS2 = h7Var.s((((long) Float.floatToRawIntBits(jk2VarE.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(jk2VarE.c)) << 32));
                                        int i9 = (int) (jS >> 32);
                                        i3 = i6;
                                        i4 = i7;
                                        int i10 = (int) (jS2 >> 32);
                                        pg3Var = pg3VarD;
                                        jk2Var = jk2VarG;
                                        int i11 = (int) (jS & 4294967295L);
                                        int i12 = (int) (jS2 & 4294967295L);
                                        rectFArr2[i2] = new RectF(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)));
                                    }
                                }
                                i5 = i2 + 1;
                                pg3VarD = pg3Var;
                                i7 = i4;
                                jk2VarG = jk2Var;
                                i6 = i3;
                            }
                            rectFArr = rectFArr2;
                        }
                    }
                    if (rectFArr == null) {
                        return;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        cv2 cv2Var = zu2.A;
        if (is1Var.c(cv2Var) && bundle != null && s51.n(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = is1Var.g(cv2Var);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (s51.n(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, vu2Var.f);
            return;
        }
        if (s51.n(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = is1Var.g(zu2.S);
            z13 z13Var = (z13) (objG2 == null ? null : objG2);
            if (z13Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                jk2 jk2VarP = p(vu2Var, rect, z13Var);
                float f = jk2VarP.b;
                float f2 = jk2VarP.a;
                vr vrVarA = z13Var.a(jk2VarP.c(), tb1Var.F, h7Var.getDensity());
                if (vrVarA instanceof w02) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(vrVarA, f2, f));
                    return;
                } else if (vrVarA instanceof x02) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(vrVarA, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", I(vrVarA));
                    return;
                } else if (!(vrVarA instanceof v02)) {
                    c.k();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", J(vrVarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (s51.n(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = is1Var.g(zu2.S);
            z13 z13Var2 = (z13) (objG3 == null ? null : objG3);
            if (z13Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                jk2 jk2VarP2 = p(vu2Var, rect2, z13Var2);
                Rect rectG = G(z13Var2.a(jk2VarP2.c(), tb1Var.F, h7Var.getDensity()), jk2VarP2.a, jk2VarP2.b);
                if (rectG != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectG);
                    return;
                }
                return;
            }
            return;
        }
        if (s51.n(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = is1Var.g(zu2.S);
            z13 z13Var3 = (z13) (objG4 == null ? null : objG4);
            if (z13Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrI = I(z13Var3.a(p(vu2Var, rect3, z13Var3).c(), tb1Var.F, h7Var.getDensity()));
                if (fArrI != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrI);
                    return;
                }
                return;
            }
            return;
        }
        if (s51.n(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = is1Var.g(zu2.S);
            z13 z13Var4 = (z13) (objG5 == null ? null : objG5);
            if (z13Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                jk2 jk2VarP3 = p(vu2Var, rect4, z13Var4);
                Region regionJ = J(z13Var4.a(jk2VarP3.c(), tb1Var.F, h7Var.getDensity()), jk2VarP3.a, jk2VarP3.b);
                if (regionJ != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionJ);
                }
            }
        }
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
    */
    public final Object g(q40 q40Var) {
        m7 m7Var;
        pr1 pr1Var;
        kp kpVar;
        pr1 pr1Var2;
        kp kpVar2;
        Object objB;
        if (q40Var instanceof m7) {
            m7Var = (m7) q40Var;
            int i = m7Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                m7Var.m = i - Integer.MIN_VALUE;
            } else {
                m7Var = new m7(this, q40Var);
            }
        }
        Object obj = m7Var.k;
        int i2 = m7Var.m;
        tj tjVar = this.A;
        y50 y50Var = y50.f;
        try {
            if (i2 == 0) {
                y02.Q(obj);
                pr1Var = new pr1();
                np npVar = this.B;
                npVar.getClass();
                kpVar = new kp(npVar);
                m7Var.i = pr1Var;
                m7Var.j = kpVar;
                m7Var.m = 1;
                objB = kpVar.b(m7Var);
                if (objB != y50Var) {
                }
            } else if (i2 == 1) {
                kpVar2 = m7Var.j;
                pr1Var2 = m7Var.i;
                y02.Q(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kpVar2 = m7Var.j;
                pr1Var2 = m7Var.i;
                y02.Q(obj);
                pr1Var = pr1Var2;
                kpVar = kpVar2;
                m7Var.i = pr1Var;
                m7Var.j = kpVar;
                m7Var.m = 1;
                objB = kpVar.b(m7Var);
                if (objB != y50Var) {
                    return y50Var;
                }
                kp kpVar3 = kpVar;
                pr1Var2 = pr1Var;
                obj = objB;
                kpVar2 = kpVar3;
                if (((Boolean) obj).booleanValue()) {
                    tjVar.clear();
                    return dm3.a;
                }
                kpVar2.c();
                if (q()) {
                    Trace.beginSection("Compose:semantics:boundUpdates");
                    try {
                        int i3 = tjVar.h;
                        for (int i4 = 0; i4 < i3; i4++) {
                            tb1 tb1Var = (tb1) tjVar.g[i4];
                            D(tb1Var, pr1Var2);
                            E(tb1Var);
                        }
                        pr1Var2.b();
                        Trace.endSection();
                        Handler handler = this.i.getHandler();
                        if (!this.N && handler != null) {
                            this.N = true;
                            handler.post(this.P);
                        }
                    } finally {
                    }
                }
                tjVar.clear();
                this.u.c();
                this.v.c();
                long j = this.m;
                m7Var.i = pr1Var2;
                m7Var.j = kpVar2;
                m7Var.m = 2;
            }
        } catch (Throwable th) {
            tjVar.clear();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(boolean z, int i, long j) {
        cv2 cv2Var;
        int i2;
        if (s51.n(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            g41 g41VarN = n();
            if (!gy1.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    cv2Var = zu2.w;
                } else {
                    if (z) {
                        c.k();
                        return false;
                    }
                    cv2Var = zu2.v;
                }
                Object[] objArr = g41VarN.c;
                long[] jArr = g41VarN.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    xu2 xu2Var = (xu2) objArr[(i3 << 3) + i6];
                                    m41 m41Var = xu2Var.b;
                                    float f = m41Var.a;
                                    i2 = i4;
                                    float f2 = m41Var.b;
                                    float f3 = m41Var.c;
                                    float f4 = m41Var.d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objG = xu2Var.a.d.f.g(cv2Var);
                                        if (objG == null) {
                                            objG = null;
                                        }
                                        tr2 tr2Var = (tr2) objG;
                                        if (tr2Var != null) {
                                            cs0 cs0Var = tr2Var.a;
                                            if (i < 0) {
                                                if (((Number) cs0Var.a()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) cs0Var.a()).floatValue() < ((Number) tr2Var.b.a()).floatValue()) {
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
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
    */
    public final jk2 p(vu2 vu2Var, Rect rect, z13 z13Var) {
        n7 n7Var = new n7(z13Var);
        tb1 tb1Var = vu2Var.c;
        aq1 aq1Var = tb1Var.L.f;
        ia0 ia0Var = null;
        if ((aq1Var.i & 8) != 0) {
            loop0: while (true) {
                if (aq1Var == null) {
                    break;
                }
                if ((aq1Var.h & 8) != 0) {
                    aq1 aq1VarJ = aq1Var;
                    qs1 qs1Var = null;
                    while (aq1VarJ != null) {
                        if (aq1VarJ instanceof tu2) {
                            ((tu2) aq1VarJ).K0(n7Var);
                            if (n7Var.f) {
                                ia0Var = aq1VarJ;
                                break loop0;
                            }
                        } else if ((aq1VarJ.h & 8) != 0 && (aq1VarJ instanceof ja0)) {
                            int i = 0;
                            for (aq1 aq1Var2 = ((ja0) aq1VarJ).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                                if ((aq1Var2.h & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        aq1VarJ = aq1Var2;
                                    } else {
                                        if (qs1Var == null) {
                                            qs1Var = new qs1(new aq1[16]);
                                        }
                                        if (aq1VarJ != null) {
                                            qs1Var.b(aq1VarJ);
                                            aq1VarJ = null;
                                        }
                                        qs1Var.b(aq1Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        aq1VarJ = vr.j(qs1Var);
                    }
                    if ((aq1Var.i & 8) != 0) {
                        break;
                    }
                    aq1Var = aq1Var.k;
                } else if ((aq1Var.i & 8) != 0) {
                }
            }
        }
        ia0 ia0Var2 = (tu2) ia0Var;
        if (ia0Var2 == null || !((aq1) ia0Var2).f.s) {
            return vr.q(tb1Var.L.d, false);
        }
        ex1 ex1VarW = vr.W(ia0Var2);
        jk2 jk2VarC0 = vr.y(ex1VarW).c0(ex1VarW, false);
        Rect rectH = H(jk2VarC0.a, jk2VarC0.b, jk2VarC0.c, jk2VarC0.d);
        float f = rectH.left - rect.left;
        float f2 = rectH.top - rect.top;
        return new jk2(f, f2, rectH.width() + f, rectH.height() + f2);
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
    */
    public final void w(vu2 vu2Var, wu2 wu2Var) {
        int[] iArr = o41.a;
        pr1 pr1Var = new pr1();
        List listI = vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0);
        tb1 tb1Var = vu2Var.c;
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            vu2 vu2Var2 = (vu2) listI.get(i);
            g41 g41VarN = n();
            int i2 = vu2Var2.f;
            if (g41VarN.a(i2)) {
                if (!wu2Var.b.c(i2)) {
                    r(tb1Var);
                    return;
                }
                pr1Var.a(i2);
            }
        }
        pr1 pr1Var2 = wu2Var.b;
        int[] iArr2 = pr1Var2.b;
        long[] jArr = pr1Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !pr1Var.c(iArr2[(i3 << 3) + i5])) {
                            r(tb1Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listI2 = vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            vu2 vu2Var3 = (vu2) listI2.get(i6);
            wu2 wu2Var2 = (wu2) this.L.b(vu2Var3.f);
            if (wu2Var2 != null && n().a(vu2Var3.f)) {
                w(vu2Var3, wu2Var2);
            }
        }
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
