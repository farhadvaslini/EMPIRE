package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class n4 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ r4 f;
    public final /* synthetic */ o4 g;

    public n4(o4 o4Var, r4 r4Var) {
        this.g = o4Var;
        this.f = r4Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        o4 o4Var = this.g;
        DialogInterface.OnClickListener onClickListener = o4Var.h;
        r4 r4Var = this.f;
        onClickListener.onClick(r4Var.b, i);
        if (o4Var.i) {
            return;
        }
        r4Var.b.dismiss();
    }
}
