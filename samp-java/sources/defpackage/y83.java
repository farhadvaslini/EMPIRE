package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class y83 extends fo1 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context g;
    public final nn1 h;
    public final kn1 i;
    public final boolean j;
    public final int k;
    public final int l;
    public final lo1 m;
    public PopupWindow.OnDismissListener p;
    public View q;
    public View r;
    public oo1 s;
    public ViewTreeObserver t;
    public boolean u;
    public boolean v;
    public int w;
    public boolean y;
    public final mh n = new mh(3, this);
    public final e9 o = new e9(2, this);
    public int x = 0;

    public y83(Context context, nn1 nn1Var, View view, int i, boolean z) {
        this.g = context;
        this.h = nn1Var;
        this.j = z;
        this.i = new kn1(nn1Var, LayoutInflater.from(context), z, 2131427347);
        this.l = i;
        Resources resources = context.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
        this.q = view;
        this.m = new lo1(context, null, i);
        nn1Var.b(this, context);
    }

    @Override // defpackage.v33
    public final boolean a() {
        return !this.u && this.m.D.isShowing();
    }

    @Override // defpackage.po1
    public final void b(nn1 nn1Var, boolean z) {
        if (nn1Var != this.h) {
            return;
        }
        dismiss();
        oo1 oo1Var = this.s;
        if (oo1Var != null) {
            oo1Var.b(nn1Var, z);
        }
    }

    @Override // defpackage.v33
    public final void c() {
        View view;
        if (a()) {
            return;
        }
        if (this.u || (view = this.q) == null) {
            c.q("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.r = view;
        lo1 lo1Var = this.m;
        fh fhVar = lo1Var.D;
        fh fhVar2 = lo1Var.D;
        fhVar.setOnDismissListener(this);
        lo1Var.u = this;
        lo1Var.C = true;
        fhVar2.setFocusable(true);
        View view2 = this.r;
        boolean z = this.t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.t = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.n);
        }
        view2.addOnAttachStateChangeListener(this.o);
        lo1Var.t = view2;
        lo1Var.q = this.x;
        boolean z2 = this.v;
        Context context = this.g;
        kn1 kn1Var = this.i;
        if (!z2) {
            this.w = fo1.m(kn1Var, context, this.k);
            this.v = true;
        }
        lo1Var.r(this.w);
        fhVar2.setInputMethodMode(2);
        Rect rect = this.f;
        lo1Var.B = rect != null ? new Rect(rect) : null;
        lo1Var.c();
        cg0 cg0Var = lo1Var.h;
        cg0Var.setOnKeyListener(this);
        if (this.y) {
            nn1 nn1Var = this.h;
            if (nn1Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131427346, (ViewGroup) cg0Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(nn1Var.m);
                }
                frameLayout.setEnabled(false);
                cg0Var.addHeaderView(frameLayout, null, false);
            }
        }
        lo1Var.p(kn1Var);
        lo1Var.c();
    }

    @Override // defpackage.v33
    public final void dismiss() {
        if (a()) {
            this.m.dismiss();
        }
    }

    @Override // defpackage.po1
    public final void e(oo1 oo1Var) {
        this.s = oo1Var;
    }

    @Override // defpackage.po1
    public final void g() {
        this.v = false;
        kn1 kn1Var = this.i;
        if (kn1Var != null) {
            kn1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.v33
    public final cg0 i() {
        return this.m.h;
    }

    @Override // defpackage.po1
    public final boolean j(na3 na3Var) {
        boolean z;
        if (na3Var.hasVisibleItems()) {
            ho1 ho1Var = new ho1(this.g, na3Var, this.r, this.j, this.l, 0);
            oo1 oo1Var = this.s;
            ho1Var.h = oo1Var;
            fo1 fo1Var = ho1Var.i;
            if (fo1Var != null) {
                fo1Var.e(oo1Var);
            }
            int size = na3Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = na3Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            ho1Var.g = z;
            fo1 fo1Var2 = ho1Var.i;
            if (fo1Var2 != null) {
                fo1Var2.o(z);
            }
            ho1Var.j = this.p;
            this.p = null;
            this.h.c(false);
            lo1 lo1Var = this.m;
            int width = lo1Var.k;
            int iN = lo1Var.n();
            if ((Gravity.getAbsoluteGravity(this.x, this.q.getLayoutDirection()) & 7) == 5) {
                width += this.q.getWidth();
            }
            if (!ho1Var.b()) {
                if (ho1Var.e != null) {
                    ho1Var.d(width, iN, true, true);
                }
            }
            oo1 oo1Var2 = this.s;
            if (oo1Var2 != null) {
                oo1Var2.p(na3Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.po1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.fo1
    public final void n(View view) {
        this.q = view;
    }

    @Override // defpackage.fo1
    public final void o(boolean z) {
        this.i.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.u = true;
        this.h.c(true);
        ViewTreeObserver viewTreeObserver = this.t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.t = this.r.getViewTreeObserver();
            }
            this.t.removeGlobalOnLayoutListener(this.n);
            this.t = null;
        }
        this.r.removeOnAttachStateChangeListener(this.o);
        PopupWindow.OnDismissListener onDismissListener = this.p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.fo1
    public final void p(int i) {
        this.x = i;
    }

    @Override // defpackage.fo1
    public final void q(int i) {
        this.m.k = i;
    }

    @Override // defpackage.fo1
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.p = onDismissListener;
    }

    @Override // defpackage.fo1
    public final void s(boolean z) {
        this.y = z;
    }

    @Override // defpackage.fo1
    public final void t(int i) {
        this.m.g(i);
    }

    @Override // defpackage.fo1
    public final void l(nn1 nn1Var) {
    }
}
