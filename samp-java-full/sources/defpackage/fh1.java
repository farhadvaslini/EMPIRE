package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class fh1 {
    public static final r93 a = new r93(new x91(3));

    public static final void a(ep2 ep2Var, cs0 cs0Var, bq1 bq1Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        bq1 bq1Var2;
        ep2Var.getClass();
        cs0Var.getClass();
        nv0Var.b0(-1940210613);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(ep2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= nv0Var.h(d00Var) ? 2048 : 1024;
        }
        int i4 = 1;
        if (nv0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            cs0 cs0Var2 = (cs0) nv0Var.j(a);
            wr wrVar = new wr();
            yp1 yp1Var = yp1.a;
            bq1Var2 = yp1Var;
            bq1 bq1VarA = ep2Var.a(rn.x(gq.t(yp1Var, wrVar), null, null, false, new no2(4), cs0Var, 12).d(j43.b));
            boolean zF = nv0Var.f(cs0Var2);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                objO = new rf(cs0Var2, i4);
                nv0Var.j0(objO);
            }
            bq1 bq1VarZ = vm1.z(bq1VarA, (ns0) objO);
            int i5 = (i3 & 7168) | 432;
            qy qyVarA = oy.a(new jj(2.0f, false, new c(3)), f5.t, nv0Var, 54);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarZ);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, qyVarA);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            d00Var.e(ry.a, nv0Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            nv0Var.p(true);
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new v4(ep2Var, cs0Var, bq1Var2, d00Var, i);
        }
    }

    public static final void b(final cs0 cs0Var, final ns0 ns0Var, final gl glVar, final int i, final bq1 bq1Var, final d00 d00Var, nv0 nv0Var, final int i2) {
        cs0Var.getClass();
        ns0Var.getClass();
        nv0Var.b0(-1907786232);
        int i3 = (nv0Var.h(cs0Var) ? 4 : 2) | i2 | (nv0Var.h(ns0Var) ? 32 : 16) | (nv0Var.f(glVar) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i3 |= nv0Var.d(i) ? 2048 : 1024;
        }
        if (!nv0Var.R(i3 & 1, (74899 & i3) != 74898)) {
            nv0Var.U();
        } else {
            if (i <= 0) {
                c.p("tabsCount must be greater than zero");
                return;
            }
            boolean zJ = pq.J(nv0Var);
            boolean z = !zJ;
            long jC = !zJ ? vp.c(4278225151L) : vp.c(4278227455L);
            long jB = !zJ ? wx.b(0.4f, vp.c(4294638330L)) : wx.b(0.4f, vp.c(4279374354L));
            if (glVar == null) {
                nv0Var.a0(443233274);
                bq1 bq1VarT = gq.t(gv3.v(j43.c(j43.e(bq1Var, 64.0f), 1.0f), jB, new wr()), new wr());
                dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var, 48);
                int iHashCode = Long.hashCode(nv0Var.T);
                n52 n52VarL = nv0Var.l();
                bq1 bq1VarM = lr.M(nv0Var, bq1VarT);
                w10.c.getClass();
                nv0Var.d0();
                if (nv0Var.S) {
                    nv0Var.k(tb1.Y);
                } else {
                    nv0Var.m0();
                }
                y02.F(f5.E, nv0Var, dp2VarA);
                y02.F(f5.D, nv0Var, n52VarL);
                y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                y02.C(nv0Var);
                y02.F(f5.C, nv0Var, bq1VarM);
                d00Var.e(fp2.a, nv0Var, 54);
                nv0Var.p(true);
                nv0Var.p(false);
                xj2 xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    final int i4 = 0;
                    xj2VarT.d = new rs0() { // from class: ug1
                        @Override // defpackage.rs0
                        public final Object f(Object obj, Object obj2) {
                            int i5 = i4;
                            dm3 dm3Var = dm3.a;
                            int i6 = i2;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = jo3.y(i6 | 1);
                                    fh1.b(cs0Var, ns0Var, glVar, i, bq1Var, d00Var, (nv0) obj, iY);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY2 = jo3.y(i6 | 1);
                                    fh1.b(cs0Var, ns0Var, glVar, i, bq1Var, d00Var, (nv0) obj, iY2);
                                    break;
                            }
                            return dm3Var;
                        }
                    };
                    return;
                }
                return;
            }
            nv0Var.a0(443540794);
            nv0Var.p(false);
            c(cs0Var, ns0Var, glVar, i, wx.f, jC, z, bq1Var, d00Var, nv0Var, (i3 & 7168) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | 113246208);
        }
        xj2 xj2VarT2 = nv0Var.t();
        if (xj2VarT2 != null) {
            final int i5 = 1;
            xj2VarT2.d = new rs0() { // from class: ug1
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    int i52 = i5;
                    dm3 dm3Var = dm3.a;
                    int i6 = i2;
                    switch (i52) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iY = jo3.y(i6 | 1);
                            fh1.b(cs0Var, ns0Var, glVar, i, bq1Var, d00Var, (nv0) obj, iY);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iY2 = jo3.y(i6 | 1);
                            fh1.b(cs0Var, ns0Var, glVar, i, bq1Var, d00Var, (nv0) obj, iY2);
                            break;
                    }
                    return dm3Var;
                }
            };
        }
    }

    public static final void c(final cs0 cs0Var, final ns0 ns0Var, final gl glVar, final int i, final long j, final long j2, final boolean z, final bq1 bq1Var, final d00 d00Var, nv0 nv0Var, final int i2) {
        int i3;
        ns0 ns0Var2;
        int i4;
        final long j3;
        final boolean z2;
        nv0Var.b0(-1854325770);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.h(cs0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            ns0Var2 = ns0Var;
            i3 |= nv0Var.h(ns0Var2) ? 32 : 16;
        } else {
            ns0Var2 = ns0Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? nv0Var.f(glVar) : nv0Var.h(glVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 = i;
            i3 |= nv0Var.d(i4) ? 2048 : 1024;
        } else {
            i4 = i;
        }
        if ((i2 & 24576) == 0) {
            j3 = j;
            i3 |= nv0Var.e(j3) ? 16384 : 8192;
        } else {
            j3 = j;
        }
        if ((196608 & i2) == 0) {
            i3 |= nv0Var.e(j2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            z2 = z;
            i3 |= nv0Var.g(z2) ? 1048576 : 524288;
        } else {
            z2 = z;
        }
        if ((12582912 & i2) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= nv0Var.h(d00Var) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (nv0Var.R(i5 & 1, (38347923 & i5) != 38347922)) {
            final ta1 ta1VarH = rn.H(null, nv0Var, 3);
            final ns0 ns0Var3 = ns0Var2;
            final int i6 = i4;
            s51.c(bq1Var, f5.j, gq.N(-2066695220, new ss0() { // from class: xg1
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.ss0
                public final Object e(Object obj, Object obj2, Object obj3) {
                    float f;
                    zj zjVar;
                    final boolean z3;
                    int i7;
                    x50 x50Var;
                    Object uyVar;
                    ed edVar;
                    final float f2;
                    final boolean z4;
                    int i8;
                    os1 os1Var;
                    a42 a42Var;
                    final z60 z60Var;
                    a51 a51Var;
                    final z60 z60Var2;
                    final boolean z5;
                    boolean z6;
                    Object obj4;
                    lo loVar = (lo) obj;
                    nv0 nv0Var2 = (nv0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    loVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= nv0Var2.f(loVar) ? 4 : 2;
                    }
                    byte b = 0;
                    boolean zR = nv0Var2.R(iIntValue & 1, (iIntValue & 19) != 18);
                    dm3 dm3Var = dm3.a;
                    if (!zR) {
                        nv0Var2.U();
                        return dm3Var;
                    }
                    ua0 ua0Var = (ua0) nv0Var2.j(s20.h);
                    float fI = m30.i(loVar.b) - ua0Var.T(8.0f);
                    final int i9 = i6;
                    float f3 = i9;
                    final float f4 = fI / f3;
                    Object objO = nv0Var2.O();
                    zj zjVar2 = c20.a;
                    Object obj5 = objO;
                    if (objO == zjVar2) {
                        ed edVarA = gv3.a(0.0f, 0.01f);
                        nv0Var2.j0(edVarA);
                        obj5 = edVarA;
                    }
                    final ed edVar2 = (ed) obj5;
                    boolean zF = nv0Var2.f(ua0Var);
                    Object objO2 = nv0Var2.O();
                    Object obj6 = objO2;
                    if (zF || objO2 == zjVar2) {
                        cb0 cb0VarJ = b32.j(new ok(edVar2, loVar, ua0Var, 10));
                        nv0Var2.j0(cb0VarJ);
                        obj6 = cb0VarJ;
                    }
                    final e93 e93Var = (e93) obj6;
                    boolean z7 = nv0Var2.j(s20.n) == bb1.f;
                    Object objO3 = nv0Var2.O();
                    Object obj7 = objO3;
                    if (objO3 == zjVar2) {
                        x50 x50VarA = rn.A(nv0Var2);
                        nv0Var2.j0(x50VarA);
                        obj7 = x50VarA;
                    }
                    final x50 x50Var2 = (x50) obj7;
                    Object objO4 = nv0Var2.O();
                    cs0 cs0Var2 = cs0Var;
                    Object obj8 = objO4;
                    if (objO4 == zjVar2) {
                        int iIntValue2 = ((Number) cs0Var2.a()).intValue();
                        int i10 = i9 - 1;
                        if (iIntValue2 < 0) {
                            iIntValue2 = 0;
                        }
                        if (iIntValue2 <= i10) {
                            i10 = iIntValue2;
                        }
                        a42 a42Var2 = new a42(i10);
                        nv0Var2.j0(a42Var2);
                        obj8 = a42Var2;
                    }
                    a42 a42Var3 = (a42) obj8;
                    boolean zF2 = nv0Var2.f(x50Var2);
                    Object objO5 = nv0Var2.O();
                    if (zF2 || objO5 == zjVar2) {
                        float fIntValue = ((Number) cs0Var2.a()).intValue();
                        ex exVar = new ex(0.0f, i9 - 1);
                        z00 z00Var = new z00(24, b);
                        b5 b5Var = new b5(i9, x50Var2, a42Var3, edVar2);
                        f = f3;
                        zjVar = zjVar2;
                        z3 = z7;
                        i7 = i9;
                        objO5 = new z60(x50Var2, fIntValue, exVar, 0.001f, 1.3928572f, z00Var, b5Var, new ss0() { // from class: vg1
                            @Override // defpackage.ss0
                            public final Object e(Object obj9, Object obj10, Object obj11) {
                                z60 z60Var3 = (z60) obj9;
                                gy1 gy1Var = (gy1) obj11;
                                z60Var3.getClass();
                                float fIntBitsToFloat = ((Float.intBitsToFloat((int) (gy1Var.a >> 32)) / f4) * (z3 ? 1.0f : -1.0f)) + z60Var3.d();
                                float f5 = i9 - 1;
                                if (fIntBitsToFloat < 0.0f) {
                                    fIntBitsToFloat = 0.0f;
                                }
                                if (fIntBitsToFloat <= f5) {
                                    f5 = fIntBitsToFloat;
                                }
                                z60Var3.h(f5);
                                cl3.t(x50Var2, null, new hd1(edVar2, gy1Var, null, 2), 3);
                                return dm3.a;
                            }
                        });
                        x50Var = x50Var2;
                        nv0Var2.j0(objO5);
                    } else {
                        f = f3;
                        i7 = i9;
                        zjVar = zjVar2;
                        x50Var = x50Var2;
                        z3 = z7;
                    }
                    z60 z60Var3 = (z60) objO5;
                    os1 os1VarZ = b32.z(cs0Var2, nv0Var2);
                    boolean zF3 = nv0Var2.f(os1VarZ) | nv0Var2.d(i7) | nv0Var2.h(z60Var3);
                    Object objO6 = nv0Var2.O();
                    if (zF3 || objO6 == zjVar) {
                        edVar = edVar2;
                        f2 = f4;
                        z4 = z3;
                        i8 = i7;
                        os1Var = os1VarZ;
                        a42Var = a42Var3;
                        uyVar = new uy(os1Var, i8, z60Var3, a42Var, null, 1);
                        z60Var = z60Var3;
                        nv0Var2.j0(uyVar);
                    } else {
                        uyVar = objO6;
                        z4 = z3;
                        edVar = edVar2;
                        f2 = f4;
                        i8 = i7;
                        os1Var = os1VarZ;
                        a42Var = a42Var3;
                        z60Var = z60Var3;
                    }
                    rn.l((rs0) uyVar, nv0Var2, dm3Var);
                    boolean zF4 = nv0Var2.f(os1Var) | nv0Var2.d(i8);
                    ns0 ns0Var4 = ns0Var3;
                    boolean zF5 = zF4 | nv0Var2.f(ns0Var4);
                    Object objO7 = nv0Var2.O();
                    if (zF5 || objO7 == zjVar) {
                        a42 a42Var4 = a42Var;
                        uy uyVar2 = new uy(a42Var4, i8, ns0Var4, os1Var, null, 2);
                        a42Var = a42Var4;
                        nv0Var2.j0(uyVar2);
                        objO7 = uyVar2;
                    }
                    rn.l((rs0) objO7, nv0Var2, dm3Var);
                    boolean zF6 = nv0Var2.f(x50Var);
                    Object objO8 = nv0Var2.O();
                    Object obj9 = objO8;
                    if (zF6 || objO8 == zjVar) {
                        a51 a51Var2 = new a51(x50Var, new rs0() { // from class: wg1
                            @Override // defpackage.rs0
                            public final Object f(Object obj10, Object obj11) {
                                float fIntBitsToFloat;
                                float fD;
                                h43 h43Var = (h43) obj10;
                                boolean z8 = z4;
                                z60 z60Var4 = z60Var;
                                float f5 = f2;
                                e93 e93Var2 = e93Var;
                                if (z8) {
                                    fIntBitsToFloat = (z60Var4.e() + 0.5f) * f5;
                                    fD = fh1.d(e93Var2);
                                } else {
                                    fIntBitsToFloat = Float.intBitsToFloat((int) (h43Var.a >> 32)) - ((z60Var4.e() + 0.5f) * f5);
                                    fD = fh1.d(e93Var2);
                                }
                                float f6 = fD + fIntBitsToFloat;
                                return new gy1((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (h43Var.a & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
                            }
                        });
                        nv0Var2.j0(a51Var2);
                        obj9 = a51Var2;
                    }
                    a51 a51Var3 = (a51) obj9;
                    Object[] objArr = {z60Var, Float.valueOf(f2), Boolean.valueOf(z4)};
                    boolean zH = nv0Var2.h(z60Var) | nv0Var2.d(i8) | nv0Var2.h(x50Var) | nv0Var2.h(edVar) | nv0Var2.c(f2) | nv0Var2.g(z4);
                    Object objO9 = nv0Var2.O();
                    if (zH || objO9 == zjVar) {
                        z60 z60Var4 = z60Var;
                        boolean z8 = z4;
                        a51Var = a51Var3;
                        dh1 dh1Var = new dh1(z60Var4, i8, x50Var, a42Var, edVar, f2, z8);
                        z60Var2 = z60Var4;
                        z5 = z8;
                        nv0Var2.j0(dh1Var);
                        objO9 = dh1Var;
                    } else {
                        z60Var2 = z60Var;
                        z5 = z4;
                        a51Var = a51Var3;
                    }
                    za2 za2Var = ob3.a;
                    bq1 bq1VarC = j43.c(j43.e(new nb3(null, null, objArr, (PointerInputEventHandler) objO9, 3), 64.0f), 1.0f);
                    cn1 cn1VarD = eo.d(f5.j, false);
                    int iHashCode = Long.hashCode(nv0Var2.T);
                    n52 n52VarL = nv0Var2.l();
                    bq1 bq1VarM = lr.M(nv0Var2, bq1VarC);
                    w10.c.getClass();
                    nv0Var2.d0();
                    boolean z9 = nv0Var2.S;
                    x91 x91Var = tb1.Y;
                    if (z9) {
                        nv0Var2.k(x91Var);
                    } else {
                        nv0Var2.m0();
                    }
                    z00 z00Var2 = f5.E;
                    y02.F(z00Var2, nv0Var2, cn1VarD);
                    z00 z00Var3 = f5.D;
                    y02.F(z00Var3, nv0Var2, n52VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z00 z00Var4 = f5.F;
                    y02.F(z00Var4, nv0Var2, numValueOf);
                    y02.C(nv0Var2);
                    z00 z00Var5 = f5.C;
                    y02.F(z00Var5, nv0Var2, bq1VarM);
                    boolean zF7 = nv0Var2.f(e93Var);
                    Object objO10 = nv0Var2.O();
                    Object obj10 = objO10;
                    if (zF7 || objO10 == zjVar) {
                        m90 m90Var = new m90(e93Var, 1);
                        nv0Var2.j0(m90Var);
                        obj10 = m90Var;
                    }
                    yp1 yp1Var = yp1.a;
                    bq1 bq1VarZ = vm1.z(yp1Var, (ns0) obj10);
                    Object objO11 = nv0Var2.O();
                    Object obj11 = objO11;
                    if (objO11 == zjVar) {
                        x91 x91Var2 = new x91(5);
                        nv0Var2.j0(x91Var2);
                        obj11 = x91Var2;
                    }
                    cs0 cs0Var3 = (cs0) obj11;
                    Object objO12 = nv0Var2.O();
                    Object obj12 = objO12;
                    if (objO12 == zjVar) {
                        n20 n20Var = new n20(26);
                        nv0Var2.j0(n20Var);
                        obj12 = n20Var;
                    }
                    ns0 ns0Var5 = (ns0) obj12;
                    boolean zH2 = nv0Var2.h(z60Var2);
                    Object objO13 = nv0Var2.O();
                    Object obj13 = objO13;
                    if (zH2 || objO13 == zjVar) {
                        t60 t60Var = new t60(z60Var2, 5);
                        nv0Var2.j0(t60Var);
                        obj13 = t60Var;
                    }
                    ns0 ns0Var6 = (ns0) obj13;
                    final long j4 = j3;
                    boolean zE = nv0Var2.e(j4);
                    Object objO14 = nv0Var2.O();
                    final float f5 = f2;
                    int i11 = 3;
                    Object obj14 = objO14;
                    if (zE || objO14 == zjVar) {
                        i8 i8Var = new i8(i11, j4);
                        nv0Var2.j0(i8Var);
                        obj14 = i8Var;
                    }
                    ns0 ns0Var7 = (ns0) obj14;
                    final gl glVar2 = glVar;
                    bq1 bq1VarJ = f80.J(j43.c(j43.e(cl3.m(bq1VarZ, glVar2, cs0Var3, ns0Var5, null, null, null, ns0Var6, ns0Var7, 3000).d(a51Var.g), 64.0f), 1.0f), 4.0f);
                    final a51 a51Var4 = a51Var;
                    dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var2, 48);
                    int iHashCode2 = Long.hashCode(nv0Var2.T);
                    n52 n52VarL2 = nv0Var2.l();
                    bq1 bq1VarM2 = lr.M(nv0Var2, bq1VarJ);
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(x91Var);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(z00Var2, nv0Var2, dp2VarA);
                    y02.F(z00Var3, nv0Var2, n52VarL2);
                    nc2.r(iHashCode2, nv0Var2, z00Var4, nv0Var2);
                    y02.F(z00Var5, nv0Var2, bq1VarM2);
                    fp2 fp2Var = fp2.a;
                    int i12 = 6;
                    final d00 d00Var2 = d00Var;
                    d00Var2.e(fp2Var, nv0Var2, 6);
                    nv0Var2.p(true);
                    r93 r93Var = fh1.a;
                    boolean zH3 = nv0Var2.h(z60Var2);
                    Object objO15 = nv0Var2.O();
                    if (zH3 || objO15 == zjVar) {
                        objO15 = new u60(z60Var2, i12);
                        nv0Var2.j0(objO15);
                    }
                    he2 he2VarA = r93Var.a((cs0) objO15);
                    final ta1 ta1Var = ta1VarH;
                    final long j5 = j2;
                    final z60 z60Var5 = z60Var2;
                    vr.c(he2VarA, gq.N(-784795374, new rs0() { // from class: sg1
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // defpackage.rs0
                        public final Object f(Object obj15, Object obj16) {
                            nv0 nv0Var3 = (nv0) obj15;
                            int iIntValue3 = ((Integer) obj16).intValue();
                            int i13 = 2;
                            if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                Object objO16 = nv0Var3.O();
                                zj zjVar3 = c20.a;
                                if (objO16 == zjVar3) {
                                    objO16 = new n20(27);
                                    nv0Var3.j0(objO16);
                                }
                                AtomicInteger atomicInteger = su2.a;
                                bq1 bq1VarH = f80.H(w7.B(new pu((ns0) objO16), 0.0f), ta1Var);
                                e93 e93Var2 = e93Var;
                                boolean zF8 = nv0Var3.f(e93Var2);
                                Object objO17 = nv0Var3.O();
                                if (zF8 || objO17 == zjVar3) {
                                    objO17 = new m90(e93Var2, i13);
                                    nv0Var3.j0(objO17);
                                }
                                bq1 bq1VarZ2 = vm1.z(bq1VarH, (ns0) objO17);
                                Object objO18 = nv0Var3.O();
                                int i14 = 6;
                                if (objO18 == zjVar3) {
                                    objO18 = new x91(6);
                                    nv0Var3.j0(objO18);
                                }
                                cs0 cs0Var4 = (cs0) objO18;
                                z60 z60Var6 = z60Var5;
                                boolean zH4 = nv0Var3.h(z60Var6);
                                Object objO19 = nv0Var3.O();
                                if (zH4 || objO19 == zjVar3) {
                                    objO19 = new t60(z60Var6, i14);
                                    nv0Var3.j0(objO19);
                                }
                                ns0 ns0Var8 = (ns0) objO19;
                                boolean zH5 = nv0Var3.h(z60Var6);
                                Object objO20 = nv0Var3.O();
                                int i15 = 5;
                                if (zH5 || objO20 == zjVar3) {
                                    objO20 = new u60(z60Var6, i15);
                                    nv0Var3.j0(objO20);
                                }
                                cs0 cs0Var5 = (cs0) objO20;
                                long j6 = j4;
                                boolean zE2 = nv0Var3.e(j6);
                                Object objO21 = nv0Var3.O();
                                if (zE2 || objO21 == zjVar3) {
                                    objO21 = new i8(4, j6);
                                    nv0Var3.j0(objO21);
                                }
                                bq1 bq1VarL = f80.L(j43.c(j43.e(cl3.m(bq1VarZ2, glVar2, cs0Var4, ns0Var8, cs0Var5, null, null, null, (ns0) objO21, 3056).d(a51Var4.g), 56.0f), 1.0f), 4.0f, 0.0f, 2);
                                xm xmVar = new xm(5, j5);
                                long j7 = wj3.b;
                                wy0 wy0Var = cl3.q0;
                                long j8 = vw0.a;
                                bq1 bq1VarD = bq1VarL.d(new rw0(1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, j7, wy0Var, false, null, j8, j8, 0, 3, xmVar, wa1.a));
                                dp2 dp2VarA2 = cp2.a(n92.b, f5.q, nv0Var3, 48);
                                int iHashCode3 = Long.hashCode(nv0Var3.T);
                                n52 n52VarL3 = nv0Var3.l();
                                bq1 bq1VarM3 = lr.M(nv0Var3, bq1VarD);
                                w10.c.getClass();
                                nv0Var3.d0();
                                if (nv0Var3.S) {
                                    nv0Var3.k(tb1.Y);
                                } else {
                                    nv0Var3.m0();
                                }
                                y02.F(f5.E, nv0Var3, dp2VarA2);
                                y02.F(f5.D, nv0Var3, n52VarL3);
                                y02.F(f5.F, nv0Var3, Integer.valueOf(iHashCode3));
                                y02.C(nv0Var3);
                                y02.F(f5.C, nv0Var3, bq1VarM3);
                                d00Var2.e(fp2.a, nv0Var3, 6);
                                nv0Var3.p(true);
                            } else {
                                nv0Var3.U();
                            }
                            return dm3.a;
                        }
                    }, nv0Var2), nv0Var2, 56);
                    bq1 bq1VarL = f80.L(yp1Var, 4.0f, 0.0f, 2);
                    boolean zG = nv0Var2.g(z5) | nv0Var2.h(z60Var2) | nv0Var2.c(f5) | nv0Var2.f(e93Var);
                    Object objO16 = nv0Var2.O();
                    Object obj15 = objO16;
                    if (zG || objO16 == zjVar) {
                        ns0 ns0Var8 = new ns0() { // from class: tg1
                            @Override // defpackage.ns0
                            public final Object h(Object obj16) {
                                float fIntBitsToFloat;
                                float fD;
                                uw0 uw0Var = (uw0) obj16;
                                uw0Var.getClass();
                                boolean z10 = z5;
                                z60 z60Var6 = z60Var2;
                                float f6 = f5;
                                e93 e93Var2 = e93Var;
                                if (z10) {
                                    fIntBitsToFloat = z60Var6.e() * f6;
                                    fD = fh1.d(e93Var2);
                                } else {
                                    fIntBitsToFloat = Float.intBitsToFloat((int) (uw0Var.a() >> 32)) - ((z60Var6.e() + 1.0f) * f6);
                                    fD = fh1.d(e93Var2);
                                }
                                uw0Var.p(fD + fIntBitsToFloat);
                                return dm3.a;
                            }
                        };
                        nv0Var2.j0(ns0Var8);
                        obj15 = ns0Var8;
                    }
                    bq1 bq1VarD = vm1.z(bq1VarL, (ns0) obj15).d(a51Var4.h);
                    wy wyVarK = br.K(glVar2, ta1Var, nv0Var2, 0);
                    Object objO17 = nv0Var2.O();
                    Object obj16 = objO17;
                    if (objO17 == zjVar) {
                        x91 x91Var3 = new x91(4);
                        nv0Var2.j0(x91Var3);
                        obj16 = x91Var3;
                    }
                    cs0 cs0Var4 = (cs0) obj16;
                    boolean zH4 = nv0Var2.h(z60Var2);
                    Object objO18 = nv0Var2.O();
                    Object obj17 = objO18;
                    if (zH4 || objO18 == zjVar) {
                        t60 t60Var2 = new t60(z60Var2, 3);
                        nv0Var2.j0(t60Var2);
                        obj17 = t60Var2;
                    }
                    ns0 ns0Var9 = (ns0) obj17;
                    boolean zH5 = nv0Var2.h(z60Var2);
                    Object objO19 = nv0Var2.O();
                    Object obj18 = objO19;
                    if (zH5 || objO19 == zjVar) {
                        u60 u60Var = new u60(z60Var2, 2);
                        nv0Var2.j0(u60Var);
                        obj18 = u60Var;
                    }
                    cs0 cs0Var5 = (cs0) obj18;
                    boolean zH6 = nv0Var2.h(z60Var2);
                    Object objO20 = nv0Var2.O();
                    Object obj19 = objO20;
                    if (zH6 || objO20 == zjVar) {
                        u60 u60Var2 = new u60(z60Var2, 3);
                        nv0Var2.j0(u60Var2);
                        obj19 = u60Var2;
                    }
                    cs0 cs0Var6 = (cs0) obj19;
                    boolean zH7 = nv0Var2.h(z60Var2);
                    Object objO21 = nv0Var2.O();
                    Object obj20 = objO21;
                    if (zH7 || objO21 == zjVar) {
                        u60 u60Var3 = new u60(z60Var2, 4);
                        nv0Var2.j0(u60Var3);
                        obj20 = u60Var3;
                    }
                    cs0 cs0Var7 = (cs0) obj20;
                    boolean zH8 = nv0Var2.h(z60Var2);
                    Object objO22 = nv0Var2.O();
                    Object obj21 = objO22;
                    if (zH8 || objO22 == zjVar) {
                        t60 t60Var3 = new t60(z60Var2, 4);
                        nv0Var2.j0(t60Var3);
                        obj21 = t60Var3;
                    }
                    ns0 ns0Var10 = (ns0) obj21;
                    boolean zH9 = nv0Var2.h(z60Var2);
                    boolean z10 = z2;
                    boolean zG2 = zH9 | nv0Var2.g(z10);
                    Object objO23 = nv0Var2.O();
                    if (zG2 || objO23 == zjVar) {
                        z6 = true;
                        wk wkVar = new wk(true ? 1 : 0, z60Var2, z10);
                        nv0Var2.j0(wkVar);
                        obj4 = wkVar;
                    } else {
                        z6 = true;
                        obj4 = objO23;
                    }
                    eo.a(j43.c(j43.e(cl3.m(bq1VarD, wyVarK, cs0Var4, ns0Var9, cs0Var5, cs0Var6, cs0Var7, ns0Var10, (ns0) obj4, 2944), 56.0f), 1.0f / f), nv0Var2, 0);
                    nv0Var2.p(z6);
                    return dm3Var;
                }
            }, nv0Var), nv0Var, ((i5 >> 21) & 14) | 3120, 4);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: yg1
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fh1.c(cs0Var, ns0Var, glVar, i, j, j2, z, bq1Var, d00Var, (nv0) obj, jo3.y(i2 | 1));
                    return dm3.a;
                }
            };
        }
    }

    public static final float d(e93 e93Var) {
        return ((Number) e93Var.getValue()).floatValue();
    }

    public static final void e(z60 z60Var, int i, x50 x50Var, a42 a42Var, ed edVar) {
        int iRound = Math.round(z60Var.d());
        int i2 = 1;
        int i3 = i - 1;
        if (iRound < 0) {
            iRound = 0;
        }
        if (iRound <= i3) {
            i3 = iRound;
        }
        a42Var.h(i3);
        z60Var.a(i3);
        cl3.t(x50Var, null, new ah1(edVar, null, i2), 3);
        z60Var.g();
    }
}
