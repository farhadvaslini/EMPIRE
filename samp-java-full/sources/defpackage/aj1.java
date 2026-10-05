package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class aj1 implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final d42 a;
    public final d42 b;

    public aj1(cj1 cj1Var) {
        Boolean bool = Boolean.FALSE;
        this.a = b32.w(bool);
        this.b = b32.w(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.a.setValue(Boolean.valueOf(cj1.a(accessibilityManager)));
        this.b.setValue(Boolean.valueOf(cj1.b(accessibilityManager)));
    }
}
