package defpackage;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class k7 extends yl1 {
    public final /* synthetic */ o7 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(o7 o7Var) {
        super(1);
        this.i = o7Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x01b0, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013c  */
    @Override // defpackage.yl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(int i, int i2, Bundle bundle) {
        vu2 vu2Var;
        int i3;
        d1 d1Var;
        int iM;
        int i4;
        pg3 pg3VarD;
        cs0 cs0Var;
        cs0 cs0Var2;
        cs0 cs0Var3;
        cs0 cs0Var4;
        cs0 cs0Var5;
        cs0 cs0Var6;
        cs0 cs0Var7;
        cs0 cs0Var8;
        cs0 cs0Var9;
        ns0 ns0Var;
        y0 y0Var;
        long jK0;
        float f;
        float f2;
        float f3;
        float f4;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        ns0 ns0Var2;
        cs0 cs0Var10;
        float f5;
        float f6;
        Float f7;
        boolean z;
        y0 y0Var2;
        cs0 cs0Var11;
        float fIntBitsToFloat;
        y0 y0Var3;
        cs0 cs0Var12;
        ns0 ns0Var3;
        cs0 cs0Var13;
        cs0 cs0Var14;
        cs0 cs0Var15;
        cs0 cs0Var16;
        o7 o7Var = this.i;
        AccessibilityManager accessibilityManager = o7Var.l;
        Float fValueOf = Float.valueOf(0.0f);
        h7 h7Var = o7Var.i;
        xu2 xu2Var = (xu2) o7Var.n().b(i);
        if (xu2Var != null && (vu2Var = xu2Var.a) != null) {
            tb1 tb1Var = vu2Var.c;
            int i5 = vu2Var.f;
            qu2 qu2Var = vu2Var.d;
            is1 is1Var = qu2Var.f;
            Object objG = is1Var.g(zu2.o);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = Boolean.TRUE;
            if (s51.n(objG, bool)) {
                if (Build.VERSION.SDK_INT >= 34 ? c1.h(accessibilityManager) : true) {
                }
            } else {
                if (i2 == 64) {
                    if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = o7Var.p) == i) {
                        return false;
                    }
                    if (i3 != Integer.MIN_VALUE) {
                        o7.z(o7Var, i3, 65536, null, 12);
                    }
                    o7Var.p = i;
                    h7Var.invalidate();
                    o7.z(o7Var, i, 32768, null, 12);
                    return true;
                }
                if (i2 == 128) {
                    if (o7Var.p != i) {
                        return false;
                    }
                    o7Var.p = Integer.MIN_VALUE;
                    o7Var.r = null;
                    h7Var.invalidate();
                    o7.z(o7Var, i, 65536, null, 12);
                    return true;
                }
                if (i2 == 256 || i2 == 512) {
                    if (bundle != null) {
                        int i6 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                        boolean z3 = i2 == 256;
                        Integer num = o7Var.z;
                        if (num == null || i5 != num.intValue()) {
                            o7Var.y = -1;
                            o7Var.z = Integer.valueOf(i5);
                        }
                        String strO = o7.o(vu2Var);
                        if (strO != null && strO.length() != 0) {
                            String strO2 = o7.o(vu2Var);
                            if (strO2 == null || strO2.length() == 0) {
                                d1Var = null;
                                if (d1Var != null) {
                                    int iL = o7Var.l(vu2Var);
                                    if (iL == -1) {
                                        iL = z3 ? 0 : strO.length();
                                    }
                                    int[] iArrE = z3 ? d1Var.e(iL) : d1Var.p(iL);
                                    if (iArrE != null) {
                                        int i7 = iArrE[0];
                                        int i8 = iArrE[1];
                                        if (z2 && !is1Var.c(zu2.a) && is1Var.c(zu2.G)) {
                                            iM = o7Var.m(vu2Var);
                                            if (iM == -1) {
                                                iM = z3 ? i7 : i8;
                                            }
                                            i4 = z3 ? i8 : i7;
                                        } else {
                                            iM = z3 ? i8 : i7;
                                            i4 = iM;
                                        }
                                        o7Var.D = new l7(vu2Var, z3 ? 256 : 512, i6, i7, i8, SystemClock.uptimeMillis());
                                        o7Var.F(vu2Var, iM, i4, true);
                                        return true;
                                    }
                                }
                            } else {
                                if (i6 == 1) {
                                    Locale locale = h7Var.getContext().getResources().getConfiguration().locale;
                                    if (e1.e == null) {
                                        e1 e1Var = new e1(0);
                                        e1Var.d = BreakIterator.getCharacterInstance(locale);
                                        e1.e = e1Var;
                                    }
                                    e1 e1Var2 = e1.e;
                                    e1Var2.getClass();
                                    e1Var2.s(strO2);
                                    d1Var = e1Var2;
                                } else if (i6 == 2) {
                                    Locale locale2 = h7Var.getContext().getResources().getConfiguration().locale;
                                    if (e1.f == null) {
                                        e1 e1Var3 = new e1(1);
                                        e1Var3.d = BreakIterator.getWordInstance(locale2);
                                        e1.f = e1Var3;
                                    }
                                    e1 e1Var4 = e1.f;
                                    e1Var4.getClass();
                                    e1Var4.s(strO2);
                                    d1Var = e1Var4;
                                } else if (i6 == 4) {
                                    if (is1Var.c(pu2.a) && (pg3VarD = t22.D(qu2Var)) != null) {
                                        if (i6 == 4) {
                                            if (e1.g == null) {
                                                e1.g = new e1(2);
                                            }
                                            e1 e1Var5 = e1.g;
                                            e1Var5.getClass();
                                            e1Var5.a = strO2;
                                            e1Var5.d = pg3VarD;
                                            d1Var = e1Var5;
                                        } else {
                                            if (f1.e == null) {
                                                f1 f1Var = new f1();
                                                new Rect();
                                                f1.e = f1Var;
                                            }
                                            f1 f1Var2 = f1.e;
                                            f1Var2.getClass();
                                            f1Var2.a = strO2;
                                            f1Var2.c = pg3VarD;
                                            f1Var2.d = vu2Var;
                                            d1Var = f1Var2;
                                        }
                                    }
                                } else if (i6 == 8) {
                                    if (g1.c == null) {
                                        g1.c = new g1();
                                    }
                                    g1 g1Var = g1.c;
                                    g1Var.getClass();
                                    g1Var.a = strO2;
                                    d1Var = g1Var;
                                } else if (i6 != 16) {
                                }
                                if (d1Var != null) {
                                }
                            }
                        }
                    }
                } else if (i2 == 16384) {
                    Object objG2 = is1Var.g(pu2.q);
                    y0 y0Var4 = (y0) (objG2 == null ? null : objG2);
                    if (y0Var4 != null && (cs0Var = (cs0) y0Var4.b) != null) {
                        return ((Boolean) cs0Var.a()).booleanValue();
                    }
                } else {
                    if (i2 == 131072) {
                        boolean zF = o7Var.F(vu2Var, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                        if (zF) {
                            o7.z(o7Var, o7Var.v(i5), 0, null, 12);
                        }
                        return zF;
                    }
                    if (gv3.t(vu2Var)) {
                        if (i2 == 1) {
                            if (h7Var.isInTouchMode()) {
                                h7Var.requestFocusFromTouch();
                            }
                            Object objG3 = is1Var.g(pu2.w);
                            y0 y0Var5 = (y0) (objG3 == null ? null : objG3);
                            if (y0Var5 != null && (cs0Var2 = (cs0) y0Var5.b) != null) {
                                return ((Boolean) cs0Var2.a()).booleanValue();
                            }
                        } else if (i2 != 2) {
                            bb1 bb1Var = bb1.g;
                            switch (i2) {
                                case 16:
                                    Object objG4 = is1Var.g(pu2.b);
                                    if (objG4 == null) {
                                        objG4 = null;
                                    }
                                    y0 y0Var6 = (y0) objG4;
                                    Boolean bool2 = (y0Var6 == null || (cs0Var3 = (cs0) y0Var6.b) == null) ? null : (Boolean) cs0Var3.a();
                                    o7.z(o7Var, i, 1, null, 12);
                                    if (bool2 != null) {
                                        return bool2.booleanValue();
                                    }
                                    break;
                                case 32:
                                    Object objG5 = is1Var.g(pu2.c);
                                    y0 y0Var7 = (y0) (objG5 == null ? null : objG5);
                                    if (y0Var7 != null && (cs0Var4 = (cs0) y0Var7.b) != null) {
                                        return ((Boolean) cs0Var4.a()).booleanValue();
                                    }
                                    break;
                                case 4096:
                                case 8192:
                                    boolean z4 = i2 == 4096;
                                    boolean z5 = i2 == 8192;
                                    boolean z6 = i2 == 16908345;
                                    boolean z7 = i2 == 16908347;
                                    boolean z8 = i2 == 16908344;
                                    boolean z9 = i2 == 16908346;
                                    boolean z10 = z6 || z7 || z4 || z5;
                                    boolean z11 = z8 || z9 || z4 || z5;
                                    if (z4 || z5) {
                                        Object objG6 = is1Var.g(zu2.c);
                                        if (objG6 == null) {
                                            objG6 = null;
                                        }
                                        qd2 qd2Var = (qd2) objG6;
                                        Object objG7 = is1Var.g(pu2.i);
                                        if (objG7 == null) {
                                            objG7 = null;
                                        }
                                        y0 y0Var8 = (y0) objG7;
                                        if (qd2Var != null) {
                                            ex exVar = qd2Var.b;
                                            if (y0Var8 != null) {
                                                float f8 = exVar.g;
                                                float f9 = exVar.f;
                                                float f10 = f8 < f9 ? f9 : f8;
                                                if (f9 <= f8) {
                                                    f8 = f9;
                                                }
                                                int i9 = qd2Var.c;
                                                if (i9 > 0) {
                                                    f5 = f10 - f8;
                                                    f6 = i9 + 1;
                                                } else {
                                                    f5 = f10 - f8;
                                                    f6 = 20.0f;
                                                }
                                                float f11 = f5 / f6;
                                                if (z5) {
                                                    f11 = -f11;
                                                }
                                                ns0 ns0Var4 = (ns0) y0Var8.b;
                                                if (ns0Var4 != null) {
                                                    return ((Boolean) ns0Var4.h(Float.valueOf(qd2Var.a + f11))).booleanValue();
                                                }
                                            } else {
                                                long jC = vr.p(tb1Var.L.c).c();
                                                ArrayList arrayList = new ArrayList();
                                                Object objG8 = is1Var.g(pu2.C);
                                                if (objG8 == null) {
                                                    objG8 = null;
                                                }
                                                y0 y0Var9 = (y0) objG8;
                                                Float f12 = (y0Var9 == null || (ns0Var3 = (ns0) y0Var9.b) == null || !((Boolean) ns0Var3.h(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                                Object objG9 = is1Var.g(pu2.d);
                                                if (objG9 == null) {
                                                    objG9 = null;
                                                }
                                                y0 y0Var10 = (y0) objG9;
                                                if (y0Var10 != null) {
                                                    zs0 zs0Var = y0Var10.b;
                                                    Object objG10 = is1Var.g(zu2.v);
                                                    if (objG10 == null) {
                                                        objG10 = null;
                                                    }
                                                    tr2 tr2Var = (tr2) objG10;
                                                    if (tr2Var == null || !z10) {
                                                        f7 = f12;
                                                        z = z11;
                                                    } else {
                                                        if (f12 != null) {
                                                            fIntBitsToFloat = f12.floatValue();
                                                            f7 = f12;
                                                            z = z11;
                                                        } else {
                                                            f7 = f12;
                                                            z = z11;
                                                            fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32));
                                                        }
                                                        if (z6 || z5) {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        }
                                                        if (tb1Var.F == bb1Var && (z6 || z7)) {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        }
                                                        if (o7.s(tr2Var, fIntBitsToFloat)) {
                                                            cv2 cv2Var = pu2.z;
                                                            if (is1Var.c(cv2Var) || is1Var.c(pu2.B)) {
                                                                if (fIntBitsToFloat > 0.0f) {
                                                                    Object objG11 = is1Var.g(pu2.B);
                                                                    y0Var3 = (y0) (objG11 == null ? null : objG11);
                                                                } else {
                                                                    Object objG12 = is1Var.g(cv2Var);
                                                                    y0Var3 = (y0) (objG12 == null ? null : objG12);
                                                                }
                                                                if (y0Var3 != null && (cs0Var12 = (cs0) y0Var3.b) != null) {
                                                                    return ((Boolean) cs0Var12.a()).booleanValue();
                                                                }
                                                            } else {
                                                                rs0 rs0Var = (rs0) zs0Var;
                                                                if (rs0Var != null) {
                                                                    return ((Boolean) rs0Var.f(Float.valueOf(fIntBitsToFloat), fValueOf)).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    }
                                                    Object objG13 = is1Var.g(zu2.w);
                                                    if (objG13 == null) {
                                                        objG13 = null;
                                                    }
                                                    tr2 tr2Var2 = (tr2) objG13;
                                                    if (tr2Var2 != null && z) {
                                                        float fFloatValue = f7 != null ? f7.floatValue() : Float.intBitsToFloat((int) (jC & 4294967295L));
                                                        if (z8 || z5) {
                                                            fFloatValue = -fFloatValue;
                                                        }
                                                        if (o7.s(tr2Var2, fFloatValue)) {
                                                            cv2 cv2Var2 = pu2.y;
                                                            if (is1Var.c(cv2Var2) || is1Var.c(pu2.A)) {
                                                                if (fFloatValue > 0.0f) {
                                                                    Object objG14 = is1Var.g(pu2.A);
                                                                    y0Var2 = (y0) (objG14 == null ? null : objG14);
                                                                } else {
                                                                    Object objG15 = is1Var.g(cv2Var2);
                                                                    y0Var2 = (y0) (objG15 == null ? null : objG15);
                                                                }
                                                                if (y0Var2 != null && (cs0Var11 = (cs0) y0Var2.b) != null) {
                                                                    return ((Boolean) cs0Var11.a()).booleanValue();
                                                                }
                                                            } else {
                                                                rs0 rs0Var2 = (rs0) zs0Var;
                                                                if (rs0Var2 != null) {
                                                                    return ((Boolean) rs0Var2.f(fValueOf, Float.valueOf(fFloatValue))).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 32768:
                                    Object objG16 = is1Var.g(pu2.s);
                                    y0 y0Var11 = (y0) (objG16 == null ? null : objG16);
                                    if (y0Var11 != null && (cs0Var5 = (cs0) y0Var11.b) != null) {
                                        return ((Boolean) cs0Var5.a()).booleanValue();
                                    }
                                    break;
                                case 65536:
                                    Object objG17 = is1Var.g(pu2.r);
                                    y0 y0Var12 = (y0) (objG17 == null ? null : objG17);
                                    if (y0Var12 != null && (cs0Var6 = (cs0) y0Var12.b) != null) {
                                        return ((Boolean) cs0Var6.a()).booleanValue();
                                    }
                                    break;
                                case 262144:
                                    Object objG18 = is1Var.g(pu2.t);
                                    y0 y0Var13 = (y0) (objG18 == null ? null : objG18);
                                    if (y0Var13 != null && (cs0Var7 = (cs0) y0Var13.b) != null) {
                                        return ((Boolean) cs0Var7.a()).booleanValue();
                                    }
                                    break;
                                case 524288:
                                    Object objG19 = is1Var.g(pu2.u);
                                    y0 y0Var14 = (y0) (objG19 == null ? null : objG19);
                                    if (y0Var14 != null && (cs0Var8 = (cs0) y0Var14.b) != null) {
                                        return ((Boolean) cs0Var8.a()).booleanValue();
                                    }
                                    break;
                                case 1048576:
                                    Object objG20 = is1Var.g(pu2.v);
                                    y0 y0Var15 = (y0) (objG20 == null ? null : objG20);
                                    if (y0Var15 != null && (cs0Var9 = (cs0) y0Var15.b) != null) {
                                        return ((Boolean) cs0Var9.a()).booleanValue();
                                    }
                                    break;
                                case 2097152:
                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                    Object objG21 = is1Var.g(pu2.k);
                                    y0 y0Var16 = (y0) (objG21 == null ? null : objG21);
                                    if (y0Var16 != null && (ns0Var = (ns0) y0Var16.b) != null) {
                                        if (string == null) {
                                            string = "";
                                        }
                                        return ((Boolean) ns0Var.h(new af(string))).booleanValue();
                                    }
                                    break;
                                case R.id.accessibilityActionShowOnScreen:
                                    vu2 vu2VarL = vu2Var.l();
                                    if (vu2VarL != null) {
                                        Object objG22 = vu2VarL.d.f.g(pu2.d);
                                        if (objG22 == null) {
                                            objG22 = null;
                                        }
                                        y0Var = (y0) objG22;
                                        while (y0Var == null && vu2VarL != null) {
                                            vu2VarL = vu2VarL.l();
                                            if (vu2VarL != null) {
                                                Object objG23 = vu2VarL.d.f.g(pu2.d);
                                                if (objG23 == null) {
                                                    objG23 = null;
                                                }
                                                y0Var = (y0) objG23;
                                            }
                                        }
                                        if (vu2VarL == null) {
                                            jk2 jk2VarG = vu2Var.g();
                                            return h7Var.requestRectangleOnScreen(new Rect((int) Math.floor(jk2VarG.a), (int) Math.floor(jk2VarG.b), vm1.M((float) Math.ceil(jk2VarG.c)), vm1.M((float) Math.ceil(jk2VarG.d))));
                                        }
                                        long j = 0;
                                        long jD = 0;
                                        boolean z12 = false;
                                        while (vu2VarL != null) {
                                            tb1 tb1Var2 = vu2VarL.c;
                                            is1 is1Var2 = vu2VarL.d.f;
                                            Object objG24 = is1Var2.g(pu2.d);
                                            if (objG24 == null) {
                                                objG24 = null;
                                            }
                                            y0 y0Var17 = (y0) objG24;
                                            if (y0Var17 != null) {
                                                jk2 jk2VarP = vr.p(tb1Var2.L.c);
                                                ab1 ab1VarF = tb1Var2.L.c.F();
                                                jk2 jk2VarI = jk2VarP.i(ab1VarF != null ? ((ex1) ab1VarF).k0(j) : j);
                                                ex1 ex1VarD = vu2Var.d();
                                                if (ex1VarD == null) {
                                                    jK0 = j;
                                                    long jE = gy1.e(jK0, jD);
                                                    ex1 ex1VarD2 = vu2Var.d();
                                                    jk2 jk2VarB = b32.b(jE, lr.T(ex1VarD2 == null ? ex1VarD2.h : 0L));
                                                    f = jk2VarB.a - jk2VarI.a;
                                                    f2 = jk2VarB.c - jk2VarI.c;
                                                    if (Math.signum(f) == Math.signum(f2)) {
                                                        f = 0.0f;
                                                    } else if (Math.abs(f) >= Math.abs(f2)) {
                                                        f = f2;
                                                    }
                                                    f3 = jk2VarB.b - jk2VarI.b;
                                                    f4 = jk2VarB.d - jk2VarI.d;
                                                    if (Math.signum(f3) == Math.signum(f4)) {
                                                        f3 = 0.0f;
                                                    } else if (Math.abs(f3) >= Math.abs(f4)) {
                                                        f3 = f4;
                                                    }
                                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                                    if (gy1.b(jFloatToRawIntBits, 0L)) {
                                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                                                        Object objG25 = is1Var2.g(zu2.v);
                                                        if (objG25 == null) {
                                                            objG25 = null;
                                                        }
                                                        if (tb1Var.F == bb1Var) {
                                                            fIntBitsToFloat2 = -fIntBitsToFloat2;
                                                        }
                                                        Object objG26 = is1Var2.g(zu2.w);
                                                        if (objG26 == null) {
                                                            objG26 = null;
                                                        }
                                                        jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                                                    } else {
                                                        jFloatToRawIntBits2 = jFloatToRawIntBits;
                                                    }
                                                    rs0 rs0Var3 = (rs0) y0Var17.b;
                                                    z12 = (rs0Var3 == null && ((Boolean) rs0Var3.f(Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))))).booleanValue()) || z12;
                                                    jD = gy1.d(jD, jFloatToRawIntBits);
                                                } else {
                                                    if (!ex1VarD.w1().s) {
                                                        ex1VarD = null;
                                                    }
                                                    if (ex1VarD != null) {
                                                        jK0 = ex1VarD.k0(j);
                                                    }
                                                    long jE2 = gy1.e(jK0, jD);
                                                    ex1 ex1VarD22 = vu2Var.d();
                                                    jk2 jk2VarB2 = b32.b(jE2, lr.T(ex1VarD22 == null ? ex1VarD22.h : 0L));
                                                    f = jk2VarB2.a - jk2VarI.a;
                                                    f2 = jk2VarB2.c - jk2VarI.c;
                                                    if (Math.signum(f) == Math.signum(f2)) {
                                                    }
                                                    f3 = jk2VarB2.b - jk2VarI.b;
                                                    f4 = jk2VarB2.d - jk2VarI.d;
                                                    if (Math.signum(f3) == Math.signum(f4)) {
                                                    }
                                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                                    if (gy1.b(jFloatToRawIntBits, 0L)) {
                                                    }
                                                    rs0 rs0Var32 = (rs0) y0Var17.b;
                                                    if (rs0Var32 == null) {
                                                        jD = gy1.d(jD, jFloatToRawIntBits);
                                                    } else {
                                                        jD = gy1.d(jD, jFloatToRawIntBits);
                                                    }
                                                }
                                            }
                                            vu2VarL = vu2VarL.l();
                                            j = 0;
                                        }
                                        return z12;
                                    }
                                    y0Var = null;
                                    break;
                                case R.id.accessibilityActionSetProgress:
                                    if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                        Object objG27 = is1Var.g(pu2.i);
                                        y0 y0Var18 = (y0) (objG27 == null ? null : objG27);
                                        if (y0Var18 != null && (ns0Var2 = (ns0) y0Var18.b) != null) {
                                            return ((Boolean) ns0Var2.h(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                        }
                                    }
                                    break;
                                case R.id.accessibilityActionImeEnter:
                                    Object objG28 = is1Var.g(pu2.p);
                                    y0 y0Var19 = (y0) (objG28 == null ? null : objG28);
                                    if (y0Var19 != null && (cs0Var10 = (cs0) y0Var19.b) != null) {
                                        return ((Boolean) cs0Var10.a()).booleanValue();
                                    }
                                    break;
                                default:
                                    switch (i2) {
                                        case R.id.accessibilityActionScrollUp:
                                        case R.id.accessibilityActionScrollLeft:
                                        case R.id.accessibilityActionScrollDown:
                                        case R.id.accessibilityActionScrollRight:
                                            break;
                                        default:
                                            switch (i2) {
                                                case R.id.accessibilityActionPageUp:
                                                    Object objG29 = is1Var.g(pu2.y);
                                                    y0 y0Var20 = (y0) (objG29 == null ? null : objG29);
                                                    if (y0Var20 != null && (cs0Var13 = (cs0) y0Var20.b) != null) {
                                                        return ((Boolean) cs0Var13.a()).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionPageDown:
                                                    Object objG30 = is1Var.g(pu2.A);
                                                    y0 y0Var21 = (y0) (objG30 == null ? null : objG30);
                                                    if (y0Var21 != null && (cs0Var14 = (cs0) y0Var21.b) != null) {
                                                        return ((Boolean) cs0Var14.a()).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionPageLeft:
                                                    Object objG31 = is1Var.g(pu2.z);
                                                    y0 y0Var22 = (y0) (objG31 == null ? null : objG31);
                                                    if (y0Var22 != null && (cs0Var15 = (cs0) y0Var22.b) != null) {
                                                        return ((Boolean) cs0Var15.a()).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionPageRight:
                                                    Object objG32 = is1Var.g(pu2.B);
                                                    y0 y0Var23 = (y0) (objG32 == null ? null : objG32);
                                                    if (y0Var23 != null && (cs0Var16 = (cs0) y0Var23.b) != null) {
                                                        return ((Boolean) cs0Var16.a()).booleanValue();
                                                    }
                                                    break;
                                                default:
                                                    l83 l83Var = (l83) o7Var.w.b(i);
                                                    if (l83Var != null && ((CharSequence) l83Var.b(i2)) != null) {
                                                        Object objG33 = is1Var.g(pu2.x);
                                                        List list = (List) (objG33 == null ? null : objG33);
                                                        if (list != null && list.size() > 0) {
                                                            list.get(0).getClass();
                                                            qn1.b();
                                                            return false;
                                                        }
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            Object objG34 = is1Var.g(zu2.l);
                            if (objG34 == null) {
                                objG34 = null;
                            }
                            if (s51.n(objG34, bool)) {
                                ((ep0) h7Var.getFocusOwner()).b(8, false, true);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.yl1
    public final void s(int i, s1 s1Var, String str, Bundle bundle) {
        this.i.e(i, s1Var, str, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x09d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0a5e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0c56  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0c62  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0c82  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x083e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* JADX WARN: Type inference failed for: r2v77, types: [ni0] */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.util.ArrayList] */
    @Override // defpackage.yl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s1 u(int i) {
        AccessibilityManager accessibilityManager;
        l83 l83Var;
        o7 o7Var;
        h7 h7Var;
        mr1 mr1Var;
        qu2 qu2Var;
        no2 no2Var;
        tb1 tb1Var;
        is1 is1Var;
        AccessibilityNodeInfo accessibilityNodeInfo;
        s1 s1Var;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        no2 no2Var2;
        int i2;
        s1 s1Var2;
        Object objG;
        int i3;
        Object objG2;
        Object objG3;
        o7 o7Var2;
        boolean z;
        vu2 vu2VarL;
        Object objG4;
        dj1 dj1Var;
        Object objG5;
        y0 y0Var;
        Object objG6;
        y0 y0Var2;
        y0 y0Var3;
        String strO;
        ArrayList arrayList;
        CharSequence charSequenceE;
        qd2 qd2Var;
        Object objG7;
        px pxVar;
        tr2 tr2Var;
        tr2 tr2Var2;
        int i4;
        int iD;
        h7 h7Var2;
        Bundle bundle;
        int iD2;
        String str;
        s1 s1Var3;
        tc tcVarK;
        Object objG8;
        Object objG9;
        tb1 tb1Var2;
        List list;
        tb1 tb1VarU;
        boolean zN;
        boolean zBooleanValue;
        ?? arrayList2;
        int i5;
        boolean zN2;
        vu2 vu2Var;
        int i6;
        o7 o7Var3 = this.i;
        AccessibilityManager accessibilityManager2 = o7Var3.l;
        h7 h7Var3 = o7Var3.i;
        if (((rf1) h7Var3.getComposeViewContext().d().getLifecycle()).i == ff1.f) {
            s1Var3 = !accessibilityManager2.isEnabled() ? new s1(AccessibilityNodeInfo.obtain()) : null;
            o7Var2 = o7Var3;
            i3 = i;
        } else {
            xu2 xu2Var = (xu2) o7Var3.n().b(i);
            if (xu2Var == null) {
                if (!accessibilityManager2.isEnabled()) {
                    s1Var3 = new s1(AccessibilityNodeInfo.obtain());
                }
                o7Var2 = o7Var3;
                i3 = i;
            } else {
                vu2 vu2Var2 = xu2Var.a;
                qu2 qu2VarK = vu2Var2.k();
                tb1 tb1Var3 = vu2Var2.c;
                Object objG10 = qu2VarK.f.g(zu2.o);
                if (objG10 == null) {
                    objG10 = null;
                }
                boolean zN3 = s51.n(objG10, Boolean.TRUE);
                if (!zN3) {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    s1 s1Var4 = new s1(accessibilityNodeInfoObtain);
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 34) {
                        c1.j(accessibilityNodeInfoObtain, zN3);
                    } else {
                        s1Var4.f(64, zN3);
                    }
                    if (i == -1) {
                        Object parentForAccessibility = h7Var3.getParentForAccessibility();
                        View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                        s1Var4.b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        vu2 vu2VarL2 = vu2Var2.l();
                        Integer numValueOf = vu2VarL2 != null ? Integer.valueOf(vu2VarL2.f) : null;
                        if (numValueOf == null) {
                            m21.d("semanticsNode " + i + " has null parent");
                            c.d();
                            return null;
                        }
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue == h7Var3.getSemanticsOwner().a().f) {
                            iIntValue = -1;
                        }
                        s1Var4.b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(h7Var3, iIntValue);
                    }
                    s1Var4.c = i;
                    accessibilityNodeInfoObtain.setSource(h7Var3, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(o7Var3.f(xu2Var));
                    mr1 mr1Var2 = o7Var3.O;
                    l83 l83Var2 = o7Var3.x;
                    Resources resources = h7Var3.getContext().getResources();
                    s1Var4.g("android.view.View");
                    qu2 qu2Var2 = vu2Var2.d;
                    is1 is1Var2 = qu2Var2.f;
                    if (is1Var2.c(zu2.G)) {
                        s1Var4.g("android.widget.EditText");
                    }
                    if (is1Var2.c(zu2.C)) {
                        s1Var4.g("android.widget.TextView");
                    }
                    Object objG11 = is1Var2.g(zu2.z);
                    if (objG11 == null) {
                        objG11 = null;
                    }
                    no2 no2Var3 = (no2) objG11;
                    if (no2Var3 != null) {
                        int i8 = no2Var3.a;
                        if (vu2Var2.o()) {
                            accessibilityManager = accessibilityManager2;
                            i6 = 4;
                            l83Var = l83Var2;
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i6 = 4;
                            l83Var = l83Var2;
                            if (vu2Var2.i((4 & 1) != 0 ? !vu2Var2.b : false, (4 & 2) == 0).isEmpty()) {
                            }
                        }
                        if (i8 == i6) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(top.th1nk.samp.R.string.tab));
                        } else if (i8 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(top.th1nk.samp.R.string.switch_role));
                        } else {
                            String strN = t22.N(i8);
                            if (i8 != 5 || gv3.H(vu2Var2) || qu2Var2.h) {
                                s1Var4.g(strN);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        l83Var = l83Var2;
                    }
                    accessibilityNodeInfoObtain.setPackageName(h7Var3.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(w7.U(vu2Var2));
                    boolean zH = i7 >= 34 ? c1.h(accessibilityManager) : true;
                    List listI = vu2Var2.i((4 & 1) != 0 ? !vu2Var2.b : false, (4 & 2) == 0);
                    int size = listI.size();
                    boolean z2 = zH;
                    int i9 = 0;
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = size;
                        vu2 vu2Var3 = (vu2) listI.get(i10);
                        List list2 = listI;
                        g41 g41VarN = o7Var3.n();
                        int i12 = i10;
                        int i13 = vu2Var3.f;
                        if (g41VarN.a(i13)) {
                            tc tcVar = h7Var3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(vu2Var3.c);
                            if (i13 != -1) {
                                if (tcVar != null) {
                                    accessibilityNodeInfoObtain.addChild(tcVar);
                                } else {
                                    xu2 xu2Var2 = (xu2) o7Var3.n().b(i13);
                                    if (xu2Var2 == null || (vu2Var = xu2Var2.a) == null) {
                                        zN2 = false;
                                    } else {
                                        Object objG12 = vu2Var.k().f.g(zu2.o);
                                        if (objG12 == null) {
                                            objG12 = null;
                                        }
                                        zN2 = s51.n(objG12, Boolean.TRUE);
                                    }
                                    if (z2 || !zN2) {
                                        accessibilityNodeInfoObtain.addChild(h7Var3, i13);
                                    }
                                }
                                mr1Var2.f(i13, i9);
                                i9++;
                            }
                        }
                        i10 = i12 + 1;
                        listI = list2;
                        size = i11;
                    }
                    int i14 = o7Var3.p;
                    AccessibilityNodeInfo accessibilityNodeInfo4 = s1Var4.a;
                    if (i == i14) {
                        accessibilityNodeInfo4.setAccessibilityFocused(true);
                        s1Var4.a(n1.d);
                    } else {
                        accessibilityNodeInfo4.setAccessibilityFocused(false);
                        s1Var4.a(n1.c);
                    }
                    af afVarE = gv3.E(vu2Var2);
                    if (afVarE != null) {
                        h7Var3.getFontFamilyResolver();
                        ua0 density = h7Var3.getDensity();
                        pi piVar = o7Var3.K;
                        h7Var = h7Var3;
                        String str2 = afVarE.g;
                        tb1Var = tb1Var3;
                        List list3 = afVarE.f;
                        SpannableString spannableString2 = new SpannableString(str2);
                        ArrayList arrayList3 = afVarE.h;
                        o7Var = o7Var3;
                        if (arrayList3 != null) {
                            int size2 = arrayList3.size();
                            mr1Var = mr1Var2;
                            int i15 = 0;
                            while (i15 < size2) {
                                int i16 = size2;
                                ze zeVar = (ze) arrayList3.get(i15);
                                ArrayList arrayList4 = arrayList3;
                                h83 h83Var = (h83) zeVar.a;
                                int i17 = i15;
                                int i18 = zeVar.b;
                                int i19 = zeVar.c;
                                qu2 qu2Var3 = qu2Var2;
                                no2 no2Var4 = no2Var3;
                                long jA = h83Var.a.a();
                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfoObtain;
                                s1 s1Var5 = s1Var4;
                                long j = h83Var.b;
                                xq0 xq0Var = h83Var.c;
                                vq0 vq0Var = h83Var.d;
                                eg3 eg3Var = h83Var.j;
                                qj1 qj1Var = h83Var.k;
                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo4;
                                is1 is1Var3 = is1Var2;
                                long j2 = h83Var.l;
                                ne3 ne3Var = h83Var.m;
                                dg3 dg3Var = h83Var.a;
                                af afVar = afVarE;
                                y02.G(spannableString2, (wx.c(jA, dg3Var.a()) ? dg3Var : jA != 16 ? new my(jA) : cg3.a).a(), i18, i19);
                                SpannableString spannableString3 = spannableString2;
                                y02.I(spannableString3, j, density, i18, i19);
                                if (xq0Var == null && vq0Var == null) {
                                    i5 = 33;
                                } else {
                                    StyleSpan styleSpan = new StyleSpan(r51.r(xq0Var == null ? xq0.h : xq0Var, vq0Var != null ? vq0Var.a : 0));
                                    i5 = 33;
                                    spannableString3.setSpan(styleSpan, i18, i19, 33);
                                }
                                if (ne3Var != null) {
                                    int i20 = ne3Var.a;
                                    if ((i20 | 1) == i20) {
                                        spannableString3.setSpan(new UnderlineSpan(), i18, i19, i5);
                                    }
                                    if ((i20 | 2) == i20) {
                                        spannableString3.setSpan(new StrikethroughSpan(), i18, i19, i5);
                                    }
                                }
                                if (eg3Var != null) {
                                    spannableString3.setSpan(new ScaleXSpan(eg3Var.a), i18, i19, i5);
                                }
                                y02.L(spannableString3, qj1Var, i18, i19);
                                if (j2 != 16) {
                                    spannableString3.setSpan(new BackgroundColorSpan(vp.T(j2)), i18, i19, i5);
                                }
                                i15 = i17 + 1;
                                spannableString2 = spannableString3;
                                afVarE = afVar;
                                size2 = i16;
                                arrayList3 = arrayList4;
                                qu2Var2 = qu2Var3;
                                no2Var3 = no2Var4;
                                s1Var4 = s1Var5;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo5;
                                is1Var2 = is1Var3;
                                accessibilityNodeInfo4 = accessibilityNodeInfo6;
                            }
                        } else {
                            mr1Var = mr1Var2;
                        }
                        qu2Var = qu2Var2;
                        no2Var = no2Var3;
                        AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo4;
                        is1Var = is1Var2;
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        s1Var = s1Var4;
                        SpannableString spannableString4 = spannableString2;
                        af afVar2 = afVarE;
                        int length = str2.length();
                        ?? arrayList5 = ni0.f;
                        if (list3 != null) {
                            arrayList2 = new ArrayList(list3.size());
                            int size3 = list3.size();
                            for (int i21 = 0; i21 < size3; i21++) {
                                Object obj = list3.get(i21);
                                ze zeVar2 = (ze) obj;
                                if ((zeVar2.a instanceof rp3) && bf.b(0, length, zeVar2.b, zeVar2.c)) {
                                    arrayList2.add(obj);
                                }
                            }
                        } else {
                            arrayList2 = arrayList5;
                        }
                        int size4 = arrayList2.size();
                        for (int i22 = 0; i22 < size4; i22++) {
                            ze zeVar3 = (ze) arrayList2.get(i22);
                            rp3 rp3Var = (rp3) zeVar3.a;
                            int i23 = zeVar3.b;
                            int i24 = zeVar3.c;
                            if (!(rp3Var instanceof rp3)) {
                                c.k();
                                return null;
                            }
                            spannableString4.setSpan(new TtsSpan.VerbatimBuilder(rp3Var.a).build(), i23, i24, 33);
                        }
                        int length2 = str2.length();
                        if (list3 != null) {
                            arrayList5 = new ArrayList(list3.size());
                            int size5 = list3.size();
                            for (int i25 = 0; i25 < size5; i25++) {
                                Object obj2 = list3.get(i25);
                                ze zeVar4 = (ze) obj2;
                                if ((zeVar4.a instanceof io3) && bf.b(0, length2, zeVar4.b, zeVar4.c)) {
                                    arrayList5.add(obj2);
                                }
                            }
                        }
                        int size6 = arrayList5.size();
                        for (int i26 = 0; i26 < size6; i26++) {
                            ze zeVar5 = (ze) arrayList5.get(i26);
                            io3 io3Var = (io3) zeVar5.a;
                            int i27 = zeVar5.b;
                            int i28 = zeVar5.c;
                            WeakHashMap weakHashMap = (WeakHashMap) piVar.g;
                            Object uRLSpan = weakHashMap.get(io3Var);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(io3Var.a);
                                weakHashMap.put(io3Var, uRLSpan);
                            }
                            spannableString4.setSpan((URLSpan) uRLSpan, i27, i28, 33);
                        }
                        List listA = afVar2.a(str2.length());
                        int size7 = listA.size();
                        for (int i29 = 0; i29 < size7; i29++) {
                            ze zeVar6 = (ze) listA.get(i29);
                            int i30 = zeVar6.b;
                            Object obj3 = zeVar6.a;
                            int i31 = zeVar6.c;
                            if (i30 != i31) {
                                og1 og1Var = (og1) obj3;
                                if (og1Var instanceof ng1) {
                                    obj3.getClass();
                                    ng1 ng1Var = (ng1) obj3;
                                    ze zeVar7 = new ze(i30, i31, ng1Var);
                                    WeakHashMap weakHashMap2 = (WeakHashMap) piVar.h;
                                    Object uRLSpan2 = weakHashMap2.get(zeVar7);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(ng1Var.a);
                                        weakHashMap2.put(zeVar7, uRLSpan2);
                                    }
                                    spannableString4.setSpan((URLSpan) uRLSpan2, i30, i31, 33);
                                } else {
                                    WeakHashMap weakHashMap3 = (WeakHashMap) piVar.i;
                                    Object d10Var = weakHashMap3.get(zeVar6);
                                    if (d10Var == null) {
                                        d10Var = new d10(og1Var);
                                        weakHashMap3.put(zeVar6, d10Var);
                                    }
                                    spannableString4.setSpan((ClickableSpan) d10Var, i30, i31, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) o7.K(spannableString4);
                        accessibilityNodeInfo2 = accessibilityNodeInfo7;
                    } else {
                        o7Var = o7Var3;
                        h7Var = h7Var3;
                        mr1Var = mr1Var2;
                        qu2Var = qu2Var2;
                        no2Var = no2Var3;
                        tb1Var = tb1Var3;
                        is1Var = is1Var2;
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        s1Var = s1Var4;
                        spannableString = null;
                        accessibilityNodeInfo2 = accessibilityNodeInfo4;
                    }
                    accessibilityNodeInfo2.setText(spannableString);
                    cv2 cv2Var = zu2.O;
                    is1 is1Var4 = is1Var;
                    if (is1Var4.c(cv2Var)) {
                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                        accessibilityNodeInfo3.setContentInvalid(true);
                        Object objG13 = is1Var4.g(cv2Var);
                        if (objG13 == null) {
                            objG13 = null;
                        }
                        accessibilityNodeInfo3.setError((CharSequence) objG13);
                    } else {
                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                    }
                    String strD = gv3.D(vu2Var2, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        o1.h(accessibilityNodeInfo2, strD);
                    } else {
                        accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strD);
                    }
                    accessibilityNodeInfo3.setCheckable(gv3.C(vu2Var2));
                    Object objG14 = is1Var4.g(zu2.L);
                    if (objG14 == null) {
                        objG14 = null;
                    }
                    mi3 mi3Var = (mi3) objG14;
                    if (mi3Var != null) {
                        if (mi3Var == mi3.f) {
                            accessibilityNodeInfo2.setChecked(true);
                        } else if (mi3Var == mi3.g) {
                            accessibilityNodeInfo2.setChecked(false);
                        }
                    }
                    Object objG15 = is1Var4.g(zu2.K);
                    if (objG15 == null) {
                        objG15 = null;
                    }
                    Boolean bool = (Boolean) objG15;
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (no2Var == null) {
                            no2Var2 = no2Var;
                            i2 = 4;
                        } else {
                            no2Var2 = no2Var;
                            i2 = 4;
                            if (no2Var2.a == 4) {
                                accessibilityNodeInfo3.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo2.setChecked(zBooleanValue2);
                    } else {
                        no2Var2 = no2Var;
                        i2 = 4;
                    }
                    qu2 qu2Var4 = qu2Var;
                    if (!qu2Var4.h || vu2Var2.i((4 & 1) != 0 ? !vu2Var2.b : false, (4 & 2) == 0).isEmpty()) {
                        Object objG16 = is1Var4.g(zu2.a);
                        if (objG16 == null) {
                            objG16 = null;
                        }
                        List list4 = (List) objG16;
                        accessibilityNodeInfo3.setContentDescription(list4 != null ? (String) qx.r0(list4) : null);
                    }
                    Object objG17 = is1Var4.g(zu2.A);
                    if (objG17 == null) {
                        objG17 = null;
                    }
                    String str3 = (String) objG17;
                    if (str3 != null) {
                        vu2 vu2VarL3 = vu2Var2;
                        while (true) {
                            if (vu2VarL3 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            qu2 qu2Var5 = vu2VarL3.d;
                            cv2 cv2Var2 = rn.Z0;
                            if (qu2Var5.f.c(cv2Var2)) {
                                zBooleanValue = ((Boolean) qu2Var5.c(cv2Var2)).booleanValue();
                                break;
                            }
                            vu2VarL3 = vu2VarL3.l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo3.setViewIdResourceName(str3);
                        }
                    }
                    Object objG18 = is1Var4.g(zu2.h);
                    if (objG18 == null) {
                        objG18 = null;
                    }
                    if (((dm3) objG18) == null) {
                        s1Var2 = s1Var;
                        objG = is1Var4.g(zu2.i);
                        if (objG == null) {
                            objG = null;
                        }
                        if (((dm3) objG) != null) {
                            if (Build.VERSION.SDK_INT >= 29) {
                                accessibilityNodeInfo3.setTextEntryKey(true);
                            } else {
                                s1Var2.f(8, true);
                            }
                        }
                        i3 = i;
                        if (i3 != -1) {
                            int iD3 = mr1Var.d(vu2Var2.f);
                            if (iD3 != -1) {
                                accessibilityNodeInfo3.setDrawingOrder(iD3);
                            } else {
                                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                            }
                        }
                        accessibilityNodeInfo3.setPassword(is1Var4.c(zu2.N));
                        objG2 = is1Var4.g(zu2.Q);
                        if (objG2 == null) {
                            objG2 = null;
                        }
                        Boolean bool2 = Boolean.TRUE;
                        accessibilityNodeInfo3.setEditable(s51.n(objG2, bool2));
                        objG3 = is1Var4.g(zu2.R);
                        if (objG3 == null) {
                            objG3 = null;
                        }
                        Integer num = (Integer) objG3;
                        accessibilityNodeInfo3.setMaxTextLength(num != null ? num.intValue() : -1);
                        accessibilityNodeInfo3.setEnabled(gv3.t(vu2Var2));
                        cv2 cv2Var3 = zu2.l;
                        accessibilityNodeInfo3.setFocusable(is1Var4.c(cv2Var3));
                        if (accessibilityNodeInfo3.isFocusable()) {
                            accessibilityNodeInfo3.setFocused(((Boolean) qu2Var4.c(cv2Var3)).booleanValue());
                            if (accessibilityNodeInfo3.isFocused()) {
                                accessibilityNodeInfo2.addAction(2);
                                o7Var2 = o7Var;
                                o7Var2.q = i3;
                            } else {
                                o7Var2 = o7Var;
                                z = true;
                                accessibilityNodeInfo2.addAction(1);
                                accessibilityNodeInfo2.setVisibleToUser(w7.T(vu2Var2) ^ z);
                                if (vu2Var2.o()) {
                                    vu2VarL = vu2Var2;
                                } else {
                                    vu2VarL = vu2Var2.l();
                                    vu2VarL.getClass();
                                }
                                if (vu2VarL.m().f()) {
                                    accessibilityNodeInfo2.setVisibleToUser(false);
                                }
                                objG4 = is1Var4.g(zu2.k);
                                if (objG4 == null) {
                                    objG4 = null;
                                }
                                dj1Var = (dj1) objG4;
                                if (dj1Var != null) {
                                    int i32 = dj1Var.a;
                                    accessibilityNodeInfo3.setLiveRegion((i32 != 0 && i32 == 1) ? 2 : 1);
                                }
                                accessibilityNodeInfo2.setClickable(false);
                                objG5 = is1Var4.g(pu2.b);
                                if (objG5 == null) {
                                    objG5 = null;
                                }
                                y0Var = (y0) objG5;
                                if (y0Var != null) {
                                    Object objG19 = is1Var4.g(zu2.K);
                                    if (objG19 == null) {
                                        objG19 = null;
                                    }
                                    boolean zN4 = s51.n(objG19, bool2);
                                    boolean z3 = (no2Var2 != null && no2Var2.a == 4) || (no2Var2 != null && no2Var2.a == 3);
                                    accessibilityNodeInfo2.setClickable(!z3 || (z3 && !zN4));
                                    if (gv3.t(vu2Var2) && accessibilityNodeInfo3.isClickable()) {
                                        s1Var2.a(new n1(null, 16, y0Var.a, null));
                                    }
                                }
                                accessibilityNodeInfo2.setLongClickable(false);
                                objG6 = is1Var4.g(pu2.c);
                                if (objG6 == null) {
                                    objG6 = null;
                                }
                                y0Var2 = (y0) objG6;
                                if (y0Var2 != null) {
                                    accessibilityNodeInfo2.setLongClickable(true);
                                    if (gv3.t(vu2Var2)) {
                                        s1Var2.a(new n1(32, y0Var2.a));
                                    }
                                }
                                y0Var3 = (y0) oz2.t(qu2Var4, pu2.q);
                                if (y0Var3 != null) {
                                    s1Var2.a(new n1(16384, y0Var3.a));
                                }
                                if (gv3.t(vu2Var2)) {
                                    y0 y0Var4 = (y0) oz2.t(qu2Var4, pu2.k);
                                    if (y0Var4 != null) {
                                        s1Var2.a(new n1(2097152, y0Var4.a));
                                    }
                                    y0 y0Var5 = (y0) oz2.t(qu2Var4, pu2.p);
                                    if (y0Var5 != null) {
                                        s1Var2.a(new n1(R.id.accessibilityActionImeEnter, y0Var5.a));
                                    }
                                    y0 y0Var6 = (y0) oz2.t(qu2Var4, pu2.r);
                                    if (y0Var6 != null) {
                                        s1Var2.a(new n1(65536, y0Var6.a));
                                    }
                                    y0 y0Var7 = (y0) oz2.t(qu2Var4, pu2.s);
                                    if (y0Var7 != null && accessibilityNodeInfo3.isFocused()) {
                                        ClipDescription primaryClipDescription = ((a31) h7Var.getClipboardManager()).s().getPrimaryClipDescription();
                                        if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                            s1Var2.a(new n1(32768, y0Var7.a));
                                        }
                                    }
                                }
                                strO = o7.o(vu2Var2);
                                if (strO != null && strO.length() != 0) {
                                    accessibilityNodeInfo3.setTextSelection(o7Var2.m(vu2Var2), o7Var2.l(vu2Var2));
                                    y0 y0Var8 = (y0) oz2.t(qu2Var4, pu2.j);
                                    s1Var2.a(new n1(131072, y0Var8 == null ? y0Var8.a : null));
                                    accessibilityNodeInfo2.addAction(256);
                                    accessibilityNodeInfo2.addAction(512);
                                    accessibilityNodeInfo2.setMovementGranularities(11);
                                    list = (List) oz2.t(qu2Var4, zu2.a);
                                    if ((list != null || list.isEmpty()) && is1Var4.c(pu2.a) && (!is1Var4.c(zu2.G) || s51.n(oz2.t(qu2Var4, cv2Var3), bool2))) {
                                        tb1VarU = tb1Var.u();
                                        while (true) {
                                            if (tb1VarU == null) {
                                                tb1VarU = null;
                                                break;
                                            }
                                            qu2 qu2VarW = tb1VarU.w();
                                            if (qu2VarW != null && qu2VarW.h) {
                                                if (qu2VarW.f.c(zu2.G)) {
                                                    break;
                                                }
                                            }
                                            tb1VarU = tb1VarU.u();
                                        }
                                        if (tb1VarU == null) {
                                            accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                        } else {
                                            qu2 qu2VarW2 = tb1VarU.w();
                                            if (qu2VarW2 != null) {
                                                Object objG20 = qu2VarW2.f.g(zu2.l);
                                                if (objG20 == null) {
                                                    objG20 = null;
                                                }
                                                zN = s51.n(objG20, Boolean.TRUE);
                                            } else {
                                                zN = false;
                                            }
                                            if (zN) {
                                            }
                                        }
                                    }
                                }
                                arrayList = new ArrayList();
                                arrayList.add("androidx.compose.ui.semantics.id");
                                charSequenceE = s1Var2.e();
                                if (charSequenceE != null && charSequenceE.length() != 0 && is1Var4.c(pu2.a)) {
                                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (is1Var4.c(zu2.A)) {
                                    arrayList.add("androidx.compose.ui.semantics.testTag");
                                }
                                if (is1Var4.c(zu2.S)) {
                                    arrayList.add("androidx.compose.ui.semantics.shapeType");
                                    arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                    arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                    arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                }
                                accessibilityNodeInfo3.setAvailableExtraData(arrayList);
                                qd2Var = (qd2) oz2.t(qu2Var4, zu2.c);
                                if (qd2Var != null) {
                                    float f = qd2Var.a;
                                    ex exVar = qd2Var.b;
                                    cv2 cv2Var4 = pu2.i;
                                    if (is1Var4.c(cv2Var4)) {
                                        s1Var2.g("android.widget.SeekBar");
                                    } else {
                                        s1Var2.g("android.widget.ProgressBar");
                                    }
                                    if (qd2Var != qd2.d) {
                                        accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, exVar.f, exVar.g, f));
                                    }
                                    if (is1Var4.c(cv2Var4) && gv3.t(vu2Var2)) {
                                        float fFloatValue = ((Number) exVar.b()).floatValue();
                                        float fFloatValue2 = ((Number) exVar.a()).floatValue();
                                        if (fFloatValue < fFloatValue2) {
                                            fFloatValue = fFloatValue2;
                                        }
                                        if (f < fFloatValue) {
                                            s1Var2.a(n1.e);
                                        }
                                        float fFloatValue3 = ((Number) exVar.a()).floatValue();
                                        float fFloatValue4 = ((Number) exVar.b()).floatValue();
                                        if (fFloatValue3 > fFloatValue4) {
                                            fFloatValue3 = fFloatValue4;
                                        }
                                        if (f > fFloatValue3) {
                                            s1Var2.a(n1.f);
                                        }
                                    }
                                }
                                n92.f(s1Var2, vu2Var2);
                                objG7 = vu2Var2.k().f.g(zu2.f);
                                if (objG7 == null) {
                                    objG7 = null;
                                }
                                pxVar = (px) objG7;
                                if (pxVar == null) {
                                    accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(pxVar.a, pxVar.b, false, 0));
                                } else {
                                    ArrayList arrayList6 = new ArrayList();
                                    Object objG21 = vu2Var2.k().f.g(zu2.e);
                                    if (objG21 == null) {
                                        objG21 = null;
                                    }
                                    if (objG21 != null) {
                                        List listI2 = vu2Var2.i((4 & 1) != 0 ? !vu2Var2.b : false, (4 & 2) == 0);
                                        int size8 = listI2.size();
                                        for (int i33 = 0; i33 < size8; i33++) {
                                            vu2 vu2Var4 = (vu2) listI2.get(i33);
                                            if (vu2Var4.k().f.c(zu2.K)) {
                                                arrayList6.add(vu2Var4);
                                            }
                                        }
                                    }
                                    if (!arrayList6.isEmpty()) {
                                        boolean zN5 = ur.n(arrayList6);
                                        accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zN5 ? 1 : arrayList6.size(), zN5 ? arrayList6.size() : 1, false, 0));
                                    }
                                }
                                ur.O(s1Var2, vu2Var2);
                                tr2Var = (tr2) oz2.t(vu2Var2.n(), zu2.v);
                                y0 y0Var9 = (y0) oz2.t(vu2Var2.n(), pu2.d);
                                if (tr2Var != null && y0Var9 != null) {
                                    objG9 = vu2Var2.k().f.g(zu2.f);
                                    if (objG9 == null) {
                                        objG9 = null;
                                    }
                                    if (objG9 == null) {
                                        Object objG22 = vu2Var2.k().f.g(zu2.e);
                                        if (objG22 == null) {
                                            objG22 = null;
                                        }
                                        if (objG22 == null) {
                                            s1Var2.g("android.widget.HorizontalScrollView");
                                        }
                                    }
                                    if (((Number) tr2Var.b.a()).floatValue() > 0.0f) {
                                        accessibilityNodeInfo2.setScrollable(true);
                                    }
                                    if (gv3.t(vu2Var2)) {
                                        boolean zU = o7.u(tr2Var);
                                        bb1 bb1Var = bb1.g;
                                        if (zU) {
                                            s1Var2.a(n1.e);
                                            tb1Var2 = tb1Var;
                                            s1Var2.a(tb1Var2.F == bb1Var ? n1.h : n1.j);
                                        } else {
                                            tb1Var2 = tb1Var;
                                        }
                                        if (o7.t(tr2Var)) {
                                            s1Var2.a(n1.f);
                                            s1Var2.a(tb1Var2.F == bb1Var ? n1.j : n1.h);
                                        }
                                    }
                                }
                                tr2Var2 = (tr2) oz2.t(vu2Var2.n(), zu2.w);
                                if (tr2Var2 != null && y0Var9 != null) {
                                    objG8 = vu2Var2.k().f.g(zu2.f);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    if (objG8 == null) {
                                        Object objG23 = vu2Var2.k().f.g(zu2.e);
                                        if (objG23 == null) {
                                            objG23 = null;
                                        }
                                        if (objG23 == null) {
                                            s1Var2.g("android.widget.ScrollView");
                                        }
                                    }
                                    if (((Number) tr2Var2.b.a()).floatValue() > 0.0f) {
                                        accessibilityNodeInfo2.setScrollable(true);
                                    }
                                    if (gv3.t(vu2Var2)) {
                                        if (o7.u(tr2Var2)) {
                                            s1Var2.a(n1.e);
                                            s1Var2.a(n1.i);
                                        }
                                        if (o7.t(tr2Var2)) {
                                            s1Var2.a(n1.f);
                                            s1Var2.a(n1.g);
                                        }
                                    }
                                }
                                i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 29) {
                                    cl3.e(s1Var2, vu2Var2);
                                }
                                CharSequence charSequence = (CharSequence) oz2.t(vu2Var2.n(), zu2.d);
                                if (i4 < 28) {
                                    accessibilityNodeInfo2.setPaneTitle(charSequence);
                                } else {
                                    accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                }
                                if (gv3.t(vu2Var2)) {
                                    y0 y0Var10 = (y0) oz2.t(vu2Var2.n(), pu2.t);
                                    if (y0Var10 != null) {
                                        s1Var2.a(new n1(262144, y0Var10.a));
                                    }
                                    y0 y0Var11 = (y0) oz2.t(vu2Var2.n(), pu2.u);
                                    if (y0Var11 != null) {
                                        s1Var2.a(new n1(524288, y0Var11.a));
                                    }
                                    y0 y0Var12 = (y0) oz2.t(vu2Var2.n(), pu2.v);
                                    if (y0Var12 != null) {
                                        s1Var2.a(new n1(1048576, y0Var12.a));
                                    }
                                    qu2 qu2VarN = vu2Var2.n();
                                    cv2 cv2Var5 = pu2.x;
                                    if (qu2VarN.f.c(cv2Var5)) {
                                        List list5 = (List) vu2Var2.n().c(cv2Var5);
                                        int size9 = list5.size();
                                        nr1 nr1Var = o7.S;
                                        int i34 = nr1Var.b;
                                        if (size9 >= i34) {
                                            c.q(by1.h("Can't have more than ", " custom actions for one widget", i34));
                                            return null;
                                        }
                                        l83 l83Var3 = new l83(0);
                                        wr1 wr1VarA = ay1.a();
                                        l83 l83Var4 = l83Var;
                                        if (l83Var4.f) {
                                            r51.j(l83Var4);
                                        }
                                        if (w7.D(l83Var4.i, i3, l83Var4.g) >= 0) {
                                            wr1 wr1Var = (wr1) l83Var4.b(i3);
                                            int[] iArr = nr1Var.a;
                                            int i35 = nr1Var.b;
                                            int[] iArrCopyOf = new int[16];
                                            int i36 = 0;
                                            int i37 = 0;
                                            while (i36 < i35) {
                                                int i38 = iArr[i36];
                                                int i39 = i35;
                                                int i40 = i37 + 1;
                                                wr1 wr1Var2 = wr1Var;
                                                if (iArrCopyOf.length < i40) {
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i40, (iArrCopyOf.length * 3) / 2));
                                                }
                                                iArrCopyOf[i37] = i38;
                                                i36++;
                                                i37 = i40;
                                                i35 = i39;
                                                wr1Var = wr1Var2;
                                            }
                                            wr1 wr1Var3 = wr1Var;
                                            ArrayList arrayList7 = new ArrayList();
                                            if (list5.size() > 0) {
                                                nc2.u(list5.get(0));
                                                wr1Var3.getClass();
                                                throw null;
                                            }
                                            if (arrayList7.size() > 0) {
                                                nc2.u(arrayList7.get(0));
                                                if (i37 <= 0) {
                                                    c.i("Index must be between 0 and size");
                                                    return null;
                                                }
                                                int i41 = iArrCopyOf[0];
                                                throw null;
                                            }
                                        } else if (list5.size() > 0) {
                                            nc2.u(list5.get(0));
                                            nr1Var.c(0);
                                            throw null;
                                        }
                                        o7Var2.w.d(i3, l83Var3);
                                        l83Var4.d(i3, wr1VarA);
                                    }
                                }
                                boolean zG = gv3.G(vu2Var2, resources);
                                if (Build.VERSION.SDK_INT < 28) {
                                    accessibilityNodeInfo2.setScreenReaderFocusable(zG);
                                } else {
                                    s1Var2.f(1, zG);
                                }
                                iD = o7Var2.G.d(i3);
                                if (iD == -1) {
                                    tc tcVarK2 = t22.K(h7Var.getAndroidViewsHandler$ui(), iD);
                                    if (tcVarK2 != null) {
                                        accessibilityNodeInfo2.setTraversalBefore(tcVarK2);
                                        h7Var2 = h7Var;
                                    } else {
                                        h7Var2 = h7Var;
                                        accessibilityNodeInfo2.setTraversalBefore(h7Var2, iD);
                                    }
                                    bundle = null;
                                    o7Var2.e(i3, s1Var2, o7Var2.I, null);
                                } else {
                                    h7Var2 = h7Var;
                                    bundle = null;
                                }
                                iD2 = o7Var2.H.d(i3);
                                if (iD2 != -1 && (tcVarK = t22.K(h7Var2.getAndroidViewsHandler$ui(), iD2)) != null) {
                                    accessibilityNodeInfo2.setTraversalAfter(tcVarK);
                                    o7Var2.e(i3, s1Var2, o7Var2.J, bundle);
                                }
                                str = (String) oz2.t(vu2Var2.n(), rn.a1);
                                if (str != null) {
                                    s1Var2.g(str);
                                }
                                s1Var3 = s1Var2;
                            }
                        } else {
                            o7Var2 = o7Var;
                        }
                        z = true;
                        accessibilityNodeInfo2.setVisibleToUser(w7.T(vu2Var2) ^ z);
                        if (vu2Var2.o()) {
                        }
                        if (vu2VarL.m().f()) {
                        }
                        objG4 = is1Var4.g(zu2.k);
                        if (objG4 == null) {
                        }
                        dj1Var = (dj1) objG4;
                        if (dj1Var != null) {
                        }
                        accessibilityNodeInfo2.setClickable(false);
                        objG5 = is1Var4.g(pu2.b);
                        if (objG5 == null) {
                        }
                        y0Var = (y0) objG5;
                        if (y0Var != null) {
                        }
                        accessibilityNodeInfo2.setLongClickable(false);
                        objG6 = is1Var4.g(pu2.c);
                        if (objG6 == null) {
                        }
                        y0Var2 = (y0) objG6;
                        if (y0Var2 != null) {
                        }
                        y0Var3 = (y0) oz2.t(qu2Var4, pu2.q);
                        if (y0Var3 != null) {
                        }
                        if (gv3.t(vu2Var2)) {
                        }
                        strO = o7.o(vu2Var2);
                        if (strO != null) {
                            accessibilityNodeInfo3.setTextSelection(o7Var2.m(vu2Var2), o7Var2.l(vu2Var2));
                            y0 y0Var82 = (y0) oz2.t(qu2Var4, pu2.j);
                            s1Var2.a(new n1(131072, y0Var82 == null ? y0Var82.a : null));
                            accessibilityNodeInfo2.addAction(256);
                            accessibilityNodeInfo2.addAction(512);
                            accessibilityNodeInfo2.setMovementGranularities(11);
                            list = (List) oz2.t(qu2Var4, zu2.a);
                            if (list != null) {
                                tb1VarU = tb1Var.u();
                                while (true) {
                                    if (tb1VarU == null) {
                                    }
                                    tb1VarU = tb1VarU.u();
                                }
                                if (tb1VarU == null) {
                                }
                            } else {
                                tb1VarU = tb1Var.u();
                                while (true) {
                                    if (tb1VarU == null) {
                                    }
                                    tb1VarU = tb1VarU.u();
                                }
                                if (tb1VarU == null) {
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceE = s1Var2.e();
                        if (charSequenceE != null) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (is1Var4.c(zu2.A)) {
                        }
                        if (is1Var4.c(zu2.S)) {
                        }
                        accessibilityNodeInfo3.setAvailableExtraData(arrayList);
                        qd2Var = (qd2) oz2.t(qu2Var4, zu2.c);
                        if (qd2Var != null) {
                        }
                        n92.f(s1Var2, vu2Var2);
                        objG7 = vu2Var2.k().f.g(zu2.f);
                        if (objG7 == null) {
                        }
                        pxVar = (px) objG7;
                        if (pxVar == null) {
                        }
                        ur.O(s1Var2, vu2Var2);
                        tr2Var = (tr2) oz2.t(vu2Var2.n(), zu2.v);
                        y0 y0Var92 = (y0) oz2.t(vu2Var2.n(), pu2.d);
                        if (tr2Var != null) {
                            objG9 = vu2Var2.k().f.g(zu2.f);
                            if (objG9 == null) {
                            }
                            if (objG9 == null) {
                            }
                            if (((Number) tr2Var.b.a()).floatValue() > 0.0f) {
                            }
                            if (gv3.t(vu2Var2)) {
                            }
                        }
                        tr2Var2 = (tr2) oz2.t(vu2Var2.n(), zu2.w);
                        if (tr2Var2 != null) {
                            objG8 = vu2Var2.k().f.g(zu2.f);
                            if (objG8 == null) {
                            }
                            if (objG8 == null) {
                            }
                            if (((Number) tr2Var2.b.a()).floatValue() > 0.0f) {
                            }
                            if (gv3.t(vu2Var2)) {
                            }
                        }
                        i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 29) {
                        }
                        CharSequence charSequence2 = (CharSequence) oz2.t(vu2Var2.n(), zu2.d);
                        if (i4 < 28) {
                        }
                        if (gv3.t(vu2Var2)) {
                        }
                        boolean zG2 = gv3.G(vu2Var2, resources);
                        if (Build.VERSION.SDK_INT < 28) {
                        }
                        iD = o7Var2.G.d(i3);
                        if (iD == -1) {
                        }
                        iD2 = o7Var2.H.d(i3);
                        if (iD2 != -1) {
                            accessibilityNodeInfo2.setTraversalAfter(tcVarK);
                            o7Var2.e(i3, s1Var2, o7Var2.J, bundle);
                        }
                        str = (String) oz2.t(vu2Var2.n(), rn.a1);
                        if (str != null) {
                        }
                        s1Var3 = s1Var2;
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo2.setHeading(true);
                        s1Var2 = s1Var;
                        objG = is1Var4.g(zu2.i);
                        if (objG == null) {
                        }
                        if (((dm3) objG) != null) {
                        }
                        i3 = i;
                        if (i3 != -1) {
                        }
                        accessibilityNodeInfo3.setPassword(is1Var4.c(zu2.N));
                        objG2 = is1Var4.g(zu2.Q);
                        if (objG2 == null) {
                        }
                        Boolean bool22 = Boolean.TRUE;
                        accessibilityNodeInfo3.setEditable(s51.n(objG2, bool22));
                        objG3 = is1Var4.g(zu2.R);
                        if (objG3 == null) {
                        }
                        Integer num2 = (Integer) objG3;
                        accessibilityNodeInfo3.setMaxTextLength(num2 != null ? num2.intValue() : -1);
                        accessibilityNodeInfo3.setEnabled(gv3.t(vu2Var2));
                        cv2 cv2Var32 = zu2.l;
                        accessibilityNodeInfo3.setFocusable(is1Var4.c(cv2Var32));
                        if (accessibilityNodeInfo3.isFocusable()) {
                        }
                        z = true;
                        accessibilityNodeInfo2.setVisibleToUser(w7.T(vu2Var2) ^ z);
                        if (vu2Var2.o()) {
                        }
                        if (vu2VarL.m().f()) {
                        }
                        objG4 = is1Var4.g(zu2.k);
                        if (objG4 == null) {
                        }
                        dj1Var = (dj1) objG4;
                        if (dj1Var != null) {
                        }
                        accessibilityNodeInfo2.setClickable(false);
                        objG5 = is1Var4.g(pu2.b);
                        if (objG5 == null) {
                        }
                        y0Var = (y0) objG5;
                        if (y0Var != null) {
                        }
                        accessibilityNodeInfo2.setLongClickable(false);
                        objG6 = is1Var4.g(pu2.c);
                        if (objG6 == null) {
                        }
                        y0Var2 = (y0) objG6;
                        if (y0Var2 != null) {
                        }
                        y0Var3 = (y0) oz2.t(qu2Var4, pu2.q);
                        if (y0Var3 != null) {
                        }
                        if (gv3.t(vu2Var2)) {
                        }
                        strO = o7.o(vu2Var2);
                        if (strO != null) {
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceE = s1Var2.e();
                        if (charSequenceE != null) {
                        }
                        if (is1Var4.c(zu2.A)) {
                        }
                        if (is1Var4.c(zu2.S)) {
                        }
                        accessibilityNodeInfo3.setAvailableExtraData(arrayList);
                        qd2Var = (qd2) oz2.t(qu2Var4, zu2.c);
                        if (qd2Var != null) {
                        }
                        n92.f(s1Var2, vu2Var2);
                        objG7 = vu2Var2.k().f.g(zu2.f);
                        if (objG7 == null) {
                        }
                        pxVar = (px) objG7;
                        if (pxVar == null) {
                        }
                        ur.O(s1Var2, vu2Var2);
                        tr2Var = (tr2) oz2.t(vu2Var2.n(), zu2.v);
                        y0 y0Var922 = (y0) oz2.t(vu2Var2.n(), pu2.d);
                        if (tr2Var != null) {
                        }
                        tr2Var2 = (tr2) oz2.t(vu2Var2.n(), zu2.w);
                        if (tr2Var2 != null) {
                        }
                        i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 29) {
                        }
                        CharSequence charSequence22 = (CharSequence) oz2.t(vu2Var2.n(), zu2.d);
                        if (i4 < 28) {
                        }
                        if (gv3.t(vu2Var2)) {
                        }
                        boolean zG22 = gv3.G(vu2Var2, resources);
                        if (Build.VERSION.SDK_INT < 28) {
                        }
                        iD = o7Var2.G.d(i3);
                        if (iD == -1) {
                        }
                        iD2 = o7Var2.H.d(i3);
                        if (iD2 != -1) {
                        }
                        str = (String) oz2.t(vu2Var2.n(), rn.a1);
                        if (str != null) {
                        }
                        s1Var3 = s1Var2;
                    } else {
                        s1Var2 = s1Var;
                        s1Var2.f(2, true);
                        objG = is1Var4.g(zu2.i);
                        if (objG == null) {
                        }
                        if (((dm3) objG) != null) {
                        }
                        i3 = i;
                        if (i3 != -1) {
                        }
                        accessibilityNodeInfo3.setPassword(is1Var4.c(zu2.N));
                        objG2 = is1Var4.g(zu2.Q);
                        if (objG2 == null) {
                        }
                        Boolean bool222 = Boolean.TRUE;
                        accessibilityNodeInfo3.setEditable(s51.n(objG2, bool222));
                        objG3 = is1Var4.g(zu2.R);
                        if (objG3 == null) {
                        }
                        Integer num22 = (Integer) objG3;
                        accessibilityNodeInfo3.setMaxTextLength(num22 != null ? num22.intValue() : -1);
                        accessibilityNodeInfo3.setEnabled(gv3.t(vu2Var2));
                        cv2 cv2Var322 = zu2.l;
                        accessibilityNodeInfo3.setFocusable(is1Var4.c(cv2Var322));
                        if (accessibilityNodeInfo3.isFocusable()) {
                        }
                        z = true;
                        accessibilityNodeInfo2.setVisibleToUser(w7.T(vu2Var2) ^ z);
                        if (vu2Var2.o()) {
                        }
                        if (vu2VarL.m().f()) {
                        }
                        objG4 = is1Var4.g(zu2.k);
                        if (objG4 == null) {
                        }
                        dj1Var = (dj1) objG4;
                        if (dj1Var != null) {
                        }
                        accessibilityNodeInfo2.setClickable(false);
                        objG5 = is1Var4.g(pu2.b);
                        if (objG5 == null) {
                        }
                        y0Var = (y0) objG5;
                        if (y0Var != null) {
                        }
                        accessibilityNodeInfo2.setLongClickable(false);
                        objG6 = is1Var4.g(pu2.c);
                        if (objG6 == null) {
                        }
                        y0Var2 = (y0) objG6;
                        if (y0Var2 != null) {
                        }
                        y0Var3 = (y0) oz2.t(qu2Var4, pu2.q);
                        if (y0Var3 != null) {
                        }
                        if (gv3.t(vu2Var2)) {
                        }
                        strO = o7.o(vu2Var2);
                        if (strO != null) {
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceE = s1Var2.e();
                        if (charSequenceE != null) {
                        }
                        if (is1Var4.c(zu2.A)) {
                        }
                        if (is1Var4.c(zu2.S)) {
                        }
                        accessibilityNodeInfo3.setAvailableExtraData(arrayList);
                        qd2Var = (qd2) oz2.t(qu2Var4, zu2.c);
                        if (qd2Var != null) {
                        }
                        n92.f(s1Var2, vu2Var2);
                        objG7 = vu2Var2.k().f.g(zu2.f);
                        if (objG7 == null) {
                        }
                        pxVar = (px) objG7;
                        if (pxVar == null) {
                        }
                        ur.O(s1Var2, vu2Var2);
                        tr2Var = (tr2) oz2.t(vu2Var2.n(), zu2.v);
                        y0 y0Var9222 = (y0) oz2.t(vu2Var2.n(), pu2.d);
                        if (tr2Var != null) {
                        }
                        tr2Var2 = (tr2) oz2.t(vu2Var2.n(), zu2.w);
                        if (tr2Var2 != null) {
                        }
                        i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 29) {
                        }
                        CharSequence charSequence222 = (CharSequence) oz2.t(vu2Var2.n(), zu2.d);
                        if (i4 < 28) {
                        }
                        if (gv3.t(vu2Var2)) {
                        }
                        boolean zG222 = gv3.G(vu2Var2, resources);
                        if (Build.VERSION.SDK_INT < 28) {
                        }
                        iD = o7Var2.G.d(i3);
                        if (iD == -1) {
                        }
                        iD2 = o7Var2.H.d(i3);
                        if (iD2 != -1) {
                        }
                        str = (String) oz2.t(vu2Var2.n(), rn.a1);
                        if (str != null) {
                        }
                        s1Var3 = s1Var2;
                    }
                } else if (!(Build.VERSION.SDK_INT >= 34 ? c1.h(accessibilityManager2) : true)) {
                    o7Var2 = o7Var3;
                    i3 = i;
                    s1Var3 = null;
                }
            }
        }
        if (o7Var2.t) {
            if (i3 == o7Var2.p) {
                o7Var2.r = s1Var3;
            }
            if (i3 == o7Var2.q) {
                o7Var2.s = s1Var3;
            }
        }
        return s1Var3;
    }

    @Override // defpackage.yl1
    public final s1 z(int i) {
        o7 o7Var = this.i;
        if (i != 1) {
            if (i == 2) {
                return u(o7Var.p);
            }
            c.p(by1.e(i, "Unknown focus type: "));
            return null;
        }
        int i2 = o7Var.q;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return u(i2);
    }
}
