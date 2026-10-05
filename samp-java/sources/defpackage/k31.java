package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k31 extends kx implements Runnable, oy1, View.OnAttachStateChangeListener {
    public boolean h;
    public int i;
    public mt3 j;
    public final is1 k;
    public final a42 l;
    public final as1 m;
    public final l73 n;

    public k31() {
        super(1);
        is1 is1Var = new is1(9);
        st3.a.getClass();
        is1Var.m(rt3.b, new hu3("caption bar"));
        is1Var.m(rt3.c, new hu3("display cutout"));
        is1Var.m(rt3.d, new hu3("ime"));
        is1Var.m(rt3.e, new hu3("mandatory system gestures"));
        is1Var.m(rt3.f, new hu3("navigation bars"));
        is1Var.m(rt3.g, new hu3("status bars"));
        is1Var.m(rt3.h, new hu3("system gestures"));
        is1Var.m(rt3.i, new hu3("tappable element"));
        is1Var.m(rt3.j, new hu3("waterfall"));
        this.k = is1Var;
        this.l = new a42(0);
        this.m = new as1(4);
        this.n = new l73();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.mt3 r28) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k31.E(mt3):void");
    }

    @Override // defpackage.kx
    public final void d(ss3 ss3Var) {
        boolean z = false;
        this.h = false;
        int iD = ss3Var.a.d();
        this.i &= ~iD;
        this.j = null;
        st3 st3Var = (st3) ut3.a.b(iD);
        if (st3Var != null) {
            Object objG = this.k.g(st3Var);
            objG.getClass();
            hu3 hu3Var = (hu3) objG;
            hu3Var.c.h(0.0f);
            hu3Var.e.h(1.0f);
            hu3Var.d.h(0L);
            hu3Var.c.h(0.0f);
            hu3Var.b.setValue(Boolean.FALSE);
            hu3Var.j = -1L;
            hu3Var.k = -1L;
            a42 a42Var = this.l;
            a42Var.h(a42Var.g() + 1);
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
    }

    @Override // defpackage.kx
    public final void e(ss3 ss3Var) {
        this.h = true;
    }

    @Override // defpackage.kx
    public final mt3 f(mt3 mt3Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ss3 ss3Var = (ss3) list.get(i);
            st3 st3Var = (st3) ut3.a.b(ss3Var.a.d());
            if (st3Var != null) {
                Object objG = this.k.g(st3Var);
                objG.getClass();
                hu3 hu3Var = (hu3) objG;
                if (((Boolean) hu3Var.b.getValue()).booleanValue()) {
                    rs3 rs3Var = ss3Var.a;
                    hu3Var.c.h(rs3Var.c());
                    hu3Var.e.h(rs3Var.a());
                    hu3Var.d.h(rs3Var.b());
                }
            }
        }
        E(mt3Var);
        return mt3Var;
    }

    @Override // defpackage.oy1
    public final mt3 g(View view, mt3 mt3Var) {
        if (this.h) {
            this.j = mt3Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return mt3Var;
            }
        } else if (this.i == 0) {
            E(mt3Var);
        }
        return mt3Var;
    }

    @Override // defpackage.kx
    public final ar2 h(ss3 ss3Var, ar2 ar2Var) {
        mt3 mt3Var = this.j;
        boolean z = false;
        this.h = false;
        this.j = null;
        if (ss3Var.a.b() > 0 && mt3Var != null) {
            int iD = ss3Var.a.d();
            this.i |= iD;
            st3 st3Var = (st3) ut3.a.b(iD);
            if (st3Var != null) {
                Object objG = this.k.g(st3Var);
                objG.getClass();
                hu3 hu3Var = (hu3) objG;
                h31 h31VarI = mt3Var.a.i(iD);
                long j = (((long) h31VarI.a) << 48) | (((long) h31VarI.b) << 32) | (((long) h31VarI.c) << 16) | ((long) h31VarI.d);
                long j2 = hu3Var.h;
                if (!w22.r(j, j2)) {
                    hu3Var.j = j2;
                    hu3Var.k = j;
                    hu3Var.b.setValue(Boolean.TRUE);
                    rs3 rs3Var = ss3Var.a;
                    hu3Var.c.h(rs3Var.c());
                    hu3Var.e.h(rs3Var.a());
                    hu3Var.d.h(rs3Var.b());
                    a42 a42Var = this.l;
                    a42Var.h(a42Var.g() + 1);
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
                        return ar2Var;
                    }
                }
            }
        }
        return ar2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = mq3.a;
        fq3.c(view, this);
        mq3.k(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = mq3.a;
        fq3.c(view, null);
        mq3.k(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h) {
            this.i = 0;
            this.h = false;
            mt3 mt3Var = this.j;
            if (mt3Var != null) {
                E(mt3Var);
                this.j = null;
            }
        }
    }
}
