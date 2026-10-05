package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ok implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ok(nv0 nv0Var, gs gsVar, i53 i53Var, yq1 yq1Var) {
        this.f = 6;
        this.g = nv0Var;
        this.h = gsVar;
        this.i = i53Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0325, code lost:
    
        if (r6.z == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0327, code lost:
    
        r7 = (defpackage.jk2) r6.x.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0330, code lost:
    
        if (r7 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x033b, code lost:
    
        if (defpackage.y30.r1(r6, r7, 0, 0, 3) != true) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x033d, code lost:
    
        r6.z = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x033f, code lost:
    
        r0.e = defpackage.y30.p1(r6, r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0348, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        int i;
        y30 y30Var;
        boolean zR1;
        jk2 jk2VarA;
        jk2 jk2VarA2;
        int i2 = this.f;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        dm3 dm3Var = dm3.a;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i2) {
            case 0:
                ((pk) obj3).a();
                bk bkVar = (bk) ((qk) obj2).c;
                int i3 = ((ok2) obj).f;
                do {
                    i = bkVar.get();
                } while (!bkVar.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return dm3Var;
            case 1:
                jj3 jj3Var = (jj3) obj3;
                x50 x50Var = (x50) obj2;
                os1 os1Var = (os1) obj;
                if (jj3Var.b()) {
                    cl3.t(x50Var, null, new hm(jj3Var, objArr == true ? 1 : 0, i), 3);
                    os1Var.setValue(Boolean.FALSE);
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                wo woVar = (wo) obj3;
                jk2 jk2VarP1 = wo.p1(woVar, (ex1) obj2, (u1) obj);
                if (jk2VarP1 == null) {
                    return null;
                }
                y30 y30Var2 = woVar.t;
                if (p41.b(y30Var2.A, -1L)) {
                    p21.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return jk2VarP1.i(y30Var2.t1(jk2VarP1, y30Var2.q1(), 0L) ^ (-9223372034707292160L));
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                tw twVar = (tw) obj3;
                x31 x31Var = (x31) obj2;
                ((os1) obj).setValue(null);
                i93 i93Var = twVar.p;
                if (!(i93Var.getValue() instanceof hv)) {
                    i93Var.j(null, new hv(ev.i, x31Var.a, 4));
                    cl3.t(f80.F(twVar), null, new j(twVar, x31Var, objArr2 == true ? 1 : 0, 10), 3);
                }
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                pq pqVar = ((fs) obj3).b;
                pqVar.getClass();
                return pqVar.n(((m4) obj).h.d, ((mx0) obj2).a());
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                y30 y30Var3 = (y30) obj3;
                um3 um3Var = (um3) obj2;
                zo zoVar = (zo) obj;
                po poVar = y30Var3.y;
                while (true) {
                    qs1 qs1Var = poVar.a;
                    int i4 = qs1Var.h;
                    if (i4 == 0) {
                        y30Var = y30Var3;
                    } else {
                        if (i4 == 0) {
                            c.m("MutableVector is empty.");
                            return null;
                        }
                        jk2 jk2Var = (jk2) ((v30) qs1Var.f[i4 - 1]).a.a();
                        if (jk2Var == null) {
                            y30Var = y30Var3;
                            zR1 = true;
                        } else {
                            y30Var = y30Var3;
                            zR1 = y30.r1(y30Var, jk2Var, 0L, 0L, 3);
                        }
                        if (zR1) {
                            qs1 qs1Var2 = poVar.a;
                            ((v30) qs1Var2.k(qs1Var2.h - 1)).b.t(dm3Var);
                            y30Var3 = y30Var;
                        }
                    }
                    break;
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nv0 nv0Var = (nv0) obj3;
                gs gsVar = (gs) obj2;
                i53 i53Var = (i53) obj;
                d20 d20Var = nv0Var.M;
                gs gsVar2 = d20Var.b;
                try {
                    d20Var.b = gsVar;
                    i53 i53Var2 = nv0Var.G;
                    int[] iArr = nv0Var.o;
                    or1 or1Var = nv0Var.v;
                    nv0Var.o = null;
                    nv0Var.v = null;
                    try {
                        nv0Var.G = i53Var;
                        boolean z = d20Var.e;
                        try {
                            d20Var.e = false;
                            throw null;
                        } catch (Throwable th) {
                            d20Var.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        nv0Var.G = i53Var2;
                        nv0Var.o = iArr;
                        nv0Var.v = or1Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    d20Var.b = gsVar2;
                    throw th3;
                }
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                ((os1) obj).setValue(Boolean.FALSE);
                ((ns0) obj3).h(((yv2) obj2).a.e);
                return dm3Var;
            case 8:
                return new u22((ts0) ((os1) obj3).getValue(), (ns0) ((os1) obj2).getValue(), ((Number) ((cs0) obj).a()).intValue());
            case vr.g /* 9 */:
                ie1 ie1Var = (ie1) obj2;
                ae1 ae1Var = (ae1) ((cb0) obj3).getValue();
                return new be1(ie1Var, ae1Var, (nc1) obj, new h9((l41) ((ed1) ie1Var.e.e).getValue(), ae1Var));
            case vr.h /* 10 */:
                ua0 ua0Var = (ua0) obj;
                float fFloatValue = ((Number) ((ed) obj3).d()).floatValue() / m30.i(((lo) obj2).b);
                if (fFloatValue < -1.0f) {
                    fFloatValue = -1.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return Float.valueOf(og0.a.b(Math.abs(fFloatValue)) * Math.signum(fFloatValue) * ua0Var.T(4.0f));
            case 11:
                rs0 rs0Var = (rs0) obj3;
                Object obj4 = (uy0) obj;
                al1 al1Var = (al1) ((qk2) obj2).f;
                is1 is1Var = al1Var.r;
                if (is1Var == null) {
                    long[] jArr = nr2.a;
                    is1Var = new is1();
                    al1Var.r = is1Var;
                }
                Object objG = is1Var.g(obj4);
                if (objG == null) {
                    objG = new zk1(al1Var);
                    is1Var.m(obj4, objG);
                }
                zk1 zk1Var = (zk1) objG;
                zk1Var.f = false;
                rs0Var.f(zk1Var, obj4);
                return dm3Var;
            case vr.i /* 12 */:
                x50 x50Var2 = (x50) obj2;
                s33 s33Var = (s33) obj;
                if (((Boolean) ((s33) obj3).c.d.h(t33.g)).booleanValue()) {
                    cl3.t(x50Var2, null, new qp1(s33Var, objArr3 == true ? 1 : 0, 6), 3);
                }
                return Boolean.TRUE;
            case 13:
                ex1 ex1Var = (ex1) obj2;
                mk2 mk2Var = (mk2) obj;
                wn2 wn2Var = ex1.d0;
                ((ns0) obj3).h(wn2Var);
                boolean zN = s51.n(ex1Var.Q, wn2Var.t);
                i = ex1Var.T != wn2Var.u ? 1 : 0;
                vr vrVarA = wn2Var.t.a(wn2Var.w, wn2Var.z, wn2Var.y);
                wn2Var.D = vrVarA;
                boolean zN2 = s51.n(ex1Var.S, vrVarA != null ? vrVarA.A() : null);
                mk2Var.f = !zN2;
                if (!zN || i != 0 || !zN2) {
                    ex1Var.Q = wn2Var.t;
                    ex1Var.T = wn2Var.u;
                    vr vrVar = wn2Var.D;
                    jk2 jk2Var2 = jk2.e;
                    if (vrVar == null || (jk2VarA = vrVar.A()) == null) {
                        jk2VarA = jk2Var2;
                    }
                    ex1Var.S = jk2VarA;
                    vr vrVar2 = wn2Var.D;
                    if (vrVar2 != null && (jk2VarA2 = vrVar2.A()) != null) {
                        m41 m41VarL = br.L(jk2VarA2);
                        jk2Var2 = new jk2(m41VarL.a, m41VarL.b, m41VarL.c, m41VarL.d);
                    }
                    ex1Var.R = jk2Var2;
                    if (ex1Var.U && (i != 0 || (ex1Var.T && !zN))) {
                        ex1Var.z.F();
                    }
                }
                ex1Var.U = true;
                return dm3Var;
            case 14:
                iv0 iv0Var = (iv0) obj3;
                m53 m53Var = (m53) obj2;
                p02 p02Var = (p02) obj;
                if (iv0Var != null) {
                    m53Var.a(m53Var.c(iv0Var) - m53Var.t);
                }
                List listL = pq.l(m53Var, null, m53Var.t, null);
                v10 v10Var = (v10) qx.z0(listL);
                Integer num = v10Var != null ? v10Var.b : null;
                List listG = p02Var.g(num);
                if (num != null && !listG.isEmpty()) {
                    listG = qx.D0(vr.K(new v10(((v10) qx.q0(listG)).a, null, num)), qx.o0(1, listG));
                }
                return new t10(qx.D0(listL, listG), p02Var.l());
            case jo3.g /* 15 */:
                gp3 gp3Var = (gp3) obj2;
                ((os1) obj).setValue(Boolean.FALSE);
                ((ss0) obj3).e(Float.valueOf(gp3Var.d), Float.valueOf(gp3Var.e), Float.valueOf(gp3Var.f));
                return dm3Var;
            case 16:
                n72 n72Var = (n72) obj2;
                ((os1) obj).setValue(Boolean.FALSE);
                ((ss0) obj3).e(Float.valueOf(n72Var.i), Float.valueOf(n72Var.j), Float.valueOf(n72Var.k));
                return dm3Var;
            case 17:
                zx1 zx1Var = (zx1) obj2;
                ((os1) obj).setValue(Boolean.FALSE);
                ((ss0) obj3).e(Float.valueOf(zx1Var.d), Float.valueOf(zx1Var.e), Float.valueOf(zx1Var.f));
                return dm3Var;
            case 18:
                ((os1) obj2).setValue(((vg2) obj3).f);
                ((os1) obj).setValue(Boolean.TRUE);
                return dm3Var;
            case 19:
                ((ot0) obj3).h(((cf2) obj2).c);
                ((cs0) obj).a();
                return dm3Var;
            case 20:
                ((os1) obj2).setValue((cf2) obj3);
                ((os1) obj).setValue(Boolean.TRUE);
                return dm3Var;
            case 21:
                ((ns0) obj3).h("");
                ((cs0) obj2).a();
                ((os1) obj).setValue(Boolean.FALSE);
                return dm3Var;
            case 22:
                ((cs0) obj3).a();
                ((cs0) obj2).a();
                ((os1) obj).setValue(Boolean.FALSE);
                return dm3Var;
            default:
                w wVar = (w) obj3;
                wVar.removeOnAttachStateChangeListener((e9) obj2);
                oz2.u(wVar).a.remove((qn1) obj);
                return dm3Var;
        }
    }

    public /* synthetic */ ok(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
