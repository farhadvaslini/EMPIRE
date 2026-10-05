package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ds extends fo1 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public oo1 B;
    public ViewTreeObserver C;
    public PopupWindow.OnDismissListener D;
    public boolean E;
    public final Context g;
    public final int h;
    public final int i;
    public final boolean j;
    public final Handler k;
    public View s;
    public View t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final mh n = new mh(2, this);
    public final e9 o = new e9(1, this);
    public final yl1 p = new yl1(11, this);
    public int q = 0;
    public int r = 0;
    public boolean z = false;

    public ds(Context context, View view, int i, boolean z) {
        this.g = context;
        this.s = view;
        this.i = i;
        this.j = z;
        this.u = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.k = new Handler();
    }

    @Override // defpackage.v33
    public final boolean a() {
        ArrayList arrayList = this.m;
        return arrayList.size() > 0 && ((cs) arrayList.get(0)).a.D.isShowing();
    }

    @Override // defpackage.po1
    public final void b(nn1 nn1Var, boolean z) {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (nn1Var == ((cs) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((cs) arrayList.get(i2)).b.c(false);
        }
        cs csVar = (cs) arrayList.remove(i);
        nn1 nn1Var2 = csVar.b;
        lo1 lo1Var = csVar.a;
        fh fhVar = lo1Var.D;
        nn1Var2.r(this);
        if (this.E) {
            io1.b(fhVar, null);
            fhVar.setAnimationStyle(0);
        }
        lo1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.u = ((cs) arrayList.get(size2 - 1)).c;
        } else {
            this.u = this.s.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((cs) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        oo1 oo1Var = this.B;
        if (oo1Var != null) {
            oo1Var.b(nn1Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.C.removeGlobalOnLayoutListener(this.n);
            }
            this.C = null;
        }
        this.t.removeOnAttachStateChangeListener(this.o);
        this.D.onDismiss();
    }

    @Override // defpackage.v33
    public final void c() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((nn1) obj);
        }
        arrayList.clear();
        View view = this.s;
        this.t = view;
        if (view != null) {
            boolean z = this.C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.C = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.n);
            }
            this.t.addOnAttachStateChangeListener(this.o);
        }
    }

    @Override // defpackage.v33
    public final void dismiss() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        if (size > 0) {
            cs[] csVarArr = (cs[]) arrayList.toArray(new cs[size]);
            for (int i = size - 1; i >= 0; i--) {
                cs csVar = csVarArr[i];
                if (csVar.a.D.isShowing()) {
                    csVar.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.po1
    public final void e(oo1 oo1Var) {
        this.B = oo1Var;
    }

    @Override // defpackage.po1
    public final void g() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((cs) obj).a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((kn1) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.v33
    public final cg0 i() {
        ArrayList arrayList = this.m;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((cs) arrayList.get(arrayList.size() - 1)).a.h;
    }

    @Override // defpackage.po1
    public final boolean j(na3 na3Var) {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            cs csVar = (cs) obj;
            if (na3Var == csVar.b) {
                csVar.a.h.requestFocus();
                return true;
            }
        }
        if (!na3Var.hasVisibleItems()) {
            return false;
        }
        l(na3Var);
        oo1 oo1Var = this.B;
        if (oo1Var != null) {
            oo1Var.p(na3Var);
        }
        return true;
    }

    @Override // defpackage.po1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.fo1
    public final void l(nn1 nn1Var) {
        nn1Var.b(this, this.g);
        if (a()) {
            u(nn1Var);
        } else {
            this.l.add(nn1Var);
        }
    }

    @Override // defpackage.fo1
    public final void n(View view) {
        if (this.s != view) {
            this.s = view;
            this.r = Gravity.getAbsoluteGravity(this.q, view.getLayoutDirection());
        }
    }

    @Override // defpackage.fo1
    public final void o(boolean z) {
        this.z = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        cs csVar;
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                csVar = null;
                break;
            }
            csVar = (cs) arrayList.get(i);
            if (!csVar.a.D.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (csVar != null) {
            csVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.fo1
    public final void p(int i) {
        if (this.q != i) {
            this.q = i;
            this.r = Gravity.getAbsoluteGravity(i, this.s.getLayoutDirection());
        }
    }

    @Override // defpackage.fo1
    public final void q(int i) {
        this.v = true;
        this.x = i;
    }

    @Override // defpackage.fo1
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // defpackage.fo1
    public final void s(boolean z) {
        this.A = z;
    }

    @Override // defpackage.fo1
    public final void t(int i) {
        this.w = true;
        this.y = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(nn1 nn1Var) {
        boolean z;
        char c;
        View childAt;
        cs csVar;
        int i;
        int i2;
        MenuItem item;
        kn1 kn1Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.g;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        kn1 kn1Var2 = new kn1(nn1Var, layoutInflaterFrom, this.j, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.z) {
            kn1Var2.c = true;
        } else if (a()) {
            int size = nn1Var.f.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = nn1Var.getItem(i3);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i3++;
            }
            kn1Var2.c = z;
        }
        int iM = fo1.m(kn1Var2, context, this.h);
        lo1 lo1Var = new lo1(context, null, this.i);
        lo1Var.G = this.p;
        lo1Var.u = this;
        fh fhVar = lo1Var.D;
        fhVar.setOnDismissListener(this);
        lo1Var.t = this.s;
        lo1Var.q = this.r;
        lo1Var.C = true;
        fhVar.setFocusable(true);
        fhVar.setInputMethodMode(2);
        lo1Var.p(kn1Var2);
        lo1Var.r(iM);
        lo1Var.q = this.r;
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            csVar = (cs) arrayList.get(arrayList.size() - 1);
            nn1 nn1Var2 = csVar.b;
            int size2 = nn1Var2.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    item = null;
                    break;
                }
                item = nn1Var2.getItem(i4);
                if (item.hasSubMenu() && nn1Var == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                childAt = null;
                c = 0;
            } else {
                cg0 cg0Var = csVar.a.h;
                ListAdapter adapter = cg0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    kn1Var = (kn1) headerViewListAdapter.getWrappedAdapter();
                } else {
                    kn1Var = (kn1) adapter;
                    headersCount = 0;
                }
                int count = kn1Var.getCount();
                int i5 = 0;
                c = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (item == kn1Var.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                childAt = (i5 != -1 && (firstVisiblePosition = (i5 + headersCount) - cg0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < cg0Var.getChildCount()) ? cg0Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            csVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = lo1.H;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(fhVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                jo1.a(fhVar, c);
            }
            io1.a(fhVar, null);
            cg0 cg0Var2 = ((cs) arrayList.get(arrayList.size() - 1)).a.h;
            int[] iArr = new int[2];
            cg0Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.t.getWindowVisibleDisplayFrame(rect);
            if (this.u == 1) {
                i = (cg0Var2.getWidth() + iArr[0]) + iM > rect.right ? 0 : 1;
                boolean z2 = i != 1;
                this.u = i;
                lo1Var.t = childAt;
                if ((this.r & 5) == 5) {
                    i2 = 0;
                    iM = z2 ? childAt.getWidth() : 0 - iM;
                } else if (z2) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    iM = 0 - childAt.getWidth();
                }
                lo1Var.k = iM;
                lo1Var.p = true;
                lo1Var.o = true;
                lo1Var.g(i2);
            } else {
                if (iArr[0] - iM >= 0) {
                    i = 0;
                }
                if (i != 1) {
                }
                this.u = i;
                lo1Var.t = childAt;
                if ((this.r & 5) == 5) {
                }
                lo1Var.k = iM;
                lo1Var.p = true;
                lo1Var.o = true;
                lo1Var.g(i2);
            }
        } else {
            if (this.v) {
                lo1Var.k = this.x;
            }
            if (this.w) {
                lo1Var.g(this.y);
            }
            Rect rect2 = this.f;
            lo1Var.B = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new cs(lo1Var, nn1Var, this.u));
        lo1Var.c();
        cg0 cg0Var3 = lo1Var.h;
        cg0Var3.setOnKeyListener(this);
        if (csVar == null && this.A && nn1Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) cg0Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(nn1Var.m);
            cg0Var3.addHeaderView(frameLayout, null, false);
            lo1Var.c();
        }
    }
}
