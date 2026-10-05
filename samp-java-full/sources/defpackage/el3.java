package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class el3 {
    public static final t22 a;
    public static final nl1 b;
    public static Paint c;

    static {
        b32.d("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new il3();
        } else if (i >= 29) {
            a = new hl3();
        } else if (i >= 28) {
            a = new gl3();
        } else {
            a = new fl3();
        }
        b = new nl1(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        r7 = r12.build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, oq0 oq0Var, Resources resources, int i, String str, int i2, int i3, xh xhVar, boolean z) {
        Typeface typefaceS;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 6;
        if (oq0Var instanceof rq0) {
            rq0 rq0Var = (rq0) oq0Var;
            String str2 = rq0Var.d;
            typefaceS = null;
            int i5 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = rq0Var.a;
                if (arrayList.size() == 1) {
                    typefaceBuild = c(((hq0) arrayList.get(0)).e);
                } else if (Build.VERSION.SDK_INT < 31) {
                    typefaceBuild = null;
                } else {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            Typeface.CustomFallbackBuilder customFallbackBuilderD = null;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= arrayList.size()) {
                                    break;
                                }
                                hq0 hq0Var = (hq0) arrayList.get(i7);
                                if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(hq0Var.f)) {
                                    customFallbackBuilderD.setSystemFallback(hq0Var.e);
                                    break;
                                }
                                String str3 = hq0Var.e;
                                String str4 = hq0Var.f;
                                Font fontD = d(c(str3));
                                if (fontD == null) {
                                    Log.w("TypefaceCompat", "Unable identify the primary font for " + hq0Var.e + ". Falling back to provider font.");
                                    break;
                                }
                                if (TextUtils.isEmpty(str4)) {
                                    fontFamilyBuild = w93.w(fontD).build();
                                } else {
                                    try {
                                        w93.m();
                                        w93.x();
                                        fontFamilyBuild = w93.h(a72.k(fontD).setFontVariationSettings(str4).build()).build();
                                    } catch (IOException unused) {
                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                    }
                                }
                                if (customFallbackBuilderD == null) {
                                    customFallbackBuilderD = w93.d(fontFamilyBuild);
                                } else {
                                    customFallbackBuilderD.addCustomFallback(fontFamilyBuild);
                                }
                                i7++;
                            }
                        } else {
                            if (c(((hq0) arrayList.get(i6)).e) == null) {
                                break;
                            }
                            i6++;
                        }
                    }
                    typefaceBuild = null;
                }
            }
            if (typefaceBuild != null) {
                if (xhVar != null) {
                    new Handler(Looper.getMainLooper()).post(new a8(i4, xhVar, typefaceBuild));
                }
                b.b(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr5 = !z ? xhVar != null : rq0Var.c != 0;
            int i8 = z ? rq0Var.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            k71 k71Var = new k71(25, z2);
            k71Var.g = xhVar;
            ArrayList arrayList2 = rq0Var.a;
            ol2 ol2Var = new ol2(handler);
            a31 a31Var = new a31(k71Var, objArr4 == true ? 1 : 0, ol2Var, 8);
            int i9 = 4;
            if (objArr5 != true) {
                String strA = nq0.a(i3, arrayList2);
                Typeface typeface = (Typeface) nq0.a.a(strA);
                if (typeface != null) {
                    ol2Var.execute(new x2(k71Var, objArr2 == true ? 1 : 0, typeface, i9));
                    typefaceS = typeface;
                } else {
                    lq0 lq0Var = new lq0(objArr == true ? 1 : 0, a31Var);
                    synchronized (nq0.c) {
                        try {
                            w33 w33Var = nq0.d;
                            ArrayList arrayList3 = (ArrayList) w33Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(lq0Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(lq0Var);
                                w33Var.put(strA, arrayList4);
                                kq0 kq0Var = new kq0(strA, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = nq0.b;
                                lq0 lq0Var2 = new lq0(i5, strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                pl2 pl2Var = new pl2();
                                pl2Var.f = kq0Var;
                                pl2Var.g = lq0Var2;
                                pl2Var.h = handler2;
                                threadPoolExecutor.execute(pl2Var);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    c.p("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                hq0 hq0Var2 = (hq0) arrayList2.get(0);
                nl1 nl1Var = nq0.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{hq0Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = nq0.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) nq0.a.a(strA2);
                if (typeface2 != null) {
                    ol2Var.execute(new x2(k71Var, objArr3 == true ? 1 : 0, typeface2, i9));
                    typefaceS = typeface2;
                } else if (i8 == -1) {
                    Object[] objArr6 = {hq0Var2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr6[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    mq0 mq0VarB = nq0.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    a31Var.B(mq0VarB);
                    typefaceS = mq0VarB.a;
                } else {
                    try {
                        try {
                            try {
                                mq0 mq0Var = (mq0) nq0.b.submit(new kq0(strA2, context, hq0Var2, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                a31Var.B(mq0Var);
                                typefaceS = mq0Var.a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((ol2) a31Var.h).execute(new ar((k71) a31Var.g, -3));
                    }
                }
            }
        } else {
            typefaceS = a.s(context, (pq0) oq0Var, resources, i3);
            if (xhVar != null) {
                if (typefaceS != null) {
                    new Handler(Looper.getMainLooper()).post(new a8(i4, xhVar, typefaceS));
                } else {
                    xhVar.a(-3);
                }
            }
        }
        if (typefaceS != null) {
            b.b(b(resources, i, str, i2, i3), typefaceS);
        }
        return typefaceS;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
