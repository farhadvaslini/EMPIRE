package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fd2 extends ji0 {
    final /* synthetic */ gd2 this$0;

    /* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
    public static final class a extends ji0 {
        final /* synthetic */ gd2 this$0;

        public a(gd2 gd2Var) {
            this.this$0 = gd2Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            gd2 gd2Var = this.this$0;
            int i = gd2Var.f + 1;
            gd2Var.f = i;
            if (i == 1 && gd2Var.i) {
                gd2Var.k.e(ef1.ON_START);
                gd2Var.i = false;
            }
        }
    }

    public fd2(gd2 gd2Var) {
        this.this$0 = gd2Var;
    }

    @Override // defpackage.ji0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = kl2.g;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((kl2) fragmentFindFragmentByTag).f = this.this$0.m;
        }
    }

    @Override // defpackage.ji0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        gd2 gd2Var = this.this$0;
        int i = gd2Var.g - 1;
        gd2Var.g = i;
        if (i == 0) {
            Handler handler = gd2Var.j;
            handler.getClass();
            handler.postDelayed(gd2Var.l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        gf.l(activity, new a(this.this$0));
    }

    @Override // defpackage.ji0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        gd2 gd2Var = this.this$0;
        int i = gd2Var.f - 1;
        gd2Var.f = i;
        if (i == 0 && gd2Var.h) {
            gd2Var.k.e(ef1.ON_STOP);
            gd2Var.i = true;
        }
    }
}
