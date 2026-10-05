package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class v83 extends e3 implements ln1 {
    public Context h;
    public ActionBarContextView i;
    public a31 j;
    public WeakReference k;
    public boolean l;
    public nn1 m;

    @Override // defpackage.e3
    public final void a() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.j.i(this);
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
        return this.m;
    }

    @Override // defpackage.e3
    public final MenuInflater d() {
        return new bb3(this.i.getContext());
    }

    @Override // defpackage.e3
    public final CharSequence e() {
        return this.i.getSubtitle();
    }

    @Override // defpackage.e3
    public final CharSequence f() {
        return this.i.getTitle();
    }

    @Override // defpackage.ln1
    public final boolean g(nn1 nn1Var, MenuItem menuItem) {
        return ((d3) this.j.g).e(this, menuItem);
    }

    @Override // defpackage.e3
    public final void h() {
        this.j.h(this, this.m);
    }

    @Override // defpackage.e3
    public final boolean i() {
        return this.i.x;
    }

    @Override // defpackage.e3
    public final void j(View view) {
        this.i.setCustomView(view);
        this.k = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.e3
    public final void k(int i) {
        m(this.h.getString(i));
    }

    @Override // defpackage.ln1
    public final void l(nn1 nn1Var) {
        h();
        z2 z2Var = this.i.i;
        if (z2Var != null) {
            z2Var.l();
        }
    }

    @Override // defpackage.e3
    public final void m(CharSequence charSequence) {
        this.i.setSubtitle(charSequence);
    }

    @Override // defpackage.e3
    public final void n(int i) {
        o(this.h.getString(i));
    }

    @Override // defpackage.e3
    public final void o(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    @Override // defpackage.e3
    public final void p(boolean z) {
        this.g = z;
        this.i.setTitleOptional(z);
    }
}
