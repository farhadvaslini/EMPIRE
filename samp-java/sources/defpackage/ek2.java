package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ek2 extends g20 {
    public final ic a;
    public final pi b;
    public final Object c;
    public j61 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public js1 h;
    public final qs1 i;
    public final ArrayList j;
    public final ArrayList k;
    public final is1 l;
    public final a31 m;
    public final is1 n;
    public final is1 o;
    public ArrayList p;
    public js1 q;
    public jr r;
    public final i93 s;
    public boolean t;
    public final i93 u;
    public final pi v;
    public final l61 w;
    public final o50 x;
    public final ak2 y;
    public static final i93 z = s51.e(x52.i);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public ek2(o50 o50Var) {
        ic icVar = new ic(new yj2(this, 0));
        this.a = icVar;
        this.b = new pi(new yj2(this, 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new js1();
        this.i = new qs1(new l20[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new is1();
        this.m = new a31(20);
        this.n = new is1();
        this.o = new is1();
        this.s = s51.e(null);
        this.u = s51.e(bk2.h);
        this.v = new pi(18);
        l61 l61Var = new l61((j61) o50Var.m(f5.b0));
        l61Var.r(new xc1(21, this));
        this.w = l61Var;
        this.x = o50Var.k(icVar).k(l61Var);
        this.y = new ak2(0);
    }

    public static final void G(ArrayList arrayList, ek2 ek2Var, l20 l20Var) {
        arrayList.clear();
        synchronized (ek2Var.c) {
            Iterator it = ek2Var.k.iterator();
            if (it.hasNext()) {
                ((yq1) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(ns1 ns1Var) {
        try {
            if (ns1Var.w() instanceof v63) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            ns1Var.c();
        }
    }

    public final boolean A() {
        return this.i.h != 0 || z() || B() || this.l.j();
    }

    public final boolean B() {
        return !this.t && (((bk) ((qk) this.b.h).c).get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            js1 r1 = r2.h     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            qs1 r1 = r2.i     // Catch: java.lang.Throwable -> L21
            int r1 = r1.h     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L12
            goto L23
        L12:
            boolean r1 = r2.z()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            boolean r2 = r2.B()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            goto L23
        L1f:
            r2 = 0
            goto L24
        L21:
            r2 = move-exception
            goto L26
        L23:
            r2 = 1
        L24:
            monitor-exit(r0)
            return r2
        L26:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek2.C():boolean");
    }

    public final List D() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? ni0.f : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        hr hrVarY;
        synchronized (this.c) {
            hrVarY = y();
            if (((bk2) this.u.getValue()).compareTo(bk2.g) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (hrVarY != null) {
            ((jr) hrVarY).t(dm3.a);
        }
    }

    public final void F(l20 l20Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((yq1) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013f, code lost:
    
        if (r4 >= r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
    
        if (((defpackage.r32) r11.get(r4)).g == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014e, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015c, code lost:
    
        if (r9 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015e, code lost:
    
        r12 = (defpackage.r32) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0166, code lost:
    
        if (r12.g != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0168, code lost:
    
        r12 = (defpackage.yq1) r12.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
    
        r4 = r18.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0175, code lost:
    
        defpackage.vx.f0(r18.k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017b, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0189, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018b, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0194, code lost:
    
        if (((defpackage.r32) r12).g == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
    
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List H(java.util.List r19, defpackage.js1 r20) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek2.H(java.util.List, js1):java.util.List");
    }

    public final l20 I(l20 l20Var, js1 js1Var) {
        ns1 ns1VarC;
        if (l20Var.A.F || l20Var.B == 3) {
            return null;
        }
        js1 js1Var2 = this.q;
        if (js1Var2 == null || !js1Var2.c(l20Var)) {
            xc1 xc1Var = new xc1(20, l20Var);
            er1 er1Var = new er1(11, l20Var, js1Var);
            t63 t63VarJ = a73.j();
            ns1 ns1Var = t63VarJ instanceof ns1 ? (ns1) t63VarJ : null;
            if (ns1Var == null || (ns1VarC = ns1Var.C(xc1Var, er1Var)) == null) {
                c.q("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    t63 t63VarJ2 = ns1VarC.j();
                    if (js1Var != null) {
                        try {
                            if (js1Var.h()) {
                                me1 me1Var = new me1(10, js1Var, l20Var);
                                nv0 nv0Var = l20Var.A;
                                if (nv0Var.F) {
                                    e20.a("Preparing a composition while composing is not supported");
                                }
                                nv0Var.F = true;
                                try {
                                    me1Var.a();
                                    nv0Var.F = false;
                                } catch (Throwable th) {
                                    nv0Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            t63.q(t63VarJ2);
                            throw th2;
                        }
                    }
                    boolean zW = l20Var.w();
                    t63.q(t63VarJ2);
                    if (zW) {
                        return l20Var;
                    }
                } finally {
                    w(ns1VarC);
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, l20 l20Var) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof o10)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                zj2 zj2Var = (zj2) this.s.getValue();
                if (zj2Var != null) {
                    throw zj2Var.a;
                }
                i93 i93Var = this.s;
                zj2 zj2Var2 = new zj2(th);
                i93Var.getClass();
                i93Var.j(null, zj2Var2);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new js1();
                this.k.clear();
                this.l.a();
                this.n.a();
                i93 i93Var2 = this.s;
                zj2 zj2Var3 = new zj2(th);
                i93Var2.getClass();
                i93Var2.j(null, zj2Var3);
                if (l20Var != null) {
                    L(l20Var);
                }
                if (y() != null) {
                    e20.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List listD = D();
            pr2 pr2Var = new pr2(this.h);
            this.h = new js1();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((l20) listD.get(i)).x(pr2Var);
                    if (((bk2) this.u.getValue()).compareTo(bk2.g) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.c) {
                    js1 js1Var = this.h;
                    js1Var.getClass();
                    Iterator<E> it = pr2Var.iterator();
                    while (it.hasNext()) {
                        js1Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(l20 l20Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(l20Var)) {
            arrayList.add(l20Var);
        }
        if (this.f.remove(l20Var)) {
            this.g = null;
        }
    }

    @Override // defpackage.g20
    public final void a(l20 l20Var, rs0 rs0Var) throws Throwable {
        bk2 bk2Var;
        boolean zContains;
        ns1 ns1VarC;
        boolean z2 = l20Var.A.F;
        synchronized (this.c) {
            bk2 bk2Var2 = (bk2) this.u.getValue();
            bk2Var = bk2.g;
            zContains = bk2Var2.compareTo(bk2Var) > 0 ? true ^ D().contains(l20Var) : true;
        }
        try {
            xc1 xc1Var = new xc1(20, l20Var);
            er1 er1Var = new er1(11, l20Var, null);
            t63 t63VarJ = a73.j();
            ns1 ns1Var = t63VarJ instanceof ns1 ? (ns1) t63VarJ : null;
            if (ns1Var == null || (ns1VarC = ns1Var.C(xc1Var, er1Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                t63 t63VarJ2 = ns1VarC.j();
                try {
                    l20Var.j(rs0Var);
                    synchronized (this.c) {
                        if (((bk2) this.u.getValue()).compareTo(bk2Var) > 0 && !D().contains(l20Var)) {
                            this.f.add(l20Var);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        a73.j().m();
                    }
                    try {
                        F(l20Var);
                        try {
                            l20Var.d();
                            l20Var.f();
                            if (z2) {
                                return;
                            }
                            a73.j().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, l20Var);
                    }
                } finally {
                    t63.q(t63VarJ2);
                }
            } finally {
                w(ns1VarC);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            J(th3, l20Var);
        }
    }

    @Override // defpackage.g20
    public final js1 b(l20 l20Var, u33 u33Var, rs0 rs0Var) {
        pi piVar = this.v;
        try {
            u33 u33Var2 = l20Var.u;
            l20Var.u = u33Var;
            try {
                a(l20Var, rs0Var);
                js1 js1Var = (js1) piVar.j();
                if (js1Var == null) {
                    js1Var = or2.a;
                    js1Var.getClass();
                }
                return js1Var;
            } finally {
                l20Var.u = u33Var2;
            }
        } finally {
            piVar.K(null);
        }
    }

    @Override // defpackage.g20
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // defpackage.g20
    public final boolean e() {
        return false;
    }

    @Override // defpackage.g20
    public final boolean f() {
        return false;
    }

    @Override // defpackage.g20
    public final long g() {
        return 1000L;
    }

    @Override // defpackage.g20
    public final f20 h() {
        return null;
    }

    @Override // defpackage.g20
    public final o50 j() {
        return this.x;
    }

    @Override // defpackage.g20
    public final boolean k() {
        return false;
    }

    @Override // defpackage.g20
    public final void l(l20 l20Var) {
        hr hrVarY;
        synchronized (this.c) {
            if (this.i.h(l20Var)) {
                hrVarY = null;
            } else {
                this.i.b(l20Var);
                hrVarY = y();
            }
        }
        if (hrVarY != null) {
            ((jr) hrVarY).t(dm3.a);
        }
    }

    @Override // defpackage.g20
    public final xq1 m(yq1 yq1Var) {
        xq1 xq1Var;
        synchronized (this.c) {
            xq1Var = (xq1) this.n.k(yq1Var);
        }
        return xq1Var;
    }

    @Override // defpackage.g20
    public final js1 n(l20 l20Var, u33 u33Var, js1 js1Var) {
        pi piVar = this.v;
        try {
            K();
            l20Var.x(new pr2(js1Var));
            u33 u33Var2 = l20Var.u;
            l20Var.u = u33Var;
            try {
                l20 l20VarI = I(l20Var, null);
                if (l20VarI != null) {
                    F(l20Var);
                    l20VarI.d();
                    l20VarI.f();
                }
                js1 js1Var2 = (js1) piVar.j();
                if (js1Var2 == null) {
                    js1Var2 = or2.a;
                    js1Var2.getClass();
                }
                return js1Var2;
            } finally {
                l20Var.u = u33Var2;
            }
        } finally {
            piVar.K(null);
        }
    }

    @Override // defpackage.g20
    public final void q(xj2 xj2Var) {
        pi piVar = this.v;
        js1 js1Var = (js1) piVar.j();
        if (js1Var == null) {
            js1 js1Var2 = or2.a;
            js1Var = new js1();
            piVar.K(js1Var);
        }
        js1Var.a(xj2Var);
    }

    @Override // defpackage.g20
    public final void r(l20 l20Var) {
        synchronized (this.c) {
            try {
                js1 js1Var = this.q;
                if (js1Var == null) {
                    js1 js1Var2 = or2.a;
                    js1Var = new js1();
                    this.q = js1Var;
                }
                js1Var.a(l20Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.g20
    public final mr s(ja jaVar) {
        pi piVar = this.b;
        qk qkVar = (qk) piVar.h;
        uw1 uw1Var = new uw1();
        uw1Var.a = jaVar;
        return qkVar.d(uw1Var, (me1) piVar.i);
    }

    @Override // defpackage.g20
    public final void v(l20 l20Var) {
        synchronized (this.c) {
            if (this.f.remove(l20Var)) {
                this.g = null;
            }
            this.i.j(l20Var);
            this.j.remove(l20Var);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((bk2) this.u.getValue()).compareTo(bk2.j) >= 0) {
                i93 i93Var = this.u;
                bk2 bk2Var = bk2.g;
                i93Var.getClass();
                i93Var.j(null, bk2Var);
            }
        }
        this.w.c(null);
    }

    public final hr y() {
        i93 i93Var = this.u;
        int iCompareTo = ((bk2) i93Var.getValue()).compareTo(bk2.g);
        i93 i93Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        qs1 qs1Var = this.i;
        if (iCompareTo > 0) {
            Object value = i93Var2.getValue();
            bk2 bk2Var = bk2.k;
            bk2 bk2Var2 = bk2.h;
            if (value == null) {
                if (this.d == null) {
                    this.h = new js1();
                    qs1Var.g();
                    if (z() || B()) {
                        bk2Var2 = bk2.i;
                    }
                } else {
                    bk2Var2 = (qs1Var.h != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.l.j()) ? bk2Var : bk2.j;
                }
            }
            i93Var.j(null, bk2Var2);
            if (bk2Var2 != bk2Var) {
                return null;
            }
            jr jrVar = this.r;
            this.r = null;
            return jrVar;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = ni0.f;
        this.h = new js1();
        qs1Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        jr jrVar2 = this.r;
        if (jrVar2 != null) {
            jrVar2.C(null);
        }
        this.r = null;
        i93Var2.i(null);
        return null;
    }

    public final boolean z() {
        return !this.t && (((bk) ((qk) this.a.h).c).get() & 134217727) > 0;
    }

    @Override // defpackage.g20
    public final void o(Set set) {
    }
}
