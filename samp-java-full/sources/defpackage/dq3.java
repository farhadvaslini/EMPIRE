package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class dq3 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = qq3.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
