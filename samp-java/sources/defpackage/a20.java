package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class a20 {
    public final View a;
    public boolean b;
    public g20 c;
    public of1 d;
    public wq2 e;
    public cr3 f;
    public final z01 g;
    public final wl2 h;
    public final Configuration i;
    public final os1 j;
    public final j6 k;
    public final jc l;
    public final a31 m;
    public final ax n;
    public final yp0 o;
    public final os1 p;
    public final px0 q;
    public final lc r;
    public final vb1 s;
    public final re1 t;
    public final sr u;
    public int v;
    public final ja w;
    public pb x;
    public final z10 y;

    public a20(a20 a20Var, View view, g20 g20Var, of1 of1Var, wq2 wq2Var, cr3 cr3Var) {
        z01 z01Var;
        Configuration configuration;
        os1 os1VarW;
        j6 j6Var;
        jc jcVar;
        a31 a31Var;
        ax q6Var;
        yp0 m22Var;
        os1 d42Var;
        lc lcVar;
        sr srVar;
        vb1 vb1Var;
        wl2 wl2Var;
        View view2;
        boolean zN = s51.n((a20Var == null || (view2 = a20Var.a) == null) ? null : view2.getContext(), view.getContext());
        this.a = view;
        this.c = g20Var;
        this.d = of1Var;
        this.e = wq2Var;
        this.f = cr3Var;
        if (zN) {
            a20Var.getClass();
            z01Var = a20Var.g;
        } else {
            z01Var = new z01();
        }
        this.g = z01Var;
        this.h = (a20Var == null || (wl2Var = a20Var.h) == null) ? new wl2() : wl2Var;
        if (zN) {
            a20Var.getClass();
            configuration = a20Var.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (zN) {
            a20Var.getClass();
            os1VarW = a20Var.j;
        } else {
            os1VarW = b32.w(new Configuration(configuration));
        }
        this.j = os1VarW;
        if (zN) {
            a20Var.getClass();
            j6Var = a20Var.k;
        } else {
            j6Var = new j6(view.getContext());
        }
        this.k = j6Var;
        if (zN) {
            a20Var.getClass();
            jcVar = a20Var.l;
        } else {
            jcVar = new jc(view.getContext());
        }
        this.l = jcVar;
        if (zN) {
            a20Var.getClass();
            a31Var = a20Var.m;
        } else {
            a31Var = new a31(3, view.getContext());
        }
        this.m = a31Var;
        if (zN) {
            a20Var.getClass();
            q6Var = a20Var.n;
        } else {
            q6Var = new q6(a31Var);
        }
        this.n = q6Var;
        if (zN) {
            a20Var.getClass();
            m22Var = a20Var.o;
        } else {
            view.getContext();
            m22Var = new m22(24);
        }
        this.o = m22Var;
        if (zN) {
            a20Var.getClass();
            d42Var = a20Var.p;
        } else {
            d42Var = new d42(ur.x(view.getContext()), m22.k);
        }
        this.p = d42Var;
        this.q = view == (a20Var != null ? a20Var.a : null) ? a20Var.q : new n62(view);
        if (zN) {
            a20Var.getClass();
            lcVar = a20Var.r;
        } else {
            lcVar = new lc(ViewConfiguration.get(view.getContext()));
        }
        this.r = lcVar;
        this.s = (a20Var == null || (vb1Var = a20Var.s) == null) ? new vb1() : vb1Var;
        this.t = new re1();
        this.u = (a20Var == null || (srVar = a20Var.u) == null) ? new sr() : srVar;
        this.w = new ja(8, this);
        this.y = new z10(this);
    }

    public final void a(h7 h7Var, d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(123858079);
        int i2 = (nv0Var.h(h7Var) ? 4 : 2) | i | (nv0Var.h(d00Var) ? 32 : 16) | (nv0Var.h(this) ? 256 : 128);
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            Object tag = h7Var.getTag(2131230830);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof t61) && !(tag instanceof x61))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = h7Var.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(2131230830) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof t61) || (tag2 instanceof x61))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(nv0Var.x());
                nv0Var.q = true;
                nv0Var.C = true;
                nv0Var.c.b();
                nv0Var.H.b();
                m53 m53Var = nv0Var.I;
                j53 j53Var = m53Var.a;
                m53Var.e = j53Var.o;
                m53Var.f = j53Var.p;
            }
            boolean zF = nv0Var.f(h7Var.getView());
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (zF || objO == zjVar) {
                objO = new ir3(h7Var.getView());
                nv0Var.j0(objO);
            }
            ir3 ir3Var = (ir3) objO;
            he2 he2VarA = ij1.a.a(d());
            ee2 ee2Var = nj1.a;
            g();
            wq2 wq2Var = this.e;
            wq2Var.getClass();
            he2 he2VarA2 = ee2Var.a(wq2Var);
            he2 he2VarA3 = x7.d.a(this.g);
            he2 he2VarA4 = x7.e.a(this.h);
            r93 r93Var = s20.v;
            boolean zH = nv0Var.h(this);
            Object objO2 = nv0Var.O();
            if (zH || objO2 == zjVar) {
                objO2 = new s(17, this);
                nv0Var.j0(objO2);
            }
            he2 he2VarC = r93Var.c((ns0) objO2);
            he2 he2VarA5 = x7.b.a(h7Var.getContext());
            he2 he2VarA6 = s31.a.a(set);
            he2 he2VarA7 = x7.a.a(h7Var.getConfiguration());
            r93 r93Var2 = iq2.a;
            boolean zH2 = nv0Var.h(h7Var);
            Object objO3 = nv0Var.O();
            if (zH2 || objO3 == zjVar) {
                objO3 = new r6(h7Var, 3);
                nv0Var.j0(objO3);
            }
            he2 he2VarC2 = r93Var2.c((ns0) objO3);
            he2 he2VarA8 = x7.f.a(h7Var.getView());
            t20 t20Var = s20.x;
            boolean zH3 = nv0Var.h(h7Var);
            Object objO4 = nv0Var.O();
            if (zH3 || objO4 == zjVar) {
                objO4 = new r6(h7Var, 4);
                nv0Var.j0(objO4);
            }
            vr.d(new he2[]{he2VarA, he2VarA2, he2VarA3, he2VarA4, he2VarC, he2VarA5, he2VarA6, he2VarA7, he2VarC2, he2VarA8, t20Var.c((ns0) objO4), s20.t.a(h7Var.getViewConfiguration()), xy0.a.a(ir3Var)}, gq.N(1317454175, new y10(h7Var, this, d00Var), nv0Var), nv0Var, 56);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y10(this, h7Var, d00Var, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.v = 0;
        }
        if (this.v == 0) {
            View view = this.a;
            Context context = view.getContext();
            z10 z10Var = this.y;
            context.unregisterComponentCallbacks(z10Var);
            this.t.getClass();
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(z10Var);
        }
    }

    public final g20 c() {
        g();
        g20 g20Var = this.c;
        g20Var.getClass();
        return g20Var;
    }

    public final of1 d() {
        g();
        of1 of1Var = this.d;
        of1Var.getClass();
        return of1Var;
    }

    public final void e() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            z10 z10Var = this.y;
            context.registerComponentCallbacks(z10Var);
            f(view.getResources().getConfiguration());
            this.t.a.setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(z10Var);
        }
    }

    public final void f(Configuration configuration) {
        int iUpdateFrom = this.i.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                x01 x01Var = (x01) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (x01Var == null || Configuration.needNewResources(iUpdateFrom, x01Var.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            wl2 wl2Var = this.h;
            synchronized (wl2Var) {
                wl2Var.a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.p.setValue(ur.x(this.a.getContext()));
            }
            if ((805248384 & iUpdateFrom) != 0) {
                this.t.getClass();
            }
        }
    }

    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        g20 g20Var = this.c;
        View view = this.a;
        if (g20Var == null) {
            g20 g20VarA = gu3.a(view);
            if (g20VarA == null) {
                Object parent = view.getParent();
                while (g20VarA == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    g20VarA = gu3.a(view2);
                    parent = w22.u(view2);
                }
            }
            if (g20VarA == null) {
                g20VarA = gu3.b(view);
            }
            this.c = g20VarA;
        }
        if (this.d == null) {
            of1 of1VarM = b32.m(view);
            if (of1VarM == null) {
                c.q("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = of1VarM;
        }
        if (this.e == null) {
            wq2 wq2VarO = d32.o(view);
            if (wq2VarO == null) {
                c.q("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = wq2VarO;
        }
        if (this.f == null) {
            this.f = n32.n(view);
        }
    }
}
