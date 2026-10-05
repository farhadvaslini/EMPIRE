package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tp2 {
    public static final uk2 a = new uk2("\\{([0-9A-Fa-f]{6})\\}");
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;

    static {
        Pattern.compile("0x([0-9A-Fa-f]{6})([0-9A-Fa-f]{2})?").getClass();
        b = vp.c(3424262682L);
        c = vp.c(3437816040L);
        d = vp.c(4279702812L);
        e = vp.c(4294243572L);
    }

    public static long a(long j, long j2) {
        float fD = wx.d(j);
        float fD2 = wx.d(j2);
        float f = 1.0f - fD;
        float f2 = (f * fD2) + fD;
        if (f2 <= 0.0f) {
            return wx.f;
        }
        float fH = wx.h(j);
        float fH2 = (((wx.h(j2) * fD2) * f) + (fH * fD)) / f2;
        float fG = wx.g(j);
        float fG2 = wx.g(j2) * fD2 * f;
        float fE = wx.e(j);
        return vp.a(fH2, (fG2 + (fG * fD)) / f2, (((wx.e(j2) * fD2) * f) + (fE * fD)) / f2, f2, ky.e);
    }

    public static float b(long j, long j2, long j3) {
        long jA = a(j2, j3);
        float fE = e(a(j, jA));
        float fE2 = e(jA);
        return (Math.max(fE, fE2) + 0.05f) / (Math.min(fE, fE2) + 0.05f);
    }

    public static ArrayList c(long j, String str) {
        ArrayList arrayList = new ArrayList();
        uk2 uk2Var = a;
        uk2Var.getClass();
        if (str.length() < 0) {
            throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
        }
        yv0 yv0Var = new yv0(new bm0(1, new me1(11, uk2Var, str), tk2.m));
        int i = 0;
        while (yv0Var.hasNext()) {
            sm1 sm1Var = (sm1) yv0Var.next();
            if (sm1Var.b().f > i) {
                arrayList.add(new sp2(j, str.substring(i, sm1Var.b().f)));
            }
            String str2 = (String) ((qm1) sm1Var.a()).get(1);
            if (str2.length() == 6) {
                try {
                    String strSubstring = str2.substring(0, 2);
                    ur.r(16);
                    String strSubstring2 = str2.substring(2, 4);
                    ur.r(16);
                    String strSubstring3 = str2.substring(4, 6);
                    ur.r(16);
                    j = vp.a(Integer.parseInt(strSubstring, 16) / 255.0f, Integer.parseInt(strSubstring2, 16) / 255.0f, Integer.parseInt(strSubstring3, 16) / 255.0f, 1.0f, ky.e);
                } catch (NumberFormatException unused) {
                }
            }
            i = sm1Var.b().g + 1;
        }
        if (i < str.length()) {
            arrayList.add(new sp2(j, str.substring(i)));
        }
        return arrayList;
    }

    public static String d(String str) {
        str.getClass();
        uk2 uk2Var = a;
        uk2Var.getClass();
        String strReplaceAll = uk2Var.f.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public static float e(long j) {
        return (f(wx.e(j)) * 0.0722f) + (f(wx.g(j)) * 0.7152f) + (f(wx.h(j)) * 0.2126f);
    }

    public static final float f(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static long g(long j, long j2) {
        long j3;
        long j4;
        Object next;
        float fE = e(j);
        long j5 = c;
        long j6 = b;
        List listL = vr.L(new wx(fE > 0.5f ? j6 : j5), new wx(j6), new wx(j5));
        Iterator it = listL.iterator();
        while (true) {
            if (!it.hasNext()) {
                j3 = j;
                j4 = j2;
                next = null;
                break;
            }
            next = it.next();
            long j7 = j;
            long j8 = j2;
            j3 = j7;
            j4 = j8;
            if (b(j7, ((wx) next).a, j8) >= 4.5f) {
                break;
            }
            j = j3;
            j2 = j4;
        }
        wx wxVar = (wx) next;
        if (wxVar != null) {
            return wxVar.a;
        }
        Iterator it2 = listL.iterator();
        if (!it2.hasNext()) {
            c.n();
            return 0L;
        }
        Object next2 = it2.next();
        if (it2.hasNext()) {
            float fB = b(j3, ((wx) next2).a, j4);
            do {
                Object next3 = it2.next();
                float fB2 = b(j3, ((wx) next3).a, j4);
                if (Float.compare(fB, fB2) < 0) {
                    next2 = next3;
                    fB = fB2;
                }
            } while (it2.hasNext());
        }
        return ((wx) next2).a;
    }
}
