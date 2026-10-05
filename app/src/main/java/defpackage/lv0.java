package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lv0 extends g20 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final js1 e;
    public final d42 f;
    public final /* synthetic */ nv0 g;

    public lv0(nv0 nv0Var, long j, boolean z, boolean z2, yl1 yl1Var) {
        this.g = nv0Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        js1 js1Var = or2.a;
        this.e = new js1();
        this.f = new d42(n52.i, m22.k);
    }

    @Override // defpackage.g20
    public final void a(l20 l20Var, rs0 rs0Var) {
        this.g.b.a(l20Var, rs0Var);
    }

    @Override // defpackage.g20
    public final js1 b(l20 l20Var, u33 u33Var, rs0 rs0Var) {
        return this.g.b.b(l20Var, u33Var, rs0Var);
    }

    @Override // defpackage.g20
    public final void c() {
        nv0 nv0Var = this.g;
        nv0Var.A--;
    }

    @Override // defpackage.g20
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.g20
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.g20
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.g20
    public final long g() {
        return this.a;
    }

    @Override // defpackage.g20
    public final f20 h() {
        return this.g.h;
    }

    @Override // defpackage.g20
    public final n52 i() {
        return (n52) this.f.getValue();
    }

    @Override // defpackage.g20
    public final o50 j() {
        return this.g.b.j();
    }

    @Override // defpackage.g20
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.g20
    public final void l(l20 l20Var) {
        nv0 nv0Var = this.g;
        nv0Var.b.l(nv0Var.h);
        nv0Var.b.l(l20Var);
    }

    @Override // defpackage.g20
    public final xq1 m(yq1 yq1Var) {
        return this.g.b.m(yq1Var);
    }

    @Override // defpackage.g20
    public final js1 n(l20 l20Var, u33 u33Var, js1 js1Var) {
        return this.g.b.n(l20Var, u33Var, js1Var);
    }

    @Override // defpackage.g20
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.g20
    public final void p(nv0 nv0Var) {
        this.e.a(nv0Var);
    }

    @Override // defpackage.g20
    public final void q(xj2 xj2Var) {
        this.g.b.q(xj2Var);
    }

    @Override // defpackage.g20
    public final void r(l20 l20Var) {
        this.g.b.r(l20Var);
    }

    @Override // defpackage.g20
    public final mr s(ja jaVar) {
        return this.g.b.s(jaVar);
    }

    @Override // defpackage.g20
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.g20
    public final void u(nv0 nv0Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                nv0Var.getClass();
                set.remove(nv0Var.x());
            }
        }
        if (nv0Var != null) {
            this.e.l(nv0Var);
        }
    }

    @Override // defpackage.g20
    public final void v(l20 l20Var) {
        this.g.b.v(l20Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w() {
        js1 js1Var = this.e;
        if (js1Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = js1Var.b;
                long[] jArr = js1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    nv0 nv0Var = (nv0) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(nv0Var.x());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            js1Var.b();
        }
    }
}
