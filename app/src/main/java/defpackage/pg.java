package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class pg {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, vg vgVar) {
        Objects.requireNonNull(vgVar);
        mf mfVar = new mf(1, vgVar);
        l1.o(obj).registerOnBackInvokedCallback(1000000, mfVar);
        return mfVar;
    }

    public static void c(Object obj, Object obj2) {
        l1.o(obj).unregisterOnBackInvokedCallback(l1.k(obj2));
    }
}
