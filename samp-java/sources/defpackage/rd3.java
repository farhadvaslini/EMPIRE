package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rd3 extends aq1 implements kb1, of0, tu2 {
    public int A;
    public List B;
    public ns0 C;
    public ns0 D;
    public Map E;
    public dr1 F;
    public pd3 G;
    public qd3 H;
    public af t;
    public gh3 u;
    public zp0 v;
    public ns0 w;
    public int x;
    public boolean y;
    public int z;

    @Override // defpackage.kb1
    public final int I(al1 al1Var, xm1 xm1Var, int i) {
        return q1(al1Var).a(i, al1Var.getLayoutDirection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ns0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pd3] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        pd3 pd3Var = this.G;
        ?? r0 = pd3Var;
        if (pd3Var == null) {
            final int i = 0;
            ?? r02 = new ns0(this) { // from class: pd3
                public final /* synthetic */ rd3 g;

                {
                    this.g = this;
                }

                @Override // defpackage.ns0
                public final Object h(Object obj) {
                    pg3 pg3Var;
                    boolean z;
                    int i2 = i;
                    rd3 rd3Var = this.g;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            pg3 pg3Var2 = rd3Var.p1().n;
                            if (pg3Var2 != null) {
                                og3 og3Var = pg3Var2.a;
                                pg3Var = new pg3(new og3(og3Var.a, gh3.e(rd3Var.u, wx.g, 0L, null, null, 0L, 0, 0L, 16777214), og3Var.c, og3Var.d, og3Var.e, og3Var.f, og3Var.g, og3Var.h, og3Var.i, og3Var.j), pg3Var2.b, pg3Var2.c);
                                list.add(pg3Var);
                            } else {
                                pg3Var = null;
                            }
                            return Boolean.valueOf(pg3Var != null);
                        case 1:
                            af afVar = (af) obj;
                            qd3 qd3Var = rd3Var.H;
                            ni0 ni0Var = ni0.f;
                            if (qd3Var == null) {
                                qd3 qd3Var2 = new qd3(rd3Var.t, afVar);
                                dr1 dr1Var = new dr1(afVar, rd3Var.u, rd3Var.v, rd3Var.x, rd3Var.y, rd3Var.z, rd3Var.A, ni0Var);
                                dr1Var.d(rd3Var.p1().j);
                                qd3Var2.d = dr1Var;
                                rd3Var.H = qd3Var2;
                            } else if (!s51.n(afVar, qd3Var.b)) {
                                qd3Var.b = afVar;
                                dr1 dr1Var2 = qd3Var.d;
                                if (dr1Var2 != null) {
                                    dr1Var2.g(afVar, rd3Var.u, rd3Var.v, rd3Var.x, rd3Var.y, rd3Var.z, rd3Var.A, ni0Var);
                                }
                            }
                            y02.w(rd3Var);
                            lq.J(rd3Var);
                            vr.J(rd3Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            qd3 qd3Var3 = rd3Var.H;
                            if (qd3Var3 == null) {
                                z = false;
                            } else {
                                ns0 ns0Var = rd3Var.D;
                                if (ns0Var != null) {
                                    ns0Var.h(qd3Var3);
                                }
                                qd3 qd3Var4 = rd3Var.H;
                                if (qd3Var4 != null) {
                                    qd3Var4.c = zBooleanValue;
                                }
                                y02.w(rd3Var);
                                lq.J(rd3Var);
                                vr.J(rd3Var);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.G = r02;
            r0 = r02;
        }
        af afVar = this.t;
        a71[] a71VarArr = bv2.a;
        dv2Var.a(zu2.C, vr.K(afVar));
        qd3 qd3Var = this.H;
        if (qd3Var != null) {
            af afVar2 = qd3Var.b;
            cv2 cv2Var = zu2.D;
            a71[] a71VarArr2 = bv2.a;
            a71 a71Var = a71VarArr2[16];
            cv2Var.getClass();
            dv2Var.a(cv2Var, afVar2);
            boolean z = qd3Var.c;
            cv2 cv2Var2 = zu2.E;
            a71 a71Var2 = a71VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            cv2Var2.getClass();
            dv2Var.a(cv2Var2, boolValueOf);
        }
        final int i2 = 1;
        dv2Var.a(pu2.l, new y0(null, new ns0(this) { // from class: pd3
            public final /* synthetic */ rd3 g;

            {
                this.g = this;
            }

            @Override // defpackage.ns0
            public final Object h(Object obj) {
                pg3 pg3Var;
                boolean z2;
                int i22 = i2;
                rd3 rd3Var = this.g;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        pg3 pg3Var2 = rd3Var.p1().n;
                        if (pg3Var2 != null) {
                            og3 og3Var = pg3Var2.a;
                            pg3Var = new pg3(new og3(og3Var.a, gh3.e(rd3Var.u, wx.g, 0L, null, null, 0L, 0, 0L, 16777214), og3Var.c, og3Var.d, og3Var.e, og3Var.f, og3Var.g, og3Var.h, og3Var.i, og3Var.j), pg3Var2.b, pg3Var2.c);
                            list.add(pg3Var);
                        } else {
                            pg3Var = null;
                        }
                        return Boolean.valueOf(pg3Var != null);
                    case 1:
                        af afVar3 = (af) obj;
                        qd3 qd3Var2 = rd3Var.H;
                        ni0 ni0Var = ni0.f;
                        if (qd3Var2 == null) {
                            qd3 qd3Var22 = new qd3(rd3Var.t, afVar3);
                            dr1 dr1Var = new dr1(afVar3, rd3Var.u, rd3Var.v, rd3Var.x, rd3Var.y, rd3Var.z, rd3Var.A, ni0Var);
                            dr1Var.d(rd3Var.p1().j);
                            qd3Var22.d = dr1Var;
                            rd3Var.H = qd3Var22;
                        } else if (!s51.n(afVar3, qd3Var2.b)) {
                            qd3Var2.b = afVar3;
                            dr1 dr1Var2 = qd3Var2.d;
                            if (dr1Var2 != null) {
                                dr1Var2.g(afVar3, rd3Var.u, rd3Var.v, rd3Var.x, rd3Var.y, rd3Var.z, rd3Var.A, ni0Var);
                            }
                        }
                        y02.w(rd3Var);
                        lq.J(rd3Var);
                        vr.J(rd3Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        qd3 qd3Var3 = rd3Var.H;
                        if (qd3Var3 == null) {
                            z2 = false;
                        } else {
                            ns0 ns0Var = rd3Var.D;
                            if (ns0Var != null) {
                                ns0Var.h(qd3Var3);
                            }
                            qd3 qd3Var4 = rd3Var.H;
                            if (qd3Var4 != null) {
                                qd3Var4.c = zBooleanValue;
                            }
                            y02.w(rd3Var);
                            lq.J(rd3Var);
                            vr.J(rd3Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        dv2Var.a(pu2.m, new y0(null, new ns0(this) { // from class: pd3
            public final /* synthetic */ rd3 g;

            {
                this.g = this;
            }

            @Override // defpackage.ns0
            public final Object h(Object obj) {
                pg3 pg3Var;
                boolean z2;
                int i22 = i3;
                rd3 rd3Var = this.g;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        pg3 pg3Var2 = rd3Var.p1().n;
                        if (pg3Var2 != null) {
                            og3 og3Var = pg3Var2.a;
                            pg3Var = new pg3(new og3(og3Var.a, gh3.e(rd3Var.u, wx.g, 0L, null, null, 0L, 0, 0L, 16777214), og3Var.c, og3Var.d, og3Var.e, og3Var.f, og3Var.g, og3Var.h, og3Var.i, og3Var.j), pg3Var2.b, pg3Var2.c);
                            list.add(pg3Var);
                        } else {
                            pg3Var = null;
                        }
                        return Boolean.valueOf(pg3Var != null);
                    case 1:
                        af afVar3 = (af) obj;
                        qd3 qd3Var2 = rd3Var.H;
                        ni0 ni0Var = ni0.f;
                        if (qd3Var2 == null) {
                            qd3 qd3Var22 = new qd3(rd3Var.t, afVar3);
                            dr1 dr1Var = new dr1(afVar3, rd3Var.u, rd3Var.v, rd3Var.x, rd3Var.y, rd3Var.z, rd3Var.A, ni0Var);
                            dr1Var.d(rd3Var.p1().j);
                            qd3Var22.d = dr1Var;
                            rd3Var.H = qd3Var22;
                        } else if (!s51.n(afVar3, qd3Var2.b)) {
                            qd3Var2.b = afVar3;
                            dr1 dr1Var2 = qd3Var2.d;
                            if (dr1Var2 != null) {
                                dr1Var2.g(afVar3, rd3Var.u, rd3Var.v, rd3Var.x, rd3Var.y, rd3Var.z, rd3Var.A, ni0Var);
                            }
                        }
                        y02.w(rd3Var);
                        lq.J(rd3Var);
                        vr.J(rd3Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        qd3 qd3Var3 = rd3Var.H;
                        if (qd3Var3 == null) {
                            z2 = false;
                        } else {
                            ns0 ns0Var = rd3Var.D;
                            if (ns0Var != null) {
                                ns0Var.h(qd3Var3);
                            }
                            qd3 qd3Var4 = rd3Var.H;
                            if (qd3Var4 != null) {
                                qd3Var4.c = zBooleanValue;
                            }
                            y02.w(rd3Var);
                            lq.J(rd3Var);
                            vr.J(rd3Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        dv2Var.a(pu2.n, new y0(null, new it1(26, this)));
        bv2.a(dv2Var, r0);
    }

    @Override // defpackage.kb1
    public final int Y(al1 al1Var, xm1 xm1Var, int i) {
        return q1(al1Var).a(i, al1Var.getLayoutDirection());
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        List list;
        if (!this.s) {
            return;
        }
        pr prVarK = vb1Var.f.g.k();
        dr1 dr1VarQ1 = q1(vb1Var);
        pg3 pg3Var = dr1VarQ1.n;
        if (pg3Var == null) {
            throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + dr1VarQ1);
        }
        br1 br1Var = pg3Var.b;
        boolean z = pg3Var.d() && this.x != 3;
        if (z) {
            long j = pg3Var.c;
            jk2 jk2VarB = b32.b(0L, (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L));
            prVarK.l();
            pr.k(prVarK, jk2VarB);
        }
        try {
            h83 h83Var = this.u.a;
            ne3 ne3Var = h83Var.m;
            if (ne3Var == null) {
                ne3Var = ne3.b;
            }
            ne3 ne3Var2 = ne3Var;
            r13 r13Var = h83Var.n;
            if (r13Var == null) {
                r13Var = r13.d;
            }
            r13 r13Var2 = r13Var;
            rf0 rf0Var = h83Var.p;
            if (rf0Var == null) {
                rf0Var = fm0.a;
            }
            rf0 rf0Var2 = rf0Var;
            dp dpVarB = h83Var.a.b();
            if (dpVarB != null) {
                br1.j(br1Var, prVarK, dpVarB, this.u.a.a.t(), r13Var2, ne3Var2, rf0Var2);
            } else {
                long jB = wx.g;
                if (jB == 16) {
                    jB = this.u.b() != 16 ? this.u.b() : wx.b;
                }
                br1.i(br1Var, prVarK, jB, r13Var2, ne3Var2, rf0Var2);
            }
            if (z) {
                prVarK.i();
            }
            qd3 qd3Var = this.H;
            if (((qd3Var == null || !qd3Var.c) ? g12.Q(this.t) : false) || !((list = this.B) == null || list.isEmpty())) {
                vb1Var.c();
            }
        } finally {
        }
    }

    public final dr1 p1() {
        if (this.F == null) {
            this.F = new dr1(this.t, this.u, this.v, this.x, this.y, this.z, this.A, this.B);
        }
        dr1 dr1Var = this.F;
        dr1Var.getClass();
        return dr1Var;
    }

    public final dr1 q1(ua0 ua0Var) {
        dr1 dr1Var;
        qd3 qd3Var = this.H;
        if (qd3Var != null && qd3Var.c && (dr1Var = qd3Var.d) != null) {
            dr1Var.d(ua0Var);
            return dr1Var;
        }
        dr1 dr1VarP1 = p1();
        dr1VarP1.d(ua0Var);
        return dr1VarP1;
    }

    @Override // defpackage.kb1
    public final int r0(al1 al1Var, xm1 xm1Var, int i) {
        return w22.j(q1(al1Var).e(al1Var.getLayoutDirection()).a());
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            dr1 dr1VarQ1 = q1(en1Var);
            boolean zC = dr1VarQ1.c(j, en1Var.getLayoutDirection());
            pg3 pg3Var = dr1VarQ1.n;
            if (pg3Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + dr1VarQ1);
            }
            long j2 = pg3Var.c;
            pg3Var.b.a.b();
            if (zC) {
                vr.U(this, 2).E1();
                ns0 ns0Var = this.w;
                if (ns0Var != null) {
                    ns0Var.h(pg3Var);
                }
                Map linkedHashMap = this.E;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(l5.a, Integer.valueOf(Math.round(pg3Var.d)));
                linkedHashMap.put(l5.b, Integer.valueOf(Math.round(pg3Var.e)));
                this.E = linkedHashMap;
            }
            ns0 ns0Var2 = this.C;
            if (ns0Var2 != null) {
                ns0Var2.h(pg3Var.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            i62 i62VarT = xm1Var.t(lq.y(i, i, i2, i2));
            Map map = this.E;
            map.getClass();
            return en1Var.I0(i, i2, map, new z6(i62VarT, 12));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.kb1
    public final int y(al1 al1Var, xm1 xm1Var, int i) {
        return w22.j(q1(al1Var).e(al1Var.getLayoutDirection()).c());
    }
}
