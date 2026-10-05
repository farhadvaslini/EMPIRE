package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dh0 extends ch0 {
    @Override // defpackage.bh0, defpackage.yg0
    public void b(yb3 yb3Var, yb3 yb3Var2, Window window, View view, boolean z, boolean z2) {
        yb3Var.getClass();
        yb3Var2.getClass();
        window.getClass();
        view.getClass();
        oz2.K(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof ey)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        k71 k71Var = new k71(view);
        int i3 = Build.VERSION.SDK_INT;
        g12 pt3Var = i3 >= 35 ? new pt3(window, k71Var) : i3 >= 30 ? new ot3(window, k71Var) : new nt3(window, k71Var);
        pt3Var.c0(!z);
        pt3Var.b0(!z2);
    }
}
