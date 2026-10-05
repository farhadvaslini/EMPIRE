package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pb0 extends a00 {
    public cs0 j;
    public nb0 k;
    public final View l;
    public final kb0 m;
    public boolean n;

    public pb0(cs0 cs0Var, nb0 nb0Var, View view, bb1 bb1Var, ua0 ua0Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), nb0Var.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
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
        window.setBackgroundDrawableResource(android.R.color.transparent);
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
        kb0Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
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
        kb0Var.setTag(R.id.view_tree_lifecycle_owner, b32.m(view));
        kb0Var.setTag(R.id.view_tree_view_model_store_owner, n32.n(view));
        kb0Var.setTag(R.id.view_tree_saved_state_registry_owner, d32.o(view));
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
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int iM;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.k.b) {
            kb0 kb0Var = this.m;
            kb0Var.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = kb0Var.getChildAt(0)) != null) {
                int left = childAt.getLeft() + kb0Var.getLeft();
                int width = childAt.getWidth() + left;
                int top2 = childAt.getTop() + kb0Var.getTop();
                int height = childAt.getHeight() + top2;
                int iM2 = vm1.M(motionEvent.getX());
                if (left <= iM2 && iM2 <= width && top2 <= (iM = vm1.M(motionEvent.getY())) && iM <= height) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                        this.n = false;
                        return zOnTouchEvent;
                    }
                }
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.n = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.n = false;
                    return zOnTouchEvent;
                }
            } else if (this.n) {
                this.j.a();
                this.n = false;
                return true;
            }
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
