package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class na3 extends nn1 implements SubMenu {
    public final wn1 A;
    public final nn1 z;

    public na3(Context context, nn1 nn1Var, wn1 wn1Var) {
        super(context);
        this.z = nn1Var;
        this.A = wn1Var;
    }

    @Override // defpackage.nn1
    public final boolean d(wn1 wn1Var) {
        return this.z.d(wn1Var);
    }

    @Override // defpackage.nn1
    public final boolean e(nn1 nn1Var, MenuItem menuItem) {
        return super.e(nn1Var, menuItem) || this.z.e(nn1Var, menuItem);
    }

    @Override // defpackage.nn1
    public final boolean f(wn1 wn1Var) {
        return this.z.f(wn1Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.nn1
    public final String j() {
        wn1 wn1Var = this.A;
        int i = wn1Var != null ? wn1Var.a : 0;
        if (i == 0) {
            return null;
        }
        return by1.e(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.nn1
    public final nn1 k() {
        return this.z.k();
    }

    @Override // defpackage.nn1
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.nn1
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.nn1
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.nn1, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.nn1, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
