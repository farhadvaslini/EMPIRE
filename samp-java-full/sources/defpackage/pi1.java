package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pi1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ wi1 f;

    public pi1(wi1 wi1Var) {
        this.f = wi1Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        cg0 cg0Var;
        if (i == -1 || (cg0Var = this.f.h) == null) {
            return;
        }
        cg0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
