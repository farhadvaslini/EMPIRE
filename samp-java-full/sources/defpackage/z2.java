package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class z2 implements po1 {
    public w2 A;
    public final Context f;
    public Context g;
    public nn1 h;
    public final LayoutInflater i;
    public oo1 j;
    public so1 m;
    public y2 n;
    public Drawable o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public v2 x;
    public v2 y;
    public x2 z;
    public final int k = R.layout.abc_action_menu_layout;
    public final int l = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray w = new SparseBooleanArray();
    public final yl1 B = new yl1(2, this);

    public z2(Context context) {
        this.f = context;
        this.i = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(wn1 wn1Var, View view, ViewGroup viewGroup) {
        View actionView = wn1Var.getActionView();
        if (actionView == null || wn1Var.e()) {
            ro1 ro1Var = view instanceof ro1 ? (ro1) view : (ro1) this.i.inflate(this.l, viewGroup, false);
            ro1Var.a(wn1Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) ro1Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.m);
            if (this.A == null) {
                this.A = new w2(this);
            }
            actionMenuItemView.setPopupCallback(this.A);
            actionView = (View) ro1Var;
        }
        actionView.setVisibility(wn1Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof b3)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.po1
    public final void b(nn1 nn1Var, boolean z) {
        c();
        v2 v2Var = this.y;
        if (v2Var != null && v2Var.b()) {
            v2Var.i.dismiss();
        }
        oo1 oo1Var = this.j;
        if (oo1Var != null) {
            oo1Var.b(nn1Var, z);
        }
    }

    public final boolean c() {
        Object obj;
        x2 x2Var = this.z;
        if (x2Var != null && (obj = this.m) != null) {
            ((View) obj).removeCallbacks(x2Var);
            this.z = null;
            return true;
        }
        v2 v2Var = this.x;
        if (v2Var == null) {
            return false;
        }
        if (v2Var.b()) {
            v2Var.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.po1
    public final boolean d(wn1 wn1Var) {
        return false;
    }

    @Override // defpackage.po1
    public final void e(oo1 oo1Var) {
        throw null;
    }

    @Override // defpackage.po1
    public final boolean f(wn1 wn1Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.po1
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.m;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            nn1 nn1Var = this.h;
            if (nn1Var != null) {
                nn1Var.i();
                ArrayList arrayListL = this.h.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    wn1 wn1Var = (wn1) arrayListL.get(i2);
                    if ((wn1Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        wn1 itemData = childAt instanceof ro1 ? ((ro1) childAt).getItemData() : null;
                        View viewA = a(wn1Var, childAt, viewGroup);
                        if (wn1Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.m).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.n) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.m).requestLayout();
        nn1 nn1Var2 = this.h;
        if (nn1Var2 != null) {
            nn1Var2.i();
            ArrayList arrayList2 = nn1Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                xn1 xn1Var = ((wn1) arrayList2.get(i3)).A;
            }
        }
        nn1 nn1Var3 = this.h;
        if (nn1Var3 != null) {
            nn1Var3.i();
            arrayList = nn1Var3.j;
        }
        if (this.q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((wn1) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        y2 y2Var = this.n;
        if (z) {
            if (y2Var == null) {
                this.n = new y2(this, this.f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.n.getParent();
            if (viewGroup3 != this.m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.m;
                y2 y2Var2 = this.n;
                actionMenuView.getClass();
                b3 b3VarI = ActionMenuView.i();
                b3VarI.a = true;
                actionMenuView.addView(y2Var2, b3VarI);
            }
        } else if (y2Var != null) {
            Object parent = y2Var.getParent();
            Object obj = this.m;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.n);
            }
        }
        ((ActionMenuView) this.m).setOverflowReserved(this.q);
    }

    @Override // defpackage.po1
    public final void h(Context context, nn1 nn1Var) {
        this.g = context;
        LayoutInflater.from(context);
        this.h = nn1Var;
        Resources resources = context.getResources();
        if (!this.r) {
            this.q = true;
        }
        int i = 2;
        this.s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.u = i;
        int measuredWidth = this.s;
        if (this.q) {
            if (this.n == null) {
                y2 y2Var = new y2(this, this.f);
                this.n = y2Var;
                if (this.p) {
                    y2Var.setImageDrawable(this.o);
                    this.o = null;
                    this.p = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.n.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.n.getMeasuredWidth();
        } else {
            this.n = null;
        }
        this.t = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean i() {
        v2 v2Var = this.x;
        return v2Var != null && v2Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.po1
    public final boolean j(na3 na3Var) {
        boolean z;
        if (na3Var.hasVisibleItems()) {
            na3 na3Var2 = na3Var;
            while (true) {
                nn1 nn1Var = na3Var2.z;
                if (nn1Var == this.h) {
                    break;
                }
                na3Var2 = (na3) nn1Var;
            }
            wn1 wn1Var = na3Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.m;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof ro1) && ((ro1) childAt).getItemData() == wn1Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                na3Var.A.getClass();
                int size = na3Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = na3Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                v2 v2Var = new v2(this, this.g, na3Var, view);
                this.y = v2Var;
                v2Var.g = z;
                fo1 fo1Var = v2Var.i;
                if (fo1Var != null) {
                    fo1Var.o(z);
                }
                v2 v2Var2 = this.y;
                if (!v2Var2.b()) {
                    if (v2Var2.e == null) {
                        c.q("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    v2Var2.d(0, 0, false, false);
                }
                oo1 oo1Var = this.j;
                if (oo1Var != null) {
                    oo1Var.p(na3Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.po1
    public final boolean k() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        z2 z2Var = this;
        nn1 nn1Var = z2Var.h;
        if (nn1Var != null) {
            arrayListL = nn1Var.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = z2Var.u;
        int i3 = z2Var.t;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) z2Var.m;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            wn1 wn1Var = (wn1) arrayListL.get(i4);
            int i7 = wn1Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (z2Var.v && wn1Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (z2Var.q && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = z2Var.w;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            wn1 wn1Var2 = (wn1) arrayListL.get(i9);
            int i11 = wn1Var2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = wn1Var2.b;
            if (z3) {
                View viewA = z2Var.a(wn1Var2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                wn1Var2.f(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewA2 = z2Var.a(wn1Var2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        wn1 wn1Var3 = (wn1) arrayListL.get(i13);
                        if (wn1Var3.b == i12) {
                            if ((wn1Var3.x & 32) == 32) {
                                i8++;
                            }
                            wn1Var3.f(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                wn1Var2.f(z5);
            } else {
                wn1Var2.f(false);
                i9++;
                i = 2;
                z2Var = this;
                z = true;
            }
            i9++;
            i = 2;
            z2Var = this;
            z = true;
        }
        return z;
    }

    public final boolean l() {
        nn1 nn1Var;
        if (this.q && !i() && (nn1Var = this.h) != null && this.m != null && this.z == null) {
            nn1Var.i();
            if (!nn1Var.j.isEmpty()) {
                x2 x2Var = new x2(0, this, new v2(this, this.g, this.h, this.n));
                this.z = x2Var;
                ((View) this.m).post(x2Var);
                return true;
            }
        }
        return false;
    }
}
