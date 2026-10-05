package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class tc extends ViewGroup implements pw1, j10, r12, oy1 {
    public static final u0 F = new u0(10);
    public int A;
    public int B;
    public final bl0 C;
    public boolean D;
    public final tb1 E;
    public final gw1 f;
    public final View g;
    public final q12 h;
    public cs0 i;
    public boolean j;
    public cs0 k;
    public cs0 l;
    public bq1 m;
    public ns0 n;
    public ua0 o;
    public ns0 p;
    public of1 q;
    public wq2 r;
    public final int[] s;
    public long t;
    public mt3 u;
    public ns0 v;
    public final oc w;
    public final oc x;
    public ns0 y;
    public final int[] z;

    public tc(Context context, lv0 lv0Var, int i, gw1 gw1Var, View view, q12 q12Var) {
        super(context);
        this.f = gw1Var;
        this.g = view;
        this.h = q12Var;
        is1 is1Var = gu3.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, lv0Var);
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        pq3 pq3Var = (pq3) this;
        mq3.k(this, new pc(pq3Var, i2));
        fq3.c(this, this);
        this.i = new v3(13);
        this.k = new v3(13);
        this.l = new v3(13);
        yp1 yp1Var = yp1.a;
        this.m = yp1Var;
        this.o = lq.h();
        this.s = new int[2];
        this.t = 0L;
        this.w = new oc(pq3Var, i2);
        int i3 = 1;
        this.x = new oc(pq3Var, i3);
        this.z = new int[2];
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = new bl0();
        tb1 tb1Var = new tb1(3);
        tb1Var.u = pq3Var;
        bq1 bq1VarA = su2.a(r51.v(yp1Var, n92.a, gw1Var), true, new u0(11));
        mb2 mb2Var = new mb2();
        mb2Var.a = new mc(pq3Var, 2);
        va vaVar = new va();
        va vaVar2 = mb2Var.b;
        if (vaVar2 != null) {
            vaVar2.g = null;
        }
        mb2Var.b = vaVar;
        vaVar.g = mb2Var;
        setOnRequestDisallowInterceptTouchEvent$ui(vaVar);
        bq1 bq1VarD = n92.u(w7.K(bq1VarA.d(mb2Var), new v1(pq3Var, tb1Var, pq3Var, i3)), new nc(pq3Var, tb1Var, i3)).d(new mo(new mc(pq3Var, i2)));
        tb1Var.g0(this.m.d(bq1VarD));
        this.n = new i(4, tb1Var, bq1VarD);
        tb1Var.c0(this.o);
        this.p = new s(9, tb1Var);
        tb1Var.S = new nc(pq3Var, tb1Var, i2);
        tb1Var.T = new mc(pq3Var, i3);
        tb1Var.f0(new qc(pq3Var, tb1Var));
        this.E = tb1Var;
    }

    private final t12 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            m21.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((h7) this.h).getSnapshotObserver();
    }

    public static void j(pq3 pq3Var) {
        if (pq3Var.j && pq3Var.isAttachedToWindow() && pq3Var.g.getParent() == pq3Var) {
            t12 snapshotObserver = pq3Var.getSnapshotObserver();
            snapshotObserver.a.d(pq3Var, F, pq3Var.i);
        }
    }

    public static final int k(pq3 pq3Var, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(y02.h(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static h31 l(h31 h31Var, int i, int i2, int i3, int i4) {
        int i5 = h31Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = h31Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = h31Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = h31Var.d - i4;
        return h31.b(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    @Override // defpackage.r12
    public final boolean U() {
        return isAttachedToWindow();
    }

    @Override // defpackage.ow1
    public final void a(View view, View view2, int i, int i2) {
        bl0 bl0Var = this.C;
        if (i2 == 1) {
            bl0Var.b = i;
        } else {
            bl0Var.a = i;
        }
    }

    @Override // defpackage.ow1
    public final void b(View view, int i) {
        bl0 bl0Var = this.C;
        if (i == 1) {
            bl0Var.b = 0;
        } else {
            bl0Var.a = 0;
        }
    }

    @Override // defpackage.pw1
    public final void c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.g.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            kw1 kw1Var = this.f.a;
            kw1 kw1VarQ1 = kw1Var != null ? kw1Var.q1() : null;
            long jL0 = kw1VarQ1 != null ? kw1VarQ1.l0(jFloatToRawIntBits, i6, jFloatToRawIntBits2) : 0L;
            iArr[0] = vm1.M(Float.intBitsToFloat((int) (jL0 >> 32))) * (-1);
            iArr[1] = vm1.M(Float.intBitsToFloat((int) (jL0 & 4294967295L))) * (-1);
        }
    }

    @Override // defpackage.ow1
    public final void d(int i, int i2, int[] iArr, int i3) {
        if (this.g.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32);
            int i4 = i3 == 0 ? 1 : 2;
            kw1 kw1Var = this.f.a;
            kw1 kw1VarQ1 = kw1Var != null ? kw1Var.q1() : null;
            long jQ0 = kw1VarQ1 != null ? kw1VarQ1.Q0(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = vm1.M(Float.intBitsToFloat((int) (jQ0 >> 32))) * (-1);
            iArr[1] = vm1.M(Float.intBitsToFloat((int) (jQ0 & 4294967295L))) * (-1);
        }
    }

    @Override // defpackage.ow1
    public final void e(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (this.g.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            kw1 kw1Var = this.f.a;
            kw1 kw1VarQ1 = kw1Var != null ? kw1Var.q1() : null;
            if (kw1VarQ1 != null) {
                kw1VarQ1.l0(jFloatToRawIntBits, i6, jFloatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.j10
    public final void f() {
        this.l.a();
    }

    @Override // defpackage.oy1
    public final mt3 g(View view, mt3 mt3Var) {
        this.u = new mt3(mt3Var);
        return m(mt3Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.z;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final ua0 getDensity() {
        return this.o;
    }

    public final View getInteropView() {
        return this.g;
    }

    public final tb1 getLayoutNode() {
        return this.E;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final of1 getLifecycleOwner() {
        return this.q;
    }

    public final bq1 getModifier() {
        return this.m;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        bl0 bl0Var = this.C;
        return bl0Var.b | bl0Var.a;
    }

    public final ns0 getOnDensityChanged$ui() {
        return this.p;
    }

    public final ns0 getOnModifierChanged$ui() {
        return this.n;
    }

    public final ns0 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.y;
    }

    public final cs0 getRelease() {
        return this.l;
    }

    public final cs0 getReset() {
        return this.k;
    }

    public final wq2 getSavedStateRegistryOwner() {
        return this.r;
    }

    public final cs0 getUpdate() {
        return this.i;
    }

    public final View getView() {
        return this.g;
    }

    @Override // defpackage.j10
    public final void h() {
        this.k.a();
        removeAllViewsInLayout();
    }

    @Override // defpackage.ow1
    public final boolean i(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.D) {
            this.E.C();
            return null;
        }
        this.g.postOnAnimation(new v6(this.x, 3));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.g.isNestedScrollingEnabled();
    }

    public final mt3 m(mt3 mt3Var) {
        jt3 jt3Var = mt3Var.a;
        h31 h31VarI = jt3Var.i(-1);
        h31 h31Var = h31.e;
        if (!h31VarI.equals(h31Var) || !jt3Var.j(-9).equals(h31Var) || jt3Var.h() != null) {
            s21 s21Var = this.E.L.c;
            if (s21Var.i0.s) {
                long jH = uq.H(s21Var.k0(0L));
                int i = (int) (jH >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jH & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jI0 = vr.y(s21Var).i0();
                int i3 = (int) (jI0 >> 32);
                int i4 = (int) (jI0 & 4294967295L);
                long j = s21Var.h;
                long jH2 = uq.H(s21Var.k0((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jH2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jH2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return mt3Var.a.r(i, i2, i5, i7);
                }
            }
        }
        return mt3Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.D) {
            this.E.C();
        } else {
            this.g.postOnAnimation(new v6(this.x, 3));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.g.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.g;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.A = i;
        this.B = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.g.isNestedScrollingEnabled()) {
            return false;
        }
        cl3.t(this.f.c(), null, new rc(z, this, d32.h(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.g.isNestedScrollingEnabled()) {
            return false;
        }
        cl3.t(this.f.c(), null, new sc(this, d32.h(f * (-1.0f), f2 * (-1.0f)), null, 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        ns0 ns0Var = this.v;
        if (ns0Var == null) {
            return true;
        }
        ns0Var.h(rect != null ? new jk2(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ns0 ns0Var = this.y;
        if (ns0Var != null) {
            ns0Var.h(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(ua0 ua0Var) {
        if (ua0Var != this.o) {
            this.o = ua0Var;
            ns0 ns0Var = this.p;
            if (ns0Var != null) {
                ns0Var.h(ua0Var);
            }
        }
    }

    public final void setLifecycleOwner(of1 of1Var) {
        if (of1Var != this.q) {
            this.q = of1Var;
            setTag(R.id.view_tree_lifecycle_owner, of1Var);
        }
    }

    public final void setModifier(bq1 bq1Var) {
        if (bq1Var != this.m) {
            this.m = bq1Var;
            ns0 ns0Var = this.n;
            if (ns0Var != null) {
                ns0Var.h(bq1Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(ns0 ns0Var) {
        this.p = ns0Var;
    }

    public final void setOnModifierChanged$ui(ns0 ns0Var) {
        this.n = ns0Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(ns0 ns0Var) {
        this.y = ns0Var;
    }

    public final void setRelease(cs0 cs0Var) {
        this.l = cs0Var;
    }

    public final void setReset(cs0 cs0Var) {
        this.k = cs0Var;
    }

    public final void setSavedStateRegistryOwner(wq2 wq2Var) {
        if (wq2Var != this.r) {
            this.r = wq2Var;
            setTag(R.id.view_tree_saved_state_registry_owner, wq2Var);
        }
    }

    public final void setUpdate(cs0 cs0Var) {
        this.i = cs0Var;
        this.j = true;
        this.w.a();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
