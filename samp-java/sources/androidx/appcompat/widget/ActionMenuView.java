package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.a3;
import defpackage.b3;
import defpackage.c3;
import defpackage.ig1;
import defpackage.jg1;
import defpackage.kr3;
import defpackage.ln1;
import defpackage.m22;
import defpackage.mn1;
import defpackage.nn1;
import defpackage.oo1;
import defpackage.so1;
import defpackage.v2;
import defpackage.wi3;
import defpackage.wn1;
import defpackage.y2;
import defpackage.yl1;
import defpackage.z2;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class ActionMenuView extends jg1 implements mn1, so1 {
    public ln1 A;
    public boolean B;
    public int C;
    public final int D;
    public final int E;
    public c3 F;
    public nn1 u;
    public Context v;
    public int w;
    public boolean x;
    public z2 y;
    public wi3 z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.D = (int) (56.0f * f);
        this.E = (int) (f * 4.0f);
        this.v = context;
        this.w = 0;
    }

    public static b3 i() {
        b3 b3Var = new b3(-2, -2);
        b3Var.a = false;
        ((LinearLayout.LayoutParams) b3Var).gravity = 16;
        return b3Var;
    }

    public static b3 j(ViewGroup.LayoutParams layoutParams) {
        b3 b3Var;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof b3) {
            b3 b3Var2 = (b3) layoutParams;
            b3Var = new b3(b3Var2);
            b3Var.a = b3Var2.a;
        } else {
            b3Var = new b3(layoutParams);
        }
        if (((LinearLayout.LayoutParams) b3Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) b3Var).gravity = 16;
        }
        return b3Var;
    }

    @Override // defpackage.mn1
    public final boolean a(wn1 wn1Var) {
        return this.u.q(wn1Var, null, 0);
    }

    @Override // defpackage.so1
    public final void b(nn1 nn1Var) {
        this.u = nn1Var;
    }

    @Override // defpackage.jg1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b3;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.jg1
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ ig1 generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.jg1
    /* JADX INFO: renamed from: f */
    public final ig1 generateLayoutParams(AttributeSet attributeSet) {
        return new b3(getContext(), attributeSet);
    }

    @Override // defpackage.jg1
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ ig1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // defpackage.jg1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.jg1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b3(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.u == null) {
            Context context = getContext();
            nn1 nn1Var = new nn1(context);
            this.u = nn1Var;
            nn1Var.e = new yl1(3, this);
            z2 z2Var = new z2(context);
            this.y = z2Var;
            z2Var.q = true;
            z2Var.r = true;
            oo1 m22Var = this.z;
            if (m22Var == null) {
                m22Var = new m22(22);
            }
            z2Var.j = m22Var;
            this.u.b(z2Var, this.v);
            z2 z2Var2 = this.y;
            z2Var2.m = this;
            this.u = z2Var2.h;
        }
        return this.u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        z2 z2Var = this.y;
        y2 y2Var = z2Var.n;
        if (y2Var != null) {
            return y2Var.getDrawable();
        }
        if (z2Var.p) {
            return z2Var.o;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a3)) {
            zB = ((a3) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof a3)) ? zB : ((a3) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z2 z2Var = this.y;
        if (z2Var != null) {
            z2Var.g();
            if (this.y.i()) {
                this.y.c();
                this.y.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.y;
        if (z2Var != null) {
            z2Var.c();
            v2 v2Var = z2Var.y;
            if (v2Var == null || !v2Var.b()) {
                return;
            }
            v2Var.i.dismiss();
        }
    }

    @Override // defpackage.jg1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = kr3.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                b3 b3Var = (b3) childAt.getLayoutParams();
                if (b3Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) b3Var).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) b3Var).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) b3Var).leftMargin) + ((LinearLayout.LayoutParams) b3Var).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                b3 b3Var2 = (b3) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !b3Var2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) b3Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) b3Var2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            b3 b3Var3 = (b3) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !b3Var3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) b3Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) b3Var3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.jg1, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        nn1 nn1Var;
        boolean z = this.B;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.B = z2;
        if (z != z2) {
            this.C = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.B && (nn1Var = this.u) != null && size != this.C) {
            this.C = size;
            nn1Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.B || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                b3 b3Var = (b3) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) b3Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) b3Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.D;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.E;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                b3 b3Var2 = (b3) childAt.getLayoutParams();
                b3Var2.f = false;
                b3Var2.c = 0;
                b3Var2.b = 0;
                b3Var2.d = false;
                ((LinearLayout.LayoutParams) b3Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) b3Var2).rightMargin = 0;
                b3Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = b3Var2.a ? 1 : i10;
                b3 b3Var3 = (b3) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                b3Var3.d = !b3Var3.a && z6;
                b3Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (b3Var2.d) {
                    i15++;
                }
                if (b3Var2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (i15 > 0 && i23 > 0) {
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                b3 b3Var4 = (b3) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (b3Var4.d) {
                    int i28 = b3Var4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                b3 b3Var5 = (b3) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && b3Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    b3Var5.b += r11;
                    b3Var5.f = r11;
                    i23--;
                } else if (b3Var5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        i4 = iMax;
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((b3) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((b3) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    b3 b3Var6 = (b3) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        b3Var6.c = i32;
                        b3Var6.f = true;
                        if (i33 == 0 && !b3Var6.e) {
                            ((LinearLayout.LayoutParams) b3Var6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (b3Var6.a) {
                        b3Var6.c = i32;
                        b3Var6.f = true;
                        ((LinearLayout.LayoutParams) b3Var6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) b3Var6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) b3Var6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                b3 b3Var7 = (b3) childAt4.getLayoutParams();
                if (b3Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((b3Var7.b * i22) + b3Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.y.v = z;
    }

    public void setOnMenuItemClickListener(c3 c3Var) {
        this.F = c3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        z2 z2Var = this.y;
        y2 y2Var = z2Var.n;
        if (y2Var != null) {
            y2Var.setImageDrawable(drawable);
        } else {
            z2Var.p = true;
            z2Var.o = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.x = z;
    }

    public void setPopupTheme(int i) {
        if (this.w != i) {
            this.w = i;
            if (i == 0) {
                this.v = getContext();
            } else {
                this.v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(z2 z2Var) {
        this.y = z2Var;
        z2Var.m = this;
        this.u = z2Var.h;
    }

    @Override // defpackage.jg1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
