package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i7 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ o7 g;

    public /* synthetic */ i7(o7 o7Var, int i) {
        this.f = i;
        this.g = o7Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        o7 o7Var = this.g;
        switch (i) {
            case 0:
                View view = o7Var.i;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                bs2 bs2Var = (bs2) obj;
                if (bs2Var.g.contains(bs2Var)) {
                    t12 snapshotObserver = o7Var.i.getSnapshotObserver();
                    snapshotObserver.a.d(bs2Var, o7Var.R, new u1(2, bs2Var, o7Var));
                }
                return dm3.a;
        }
    }
}
