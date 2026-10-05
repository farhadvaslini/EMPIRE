package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fs3 extends e3 implements ln1 {
    public final Context h;
    public final nn1 i;
    public a31 j;
    public WeakReference k;
    public final /* synthetic */ gs3 l;

    public fs3(gs3 gs3Var, Context context, a31 a31Var) {
        this.l = gs3Var;
        this.h = context;
        this.j = a31Var;
        nn1 nn1Var = new nn1(context);
        nn1Var.l = 1;
        this.i = nn1Var;
        nn1Var.e = this;
    }

    @Override // defpackage.e3
    public final void a() {
        gs3 gs3Var = this.l;
        if (gs3Var.i != this) {
            return;
        }
        if (gs3Var.p) {
            gs3Var.j = this;
            gs3Var.k = this.j;
        } else {
            this.j.i(this);
        }
        this.j = null;
        gs3Var.p(false);
        ActionBarContextView actionBarContextView = gs3Var.f;
        if (actionBarContextView.p == null) {
            actionBarContextView.e();
        }
        gs3Var.c.setHideOnContentScrollEnabled(gs3Var.u);
        gs3Var.i = null;
    }

    @Override // defpackage.e3
    public final View b() {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.e3
    public final nn1 c() {
        return this.i;
    }

    @Override // defpackage.e3
    public final MenuInflater d() {
        return new bb3(this.h);
    }

    @Override // defpackage.e3
    public final CharSequence e() {
        return this.l.f.getSubtitle();
    }

    @Override // defpackage.e3
    public final CharSequence f() {
        return this.l.f.getTitle();
    }

    @Override // defpackage.ln1
    public final boolean g(nn1 nn1Var, MenuItem menuItem) {
        a31 a31Var = this.j;
        if (a31Var != null) {
            return ((d3) a31Var.g).e(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.e3
    public final void h() {
        if (this.l.i != this) {
            return;
        }
        nn1 nn1Var = this.i;
        nn1Var.w();
        try {
            this.j.h(this, nn1Var);
        } finally {
            nn1Var.v();
        }
    }

    @Override // defpackage.e3
    public final boolean i() {
        return this.l.f.x;
    }

    @Override // defpackage.e3
    public final void j(View view) {
        this.l.f.setCustomView(view);
        this.k = new WeakReference(view);
    }

    @Override // defpackage.e3
    public final void k(int i) {
        m(this.l.a.getResources().getString(i));
    }

    @Override // defpackage.ln1
    public final void l(nn1 nn1Var) {
        if (this.j == null) {
            return;
        }
        h();
        z2 z2Var = this.l.f.i;
        if (z2Var != null) {
            z2Var.l();
        }
    }

    @Override // defpackage.e3
    public final void m(CharSequence charSequence) {
        this.l.f.setSubtitle(charSequence);
    }

    @Override // defpackage.e3
    public final void n(int i) {
        o(this.l.a.getResources().getString(i));
    }

    @Override // defpackage.e3
    public final void o(CharSequence charSequence) {
        this.l.f.setTitle(charSequence);
    }

    @Override // defpackage.e3
    public final void p(boolean z) {
        this.g = z;
        this.l.f.setTitleOptional(z);
    }
}
