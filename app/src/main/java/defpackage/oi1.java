package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class oi1 implements po1, AdapterView.OnItemClickListener {
    public Context f;
    public LayoutInflater g;
    public nn1 h;
    public ExpandedMenuView i;
    public oo1 j;
    public ni1 k;

    public oi1(ContextWrapper contextWrapper) {
        this.f = contextWrapper;
        this.g = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.po1
    public final void b(nn1 nn1Var, boolean z) {
        oo1 oo1Var = this.j;
        if (oo1Var != null) {
            oo1Var.b(nn1Var, z);
        }
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

    @Override // defpackage.po1
    public final void g() {
        ni1 ni1Var = this.k;
        if (ni1Var != null) {
            ni1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.po1
    public final void h(Context context, nn1 nn1Var) {
        if (this.f != null) {
            this.f = context;
            if (this.g == null) {
                this.g = LayoutInflater.from(context);
            }
        }
        this.h = nn1Var;
        ni1 ni1Var = this.k;
        if (ni1Var != null) {
            ni1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.po1
    public final boolean j(na3 na3Var) {
        boolean zHasVisibleItems = na3Var.hasVisibleItems();
        Context context = na3Var.a;
        if (!zHasVisibleItems) {
            return false;
        }
        pn1 pn1Var = new pn1();
        pn1Var.f = na3Var;
        s4 s4Var = new s4(context);
        o4 o4Var = (o4) s4Var.b;
        oi1 oi1Var = new oi1(o4Var.a);
        pn1Var.h = oi1Var;
        oi1Var.j = pn1Var;
        na3Var.b(oi1Var, context);
        oi1 oi1Var2 = pn1Var.h;
        if (oi1Var2.k == null) {
            oi1Var2.k = new ni1(oi1Var2);
        }
        o4Var.g = oi1Var2.k;
        o4Var.h = pn1Var;
        View view = na3Var.o;
        if (view != null) {
            o4Var.e = view;
        } else {
            o4Var.c = na3Var.n;
            o4Var.d = na3Var.m;
        }
        o4Var.f = pn1Var;
        t4 t4VarC = s4Var.c();
        pn1Var.g = t4VarC;
        t4VarC.setOnDismissListener(pn1Var);
        WindowManager.LayoutParams attributes = pn1Var.g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pn1Var.g.show();
        oo1 oo1Var = this.j;
        if (oo1Var == null) {
            return true;
        }
        oo1Var.p(na3Var);
        return true;
    }

    @Override // defpackage.po1
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.h.q(this.k.getItem(i), this, 0);
    }
}
