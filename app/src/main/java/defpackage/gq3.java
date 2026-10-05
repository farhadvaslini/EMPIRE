package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class gq3 {
    public static mt3 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        mt3 mt3VarC = mt3.c(rootWindowInsets, null);
        jt3 jt3Var = mt3VarC.a;
        jt3Var.y(mt3VarC);
        View rootView = view.getRootView();
        jt3Var.d(rootView);
        jt3Var.p(rootView);
        jt3Var.q();
        return mt3VarC;
    }
}
