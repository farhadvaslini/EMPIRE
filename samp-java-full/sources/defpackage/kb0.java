package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kb0 extends w implements oy1 {
    public final Window o;
    public final d42 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;

    public kb0(Context context, Window window) {
        super(context);
        this.o = window;
        this.p = b32.w(r51.d);
        WeakHashMap weakHashMap = mq3.a;
        fq3.c(this, this);
        mq3.k(this, new pc(this, 1));
    }

    @Override // defpackage.w
    public final void a(int i, nv0 nv0Var) {
        nv0Var.b0(1735448596);
        int i2 = (nv0Var.h(this) ? 4 : 2) | i;
        if (nv0Var.R(i2 & 1, (i2 & 3) != 2)) {
            ((rs0) this.p.getValue()).f(nv0Var, 0);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new u(i, 11, this);
        }
    }

    @Override // defpackage.oy1
    public final mt3 g(View view, mt3 mt3Var) {
        if (!this.r) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return mt3Var.a.r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return mt3Var;
    }

    @Override // defpackage.w
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.t;
    }

    @Override // defpackage.w
    public final void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // defpackage.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i, int i2) {
        int iA;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.i(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.o;
        if (mode != Integer.MIN_VALUE || this.q || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.r) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iA = ef.a.a(window);
            } else if (i3 < 32) {
                iA = hf.a.a(window);
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iA - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.r || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.q) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
