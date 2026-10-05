package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ri3 implements po1 {
    public nn1 f;
    public wn1 g;
    public final /* synthetic */ Toolbar h;

    public ri3(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // defpackage.po1
    public final boolean d(wn1 wn1Var) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof ox) {
            ((yn1) ((ox) callback)).f.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.n);
        toolbar.removeView(toolbar.m);
        toolbar.n = null;
        ArrayList arrayList = toolbar.J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.g = null;
        toolbar.requestLayout();
        wn1Var.C = false;
        wn1Var.n.p(false);
        toolbar.v();
        return true;
    }

    @Override // defpackage.po1
    public final boolean f(wn1 wn1Var) {
        Toolbar toolbar = this.h;
        toolbar.c();
        ViewParent parent = toolbar.m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.m);
            }
            toolbar.addView(toolbar.m);
        }
        View actionView = wn1Var.getActionView();
        toolbar.n = actionView;
        this.g = wn1Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.n);
            }
            si3 si3VarH = Toolbar.h();
            si3VarH.a = (toolbar.s & 112) | 8388611;
            si3VarH.b = 2;
            toolbar.n.setLayoutParams(si3VarH);
            toolbar.addView(toolbar.n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((si3) childAt.getLayoutParams()).b != 2 && childAt != toolbar.f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        wn1Var.C = true;
        wn1Var.n.p(false);
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof ox) {
            ((yn1) ((ox) callback)).f.onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // defpackage.po1
    public final void g() {
        if (this.g != null) {
            nn1 nn1Var = this.f;
            if (nn1Var != null) {
                int size = nn1Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f.getItem(i) == this.g) {
                        return;
                    }
                }
            }
            d(this.g);
        }
    }

    @Override // defpackage.po1
    public final void h(Context context, nn1 nn1Var) {
        wn1 wn1Var;
        nn1 nn1Var2 = this.f;
        if (nn1Var2 != null && (wn1Var = this.g) != null) {
            nn1Var2.d(wn1Var);
        }
        this.f = nn1Var;
    }

    @Override // defpackage.po1
    public final boolean j(na3 na3Var) {
        return false;
    }

    @Override // defpackage.po1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.po1
    public final void b(nn1 nn1Var, boolean z) {
    }
}
