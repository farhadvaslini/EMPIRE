package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class vp {
    public static Method a;
    public static Method b;
    public static boolean c;
    public static w01 d;
    public static w01 e;
    public static w01 f;

    public static int A(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final long B(long j) {
        long j2 = (j << 1) + 1;
        ig0.f.getClass();
        int i = kg0.a;
        return j2;
    }

    public static void C(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!c) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    a = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    b = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            c = true;
        }
        if (z) {
            try {
                Method method4 = a;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final w01 D() {
        w01 w01Var = e;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(19.0f, 6.41f);
        tx0Var.h(17.59f, 5.0f);
        tx0Var.h(12.0f, 10.59f);
        tx0Var.h(6.41f, 5.0f);
        tx0Var.h(5.0f, 6.41f);
        tx0Var.h(10.59f, 12.0f);
        tx0Var.h(5.0f, 17.59f);
        tx0Var.h(6.41f, 19.0f);
        tx0Var.h(12.0f, 13.41f);
        tx0Var.h(17.59f, 19.0f);
        tx0Var.h(19.0f, 17.59f);
        tx0Var.h(13.41f, 12.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        e = w01VarB;
        return w01VarB;
    }

    public static final float E(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static Set F() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final int I(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final boolean J(long j) {
        if (wx.c(j, wx.f)) {
            return false;
        }
        iy iyVarF = wx.f(j);
        if (!gq.y(iyVarF.b, 12884901888L)) {
            l21.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(gq.S(iyVarF.b)));
        }
        ao2 ao2Var = ((eo2) iyVarF).p;
        float fC = (float) ((ao2Var.c(wx.e(j)) * 0.0722d) + (ao2Var.c(wx.g(j)) * 0.7152d) + (ao2Var.c(wx.h(j)) * 0.2126d));
        if (fC < 0.0f) {
            fC = 0.0f;
        }
        if (fC > 1.0f) {
            fC = 1.0f;
        }
        return ((double) fC) <= 0.5d;
    }

    public static final boolean K(long j) {
        return (j & 2) != 0;
    }

    public static final boolean L(long j) {
        return (j & 1) != 0;
    }

    public static int M(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        c.r(nc2.g(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static final long N(long j, long j2, float f2) {
        ny1 ny1Var = ky.x;
        long jA = wx.a(j, ny1Var);
        long jA2 = wx.a(j2, ny1Var);
        float fD = wx.d(jA);
        float fH = wx.h(jA);
        float fG = wx.g(jA);
        float fE = wx.e(jA);
        float fD2 = wx.d(jA2);
        float fH2 = wx.h(jA2);
        float fG2 = wx.g(jA2);
        float fE2 = wx.e(jA2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return wx.a(m(lq.N(fH, fH2, f2), lq.N(fG, fG2, f2), lq.N(fE, fE2, f2), lq.N(fD, fD2, f2), ny1Var), wx.f(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long O(int i, String str) {
        int iA = A(str, 0, i, false);
        Matcher matcher = s40.n.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iO0 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iA < i) {
            int iA2 = A(str, iA + 1, i, true);
            matcher.region(iA, iA2);
            if (i3 == -1 && matcher.usePattern(s40.n).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i5 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i6 = Integer.parseInt(strGroup3);
            } else if (i4 == -1 && matcher.usePattern(s40.m).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i4 = Integer.parseInt(strGroup4);
            } else if (iO0 == -1) {
                Pattern pattern = s40.l;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iO0 = y93.o0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i2 == -1 && matcher.usePattern(s40.k).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i2 = Integer.parseInt(strGroup6);
                }
            }
            iA = A(str, iA2 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            c.p("Failed requirement.");
            return 0L;
        }
        if (iO0 == -1) {
            c.p("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            c.p("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            c.p("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            c.p("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            c.p("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(lv3.a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iO0 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final Object P(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final Object Q(n52 n52Var, ee2 ee2Var) {
        ee2Var.getClass();
        Object objB = n52Var.get(ee2Var);
        if (objB == null) {
            objB = ee2Var.b();
        }
        return ((oo3) objB).a(n52Var);
    }

    public static final Object R(Object obj) {
        return obj instanceof jz ? y02.l(((jz) obj).a) : obj;
    }

    public static final View S(ia0 ia0Var) {
        if (!((aq1) ia0Var).f.s) {
            m21.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) wb1.a(vr.X(ia0Var));
    }

    public static final int T(long j) {
        float[] fArr = ky.a;
        return (int) (wx.a(j, ky.e) >>> 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[PHI: r4
      0x006d: PHI (r4v5 long) = (r4v3 long), (r4v4 long), (r4v4 long), (r4v4 long), (r4v4 long) binds: [B:31:0x006b, B:47:0x0099, B:50:0x009f, B:42:0x0085, B:36:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long U(long j, lg0 lg0Var) {
        long j2;
        TimeUnit timeUnit = lg0Var.f;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            zj zjVar = ig0.f;
            long j3 = jConvert2 << 1;
            int i = kg0.a;
            return j3;
        }
        if (lg0Var.compareTo(lg0.MILLISECONDS) < 0) {
            return B(y02.i(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long jAbs = Math.abs(j);
        int iOrdinal = lg0Var.ordinal();
        long j4 = 0;
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                c.h(lg0Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (jAbs == 0) {
            jAbs = j4;
        } else {
            j4 = 4611686018427387903L;
            if (jAbs == 1) {
                if (j2 <= 4611686018427387903L) {
                    jAbs = j2;
                }
            } else if (j2 != 1) {
                int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(jAbs)) - Long.numberOfLeadingZeros(j2);
                if (iNumberOfLeadingZeros < 63) {
                    jAbs *= j2;
                } else if (iNumberOfLeadingZeros <= 63) {
                    jAbs *= j2;
                    if (jAbs > 4611686018427387903L) {
                    }
                }
            } else if (jAbs > 4611686018427387903L) {
            }
        }
        return B(jSignum * jAbs);
    }

    public static final n52 V(he2[] he2VarArr, n52 n52Var, n52 n52Var2) {
        n52 n52Var3 = n52.i;
        m52 m52Var = new m52(n52Var3);
        m52Var.l = n52Var3;
        for (he2 he2Var : he2VarArr) {
            ee2 ee2Var = he2Var.a;
            if (he2Var.g || !n52Var.containsKey(ee2Var)) {
                m52Var.put(ee2Var, ee2Var.d(he2Var, (oo3) n52Var2.get(ee2Var)));
            }
        }
        return m52Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(float f2, float f3, float f4, float f5, iy iyVar) {
        int i;
        int i2;
        int i3;
        float fB;
        float fA;
        int i4;
        int i5;
        int i6;
        int i7;
        float fB2;
        float fA2;
        int i8;
        int i9;
        int i10;
        float f6;
        if (iyVar.c()) {
            float f7 = f5 < 0.0f ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i11 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i12 = i11 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < 0.0f ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i13 = i12 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            f6 = f4 >= 0.0f ? f4 : 0.0f;
            long j = ((long) (i13 | ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i14 = wx.h;
            return j;
        }
        if (((int) (iyVar.b >> 32)) != 3) {
            l21.a("Color only works with ColorSpaces with 3 components");
        }
        int i15 = iyVar.c;
        if (i15 == -1) {
            l21.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fB3 = iyVar.b(0);
        float fA3 = iyVar.a(0);
        if (f2 >= fB3) {
            fB3 = f2;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fA3);
        int i16 = iFloatToRawIntBits >>> 31;
        int i17 = (iFloatToRawIntBits >>> 23) & 255;
        int i18 = iFloatToRawIntBits & 8388607;
        if (i17 == 255) {
            i2 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i19 = i18 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i19) + 1) | (i16 << 15);
                    short s = (short) i3;
                    fB = iyVar.b(1);
                    fA = iyVar.a(1);
                    if (f3 >= fB) {
                        fB = f3;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fA);
                    int i20 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i21 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i21 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i22 = i21 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i22) + 1) | (i20 << 15);
                                short s2 = (short) i7;
                                fB2 = iyVar.b(2);
                                fA2 = iyVar.a(2);
                                if (f4 >= fB2) {
                                    fB2 = f4;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA2);
                                int i23 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i24 = 8388607 & iFloatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i24 != 0 ? 512 : 0;
                                    i = 31;
                                } else {
                                    int i25 = i8 - 112;
                                    if (i25 >= 31) {
                                        i9 = 0;
                                        i = 49;
                                    } else if (i25 > 0) {
                                        int i26 = i24 >> 13;
                                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i25 << 10) | i26) + 1) | (i23 << 15);
                                            short s3 = (short) i10;
                                            f6 = f5 >= 0.0f ? f5 : 0.0f;
                                            long j2 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i27 = wx.h;
                                            return j2;
                                        }
                                        i9 = i26;
                                        i = i25;
                                    } else if (i25 >= -10) {
                                        int i28 = (i24 | 8388608) >> (1 - i25);
                                        if ((i28 & 4096) != 0) {
                                            i28 += 8192;
                                        }
                                        i9 = i28 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i23 << 15) | (i << 10);
                                short s32 = (short) i10;
                                if (f5 >= 0.0f) {
                                }
                                long j22 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s32)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i272 = wx.h;
                                return j22;
                            }
                            i6 = i22;
                        } else if (i5 >= -10) {
                            int i29 = (i21 | 8388608) >> (1 - i5);
                            if ((i29 & 4096) != 0) {
                                i29 += 8192;
                            }
                            i6 = i29 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i20 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    fB2 = iyVar.b(2);
                    fA2 = iyVar.a(2);
                    if (f4 >= fB2) {
                    }
                    if (fB2 <= fA2) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fA2);
                    int i232 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i242 = 8388607 & iFloatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i232 << 15) | (i << 10);
                    short s322 = (short) i10;
                    if (f5 >= 0.0f) {
                    }
                    long j222 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((65535 & ((long) s322)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i2722 = wx.h;
                    return j222;
                }
                i2 = i19;
            } else if (i >= -10) {
                int i30 = (i18 | 8388608) >> (1 - i);
                if ((i30 & 4096) != 0) {
                    i30 += 8192;
                }
                i2 = i30 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i16 << 15) | (i << 10);
        short s4 = (short) i3;
        fB = iyVar.b(1);
        fA = iyVar.a(1);
        if (f3 >= fB) {
        }
        if (fB <= fA) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fA);
        int i202 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i212 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i202 << 15) | (i5 << 10);
        short s222 = (short) i7;
        fB2 = iyVar.b(2);
        fA2 = iyVar.a(2);
        if (f4 >= fB2) {
        }
        if (fB2 <= fA2) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fA2);
        int i2322 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2422 = 8388607 & iFloatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2322 << 15) | (i << 10);
        short s3222 = (short) i10;
        if (f5 >= 0.0f) {
        }
        long j2222 = (((long) i15) & 63) | ((((long) s4) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((65535 & ((long) s3222)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i27222 = wx.h;
        return j2222;
    }

    public static final long b(int i) {
        long j = ((long) i) << 32;
        int i2 = wx.h;
        return j;
    }

    public static final long c(long j) {
        long j2 = j << 32;
        int i = wx.h;
        return j2;
    }

    public static long d(int i, int i2, int i3) {
        return b(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final void e(gk3 gk3Var, bq1 bq1Var, mm0 mm0Var, ns0 ns0Var, d00 d00Var, nv0 nv0Var, int i) {
        ns0 ns0Var2;
        u10 u10Var = gk3Var.a;
        nv0Var.b0(-1877370462);
        int i2 = (i & 6) == 0 ? (nv0Var.f(gk3Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(mm0Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= nv0Var.h(d00Var) ? 16384 : 8192;
        }
        if (nv0Var.R(i3 & 1, (i3 & 9363) != 9362)) {
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = hd.n;
                nv0Var.j0(objO);
            }
            ns0 ns0Var3 = (ns0) objO;
            Object objO2 = nv0Var.O();
            Object obj2 = objO2;
            if (objO2 == obj) {
                l73 l73Var = new l73();
                l73Var.add(u10Var.h());
                nv0Var.j0(l73Var);
                obj2 = l73Var;
            }
            l73 l73Var2 = (l73) obj2;
            Object objO3 = nv0Var.O();
            if (objO3 == obj) {
                long[] jArr = nr2.a;
                objO3 = new is1();
                nv0Var.j0(objO3);
            }
            is1 is1Var = (is1) objO3;
            d42 d42Var = gk3Var.d;
            if (s51.n(u10Var.h(), d42Var.getValue())) {
                nv0Var.a0(321145192);
                if (l73Var2.size() == 1 && s51.n(l73Var2.get(0), d42Var.getValue())) {
                    nv0Var.a0(321469824);
                    nv0Var.p(false);
                } else {
                    nv0Var.a0(321279546);
                    boolean z = (i3 & 14) == 4;
                    Object objO4 = nv0Var.O();
                    if (z || objO4 == obj) {
                        objO4 = new kd(3, gk3Var);
                        nv0Var.j0(objO4);
                    }
                    vx.g0(l73Var2, (ns0) objO4);
                    is1Var.a();
                    nv0Var.p(false);
                }
                nv0Var.p(false);
            } else {
                nv0Var.a0(321475776);
                nv0Var.p(false);
            }
            if (is1Var.b(d42Var.getValue())) {
                nv0Var.a0(322279296);
                nv0Var.p(false);
            } else {
                nv0Var.a0(321536443);
                ListIterator listIterator = l73Var2.listIterator();
                int i4 = 0;
                while (true) {
                    jy0 jy0Var = (jy0) listIterator;
                    if (!jy0Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (s51.n(ns0Var3.h(jy0Var.next()), ns0Var3.h(d42Var.getValue()))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    l73Var2.add(d42Var.getValue());
                } else {
                    l73Var2.set(i4, d42Var.getValue());
                }
                is1Var.a();
                int size = l73Var2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj3 = l73Var2.get(i5);
                    is1Var.m(obj3, gq.N(-934471669, new k60(gk3Var, mm0Var, obj3, d00Var), nv0Var));
                }
                nv0Var.p(false);
            }
            cn1 cn1VarD = eo.d(f5.g, false);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1Var);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.v(nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            nv0Var.a0(-1312707512);
            int size2 = l73Var2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                Object obj4 = l73Var2.get(i6);
                nv0Var.Y(1171574969, ns0Var3.h(obj4));
                rs0 rs0Var = (rs0) is1Var.g(obj4);
                if (rs0Var == null) {
                    nv0Var.a0(1959122128);
                } else {
                    nv0Var.a0(1171576145);
                    rs0Var.f(nv0Var, 0);
                }
                nv0Var.p(false);
                nv0Var.p(false);
            }
            nv0Var.p(false);
            nv0Var.p(true);
            ns0Var2 = ns0Var3;
        } else {
            nv0Var.U();
            ns0Var2 = ns0Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new i60(gk3Var, bq1Var, mm0Var, ns0Var2, d00Var, i, 1);
        }
    }

    public static final void f(Boolean bool, bq1 bq1Var, mm0 mm0Var, String str, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        bq1 bq1Var2;
        String str2;
        nv0Var.b0(-513216493);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? nv0Var.f(bool) : nv0Var.h(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= nv0Var.h(mm0Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 |= nv0Var.h(d00Var) ? 16384 : 8192;
        }
        if (nv0Var.R(i4 & 1, (i4 & 9363) != 9362)) {
            yp1 yp1Var = yp1.a;
            e(w7.d0(bool, "Crossfade", nv0Var, (i4 & 14) | ((i4 >> 6) & 112), 0), yp1Var, mm0Var, null, d00Var, nv0Var, i4 & 58352);
            bq1Var2 = yp1Var;
            str2 = "Crossfade";
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            str2 = str;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new i60(bool, bq1Var2, mm0Var, str2, d00Var, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(rs0 rs0Var, bq1 bq1Var, rs0 rs0Var2, rs0 rs0Var3, rs0 rs0Var4, ei1 ei1Var, nv0 nv0Var, int i, int i2) {
        bq1 bq1Var2;
        int i3;
        rs0 rs0Var5;
        int i4;
        rs0 rs0Var6;
        ei1 ei1VarB;
        int i5;
        rs0 rs0Var7;
        ei1 ei1Var2;
        xj2 xj2VarT;
        d00 d00Var;
        d00 d00Var2;
        d00 d00Var3;
        nv0Var.b0(487133126);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i | 48;
            bq1Var2 = bq1Var;
        } else {
            bq1Var2 = bq1Var;
            i3 = (nv0Var.f(bq1Var2) ? 32 : 16) | i;
        }
        int i7 = i3 | 384;
        int i8 = i2 & 8;
        if (i8 != 0) {
            i7 = i3 | 3456;
        } else {
            if ((i & 3072) == 0) {
                rs0Var5 = rs0Var2;
                i7 |= nv0Var.h(rs0Var5) ? 2048 : 1024;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i7 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    rs0Var6 = rs0Var4;
                    i7 |= nv0Var.h(rs0Var6) ? 131072 : 65536;
                }
                if ((i2 & 64) == 0) {
                    ei1VarB = ei1Var;
                    int i9 = nv0Var.f(ei1VarB) ? 1048576 : 524288;
                    i5 = i7 | i9 | 113246208;
                    int i10 = 0;
                    int i11 = 1;
                    if (nv0Var.R(i5 & 1, (38347923 & i5) == 38347922)) {
                        nv0Var.U();
                        rs0Var7 = rs0Var6;
                        ei1Var2 = ei1VarB;
                    } else {
                        nv0Var.W();
                        int i12 = i & 1;
                        yp1 yp1Var = yp1.a;
                        Object obj = null;
                        if (i12 == 0 || nv0Var.A()) {
                            if (i6 != 0) {
                                bq1Var2 = yp1Var;
                            }
                            if (i8 != 0) {
                                rs0Var5 = null;
                            }
                            if (i4 != 0) {
                                rs0Var6 = null;
                            }
                            if ((i2 & 64) != 0) {
                                ei1VarB = vr.B((fy) nv0Var.j(hy.a));
                            }
                        } else {
                            nv0Var.U();
                        }
                        rs0 rs0Var8 = rs0Var6;
                        ei1 ei1Var3 = ei1VarB;
                        nv0Var.q();
                        d00 d00VarN = gq.N(629852750, new hi1(ei1Var3, rs0Var, i10), nv0Var);
                        if (rs0Var5 == null) {
                            nv0Var.a0(-510713870);
                            nv0Var.p(false);
                            d00Var = null;
                        } else {
                            nv0Var.a0(-510713869);
                            d00 d00VarN2 = gq.N(-1291211644, new hi1(ei1Var3, rs0Var5, 2), nv0Var);
                            nv0Var.p(false);
                            d00Var = d00VarN2;
                        }
                        nv0Var.a0(-510395686);
                        nv0Var.p(false);
                        if (rs0Var3 == null) {
                            nv0Var.a0(-510083888);
                            nv0Var.p(false);
                            d00Var2 = null;
                        } else {
                            nv0Var.a0(-510083887);
                            d00 d00VarN3 = gq.N(449548451, new hi1(ei1Var3, rs0Var3, i11), nv0Var);
                            nv0Var.p(false);
                            d00Var2 = d00VarN3;
                        }
                        if (rs0Var8 == null) {
                            nv0Var.a0(-509666659);
                            nv0Var.p(false);
                            d00Var3 = null;
                        } else {
                            nv0Var.a0(-509666658);
                            d00 d00VarN4 = gq.N(1946411067, new hi1(ei1Var3, rs0Var8, 3), nv0Var);
                            nv0Var.p(false);
                            d00Var3 = d00VarN4;
                        }
                        Object objO = nv0Var.O();
                        if (objO == c20.a) {
                            objO = new fi1(i10);
                            nv0Var.j0(objO);
                        }
                        hb3.a(su2.a(yp1Var, true, (ns0) objO).d(bq1Var2), g23.a(f80.f0, nv0Var), ei1Var3.a, ei1Var3.b, 0.0f, 0.0f, null, gq.N(1192488737, new jb0(d00Var2, d00Var3, d00VarN, obj, d00Var, 1), nv0Var), nv0Var, 12804096, 64);
                        rs0Var7 = rs0Var8;
                        ei1Var2 = ei1Var3;
                    }
                    xj2VarT = nv0Var.t();
                    if (xj2VarT == null) {
                        xj2VarT.d = new as(rs0Var, bq1Var2, rs0Var5, rs0Var3, rs0Var7, ei1Var2, i, i2);
                        return;
                    }
                    return;
                }
                ei1VarB = ei1Var;
                i5 = i7 | i9 | 113246208;
                int i102 = 0;
                int i112 = 1;
                if (nv0Var.R(i5 & 1, (38347923 & i5) == 38347922)) {
                }
                xj2VarT = nv0Var.t();
                if (xj2VarT == null) {
                }
            }
            rs0Var6 = rs0Var4;
            if ((i2 & 64) == 0) {
            }
            i5 = i7 | i9 | 113246208;
            int i1022 = 0;
            int i1122 = 1;
            if (nv0Var.R(i5 & 1, (38347923 & i5) == 38347922)) {
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT == null) {
            }
        }
        rs0Var5 = rs0Var2;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        rs0Var6 = rs0Var4;
        if ((i2 & 64) == 0) {
        }
        i5 = i7 | i9 | 113246208;
        int i10222 = 0;
        int i11222 = 1;
        if (nv0Var.R(i5 & 1, (38347923 & i5) == 38347922)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT == null) {
        }
    }

    public static final void h(rs0 rs0Var, rs0 rs0Var2, d00 d00Var, rs0 rs0Var3, rs0 rs0Var4, nv0 nv0Var, int i) {
        nv0Var.b0(-61277522);
        int i2 = i | (nv0Var.h(rs0Var) ? 4 : 2) | (nv0Var.h(rs0Var2) ? 32 : 16) | (nv0Var.h(rs0Var3) ? 2048 : 1024) | (nv0Var.h(rs0Var4) ? 16384 : 8192);
        if (nv0Var.R(i2 & 1, (i2 & 9363) != 9362)) {
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = new mi1();
                nv0Var.j0(objO);
            }
            mi1 mi1Var = (mi1) objO;
            d00 d00VarV = v(vr.L(d00Var, rs0Var3 == null ? m00.a : rs0Var3, rs0Var4 == null ? m00.b : rs0Var4, rs0Var == null ? m00.c : rs0Var, rs0Var2 == null ? m00.d : rs0Var2));
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar) {
                objO2 = new ar1(mi1Var);
                nv0Var.j0(objO2);
            }
            cn1 cn1Var = (cn1) objO2;
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, yp1.a);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1Var);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            nc2.p(0, d00VarV, nv0Var, true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new r81(rs0Var, rs0Var2, d00Var, rs0Var3, rs0Var4, i, 2);
        }
    }

    public static final void i(qt1 qt1Var, dq2 dq2Var, d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(233973821);
        if ((((nv0Var.h(qt1Var) ? 4 : 2) | i | (nv0Var.h(dq2Var) ? 32 : 16)) & 147) == 146 && nv0Var.D()) {
            nv0Var.U();
        } else {
            vr.d(new he2[]{oj1.a.a(qt1Var), ij1.a.a(qt1Var), nj1.a.a(qt1Var)}, gq.N(1808964477, new z4(5, dq2Var, d00Var), nv0Var), nv0Var, 56);
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w1((Object) qt1Var, (Object) dq2Var, (Object) d00Var, i, 8);
        }
    }

    public static final void j(final cs0 cs0Var, final long j, final wp1 wp1Var, ed edVar, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        long j2;
        wp1 wp1Var2;
        int i3;
        bb1 bb1Var;
        int i4;
        boolean z;
        boolean z2;
        Object obj;
        nv0Var.b0(766784632);
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(cs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= nv0Var.e(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            wp1Var2 = wp1Var;
            i2 |= nv0Var.f(wp1Var2) ? 256 : 128;
        } else {
            wp1Var2 = wp1Var;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? nv0Var.f(edVar) : nv0Var.h(edVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.h(d00Var) ? 16384 : 8192;
        }
        if (nv0Var.R(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) nv0Var.j(x7.f);
            ua0 ua0Var = (ua0) nv0Var.j(s20.h);
            bb1 bb1Var2 = (bb1) nv0Var.j(s20.n);
            lv0 lv0VarW = lq.W(nv0Var);
            os1 os1VarZ = b32.z(d00Var, nv0Var);
            Object[] objArr = new Object[0];
            Object objO = nv0Var.O();
            Object obj2 = c20.a;
            if (objO == obj2) {
                i3 = i2;
                objO = new x91(22);
                nv0Var.j0(objO);
            } else {
                i3 = i2;
            }
            UUID uuid = (UUID) oz2.G(objArr, (cs0) objO, nv0Var);
            Object objO2 = nv0Var.O();
            if (objO2 == obj2) {
                objO2 = rn.A(nv0Var);
                nv0Var.j0(objO2);
            }
            x50 x50Var = (x50) objO2;
            boolean zF = nv0Var.f(view) | nv0Var.f(ua0Var);
            Object objO3 = nv0Var.O();
            if (zF || objO3 == obj2) {
                bb1Var = bb1Var2;
                i4 = i3;
                z = true;
                z2 = false;
                jp1 jp1Var = new jp1(cs0Var, wp1Var2, j2, view, bb1Var, ua0Var, uuid, edVar, x50Var);
                d00 d00Var2 = new d00(-1051373467, new e90(6, os1VarZ), true);
                gp1 gp1Var = jp1Var.n;
                gp1Var.setParentCompositionContext(lv0VarW);
                gp1Var.o.setValue(d00Var2);
                gp1Var.p = true;
                gp1Var.d();
                nv0Var.j0(jp1Var);
                obj = jp1Var;
            } else {
                bb1Var = bb1Var2;
                i4 = i3;
                z = true;
                z2 = false;
                obj = objO3;
            }
            final jp1 jp1Var2 = (jp1) obj;
            boolean zH = nv0Var.h(jp1Var2);
            Object objO4 = nv0Var.O();
            if (zH || objO4 == obj2) {
                objO4 = new xc1(8, jp1Var2);
                nv0Var.j0(objO4);
            }
            rn.g(jp1Var2, (ns0) objO4, nv0Var);
            int i5 = i4;
            boolean zH2 = nv0Var.h(jp1Var2) | ((i5 & 14) == 4 ? z : z2) | ((i5 & 896) == 256 ? z : z2) | ((i5 & 112) == 32 ? z : z2) | nv0Var.d(bb1Var.ordinal());
            Object objO5 = nv0Var.O();
            if (zH2 || objO5 == obj2) {
                final bb1 bb1Var3 = bb1Var;
                objO5 = new cs0() { // from class: xp1
                    @Override // defpackage.cs0
                    public final Object a() {
                        jp1Var2.d(cs0Var, wp1Var, j, bb1Var3);
                        return dm3.a;
                    }
                };
                nv0Var.j0(objO5);
            }
            rn.t((cs0) objO5, nv0Var);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new qh1(cs0Var, j, wp1Var, edVar, d00Var, i);
        }
    }

    public static final void k(long j, pl3 pl3Var, rs0 rs0Var, nv0 nv0Var, int i) {
        long j2;
        nv0 nv0Var2;
        rs0 rs0Var2;
        nv0Var.b0(-285397024);
        int i2 = (nv0Var.e(j) ? 4 : 2) | i | (nv0Var.h(rs0Var) ? 256 : 128);
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            j2 = j;
            nv0Var2 = nv0Var;
            jo3.b(j2, ql3.a(pl3Var, nv0Var), rs0Var, nv0Var2, i2 & 910);
            rs0Var2 = rs0Var;
        } else {
            j2 = j;
            nv0Var2 = nv0Var;
            rs0Var2 = rs0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new g8(j2, pl3Var, rs0Var2, i);
        }
    }

    public static final void l(dq2 dq2Var, d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(832919318);
        int i2 = (nv0Var.h(dq2Var) ? 4 : 2) | i | (nv0Var.h(d00Var) ? 32 : 16);
        if ((i2 & 19) == 18 && nv0Var.D()) {
            nv0Var.U();
        } else {
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = new fi1(13);
                nv0Var.j0(objO);
            }
            ns0 ns0Var = (ns0) objO;
            cr3 cr3VarA = oj1.a(nv0Var);
            if (cr3VarA == null) {
                c.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            lu luVarA = rk2.a(bl.class);
            j21 j21Var = new j21(0);
            j21Var.a(rk2.a(bl.class), ns0Var);
            bl blVar = (bl) g12.h0(luVarA, cr3VarA, j21Var.b(), cr3VarA instanceof rx0 ? ((rx0) cr3VarA).getDefaultViewModelCreationExtras() : d60.b, nv0Var);
            blVar.d = new vr3(dq2Var);
            dq2Var.e(blVar.c, d00Var, nv0Var, ((i2 << 6) & 896) | (i2 & 112));
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i, 26, dq2Var, d00Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m(float f2, float f3, float f4, float f5, iy iyVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (iyVar.c()) {
            long j = ((long) ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f)))) << 32;
            int i10 = wx.h;
            return j;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = iFloatToRawIntBits & 8388607;
        int i14 = 49;
        int i15 = 0;
        if (i12 == 255) {
            i2 = i13 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i12 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i16 = i13 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i16) + 1) | (i11 << 15);
                    short s = (short) i3;
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    int i17 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i18 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i18 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i19 = i18 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i19) + 1) | (i17 << 15);
                                short s2 = (short) i7;
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(f4);
                                int i20 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i21 = 8388607 & iFloatToRawIntBits3;
                                if (i8 != 255) {
                                    int i22 = i8 - 112;
                                    if (i22 < 31) {
                                        if (i22 > 0) {
                                            i15 = i21 >> 13;
                                            if ((iFloatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i22 << 10) | i15) + 1) | (i20 << 15);
                                            } else {
                                                i14 = i22;
                                            }
                                        } else if (i22 >= -10) {
                                            int i23 = (i21 | 8388608) >> (1 - i22);
                                            if ((i23 & 4096) != 0) {
                                                i23 += 8192;
                                            }
                                            i14 = 0;
                                            i15 = i23 >> 13;
                                        } else {
                                            i14 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) iyVar.c) & 63);
                                    int i24 = wx.h;
                                    return jMax;
                                }
                                i15 = i21 == 0 ? 0 : 512;
                                i14 = 31;
                                i9 = (i20 << 15) | (i14 << 10) | i15;
                                long jMax2 = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) iyVar.c) & 63);
                                int i242 = wx.h;
                                return jMax2;
                            }
                            i6 = i19;
                        } else if (i5 >= -10) {
                            int i25 = (i18 | 8388608) >> (1 - i5);
                            if ((i25 & 4096) != 0) {
                                i25 += 8192;
                            }
                            i6 = i25 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i17 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(f4);
                    int i202 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i212 = 8388607 & iFloatToRawIntBits32;
                    if (i8 != 255) {
                    }
                    i9 = (i202 << 15) | (i14 << 10) | i15;
                    long jMax22 = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) iyVar.c) & 63);
                    int i2422 = wx.h;
                    return jMax22;
                }
                i2 = i16;
            } else if (i >= -10) {
                int i26 = (i13 | 8388608) >> (1 - i);
                if ((i26 & 4096) != 0) {
                    i26 += 8192;
                }
                i2 = i26 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i11 << 15) | (i << 10);
        short s3 = (short) i3;
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(f3);
        int i172 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i182 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i172 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(f4);
        int i2022 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2122 = 8388607 & iFloatToRawIntBits322;
        if (i8 != 255) {
        }
        i9 = (i2022 << 15) | (i14 << 10) | i15;
        long jMax222 = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s3) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) iyVar.c) & 63);
        int i24222 = wx.h;
        return jMax222;
    }

    public static final long n(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : y02.i(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final int o(k51 k51Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int iMax = Math.max(Math.max(m30.j(j), k51Var.p0(i6 == 1 ? f80.p0 : i6 == 2 ? f80.w0 : f80.t0)), Math.max(i, Math.max(i3 + i4 + i5, i2)) + i7);
        int iH = m30.h(j);
        return iMax > iH ? iH : iMax;
    }

    public static IOException p(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static final void q(vq3 vq3Var, tq2 tq2Var, gf1 gf1Var) {
        tq2Var.getClass();
        gf1Var.getClass();
        mq2 mq2Var = (mq2) vq3Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (mq2Var == null || mq2Var.h) {
            return;
        }
        mq2Var.h(gf1Var, tq2Var);
        ff1 ff1Var = ((rf1) gf1Var).i;
        if (ff1Var == ff1.g || ff1Var.compareTo(ff1.i) >= 0) {
            tq2Var.d();
        } else {
            gf1Var.a(new c90(gf1Var, tq2Var));
        }
    }

    public static IOException r(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? p(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? p(file, iOException) : p(file, iOException) : parentFile.canWrite() ? p(file, iOException) : p(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? p(file, iOException) : p(file, iOException) : parentFile.canWrite() ? p(file, iOException) : p(file, iOException) : p(file, iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(rb3 rb3Var, ab2 ab2Var, ml mlVar) {
        ar0 ar0Var;
        y50 y50Var;
        int size;
        int i;
        if (mlVar instanceof ar0) {
            ar0Var = (ar0) mlVar;
            int i2 = ar0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ar0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                ar0Var = new ar0(mlVar);
            }
        }
        Object objC = ar0Var.k;
        int i3 = ar0Var.l;
        if (i3 == 0) {
            y02.Q(objC);
            List list = rb3Var.k.y.a;
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                if (((gb2) list.get(i4)).d) {
                    ar0Var.i = rb3Var;
                    ar0Var.j = ab2Var;
                    ar0Var.l = 1;
                    objC = rb3Var.c(ab2Var, ar0Var);
                    y50Var = y50.f;
                    if (objC == y50Var) {
                    }
                    List list2 = ((za2) objC).a;
                    size = list2.size();
                    i = 0;
                    while (i < size) {
                    }
                    return dm3.a;
                }
            }
            return dm3.a;
        }
        if (i3 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ab2 ab2Var2 = ar0Var.j;
        rb3 rb3Var2 = ar0Var.i;
        y02.Q(objC);
        ab2Var = ab2Var2;
        rb3Var = rb3Var2;
        List list22 = ((za2) objC).a;
        size = list22.size();
        i = 0;
        while (i < size) {
            if (((gb2) list22.get(i)).d) {
                ar0Var.i = rb3Var;
                ar0Var.j = ab2Var;
                ar0Var.l = 1;
                objC = rb3Var.c(ab2Var, ar0Var);
                y50Var = y50.f;
                if (objC == y50Var) {
                    return y50Var;
                }
                List list222 = ((za2) objC).a;
                size = list222.size();
                i = 0;
                while (i < size) {
                }
            } else {
                i++;
            }
        }
        return dm3.a;
    }

    public static final Object t(kb2 kb2Var, rs0 rs0Var, p40 p40Var) {
        Object objP1 = ((sb3) kb2Var).p1(new br0(p40Var.i(), rs0Var, null, 0), p40Var);
        return objP1 == y50.f ? objP1 : dm3.a;
    }

    public static final Bundle u(r32... r32VarArr) {
        Bundle bundle = new Bundle(r32VarArr.length);
        for (r32 r32Var : r32VarArr) {
            String str = (String) r32Var.f;
            Object obj = r32Var.g;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        c.p(by1.i("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    c.p(by1.i("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final d00 v(List list) {
        return new d00(1271844412, new hb1(0, list), true);
    }

    public static final int w(long j, long j2) {
        boolean zL = L(j);
        if (zL != L(j2)) {
            return zL ? -1 : 1;
        }
        return (Math.min(E(j), E(j2)) >= 0.0f && K(j) != K(j2)) ? K(j) ? -1 : 1 : (int) Math.signum(E(j) - E(j2));
    }

    public static final long x(long j, long j2) {
        float f2;
        float f3;
        long jA = wx.a(j, wx.f(j2));
        float fD = wx.d(j2);
        float fD2 = wx.d(jA);
        float f4 = 1.0f - fD2;
        float f5 = (fD * f4) + fD2;
        float fH = wx.h(jA);
        float fH2 = wx.h(j2);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fH2 * fD) * f4) + (fH * fD2)) / f5;
        }
        float fG = wx.g(jA);
        float fG2 = wx.g(j2);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((fG2 * fD) * f4) + (fG * fD2)) / f5;
        }
        float fE = wx.e(jA);
        float fE2 = wx.e(j2);
        if (f5 != 0.0f) {
            f6 = (((fE2 * fD) * f4) + (fE * fD2)) / f5;
        }
        return m(f2, f3, f6, f5, wx.f(j2));
    }

    public static os1 y() {
        return new d42(dm3.a, f5.f0);
    }

    public static Handler z(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return bc0.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public abstract h9 G();

    public Object H(int i) {
        Object objH;
        h51 h51VarD = G().d(i);
        int i2 = i - h51VarD.a;
        ns0 key = h51VarD.c.getKey();
        return (key == null || (objH = key.h(Integer.valueOf(i2))) == null) ? new y80(i) : objH;
    }
}
