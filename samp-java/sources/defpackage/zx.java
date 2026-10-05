package defpackage;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class zx {
    public static final cy a;

    static {
        float[] fArr = {1.3935f, -0.3575f, -0.036f, 0.0f, 0.0f, -0.1065f, 1.1425f, -0.036f, 0.0f, 0.0f, -0.1065f, -0.3575f, 1.464f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        cy cyVar = new cy(new ColorMatrixColorFilter(fArr));
        cyVar.b = fArr;
        a = cyVar;
    }

    public static final void a(hf0 hf0Var) {
        bb bbVar;
        hf0Var.getClass();
        cy cyVar = a;
        cyVar.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            u10 u10Var = hf0Var.k;
            ColorFilter colorFilter = cyVar.a;
            if (u10Var != null) {
                RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(colorFilter, u10Var.c());
                renderEffectCreateColorFilterEffect.getClass();
                bbVar = new bb(renderEffectCreateColorFilterEffect);
            } else {
                RenderEffect renderEffectCreateColorFilterEffect2 = RenderEffect.createColorFilterEffect(colorFilter);
                renderEffectCreateColorFilterEffect2.getClass();
                bbVar = new bb(renderEffectCreateColorFilterEffect2);
            }
            hf0Var.k = bbVar;
        }
    }
}
