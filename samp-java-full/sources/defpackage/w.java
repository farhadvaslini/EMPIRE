package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class w extends ViewGroup {
    public WeakReference f;
    public IBinder g;
    public tu3 h;
    public g20 i;
    public a20 j;
    public ok k;
    public boolean l;
    public boolean m;
    public boolean n;

    public w(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        e9 e9Var = new e9(3, this);
        addOnAttachStateChangeListener(e9Var);
        qn1 qn1Var = new qn1(19);
        oz2.u(this).a.add(qn1Var);
        this.k = new ok(this, e9Var, qn1Var, 23);
    }

    private final void setParentContext(g20 g20Var) {
        if (this.i != g20Var) {
            this.i = g20Var;
            if (g20Var != null) {
                this.f = null;
            }
            tu3 tu3Var = this.h;
            if (tu3Var != null) {
                tu3Var.a();
                this.h = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.g != iBinder) {
            this.g = iBinder;
            this.f = null;
        }
    }

    public abstract void a(int i, nv0 nv0Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.j == null) {
                h7 h7Var = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof h7) {
                        h7Var = (h7) childAt;
                    }
                }
                if (h7Var != null) {
                    h7Var.setComposeViewContext(l(br.u(this), h7Var.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (!this.m) {
            throw new UnsupportedOperationException(nc2.i("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
        }
    }

    public final void d() {
        a20 a20Var;
        View view;
        if (this.i == null && !isAttachedToWindow() && ((a20Var = this.j) == null || (view = a20Var.a) == null || !view.isAttachedToWindow())) {
            c.q("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            f();
        }
    }

    public final void e() {
        View childAt = getChildAt(0);
        h7 h7Var = childAt instanceof h7 ? (h7) childAt : null;
        if (h7Var != null && h7Var.I0) {
            h7Var.getComposeViewContext().b();
            h7Var.I0 = false;
        }
        tu3 tu3Var = this.h;
        if (tu3Var != null) {
            tu3Var.a();
        }
        this.h = null;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        if (this.h == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.m = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    a20 a20VarJ = this.j;
                    if (a20VarJ == null) {
                        a20VarJ = j();
                    }
                    this.h = wu3.a(this, a20VarJ, new d00(1003123809, new u(objArr == true ? 1 : 0, this), true));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.m = false;
            }
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m11getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        ck ckVar = tag instanceof ck ? (ck) tag : null;
        if (ckVar != null) {
            return ckVar.a;
        }
        return 1;
    }

    public final a20 getComposeViewContext$ui() {
        return this.j;
    }

    public final boolean getHasComposition() {
        return this.h != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.l;
    }

    public void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void i(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.n || super.isTransitionGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a20 j() {
        a20 composeViewContext;
        cr3 cr3Var;
        cr3 cr3Var2 = null;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            h7 h7Var = childAt instanceof h7 ? (h7) childAt : null;
            if (h7Var != null) {
                composeViewContext = h7Var.getComposeViewContext();
            }
        }
        View viewU = br.u(this);
        a20 a20VarB = br.B(viewU);
        if (a20VarB != null) {
            return l(viewU, a20VarB);
        }
        g20 g20VarK = k();
        of1 of1VarM = b32.m(viewU);
        if (of1VarM == null) {
            of1VarM = composeViewContext != null ? composeViewContext.d() : null;
            if (of1VarM == null) {
                c.q("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        of1 of1Var = of1VarM;
        wq2 wq2VarO = d32.o(viewU);
        if (wq2VarO == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                wq2VarO = composeViewContext.e;
                wq2VarO.getClass();
            } else {
                wq2VarO = null;
            }
            if (wq2VarO == null) {
                c.q("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        wq2 wq2Var = wq2VarO;
        cr3 cr3VarN = n32.n(viewU);
        if (cr3VarN == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                cr3Var2 = composeViewContext.f;
            }
            cr3Var = cr3Var2;
        } else {
            cr3Var = cr3VarN;
        }
        a20 a20Var = new a20(br.B(br.u(viewU)), viewU, g20VarK, of1Var, wq2Var, cr3Var);
        viewU.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(a20Var));
        return a20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Type inference failed for: r0v0, types: [g20] */
    /* JADX WARN: Type inference failed for: r0v1, types: [g20] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [g20] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [ek2] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g20 k() {
        g20 g20Var;
        ?? A = this.i;
        if (A == 0) {
            A = gu3.a(this);
            if (A == 0) {
                Object parent = getParent();
                A = A;
                while (A == 0 && (parent instanceof View)) {
                    View view = (View) parent;
                    g20 g20VarA = gu3.a(view);
                    parent = w22.u(view);
                    A = g20VarA;
                }
            }
            bk2 bk2Var = bk2.g;
            if (A != 0) {
                ?? r3 = (!(A instanceof ek2) || ((bk2) ((ek2) A).u.getValue()).compareTo(bk2Var) > 0) ? A : 0;
                if (r3 != 0) {
                    this.f = new WeakReference(r3);
                }
            } else {
                A = 0;
            }
            if (A == 0) {
                WeakReference weakReference = this.f;
                if (weakReference == null || (g20Var = (g20) weakReference.get()) == null) {
                    A = 0;
                    if (A == 0) {
                        A = gu3.b(this);
                        ?? r2 = ((bk2) A.u.getValue()).compareTo(bk2Var) > 0 ? A : 0;
                        if (r2 != 0) {
                            this.f = new WeakReference(r2);
                        }
                    }
                } else {
                    boolean z = g20Var instanceof ek2;
                    A = g20Var;
                    if (z) {
                        int iCompareTo = ((bk2) ((ek2) g20Var).u.getValue()).compareTo(bk2Var);
                        A = g20Var;
                        if (iCompareTo <= 0) {
                        }
                    }
                    if (A == 0) {
                    }
                }
            }
        }
        return A;
    }

    public final a20 l(View view, a20 a20Var) {
        g20 g20VarK = k();
        of1 of1VarM = b32.m(view);
        cr3 cr3VarN = n32.n(view);
        wq2 wq2VarO = d32.o(view);
        if (g20VarK == a20Var.c() && of1VarM == a20Var.d()) {
            a20Var.g();
            if (cr3VarN == a20Var.f) {
                a20Var.g();
                wq2 wq2Var = a20Var.e;
                wq2Var.getClass();
                if (wq2VarO == wq2Var) {
                    return a20Var;
                }
            }
        }
        if (g20VarK.j() != a20Var.c().j()) {
            e();
        }
        if (of1VarM == null) {
            of1VarM = a20Var.d();
        }
        of1 of1Var = of1VarM;
        if (wq2VarO == null) {
            a20Var.g();
            wq2VarO = a20Var.e;
            wq2VarO.getClass();
        }
        a20 a20Var2 = new a20(a20Var, view, g20VarK, of1Var, wq2VarO, cr3VarN);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(a20Var2));
        return a20Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        is1 is1Var = gu3.a;
        Object objU = w22.u(this);
        View view = this;
        while (objU instanceof View) {
            View view2 = (View) objU;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objU = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new v(0, this));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        i(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m12setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new ck(i));
    }

    public final void setComposeViewContext$ui(a20 a20Var) {
        if (this.j != a20Var) {
            if (a20Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                h7 h7Var = childAt instanceof h7 ? (h7) childAt : null;
                if (h7Var != null) {
                    if (h7Var.getCoroutineContext() != a20Var.c().j()) {
                        e();
                    }
                    h7Var.setComposeViewContext(a20Var);
                }
            }
            this.j = a20Var;
        }
    }

    public final void setParentCompositionContext(g20 g20Var) {
        setParentContext(g20Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.l = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((h7) ((q12) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.n = true;
    }

    public final void setViewCompositionStrategy(nq3 nq3Var) {
        ok okVar = this.k;
        if (okVar != null) {
            okVar.a();
        }
        ((y02) nq3Var).getClass();
        e9 e9Var = new e9(3, this);
        addOnAttachStateChangeListener(e9Var);
        qn1 qn1Var = new qn1(19);
        oz2.u(this).a.add(qn1Var);
        this.k = new ok(this, e9Var, qn1Var, 23);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
