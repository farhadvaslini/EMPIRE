package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.kl2;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class il2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, ef1 ef1Var) {
        ef1Var.getClass();
        if (activity instanceof of1) {
            gf1 lifecycle = ((of1) activity).getLifecycle();
            if (lifecycle instanceof rf1) {
                ((rf1) lifecycle).e(ef1Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            kl2.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new kl2.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new kl2(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
