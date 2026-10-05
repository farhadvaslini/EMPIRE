package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class j7 {
    public static final void a(vu2 vu2Var, AccessibilityEvent accessibilityEvent) {
        qu2 qu2Var = vu2Var.d;
        Object objG = qu2Var.f.g(zu2.M);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            qn1.b();
        } else {
            Object objG2 = qu2Var.f.g(zu2.I);
            accessibilityEvent.setTextChangeTypes((((yg3) (objG2 != null ? objG2 : null)) != null ? 1 : 0) | accessibilityEvent.getTextChangeTypes());
        }
    }
}
