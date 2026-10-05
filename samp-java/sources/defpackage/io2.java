package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class io2 extends ViewGroup {
    public final int f;
    public final ArrayList g;
    public final ArrayList h;
    public final a31 i;
    public int j;

    public io2(Context context) {
        super(context);
        this.f = 5;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        this.i = new a31(29);
        setClipChildren(false);
        jo2 jo2Var = new jo2(context);
        addView(jo2Var);
        arrayList.add(jo2Var);
        arrayList2.add(jo2Var);
        this.j = 1;
        setTag(2131230822, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
