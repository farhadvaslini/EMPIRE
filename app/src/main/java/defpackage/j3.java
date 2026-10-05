package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
@xv1("activity")
public class j3 extends yv1 {
    public final Activity c;

    public j3(Context context) {
        Object next;
        context.getClass();
        Iterator it = pv2.H(context, new u0(2)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.c = (Activity) next;
    }

    @Override // defpackage.yv1
    public final fu1 a() {
        return new i3(this);
    }

    @Override // defpackage.yv1
    public final fu1 c(fu1 fu1Var) {
        throw new IllegalStateException(("Destination " + ((i3) fu1Var).g.a + " does not have an Intent set.").toString());
    }

    @Override // defpackage.yv1
    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
