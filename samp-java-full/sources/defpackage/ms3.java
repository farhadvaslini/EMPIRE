package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ms3 implements View.OnApplyWindowInsetsListener {
    public final kx a;
    public mt3 b;

    public ms3(View view, kx kxVar) {
        mt3 mt3VarB;
        this.a = kxVar;
        WeakHashMap weakHashMap = mq3.a;
        mt3 mt3VarA = gq3.a(view);
        if (mt3VarA != null) {
            int i = Build.VERSION.SDK_INT;
            mt3VarB = (i >= 36 ? new zs3(mt3VarA) : i >= 35 ? new ys3(mt3VarA) : i >= 34 ? new xs3(mt3VarA) : i >= 31 ? new ws3(mt3VarA) : i >= 30 ? new vs3(mt3VarA) : i >= 29 ? new us3(mt3VarA) : new ts3(mt3VarA)).b();
        } else {
            mt3VarB = null;
        }
        this.b = mt3VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = mt3.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        mt3 mt3VarC = mt3.c(windowInsets, view);
        jt3 jt3Var = mt3VarC.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = mq3.a;
            this.b = gq3.a(view);
        }
        if (this.b == null) {
            this.b = mt3VarC;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            kx kxVarJ = ns3.j(view);
            if (kxVarJ == null || !Objects.equals((mt3) kxVarJ.g, mt3VarC)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                mt3 mt3Var = this.b;
                int i = 1;
                while (i <= 512) {
                    h31 h31VarI = jt3Var.i(i);
                    h31 h31VarI2 = mt3Var.a.i(i);
                    int i2 = h31VarI.a;
                    int i3 = h31VarI.d;
                    int i4 = h31VarI.c;
                    int i5 = h31VarI.b;
                    int i6 = h31VarI2.a;
                    int i7 = h31VarI2.d;
                    int[] iArr4 = iArr2;
                    int i8 = h31VarI2.c;
                    int i9 = h31VarI2.b;
                    if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i;
                        } else {
                            iArr[0] = iArr[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i10 = iArr2[0];
                int i11 = iArr3[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = mt3VarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    mt3 mt3Var2 = this.b;
                    ss3 ss3Var = new ss3(i12, (i10 & 8) != 0 ? ns3.e : (i11 & 8) != 0 ? ns3.f : (i10 & 519) != 0 ? ns3.g : (i11 & 519) != 0 ? ns3.h : null, (i12 & 8) != 0 ? 160L : 250L);
                    ss3Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ss3Var.a.b());
                    h31 h31VarI3 = jt3Var.i(i12);
                    h31 h31VarI4 = mt3Var2.a.i(i12);
                    int iMin = Math.min(h31VarI3.a, h31VarI4.a);
                    int i13 = h31VarI3.b;
                    int i14 = h31VarI4.b;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = h31VarI3.c;
                    int i16 = h31VarI4.c;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = h31VarI3.d;
                    int i18 = h31VarI4.d;
                    ar2 ar2Var = new ar2(7, h31.b(iMin, iMin2, iMin3, Math.min(i17, i18)), h31.b(Math.max(h31VarI3.a, h31VarI4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
                    ns3.g(view, ss3Var, mt3VarC, false);
                    duration.addUpdateListener(new ks3(ss3Var, mt3VarC, mt3Var2, i12, view));
                    duration.addListener(new ls3(ss3Var, view));
                    bs bsVar = new bs(view, ss3Var, ar2Var, duration);
                    if (view == null) {
                        throw new NullPointerException("view == null");
                    }
                    gz1 gz1Var = new gz1(view, bsVar);
                    view.getViewTreeObserver().addOnPreDrawListener(gz1Var);
                    view.addOnAttachStateChangeListener(gz1Var);
                    this.b = mt3VarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
