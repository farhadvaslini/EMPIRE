package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.nn1 r20) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds.u(nn1):void");
    }
}
