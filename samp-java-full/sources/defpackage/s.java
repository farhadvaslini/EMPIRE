package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.CancellationSignal;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s(eh0 eh0Var, a31 a31Var) {
        this.f = 23;
        this.g = eh0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x042e  */
    @Override // defpackage.ns0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj) {
        int i;
        xm xmVar;
        boolean z;
        g9 g9VarC;
        String strConcat;
        int length;
        int i2;
        String str;
        int i3 = 5;
        p40 p40Var = null;
        int i4 = 0;
        switch (this.f) {
            case 0:
                return obj == ((t) this.g) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                o52 o52Var = (o52) this.g;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == o52Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != o52Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                k4 k4Var = (k4) this.g;
                k4Var.v.f((vd3) obj, ur.z(k4Var, x7.b));
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ub1 ub1Var = (ub1) this.g;
                m5 m5Var = (m5) obj;
                if (m5Var.r0() != Integer.MAX_VALUE) {
                    if (m5Var.c().b) {
                        m5Var.L();
                    }
                    for (Map.Entry entry2 : m5Var.c().i.entrySet()) {
                        ub1Var.a((i5) entry2.getKey(), ((Number) entry2.getValue()).intValue(), m5Var.I());
                    }
                    ex1 ex1Var = m5Var.I().D;
                    ex1Var.getClass();
                    while (!ex1Var.equals(ub1Var.a.I())) {
                        for (i5 i5Var : ub1Var.b(ex1Var).keySet()) {
                            ub1Var.a(i5Var, ub1Var.c(ex1Var, i5Var), ex1Var);
                        }
                        ex1Var = ex1Var.D;
                        ex1Var.getClass();
                    }
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return Boolean.valueOf(((rp0) obj).x1(((ro0) this.g).a));
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                zk1 zk1Var = (zk1) obj;
                h7 h7Var = ((a7) this.g).u;
                if (h7Var.getInsetsListener().l.g() > 0) {
                    or1 or1Var = ut3.a;
                    long jI0 = zk1Var.c().i0();
                    is1 is1Var = h7Var.getInsetsListener().k;
                    int i5 = (int) (jI0 >> 32);
                    int i6 = (int) (jI0 & 4294967295L);
                    for (st3 st3Var : ut3.b) {
                        Object objG = is1Var.g(st3Var);
                        objG.getClass();
                        hu3 hu3Var = (hu3) objG;
                        ut3.a(zk1Var, ((tt3) st3Var).c, hu3Var.h, i5, i6);
                        if (((Boolean) hu3Var.b.getValue()).booleanValue()) {
                            ut3.a(zk1Var, hu3Var.f, hu3Var.j, i5, i6);
                            ut3.a(zk1Var, hu3Var.g, hu3Var.k, i5, i6);
                        }
                        ut3.a(zk1Var, ((tt3) st3Var).d, hu3Var.i, i5, i6);
                    }
                    as1 as1Var = h7Var.getInsetsListener().m;
                    if (as1Var.j()) {
                        l73 l73Var = h7Var.getInsetsListener().n;
                        Object[] objArr = as1Var.a;
                        int i7 = as1Var.b;
                        for (int i8 = 0; i8 < i7; i8++) {
                            os1 os1Var = (os1) objArr[i8];
                            t21 t21Var = (t21) l73Var.get(i8);
                            Rect rect = (Rect) os1Var.getValue();
                            zk1Var.i(t21Var.b(), rect.left);
                            zk1Var.i(t21Var.d(), rect.top);
                            zk1Var.i(t21Var.c(), rect.right);
                            zk1Var.i(t21Var.a(), rect.bottom);
                        }
                    }
                }
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return Boolean.valueOf(((g41) this.g).a(((vu2) obj).f));
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.valueOf(gv3.G((vu2) obj, (Resources) this.g));
            case 8:
                ((dv2) obj).a(lu2.a, new ku2(fx0.f, ((jy1) this.g).a(), ju2.g, true));
                return dm3.a;
            case vr.g /* 9 */:
                ((tb1) this.g).c0((ua0) obj);
                return dm3.a;
            case vr.h /* 10 */:
                return new c4(4, (tl) this.g);
            case 11:
                return new c4(i3, (jj3) this.g);
            case vr.i /* 12 */:
                jn jnVar = (jn) this.g;
                oq oqVar = (oq) obj;
                if (oqVar.h() * jnVar.w < 0.0f || h43.b(oqVar.f.a()) <= 0.0f) {
                    return oqVar.c(new u0(18));
                }
                final float fMin = Math.min(jd0.b(jnVar.w, 0.0f) ? 1.0f : (float) Math.ceil(oqVar.h() * jnVar.w), (float) Math.ceil(h43.b(oqVar.f.a()) / 2.0f));
                final float f = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (oqVar.f.a() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (oqVar.f.a() & 4294967295L)) - fMin)) & 4294967295L);
                float f2 = fMin * 2.0f;
                boolean z2 = f2 > h43.b(oqVar.f.a());
                vr vrVarA = jnVar.y.a(oqVar.f.a(), oqVar.f.getLayoutDirection(), oqVar);
                if (!(vrVarA instanceof v02)) {
                    if (!(vrVarA instanceof x02)) {
                        boolean z3 = z2;
                        if (!(vrVarA instanceof w02)) {
                            c.k();
                            return null;
                        }
                        final w73 w73Var = jnVar.x;
                        if (z3) {
                            jFloatToRawIntBits = 0;
                        }
                        final long j = jFloatToRawIntBits;
                        if (z3) {
                            jFloatToRawIntBits2 = oqVar.f.a();
                        }
                        final long j2 = jFloatToRawIntBits2;
                        final rf0 ga3Var = z3 ? fm0.a : new ga3(fMin, 0.0f, 0, 0, null, 30);
                        return oqVar.c(new ns0() { // from class: gn
                            @Override // defpackage.ns0
                            public final Object h(Object obj2) {
                                vb1 vb1Var = (vb1) obj2;
                                vb1Var.c();
                                qf0.S0(vb1Var, w73Var, j, j2, 0.0f, ga3Var, 104);
                                return dm3.a;
                            }
                        });
                    }
                    final w73 w73Var2 = jnVar.x;
                    ro2 ro2Var = ((x02) vrVarA).l;
                    if (w22.A(ro2Var)) {
                        final long j3 = ro2Var.e;
                        final ga3 ga3Var2 = new ga3(fMin, 0.0f, 0, 0, null, 30);
                        final boolean z4 = z2;
                        return oqVar.c(new ns0() { // from class: hn
                            @Override // defpackage.ns0
                            public final Object h(Object obj2) throws Throwable {
                                long j4;
                                vb1 vb1Var = (vb1) obj2;
                                vb1Var.c();
                                rr rrVar = vb1Var.f;
                                boolean z5 = z4;
                                dp dpVar = w73Var2;
                                long j5 = j3;
                                if (z5) {
                                    qf0.d0(vb1Var, dpVar, 0L, 0L, j5, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f3 = f;
                                    if (fIntBitsToFloat < f3) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (rrVar.a() >> 32));
                                        float f4 = fMin;
                                        float f5 = fIntBitsToFloat2 - f4;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (rrVar.a() & 4294967295L)) - f4;
                                        pi piVar = rrVar.g;
                                        long jA = piVar.A();
                                        piVar.k().l();
                                        try {
                                            ((yl1) piVar.g).t(f4, f4, f5, fIntBitsToFloat3, 0);
                                            j4 = jA;
                                            try {
                                                qf0.d0(vb1Var, dpVar, 0L, 0L, j5, null, 246);
                                                nc2.t(piVar, j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                nc2.t(piVar, j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j4 = jA;
                                        }
                                    } else {
                                        qf0.d0(vb1Var, dpVar, jFloatToRawIntBits, jFloatToRawIntBits2, f80.Q(f3, j5), ga3Var2, 208);
                                    }
                                }
                                return dm3.a;
                            }
                        });
                    }
                    boolean z5 = z2;
                    if (jnVar.v == null) {
                        jnVar.v = new fn();
                    }
                    fn fnVar = jnVar.v;
                    fnVar.getClass();
                    da daVarA = fnVar.d;
                    if (daVarA == null) {
                        daVarA = ga.a();
                        fnVar.d = daVarA;
                    }
                    daVarA.g();
                    da.b(daVarA, ro2Var);
                    if (!z5) {
                        da daVarA2 = ga.a();
                        da.b(daVarA2, new ro2(fMin, fMin, (ro2Var.c - ro2Var.a) - fMin, (ro2Var.d - ro2Var.b) - fMin, f80.Q(fMin, ro2Var.e), f80.Q(fMin, ro2Var.f), f80.Q(fMin, ro2Var.g), f80.Q(fMin, ro2Var.h)));
                        daVarA.f(daVarA, daVarA2, 0);
                    }
                    return oqVar.c(new i(9, daVarA, w73Var2));
                }
                w73 w73Var3 = jnVar.x;
                v02 v02Var = (v02) vrVarA;
                da daVar = v02Var.l;
                if (z2) {
                    return oqVar.c(new i(10, v02Var, w73Var3));
                }
                if (w73Var3 != null) {
                    xmVar = new xm(5, wx.b(1.0f, w73Var3.a));
                    i = 1;
                } else {
                    i = 0;
                    xmVar = null;
                }
                jk2 jk2VarD = daVar.d();
                float f3 = jk2VarD.b;
                float f4 = jk2VarD.a;
                if (jnVar.v == null) {
                    jnVar.v = new fn();
                }
                fn fnVar2 = jnVar.v;
                fnVar2.getClass();
                da daVarA3 = fnVar2.d;
                if (daVarA3 == null) {
                    daVarA3 = ga.a();
                    fnVar2.d = daVarA3;
                }
                daVarA3.g();
                daVarA3.getClass();
                float f5 = jk2VarD.a;
                float f6 = jk2VarD.d;
                float f7 = jk2VarD.c;
                float f8 = jk2VarD.b;
                if (Float.isNaN(f5) || Float.isNaN(f8) || Float.isNaN(f7) || Float.isNaN(f6)) {
                    ga.b("Invalid rectangle, make sure no value is NaN");
                }
                if (daVarA3.b == null) {
                    daVarA3.b = new RectF();
                }
                RectF rectF = daVarA3.b;
                rectF.getClass();
                rectF.set(f5, f8, f7, f6);
                Path path = daVarA3.a;
                RectF rectF2 = daVarA3.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                daVarA3.f(daVarA3, daVar, 0);
                qk2 qk2Var = new qk2();
                long jCeil = (((long) ((int) Math.ceil(jk2VarD.c - f4))) << 32) | (((long) ((int) Math.ceil(jk2VarD.d - f3))) & 4294967295L);
                fn fnVar3 = jnVar.v;
                fnVar3.getClass();
                g9 g9Var = fnVar3.a;
                n6 n6VarA = fnVar3.b;
                t01 t01Var = g9Var != null ? new t01(g9Var.a()) : null;
                if (t01Var != null && t01Var.a == 0) {
                    z = true;
                } else {
                    t01 t01Var2 = g9Var != null ? new t01(g9Var.a()) : null;
                    if (t01Var2 == null || i != t01Var2.a) {
                        z = false;
                    }
                }
                if (g9Var == null || n6VarA == null) {
                    g9VarC = pq.c((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    fnVar3.a = g9VarC;
                    n6VarA = ur.a(g9VarC);
                    fnVar3.b = n6VarA;
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (oqVar.f.a() >> 32));
                    Bitmap bitmap = g9Var.a;
                    if (fIntBitsToFloat <= bitmap.getWidth()) {
                        boolean z6 = z;
                        if (Float.intBitsToFloat((int) (oqVar.f.a() & 4294967295L)) <= bitmap.getHeight() && z6) {
                            g9VarC = g9Var;
                        }
                    }
                }
                rr rrVar = fnVar3.c;
                if (rrVar == null) {
                    rrVar = new rr();
                    fnVar3.c = rrVar;
                }
                pi piVar = rrVar.g;
                qr qrVar = rrVar.f;
                long jT = lr.T(jCeil);
                bb1 layoutDirection = oqVar.f.getLayoutDirection();
                ua0 ua0Var = qrVar.a;
                rr rrVar2 = rrVar;
                bb1 bb1Var = qrVar.b;
                pr prVar = qrVar.c;
                long j4 = qrVar.d;
                qrVar.a = oqVar;
                qrVar.b = layoutDirection;
                qrVar.c = n6VarA;
                qrVar.d = jT;
                n6VarA.l();
                qf0.h0(rrVar2, wx.b, 0L, jT, 0.0f, null, 0, 58);
                float f9 = -f4;
                float f10 = -f3;
                ((yl1) piVar.g).H(f9, f10);
                try {
                    qf0.N(rrVar2, v02Var.l, w73Var3, 0.0f, new ga3(f2, 0.0f, 0, 0, null, 30), 52);
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (rrVar2.a() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (rrVar2.a() >> 32));
                    float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (rrVar2.a() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (rrVar2.a() & 4294967295L));
                    da daVar2 = daVarA3;
                    long jY0 = rrVar2.y0();
                    g9 g9Var2 = g9VarC;
                    n6 n6Var = n6VarA;
                    long jA = piVar.A();
                    piVar.k().l();
                    try {
                        ((yl1) piVar.g).G(fIntBitsToFloat2, fIntBitsToFloat3, jY0);
                        qf0.N(rrVar2, daVar2, w73Var3, 0.0f, null, 28);
                        ((yl1) piVar.g).H(-f9, -f10);
                        n6Var.i();
                        qrVar.a = ua0Var;
                        qrVar.b = bb1Var;
                        qrVar.c = prVar;
                        qrVar.d = j4;
                        g9Var2.a.prepareToDraw();
                        qk2Var.f = g9Var2;
                        return oqVar.c(new in(jk2VarD, qk2Var, jCeil, xmVar, 0));
                    } finally {
                        piVar.k().i();
                        piVar.Q(jA);
                    }
                } catch (Throwable th) {
                    ((yl1) piVar.g).H(-f9, -f10);
                    throw th;
                }
            case 13:
                oo ooVar = (oo) this.g;
                jk2 jk2Var = (jk2) obj;
                if (ooVar.s) {
                    cl3.t(ooVar.d1(), null, new j(ooVar, jk2Var, p40Var, 6), 3);
                }
                return dm3.a;
            case 14:
                vb1 vb1Var = (vb1) obj;
                ((er1) this.g).h(vb1Var);
                vb1Var.c();
                return dm3.a;
            case jo3.g /* 15 */:
                mw mwVar = (mw) this.g;
                mw mwVar2 = (mw) obj;
                mwVar2.getClass();
                return Boolean.valueOf(s51.n(mwVar2.a, mwVar.a));
            case 16:
                CancellationSignal cancellationSignal = (CancellationSignal) this.g;
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return dm3.a;
            case 17:
                a20 a20Var = (a20) this.g;
                pb pbVar = a20Var.x;
                if (pbVar != null) {
                    return pbVar;
                }
                pb pbVar2 = new pb(a20Var.a);
                a20Var.x = pbVar2;
                return pbVar2;
            case 18:
                b80 b80Var = (b80) this.g;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    b80Var.g.I(new km0(th2));
                }
                if (b80Var.i.g != m22.z) {
                    ((tl0) b80Var.i.getValue()).close();
                }
                return dm3.a;
            case 19:
                mk3 mk3Var = mk3.f;
                yl1 yl1Var = (yl1) this.g;
                rd0 rd0Var = (rd0) obj;
                if (!rd0Var.f.s) {
                    return mk3.g;
                }
                rd0 rd0Var2 = rd0Var.u;
                if (rd0Var2 != null) {
                    s sVar = new s(19, yl1Var);
                    if (sVar.h(rd0Var2) == mk3Var) {
                        n32.E(rd0Var2, sVar);
                    }
                }
                rd0Var.u = null;
                rd0Var.t = null;
                return mk3Var;
            case 20:
                ((vk1) this.g).a();
                return dm3.a;
            case 21:
                gb2 gb2Var = (gb2) obj;
                ((bh1) this.g).f(gb2Var, Float.valueOf(Float.intBitsToFloat((int) (w22.D(gb2Var, false) >> 32))));
                gb2Var.a();
                return dm3.a;
            case 22:
                aw0 aw0Var = (aw0) obj;
                return Boolean.valueOf(aw0Var instanceof ze0 ? ((Boolean) ((me0) this.g).h(aw0Var)).booleanValue() : true);
            case 23:
                eh0 eh0Var = (eh0) obj;
                String str2 = ((eh0) this.g) == eh0Var ? " > " : "   ";
                if (eh0Var instanceof dz) {
                    dz dzVar = (dz) eh0Var;
                    length = dzVar.a.g.length();
                    i2 = dzVar.b;
                    str = "CommitTextCommand(text.length=";
                } else {
                    if (!(eh0Var instanceof mz2)) {
                        if (eh0Var instanceof lz2) {
                            strConcat = ((lz2) eh0Var).toString();
                        } else if (eh0Var instanceof pa0) {
                            strConcat = ((pa0) eh0Var).toString();
                        } else if (eh0Var instanceof qa0) {
                            strConcat = ((qa0) eh0Var).toString();
                        } else if (eh0Var instanceof nz2) {
                            strConcat = ((nz2) eh0Var).toString();
                        } else if (eh0Var instanceof lm0) {
                            strConcat = "FinishComposingTextCommand()";
                        } else if (eh0Var instanceof oa0) {
                            strConcat = "DeleteAllCommand()";
                        } else {
                            String strC = rk2.a(eh0Var.getClass()).c();
                            if (strC == null) {
                                strC = "{anonymous EditCommand}";
                            }
                            strConcat = "Unknown EditCommand: ".concat(strC);
                        }
                        return str2.concat(strConcat);
                    }
                    mz2 mz2Var = (mz2) eh0Var;
                    length = mz2Var.a.g.length();
                    i2 = mz2Var.b;
                    str = "SetComposingTextCommand(text.length=";
                }
                strConcat = nc2.h(str, length, ", newCursorPosition=", i2, ")");
                return str2.concat(strConcat);
            case 24:
                qs1 qs1Var = (qs1) this.g;
                Object[] objArr2 = qs1Var.f;
                int i9 = qs1Var.h;
                while (i4 < i9) {
                    ((dn1) objArr2[i4]).a();
                    i4++;
                }
                return dm3.a;
            case 25:
                ll3 ll3Var = (ll3) obj;
                return ((aq0) this.g).a(new ll3(null, ll3Var.b, ll3Var.c, ll3Var.d, ll3Var.e)).f;
            case 26:
                np npVar = (np) this.g;
                dm3 dm3Var = dm3.a;
                if (iw0.b.compareAndSet(false, true)) {
                    npVar.l(dm3Var);
                }
                return dm3Var;
            case 27:
                tw0 tw0Var = (tw0) this.g;
                qf0 qf0Var = (qf0) obj;
                pr prVarK = qf0Var.Z().k();
                rs0 rs0Var = tw0Var.i;
                if (rs0Var != null) {
                    rs0Var.f(prVarK, (qw0) qf0Var.Z().h);
                }
                return dm3.a;
            case 28:
                bx0 bx0Var = (bx0) this.g;
                mo3 mo3Var = (mo3) obj;
                bx0Var.g(mo3Var);
                ns0 ns0Var = bx0Var.i;
                if (ns0Var != null) {
                    ns0Var.h(mo3Var);
                }
                return dm3.a;
            default:
                b31 b31Var = (b31) this.g;
                vx1 vx1Var = (vx1) obj;
                hk2 hk2Var = vx1Var.b;
                if (hk2Var != null) {
                    hk2Var.closeConnection();
                    vx1Var.b = null;
                }
                qs1 qs1Var2 = b31Var.d;
                Object[] objArr3 = qs1Var2.f;
                int i10 = qs1Var2.h;
                while (true) {
                    if (i4 >= i10) {
                        i4 = -1;
                    } else if (!s51.n((ur3) objArr3[i4], vx1Var)) {
                        i4++;
                    }
                }
                if (i4 >= 0) {
                    qs1Var2.k(i4);
                }
                if (qs1Var2.h == 0) {
                    b31Var.b.a();
                }
                return dm3.a;
        }
    }

    public /* synthetic */ s(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
