package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gs3 extends j2 implements p2 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public j80 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public fs3 i;
    public fs3 j;
    public a31 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public fr3 s;
    public boolean t;
    public boolean u;
    public final es3 v;
    public final es3 w;
    public final op3 x;

    public gs3(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new es3(this, 0);
        this.w = new es3(this, 1);
        this.x = new op3(this);
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.j2
    public final boolean b() {
        ri3 ri3Var;
        j80 j80Var = this.e;
        if (j80Var == null || (ri3Var = ((bj3) j80Var).a.R) == null || ri3Var.g == null) {
            return false;
        }
        ri3 ri3Var2 = ((bj3) j80Var).a.R;
        wn1 wn1Var = ri3Var2 == null ? null : ri3Var2.g;
        if (wn1Var == null) {
            return true;
        }
        wn1Var.collapseActionView();
        return true;
    }

    @Override // defpackage.j2
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        qn1.b();
    }

    @Override // defpackage.j2
    public final int d() {
        return ((bj3) this.e).b;
    }

    @Override // defpackage.j2
    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(top.th1nk.samp.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // defpackage.j2
    public final void g() {
        r(this.a.getResources().getBoolean(top.th1nk.samp.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.j2
    public final boolean i(int i, KeyEvent keyEvent) {
        nn1 nn1Var;
        fs3 fs3Var = this.i;
        if (fs3Var == null || (nn1Var = fs3Var.i) == null) {
            return false;
        }
        nn1Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return nn1Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.j2
    public final void l(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        bj3 bj3Var = (bj3) this.e;
        int i2 = bj3Var.b;
        this.h = true;
        bj3Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.j2
    public final void m(boolean z2) {
        fr3 fr3Var;
        this.t = z2;
        if (z2 || (fr3Var = this.s) == null) {
            return;
        }
        fr3Var.a();
    }

    @Override // defpackage.j2
    public final void n(CharSequence charSequence) {
        bj3 bj3Var = (bj3) this.e;
        if (bj3Var.g) {
            return;
        }
        Toolbar toolbar = bj3Var.a;
        bj3Var.h = charSequence;
        if ((bj3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (bj3Var.g) {
                mq3.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.j2
    public final e3 o(a31 a31Var) {
        fs3 fs3Var = this.i;
        if (fs3Var != null) {
            fs3Var.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.e();
        fs3 fs3Var2 = new fs3(this, this.f.getContext(), a31Var);
        nn1 nn1Var = fs3Var2.i;
        nn1Var.w();
        try {
            if (!((d3) fs3Var2.j.g).d(fs3Var2, nn1Var)) {
                return null;
            }
            this.i = fs3Var2;
            fs3Var2.h();
            this.f.c(fs3Var2);
            p(true);
            return fs3Var2;
        } finally {
            nn1Var.v();
        }
    }

    public final void p(boolean z2) {
        er3 er3VarI;
        er3 er3VarI2;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                s(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            s(false);
        }
        boolean zIsLaidOut = this.d.isLaidOut();
        j80 j80Var = this.e;
        if (!zIsLaidOut) {
            if (z2) {
                ((bj3) j80Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((bj3) j80Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            bj3 bj3Var = (bj3) j80Var;
            er3VarI = mq3.a(bj3Var.a);
            er3VarI.a(0.0f);
            er3VarI.c(100L);
            er3VarI.d(new aj3(bj3Var, 4));
            er3VarI2 = this.f.i(0, 200L);
        } else {
            bj3 bj3Var2 = (bj3) j80Var;
            er3 er3VarA = mq3.a(bj3Var2.a);
            er3VarA.a(1.0f);
            er3VarA.c(200L);
            er3VarA.d(new aj3(bj3Var2, 0));
            er3VarI = this.f.i(8, 100L);
            er3VarI2 = er3VarA;
        }
        fr3 fr3Var = new fr3();
        ArrayList arrayList = fr3Var.a;
        arrayList.add(er3VarI);
        View view = (View) er3VarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) er3VarI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(er3VarI2);
        fr3Var.b();
    }

    public final void q(View view) {
        j80 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(top.th1nk.samp.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(top.th1nk.samp.R.id.action_bar);
        if (callbackFindViewById instanceof j80) {
            wrapper = (j80) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(top.th1nk.samp.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(top.th1nk.samp.R.id.action_bar_container);
        this.d = actionBarContainer;
        j80 j80Var = this.e;
        if (j80Var == null || this.f == null || actionBarContainer == null) {
            c.q(gs3.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((bj3) j80Var).a.getContext();
        this.a = context;
        if ((((bj3) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        r(context.getResources().getBoolean(top.th1nk.samp.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, pf2.a, top.th1nk.samp.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.l) {
                c.q("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = mq3.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void r(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((bj3) this.e).getClass();
        } else {
            ((bj3) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((bj3) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void s(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        final op3 op3Var = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                fr3 fr3Var = this.s;
                if (fr3Var != null) {
                    fr3Var.a();
                }
                int i = this.n;
                es3 es3Var = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    es3Var.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                fr3 fr3Var2 = new fr3();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                er3 er3VarA = mq3.a(this.d);
                er3VarA.e(f);
                final View view2 = (View) er3VarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(op3Var != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: dr3
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((gs3) this.a.a).d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z5 = fr3Var2.e;
                ArrayList arrayList = fr3Var2.a;
                if (!z5) {
                    arrayList.add(er3VarA);
                }
                if (this.o && view != null) {
                    er3 er3VarA2 = mq3.a(view);
                    er3VarA2.e(f);
                    if (!fr3Var2.e) {
                        arrayList.add(er3VarA2);
                    }
                }
                boolean z6 = fr3Var2.e;
                if (!z6) {
                    fr3Var2.c = y;
                }
                if (!z6) {
                    fr3Var2.b = 250L;
                }
                if (!z6) {
                    fr3Var2.d = es3Var;
                }
                this.s = fr3Var2;
                fr3Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        fr3 fr3Var3 = this.s;
        if (fr3Var3 != null) {
            fr3Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        es3 es3Var2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            fr3 fr3Var4 = new fr3();
            er3 er3VarA3 = mq3.a(this.d);
            er3VarA3.e(0.0f);
            final View view3 = (View) er3VarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(op3Var != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: dr3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((gs3) this.a.a).d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z7 = fr3Var4.e;
            ArrayList arrayList2 = fr3Var4.a;
            if (!z7) {
                arrayList2.add(er3VarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                er3 er3VarA4 = mq3.a(view);
                er3VarA4.e(0.0f);
                if (!fr3Var4.e) {
                    arrayList2.add(er3VarA4);
                }
            }
            boolean z8 = fr3Var4.e;
            if (!z8) {
                fr3Var4.c = z;
            }
            if (!z8) {
                fr3Var4.b = 250L;
            }
            if (!z8) {
                fr3Var4.d = es3Var2;
            }
            this.s = fr3Var4;
            fr3Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            es3Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = mq3.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public gs3(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new es3(this, 0);
        this.w = new es3(this, 1);
        this.x = new op3(this);
        q(dialog.getWindow().getDecorView());
    }
}
