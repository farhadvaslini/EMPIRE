package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.mn1;
import defpackage.nn1;
import defpackage.pi;
import defpackage.so1;
import defpackage.wn1;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements mn1, so1, AdapterView.OnItemClickListener {
    public static final int[] g = {R.attr.background, R.attr.divider};
    public nn1 f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        pi piVarH = pi.H(context, attributeSet, g, i);
        TypedArray typedArray = (TypedArray) piVarH.g;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(piVarH.p(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(piVarH.p(1));
        }
        piVarH.J();
    }

    @Override // defpackage.mn1
    public final boolean a(wn1 wn1Var) {
        return this.f.q(wn1Var, null, 0);
    }

    @Override // defpackage.so1
    public final void b(nn1 nn1Var) {
        this.f = nn1Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((wn1) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
