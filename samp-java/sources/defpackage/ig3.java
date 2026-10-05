package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ig3 implements j72 {
    public final View a;
    public final pi b;
    public final u6 c;
    public boolean d;
    public ns0 e;
    public ns0 f;
    public bg3 g;
    public b11 h;
    public final ArrayList i;
    public final lc1 j;
    public Rect k;
    public final m60 l;
    public final qs1 m;
    public v n;

    public ig3(View view, h7 h7Var, u6 u6Var) {
        pi piVar = new pi(view);
        this.a = view;
        this.b = piVar;
        this.c = u6Var;
        this.e = new n20(24);
        this.f = new n20(25);
        this.g = new bg3("", yg3.b, 4);
        this.h = b11.g;
        this.i = new ArrayList();
        this.j = ur.J(pe1.f, new it1(29, this));
        this.l = new m60(h7Var, piVar);
        this.m = new qs1(new hg3[16]);
    }

    @Override // defpackage.j72
    public final void a(bg3 bg3Var, b11 b11Var, v1 v1Var, w40 w40Var) {
        this.d = true;
        this.g = bg3Var;
        this.h = b11Var;
        this.e = v1Var;
        this.f = w40Var;
        i(hg3.f);
    }

    @Override // defpackage.j72
    public final void b() {
        i(hg3.f);
    }

    @Override // defpackage.j72
    public final void c(bg3 bg3Var, bg3 bg3Var2) {
        boolean z = (yg3.b(this.g.b, bg3Var2.b) && s51.n(this.g.c, bg3Var2.c)) ? false : true;
        this.g = bg3Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            gk2 gk2Var = (gk2) ((WeakReference) this.i.get(i)).get();
            if (gk2Var != null) {
                gk2Var.d = bg3Var2;
            }
        }
        m60 m60Var = this.l;
        synchronized (m60Var.c) {
            m60Var.j = null;
            m60Var.l = null;
            m60Var.k = null;
            m60Var.m = ua.h;
            m60Var.n = null;
            m60Var.o = null;
        }
        if (s51.n(bg3Var, bg3Var2)) {
            if (z) {
                pi piVar = this.b;
                int iF = yg3.f(bg3Var2.b);
                int iE = yg3.e(bg3Var2.b);
                yg3 yg3Var = this.g.c;
                int iF2 = yg3Var != null ? yg3.f(yg3Var.a) : -1;
                yg3 yg3Var2 = this.g.c;
                ((InputMethodManager) ((lc1) piVar.h).getValue()).updateSelection((View) piVar.g, iF, iE, iF2, yg3Var2 != null ? yg3.e(yg3Var2.a) : -1);
                return;
            }
            return;
        }
        if (bg3Var != null && (!s51.n(bg3Var.a.g, bg3Var2.a.g) || (yg3.b(bg3Var.b, bg3Var2.b) && !s51.n(bg3Var.c, bg3Var2.c)))) {
            pi piVar2 = this.b;
            ((InputMethodManager) ((lc1) piVar2.h).getValue()).restartInput((View) piVar2.g);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            gk2 gk2Var2 = (gk2) ((WeakReference) this.i.get(i2)).get();
            if (gk2Var2 != null) {
                bg3 bg3Var3 = this.g;
                pi piVar3 = this.b;
                if (gk2Var2.h) {
                    gk2Var2.d = bg3Var3;
                    if (gk2Var2.f) {
                        ((InputMethodManager) ((lc1) piVar3.h).getValue()).updateExtractedText((View) piVar3.g, gk2Var2.e, gq.R(bg3Var3));
                    }
                    yg3 yg3Var3 = bg3Var3.c;
                    long j = bg3Var3.b;
                    int iF3 = yg3Var3 != null ? yg3.f(yg3Var3.a) : -1;
                    yg3 yg3Var4 = bg3Var3.c;
                    ((InputMethodManager) ((lc1) piVar3.h).getValue()).updateSelection((View) piVar3.g, yg3.f(j), yg3.e(j), iF3, yg3Var4 != null ? yg3.e(yg3Var4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.j72
    public final void d() {
        i(hg3.h);
    }

    @Override // defpackage.j72
    public final void e(bg3 bg3Var, iy1 iy1Var, pg3 pg3Var, va vaVar, jk2 jk2Var, jk2 jk2Var2) {
        m60 m60Var = this.l;
        synchronized (m60Var.c) {
            try {
                m60Var.j = bg3Var;
                m60Var.l = iy1Var;
                m60Var.k = pg3Var;
                m60Var.m = vaVar;
                m60Var.n = jk2Var;
                m60Var.o = jk2Var2;
                if (m60Var.e || m60Var.d) {
                    m60Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.j72
    public final void f() {
        i(hg3.i);
    }

    @Override // defpackage.j72
    public final void g() {
        this.d = false;
        this.e = new n20(24);
        this.f = new n20(25);
        this.k = null;
        i(hg3.g);
    }

    @Override // defpackage.j72
    public final void h(jk2 jk2Var) {
        Rect rect;
        this.k = new Rect(vm1.M(jk2Var.a), vm1.M(jk2Var.b), vm1.M(jk2Var.c), vm1.M(jk2Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void i(hg3 hg3Var) {
        this.m.b(hg3Var);
        if (this.n == null) {
            v vVar = new v(14, this);
            this.c.execute(vVar);
            this.n = vVar;
        }
    }
}
