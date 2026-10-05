package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class jg1 extends ViewGroup {
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public int[] n;
    public int[] o;
    public Drawable p;
    public int q;
    public int r;
    public int s;
    public int t;

    public jg1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = true;
        this.g = -1;
        this.h = 0;
        this.j = 8388659;
        int[] iArr = pf2.n;
        pi piVarH = pi.H(context, attributeSet, iArr, 0);
        mq3.h(this, context, iArr, attributeSet, (TypedArray) piVarH.g, 0);
        TypedArray typedArray = (TypedArray) piVarH.g;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.l = typedArray.getFloat(4, -1.0f);
        this.g = typedArray.getInt(3, -1);
        this.m = typedArray.getBoolean(7, false);
        setDividerDrawable(piVarH.p(5));
        this.s = typedArray.getInt(8, 0);
        this.t = typedArray.getDimensionPixelSize(6, 0);
        piVarH.J();
    }

    public final void c(Canvas canvas, int i) {
        this.p.setBounds(getPaddingLeft() + this.t, i, (getWidth() - getPaddingRight()) - this.t, this.r + i);
        this.p.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ig1;
    }

    public final void d(Canvas canvas, int i) {
        this.p.setBounds(i, getPaddingTop() + this.t, this.q + i, (getHeight() - getPaddingBottom()) - this.t);
        this.p.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ig1 generateDefaultLayoutParams() {
        int i = this.i;
        if (i == 0) {
            return new ig1(-2, -2);
        }
        if (i == 1) {
            return new ig1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ig1 generateLayoutParams(AttributeSet attributeSet) {
        return new ig1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ig1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ig1 ? new ig1((ig1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ig1((ViewGroup.MarginLayoutParams) layoutParams) : new ig1(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.g;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.g == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.h;
        if (this.i == 1 && (i = this.j & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.k) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.k;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((ig1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.g;
    }

    public Drawable getDividerDrawable() {
        return this.p;
    }

    public int getDividerPadding() {
        return this.t;
    }

    public int getDividerWidth() {
        return this.q;
    }

    public int getGravity() {
        return this.j;
    }

    public int getOrientation() {
        return this.i;
    }

    public int getShowDividers() {
        return this.s;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.l;
    }

    public final boolean h(int i) {
        if (i == 0) {
            return (this.s & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.s;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.p == null) {
            return;
        }
        int i2 = 0;
        if (this.i == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && h(i2)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((ig1) childAt.getLayoutParams())).topMargin) - this.r);
                }
                i2++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.r : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((ig1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = kr3.a;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i2)) {
                ig1 ig1Var = (ig1) childAt3.getLayoutParams();
                d(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) ig1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) ig1Var).leftMargin) - this.q);
            }
            i2++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                ig1 ig1Var2 = (ig1) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) ig1Var2).leftMargin;
                    i = this.q;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) ig1Var2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.q;
                right = left - i;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int measuredHeight;
        char c;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        char c2 = 2;
        if (this.i == 1) {
            int paddingLeft = getPaddingLeft();
            int i16 = i3 - i;
            int paddingRight = i16 - getPaddingRight();
            int paddingRight2 = (i16 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i17 = this.j;
            int i18 = i17 & 112;
            int i19 = 8388615 & i17;
            int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.k : getPaddingTop() + (((i4 - i2) - this.k) / 2);
            int i20 = 0;
            while (i20 < virtualChildCount) {
                View childAt = getChildAt(i20);
                if (childAt == null || childAt.getVisibility() == i15) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    ig1 ig1Var = (ig1) childAt.getLayoutParams();
                    c = c2;
                    int i21 = ((LinearLayout.LayoutParams) ig1Var).gravity;
                    if (i21 < 0) {
                        i21 = i19;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i12 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) ig1Var).leftMargin;
                        i13 = ((LinearLayout.LayoutParams) ig1Var).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i14 = ((LinearLayout.LayoutParams) ig1Var).leftMargin + paddingLeft;
                        if (h(i20)) {
                            paddingTop += this.r;
                        }
                        int i22 = paddingTop + ((LinearLayout.LayoutParams) ig1Var).topMargin;
                        childAt.layout(i14, i22, measuredWidth + i14, i22 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) ig1Var).bottomMargin + i22;
                    } else {
                        i12 = paddingRight - measuredWidth;
                        i13 = ((LinearLayout.LayoutParams) ig1Var).rightMargin;
                    }
                    i14 = i12 - i13;
                    if (h(i20)) {
                    }
                    int i222 = paddingTop + ((LinearLayout.LayoutParams) ig1Var).topMargin;
                    childAt.layout(i14, i222, measuredWidth + i14, i222 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) ig1Var).bottomMargin + i222;
                }
                i20++;
                c2 = c;
                i15 = 8;
            }
            return;
        }
        boolean z2 = kr3.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i23 = i4 - i2;
        int paddingBottom = i23 - getPaddingBottom();
        int paddingBottom2 = (i23 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i24 = this.j;
        int i25 = 8388615 & i24;
        int i26 = i24 & 112;
        boolean z4 = this.f;
        int[] iArr = this.n;
        int[] iArr2 = this.o;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i25, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.k : getPaddingLeft() + (((i3 - i) - this.k) / 2);
        if (z3) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i27 = 0;
        while (i27 < virtualChildCount2) {
            int i28 = (i5 * i27) + i6;
            View childAt2 = getChildAt(i28);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    ig1 ig1Var2 = (ig1) childAt2.getLayoutParams();
                    int i29 = paddingLeft2;
                    if (z4) {
                        i8 = paddingTop2;
                        int baseline = ((LinearLayout.LayoutParams) ig1Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) ig1Var2).gravity;
                        if (i9 < 0) {
                            i9 = i26;
                        }
                        i10 = i9 & 112;
                        if (i10 == 16) {
                            if (i10 == 48) {
                                i11 = i8 + ((LinearLayout.LayoutParams) ig1Var2).topMargin;
                                if (baseline != -1) {
                                    i11 = (iArr[1] - baseline) + i11;
                                }
                            } else if (i10 != 80) {
                                i11 = i8;
                            } else {
                                i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) ig1Var2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            int i30 = (h(i28) ? i29 + this.q : i29) + ((LinearLayout.LayoutParams) ig1Var2).leftMargin;
                            childAt2.layout(i30, i11, i30 + measuredWidth2, i11 + measuredHeight3);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) ig1Var2).rightMargin + i30;
                            i27++;
                            i6 = i7;
                            paddingTop2 = i8;
                        } else {
                            i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) ig1Var2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) ig1Var2).bottomMargin;
                        }
                        i11 -= measuredHeight;
                        int i302 = (h(i28) ? i29 + this.q : i29) + ((LinearLayout.LayoutParams) ig1Var2).leftMargin;
                        childAt2.layout(i302, i11, i302 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) ig1Var2).rightMargin + i302;
                        i27++;
                        i6 = i7;
                        paddingTop2 = i8;
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = ((LinearLayout.LayoutParams) ig1Var2).gravity;
                    if (i9 < 0) {
                    }
                    i10 = i9 & 112;
                    if (i10 == 16) {
                    }
                    i11 -= measuredHeight;
                    int i3022 = (h(i28) ? i29 + this.q : i29) + ((LinearLayout.LayoutParams) ig1Var2).leftMargin;
                    childAt2.layout(i3022, i11, i3022 + measuredWidth2, i11 + measuredHeight3);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) ig1Var2).rightMargin + i3022;
                    i27++;
                    i6 = i7;
                    paddingTop2 = i8;
                }
            }
            i8 = paddingTop2;
            i27++;
            i6 = i7;
            paddingTop2 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iMax;
        int i6;
        int i7;
        int baseline;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        ig1 ig1Var;
        int i12;
        int[] iArr2;
        int i13;
        View view;
        int i14;
        boolean z3;
        boolean z4;
        int iMax2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z5;
        int i23;
        int i24;
        int i25;
        View view2;
        boolean z6;
        jg1 jg1Var = this;
        int i26 = -2;
        int iMax3 = 0;
        int i27 = 1073741824;
        int i28 = 8;
        if (jg1Var.i == 1) {
            jg1Var.k = 0;
            int virtualChildCount = jg1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i29 = jg1Var.g;
            boolean z7 = jg1Var.m;
            int i30 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z8 = false;
            int i31 = 0;
            boolean z9 = false;
            boolean z10 = true;
            float f = 0.0f;
            int iMax6 = 0;
            while (i30 < virtualChildCount) {
                int i32 = mode;
                View childAt = jg1Var.getChildAt(i30);
                if (childAt == null) {
                    jg1Var.k = jg1Var.k;
                } else {
                    if (childAt.getVisibility() != i28) {
                        if (jg1Var.h(i30)) {
                            jg1Var.k += jg1Var.r;
                        }
                        ig1 ig1Var2 = (ig1) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) ig1Var2).weight;
                        f += f2;
                        if (mode2 == i27 && ((LinearLayout.LayoutParams) ig1Var2).height == 0 && f2 > 0.0f) {
                            int i33 = jg1Var.k;
                            jg1Var.k = Math.max(i33, ((LinearLayout.LayoutParams) ig1Var2).topMargin + i33 + ((LinearLayout.LayoutParams) ig1Var2).bottomMargin);
                            view2 = childAt;
                            i22 = mode2;
                            i23 = i29;
                            z5 = z7;
                            i24 = i30;
                            z8 = true;
                            i25 = i32;
                        } else {
                            if (((LinearLayout.LayoutParams) ig1Var2).height != 0 || f2 <= 0.0f) {
                                i19 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) ig1Var2).height = i26;
                                i19 = 0;
                            }
                            if (f == 0.0f) {
                                i20 = i30;
                                i21 = jg1Var.k;
                            } else {
                                i20 = i30;
                                i21 = 0;
                            }
                            i22 = mode2;
                            z5 = z7;
                            i23 = i29;
                            i24 = i20;
                            i25 = i32;
                            jg1Var.measureChildWithMargins(childAt, i, 0, i2, i21);
                            if (i19 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) ig1Var2).height = i19;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i34 = jg1Var.k;
                            view2 = childAt;
                            jg1Var.k = Math.max(i34, i34 + measuredHeight + ((LinearLayout.LayoutParams) ig1Var2).topMargin + ((LinearLayout.LayoutParams) ig1Var2).bottomMargin);
                            if (z5) {
                                iMax6 = Math.max(measuredHeight, iMax6);
                            }
                        }
                        if (i23 >= 0 && i23 == i24 + 1) {
                            jg1Var.h = jg1Var.k;
                        }
                        if (i24 < i23 && ((LinearLayout.LayoutParams) ig1Var2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i25 == 1073741824 || ((LinearLayout.LayoutParams) ig1Var2).width != -1) {
                            z6 = false;
                        } else {
                            z6 = true;
                            z9 = true;
                        }
                        int i35 = ((LinearLayout.LayoutParams) ig1Var2).leftMargin + ((LinearLayout.LayoutParams) ig1Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i35;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z11 = z6;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i31, measuredState);
                        if (z10) {
                            i31 = iCombineMeasuredStates;
                            boolean z12 = ((LinearLayout.LayoutParams) ig1Var2).width == -1;
                            if (((LinearLayout.LayoutParams) ig1Var2).weight <= 0.0f) {
                                if (!z11) {
                                    i35 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i35);
                            } else {
                                if (!z11) {
                                    i35 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i35);
                            }
                            z10 = z12;
                        } else {
                            i31 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) ig1Var2).weight <= 0.0f) {
                        }
                        z10 = z12;
                    }
                    i30 = i24 + 1;
                    i29 = i23;
                    mode = i25;
                    z7 = z5;
                    mode2 = i22;
                    i26 = -2;
                    i27 = 1073741824;
                    i28 = 8;
                }
                i22 = mode2;
                i23 = i29;
                z5 = z7;
                i24 = i30;
                i25 = i32;
                i30 = i24 + 1;
                i29 = i23;
                mode = i25;
                z7 = z5;
                mode2 = i22;
                i26 = -2;
                i27 = 1073741824;
                i28 = 8;
            }
            int i36 = mode;
            int i37 = mode2;
            boolean z13 = z7;
            int i38 = i31;
            int i39 = i2;
            if (jg1Var.k > 0 && jg1Var.h(virtualChildCount)) {
                jg1Var.k += jg1Var.r;
            }
            if (z13 && (i37 == Integer.MIN_VALUE || i37 == 0)) {
                jg1Var.k = 0;
                for (int i40 = 0; i40 < virtualChildCount; i40++) {
                    View childAt2 = jg1Var.getChildAt(i40);
                    if (childAt2 == null) {
                        jg1Var.k = jg1Var.k;
                    } else if (childAt2.getVisibility() != 8) {
                        ig1 ig1Var3 = (ig1) childAt2.getLayoutParams();
                        int i41 = jg1Var.k;
                        jg1Var.k = Math.max(i41, i41 + iMax6 + ((LinearLayout.LayoutParams) ig1Var3).topMargin + ((LinearLayout.LayoutParams) ig1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = jg1Var.getPaddingBottom() + jg1Var.getPaddingTop() + jg1Var.k;
            jg1Var.k = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, jg1Var.getSuggestedMinimumHeight()), i39, 0);
            int i42 = (iResolveSizeAndState & 16777215) - jg1Var.k;
            if (z8 || (i42 != 0 && f > 0.0f)) {
                float f3 = jg1Var.l;
                if (f3 > 0.0f) {
                    f = f3;
                }
                jg1Var.k = 0;
                int iCombineMeasuredStates2 = i38;
                int i43 = 0;
                while (i43 < virtualChildCount) {
                    View childAt3 = jg1Var.getChildAt(i43);
                    if (childAt3.getVisibility() == 8) {
                        i16 = i43;
                    } else {
                        ig1 ig1Var4 = (ig1) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) ig1Var4).weight;
                        if (f4 > 0.0f) {
                            int i44 = (int) ((i42 * f4) / f);
                            f -= f4;
                            i42 -= i44;
                            i16 = i43;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, jg1Var.getPaddingRight() + jg1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) ig1Var4).leftMargin + ((LinearLayout.LayoutParams) ig1Var4).rightMargin, ((LinearLayout.LayoutParams) ig1Var4).width);
                            if (((LinearLayout.LayoutParams) ig1Var4).height == 0) {
                                i18 = 1073741824;
                                if (i37 == 1073741824) {
                                    if (i44 <= 0) {
                                        i44 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i44, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i18 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i44;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i18));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        } else {
                            i16 = i43;
                        }
                        int i45 = ((LinearLayout.LayoutParams) ig1Var4).leftMargin + ((LinearLayout.LayoutParams) ig1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i45;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i36 != 1073741824) {
                            i17 = -1;
                            if (((LinearLayout.LayoutParams) ig1Var4).width == -1) {
                                measuredWidth2 = i45;
                            }
                        } else {
                            i17 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z14 = z10 && ((LinearLayout.LayoutParams) ig1Var4).width == i17;
                        int i46 = jg1Var.k;
                        jg1Var.k = Math.max(i46, childAt3.getMeasuredHeight() + i46 + ((LinearLayout.LayoutParams) ig1Var4).topMargin + ((LinearLayout.LayoutParams) ig1Var4).bottomMargin);
                        z10 = z14;
                    }
                    i43 = i16 + 1;
                }
                jg1Var.k = jg1Var.getPaddingBottom() + jg1Var.getPaddingTop() + jg1Var.k;
                i38 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z13 && i37 != 1073741824) {
                    for (int i47 = 0; i47 < virtualChildCount; i47++) {
                        View childAt4 = jg1Var.getChildAt(i47);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((ig1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z10 || i36 == 1073741824) {
                iMax4 = iMax3;
            }
            jg1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(jg1Var.getPaddingRight() + jg1Var.getPaddingLeft() + iMax4, jg1Var.getSuggestedMinimumWidth()), i, i38), iResolveSizeAndState);
            if (z9) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jg1Var.getMeasuredWidth(), 1073741824);
                int i48 = 0;
                while (i48 < virtualChildCount) {
                    View childAt5 = jg1Var.getChildAt(i48);
                    if (childAt5.getVisibility() != 8) {
                        ig1 ig1Var5 = (ig1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) ig1Var5).width == -1) {
                            int i49 = ((LinearLayout.LayoutParams) ig1Var5).height;
                            ((LinearLayout.LayoutParams) ig1Var5).height = childAt5.getMeasuredHeight();
                            jg1Var.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i39, 0);
                            ((LinearLayout.LayoutParams) ig1Var5).height = i49;
                        }
                    }
                    i48++;
                    i39 = i2;
                }
                return;
            }
            return;
        }
        int i50 = i;
        jg1Var.k = 0;
        int virtualChildCount2 = jg1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i50);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (jg1Var.n == null || jg1Var.o == null) {
            jg1Var.n = new int[4];
            jg1Var.o = new int[4];
        }
        int[] iArr3 = jg1Var.n;
        int[] iArr4 = jg1Var.o;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z15 = jg1Var.f;
        boolean z16 = jg1Var.m;
        boolean z17 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z18 = true;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z19 = false;
        boolean z20 = false;
        while (i51 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = jg1Var.getChildAt(i51);
            if (childAt6 == null) {
                jg1Var.k = jg1Var.k;
                i11 = i51;
                i15 = i53;
                iArr2 = iArr3;
                iArr = iArr4;
                z = z15;
                z2 = z16;
            } else {
                int i54 = i52;
                if (childAt6.getVisibility() == 8) {
                    i50 = i;
                    i11 = i51;
                    i15 = i53;
                    iArr = iArr4;
                    z = z15;
                    z2 = z16;
                    i52 = i54;
                    iArr2 = iArr3;
                } else {
                    if (jg1Var.h(i51)) {
                        jg1Var.k += jg1Var.q;
                    }
                    ig1 ig1Var6 = (ig1) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) ig1Var6).weight;
                    f5 += f6;
                    int i55 = i51;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) ig1Var6).width == 0 && f6 > 0.0f) {
                        int i56 = jg1Var.k;
                        int i57 = ((LinearLayout.LayoutParams) ig1Var6).leftMargin;
                        if (z17) {
                            jg1Var.k = i57 + ((LinearLayout.LayoutParams) ig1Var6).rightMargin + i56;
                        } else {
                            jg1Var.k = Math.max(i56, i56 + i57 + ((LinearLayout.LayoutParams) ig1Var6).rightMargin);
                        }
                        if (z15) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z = z15;
                            z2 = z16;
                            i12 = i54;
                            i11 = i55;
                            ig1Var = ig1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i50 = i;
                            i13 = i53;
                            i10 = iMax7;
                        } else {
                            view = childAt6;
                            z = z15;
                            z2 = z16;
                            z20 = true;
                            i12 = i54;
                            i11 = i55;
                            i14 = 1073741824;
                            ig1Var = ig1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i50 = i;
                            i13 = i53;
                            i10 = iMax7;
                            if (mode4 == i14 && ((LinearLayout.LayoutParams) ig1Var).height == -1) {
                                z3 = true;
                                z19 = true;
                            } else {
                                z3 = false;
                            }
                            int i58 = ((LinearLayout.LayoutParams) ig1Var).topMargin + ((LinearLayout.LayoutParams) ig1Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i58;
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                            if (z) {
                                z4 = z3;
                            } else {
                                int baseline2 = view.getBaseline();
                                z4 = z3;
                                if (baseline2 != -1) {
                                    int i59 = ((LinearLayout.LayoutParams) ig1Var).gravity;
                                    if (i59 < 0) {
                                        i59 = jg1Var.j;
                                    }
                                    int i60 = (((i59 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i60] = Math.max(iArr2[i60], baseline2);
                                    iArr[i60] = Math.max(iArr[i60], measuredHeight3 - baseline2);
                                }
                            }
                            int iMax9 = Math.max(i12, measuredHeight3);
                            boolean z21 = !z18 && ((LinearLayout.LayoutParams) ig1Var).height == -1;
                            if (((LinearLayout.LayoutParams) ig1Var).weight <= 0.0f) {
                                if (!z4) {
                                    i58 = measuredHeight3;
                                }
                                iMax7 = Math.max(i10, i58);
                                iMax2 = i13;
                            } else {
                                if (!z4) {
                                    i58 = measuredHeight3;
                                }
                                iMax2 = Math.max(i13, i58);
                                iMax7 = i10;
                            }
                            int i61 = iMax2;
                            i52 = iMax9;
                            i15 = i61;
                            z18 = z21;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) ig1Var6).width != 0 || f6 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) ig1Var6).width = -2;
                            i9 = 0;
                        }
                        iArr = iArr4;
                        i10 = iMax7;
                        i11 = i55;
                        z = z15;
                        z2 = z16;
                        int i62 = i9;
                        ig1Var = ig1Var6;
                        i12 = i54;
                        i50 = i;
                        iArr2 = iArr3;
                        i13 = i53;
                        jg1Var.measureChildWithMargins(childAt6, i50, f5 == 0.0f ? jg1Var.k : 0, i2, 0);
                        if (i62 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) ig1Var).width = i62;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        int i63 = jg1Var.k;
                        int i64 = ((LinearLayout.LayoutParams) ig1Var).leftMargin;
                        if (z17) {
                            view = childAt6;
                            jg1Var.k = i64 + measuredWidth3 + ((LinearLayout.LayoutParams) ig1Var).rightMargin + i63;
                        } else {
                            view = childAt6;
                            jg1Var.k = Math.max(i63, i63 + measuredWidth3 + i64 + ((LinearLayout.LayoutParams) ig1Var).rightMargin);
                        }
                        if (z2) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i14 = 1073741824;
                    if (mode4 == i14) {
                        z3 = false;
                        int i582 = ((LinearLayout.LayoutParams) ig1Var).topMargin + ((LinearLayout.LayoutParams) ig1Var).bottomMargin;
                        int measuredHeight32 = view.getMeasuredHeight() + i582;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z) {
                        }
                        int iMax92 = Math.max(i12, measuredHeight32);
                        if (z18) {
                            if (((LinearLayout.LayoutParams) ig1Var).weight <= 0.0f) {
                            }
                            int i612 = iMax2;
                            i52 = iMax92;
                            i15 = i612;
                            z18 = z21;
                        }
                    }
                }
            }
            i53 = i15;
            i51 = i11 + 1;
            c = c2;
            iArr3 = iArr2;
            iArr4 = iArr;
            z15 = z;
            z16 = z2;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c3 = c;
        boolean z22 = z15;
        boolean z23 = z16;
        int i65 = i52;
        int i66 = i53;
        int i67 = iMax7;
        if (jg1Var.k > 0 && jg1Var.h(virtualChildCount2)) {
            jg1Var.k += jg1Var.q;
        }
        int i68 = iArr5[1];
        int iMax10 = (i68 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) ? i65 : Math.max(i65, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i68, iArr5[c3]))));
        if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            jg1Var.k = 0;
            for (int i69 = 0; i69 < virtualChildCount2; i69++) {
                View childAt7 = jg1Var.getChildAt(i69);
                if (childAt7 == null) {
                    jg1Var.k = jg1Var.k;
                } else if (childAt7.getVisibility() != 8) {
                    ig1 ig1Var7 = (ig1) childAt7.getLayoutParams();
                    int i70 = jg1Var.k;
                    if (z17) {
                        jg1Var.k = ((LinearLayout.LayoutParams) ig1Var7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) ig1Var7).rightMargin + i70;
                    } else {
                        jg1Var.k = Math.max(i70, i70 + iMax8 + ((LinearLayout.LayoutParams) ig1Var7).leftMargin + ((LinearLayout.LayoutParams) ig1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = jg1Var.getPaddingRight() + jg1Var.getPaddingLeft() + jg1Var.k;
        jg1Var.k = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, jg1Var.getSuggestedMinimumWidth()), i50, 0);
        int i71 = (iResolveSizeAndState2 & 16777215) - jg1Var.k;
        if (z20 || (i71 != 0 && f5 > 0.0f)) {
            float f7 = jg1Var.l;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c3] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c3] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            jg1Var.k = 0;
            iMax10 = -1;
            int i72 = 0;
            while (i72 < virtualChildCount2) {
                View childAt8 = jg1Var.getChildAt(i72);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i6 = iResolveSizeAndState2;
                } else {
                    ig1 ig1Var8 = (ig1) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) ig1Var8).weight;
                    if (f8 > 0.0f) {
                        int i73 = (int) ((i71 * f8) / f5);
                        f5 -= f8;
                        i71 -= i73;
                        i6 = iResolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, jg1Var.getPaddingBottom() + jg1Var.getPaddingTop() + ((LinearLayout.LayoutParams) ig1Var8).topMargin + ((LinearLayout.LayoutParams) ig1Var8).bottomMargin, ((LinearLayout.LayoutParams) ig1Var8).height);
                        if (((LinearLayout.LayoutParams) ig1Var8).width == 0) {
                            i8 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i73 <= 0) {
                                    i73 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i73, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i8 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i73;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i8), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i6 = iResolveSizeAndState2;
                    }
                    int i74 = jg1Var.k;
                    if (z17) {
                        jg1Var.k = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) ig1Var8).leftMargin + ((LinearLayout.LayoutParams) ig1Var8).rightMargin + i74;
                    } else {
                        jg1Var.k = Math.max(i74, childAt8.getMeasuredWidth() + i74 + ((LinearLayout.LayoutParams) ig1Var8).leftMargin + ((LinearLayout.LayoutParams) ig1Var8).rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) ig1Var8).height == -1;
                    int i75 = ((LinearLayout.LayoutParams) ig1Var8).topMargin + ((LinearLayout.LayoutParams) ig1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i75;
                    iMax10 = Math.max(iMax10, measuredHeight4);
                    if (!z24) {
                        i75 = measuredHeight4;
                    }
                    int iMax11 = Math.max(i66, i75);
                    if (z18) {
                        i7 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) ig1Var8).height == -1;
                        if (!z22 && (baseline = childAt8.getBaseline()) != i7) {
                            int i76 = ((LinearLayout.LayoutParams) ig1Var8).gravity;
                            if (i76 < 0) {
                                i76 = jg1Var.j;
                            }
                            int i77 = (((i76 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i77] = Math.max(iArr5[i77], baseline);
                            iArr6[i77] = Math.max(iArr6[i77], measuredHeight4 - baseline);
                        }
                        z18 = z25;
                        i66 = iMax11;
                    } else {
                        i7 = -1;
                    }
                    if (!z22) {
                        z18 = z25;
                        i66 = iMax11;
                    }
                }
                i72++;
                iResolveSizeAndState2 = i6;
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            jg1Var.k = jg1Var.getPaddingRight() + jg1Var.getPaddingLeft() + jg1Var.k;
            int i78 = iArr5[1];
            if (i78 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                iMax10 = Math.max(iMax10, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i78, iArr5[c3]))));
            }
            iMax = i66;
        } else {
            iMax = Math.max(i66, i67);
            if (z23 && mode3 != 1073741824) {
                for (int i79 = 0; i79 < virtualChildCount2; i79++) {
                    View childAt9 = jg1Var.getChildAt(i79);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((ig1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z18 && mode4 != 1073741824) {
            iMax10 = iMax;
        }
        jg1Var.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(jg1Var.getPaddingBottom() + jg1Var.getPaddingTop() + iMax10, jg1Var.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
        if (z19) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(jg1Var.getMeasuredHeight(), 1073741824);
            int i80 = i5;
            while (i80 < virtualChildCount2) {
                View childAt10 = jg1Var.getChildAt(i80);
                if (childAt10.getVisibility() != 8) {
                    ig1 ig1Var9 = (ig1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) ig1Var9).height == -1) {
                        int i81 = ((LinearLayout.LayoutParams) ig1Var9).width;
                        ((LinearLayout.LayoutParams) ig1Var9).width = childAt10.getMeasuredWidth();
                        jg1Var.measureChildWithMargins(childAt10, i50, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) ig1Var9).width = i81;
                    }
                }
                i80++;
                jg1Var = this;
                i50 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.g = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.p) {
            return;
        }
        this.p = drawable;
        if (drawable != null) {
            this.q = drawable.getIntrinsicWidth();
            this.r = drawable.getIntrinsicHeight();
        } else {
            this.q = 0;
            this.r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.t = i;
    }

    public void setGravity(int i) {
        if (this.j != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.j = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.j;
        if ((8388615 & i3) != i2) {
            this.j = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.m = z;
    }

    public void setOrientation(int i) {
        if (this.i != i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.s) {
            requestLayout();
        }
        this.s = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.j;
        if ((i3 & 112) != i2) {
            this.j = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.l = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
