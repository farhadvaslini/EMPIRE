package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.c;
import defpackage.e;
import defpackage.e3;
import defpackage.er3;
import defpackage.kr3;
import defpackage.l2;
import defpackage.mq3;
import defpackage.nn1;
import defpackage.pf2;
import defpackage.rn;
import defpackage.so1;
import defpackage.v2;
import defpackage.z2;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final e f;
    public final Context g;
    public ActionMenuView h;
    public z2 i;
    public int j;
    public er3 k;
    public boolean l;
    public boolean m;
    public CharSequence n;
    public CharSequence o;
    public View p;
    public View q;
    public View r;
    public LinearLayout s;
    public TextView t;
    public TextView u;
    public final int v;
    public final int w;
    public boolean x;
    public final int y;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        this.f = new e(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.g = context;
        } else {
            this.g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pf2.d, i, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : rn.C(context, resourceId));
        this.v = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.w = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.j = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.y = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(e3 e3Var) {
        View view = this.p;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.y, (ViewGroup) this, false);
            this.p = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.p);
        }
        View viewFindViewById = this.p.findViewById(R.id.action_mode_close_button);
        this.q = viewFindViewById;
        viewFindViewById.setOnClickListener(new l2(i, e3Var));
        nn1 nn1VarC = e3Var.c();
        z2 z2Var = this.i;
        if (z2Var != null) {
            z2Var.c();
            v2 v2Var = z2Var.y;
            if (v2Var != null && v2Var.b()) {
                v2Var.i.dismiss();
            }
        }
        z2 z2Var2 = new z2(getContext());
        this.i = z2Var2;
        z2Var2.q = true;
        z2Var2.r = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        nn1VarC.b(this.i, this.g);
        z2 z2Var3 = this.i;
        so1 so1Var = z2Var3.m;
        if (so1Var == null) {
            so1 so1Var2 = (so1) z2Var3.i.inflate(z2Var3.k, (ViewGroup) this, false);
            z2Var3.m = so1Var2;
            so1Var2.b(z2Var3.h);
            z2Var3.g();
        }
        so1 so1Var3 = z2Var3.m;
        if (so1Var != so1Var3) {
            ((ActionMenuView) so1Var3).setPresenter(z2Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) so1Var3;
        this.h = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.h, layoutParams);
    }

    public final void d() {
        if (this.s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.s = linearLayout;
            this.t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.u = (TextView) this.s.findViewById(R.id.action_bar_subtitle);
            int i = this.v;
            if (i != 0) {
                this.t.setTextAppearance(getContext(), i);
            }
            int i2 = this.w;
            if (i2 != 0) {
                this.u.setTextAppearance(getContext(), i2);
            }
        }
        this.t.setText(this.n);
        this.u.setText(this.o);
        boolean zIsEmpty = TextUtils.isEmpty(this.n);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.o);
        this.u.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.s.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.s.getParent() == null) {
            addView(this.s);
        }
    }

    public final void e() {
        removeAllViews();
        this.r = null;
        this.h = null;
        this.i = null;
        View view = this.q;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.k != null ? this.f.b : getVisibility();
    }

    public int getContentHeight() {
        return this.j;
    }

    public CharSequence getSubtitle() {
        return this.o;
    }

    public CharSequence getTitle() {
        return this.n;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            er3 er3Var = this.k;
            if (er3Var != null) {
                er3Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final er3 i(int i, long j) {
        er3 er3Var = this.k;
        if (er3Var != null) {
            er3Var.b();
        }
        e eVar = this.f;
        if (i != 0) {
            er3 er3VarA = mq3.a(this);
            er3VarA.a(0.0f);
            er3VarA.c(j);
            eVar.c.k = er3VarA;
            eVar.b = i;
            er3VarA.d(eVar);
            return er3VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        er3 er3VarA2 = mq3.a(this);
        er3VarA2.a(1.0f);
        er3VarA2.c(j);
        eVar.c.k = er3VarA2;
        eVar.b = i;
        er3VarA2.d(eVar);
        return er3VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, pf2.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        z2 z2Var = this.i;
        if (z2Var != null) {
            Configuration configuration2 = z2Var.g.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            z2Var.u = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            nn1 nn1Var = z2Var.h;
            if (nn1Var != null) {
                nn1Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.i;
        if (z2Var != null) {
            z2Var.c();
            v2 v2Var = this.i.y;
            if (v2Var == null || !v2Var.b()) {
                return;
            }
            v2Var.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.m = false;
        }
        if (!this.m) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.m = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.m = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = kr3.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iG = g(this.p, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iG - i6 : iG + i6;
        }
        LinearLayout linearLayout = this.s;
        if (linearLayout != null && this.r == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.s, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.r;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            c.q(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            c.q(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.j;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.p;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.h, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.s;
        if (linearLayout != null && this.r == null) {
            if (this.x) {
                this.s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.s.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.s.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.r;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.j > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.l = false;
        }
        if (!this.l) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.l = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.l = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.r;
        if (view2 != null) {
            removeView(view2);
        }
        this.r = view;
        if (view != null && (linearLayout = this.s) != null) {
            removeView(linearLayout);
            this.s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.o = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.n = charSequence;
        d();
        mq3.j(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.x) {
            requestLayout();
        }
        this.x = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
