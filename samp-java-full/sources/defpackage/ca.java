package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ca implements v32 {
    public final String a;
    public final gh3 b;
    public final List c;
    public final List d;
    public final zp0 e;
    public final ua0 f;
    public final bc g;
    public final CharSequence h;
    public final gb1 i;
    public pi j;
    public final boolean k;
    public final int l;
    public final int m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x080a  */
    /* JADX WARN: Type inference failed for: r0v0, types: [ca, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ca(String str, gh3 gh3Var, List list, List list2, zp0 zp0Var, ua0 ua0Var, boolean z) {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        ba baVar;
        dg3 dg3Var;
        Typeface typeface;
        CharSequence charSequence;
        int i2;
        int i3;
        fg3 fg3Var;
        ba baVar2;
        ArrayList arrayList;
        h83 h83Var;
        int i4;
        ca caVar;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        w62 w62Var;
        CharSequence charSequence2;
        w62 w62Var2;
        ?? obj2 = new Object();
        obj2.a = str;
        obj2.b = gh3Var;
        obj2.c = list;
        obj2.d = list2;
        obj2.e = zp0Var;
        obj2.f = ua0Var;
        float fH = ua0Var.h();
        bc bcVar = new bc(1);
        ((TextPaint) bcVar).density = fH;
        bcVar.b = ne3.b;
        bcVar.c = 3;
        bcVar.d = r13.d;
        obj2.g = bcVar;
        boolean zJ = oz2.j(gh3Var);
        h83 h83Var2 = gh3Var.a;
        x32 x32Var = gh3Var.b;
        int i10 = 0;
        if (zJ) {
            yl1 yl1Var = rh0.a;
            yl1 yl1Var2 = rh0.a;
            e93 e93VarB = (e93) yl1Var2.g;
            if (e93VarB == null) {
                if (nh0.d()) {
                    e93VarB = yl1Var2.B();
                    yl1Var2.g = e93VarB;
                } else {
                    e93VarB = f80.c0;
                }
            }
            zBooleanValue = ((Boolean) e93VarB.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        obj2.k = zBooleanValue;
        int i11 = x32Var.b;
        qj1 qj1Var = h83Var2.k;
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 == 1) {
                    i = 0;
                } else if (i11 == 2) {
                    i = 1;
                } else {
                    if (i11 != 3 && i11 != 0) {
                        c.q("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((qj1Var == null || (locale = ((pj1) qj1Var.f.get(0)).a) == null) ? Locale.getDefault() : locale);
                    i = (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
                }
            }
        }
        obj2.l = i;
        obj2.m = -1;
        ba baVar3 = new ba(i10, obj2);
        wg3 wg3Var = x32Var.i;
        wg3Var = wg3Var == null ? wg3.c : wg3Var;
        bcVar.setFlags(wg3Var.b ? bcVar.getFlags() | 128 : bcVar.getFlags() & (-129));
        int i12 = wg3Var.a;
        if (i12 == 1) {
            bcVar.setFlags(bcVar.getFlags() | 64);
            bcVar.setHinting(0);
        } else if (i12 == 2) {
            bcVar.getFlags();
            bcVar.setHinting(1);
        } else if (i12 == 3) {
            bcVar.getFlags();
            bcVar.setHinting(0);
        } else {
            bcVar.getFlags();
        }
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (((ze) obj).a instanceof h83) {
                break;
            } else {
                i13++;
            }
        }
        boolean z3 = obj != null;
        long j = h83Var2.b;
        xq0 xq0Var = h83Var2.c;
        vq0 vq0Var = h83Var2.d;
        String str2 = h83Var2.g;
        qj1 qj1Var2 = h83Var2.k;
        dg3 dg3Var2 = h83Var2.a;
        eg3 eg3Var = h83Var2.j;
        long j2 = h83Var2.h;
        long jB = jh3.b(j);
        boolean z4 = z3;
        if (kh3.a(jB, 4294967296L)) {
            bcVar.setTextSize(ua0Var.H0(j));
        } else if (kh3.a(jB, 8589934592L)) {
            bcVar.setTextSize(jh3.c(j) * bcVar.getTextSize());
        }
        zb3 zb3Var = h83Var2.f;
        if (zb3Var == null && vq0Var == null && xq0Var == null) {
            baVar = baVar3;
            dg3Var = dg3Var2;
        } else {
            xq0 xq0Var2 = xq0Var == null ? xq0.h : xq0Var;
            int i14 = vq0Var != null ? vq0Var.a : 0;
            wq0 wq0Var = h83Var2.e;
            int i15 = wq0Var != null ? wq0Var.a : 65535;
            baVar = baVar3;
            ca caVar2 = (ca) baVar.g;
            dg3Var = dg3Var2;
            ml3 ml3VarB = ((aq0) caVar2.e).b(zb3Var, xq0Var2, i14, i15);
            if (ml3VarB instanceof ml3) {
                Object obj3 = ml3VarB.f;
                obj3.getClass();
                typeface = (Typeface) obj3;
            } else {
                pi piVar = new pi(ml3VarB, caVar2.j);
                caVar2.j = piVar;
                Object obj4 = piVar.i;
                obj4.getClass();
                typeface = (Typeface) obj4;
            }
            bcVar.setTypeface(typeface);
        }
        if (qj1Var2 != null) {
            qj1 qj1Var3 = qj1.h;
            if (!qj1Var2.equals(p62.a.n())) {
                ArrayList arrayList2 = new ArrayList(rx.d0(qj1Var2, 10));
                Iterator it = qj1Var2.f.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((pj1) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList2.toArray(new Locale[0]);
                bcVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            bcVar.setFontFeatureSettings(str2);
        }
        if (eg3Var != null && !eg3Var.equals(eg3.c)) {
            bcVar.setTextScaleX(bcVar.getTextScaleX() * eg3Var.a);
            bcVar.setTextSkewX(bcVar.getTextSkewX() + eg3Var.b);
        }
        bcVar.d(dg3Var.a());
        bcVar.c(dg3Var.b(), 9205357640488583168L, dg3Var.t());
        bcVar.f(h83Var2.n);
        bcVar.g(h83Var2.m);
        bcVar.e(h83Var2.p);
        if (kh3.a(jh3.b(j2), 4294967296L) && jh3.c(j2) != 0.0f) {
            float textScaleX = bcVar.getTextScaleX() * bcVar.getTextSize();
            float fH0 = ua0Var.H0(j2);
            if (textScaleX != 0.0f) {
                bcVar.setLetterSpacing(fH0 / textScaleX);
            }
        } else if (kh3.a(jh3.b(j2), 8589934592L)) {
            bcVar.setLetterSpacing(jh3.c(j2));
        }
        long j3 = h83Var2.l;
        nl nlVar = h83Var2.i;
        boolean z5 = z4 && kh3.a(jh3.b(j2), 4294967296L) && jh3.c(j2) != 0.0f;
        long j4 = wx.g;
        boolean z6 = (wx.c(j3, j4) || wx.c(j3, wx.f)) ? false : true;
        boolean z7 = (nlVar == null || Float.compare(nlVar.a, 0.0f) == 0) ? false : true;
        h83 h83Var3 = (z5 || z6 || z7) ? new h83(0L, 0L, (xq0) null, (vq0) null, (wq0) null, (zb3) null, (String) null, z5 ? j2 : jh3.c, z7 ? nlVar : null, (eg3) null, (qj1) null, z6 ? j3 : j4, (ne3) null, (r13) null, 63103) : null;
        List list3 = obj2.c;
        if (h83Var3 != null) {
            int size2 = list3.size() + 1;
            ArrayList arrayList3 = new ArrayList(size2);
            int i16 = 0;
            while (i16 < size2) {
                arrayList3.add(i16 == 0 ? new ze(0, obj2.a.length(), h83Var3) : (ze) obj2.c.get(i16 - 1));
                i16++;
            }
            list3 = arrayList3;
        }
        String str3 = obj2.a;
        float textSize = obj2.g.getTextSize();
        gh3 gh3Var2 = obj2.b;
        List list4 = obj2.d;
        ua0 ua0Var2 = obj2.f;
        boolean z8 = obj2.k;
        String str4 = obj2.a;
        if (obj2.m == -1) {
            obj2.m = (str4.length() > 512 || y93.i0(str4, '\n')) ? 1 : 0;
        }
        z9 z9Var = aa.a;
        if (z8 && nh0.d()) {
            k72 k72Var = gh3Var2.c;
            ci0 ci0Var = (k72Var == null || (w62Var2 = k72Var.b) == null) ? null : new ci0(w62Var2.b);
            CharSequence charSequenceG = nh0.a().g(0, str3.length(), (ci0Var != null && ci0Var.a == 2) ? 1 : 0, str3);
            charSequenceG.getClass();
            charSequence = charSequenceG;
        } else {
            charSequence = str3;
        }
        if (list3.isEmpty() && list4.isEmpty() && s51.n(gh3Var2.b.d, fg3.c)) {
            caVar = obj2;
            charSequence2 = charSequence;
            if ((gh3Var2.b.c & 1095216660480L) != 0) {
            }
        } else {
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            h83 h83Var4 = gh3Var2.a;
            x32 x32Var2 = gh3Var2.b;
            if (s51.n(h83Var4.m, ne3.c)) {
                spannableString.setSpan(aa.a, 0, str3.length(), 33);
            }
            k72 k72Var2 = gh3Var2.c;
            if (((k72Var2 == null || (w62Var = k72Var2.b) == null) ? false : w62Var.a) && x32Var2.f == null) {
                float fE = y02.E(x32Var2.c, textSize, ua0Var2);
                if (!Float.isNaN(fE)) {
                    spannableString.setSpan(new ag1(fE), 0, spannableString.length(), 33);
                }
                i2 = 16;
            } else {
                eg1 eg1Var = x32Var2.f;
                eg1Var = eg1Var == null ? eg1.d : eg1Var;
                i2 = 16;
                float fE2 = y02.E(x32Var2.c, textSize, ua0Var2);
                if (!Float.isNaN(fE2)) {
                    if (spannableString.length() != 0) {
                        if (spannableString.length() == 0) {
                            c.m("Char sequence is empty.");
                            throw null;
                        }
                        int length = spannableString.charAt(spannableString.length() + (-1)) == '\n' ? spannableString.length() + 1 : spannableString.length();
                        int i17 = length;
                        int i18 = eg1Var.b;
                        i3 = 0;
                        spannableString.setSpan(new fg1(fE2, i17, (i18 & 1) > 0, (i18 & 16) > 0, eg1Var.a, eg1Var.c), 0, spannableString.length(), 33);
                    }
                }
                fg3Var = x32Var2.d;
                if (fg3Var == null) {
                    long j5 = fg3Var.a;
                    long j6 = fg3Var.b;
                    int i19 = i3;
                    if ((jh3.a(j5, oz2.w(i19)) && jh3.a(j6, oz2.w(i19))) || (j5 & 1095216660480L) == 0 || (j6 & 1095216660480L) == 0) {
                        baVar2 = baVar;
                    } else {
                        long jB2 = jh3.b(j5);
                        baVar2 = baVar;
                        float fH02 = kh3.a(jB2, 4294967296L) ? ua0Var2.H0(j5) : kh3.a(jB2, 8589934592L) ? jh3.c(j5) * textSize : 0.0f;
                        long jB3 = jh3.b(j6);
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fH02), (int) Math.ceil(kh3.a(jB3, 4294967296L) ? ua0Var2.H0(j6) : kh3.a(jB3, 8589934592L) ? jh3.c(j6) * textSize : 0.0f)), 0, spannableString.length(), 33);
                    }
                    ArrayList arrayList4 = new ArrayList(list3.size());
                    int size3 = list3.size();
                    for (int i20 = 0; i20 < size3; i20++) {
                        ze zeVar = (ze) list3.get(i20);
                        Object obj5 = zeVar.a;
                        if (obj5 instanceof h83) {
                            h83 h83Var5 = (h83) obj5;
                            if (h83Var5.f != null || h83Var5.d != null || h83Var5.c != null || ((h83) obj5).e != null) {
                                arrayList4.add(zeVar);
                            }
                        }
                    }
                    zb3 zb3Var2 = h83Var4.f;
                    h83 h83Var6 = (zb3Var2 == null && h83Var4.d == null && h83Var4.c == null && h83Var4.e == null) ? null : new h83(0L, 0L, h83Var4.c, h83Var4.d, h83Var4.e, zb3Var2, (String) null, 0L, (nl) null, (eg3) null, (qj1) null, 0L, (ne3) null, (r13) null, 65475);
                    w91 w91Var = new w91(i2, spannableString, baVar2);
                    if (arrayList4.size() > 1) {
                        int size4 = arrayList4.size();
                        int i21 = size4 * 2;
                        int[] iArr = new int[i21];
                        int size5 = arrayList4.size();
                        for (int i22 = 0; i22 < size5; i22++) {
                            ze zeVar2 = (ze) arrayList4.get(i22);
                            iArr[i22] = zeVar2.b;
                            iArr[i22 + size4] = zeVar2.c;
                        }
                        if (i21 > 1) {
                            Arrays.sort(iArr);
                        }
                        if (i21 == 0) {
                            c.m("Array is empty.");
                            throw null;
                        }
                        int i23 = iArr[0];
                        int i24 = 0;
                        while (i24 < i21) {
                            int i25 = iArr[i24];
                            if (i25 == i23) {
                                arrayList = arrayList4;
                                h83Var = h83Var6;
                                i4 = i24;
                            } else {
                                int size6 = arrayList4.size();
                                h83 h83VarC = h83Var6;
                                int i26 = 0;
                                while (i26 < size6) {
                                    ArrayList arrayList5 = arrayList4;
                                    ze zeVar3 = (ze) arrayList4.get(i26);
                                    h83 h83Var7 = h83Var6;
                                    int i27 = zeVar3.b;
                                    int i28 = i24;
                                    int i29 = zeVar3.c;
                                    if (i27 != i29 && bf.b(i23, i25, i27, i29)) {
                                        h83 h83Var8 = (h83) zeVar3.a;
                                        h83VarC = h83VarC != null ? h83VarC.c(h83Var8) : h83Var8;
                                    }
                                    i26++;
                                    arrayList4 = arrayList5;
                                    h83Var6 = h83Var7;
                                    i24 = i28;
                                }
                                arrayList = arrayList4;
                                h83Var = h83Var6;
                                i4 = i24;
                                if (h83VarC != null) {
                                    w91Var.e(h83VarC, Integer.valueOf(i23), Integer.valueOf(i25));
                                }
                                i23 = i25;
                            }
                            i24 = i4 + 1;
                            arrayList4 = arrayList;
                            h83Var6 = h83Var;
                        }
                    } else if (!arrayList4.isEmpty()) {
                        h83 h83Var9 = (h83) ((ze) arrayList4.get(0)).a;
                        w91Var.e(h83Var6 != null ? h83Var6.c(h83Var9) : h83Var9, Integer.valueOf(((ze) arrayList4.get(0)).b), Integer.valueOf(((ze) arrayList4.get(0)).c));
                    }
                    int size7 = list3.size();
                    int i30 = 0;
                    boolean z9 = false;
                    while (i30 < size7) {
                        ze zeVar4 = (ze) list3.get(i30);
                        Object obj6 = zeVar4.a;
                        if (obj6 instanceof h83) {
                            int i31 = zeVar4.b;
                            int i32 = zeVar4.c;
                            if (i31 < 0 || i31 >= spannableString.length() || i32 <= i31 || i32 > spannableString.length()) {
                                i7 = size7;
                                i8 = i30;
                                z2 = z9;
                            } else {
                                h83 h83Var10 = (h83) obj6;
                                long j7 = h83Var10.h;
                                nl nlVar2 = h83Var10.i;
                                dg3 dg3Var3 = h83Var10.a;
                                if (nlVar2 != null) {
                                    i7 = size7;
                                    spannableString.setSpan(new ol(nlVar2.a, 0), i31, i32, 33);
                                } else {
                                    i7 = size7;
                                }
                                int i33 = i30;
                                y02.G(spannableString, dg3Var3.a(), i31, i32);
                                dp dpVarB = dg3Var3.b();
                                float fT = dg3Var3.t();
                                if (dpVarB != null) {
                                    if (dpVarB instanceof w73) {
                                        y02.G(spannableString, ((w73) dpVarB).a, i31, i32);
                                    } else {
                                        spannableString.setSpan(new p13((o13) dpVarB, fT), i31, i32, 33);
                                    }
                                }
                                ne3 ne3Var = h83Var10.m;
                                if (ne3Var != null) {
                                    int i34 = ne3Var.a;
                                    oe3 oe3Var = new oe3((i34 | 1) == i34, (i34 | 2) == i34);
                                    i9 = 33;
                                    spannableString.setSpan(oe3Var, i31, i32, 33);
                                } else {
                                    i9 = 33;
                                }
                                x32 x32Var3 = x32Var2;
                                y02.I(spannableString, h83Var10.b, ua0Var2, i31, i32);
                                String str5 = h83Var10.g;
                                if (str5 != null) {
                                    spannableString.setSpan(new cq0(0, str5), i31, i32, i9);
                                }
                                eg3 eg3Var2 = h83Var10.j;
                                if (eg3Var2 != null) {
                                    spannableString.setSpan(new ScaleXSpan(eg3Var2.a), i31, i32, i9);
                                    spannableString.setSpan(new ol(eg3Var2.b, 1), i31, i32, i9);
                                }
                                y02.L(spannableString, h83Var10.k, i31, i32);
                                long j8 = h83Var10.l;
                                if (j8 != 16) {
                                    spannableString.setSpan(new BackgroundColorSpan(vp.T(j8)), i31, i32, i9);
                                }
                                r13 r13Var = h83Var10.n;
                                if (r13Var != null) {
                                    x32Var2 = x32Var3;
                                    long j9 = r13Var.b;
                                    int iT = vp.T(r13Var.a);
                                    z2 = z9;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                                    i8 = i33;
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                                    float f = r13Var.c;
                                    y13 y13Var = new y13(iT, fIntBitsToFloat, fIntBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f);
                                    i9 = 33;
                                    spannableString.setSpan(y13Var, i31, i32, 33);
                                } else {
                                    x32Var2 = x32Var3;
                                    z2 = z9;
                                    i8 = i33;
                                }
                                rf0 rf0Var = h83Var10.p;
                                if (rf0Var != null) {
                                    spannableString.setSpan(new sf0(rf0Var), i31, i32, i9);
                                }
                                z9 = (kh3.a(jh3.b(j7), 4294967296L) || kh3.a(jh3.b(j7), 8589934592L)) ? true : z9;
                            }
                            z9 = z2;
                        }
                        i30 = i8 + 1;
                        size7 = i7;
                    }
                    if (z9) {
                        int size8 = list3.size();
                        int i35 = 0;
                        while (i35 < size8) {
                            ze zeVar5 = (ze) list3.get(i35);
                            we weVar = (we) zeVar5.a;
                            if (weVar instanceof h83) {
                                int i36 = zeVar5.b;
                                int i37 = zeVar5.c;
                                if (i36 < 0 || i36 >= spannableString.length() || i37 <= i36 || i37 > spannableString.length()) {
                                    i5 = size8;
                                    i6 = i35;
                                } else {
                                    long j10 = ((h83) weVar).h;
                                    long jB4 = jh3.b(j10);
                                    i5 = size8;
                                    i6 = i35;
                                    Object bf1Var = kh3.a(jB4, 4294967296L) ? new bf1(ua0Var2.H0(j10)) : kh3.a(jB4, 8589934592L) ? new af1(jh3.c(j10)) : null;
                                    if (bf1Var != null) {
                                        spannableString.setSpan(bf1Var, i36, i37, 33);
                                    }
                                }
                            }
                            i35 = i6 + 1;
                            size8 = i5;
                        }
                    }
                    fg3 fg3Var2 = x32Var2.d;
                    if (fg3Var2 != null) {
                        long j11 = fg3Var2.a;
                        long jB5 = jh3.b(j11);
                        if (kh3.a(jB5, 4294967296L)) {
                            ua0Var2.H0(j11);
                        } else if (kh3.a(jB5, 8589934592L)) {
                            jh3.c(j11);
                        }
                    }
                    int size9 = list3.size();
                    for (int i38 = 0; i38 < size9; i38++) {
                        Object obj7 = ((ze) list3.get(i38)).a;
                    }
                    if (list4.size() > 0) {
                        ze zeVar6 = (ze) list4.get(0);
                        if (zeVar6.a != null) {
                            qn1.b();
                            throw null;
                        }
                        for (Object obj8 : spannableString.getSpans(zeVar6.b, zeVar6.c, kl3.class)) {
                            spannableString.removeSpan((kl3) obj8);
                        }
                        throw null;
                    }
                    caVar = this;
                    charSequence2 = spannableString;
                }
            }
            i3 = 0;
            fg3Var = x32Var2.d;
            if (fg3Var == null) {
            }
        }
        caVar.h = charSequence2;
        caVar.i = new gb1(charSequence2, caVar.g, caVar.l);
    }

    @Override // defpackage.v32
    public final float a() {
        gb1 gb1Var = this.i;
        float f = gb1Var.e;
        TextPaint textPaint = gb1Var.b;
        if (!Float.isNaN(f)) {
            return gb1Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = gb1Var.a;
        lineInstance.setText(new xs(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, s51.t);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new l41(i, next, 1));
            } else {
                l41 l41Var = (l41) priorityQueue.peek();
                if (l41Var != null && l41Var.g - l41Var.f < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new l41(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                c.n();
                return 0.0f;
            }
            l41 l41Var2 = (l41) it.next();
            desiredWidth = Layout.getDesiredWidth(gb1Var.b(), l41Var2.f, l41Var2.g, textPaint);
            while (it.hasNext()) {
                l41 l41Var3 = (l41) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(gb1Var.b(), l41Var3.f, l41Var3.g, textPaint));
            }
        }
        gb1Var.e = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.v32
    public final boolean b() {
        pi piVar = this.j;
        if (piVar != null ? piVar.F() : false) {
            return true;
        }
        if (!this.k && oz2.j(this.b)) {
            yl1 yl1Var = rh0.a;
            yl1 yl1Var2 = rh0.a;
            e93 e93VarB = (e93) yl1Var2.g;
            if (e93VarB == null) {
                if (nh0.d()) {
                    e93VarB = yl1Var2.B();
                    yl1Var2.g = e93VarB;
                } else {
                    e93VarB = f80.c0;
                }
            }
            if (((Boolean) e93VarB.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.v32
    public final float c() {
        return this.i.c();
    }
}
