package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zl2 {
    public static zl2 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public xg e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final yl2 h = new yl2(6);

    public static synchronized zl2 c() {
        try {
            if (g == null) {
                g = new zl2();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        yl2 yl2Var = h;
        yl2Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) yl2Var.a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        l83 l83Var = (l83) this.a.get(context);
        if (l83Var == null) {
            l83Var = new l83(0);
            this.a.put(context, l83Var);
        }
        int i2 = l83Var.i;
        if (i2 != 0 && i <= l83Var.g[i2 - 1]) {
            l83Var.d(i, colorStateList);
            return;
        }
        if (l83Var.f && i2 >= l83Var.g.length) {
            r51.j(l83Var);
        }
        int i3 = l83Var.i;
        if (i3 >= l83Var.g.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            l83Var.g = Arrays.copyOf(l83Var.g, i7);
            l83Var.h = Arrays.copyOf(l83Var.h, i7);
        }
        l83Var.g[i3] = i;
        l83Var.h[i3] = colorStateList;
        l83Var.i = i3 + 1;
    }

    public final Drawable b(Context context, int i) {
        LayerDrawable layerDrawableC;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            xk1 xk1Var = (xk1) this.b.get(context);
            layerDrawableC = null;
            if (xk1Var != null && (weakReference = (WeakReference) xk1Var.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    xk1Var.e(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e != null) {
            if (i == 2131165200) {
                layerDrawableC = new LayerDrawable(new Drawable[]{d(context, 2131165199), d(context, 2131165201)});
            } else if (i == 2131165235) {
                layerDrawableC = xg.c(this, context, 2131099707);
            } else if (i == 2131165234) {
                layerDrawableC = xg.c(this, context, 2131099708);
            } else if (i == 2131165236) {
                layerDrawableC = xg.c(this, context, 2131099709);
            }
        }
        if (layerDrawableC == null) {
            return layerDrawableC;
        }
        layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableC;
                }
                xk1 xk1Var2 = (xk1) this.b.get(context);
                if (xk1Var2 == null) {
                    xk1Var2 = new xk1();
                    this.b.put(context, xk1Var2);
                }
                xk1Var2.d(j, new WeakReference(constantState2));
                return layerDrawableC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, 2131165262);
                if (drawableD == null || !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName())) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, z, drawableB);
            }
            if (drawableB != null) {
                wf0.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        l83 l83Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListD = null;
        colorStateList = (weakHashMap == null || (l83Var = (l83) weakHashMap.get(context)) == null) ? null : (ColorStateList) l83Var.b(i);
        if (colorStateList == null) {
            xg xgVar = this.e;
            if (xgVar != null) {
                colorStateListD = xgVar.d(context, i);
            }
            if (colorStateListD != null) {
                a(context, i, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable h(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl2.h(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
