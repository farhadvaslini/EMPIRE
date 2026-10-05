package defpackage;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pb0 extends a00 {
    public cs0 j;
    public nb0 k;
    public final View l;
    public final kb0 m;
    public boolean n;

    public pb0(cs0 cs0Var, nb0 nb0Var, View view, bb1 bb1Var, ua0 ua0Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), nb0Var.e ? 2131689641 : 2131689644), 0);
        this.j = cs0Var;
        this.k = nb0Var;
        this.l = view;
        Window window = getWindow();
        if (window == null) {
            c.q("Dialog has no window");
            throw null;
        }
        nb0 nb0Var2 = this.k;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = nb0Var2.g;
            window2.setAttributes(attributes);
        }
        int i = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        oz2.K(window, this.k.e);
        window.setGravity(17);
        if (!this.k.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                ff.a.a(attributes2);
            }
            if (i2 >= 30) {
                hf hfVar = hf.a;
                hfVar.b(attributes2, 0);
                hfVar.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        kb0 kb0Var = new kb0(getContext(), window);
        setTitle(this.k.f);
        kb0Var.setTag(2131230800, "Dialog:" + uuid);
        kb0Var.setClipChildren(false);
        kb0Var.setElevation(ua0Var.T(8.0f));
        kb0Var.setOutlineProvider(new ob0(0));
        this.m = kb0Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(kb0Var);
        kb0Var.setTag(2131230924, b32.m(view));
        kb0Var.setTag(2131230928, n32.n(view));
        kb0Var.setTag(2131230927, d32.o(view));
        e(this.j, this.k, bb1Var);
        xy1 onBackPressedDispatcher = getOnBackPressedDispatcher();
        m8 m8Var = new m8(this, i);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.a(this, new tk(m8Var));
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof kb0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    public final void e(cs0 cs0Var, nb0 nb0Var, bb1 bb1Var) {
        int i;
        this.j = cs0Var;
        this.k = nb0Var;
        zs2 zs2Var = nb0Var.c;
        boolean zB = xa.b(this.l);
        int iOrdinal = zs2Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    c.k();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = bb1Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                c.k();
                return;
            }
            i = 1;
        }
        kb0 kb0Var = this.m;
        kb0Var.setLayoutDirection(i);
        boolean z = nb0Var.e;
        boolean z2 = nb0Var.d;
        Window window2 = kb0Var.o;
        boolean z3 = (kb0Var.s && z2 == kb0Var.q && z == kb0Var.r) ? false : true;
        kb0Var.q = z2;
        kb0Var.r = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !kb0Var.s) {
                window2.setLayout(i2, -2);
                kb0Var.s = true;
            }
        }
        setCanceledOnTouchOutside(nb0Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.k.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.j.a();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            nb0 r1 = r9.k
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L86
            kb0 r1 = r9.m
            r1.getClass()
            float r5 = r10.getX()
            float r5 = java.lang.Math.abs(r5)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            float r5 = r10.getY()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L34
            goto L69
        L34:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = defpackage.vm1.M(r5)
            if (r7 > r5) goto L69
            if (r5 > r6) goto L69
            float r5 = r10.getY()
            int r5 = defpackage.vm1.M(r5)
            if (r8 > r5) goto L69
            if (r5 > r1) goto L69
            goto L86
        L69:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L83
            if (r10 == r4) goto L77
            if (r10 == r2) goto L74
            goto L90
        L74:
            r9.n = r3
            return r0
        L77:
            boolean r10 = r9.n
            if (r10 == 0) goto L90
            cs0 r10 = r9.j
            r10.a()
            r9.n = r3
            return r4
        L83:
            r9.n = r4
            return r4
        L86:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L91
            if (r10 == r4) goto L91
            if (r10 == r2) goto L91
        L90:
            return r0
        L91:
            r9.n = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
