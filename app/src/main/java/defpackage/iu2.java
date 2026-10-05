package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class iu2 {
    public static final qn1 a = m22.p;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(za2 za2Var) {
        MotionEvent motionEventA;
        List list = za2Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((gb2) list.get(i)).i == 2) {
                i++;
            } else {
                MotionEvent motionEventA2 = za2Var.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = za2Var.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
    }
}
