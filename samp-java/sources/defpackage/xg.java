package defpackage;

import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xg {
    public final Serializable a;
    public final Object b;
    public Serializable c;
    public Serializable d;
    public Serializable e;
    public final Serializable f;

    /* JADX WARN: Type inference failed for: r4v11, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v13, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [int[], java.io.Serializable] */
    public xg(int i) {
        switch (i) {
            case 1:
                this.a = new AtomicBoolean(false);
                this.b = new CountDownLatch(1);
                this.f = "PublicSuffixDatabase.list";
                break;
            default:
                this.a = new int[]{2131165260, 2131165258, 2131165184};
                this.b = new int[]{2131165208, 2131165243, 2131165215, 2131165210, 2131165211, 2131165214, 2131165213};
                this.c = new int[]{2131165257, 2131165259, 2131165201, 2131165253, 2131165254, 2131165255, 2131165256};
                this.d = new int[]{2131165233, 2131165199, 2131165232};
                this.e = new int[]{2131165251, 2131165261};
                this.f = new int[]{2131165187, 2131165193, 2131165188, 2131165194};
                break;
        }
    }

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i) {
        int iC = ph3.c(context, 2130903132);
        int iB = ph3.b(context, 2130903130);
        int[] iArr = ph3.b;
        int[] iArr2 = ph3.d;
        int iB2 = ny.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, ph3.c, ph3.f}, new int[]{iB, iB2, ny.b(iC, i), i});
    }

    public static LayerDrawable c(zl2 zl2Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableD = zl2Var.d(context, 2131165247);
        Drawable drawableD2 = zl2Var.d(context, 2131165248);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static void g(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterF;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = yg.b;
        }
        PorterDuff.Mode mode2 = yg.b;
        synchronized (yg.class) {
            porterDuffColorFilterF = zl2.f(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterF);
    }

    public ColorStateList d(Context context, int i) {
        if (i == 2131165204) {
            return rn.B(context, 2131034133);
        }
        if (i == 2131165250) {
            return rn.B(context, 2131034136);
        }
        if (i != 2131165249) {
            if (i == 2131165192) {
                return b(context, ph3.c(context, 2130903130));
            }
            if (i == 2131165186) {
                return b(context, 0);
            }
            if (i == 2131165191) {
                return b(context, ph3.c(context, 2130903128));
            }
            if (i == 2131165245 || i == 2131165246) {
                return rn.B(context, 2131034135);
            }
            if (a((int[]) this.b, i)) {
                return ph3.d(context, 2130903133);
            }
            if (a((int[]) this.e, i)) {
                return rn.B(context, 2131034132);
            }
            if (a((int[]) this.f, i)) {
                return rn.B(context, 2131034131);
            }
            if (i == 2131165242) {
                return rn.B(context, 2131034134);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = ph3.d(context, 2130903137);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = ph3.b;
            iArr2[0] = ph3.b(context, 2130903137);
            iArr[1] = ph3.e;
            iArr2[1] = ph3.c(context, 2130903131);
            iArr[2] = ph3.f;
            iArr2[2] = ph3.c(context, 2130903137);
        } else {
            int[] iArr3 = ph3.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = ph3.e;
            iArr2[1] = ph3.c(context, 2130903131);
            iArr[2] = ph3.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public g31 e() throws IOException {
        m62 m62Var = m62.a;
        Object obj = m62.a;
        i40 i40Var = obj != null ? (i40) obj : null;
        Context contextB = i40Var != null ? i40Var.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open((String) this.f);
            inputStreamOpen.getClass();
            return new g31(inputStreamOpen, new ci3());
        }
        if (Build.FINGERPRINT == null) {
            c.r("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        c.r("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    public void f() {
        try {
            ej2 ej2Var = new ej2(e());
            try {
                kq kqVarG = ej2Var.g(ej2Var.readInt());
                kq kqVarG2 = ej2Var.g(ej2Var.readInt());
                ej2Var.close();
                synchronized (this) {
                    kqVarG.getClass();
                    this.c = kqVarG;
                    kqVarG2.getClass();
                    this.d = kqVarG2;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.b).countDown();
        }
    }
}
