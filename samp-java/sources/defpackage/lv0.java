package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            r15 = this;
            js1 r0 = r15.e
            boolean r1 = r0.h()
            if (r1 == 0) goto L69
            java.util.HashSet r15 = r15.d
            if (r15 == 0) goto L66
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L66
            r4 = 0
            r5 = r4
        L17:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L61
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L31:
            if (r10 >= r8) goto L5f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L5b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            nv0 r11 = (defpackage.nv0) r11
            java.util.Iterator r12 = r15.iterator()
        L47:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L5b
            java.lang.Object r13 = r12.next()
            java.util.Set r13 = (java.util.Set) r13
            i20 r14 = r11.x()
            r13.remove(r14)
            goto L47
        L5b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L31
        L5f:
            if (r8 != r9) goto L66
        L61:
            if (r5 == r3) goto L66
            int r5 = r5 + 1
            goto L17
        L66:
            r0.b()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv0.w():void");
    }
}
