package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.ActionMode;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class y02 implements nq3 {
    public static w01 a;
    public static w01 b;
    public static w01 c;
    public static w01 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b4 A[PHI: r14 r15
      0x02b4: PHI (r14v4 java.util.List) = (r14v3 java.util.List), (r14v5 java.util.List) binds: [B:106:0x0268, B:119:0x02b2] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r15v6 int) = (r15v5 int), (r15v7 int) binds: [B:106:0x0268, B:119:0x02b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0450  */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r42v0, types: [android.view.ViewStructure] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(android.view.ViewStructure r42, defpackage.tb1 r43, android.view.autofill.AutofillId r44, java.lang.String r45, defpackage.lk2 r46) {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y02.A(android.view.ViewStructure, tb1, android.view.autofill.AutofillId, java.lang.String, lk2):void");
    }

    public static ex B(float f, float f2) {
        return new ex(f, f2);
    }

    public static final void C(nv0 nv0Var) {
        nv0Var.b(new av2(8), dm3.a);
    }

    public static final eq2 D(nv0 nv0Var) {
        nv0Var.a0(1967007413);
        Object[] objArr = new Object[0];
        Object objO = nv0Var.O();
        if (objO == c20.a) {
            objO = new f62(9);
            nv0Var.j0(objO);
        }
        eq2 eq2Var = (eq2) oz2.H(objArr, eq2.j, (cs0) objO, nv0Var, 384);
        eq2Var.h = (gq2) nv0Var.j(iq2.a);
        nv0Var.p(false);
        return eq2Var;
    }

    public static final float E(long j, float f, ua0 ua0Var) {
        float fC;
        long jB = jh3.b(j);
        if (kh3.a(jB, 4294967296L)) {
            if (ua0Var.G() <= 1.05d) {
                return ua0Var.H0(j);
            }
            fC = jh3.c(j) / jh3.c(ua0Var.P0(f));
        } else {
            if (!kh3.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = jh3.c(j);
        }
        return fC * f;
    }

    public static final void F(rs0 rs0Var, nv0 nv0Var, Object obj) {
        if (nv0Var.S || !s51.n(nv0Var.O(), obj)) {
            nv0Var.j0(obj);
            nv0Var.b(rs0Var, obj);
        }
    }

    public static final void G(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(vp.T(j)), i, i2, 33);
        }
    }

    public static void H(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            bc0.j(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static final void I(Spannable spannable, long j, ua0 ua0Var, int i, int i2) {
        long jB = jh3.b(j);
        if (kh3.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(vm1.M(ua0Var.H0(j)), false), i, i2, 33);
        } else if (kh3.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(jh3.c(j)), i, i2, 33);
        }
    }

    public static void J(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void K(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static final void L(Spannable spannable, qj1 qj1Var, int i, int i2) {
        if (qj1Var != null) {
            ArrayList arrayList = new ArrayList(rx.d0(qj1Var, 10));
            Iterator it = qj1Var.f.iterator();
            while (it.hasNext()) {
                arrayList.add(((pj1) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final long M(jk2 jk2Var) {
        float f = jk2Var.c - jk2Var.a;
        return (((long) Float.floatToRawIntBits(jk2Var.d - jk2Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static j41 N(l41 l41Var, int i) {
        l41Var.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            qn1.i("Step must be positive, was: ", numValueOf, 46);
            return null;
        }
        int i2 = l41Var.f;
        int i3 = l41Var.g;
        if (l41Var.h <= 0) {
            i = -i;
        }
        return new j41(i2, i3, i);
    }

    public static final Double O(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        Number number = objOpt instanceof Number ? (Number) objOpt : null;
        if (number != null) {
            double dDoubleValue = number.doubleValue();
            Double dValueOf = Double.valueOf(dDoubleValue);
            if (Math.abs(dDoubleValue) <= Double.MAX_VALUE) {
                return dValueOf;
            }
        }
        return null;
    }

    public static final String P(JSONObject jSONObject, String str, boolean z) {
        Object objOpt = jSONObject.opt(str);
        String str2 = objOpt instanceof String ? (String) objOpt : null;
        if (str2 == null || ((!z && y93.q0(str2)) || str2.length() > 512)) {
            return null;
        }
        return str2;
    }

    public static final void Q(Object obj) {
        if (obj instanceof qn2) {
            throw ((qn2) obj).f;
        }
    }

    public static final void R(List list, da daVar) {
        Path path;
        int i;
        float f;
        int i2;
        e52 e52Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        da daVar2 = daVar;
        Path path2 = daVar2.a;
        Path path3 = daVar2.a;
        int i3 = path2.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        daVar2.h();
        daVar2.i(i3);
        e52 e52Var2 = list2.isEmpty() ? m42.c : (e52) list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i4 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i4 < size) {
            e52 e52Var3 = (e52) list2.get(i4);
            if (e52Var3 instanceof m42) {
                path3.close();
                path = path3;
                i = size;
                f = f11;
                i2 = i4;
                e52Var = e52Var3;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (e52Var3 instanceof y42) {
                    y42 y42Var = (y42) e52Var3;
                    float f18 = y42Var.c;
                    f14 += f18;
                    float f19 = y42Var.d;
                    f15 += f19;
                    path3.rMoveTo(f18, f19);
                    path = path3;
                    i = size;
                    f = f11;
                    i2 = i4;
                    f16 = f14;
                    f17 = f15;
                } else {
                    if (e52Var3 instanceof q42) {
                        q42 q42Var = (q42) e52Var3;
                        float f20 = q42Var.c;
                        float f21 = q42Var.d;
                        path3.moveTo(f20, f21);
                        f15 = f21;
                        f17 = f15;
                        path = path3;
                        f14 = f20;
                        f16 = f14;
                    } else {
                        if (e52Var3 instanceof x42) {
                            x42 x42Var = (x42) e52Var3;
                            float f22 = x42Var.d;
                            float f23 = x42Var.c;
                            path3.rLineTo(f23, f22);
                            f14 += f23;
                            f15 += f22;
                        } else if (e52Var3 instanceof p42) {
                            p42 p42Var = (p42) e52Var3;
                            float f24 = p42Var.d;
                            float f25 = p42Var.c;
                            daVar2.e(f25, f24);
                            f14 = f25;
                            path = path3;
                            f15 = f24;
                        } else if (e52Var3 instanceof w42) {
                            float f26 = ((w42) e52Var3).c;
                            path3.rLineTo(f26, f11);
                            f14 += f26;
                        } else if (e52Var3 instanceof o42) {
                            float f27 = ((o42) e52Var3).c;
                            daVar2.e(f27, f15);
                            f14 = f27;
                        } else if (e52Var3 instanceof c52) {
                            float f28 = ((c52) e52Var3).c;
                            path3.rLineTo(f11, f28);
                            f15 += f28;
                        } else if (e52Var3 instanceof d52) {
                            float f29 = ((d52) e52Var3).c;
                            daVar2.e(f14, f29);
                            f15 = f29;
                        } else if (e52Var3 instanceof v42) {
                            v42 v42Var = (v42) e52Var3;
                            path3.rCubicTo(v42Var.c, v42Var.d, v42Var.e, v42Var.f, v42Var.g, v42Var.h);
                            Path path4 = path3;
                            float f30 = v42Var.e + f14;
                            float f31 = v42Var.f + f15;
                            f14 += v42Var.g;
                            f15 += v42Var.h;
                            f13 = f31;
                            path = path4;
                            i = size;
                            f = f11;
                            i2 = i4;
                            e52Var = e52Var3;
                            f12 = f30;
                        } else {
                            Path path5 = path3;
                            if (e52Var3 instanceof n42) {
                                n42 n42Var = (n42) e52Var3;
                                daVar2.c(n42Var.c, n42Var.d, n42Var.e, n42Var.f, n42Var.g, n42Var.h);
                                f5 = n42Var.e;
                                f6 = n42Var.f;
                                f7 = n42Var.g;
                                f8 = n42Var.h;
                            } else {
                                if (e52Var3 instanceof a52) {
                                    if (e52Var2.a) {
                                        f9 = f14 - f12;
                                        f10 = f15 - f13;
                                    } else {
                                        f9 = f11;
                                        f10 = f9;
                                    }
                                    a52 a52Var = (a52) e52Var3;
                                    path5.rCubicTo(f9, f10, a52Var.c, a52Var.d, a52Var.e, a52Var.f);
                                    path5 = path5;
                                    float f32 = a52Var.c + f14;
                                    float f33 = a52Var.d + f15;
                                    f14 += a52Var.e;
                                    f15 += a52Var.f;
                                    f12 = f32;
                                    f13 = f33;
                                } else if (e52Var3 instanceof s42) {
                                    if (e52Var2.a) {
                                        f14 = (f14 * 2.0f) - f12;
                                        f15 = (2.0f * f15) - f13;
                                    }
                                    s42 s42Var = (s42) e52Var3;
                                    daVar.c(f14, f15, s42Var.c, s42Var.d, s42Var.e, s42Var.f);
                                    f5 = s42Var.c;
                                    f6 = s42Var.d;
                                    f7 = s42Var.e;
                                    f8 = s42Var.f;
                                } else {
                                    if (e52Var3 instanceof z42) {
                                        z42 z42Var = (z42) e52Var3;
                                        float f34 = z42Var.f;
                                        float f35 = z42Var.e;
                                        float f36 = z42Var.d;
                                        float f37 = z42Var.c;
                                        path5.rQuadTo(f37, f36, f35, f34);
                                        f5 = f37 + f14;
                                        f4 = f36 + f15;
                                        f14 += f35;
                                        f15 += f34;
                                    } else if (e52Var3 instanceof r42) {
                                        r42 r42Var = (r42) e52Var3;
                                        float f38 = r42Var.f;
                                        float f39 = r42Var.e;
                                        f4 = r42Var.d;
                                        f5 = r42Var.c;
                                        path5.quadTo(f5, f4, f39, f38);
                                        f15 = f38;
                                        f14 = f39;
                                    } else if (e52Var3 instanceof b52) {
                                        if (e52Var2.b) {
                                            f2 = f14 - f12;
                                            f3 = f15 - f13;
                                        } else {
                                            f2 = f11;
                                            f3 = f2;
                                        }
                                        b52 b52Var = (b52) e52Var3;
                                        float f40 = b52Var.d;
                                        float f41 = b52Var.c;
                                        path5.rQuadTo(f2, f3, f41, f40);
                                        float f42 = f2 + f14;
                                        float f43 = f3 + f15;
                                        f14 += f41;
                                        f15 += f40;
                                        f12 = f42;
                                        f13 = f43;
                                    } else if (e52Var3 instanceof t42) {
                                        if (e52Var2.b) {
                                            f14 = (f14 * 2.0f) - f12;
                                            f15 = (2.0f * f15) - f13;
                                        }
                                        t42 t42Var = (t42) e52Var3;
                                        float f44 = t42Var.d;
                                        float f45 = t42Var.c;
                                        path5.quadTo(f14, f15, f45, f44);
                                        path = path5;
                                        i = size;
                                        f = f11;
                                        i2 = i4;
                                        f12 = f14;
                                        f13 = f15;
                                        e52Var = e52Var3;
                                        f14 = f45;
                                        f15 = f44;
                                    } else if (e52Var3 instanceof u42) {
                                        u42 u42Var = (u42) e52Var3;
                                        float f46 = u42Var.h + f14;
                                        float f47 = u42Var.i + f15;
                                        i = size;
                                        i2 = i4;
                                        path = path5;
                                        f = 0.0f;
                                        m(daVar, f14, f15, f46, f47, u42Var.c, u42Var.d, u42Var.e, u42Var.f, u42Var.g);
                                        f12 = f46;
                                        f14 = f12;
                                        f13 = f47;
                                        f15 = f13;
                                        e52Var = e52Var3;
                                    } else {
                                        path = path5;
                                        i = size;
                                        f = f11;
                                        i2 = i4;
                                        if (!(e52Var3 instanceof l42)) {
                                            c.k();
                                            return;
                                        }
                                        l42 l42Var = (l42) e52Var3;
                                        float f48 = l42Var.i;
                                        float f49 = l42Var.h;
                                        e52Var = e52Var3;
                                        m(daVar, f14, f15, f49, f48, l42Var.c, l42Var.d, l42Var.e, l42Var.f, l42Var.g);
                                        f13 = f48;
                                        f15 = f13;
                                        f12 = f49;
                                        f14 = f12;
                                    }
                                    f13 = f4;
                                    path = path5;
                                    i = size;
                                    f = f11;
                                    i2 = i4;
                                    e52Var = e52Var3;
                                    f12 = f5;
                                }
                                path = path5;
                            }
                            f13 = f6;
                            f14 = f7;
                            f15 = f8;
                            path = path5;
                            i = size;
                            f = f11;
                            i2 = i4;
                            e52Var = e52Var3;
                            f12 = f5;
                        }
                        path = path3;
                    }
                    i = size;
                    f = f11;
                    i2 = i4;
                }
                e52Var = e52Var3;
            }
            i4 = i2 + 1;
            list2 = list;
            daVar2 = daVar;
            path3 = path;
            size = i;
            e52Var2 = e52Var;
            f11 = f;
        }
    }

    public static l41 S(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new l41(i, i2 - 1, 1);
        }
        l41 l41Var = l41.i;
        return l41.i;
    }

    public static ActionMode.Callback T(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof lh3) || callback == null) ? callback : new lh3(callback, textView);
    }

    public static final void a(final d00 d00Var, rs0 rs0Var, rs0 rs0Var2, gh3 gh3Var, final long j, long j2, nv0 nv0Var, final int i) {
        rs0 rs0Var3;
        rs0 rs0Var4;
        gh3 gh3Var2;
        long j3;
        boolean z;
        boolean z2;
        nv0Var.b0(-931325388);
        int i2 = i | (nv0Var.h(d00Var) ? 4 : 2) | (nv0Var.h(rs0Var) ? 32 : 16) | (nv0Var.h(rs0Var2) ? 256 : 128) | (nv0Var.f(gh3Var) ? 2048 : 1024) | (nv0Var.e(j) ? 16384 : 8192) | (nv0Var.e(j2) ? 131072 : 65536);
        if (nv0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            float f = rs0Var2 == null ? 8.0f : 0.0f;
            yp1 yp1Var = yp1.a;
            bq1 bq1VarN = f80.N(yp1Var, 16.0f, 0.0f, f, 0.0f, 10);
            Object objO = nv0Var.O();
            int i3 = 8;
            if (objO == c20.a) {
                objO = new p8(i3);
                nv0Var.j0(objO);
            }
            cn1 cn1Var = (cn1) objO;
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarN);
            w10.c.getClass();
            nv0Var.d0();
            boolean z3 = nv0Var.S;
            x91 x91Var = tb1.Y;
            if (z3) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            z00 z00Var = f5.E;
            F(z00Var, nv0Var, cn1Var);
            z00 z00Var2 = f5.D;
            F(z00Var2, nv0Var, n52VarL);
            z00 z00Var3 = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var3);
            }
            z00 z00Var4 = f5.C;
            F(z00Var4, nv0Var, bq1VarM);
            bq1 bq1VarL = f80.L(r51.u(yp1Var, "text"), 0.0f, 6.0f, 1);
            vm vmVar = f5.g;
            cn1 cn1VarD = eo.d(vmVar, false);
            int iC2 = lq.C(nv0Var);
            n52 n52VarL2 = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, bq1VarL);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            F(z00Var, nv0Var, cn1VarD);
            F(z00Var2, nv0Var, n52VarL2);
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC2))) {
                nc2.q(iC2, nv0Var, iC2, z00Var3);
            }
            F(z00Var4, nv0Var, bq1VarM2);
            nc2.p(i2 & 14, d00Var, nv0Var, true);
            if (rs0Var != null) {
                nv0Var.a0(-1014168049);
                bq1 bq1VarU = r51.u(yp1Var, "action");
                cn1 cn1VarD2 = eo.d(vmVar, false);
                int iC3 = lq.C(nv0Var);
                n52 n52VarL3 = nv0Var.l();
                bq1 bq1VarM3 = lr.M(nv0Var, bq1VarU);
                nv0Var.d0();
                if (nv0Var.S) {
                    nv0Var.k(x91Var);
                } else {
                    nv0Var.m0();
                }
                F(z00Var, nv0Var, cn1VarD2);
                F(z00Var2, nv0Var, n52VarL3);
                if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC3))) {
                    nc2.q(iC3, nv0Var, iC3, z00Var3);
                }
                F(z00Var4, nv0Var, bq1VarM3);
                gh3Var2 = gh3Var;
                rs0Var3 = rs0Var;
                vr.d(new he2[]{nc2.f(j, t30.a), mg3.a.a(gh3Var2)}, rs0Var3, nv0Var, 8 | (i2 & 112));
                nv0Var.p(true);
                z = false;
                nv0Var.p(false);
            } else {
                rs0Var3 = rs0Var;
                gh3Var2 = gh3Var;
                z = false;
                nv0Var.a0(-1013852841);
                nv0Var.p(false);
            }
            if (rs0Var2 != null) {
                nv0Var.a0(-1013804481);
                bq1 bq1VarU2 = r51.u(yp1Var, "dismissAction");
                cn1 cn1VarD3 = eo.d(vmVar, z);
                int iC4 = lq.C(nv0Var);
                n52 n52VarL4 = nv0Var.l();
                bq1 bq1VarM4 = lr.M(nv0Var, bq1VarU2);
                nv0Var.d0();
                if (nv0Var.S) {
                    nv0Var.k(x91Var);
                } else {
                    nv0Var.m0();
                }
                F(z00Var, nv0Var, cn1VarD3);
                F(z00Var2, nv0Var, n52VarL4);
                if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC4))) {
                    nc2.q(iC4, nv0Var, iC4, z00Var3);
                }
                F(z00Var4, nv0Var, bq1VarM4);
                j3 = j2;
                int i4 = 8 | ((i2 >> 3) & 112);
                rs0Var4 = rs0Var2;
                vr.c(nc2.f(j3, t30.a), rs0Var4, nv0Var, i4);
                z2 = true;
                nv0Var.p(true);
                nv0Var.p(false);
            } else {
                rs0Var4 = rs0Var2;
                j3 = j2;
                z2 = true;
                nv0Var.a0(-1013535401);
                nv0Var.p(z);
            }
            nv0Var.p(z2);
        } else {
            rs0Var3 = rs0Var;
            rs0Var4 = rs0Var2;
            gh3Var2 = gh3Var;
            j3 = j2;
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final long j4 = j3;
            final gh3 gh3Var3 = gh3Var2;
            final rs0 rs0Var5 = rs0Var4;
            final rs0 rs0Var6 = rs0Var3;
            xj2VarT.d = new rs0(rs0Var6, rs0Var5, gh3Var3, j, j4, i) { // from class: f63
                public final /* synthetic */ rs0 g;
                public final /* synthetic */ rs0 h;
                public final /* synthetic */ gh3 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1);
                    y02.a(this.f, this.g, this.h, this.i, this.j, this.k, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void b(final bq1 bq1Var, final rs0 rs0Var, final rs0 rs0Var2, final z13 z13Var, final long j, final long j2, final long j3, final long j4, final d00 d00Var, nv0 nv0Var, final int i) {
        int i2;
        rs0 rs0Var3;
        rs0 rs0Var4;
        z13 z13Var2;
        long j5;
        nv0Var.b0(-1218779924);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            rs0Var3 = rs0Var;
            i2 |= nv0Var.h(rs0Var3) ? 32 : 16;
        } else {
            rs0Var3 = rs0Var;
        }
        if ((i & 384) == 0) {
            rs0Var4 = rs0Var2;
            i2 |= nv0Var.h(rs0Var4) ? 256 : 128;
        } else {
            rs0Var4 = rs0Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z13Var2 = z13Var;
            i2 |= nv0Var.f(z13Var2) ? 16384 : 8192;
        } else {
            z13Var2 = z13Var;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= nv0Var.e(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            j5 = j3;
            i2 |= nv0Var.e(j5) ? 8388608 : 4194304;
        } else {
            j5 = j3;
        }
        if ((100663296 & i) == 0) {
            i2 |= nv0Var.e(j4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= nv0Var.h(d00Var) ? 536870912 : 268435456;
        }
        if (nv0Var.R(i2 & 1, (306783379 & i2) != 306783378)) {
            nv0Var.W();
            if ((i & 1) != 0 && !nv0Var.A()) {
                nv0Var.U();
            }
            nv0Var.q();
            float f = gv3.S;
            d00 d00VarN = gq.N(-1343524879, new i63(rs0Var3, d00Var, rs0Var4, j5, j4), nv0Var);
            int i3 = (i2 & 14) | 12779520;
            int i4 = i2 >> 9;
            hb3.a(bq1Var, z13Var2, j, j2, 0.0f, f, null, d00VarN, nv0Var, i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 80);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: e63
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(i | 1);
                    y02.b(bq1Var, rs0Var, rs0Var2, z13Var, j, j2, j3, j4, d00Var, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void c(final z53 z53Var, bq1 bq1Var, z13 z13Var, long j, long j2, long j3, long j4, long j5, nv0 nv0Var, final int i) {
        int i2;
        final bq1 bq1Var2;
        final z13 z13Var2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        long jE;
        long jE2;
        z13 z13Var3;
        bq1 bq1Var3;
        int i3;
        long j11;
        long j12;
        long j13;
        nv0Var.b0(274621471);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(z53Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if (nv0Var.R(i4 & 1, (38347923 & i4) != 38347922)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                z13 z13VarA = g23.a(gv3.T, nv0Var);
                jE = hy.e(gv3.R, nv0Var);
                jE2 = hy.e(gv3.V, nv0Var);
                gy gyVar = gv3.P;
                long jE3 = hy.e(gyVar, nv0Var);
                long jE4 = hy.e(gyVar, nv0Var);
                long jE5 = hy.e(gv3.U, nv0Var);
                int i5 = i4 & (-268434433);
                z13Var3 = z13VarA;
                bq1Var3 = yp1.a;
                i3 = i5;
                j11 = jE3;
                j12 = jE4;
                j13 = jE5;
            } else {
                nv0Var.U();
                int i6 = i4 & (-268434433);
                z13Var3 = z13Var;
                jE = j;
                jE2 = j2;
                j11 = j3;
                j12 = j4;
                j13 = j5;
                i3 = i6;
                bq1Var3 = bq1Var;
            }
            nv0Var.q();
            z53Var.a.getClass();
            nv0Var.a0(-663517017);
            nv0Var.p(false);
            z53Var.a.getClass();
            nv0Var.a0(-662974393);
            nv0Var.p(false);
            z13 z13Var4 = z13Var3;
            long j14 = jE;
            long j15 = jE2;
            j9 = j12;
            j10 = j13;
            b(f80.J(bq1Var3, 12.0f), null, null, z13Var4, j14, j15, j9, j10, gq.N(-1266389126, new x53(z53Var, 1), nv0Var), nv0Var, ((i3 << 3) & 7168) | 805306368);
            bq1Var2 = bq1Var3;
            z13Var2 = z13Var4;
            j6 = j14;
            j7 = j15;
            j8 = j11;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            z13Var2 = z13Var;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            j10 = j5;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: d63
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(i | 1);
                    y02.c(z53Var, bq1Var2, z13Var2, j6, j7, j8, j9, j10, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final jk2 d(h62 h62Var, int i, xj3 xj3Var, pg3 pg3Var, boolean z, int i2) {
        jk2 jk2VarC = pg3Var != null ? pg3Var.c(xj3Var.b.r(i)) : jk2.e;
        float f = jk2VarC.a;
        int iP0 = h62Var.p0(2.0f);
        return new jk2(z ? (i2 - f) - iP0 : f, jk2VarC.b, z ? i2 - f : iP0 + f, jk2VarC.d);
    }

    public static void e(StringBuilder sb, Object obj, ns0 ns0Var) {
        if (ns0Var != null) {
            sb.append((CharSequence) ns0Var.h(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static double f(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float g(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int h(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long i(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static Comparable j(Float f, ex exVar) {
        exVar.getClass();
        float f2 = exVar.g;
        float f3 = exVar.f;
        if (!exVar.isEmpty()) {
            return (!ex.c(f, Float.valueOf(f3)) || ex.c(Float.valueOf(f3), f)) ? (!ex.c(Float.valueOf(f2), f) || ex.c(f, Float.valueOf(f2))) ? f : Float.valueOf(f2) : Float.valueOf(f3);
        }
        qn1.i("Cannot coerce value to an empty range: ", exVar, 46);
        return null;
    }

    public static Comparable k(Float f, fx fxVar) {
        if (fxVar instanceof ex) {
            return j(f, (ex) fxVar);
        }
        if (!fxVar.isEmpty()) {
            return f.compareTo(fxVar.a()) < 0 ? fxVar.a() : f.compareTo(fxVar.b()) > 0 ? fxVar.b() : f;
        }
        qn1.i("Cannot coerce value to an empty range: ", fxVar, 46);
        return null;
    }

    public static final qn2 l(Throwable th) {
        th.getClass();
        return new qn2(th);
    }

    public static final void m(da daVar, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d3 * dSin) + (d2 * dCos)) / d11;
        double d14 = ((d3 * dCos) + ((-d2) * dSin)) / d7;
        double d15 = ((d5 * dSin) + (d4 * dCos)) / d11;
        double d16 = ((d5 * dCos) + ((-d4) * dSin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            m(daVar, d2, d3, d4, d5, d11 * dSqrt, d7 * dSqrt, d8, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d17 * dSqrt2;
        double d24 = dSqrt2 * d18;
        if (z == z2) {
            d9 = d19 - d24;
            d10 = d20 + d23;
        } else {
            d9 = d19 + d24;
            d10 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d14 - d10, d13 - d9);
        double dAtan22 = Math.atan2(d16 - d10, d15 - d9) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d25 = d9 * d11;
        double d26 = d10 * d7;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d12);
        double dSin2 = Math.sin(d12);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d11;
        double d30 = d29 * dCos2;
        double d31 = d7 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d7 * dCos2;
        double d35 = (dCos3 * d34) + (dSin3 * d33);
        double d36 = dAtan22 / ((double) iCeil);
        double d37 = dAtan2;
        double d38 = d32;
        int i = 0;
        double d39 = d35;
        double d40 = d3;
        while (i < iCeil) {
            double d41 = d37 + d36;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            int i2 = iCeil;
            double d42 = (((d11 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d43 = (d34 * dSin4) + (d11 * dSin2 * dCos4) + d28;
            double d44 = (d30 * dSin4) - (d31 * dCos4);
            double d45 = (dCos4 * d34) + (dSin4 * d33);
            double d46 = d41 - d37;
            double dTan = Math.tan(d46 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            daVar.c((float) ((d38 * dSqrt3) + d2), (float) ((d39 * dSqrt3) + d40), (float) (d42 - (dSqrt3 * d44)), (float) (d43 - (dSqrt3 * d45)), (float) d42, (float) d43);
            d36 = d36;
            d2 = d42;
            i++;
            d33 = d33;
            dSin2 = dSin2;
            d27 = d27;
            d37 = d41;
            d39 = d45;
            d38 = d44;
            iCeil = i2;
            d40 = d43;
            d11 = d6;
        }
    }

    public static final void n(pr prVar, vr vrVar, w9 w9Var) {
        if (vrVar instanceof w02) {
            jk2 jk2Var = ((w02) vrVar).l;
            prVar.getClass();
            prVar.p(jk2Var.a, jk2Var.b, jk2Var.c, jk2Var.d, w9Var);
        } else {
            if (!(vrVar instanceof x02)) {
                if (vrVar instanceof v02) {
                    prVar.h(((v02) vrVar).l, w9Var);
                    return;
                } else {
                    c.k();
                    return;
                }
            }
            x02 x02Var = (x02) vrVar;
            ro2 ro2Var = x02Var.l;
            long j = ro2Var.h;
            da daVar = x02Var.m;
            if (daVar != null) {
                prVar.h(daVar, w9Var);
            } else {
                prVar.j(ro2Var.a, ro2Var.b, ro2Var.c, ro2Var.d, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), w9Var);
            }
        }
    }

    public static void o(qf0 qf0Var, vr vrVar, long j) {
        boolean z = vrVar instanceof w02;
        fm0 fm0Var = fm0.a;
        if (z) {
            jk2 jk2Var = ((w02) vrVar).l;
            float f = jk2Var.a;
            qf0Var.W(j, (((long) Float.floatToRawIntBits(jk2Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), M(jk2Var), 1.0f, fm0Var, 3);
            return;
        }
        if (!(vrVar instanceof x02)) {
            if (vrVar instanceof v02) {
                qf0Var.A(((v02) vrVar).l, j, 1.0f, fm0Var);
                return;
            } else {
                c.k();
                return;
            }
        }
        x02 x02Var = (x02) vrVar;
        da daVar = x02Var.m;
        if (daVar != null) {
            qf0Var.A(daVar, j, 1.0f, fm0Var);
            return;
        }
        ro2 ro2Var = x02Var.l;
        float f2 = ro2Var.b;
        float f3 = ro2Var.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ro2Var.h >> 32));
        qf0Var.S(j, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(ro2Var.c - f3)) << 32) | (((long) Float.floatToRawIntBits(ro2Var.d - f2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fm0Var);
    }

    public static final void p(qf0 qf0Var, long j, float f, float f2) {
        float f3 = f / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (qf0Var.a() >> 32)) - f3) - f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (qf0Var.a() & 4294967295L)) / 2.0f;
        qf0.a0(qf0Var, j, f3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), null, 120);
    }

    public static final jk2 q(aq1 aq1Var, boolean z, boolean z2) {
        if (!aq1Var.f.s) {
            return jk2.e;
        }
        if (z) {
            return vr.U(aq1Var, 8).T1();
        }
        ex1 ex1VarU = vr.U(aq1Var, 8);
        return vr.y(ex1VarU).c0(ex1VarU, z2);
    }

    public static final w01 r() {
        w01 w01Var = a;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(15.5f, 14.0f);
        tx0Var.g(-0.79f);
        tx0Var.i(-0.28f, -0.27f);
        tx0Var.d(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        tx0Var.d(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        tx0Var.k(3.0f, 5.91f, 3.0f, 9.5f);
        tx0Var.k(5.91f, 16.0f, 9.5f, 16.0f);
        tx0Var.e(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        tx0Var.i(0.27f, 0.28f);
        tx0Var.o(0.79f);
        tx0Var.i(5.0f, 4.99f);
        tx0Var.h(20.49f, 19.0f);
        tx0Var.i(-4.99f, -5.0f);
        tx0Var.c();
        tx0Var.j(9.5f, 14.0f);
        tx0Var.d(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        tx0Var.k(7.01f, 5.0f, 9.5f, 5.0f);
        tx0Var.k(14.0f, 7.01f, 14.0f, 9.5f);
        tx0Var.k(11.99f, 14.0f, 9.5f, 14.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        a = w01VarB;
        return w01VarB;
    }

    public static final w01 s() {
        w01 w01Var = b;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(19.14f, 12.94f);
        tx0Var.e(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        tx0Var.e(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        tx0Var.i(2.03f, -1.58f);
        tx0Var.e(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        tx0Var.i(-1.92f, -3.32f);
        tx0Var.e(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        tx0Var.i(-2.39f, 0.96f);
        tx0Var.e(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        tx0Var.h(14.4f, 2.81f);
        tx0Var.e(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        tx0Var.g(-3.84f);
        tx0Var.e(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        tx0Var.h(9.25f, 5.35f);
        tx0Var.d(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        tx0Var.h(5.24f, 5.33f);
        tx0Var.e(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        tx0Var.h(2.74f, 8.87f);
        tx0Var.d(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        tx0Var.i(2.03f, 1.58f);
        tx0Var.d(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        tx0Var.l(0.02f, 0.64f, 0.07f, 0.94f);
        tx0Var.i(-2.03f, 1.58f);
        tx0Var.e(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        tx0Var.i(1.92f, 3.32f);
        tx0Var.e(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        tx0Var.i(2.39f, -0.96f);
        tx0Var.e(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        tx0Var.i(0.36f, 2.54f);
        tx0Var.e(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        tx0Var.g(3.84f);
        tx0Var.e(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        tx0Var.i(0.36f, -2.54f);
        tx0Var.e(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        tx0Var.i(2.39f, 0.96f);
        tx0Var.e(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        tx0Var.i(1.92f, -3.32f);
        tx0Var.e(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        tx0Var.h(19.14f, 12.94f);
        tx0Var.c();
        tx0Var.j(12.0f, 15.6f);
        tx0Var.e(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        tx0Var.l(1.62f, -3.6f, 3.6f, -3.6f);
        tx0Var.l(3.6f, 1.62f, 3.6f, 3.6f);
        tx0Var.k(13.98f, 15.6f, 12.0f, 15.6f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        b = w01VarB;
        return w01VarB;
    }

    public static wb2 t(gi giVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new wb2(bc0.i(giVar));
        }
        TextPaint textPaint = new TextPaint(giVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = giVar.getBreakStrategy();
        int hyphenationFrequency = giVar.getHyphenationFrequency();
        if (giVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (giVar.getInputType() & 15) != 3) {
            boolean z = giVar.getLayoutDirection() == 1;
            switch (giVar.getTextDirection()) {
                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case oc2.LONG_FIELD_NUMBER /* 4 */:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case oc2.STRING_FIELD_NUMBER /* 5 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(bc0.c(DecimalFormatSymbols.getInstance(giVar.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new wb2(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int u(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        c.p(by1.e(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final void v(nv0 nv0Var, Integer num) {
        z00 z00Var = f5.F;
        if (nv0Var.S) {
            nv0Var.b(z00Var, num);
        }
    }

    public static final void w(tu2 tu2Var) {
        vr.X(tu2Var).F();
    }

    public static final Boolean x(JSONObject jSONObject, String str, boolean z) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return Boolean.valueOf(z);
        }
        Object objOpt = jSONObject.opt(str);
        if (objOpt instanceof Boolean) {
            return (Boolean) objOpt;
        }
        return null;
    }

    public static final ai1 y(JSONObject jSONObject, boolean z) {
        String strP;
        String strP2;
        int length;
        int length2;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        if (z && ((length2 = jSONArrayOptJSONArray.length()) < 0 || length2 >= 33)) {
            return null;
        }
        if (!z && (1 > (length = jSONArrayOptJSONArray.length()) || length >= 33)) {
            return null;
        }
        ai1 ai1VarX = vr.x();
        int length3 = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length3; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null || (strP = P(jSONObjectOptJSONObject, "value", false)) == null || (strP2 = P(jSONObjectOptJSONObject, "label", false)) == null) {
                return null;
            }
            ai1VarX.add(new n82(strP, strP2));
        }
        ai1 ai1VarR = vr.r(ai1VarX);
        ArrayList arrayList = new ArrayList(rx.d0(ai1VarR, 10));
        ListIterator listIterator = ai1VarR.listIterator(0);
        while (true) {
            jy0 jy0Var = (jy0) listIterator;
            if (!jy0Var.hasNext()) {
                break;
            }
            arrayList.add(((n82) jy0Var.next()).a);
        }
        if (qx.N0(qx.Q0(arrayList)).size() == ai1VarR.a()) {
            return ai1VarR;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0445 A[PHI: r7 r33 r34
      0x0445: PHI (r7v17 int) = (r7v15 int), (r7v15 int), (r7v15 int), (r7v15 int), (r7v15 int), (r7v15 int), (r7v15 int), (r7v18 int) binds: [B:247:0x04bd, B:249:0x04c5, B:251:0x04cd, B:253:0x04d5, B:264:0x0516, B:266:0x051a, B:458:0x0445, B:223:0x0426] A[DONT_GENERATE, DONT_INLINE]
      0x0445: PHI (r33v8 java.lang.String) = 
      (r33v6 java.lang.String)
      (r33v6 java.lang.String)
      (r33v6 java.lang.String)
      (r33v6 java.lang.String)
      (r33v6 java.lang.String)
      (r33v6 java.lang.String)
      (r33v6 java.lang.String)
      (r33v9 java.lang.String)
     binds: [B:247:0x04bd, B:249:0x04c5, B:251:0x04cd, B:253:0x04d5, B:264:0x0516, B:266:0x051a, B:458:0x0445, B:223:0x0426] A[DONT_GENERATE, DONT_INLINE]
      0x0445: PHI (r34v8 ??) = (r34v6 ??), (r34v6 ??), (r34v6 ??), (r34v6 ??), (r34v6 ??), (r34v6 ??), (r34v6 ??), (r34v9 ??) binds: [B:247:0x04bd, B:249:0x04c5, B:251:0x04cd, B:253:0x04d5, B:264:0x0516, B:266:0x051a, B:458:0x0445, B:223:0x0426] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0a18 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v10 */
    /* JADX WARN: Type inference failed for: r34v11 */
    /* JADX WARN: Type inference failed for: r34v12 */
    /* JADX WARN: Type inference failed for: r34v13 */
    /* JADX WARN: Type inference failed for: r34v14 */
    /* JADX WARN: Type inference failed for: r34v15 */
    /* JADX WARN: Type inference failed for: r34v16 */
    /* JADX WARN: Type inference failed for: r34v17 */
    /* JADX WARN: Type inference failed for: r34v18 */
    /* JADX WARN: Type inference failed for: r34v19 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v20 */
    /* JADX WARN: Type inference failed for: r34v21 */
    /* JADX WARN: Type inference failed for: r34v22 */
    /* JADX WARN: Type inference failed for: r34v23 */
    /* JADX WARN: Type inference failed for: r34v24 */
    /* JADX WARN: Type inference failed for: r34v25 */
    /* JADX WARN: Type inference failed for: r34v26 */
    /* JADX WARN: Type inference failed for: r34v27 */
    /* JADX WARN: Type inference failed for: r34v28 */
    /* JADX WARN: Type inference failed for: r34v29 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v30, types: [int] */
    /* JADX WARN: Type inference failed for: r34v31 */
    /* JADX WARN: Type inference failed for: r34v32 */
    /* JADX WARN: Type inference failed for: r34v33 */
    /* JADX WARN: Type inference failed for: r34v34 */
    /* JADX WARN: Type inference failed for: r34v35 */
    /* JADX WARN: Type inference failed for: r34v36 */
    /* JADX WARN: Type inference failed for: r34v37 */
    /* JADX WARN: Type inference failed for: r34v38 */
    /* JADX WARN: Type inference failed for: r34v39 */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r34v40 */
    /* JADX WARN: Type inference failed for: r34v41 */
    /* JADX WARN: Type inference failed for: r34v42 */
    /* JADX WARN: Type inference failed for: r34v43 */
    /* JADX WARN: Type inference failed for: r34v44 */
    /* JADX WARN: Type inference failed for: r34v45 */
    /* JADX WARN: Type inference failed for: r34v46 */
    /* JADX WARN: Type inference failed for: r34v47 */
    /* JADX WARN: Type inference failed for: r34v48 */
    /* JADX WARN: Type inference failed for: r34v49 */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r34v50 */
    /* JADX WARN: Type inference failed for: r34v51 */
    /* JADX WARN: Type inference failed for: r34v52 */
    /* JADX WARN: Type inference failed for: r34v53 */
    /* JADX WARN: Type inference failed for: r34v54 */
    /* JADX WARN: Type inference failed for: r34v55 */
    /* JADX WARN: Type inference failed for: r34v56 */
    /* JADX WARN: Type inference failed for: r34v57 */
    /* JADX WARN: Type inference failed for: r34v58 */
    /* JADX WARN: Type inference failed for: r34v59 */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r34v60 */
    /* JADX WARN: Type inference failed for: r34v61 */
    /* JADX WARN: Type inference failed for: r34v62 */
    /* JADX WARN: Type inference failed for: r34v63 */
    /* JADX WARN: Type inference failed for: r34v64 */
    /* JADX WARN: Type inference failed for: r34v65 */
    /* JADX WARN: Type inference failed for: r34v66 */
    /* JADX WARN: Type inference failed for: r34v67 */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r34v8 */
    /* JADX WARN: Type inference failed for: r34v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List z(java.lang.String r47) {
        /*
            Method dump skipped, instruction units count: 2698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y02.z(java.lang.String):java.util.List");
    }
}
