package defpackage;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class mc implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ pq3 g;

    public /* synthetic */ mc(pq3 pq3Var, int i) {
        this.f = i;
        this.g = pq3Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        boolean zDispatchTouchEvent;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        pq3 pq3Var = this.g;
        switch (i) {
            case 0:
                pq3Var.v = (ns0) obj;
                return dm3Var;
            case 1:
                q12 q12Var = (q12) obj;
                h7 h7Var = q12Var instanceof h7 ? (h7) q12Var : null;
                if (h7Var != null) {
                    h7Var.getAndroidViewsHandler$ui().removeViewInLayout(pq3Var);
                    cl3.g(h7Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(h7Var.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(pq3Var));
                    pq3Var.setImportantForAccessibility(0);
                }
                pq3Var.removeAllViewsInLayout();
                return dm3Var;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        zDispatchTouchEvent = pq3Var.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = pq3Var.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
