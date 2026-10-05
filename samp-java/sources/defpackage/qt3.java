package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qt3 {
    public static final WeakHashMap w = new WeakHashMap();
    public final ad a;
    public final ad b;
    public final ad c;
    public final ad d;
    public final ad e;
    public final ad f;
    public final ad g;
    public final ad h;
    public final ad i;
    public final po3 j;
    public final d42 k;
    public final am3 l;
    public final po3 m;
    public final po3 n;
    public final po3 o;
    public final po3 p;
    public final po3 q;
    public final po3 r;
    public final po3 s;
    public final boolean t;
    public int u;
    public final l31 v;

    public qt3(View view) {
        ad adVarB = ak2.b(4, "captionBar");
        this.a = adVarB;
        ad adVarB2 = ak2.b(128, "displayCutout");
        this.b = adVarB2;
        ad adVarB3 = ak2.b(8, "ime");
        this.c = adVarB3;
        ad adVarB4 = ak2.b(32, "mandatorySystemGestures");
        this.d = adVarB4;
        ad adVarB5 = ak2.b(2, "navigationBars");
        this.e = adVarB5;
        ad adVarB6 = ak2.b(1, "statusBars");
        this.f = adVarB6;
        ad adVarB7 = ak2.b(519, "systemBars");
        this.g = adVarB7;
        ad adVarB8 = ak2.b(16, "systemGestures");
        this.h = adVarB8;
        ad adVarB9 = ak2.b(64, "tappableElement");
        this.i = adVarB9;
        po3 po3Var = new po3(new q31(0, 0, 0, 0), "waterfall");
        this.j = po3Var;
        this.k = b32.w(null);
        am3 am3Var = new am3(new am3(adVarB7, adVarB3), adVarB2);
        this.l = am3Var;
        new am3(am3Var, new am3(new am3(new am3(adVarB9, adVarB4), adVarB8), po3Var));
        this.m = ak2.d(4, "captionBarIgnoringVisibility");
        this.n = ak2.d(2, "navigationBarsIgnoringVisibility");
        this.o = ak2.d(1, "statusBarsIgnoringVisibility");
        this.p = ak2.d(519, "systemBarsIgnoringVisibility");
        this.q = ak2.d(64, "tappableElementIgnoringVisibility");
        this.r = new po3(new q31(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new po3(new q31(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(2131230801) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new l31(this);
        WeakHashMap weakHashMap = mq3.a;
        mt3 mt3VarA = gq3.a(view);
        if (mt3VarA != null) {
            jt3 jt3Var = mt3VarA.a;
            adVarB.f(jt3Var.u(4));
            adVarB2.f(jt3Var.u(128));
            adVarB3.f(jt3Var.u(8));
            adVarB4.f(jt3Var.u(32));
            adVarB5.f(jt3Var.u(2));
            adVarB6.f(jt3Var.u(1));
            adVarB7.f(jt3Var.u(519));
            adVarB8.f(jt3Var.u(16));
            adVarB9.f(jt3Var.u(64));
        }
    }

    public static void b(qt3 qt3Var, mt3 mt3Var) {
        boolean z = false;
        qt3Var.a.g(mt3Var, 0);
        qt3Var.c.g(mt3Var, 0);
        qt3Var.b.g(mt3Var, 0);
        qt3Var.e.g(mt3Var, 0);
        qt3Var.f.g(mt3Var, 0);
        qt3Var.g.g(mt3Var, 0);
        qt3Var.h.g(mt3Var, 0);
        qt3Var.i.g(mt3Var, 0);
        qt3Var.d.g(mt3Var, 0);
        qt3Var.m.f(t22.M(mt3Var.a.j(4)));
        qt3Var.n.f(t22.M(mt3Var.a.j(2)));
        qt3Var.o.f(t22.M(mt3Var.a.j(1)));
        qt3Var.p.f(t22.M(mt3Var.a.j(519)));
        qt3Var.q.f(t22.M(mt3Var.a.j(64)));
        cc0 cc0VarH = mt3Var.a.h();
        qt3Var.j.f(t22.M(cc0VarH != null ? cc0VarH.a() : h31.e));
        da daVar = null;
        if (cc0VarH != null) {
            Path pathB = Build.VERSION.SDK_INT >= 31 ? lf.b(cc0VarH.a) : null;
            if (pathB != null) {
                daVar = new da(pathB);
            }
        }
        qt3Var.k.setValue(daVar);
        synchronized (a73.c) {
            js1 js1Var = a73.j.h;
            if (js1Var != null) {
                if (js1Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            a73.a();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            l31 l31Var = this.v;
            l31Var.i = false;
            l31Var.j = false;
            l31Var.k = null;
            WeakHashMap weakHashMap = mq3.a;
            fq3.c(view, l31Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(l31Var);
            mq3.k(view, l31Var);
        }
        this.u++;
    }
}
