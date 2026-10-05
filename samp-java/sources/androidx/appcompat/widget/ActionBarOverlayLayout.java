package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import defpackage.at3;
import defpackage.bj3;
import defpackage.bl0;
import defpackage.c;
import defpackage.fq3;
import defpackage.fr3;
import defpackage.gs3;
import defpackage.h31;
import defpackage.j80;
import defpackage.jt3;
import defpackage.mq3;
import defpackage.mt3;
import defpackage.n2;
import defpackage.nn1;
import defpackage.o2;
import defpackage.oo1;
import defpackage.ow1;
import defpackage.p2;
import defpackage.pw1;
import defpackage.q2;
import defpackage.r2;
import defpackage.ri3;
import defpackage.rn;
import defpackage.ts3;
import defpackage.us3;
import defpackage.vs3;
import defpackage.ws3;
import defpackage.xs3;
import defpackage.ys3;
import defpackage.z2;
import defpackage.zs3;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements ow1, pw1 {
    public static final int[] H = {2130903044, R.attr.windowContentOverlay};
    public static final mt3 I;
    public static final Rect J;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final n2 C;
    public final o2 D;
    public final o2 E;
    public final bl0 F;
    public final r2 G;
    public int f;
    public int g;
    public ContentFrameLayout h;
    public ActionBarContainer i;
    public j80 j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public mt3 v;
    public mt3 w;
    public mt3 x;
    public mt3 y;
    public p2 z;

    static {
        int i = Build.VERSION.SDK_INT;
        at3 zs3Var = i >= 36 ? new zs3() : i >= 35 ? new ys3() : i >= 34 ? new xs3() : i >= 31 ? new ws3() : i >= 30 ? new vs3() : i >= 29 ? new us3() : new ts3();
        zs3Var.h(h31.b(0, 1, 0, 1));
        I = zs3Var.b();
        J = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        mt3 mt3Var = mt3.b;
        this.v = mt3Var;
        this.w = mt3Var;
        this.x = mt3Var;
        this.y = mt3Var;
        this.C = new n2(this);
        this.D = new o2(this, 0);
        this.E = new o2(this, 1);
        h(context);
        this.F = new bl0();
        r2 r2Var = new r2(context);
        r2Var.setWillNotDraw(true);
        this.G = r2Var;
        addView(r2Var);
    }

    public static boolean f(View view, Rect rect, boolean z) {
        boolean z2;
        q2 q2Var = (q2) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) q2Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) q2Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) q2Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) q2Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) q2Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) q2Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) q2Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) q2Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.ow1
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.ow1
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.pw1
    public final void c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(nestedScrollView, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof q2;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.k != null) {
            if (this.i.getVisibility() == 0) {
                translationY = (int) (this.i.getTranslationY() + this.i.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.k.setBounds(0, translationY, getWidth(), this.k.getIntrinsicHeight() + translationY);
            this.k.draw(canvas);
        }
    }

    @Override // defpackage.ow1
    public final void e(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(nestedScrollView, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new q2(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new q2(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        bl0 bl0Var = this.F;
        return bl0Var.b | bl0Var.a;
    }

    public CharSequence getTitle() {
        k();
        return ((bj3) this.j).a.getTitle();
    }

    public final void h(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(H);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.k = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.A = new OverScroller(context);
    }

    @Override // defpackage.ow1
    public final boolean i(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((bj3) this.j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((bj3) this.j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        j80 wrapper;
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(2131230760);
            this.i = (ActionBarContainer) findViewById(2131230761);
            KeyEvent.Callback callbackFindViewById = findViewById(2131230759);
            if (callbackFindViewById instanceof j80) {
                wrapper = (j80) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    c.q("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.j = wrapper;
        }
    }

    public final void l(Menu menu, oo1 oo1Var) {
        k();
        bj3 bj3Var = (bj3) this.j;
        Toolbar toolbar = bj3Var.a;
        if (bj3Var.m == null) {
            bj3Var.m = new z2(toolbar.getContext());
        }
        z2 z2Var = bj3Var.m;
        z2Var.j = oo1Var;
        nn1 nn1Var = (nn1) menu;
        if (nn1Var == null && toolbar.f == null) {
            return;
        }
        toolbar.f();
        nn1 nn1Var2 = toolbar.f.u;
        if (nn1Var2 == nn1Var) {
            return;
        }
        if (nn1Var2 != null) {
            nn1Var2.r(toolbar.Q);
            nn1Var2.r(toolbar.R);
        }
        if (toolbar.R == null) {
            toolbar.R = new ri3(toolbar);
        }
        z2Var.v = true;
        Context context = toolbar.o;
        if (nn1Var != null) {
            nn1Var.b(z2Var, context);
            nn1Var.b(toolbar.R, toolbar.o);
        } else {
            z2Var.h(context, null);
            toolbar.R.h(toolbar.o, null);
            z2Var.g();
            toolbar.R.g();
        }
        toolbar.f.setPopupTheme(toolbar.p);
        toolbar.f.setPresenter(z2Var);
        toolbar.Q = z2Var;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        mt3 mt3VarC = mt3.c(windowInsets, this);
        jt3 jt3Var = mt3VarC.a;
        boolean zF = f(this.i, new Rect(jt3Var.n().a, jt3Var.n().b, jt3Var.n().c, jt3Var.n().d), false);
        WeakHashMap weakHashMap = mq3.a;
        Rect rect = this.r;
        fq3.b(this, mt3VarC, rect);
        mt3 mt3VarR = jt3Var.r(rect.left, rect.top, rect.right, rect.bottom);
        this.v = mt3VarR;
        boolean z = true;
        if (!this.w.equals(mt3VarR)) {
            this.w = this.v;
            zF = true;
        }
        Rect rect2 = this.s;
        if (rect2.equals(rect)) {
            z = zF;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return jt3Var.a().a.c().a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h(getContext());
        WeakHashMap weakHashMap = mq3.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                q2 q2Var = (q2) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) q2Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) q2Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.n || !z) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A.getFinalY() > this.i.getHeight()) {
            g();
            this.E.run();
        } else {
            g();
            this.D.run();
        }
        this.o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.p + i2;
        this.p = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        gs3 gs3Var;
        fr3 fr3Var;
        this.F.a = i;
        this.p = getActionBarHideOffset();
        g();
        p2 p2Var = this.z;
        if (p2Var == null || (fr3Var = (gs3Var = (gs3) p2Var).s) == null) {
            return;
        }
        fr3Var.a();
        gs3Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.i.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.n || this.o) {
            return;
        }
        if (this.p <= this.i.getHeight()) {
            g();
            postDelayed(this.D, 600L);
        } else {
            g();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.q ^ i;
        this.q = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        p2 p2Var = this.z;
        if (p2Var != null) {
            gs3 gs3Var = (gs3) p2Var;
            gs3Var.o = !z2;
            if (z || !z2) {
                if (gs3Var.p) {
                    gs3Var.p = false;
                    gs3Var.s(true);
                }
            } else if (!gs3Var.p) {
                gs3Var.p = true;
                gs3Var.s(true);
            }
        }
        if ((i2 & 256) == 0 || this.z == null) {
            return;
        }
        WeakHashMap weakHashMap = mq3.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.g = i;
        p2 p2Var = this.z;
        if (p2Var != null) {
            ((gs3) p2Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        g();
        this.i.setTranslationY(-Math.max(0, Math.min(i, this.i.getHeight())));
    }

    public void setActionBarVisibilityCallback(p2 p2Var) {
        this.z = p2Var;
        if (getWindowToken() != null) {
            ((gs3) this.z).n = this.g;
            int i = this.q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = mq3.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (z) {
                return;
            }
            g();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        bj3 bj3Var = (bj3) this.j;
        bj3Var.d = i != 0 ? rn.C(bj3Var.a.getContext(), i) : null;
        bj3Var.c();
    }

    public void setLogo(int i) {
        k();
        bj3 bj3Var = (bj3) this.j;
        bj3Var.e = i != 0 ? rn.C(bj3Var.a.getContext(), i) : null;
        bj3Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((bj3) this.j).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        bj3 bj3Var = (bj3) this.j;
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

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new q2(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        bj3 bj3Var = (bj3) this.j;
        bj3Var.d = drawable;
        bj3Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.ow1
    public final void d(int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }
}
