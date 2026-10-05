package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.bb3;
import defpackage.bj3;
import defpackage.ch;
import defpackage.cj3;
import defpackage.dh;
import defpackage.e7;
import defpackage.gi;
import defpackage.gp2;
import defpackage.j80;
import defpackage.kr3;
import defpackage.l2;
import defpackage.mq3;
import defpackage.nn1;
import defpackage.oi3;
import defpackage.pf2;
import defpackage.pi;
import defpackage.pi3;
import defpackage.qi3;
import defpackage.ri3;
import defpackage.rn;
import defpackage.si3;
import defpackage.sn1;
import defpackage.ti3;
import defpackage.ui3;
import defpackage.vi3;
import defpackage.wi3;
import defpackage.wn1;
import defpackage.z2;
import java.util.ArrayList;
import java.util.WeakHashMap;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public final int B;
    public CharSequence C;
    public CharSequence D;
    public ColorStateList E;
    public ColorStateList F;
    public boolean G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public final int[] K;
    public final sn1 L;
    public ArrayList M;
    public ti3 N;
    public final pi3 O;
    public bj3 P;
    public z2 Q;
    public ri3 R;
    public wi3 S;
    public vi3 T;
    public boolean U;
    public OnBackInvokedCallback V;
    public OnBackInvokedDispatcher W;
    public boolean a0;
    public final e7 b0;
    public ActionMenuView f;
    public gi g;
    public gi h;
    public ch i;
    public dh j;
    public final Drawable k;
    public final CharSequence l;
    public ch m;
    public View n;
    public Context o;
    public int p;
    public int q;
    public int r;
    public final int s;
    public final int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public gp2 y;
    public int z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = 8388627;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new int[2];
        this.L = new sn1(new oi3(this, 1));
        this.M = new ArrayList();
        this.O = new pi3(this);
        this.b0 = new e7(6, this);
        Context context2 = getContext();
        int[] iArr = pf2.w;
        pi piVarH = pi.H(context2, attributeSet, iArr, i);
        mq3.h(this, context, iArr, attributeSet, (TypedArray) piVarH.g, i);
        TypedArray typedArray = (TypedArray) piVarH.g;
        this.q = typedArray.getResourceId(28, 0);
        this.r = typedArray.getResourceId(19, 0);
        this.B = typedArray.getInteger(0, 8388627);
        this.s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.x = dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        this.v = dimensionPixelOffset;
        this.u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.x = dimensionPixelOffset5;
        }
        this.t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        gp2 gp2Var = this.y;
        gp2Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            gp2Var.e = dimensionPixelSize;
            gp2Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            gp2Var.f = dimensionPixelSize2;
            gp2Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            gp2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.z = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.A = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.k = piVarH.p(4);
        this.l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableP = piVarH.p(16);
        if (drawableP != null) {
            setNavigationIcon(drawableP);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableP2 = piVarH.p(11);
        if (drawableP2 != null) {
            setLogo(drawableP2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(piVarH.l(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(piVarH.l(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        piVarH.J();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new bb3(getContext());
    }

    public static si3 h() {
        si3 si3Var = new si3(-2, -2);
        si3Var.b = 0;
        si3Var.a = 8388627;
        return si3Var;
    }

    public static si3 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof si3;
        if (z) {
            si3 si3Var = (si3) layoutParams;
            si3 si3Var2 = new si3(si3Var);
            si3Var2.b = 0;
            si3Var2.b = si3Var.b;
            return si3Var2;
        }
        if (z) {
            si3 si3Var3 = new si3((si3) layoutParams);
            si3Var3.b = 0;
            return si3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            si3 si3Var4 = new si3(layoutParams);
            si3Var4.b = 0;
            return si3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        si3 si3Var5 = new si3(marginLayoutParams);
        si3Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) si3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) si3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) si3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) si3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return si3Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                si3 si3Var = (si3) childAt.getLayoutParams();
                if (si3Var.b == 0 && t(childAt)) {
                    int i3 = si3Var.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            si3 si3Var2 = (si3) childAt2.getLayoutParams();
            if (si3Var2.b == 0 && t(childAt2)) {
                int i5 = si3Var2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        si3 si3VarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (si3) layoutParams;
        si3VarH.b = 1;
        if (!z || this.n == null) {
            addView(view, si3VarH);
        } else {
            view.setLayoutParams(si3VarH);
            this.J.add(view);
        }
    }

    public final void c() {
        if (this.m == null) {
            ch chVar = new ch(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.m = chVar;
            chVar.setImageDrawable(this.k);
            this.m.setContentDescription(this.l);
            si3 si3VarH = h();
            si3VarH.a = (this.s & 112) | 8388611;
            si3VarH.b = 2;
            this.m.setLayoutParams(si3VarH);
            this.m.setOnClickListener(new l2(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof si3);
    }

    public final void d() {
        if (this.y == null) {
            gp2 gp2Var = new gp2();
            gp2Var.a = 0;
            gp2Var.b = 0;
            gp2Var.c = Integer.MIN_VALUE;
            gp2Var.d = Integer.MIN_VALUE;
            gp2Var.e = 0;
            gp2Var.f = 0;
            gp2Var.g = false;
            gp2Var.h = false;
            this.y = gp2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f;
        if (actionMenuView.u == null) {
            nn1 nn1Var = (nn1) actionMenuView.getMenu();
            if (this.R == null) {
                this.R = new ri3(this);
            }
            this.f.setExpandedActionViewsExclusive(true);
            nn1Var.b(this.R, this.o);
            v();
        }
    }

    public final void f() {
        if (this.f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f = actionMenuView;
            actionMenuView.setPopupTheme(this.p);
            this.f.setOnMenuItemClickListener(this.O);
            ActionMenuView actionMenuView2 = this.f;
            wi3 wi3Var = this.S;
            pi3 pi3Var = new pi3(this);
            actionMenuView2.z = wi3Var;
            actionMenuView2.A = pi3Var;
            si3 si3VarH = h();
            si3VarH.a = (this.s & 112) | 8388613;
            this.f.setLayoutParams(si3VarH);
            b(this.f, false);
        }
    }

    public final void g() {
        if (this.i == null) {
            this.i = new ch(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            si3 si3VarH = h();
            si3VarH.a = (this.s & 112) | 8388611;
            this.i.setLayoutParams(si3VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        si3 si3Var = new si3(context, attributeSet);
        si3Var.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pf2.b);
        si3Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        si3Var.b = 0;
        return si3Var;
    }

    public CharSequence getCollapseContentDescription() {
        ch chVar = this.m;
        if (chVar != null) {
            return chVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ch chVar = this.m;
        if (chVar != null) {
            return chVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        gp2 gp2Var = this.y;
        if (gp2Var != null) {
            return gp2Var.g ? gp2Var.a : gp2Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        gp2 gp2Var = this.y;
        if (gp2Var != null) {
            return gp2Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        gp2 gp2Var = this.y;
        if (gp2Var != null) {
            return gp2Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        gp2 gp2Var = this.y;
        if (gp2Var != null) {
            return gp2Var.g ? gp2Var.b : gp2Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        nn1 nn1Var;
        ActionMenuView actionMenuView = this.f;
        return (actionMenuView == null || (nn1Var = actionMenuView.u) == null || !nn1Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.A, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        dh dhVar = this.j;
        if (dhVar != null) {
            return dhVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        dh dhVar = this.j;
        if (dhVar != null) {
            return dhVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f.getMenu();
    }

    public View getNavButtonView() {
        return this.i;
    }

    public CharSequence getNavigationContentDescription() {
        ch chVar = this.i;
        if (chVar != null) {
            return chVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ch chVar = this.i;
        if (chVar != null) {
            return chVar.getDrawable();
        }
        return null;
    }

    public z2 getOuterActionMenuPresenter() {
        return this.Q;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.o;
    }

    public int getPopupTheme() {
        return this.p;
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    public final TextView getSubtitleTextView() {
        return this.h;
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public int getTitleMarginBottom() {
        return this.x;
    }

    public int getTitleMarginEnd() {
        return this.v;
    }

    public int getTitleMarginStart() {
        return this.u;
    }

    public int getTitleMarginTop() {
        return this.w;
    }

    public final TextView getTitleTextView() {
        return this.g;
    }

    public j80 getWrapper() {
        if (this.P == null) {
            this.P = new bj3(this, true);
        }
        return this.P;
    }

    public final int j(View view, int i) {
        si3 si3Var = (si3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = si3Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.B & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) si3Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) si3Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) si3Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        this.L.a();
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.J.contains(view);
    }

    public final boolean o() {
        z2 z2Var;
        ActionMenuView actionMenuView = this.f;
        return (actionMenuView == null || (z2Var = actionMenuView.y) == null || !z2Var.i()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.b0);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.H = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iP;
        int iQ;
        int iMax;
        boolean zT;
        boolean zT2;
        boolean z2;
        int measuredHeight;
        int i5;
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int size;
        int iP2;
        int i10;
        int size2;
        int i11;
        int size3;
        int i12;
        int i13;
        int i14;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i15 = width - paddingRight;
        int[] iArr = this.K;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = mq3.a;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (t(this.i)) {
            ch chVar = this.i;
            if (z3) {
                iQ = q(chVar, i15, iMin, iArr);
                iP = paddingLeft;
                if (t(this.m)) {
                    ch chVar2 = this.m;
                    if (z3) {
                        iQ = q(chVar2, iQ, iMin, iArr);
                    } else {
                        iP = p(chVar2, iP, iMin, iArr);
                    }
                }
                if (t(this.f)) {
                    ActionMenuView actionMenuView = this.f;
                    if (z3) {
                        iP = p(actionMenuView, iP, iMin, iArr);
                    } else {
                        iQ = q(actionMenuView, iQ, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iP);
                iArr[1] = Math.max(0, currentContentInsetRight - (i15 - iQ));
                iMax = Math.max(iP, currentContentInsetLeft);
                int iMin2 = Math.min(iQ, i15 - currentContentInsetRight);
                if (t(this.n)) {
                    View view = this.n;
                    if (z3) {
                        iMin2 = q(view, iMin2, iMin, iArr);
                    } else {
                        iMax = p(view, iMax, iMin, iArr);
                    }
                }
                if (t(this.j)) {
                    dh dhVar = this.j;
                    if (z3) {
                        iMin2 = q(dhVar, iMin2, iMin, iArr);
                    } else {
                        iMax = p(dhVar, iMax, iMin, iArr);
                    }
                }
                zT = t(this.g);
                zT2 = t(this.h);
                if (zT) {
                    z2 = z3;
                    measuredHeight = 0;
                } else {
                    si3 si3Var = (si3) this.g.getLayoutParams();
                    z2 = z3;
                    measuredHeight = this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) si3Var).topMargin + ((ViewGroup.MarginLayoutParams) si3Var).bottomMargin;
                }
                if (!zT2) {
                    si3 si3Var2 = (si3) this.h.getLayoutParams();
                    measuredHeight = this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) si3Var2).topMargin + ((ViewGroup.MarginLayoutParams) si3Var2).bottomMargin + measuredHeight;
                }
                if (!zT || zT2) {
                    gi giVar = !zT ? this.g : this.h;
                    gi giVar2 = !zT2 ? this.h : this.g;
                    si3 si3Var3 = (si3) giVar.getLayoutParams();
                    si3 si3Var4 = (si3) giVar2.getLayoutParams();
                    int i16 = measuredHeight;
                    boolean z4 = (zT && this.g.getMeasuredWidth() > 0) || (zT2 && this.h.getMeasuredWidth() > 0);
                    i5 = this.B & 112;
                    int i17 = iMax;
                    if (i5 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) si3Var3).topMargin + this.w;
                    } else if (i5 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i16) / 2;
                        int i18 = ((ViewGroup.MarginLayoutParams) si3Var3).topMargin + this.w;
                        if (iMax2 < i18) {
                            iMax2 = i18;
                        } else {
                            int i19 = (((height - paddingBottom) - i16) - iMax2) - paddingTop2;
                            int i20 = ((ViewGroup.MarginLayoutParams) si3Var3).bottomMargin;
                            int i21 = this.x;
                            if (i19 < i20 + i21) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) si3Var4).bottomMargin + i21) - i19));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) si3Var4).bottomMargin) - this.x) - i16;
                    }
                    if (z2) {
                        int i22 = (z4 ? this.u : 0) - iArr[1];
                        iMin2 -= Math.max(0, i22);
                        iArr[1] = Math.max(0, -i22);
                        if (zT) {
                            si3 si3Var5 = (si3) this.g.getLayoutParams();
                            int measuredWidth = iMin2 - this.g.getMeasuredWidth();
                            int measuredHeight2 = this.g.getMeasuredHeight() + paddingTop;
                            this.g.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i8 = measuredWidth - this.v;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) si3Var5).bottomMargin;
                        } else {
                            i8 = iMin2;
                        }
                        if (zT2) {
                            int i23 = paddingTop + ((ViewGroup.MarginLayoutParams) ((si3) this.h.getLayoutParams())).topMargin;
                            this.h.layout(iMin2 - this.h.getMeasuredWidth(), i23, iMin2, this.h.getMeasuredHeight() + i23);
                            i9 = iMin2 - this.v;
                        } else {
                            i9 = iMin2;
                        }
                        if (z4) {
                            iMin2 = Math.min(i8, i9);
                        }
                        iMax = i17;
                    } else {
                        int i24 = (z4 ? this.u : 0) - iArr[0];
                        iMax = Math.max(0, i24) + i17;
                        iArr[0] = Math.max(0, -i24);
                        if (zT) {
                            si3 si3Var6 = (si3) this.g.getLayoutParams();
                            int measuredWidth2 = this.g.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.g.getMeasuredHeight() + paddingTop;
                            this.g.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i6 = measuredWidth2 + this.v;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) si3Var6).bottomMargin;
                        } else {
                            i6 = iMax;
                        }
                        if (zT2) {
                            int i25 = paddingTop + ((ViewGroup.MarginLayoutParams) ((si3) this.h.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.h.getMeasuredWidth() + iMax;
                            this.h.layout(iMax, i25, measuredWidth3, this.h.getMeasuredHeight() + i25);
                            i7 = measuredWidth3 + this.v;
                        } else {
                            i7 = iMax;
                        }
                        if (z4) {
                            iMax = Math.max(i6, i7);
                        }
                    }
                }
                ArrayList arrayList = this.I;
                a(3, arrayList);
                size = arrayList.size();
                iP2 = iMax;
                for (i10 = 0; i10 < size; i10++) {
                    iP2 = p((View) arrayList.get(i10), iP2, iMin, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i11 = 0; i11 < size2; i11++) {
                    iMin2 = q((View) arrayList.get(i11), iMin2, iMin, iArr);
                }
                a(1, arrayList);
                int i26 = iArr[0];
                int i27 = iArr[1];
                size3 = arrayList.size();
                int i28 = i26;
                i12 = 0;
                int measuredWidth4 = 0;
                while (i12 < size3) {
                    View view2 = (View) arrayList.get(i12);
                    si3 si3Var7 = (si3) view2.getLayoutParams();
                    int i29 = i27;
                    int i30 = ((ViewGroup.MarginLayoutParams) si3Var7).leftMargin - i28;
                    int i31 = ((ViewGroup.MarginLayoutParams) si3Var7).rightMargin - i29;
                    int iMax3 = Math.max(0, i30);
                    int iMax4 = Math.max(0, i31);
                    int iMax5 = Math.max(0, -i30);
                    int iMax6 = Math.max(0, -i31);
                    measuredWidth4 += view2.getMeasuredWidth() + iMax3 + iMax4;
                    i12++;
                    i28 = iMax5;
                    i27 = iMax6;
                }
                i14 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth4 / 2);
                int i32 = measuredWidth4 + i14;
                if (i14 >= iP2) {
                    iP2 = i32 > iMin2 ? i14 - (i32 - iMin2) : i14;
                }
                size4 = arrayList.size();
                for (i13 = 0; i13 < size4; i13++) {
                    iP2 = p((View) arrayList.get(i13), iP2, iMin, iArr);
                }
                arrayList.clear();
            }
            iP = p(chVar, paddingLeft, iMin, iArr);
        } else {
            iP = paddingLeft;
        }
        iQ = i15;
        if (t(this.m)) {
        }
        if (t(this.f)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iP);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i15 - iQ));
        iMax = Math.max(iP, currentContentInsetLeft2);
        int iMin22 = Math.min(iQ, i15 - currentContentInsetRight2);
        if (t(this.n)) {
        }
        if (t(this.j)) {
        }
        zT = t(this.g);
        zT2 = t(this.h);
        if (zT) {
        }
        if (!zT2) {
        }
        if (!zT) {
            if (!zT) {
            }
            if (!zT2) {
            }
            si3 si3Var32 = (si3) giVar.getLayoutParams();
            si3 si3Var42 = (si3) giVar2.getLayoutParams();
            int i162 = measuredHeight;
            if (zT) {
                i5 = this.B & 112;
                int i172 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            } else {
                i5 = this.B & 112;
                int i1722 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            }
        }
        ArrayList arrayList2 = this.I;
        a(3, arrayList2);
        size = arrayList2.size();
        iP2 = iMax;
        while (i10 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i11 < size2) {
        }
        a(1, arrayList2);
        int i262 = iArr[0];
        int i272 = iArr[1];
        size3 = arrayList2.size();
        int i282 = i262;
        i12 = 0;
        int measuredWidth42 = 0;
        while (i12 < size3) {
        }
        i14 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth42 / 2);
        int i322 = measuredWidth42 + i14;
        if (i14 >= iP2) {
        }
        size4 = arrayList2.size();
        while (i13 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = kr3.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (t(this.i)) {
            s(this.i, i, 0, i2, this.t);
            iK = k(this.i) + this.i.getMeasuredWidth();
            iMax = Math.max(0, l(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.i.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.m)) {
            s(this.m, i, 0, i2, this.t);
            iK = k(this.m) + this.m.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.m) + this.m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.K;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (t(this.f)) {
            s(this.f, i, iMax3, i2, this.t);
            iK2 = k(this.f) + this.f.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f) + this.f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.n)) {
            iMax5 += r(this.n, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.n) + this.n.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        }
        if (t(this.j)) {
            iMax5 += r(this.j, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.j) + this.j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((si3) childAt.getLayoutParams()).b == 0 && t(childAt)) {
                iMax5 += r(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.w + this.x;
        int i7 = this.u + this.v;
        if (t(this.g)) {
            r(this.g, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.g) + this.g.getMeasuredWidth();
            iL = l(this.g) + this.g.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.g.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.h)) {
            iMax2 = Math.max(iMax2, r(this.h, i, i5 + i7, i2, i6 + iL, iArr));
            iL += l(this.h) + this.h.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.h.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.U) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof ui3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ui3 ui3Var = (ui3) parcelable;
        super.onRestoreInstanceState(ui3Var.f);
        ActionMenuView actionMenuView = this.f;
        nn1 nn1Var = actionMenuView != null ? actionMenuView.u : null;
        int i = ui3Var.h;
        if (i != 0 && this.R != null && nn1Var != null && (menuItemFindItem = nn1Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (ui3Var.i) {
            e7 e7Var = this.b0;
            removeCallbacks(e7Var);
            post(e7Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        gp2 gp2Var = this.y;
        boolean z = i == 1;
        if (z == gp2Var.g) {
            return;
        }
        gp2Var.g = z;
        if (!gp2Var.h) {
            gp2Var.a = gp2Var.e;
            gp2Var.b = gp2Var.f;
            return;
        }
        if (z) {
            int i2 = gp2Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = gp2Var.e;
            }
            gp2Var.a = i2;
            int i3 = gp2Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = gp2Var.f;
            }
            gp2Var.b = i3;
            return;
        }
        int i4 = gp2Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = gp2Var.e;
        }
        gp2Var.a = i4;
        int i5 = gp2Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = gp2Var.f;
        }
        gp2Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        wn1 wn1Var;
        ui3 ui3Var = new ui3(super.onSaveInstanceState());
        ri3 ri3Var = this.R;
        if (ri3Var != null && (wn1Var = ri3Var.g) != null) {
            ui3Var.h = wn1Var.a;
        }
        ui3Var.i = o();
        return ui3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.G = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        si3 si3Var = (si3) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) si3Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) si3Var).rightMargin + iMax;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        si3 si3Var = (si3) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) si3Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) si3Var).leftMargin);
    }

    public final int r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            v();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ch chVar = this.m;
        if (chVar != null) {
            chVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.m.setImageDrawable(drawable);
        } else {
            ch chVar = this.m;
            if (chVar != null) {
                chVar.setImageDrawable(this.k);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.U = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A) {
            this.A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.z) {
            this.z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        dh dhVar = this.j;
        if (drawable != null) {
            if (dhVar == null) {
                this.j = new dh(getContext(), null, 0);
            }
            if (!n(this.j)) {
                b(this.j, true);
            }
        } else if (dhVar != null && n(dhVar)) {
            removeView(this.j);
            this.J.remove(this.j);
        }
        dh dhVar2 = this.j;
        if (dhVar2 != null) {
            dhVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.j == null) {
            this.j = new dh(getContext(), null, 0);
        }
        dh dhVar = this.j;
        if (dhVar != null) {
            dhVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ch chVar = this.i;
        if (chVar != null) {
            chVar.setContentDescription(charSequence);
            cj3.a(this.i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.i)) {
                b(this.i, true);
            }
        } else {
            ch chVar = this.i;
            if (chVar != null && n(chVar)) {
                removeView(this.i);
                this.J.remove(this.i);
            }
        }
        ch chVar2 = this.i;
        if (chVar2 != null) {
            chVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(ti3 ti3Var) {
        this.N = ti3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.p != i) {
            this.p = i;
            if (i == 0) {
                this.o = getContext();
            } else {
                this.o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        gi giVar = this.h;
        if (!zIsEmpty) {
            if (giVar == null) {
                Context context = getContext();
                gi giVar2 = new gi(context, null);
                this.h = giVar2;
                giVar2.setSingleLine();
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.r;
                if (i != 0) {
                    this.h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.h.setTextColor(colorStateList);
                }
            }
            if (!n(this.h)) {
                b(this.h, true);
            }
        } else if (giVar != null && n(giVar)) {
            removeView(this.h);
            this.J.remove(this.h);
        }
        gi giVar3 = this.h;
        if (giVar3 != null) {
            giVar3.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        gi giVar = this.h;
        if (giVar != null) {
            giVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        gi giVar = this.g;
        if (!zIsEmpty) {
            if (giVar == null) {
                Context context = getContext();
                gi giVar2 = new gi(context, null);
                this.g = giVar2;
                giVar2.setSingleLine();
                this.g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.q;
                if (i != 0) {
                    this.g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.g.setTextColor(colorStateList);
                }
            }
            if (!n(this.g)) {
                b(this.g, true);
            }
        } else if (giVar != null && n(giVar)) {
            removeView(this.g);
            this.J.remove(this.g);
        }
        gi giVar3 = this.g;
        if (giVar3 != null) {
            giVar3.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.w = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        gi giVar = this.g;
        if (giVar != null) {
            giVar.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        z2 z2Var;
        ActionMenuView actionMenuView = this.f;
        return (actionMenuView == null || (z2Var = actionMenuView.y) == null || !z2Var.l()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = qi3.a(this);
            ri3 ri3Var = this.R;
            int i = 0;
            boolean z = (ri3Var == null || ri3Var.g == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.a0) ? false : true;
            if (z && this.W == null) {
                if (this.V == null) {
                    this.V = qi3.b(new oi3(this, i));
                }
                qi3.c(onBackInvokedDispatcherA, this.V);
                this.W = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.W) == null) {
                return;
            }
            qi3.d(onBackInvokedDispatcher, this.V);
            this.W = null;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(rn.C(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(rn.C(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(rn.C(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
