package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ps3 extends WindowInsetsAnimation$Callback {
    public final kx a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public ps3(kx kxVar) {
        super(kxVar.f);
        this.d = new HashMap();
        this.a = kxVar;
    }

    public final ss3 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        ss3 ss3Var = (ss3) map.get(windowInsetsAnimation);
        if (ss3Var != null) {
            return ss3Var;
        }
        ss3 ss3Var2 = new ss3(0, null, 0L);
        ss3Var2.a = new qs3(windowInsetsAnimation);
        map.put(windowInsetsAnimation, ss3Var2);
        return ss3Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationH = os3.h(list.get(size));
            ss3 ss3VarA = a(windowInsetsAnimationH);
            ss3VarA.a.e(windowInsetsAnimationH.getFraction());
            this.c.add(ss3VarA);
        }
        return this.a.f(mt3.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        ar2 ar2VarH = this.a.h(a(windowInsetsAnimation), new ar2(bounds));
        ar2VarH.getClass();
        os3.j();
        return os3.f(((h31) ar2VarH.g).d(), ((h31) ar2VarH.h).d());
    }
}
