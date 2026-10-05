package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qh implements AdapterView.OnItemClickListener {
    public final /* synthetic */ sh f;

    public qh(sh shVar) {
        this.f = shVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        sh shVar = this.f;
        vh vhVar = shVar.K;
        vhVar.setSelection(i);
        if (vhVar.getOnItemClickListener() != null) {
            vhVar.performItemClick(view, i, shVar.H.getItemId(i));
        }
        shVar.dismiss();
    }
}
