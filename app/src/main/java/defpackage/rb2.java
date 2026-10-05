package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.UUID;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rb2 extends w {
    public static final s12 I = new s12(18);
    public m41 A;
    public final cb0 B;
    public final Rect C;
    public final p73 D;
    public mf E;
    public final d42 F;
    public boolean G;
    public final int[] H;
    public cs0 o;
    public vb2 p;
    public String q;
    public final View r;
    public final boolean s;
    public final h01 t;
    public final WindowManager u;
    public final WindowManager.LayoutParams v;
    public ub2 w;
    public bb1 x;
    public final d42 y;
    public final d42 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb2(cs0 cs0Var, vb2 vb2Var, String str, View view, ua0 ua0Var, ub2 ub2Var, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        int i2 = 21;
        h01 tb2Var = i >= 30 ? new tb2(i2) : i >= 29 ? new sb2(i2) : new h01(i2);
        this.o = cs0Var;
        this.p = vb2Var;
        this.q = str;
        this.r = view;
        this.s = z;
        this.t = tb2Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.u = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        vb2 vb2Var2 = this.p;
        boolean zB = xa.b(view);
        boolean z2 = vb2Var2.b;
        int i3 = vb2Var2.a;
        if (z2 && zB) {
            i3 |= 8192;
        } else if (z2 && !zB) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = this.p.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.v = layoutParams;
        this.w = ub2Var;
        this.x = bb1.f;
        this.y = b32.w(null);
        this.z = b32.w(null);
        this.B = b32.j(new it1(6, this));
        this.C = new Rect();
        this.D = new p73(new oa(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, b32.m(view));
        setTag(R.id.view_tree_view_model_store_owner, n32.n(view));
        setTag(R.id.view_tree_saved_state_registry_owner, d32.o(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(ua0Var.T(8.0f));
        setOutlineProvider(new ob0(2));
        this.F = b32.w(s51.b);
        this.H = new int[2];
    }

    private final rs0 getContent() {
        return (rs0) this.F.getValue();
    }

    private final m41 getDisplayBounds() {
        int i = this.p.a & 512;
        View view = this.r;
        Rect rect = this.C;
        h01 h01Var = this.t;
        if (i == 0) {
            h01Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            h01Var.u(view, rect);
        }
        return new m41(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final ab1 getParentLayoutCoordinates() {
        return (ab1) this.z.getValue();
    }

    public static boolean m(rb2 rb2Var) {
        ab1 parentLayoutCoordinates = rb2Var.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.t0()) {
            parentLayoutCoordinates = null;
        }
        return (parentLayoutCoordinates == null || rb2Var.m9getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    private final void setContent(rs0 rs0Var) {
        this.F.setValue(rs0Var);
    }

    private final void setParentLayoutCoordinates(ab1 ab1Var) {
        this.z.setValue(ab1Var);
    }

    @Override // defpackage.w
    public final void a(int i, nv0 nv0Var) {
        nv0Var.b0(-857613600);
        int i2 = (nv0Var.h(this) ? 4 : 2) | i;
        if (nv0Var.R(i2 & 1, (i2 & 3) != 2)) {
            getContent().f(nv0Var, 0);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new u(i, 24, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.p.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                cs0 cs0Var = this.o;
                if (cs0Var != null) {
                    cs0Var.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.v;
    }

    public final bb1 getParentLayoutDirection() {
        return this.x;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final p41 m9getPopupContentSizebOM6tXw() {
        return (p41) this.y.getValue();
    }

    public final ub2 getPositionProvider() {
        return this.w;
    }

    @Override // defpackage.w
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.G;
    }

    public final String getTestTag() {
        return this.q;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.w
    public final void h(boolean z, int i, int i2, int i3, int i4) {
        super.h(z, i, i2, i3, i4);
        this.p.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.t.getClass();
        this.u.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.w
    public final void i(int i, int i2) {
        this.p.getClass();
        m41 displayBounds = getDisplayBounds();
        super.i(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    public final void n(g20 g20Var, rs0 rs0Var) {
        setParentCompositionContext(g20Var);
        setContent(rs0Var);
        this.G = true;
    }

    public final void o(cs0 cs0Var, vb2 vb2Var, String str, bb1 bb1Var) {
        int i;
        this.o = cs0Var;
        this.q = str;
        if (!s51.n(this.p, vb2Var)) {
            vb2Var.getClass();
            this.p = vb2Var;
            boolean zB = xa.b(this.r);
            boolean z = vb2Var.b;
            int i2 = vb2Var.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.v;
            layoutParams.flags = i2;
            this.t.getClass();
            this.u.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = bb1Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                c.k();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // defpackage.w, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D.e();
        if (!this.p.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.E == null) {
            this.E = new mf(0, this.o);
        }
        p1.h(this, this.E);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p73 p73Var = this.D;
        b4 b4Var = p73Var.h;
        if (b4Var != null) {
            b4Var.b();
        }
        p73Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            p1.i(this, this.E);
        }
        this.E = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.p.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            cs0 cs0Var = this.o;
            if (cs0Var != null) {
                cs0Var.a();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            cs0 cs0Var2 = this.o;
            if (cs0Var2 != null) {
                cs0Var2.a();
            }
        }
        return true;
    }

    public final void p() {
        ab1 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.t0()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jI0 = parentLayoutCoordinates.i0();
            long jI = this.s ? parentLayoutCoordinates.i(0L) : parentLayoutCoordinates.D(0L);
            m41 m41VarD = br.d((((long) Math.round(Float.intBitsToFloat((int) (jI >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jI & 4294967295L))))), jI0);
            if (m41VarD.equals(this.A)) {
                return;
            }
            this.A = m41VarD;
            r();
        }
    }

    public final void q(ab1 ab1Var) {
        setParentLayoutCoordinates(ab1Var);
        p();
    }

    public final void r() {
        p41 p41VarM9getPopupContentSizebOM6tXw;
        final m41 m41Var = this.A;
        if (m41Var == null || (p41VarM9getPopupContentSizebOM6tXw = m9getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = p41VarM9getPopupContentSizebOM6tXw.a;
        m41 displayBounds = getDisplayBounds();
        final long jB = (((long) displayBounds.b()) & 4294967295L) | (((long) displayBounds.d()) << 32);
        final pk2 pk2Var = new pk2();
        pk2Var.f = 0L;
        this.D.d(this, I, new cs0() { // from class: qb2
            @Override // defpackage.cs0
            public final Object a() {
                rb2 rb2Var = this;
                pk2Var.f = rb2Var.w.a(m41Var, jB, rb2Var.x, j);
                return dm3.a;
            }
        });
        long j2 = pk2Var.f;
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.p.e;
        h01 h01Var = this.t;
        if (z) {
            h01Var.y(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        h01Var.getClass();
        this.u.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(bb1 bb1Var) {
        this.x = bb1Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m10setPopupContentSizefhxjrPA(p41 p41Var) {
        this.y.setValue(p41Var);
    }

    public final void setPositionProvider(ub2 ub2Var) {
        this.w = ub2Var;
    }

    public final void setTestTag(String str) {
        this.q = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public w getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
