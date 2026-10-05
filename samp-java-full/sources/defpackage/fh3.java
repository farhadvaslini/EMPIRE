package defpackage;

import android.os.Trace;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fh3 extends aq1 implements kb1, of0, tu2 {
    public HashMap A;
    public w32 B;
    public dh3 C;
    public eh3 D;
    public String t;
    public gh3 u;
    public zp0 v;
    public int w;
    public boolean x;
    public int y;
    public int z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.kb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int I(al1 al1Var, xm1 xm1Var, int i) {
        w32 w32VarP1;
        eh3 eh3Var = this.D;
        if (eh3Var == null) {
            w32VarP1 = p1();
        } else {
            if (!eh3Var.c) {
                eh3Var = null;
            }
            if (eh3Var == null || (w32VarP1 = eh3Var.d) == null) {
            }
        }
        w32VarP1.d(al1Var);
        return w32VarP1.a(i, al1Var.getLayoutDirection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ns0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [dh3] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        dh3 dh3Var = this.C;
        ?? r0 = dh3Var;
        if (dh3Var == null) {
            final int i = 0;
            ?? r02 = new ns0(this) { // from class: dh3
                public final /* synthetic */ fh3 g;

                {
                    this.g = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
                @Override // defpackage.ns0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object h(Object obj) {
                    ua0 ua0Var;
                    pg3 pg3Var;
                    int i2 = i;
                    fh3 fh3Var = this.g;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            w32 w32VarP1 = fh3Var.p1();
                            gh3 gh3VarE = gh3.e(fh3Var.u, wx.g, 0L, null, null, 0L, 0, 0L, 16777214);
                            bb1 bb1Var = w32VarP1.o;
                            pg3 pg3Var2 = null;
                            if (bb1Var != null && (ua0Var = w32VarP1.i) != null) {
                                af afVar = new af(w32VarP1.a);
                                if (w32VarP1.j == null || w32VarP1.n == null) {
                                    pg3Var = null;
                                } else {
                                    long j = w32VarP1.p & (-8589934589L);
                                    int i3 = w32VarP1.f;
                                    boolean z = w32VarP1.e;
                                    int i4 = w32VarP1.d;
                                    zp0 zp0Var = w32VarP1.c;
                                    ni0 ni0Var = ni0.f;
                                    pg3Var = new pg3(new og3(afVar, gh3VarE, ni0Var, i3, z, i4, ua0Var, bb1Var, zp0Var, j), new br1(new qk(afVar, ua0Var, zp0Var, gh3VarE, ni0Var, z), j, w32VarP1.f, w32VarP1.d), w32VarP1.l);
                                }
                            }
                            if (pg3Var != null) {
                                list.add(pg3Var);
                                pg3Var2 = pg3Var;
                            }
                            return Boolean.valueOf(pg3Var2 != null);
                        case 1:
                            String str = ((af) obj).g;
                            eh3 eh3Var = fh3Var.D;
                            if (eh3Var == null) {
                                eh3 eh3Var2 = new eh3(fh3Var.t, str);
                                w32 w32Var = new w32(str, fh3Var.u, fh3Var.v, fh3Var.w, fh3Var.x, fh3Var.y, fh3Var.z);
                                w32Var.d(fh3Var.p1().i);
                                eh3Var2.d = w32Var;
                                fh3Var.D = eh3Var2;
                            } else if (!s51.n(str, eh3Var.b)) {
                                eh3Var.b = str;
                                w32 w32Var2 = eh3Var.d;
                                if (w32Var2 != null) {
                                    gh3 gh3Var = fh3Var.u;
                                    zp0 zp0Var2 = fh3Var.v;
                                    int i5 = fh3Var.w;
                                    boolean z2 = fh3Var.x;
                                    int i6 = fh3Var.y;
                                    int i7 = fh3Var.z;
                                    w32Var2.a = str;
                                    w32Var2.b = gh3Var;
                                    w32Var2.c = zp0Var2;
                                    w32Var2.d = i5;
                                    w32Var2.e = z2;
                                    w32Var2.f = i6;
                                    w32Var2.g = i7;
                                    w32Var2.s = (w32Var2.s << 2) | 2;
                                    w32Var2.c();
                                }
                            }
                            y02.w(fh3Var);
                            lq.J(fh3Var);
                            vr.J(fh3Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            eh3 eh3Var3 = fh3Var.D;
                            if (eh3Var3 == null) {
                                z = false;
                            } else {
                                eh3Var3.c = zBooleanValue;
                                y02.w(fh3Var);
                                lq.J(fh3Var);
                                vr.J(fh3Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.C = r02;
            r0 = r02;
        }
        af afVar = new af(this.t);
        a71[] a71VarArr = bv2.a;
        dv2Var.a(zu2.C, vr.K(afVar));
        eh3 eh3Var = this.D;
        if (eh3Var != null) {
            boolean z = eh3Var.c;
            cv2 cv2Var = zu2.E;
            a71[] a71VarArr2 = bv2.a;
            a71 a71Var = a71VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            cv2Var.getClass();
            dv2Var.a(cv2Var, boolValueOf);
            af afVar2 = new af(eh3Var.b);
            cv2 cv2Var2 = zu2.D;
            a71 a71Var2 = a71VarArr2[16];
            cv2Var2.getClass();
            dv2Var.a(cv2Var2, afVar2);
        }
        final int i2 = 1;
        dv2Var.a(pu2.l, new y0(null, new ns0(this) { // from class: dh3
            public final /* synthetic */ fh3 g;

            {
                this.g = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
            @Override // defpackage.ns0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object h(Object obj) {
                ua0 ua0Var;
                pg3 pg3Var;
                int i22 = i2;
                fh3 fh3Var = this.g;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        w32 w32VarP1 = fh3Var.p1();
                        gh3 gh3VarE = gh3.e(fh3Var.u, wx.g, 0L, null, null, 0L, 0, 0L, 16777214);
                        bb1 bb1Var = w32VarP1.o;
                        pg3 pg3Var2 = null;
                        if (bb1Var != null && (ua0Var = w32VarP1.i) != null) {
                            af afVar3 = new af(w32VarP1.a);
                            if (w32VarP1.j == null || w32VarP1.n == null) {
                                pg3Var = null;
                            } else {
                                long j = w32VarP1.p & (-8589934589L);
                                int i3 = w32VarP1.f;
                                boolean z2 = w32VarP1.e;
                                int i4 = w32VarP1.d;
                                zp0 zp0Var = w32VarP1.c;
                                ni0 ni0Var = ni0.f;
                                pg3Var = new pg3(new og3(afVar3, gh3VarE, ni0Var, i3, z2, i4, ua0Var, bb1Var, zp0Var, j), new br1(new qk(afVar3, ua0Var, zp0Var, gh3VarE, ni0Var, z2), j, w32VarP1.f, w32VarP1.d), w32VarP1.l);
                            }
                        }
                        if (pg3Var != null) {
                            list.add(pg3Var);
                            pg3Var2 = pg3Var;
                        }
                        return Boolean.valueOf(pg3Var2 != null);
                    case 1:
                        String str = ((af) obj).g;
                        eh3 eh3Var2 = fh3Var.D;
                        if (eh3Var2 == null) {
                            eh3 eh3Var22 = new eh3(fh3Var.t, str);
                            w32 w32Var = new w32(str, fh3Var.u, fh3Var.v, fh3Var.w, fh3Var.x, fh3Var.y, fh3Var.z);
                            w32Var.d(fh3Var.p1().i);
                            eh3Var22.d = w32Var;
                            fh3Var.D = eh3Var22;
                        } else if (!s51.n(str, eh3Var2.b)) {
                            eh3Var2.b = str;
                            w32 w32Var2 = eh3Var2.d;
                            if (w32Var2 != null) {
                                gh3 gh3Var = fh3Var.u;
                                zp0 zp0Var2 = fh3Var.v;
                                int i5 = fh3Var.w;
                                boolean z22 = fh3Var.x;
                                int i6 = fh3Var.y;
                                int i7 = fh3Var.z;
                                w32Var2.a = str;
                                w32Var2.b = gh3Var;
                                w32Var2.c = zp0Var2;
                                w32Var2.d = i5;
                                w32Var2.e = z22;
                                w32Var2.f = i6;
                                w32Var2.g = i7;
                                w32Var2.s = (w32Var2.s << 2) | 2;
                                w32Var2.c();
                            }
                        }
                        y02.w(fh3Var);
                        lq.J(fh3Var);
                        vr.J(fh3Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        eh3 eh3Var3 = fh3Var.D;
                        if (eh3Var3 == null) {
                            z = false;
                        } else {
                            eh3Var3.c = zBooleanValue;
                            y02.w(fh3Var);
                            lq.J(fh3Var);
                            vr.J(fh3Var);
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        final int i3 = 2;
        dv2Var.a(pu2.m, new y0(null, new ns0(this) { // from class: dh3
            public final /* synthetic */ fh3 g;

            {
                this.g = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
            @Override // defpackage.ns0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object h(Object obj) {
                ua0 ua0Var;
                pg3 pg3Var;
                int i22 = i3;
                fh3 fh3Var = this.g;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        w32 w32VarP1 = fh3Var.p1();
                        gh3 gh3VarE = gh3.e(fh3Var.u, wx.g, 0L, null, null, 0L, 0, 0L, 16777214);
                        bb1 bb1Var = w32VarP1.o;
                        pg3 pg3Var2 = null;
                        if (bb1Var != null && (ua0Var = w32VarP1.i) != null) {
                            af afVar3 = new af(w32VarP1.a);
                            if (w32VarP1.j == null || w32VarP1.n == null) {
                                pg3Var = null;
                            } else {
                                long j = w32VarP1.p & (-8589934589L);
                                int i32 = w32VarP1.f;
                                boolean z2 = w32VarP1.e;
                                int i4 = w32VarP1.d;
                                zp0 zp0Var = w32VarP1.c;
                                ni0 ni0Var = ni0.f;
                                pg3Var = new pg3(new og3(afVar3, gh3VarE, ni0Var, i32, z2, i4, ua0Var, bb1Var, zp0Var, j), new br1(new qk(afVar3, ua0Var, zp0Var, gh3VarE, ni0Var, z2), j, w32VarP1.f, w32VarP1.d), w32VarP1.l);
                            }
                        }
                        if (pg3Var != null) {
                            list.add(pg3Var);
                            pg3Var2 = pg3Var;
                        }
                        return Boolean.valueOf(pg3Var2 != null);
                    case 1:
                        String str = ((af) obj).g;
                        eh3 eh3Var2 = fh3Var.D;
                        if (eh3Var2 == null) {
                            eh3 eh3Var22 = new eh3(fh3Var.t, str);
                            w32 w32Var = new w32(str, fh3Var.u, fh3Var.v, fh3Var.w, fh3Var.x, fh3Var.y, fh3Var.z);
                            w32Var.d(fh3Var.p1().i);
                            eh3Var22.d = w32Var;
                            fh3Var.D = eh3Var22;
                        } else if (!s51.n(str, eh3Var2.b)) {
                            eh3Var2.b = str;
                            w32 w32Var2 = eh3Var2.d;
                            if (w32Var2 != null) {
                                gh3 gh3Var = fh3Var.u;
                                zp0 zp0Var2 = fh3Var.v;
                                int i5 = fh3Var.w;
                                boolean z22 = fh3Var.x;
                                int i6 = fh3Var.y;
                                int i7 = fh3Var.z;
                                w32Var2.a = str;
                                w32Var2.b = gh3Var;
                                w32Var2.c = zp0Var2;
                                w32Var2.d = i5;
                                w32Var2.e = z22;
                                w32Var2.f = i6;
                                w32Var2.g = i7;
                                w32Var2.s = (w32Var2.s << 2) | 2;
                                w32Var2.c();
                            }
                        }
                        y02.w(fh3Var);
                        lq.J(fh3Var);
                        vr.J(fh3Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        eh3 eh3Var3 = fh3Var.D;
                        if (eh3Var3 == null) {
                            z = false;
                        } else {
                            eh3Var3.c = zBooleanValue;
                            y02.w(fh3Var);
                            lq.J(fh3Var);
                            vr.J(fh3Var);
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        dv2Var.a(pu2.n, new y0(null, new sg3(1, this)));
        bv2.a(dv2Var, r0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.kb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int Y(al1 al1Var, xm1 xm1Var, int i) {
        w32 w32VarP1;
        eh3 eh3Var = this.D;
        if (eh3Var == null) {
            w32VarP1 = p1();
        } else {
            if (!eh3Var.c) {
                eh3Var = null;
            }
            if (eh3Var == null || (w32VarP1 = eh3Var.d) == null) {
            }
        }
        w32VarP1.d(al1Var);
        return w32VarP1.a(i, al1Var.getLayoutDirection());
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // defpackage.of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(vb1 vb1Var) {
        w32 w32VarP1;
        if (!this.s) {
            return;
        }
        eh3 eh3Var = this.D;
        if (eh3Var == null) {
            w32VarP1 = p1();
        } else {
            if (!eh3Var.c) {
                eh3Var = null;
            }
            if (eh3Var == null || (w32VarP1 = eh3Var.d) == null) {
            }
        }
        y9 y9Var = w32VarP1.j;
        if (y9Var == null) {
            p21.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.B + ", textSubstitution=" + this.D + ")");
            c.d();
            return;
        }
        pr prVarK = vb1Var.f.g.k();
        boolean z = w32VarP1.k;
        if (z) {
            long j = w32VarP1.l;
            prVarK.l();
            prVarK.f(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
        }
        try {
            gh3 gh3Var = this.u;
            h83 h83Var = gh3Var.a;
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
                y9Var.f(prVarK, dpVarB, gh3Var.a.a.t(), r13Var2, ne3Var2, rf0Var2);
            } else {
                long jB = wx.g;
                if (jB == 16) {
                    jB = gh3Var.b() != 16 ? gh3Var.b() : wx.b;
                }
                y9Var.e(prVarK, jB, r13Var2, ne3Var2, rf0Var2);
            }
            if (z) {
                prVarK.i();
            }
        } finally {
        }
    }

    public final w32 p1() {
        gh3 gh3Var = this.u;
        if (this.B == null) {
            this.B = new w32(this.t, gh3Var, this.v, this.w, this.x, this.y, this.z);
        }
        w32 w32Var = this.B;
        w32Var.getClass();
        return w32Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.kb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r0(al1 al1Var, xm1 xm1Var, int i) {
        w32 w32VarP1;
        eh3 eh3Var = this.D;
        if (eh3Var == null) {
            w32VarP1 = p1();
        } else {
            if (!eh3Var.c) {
                eh3Var = null;
            }
            if (eh3Var == null || (w32VarP1 = eh3Var.d) == null) {
            }
        }
        w32VarP1.d(al1Var);
        return w22.j(w32VarP1.e(al1Var.getLayoutDirection()).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:22:0x0073, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // defpackage.kb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        w32 w32VarP1;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            eh3 eh3Var = this.D;
            if (eh3Var == null) {
                w32VarP1 = p1();
            } else {
                if (!eh3Var.c) {
                    eh3Var = null;
                }
                if (eh3Var == null || (w32VarP1 = eh3Var.d) == null) {
                }
            }
            w32VarP1.d(en1Var);
            boolean zB = w32VarP1.b(j, en1Var.getLayoutDirection());
            v32 v32Var = w32VarP1.n;
            if (v32Var != null) {
                v32Var.b();
            }
            y9 y9Var = w32VarP1.j;
            y9Var.getClass();
            ng3 ng3Var = y9Var.d;
            long j2 = w32VarP1.l;
            if (zB) {
                vr.U(this, 2).E1();
                HashMap map = this.A;
                if (map == null) {
                    map = new HashMap(2);
                    this.A = map;
                }
                map.put(l5.a, Integer.valueOf(Math.round(ng3Var.d(0) + 0.0f)));
                map.put(l5.b, Integer.valueOf(Math.round(ng3Var.d(ng3Var.g - 1) + 0.0f)));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            i62 i62VarT = xm1Var.t(lq.y(i, i, i2, i2));
            HashMap map2 = this.A;
            map2.getClass();
            return en1Var.I0(i, i2, map2, new z6(i62VarT, 15));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.kb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int y(al1 al1Var, xm1 xm1Var, int i) {
        w32 w32VarP1;
        eh3 eh3Var = this.D;
        if (eh3Var == null) {
            w32VarP1 = p1();
        } else {
            if (!eh3Var.c) {
                eh3Var = null;
            }
            if (eh3Var == null || (w32VarP1 = eh3Var.d) == null) {
            }
        }
        w32VarP1.d(al1Var);
        return w22.j(w32VarP1.e(al1Var.getLayoutDirection()).c());
    }
}
