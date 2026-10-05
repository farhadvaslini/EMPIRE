package defpackage;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jp1 extends a00 {
    public cs0 j;
    public wp1 k;
    public long l;
    public final View m;
    public final gp1 n;

    public jp1(cs0 cs0Var, wp1 wp1Var, long j, View view, bb1 bb1Var, ua0 ua0Var, UUID uuid, ed edVar, x50 x50Var) {
        super(new ContextThemeWrapper(view.getContext(), 2131689643), 0);
        this.j = cs0Var;
        this.k = wp1Var;
        this.l = j;
        this.m = view;
        Window window = getWindow();
        if (window == null) {
            c.q("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        oz2.K(window, false);
        gp1 gp1Var = new gp1(getContext());
        gp1Var.setTag(2131230800, "Dialog:" + uuid);
        gp1Var.setClipChildren(false);
        gp1Var.setElevation(ua0Var.T(8.0f));
        gp1Var.setOutlineProvider(new ob0(1));
        this.n = gp1Var;
        setContentView(gp1Var);
        gp1Var.setTag(2131230924, b32.m(view));
        gp1Var.setTag(2131230928, n32.n(view));
        gp1Var.setTag(2131230927, d32.o(view));
        d(this.j, this.k, this.l, bb1Var);
        k71 k71Var = new k71(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        g12 pt3Var = i >= 35 ? new pt3(window, k71Var) : i >= 30 ? new ot3(window, k71Var) : new nt3(window, k71Var);
        this.k.getClass();
        pt3Var.c0(vp.J(this.l));
        this.k.getClass();
        pt3Var.b0(vp.J(this.l));
        getOnBackPressedDispatcher().a(this, new ip1(this.k.b, x50Var, edVar, new ja(28, this)));
    }

    public final void d(cs0 cs0Var, wp1 wp1Var, long j, bb1 bb1Var) {
        this.j = cs0Var;
        this.k = wp1Var;
        this.l = j;
        zs2 zs2Var = wp1Var.a;
        ViewGroup.LayoutParams layoutParams = this.m.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = zs2Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    c.k();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal2 = bb1Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else if (iOrdinal2 != 1) {
            c.k();
            return;
        }
        this.n.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.j.a();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
