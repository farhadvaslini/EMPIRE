package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class eq3 implements View.OnApplyWindowInsetsListener {
    public mt3 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ oy1 c;

    public eq3(View view, oy1 oy1Var) {
        this.b = view;
        this.c = oy1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        mt3 mt3VarC = mt3.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        oy1 oy1Var = this.c;
        if (i < 30) {
            fq3.a(windowInsets, this.b);
            if (mt3VarC.equals(this.a)) {
                return oy1Var.g(view, mt3VarC).b();
            }
        }
        this.a = mt3VarC;
        mt3 mt3VarG = oy1Var.g(view, mt3VarC);
        if (i >= 30) {
            return mt3VarG.b();
        }
        WeakHashMap weakHashMap = mq3.a;
        view.requestApplyInsets();
        return mt3VarG.b();
    }
}
