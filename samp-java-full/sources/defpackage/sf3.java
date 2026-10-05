package defpackage;

import android.content.ClipDescription;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sf3 {
    public final g51 A;
    public boolean B;
    public final yl3 a;
    public ye1 d;
    public cs0 g;
    public ax h;
    public x50 i;
    public c72 j;
    public px0 k;
    public ip0 l;
    public final d42 m;
    public final d42 n;
    public long o;
    public yg3 p;
    public long q;
    public final d42 r;
    public final d42 s;
    public int t;
    public bg3 u;
    public g51 v;
    public yg3 w;
    public final d42 x;
    public final ar2 y;
    public final qf3 z;
    public iy1 b = no3.a;
    public ns0 c = new n20(23);
    public final d42 e = b32.w(new bg3((String) null, 0, 7));
    public nr3 f = m22.B;

    public sf3(yl3 yl3Var) {
        this.a = yl3Var;
        Boolean bool = Boolean.TRUE;
        this.m = b32.w(bool);
        this.n = b32.w(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = b32.w(null);
        this.s = b32.w(null);
        this.t = -1;
        this.u = new bg3((String) null, 0L, 7);
        this.x = b32.w(Boolean.FALSE);
        ar2 ar2Var = new ar2(2);
        ar2Var.h = yi3.f;
        this.y = ar2Var;
        this.z = new qf3(this);
        this.A = new g51(this);
    }

    public static final r32 a(sf3 sf3Var) {
        String str;
        yg3 yg3Var;
        af afVarM = sf3Var.m();
        if (afVarM == null || (str = afVarM.g) == null || (yg3Var = sf3Var.w) == null) {
            return null;
        }
        long j = yg3Var.a;
        return new r32(str, new yg3(d32.f(sf3Var.b.r((int) (j >> 32)), sf3Var.b.r((int) (j & 4294967295L)))));
    }

    public static final void b(sf3 sf3Var, yg3 yg3Var) {
        af afVarM;
        String str;
        x50 x50Var;
        if (yg3Var == null) {
            return;
        }
        long j = yg3Var.a;
        c72 c72Var = sf3Var.j;
        if (c72Var == null || (afVarM = sf3Var.m()) == null || (str = afVarM.g) == null) {
            return;
        }
        iy1 iy1Var = sf3Var.b;
        long jF = d32.f(iy1Var.r((int) (j >> 32)), iy1Var.r((int) (j & 4294967295L)));
        if (str.length() <= 0 || yg3.c(jF) || (x50Var = sf3Var.i) == null) {
            return;
        }
        cl3.t(x50Var, null, new w30(c72Var, str, jF, yg3Var, sf3Var, iy1Var, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long c(sf3 sf3Var, bg3 bg3Var, long j, boolean z, boolean z2, qn1 qn1Var, boolean z3, qx0 qx0Var) {
        qg3 qg3VarD;
        long j2;
        int i;
        long j3;
        bu2 bu2Var;
        long j4;
        af afVar;
        bu2 bu2Var2;
        boolean z4;
        px0 px0Var;
        au2 au2VarI;
        au2 au2Var;
        au2 au2Var2;
        ye1 ye1Var = sf3Var.d;
        if (ye1Var == null || (qg3VarD = ye1Var.d()) == null) {
            return yg3.b;
        }
        iy1 iy1Var = sf3Var.b;
        long j5 = bg3Var.b;
        af afVar2 = bg3Var.a;
        int i2 = yg3.c;
        long jF = d32.f(iy1Var.r((int) (j5 >> 32)), sf3Var.b.r((int) (j5 & 4294967295L)));
        int iB = qg3VarD.b(j, false);
        int i3 = (z2 || z) ? iB : (int) (jF >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iB;
        } else {
            j2 = 4294967295L;
            i = (int) (jF & 4294967295L);
        }
        g51 g51Var = sf3Var.v;
        int i4 = -1;
        if (z || g51Var == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i5 = sf3Var.t;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        pg3 pg3Var = qg3VarD.a;
        if (z) {
            afVar = afVar2;
            j4 = j5;
            bu2Var = null;
        } else {
            j4 = j5;
            int i6 = (int) (jF >> 32);
            afVar = afVar2;
            int i7 = (int) (jF & j3);
            bu2Var = new bu2(new au2(b32.r(pg3Var, i6), i6, 1L), new au2(b32.r(pg3Var, i7), i7, 1L), yg3.g(jF));
        }
        g51 g51Var2 = new g51(z2, bu2Var, new lx(i3, i, i4, pg3Var));
        if (bu2Var != null && g51Var != null && z2 == g51Var.b) {
            lx lxVar = (lx) g51Var.d;
            if (i3 == lxVar.b && i == lxVar.c) {
                return j4;
            }
        }
        sf3Var.v = g51Var2;
        sf3Var.t = iB;
        int i8 = qn1Var.f;
        h60 h60Var = h60.f;
        Object obj = g51Var2.d;
        switch (i8) {
            case vr.i /* 12 */:
                lx lxVar2 = (lx) obj;
                bu2Var2 = new bu2(lxVar2.a(lxVar2.b), lxVar2.a(lxVar2.c), g51Var2.b() == h60Var);
                break;
            case 13:
                bu2Var2 = t22.g(g51Var2, m22.n);
                break;
            case 14:
                bu2Var2 = t22.g(g51Var2, m22.m);
                break;
            default:
                bu2Var2 = (bu2) g51Var2.c;
                lx lxVar3 = (lx) obj;
                if (bu2Var2 == null) {
                    bu2Var2 = t22.g(g51Var2, m22.n);
                    break;
                } else {
                    au2 au2Var3 = bu2Var2.b;
                    au2 au2Var4 = bu2Var2.a;
                    if (g51Var2.b) {
                        au2VarI = t22.i(g51Var2, lxVar3, au2Var4);
                        au2Var2 = au2Var3;
                        au2Var3 = au2Var4;
                        au2Var = au2VarI;
                    } else {
                        au2VarI = t22.i(g51Var2, lxVar3, au2Var3);
                        au2Var = au2Var4;
                        au2Var2 = au2VarI;
                    }
                    if (!s51.n(au2VarI, au2Var3)) {
                        bu2 bu2Var3 = new bu2(au2Var, au2Var2, g51Var2.b() == h60Var || (g51Var2.b() == h60.h && au2Var.b > au2Var2.b));
                        lx lxVar4 = (lx) obj;
                        au2 au2Var5 = bu2Var3.a;
                        long j6 = au2Var5.c;
                        au2 au2Var6 = bu2Var3.b;
                        if (j6 != au2Var6.c) {
                            boolean z5 = bu2Var3.c;
                            if ((z5 ? au2Var5 : au2Var6).b == 0) {
                                if (((pg3) lxVar4.e).a.a.g.length() != (z5 ? au2Var6 : au2Var5).b) {
                                }
                            }
                            bu2Var2 = bu2Var3;
                            break;
                        } else if (au2Var5.b == au2Var6.b) {
                            bu2 bu2Var4 = (bu2) g51Var2.c;
                            String str = ((pg3) lxVar4.e).a.a.g;
                            if (bu2Var4 == null || str.length() == 0) {
                                bu2Var2 = bu2Var3;
                            } else {
                                boolean z6 = g51Var2.b;
                                String str2 = ((pg3) lxVar4.e).a.a.g;
                                int i9 = lxVar4.b;
                                int length = str2.length();
                                if (i9 == 0) {
                                    int iL = n32.l(0, str2);
                                    bu2Var2 = !z6 ? bu2.a(bu2Var3, null, t22.p(au2Var6, lxVar4, iL), false, 1) : bu2.a(bu2Var3, t22.p(au2Var5, lxVar4, iL), null, true, 2);
                                } else if (i9 != length) {
                                    boolean z7 = bu2Var4.c;
                                    int iM = z6 ^ z7 ? n32.m(i9, str2) : n32.l(i9, str2);
                                    bu2Var2 = !z6 ? bu2.a(bu2Var3, null, t22.p(au2Var6, lxVar4, iM), z7, 1) : bu2.a(bu2Var3, t22.p(au2Var5, lxVar4, iM), null, z7, 2);
                                } else {
                                    int iM2 = n32.m(length, str2);
                                    bu2Var2 = !z6 ? bu2.a(bu2Var3, null, t22.p(au2Var6, lxVar4, iM2), true, 1) : bu2.a(bu2Var3, t22.p(au2Var5, lxVar4, iM2), null, false, 2);
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
        long jF2 = d32.f(sf3Var.b.n(bu2Var2.a.b), sf3Var.b.n(bu2Var2.b.b));
        long j7 = j4;
        if (yg3.b(jF2, j7)) {
            return j7;
        }
        boolean z8 = yg3.g(jF2) != yg3.g(j7) && yg3.b(d32.f((int) (jF2 & j3), (int) (jF2 >> 32)), j7);
        boolean z9 = yg3.c(jF2) && yg3.c(j7);
        if (z3 && afVar.g.length() > 0 && !z8 && !z9 && qx0Var != null && (px0Var = sf3Var.k) != null) {
            ((n62) px0Var).a(qx0Var.a);
        }
        sf3Var.c.h(e(afVar, jF2));
        sf3Var.w = new yg3(jF2);
        if (!z3) {
            sf3Var.t(!yg3.c(jF2));
        }
        ye1 ye1Var2 = sf3Var.d;
        if (ye1Var2 != null) {
            ye1Var2.q.setValue(Boolean.valueOf(z3));
        }
        ye1 ye1Var3 = sf3Var.d;
        if (ye1Var3 != null) {
            ye1Var3.m.setValue(Boolean.valueOf(!yg3.c(jF2) && jo3.p(sf3Var, true)));
        }
        ye1 ye1Var4 = sf3Var.d;
        if (ye1Var4 != null) {
            z4 = false;
            ye1Var4.n.setValue(Boolean.valueOf(!yg3.c(jF2) && jo3.p(sf3Var, false)));
        } else {
            z4 = false;
        }
        ye1 ye1Var5 = sf3Var.d;
        if (ye1Var5 != null) {
            ye1Var5.o.setValue(Boolean.valueOf((yg3.c(jF2) && jo3.p(sf3Var, true)) ? true : z4));
        }
        return jF2;
    }

    public static bg3 e(af afVar, long j) {
        return new bg3(afVar, j, (yg3) null);
    }

    public final w83 d(boolean z) {
        x50 x50Var = this.i;
        p40 p40Var = null;
        if (x50Var != null) {
            return cl3.t(x50Var, null, new fo3(this, z, p40Var, 2), 1);
        }
        return null;
    }

    public final void f() {
        x50 x50Var = this.i;
        if (x50Var != null) {
            cl3.t(x50Var, null, new mf3(this, null, 1), 1);
        }
    }

    public final void g(gy1 gy1Var) {
        if (!yg3.c(n().b)) {
            ye1 ye1Var = this.d;
            qg3 qg3VarD = ye1Var != null ? ye1Var.d() : null;
            int iE = (gy1Var == null || qg3VarD == null) ? yg3.e(n().b) : this.b.n(qg3VarD.b(gy1Var.a, true));
            bg3 bg3VarA = bg3.a(n(), null, d32.f(iE, iE), 5);
            this.c.h(bg3VarA);
            this.w = new yg3(bg3VarA.b);
        }
        q((gy1Var == null || n().a.g.length() <= 0) ? hx0.f : hx0.h);
        t(false);
    }

    public final void h(boolean z) {
        ip0 ip0Var;
        ye1 ye1Var = this.d;
        if (ye1Var != null && !ye1Var.b() && (ip0Var = this.l) != null) {
            ip0.a(ip0Var);
        }
        this.u = n();
        t(z);
        q(hx0.g);
    }

    public final gy1 i() {
        return (gy1) this.s.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long l(boolean z) {
        qg3 qg3VarD;
        long j;
        ye1 ye1Var = this.d;
        if (ye1Var == null || (qg3VarD = ye1Var.d()) == null) {
            return 9205357640488583168L;
        }
        pg3 pg3Var = qg3VarD.a;
        br1 br1Var = pg3Var.b;
        af afVarM = m();
        if (afVarM == null) {
            return 9205357640488583168L;
        }
        if (!s51.n(afVarM.g, pg3Var.a.a.g)) {
            return 9205357640488583168L;
        }
        bg3 bg3VarN = n();
        if (z) {
            long j2 = bg3VarN.b;
            int i = yg3.c;
            j = j2 >> 32;
        } else {
            long j3 = bg3VarN.b;
            int i2 = yg3.c;
            j = j3 & 4294967295L;
        }
        int iR = this.b.r((int) j);
        boolean zG = yg3.g(n().b);
        long j4 = pg3Var.c;
        int iD = br1Var.d(iR);
        if (iD >= br1Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = pg3Var.a(((!z || zG) && (z || !zG)) ? Math.max(iR + (-1), 0) : iR) == pg3Var.h(iR);
        br1Var.l(iR);
        int length = ((af) br1Var.a.a).g.length();
        ArrayList arrayList = br1Var.h;
        t32 t32Var = (t32) arrayList.get(iR == length ? vr.C(arrayList) : lr.A(iR, arrayList));
        y9 y9Var = t32Var.a;
        int iD2 = t32Var.d(iR);
        ng3 ng3Var = y9Var.d;
        return (((long) Float.floatToRawIntBits(y02.g(br1Var.b(iD), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(y02.g(z2 ? ng3Var.j(iD2, false) : ng3Var.k(iD2, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    public final af m() {
        ye1 ye1Var = this.d;
        if (ye1Var != null) {
            return (af) ye1Var.a.b;
        }
        return null;
    }

    public final bg3 n() {
        return (bg3) this.e.getValue();
    }

    public final void o() {
        w83 w83Var;
        me3 me3Var = (me3) this.y.g;
        if (me3Var == null || (w83Var = me3Var.z) == null) {
            return;
        }
        w83Var.c(null);
        me3Var.z = null;
    }

    public final void p() {
        x50 x50Var = this.i;
        if (x50Var != null) {
            cl3.t(x50Var, null, new mf3(this, null, 2), 1);
        }
    }

    public final void q(hx0 hx0Var) {
        ye1 ye1Var = this.d;
        if (ye1Var != null) {
            if (ye1Var.a() == hx0Var) {
                ye1Var = null;
            }
            if (ye1Var != null) {
                ye1Var.k.setValue(hx0Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (((java.lang.Boolean) r4.q.getValue()).booleanValue() == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        ge3 ge3Var;
        t63 t63VarL = jo3.l();
        p40 p40Var = null;
        ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
        t63 t63VarS = jo3.s(t63VarL);
        try {
            if (k()) {
                ye1 ye1Var = this.d;
                if (ye1Var != null) {
                }
                jo3.v(t63VarL, t63VarS, ns0VarE);
                ar2 ar2Var = this.y;
                if (((yi3) ar2Var.h) == yi3.f) {
                    p21.c("ToolbarRequester is not initialized.");
                }
                me3 me3Var = (me3) ar2Var.g;
                if (me3Var == null || !me3Var.s) {
                    return;
                }
                w83 w83Var = me3Var.z;
                if ((w83Var == null || !w83Var.b()) && (ge3Var = (ge3) ur.z(me3Var, he3.b)) != null) {
                    me3Var.z = cl3.t(me3Var.d1(), null, new ri2(me3Var, ge3Var, p40Var, 10), 1);
                }
            }
        } finally {
            jo3.v(t63VarL, t63VarS, ns0VarE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(q40 q40Var) {
        rf3 rf3Var;
        if (q40Var instanceof rf3) {
            rf3Var = (rf3) q40Var;
            int i = rf3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                rf3Var.l = i - Integer.MIN_VALUE;
            } else {
                rf3Var = new rf3(this, q40Var);
            }
        }
        Object objValueOf = rf3Var.j;
        int i2 = rf3Var.l;
        if (i2 == 0) {
            y02.Q(objValueOf);
            ax axVar = this.h;
            if (axVar != null) {
                rf3Var.i = this;
                rf3Var.l = 1;
                if (!(axVar instanceof q6)) {
                    c.g(by1.g("Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received ", rk2.a(axVar.getClass()).b()));
                    return null;
                }
                ClipDescription primaryClipDescription = ((q6) axVar).a.s().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription == null ? false : primaryClipDescription.hasMimeType("text/*"));
                Object obj = y50.f;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return dm3.a;
        }
        if (i2 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = rf3Var.i;
        y02.Q(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.x.setValue(bool);
        return dm3.a;
    }

    public final void t(boolean z) {
        ye1 ye1Var = this.d;
        if (ye1Var != null) {
            ye1Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            r();
        } else {
            o();
        }
    }
}
