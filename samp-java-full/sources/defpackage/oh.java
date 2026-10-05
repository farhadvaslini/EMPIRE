package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class oh implements uh, DialogInterface.OnClickListener {
    public t4 f;
    public ph g;
    public CharSequence h;
    public final /* synthetic */ vh i;

    public oh(vh vhVar) {
        this.i = vhVar;
    }

    @Override // defpackage.uh
    public final boolean a() {
        t4 t4Var = this.f;
        if (t4Var != null) {
            return t4Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.uh
    public final int b() {
        return 0;
    }

    @Override // defpackage.uh
    public final Drawable d() {
        return null;
    }

    @Override // defpackage.uh
    public final void dismiss() {
        t4 t4Var = this.f;
        if (t4Var != null) {
            t4Var.dismiss();
            this.f = null;
        }
    }

    @Override // defpackage.uh
    public final void e(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // defpackage.uh
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.uh
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.uh
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.uh
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.uh
    public final void m(int i, int i2) {
        if (this.g == null) {
            return;
        }
        vh vhVar = this.i;
        s4 s4Var = new s4(vhVar.getPopupContext());
        o4 o4Var = (o4) s4Var.b;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            o4Var.d = charSequence;
        }
        ph phVar = this.g;
        int selectedItemPosition = vhVar.getSelectedItemPosition();
        o4Var.g = phVar;
        o4Var.h = this;
        o4Var.j = selectedItemPosition;
        o4Var.i = true;
        t4 t4VarC = s4Var.c();
        this.f = t4VarC;
        AlertController$RecycleListView alertController$RecycleListView = t4VarC.l.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f.show();
    }

    @Override // defpackage.uh
    public final int n() {
        return 0;
    }

    @Override // defpackage.uh
    public final CharSequence o() {
        return this.h;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        vh vhVar = this.i;
        vhVar.setSelection(i);
        if (vhVar.getOnItemClickListener() != null) {
            vhVar.performItemClick(null, i, this.g.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.uh
    public final void p(ListAdapter listAdapter) {
        this.g = (ph) listAdapter;
    }
}
