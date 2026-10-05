package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class de1 implements cd1 {
    public final /* synthetic */ ie1 a;
    public final /* synthetic */ x12 b;
    public final /* synthetic */ cs0 c;
    public final /* synthetic */ kj d;
    public final /* synthetic */ x50 e;
    public final /* synthetic */ ak2 f;
    public final /* synthetic */ g5 g;

    public de1(ie1 ie1Var, x12 x12Var, y61 y61Var, kj kjVar, x50 x50Var, ow0 ow0Var, ak2 ak2Var, g5 g5Var) {
        this.a = ie1Var;
        this.b = x12Var;
        this.c = y61Var;
        this.d = kjVar;
        this.e = x50Var;
        this.f = ak2Var;
        this.g = g5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:324:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x081e A[LOOP:19: B:360:0x081c->B:361:0x081e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0181  */
    @Override // defpackage.cd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dn1 a(dd1 dd1Var, long j) throws Throwable {
        int i;
        ie1 ie1Var;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5;
        int iA;
        int i6;
        float f;
        float f2;
        float f3;
        int i7;
        int i8;
        ArrayList arrayList;
        int i9;
        int i10;
        List arrayList2;
        int i11;
        mj mjVar;
        int i12;
        int i13;
        int i14;
        List list;
        Integer numValueOf;
        Integer numValueOf2;
        int i15;
        int i16;
        List list2;
        int size;
        int i17;
        ee1 ee1Var;
        sa3 sa3Var;
        int i18;
        nr1 nr1Var;
        int i19;
        fe1 fe1Var;
        long j3;
        int iB;
        int i20;
        Object obj;
        int i21;
        int i22;
        int i23;
        int iMax;
        int i24;
        int iC;
        int i25;
        int i26;
        boolean z;
        boolean zB = p41.b(0L, 0L);
        sa3 sa3Var2 = dd1Var.g;
        ie1 ie1Var2 = this.a;
        ie1Var2.s.getValue();
        boolean z2 = ie1Var2.b || sa3Var2.M();
        t02 t02Var = t02.f;
        gq.s(j, t02Var);
        bb1 layoutDirection = sa3Var2.getLayoutDirection();
        x12 x12Var = this.b;
        int iP0 = sa3Var2.p0(x12Var.a(layoutDirection));
        int iP02 = sa3Var2.p0(x12Var.b(sa3Var2.getLayoutDirection()));
        int iP03 = sa3Var2.p0(x12Var.d());
        int iP04 = sa3Var2.p0(x12Var.c()) + iP03;
        int i27 = iP02 + iP0;
        int i28 = iP04 - iP03;
        long jI = n30.i(j, -i27, -iP04);
        be1 be1Var = (be1) this.c.a();
        nc1 nc1Var = be1Var.c;
        int i29 = m30.i(jI);
        int iH = m30.h(jI);
        nc1Var.a.h(i29);
        nc1Var.b.h(iH);
        kj kjVar = this.d;
        if (kjVar == null) {
            throw nc2.y("null verticalArrangement when isVertical == true");
        }
        int iP05 = sa3Var2.p0(kjVar.a());
        int iA2 = be1Var.a();
        int iH2 = m30.h(j) - iP04;
        int i30 = iP03;
        ce1 ce1Var = new ce1(jI, be1Var, dd1Var, iA2, iP05, this.g, i30, i28, (((long) iP0) << 32) | (((long) iP03) & 4294967295L), this.a);
        t63 t63VarL = jo3.l();
        ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
        t63 t63VarS = jo3.s(t63VarL);
        try {
            int iG = ie1Var2.g();
            ot otVar = ie1Var2.e;
            int iW = lq.w(iG, be1Var, otVar.d);
            if (iG != iW) {
                i = iP05;
                ((a42) otVar.b).h(iW);
                ((ed1) otVar.e).a(iG);
            } else {
                i = iP05;
            }
            int iH3 = ie1Var2.h();
            jo3.v(t63VarL, t63VarS, ns0VarE);
            nr1 nr1VarS = vr.s(be1Var, ie1Var2.r, ie1Var2.o);
            float fFloatValue = (sa3Var2.M() || !z2) ? ie1Var2.h : ((Number) ((pe) ie1Var2.w.h).g.getValue()).floatValue();
            wc1 wc1Var = ie1Var2.n;
            boolean zM = sa3Var2.M();
            os1 os1Var = ie1Var2.v;
            if (i30 < 0) {
                p21.a("invalid beforeContentPadding");
            }
            if (i28 < 0) {
                p21.a("invalid afterContentPadding");
            }
            oi0 oi0Var = oi0.f;
            be1 be1Var2 = ce1Var.b;
            x50 x50Var = this.e;
            ni0 ni0Var = ni0.f;
            if (iA2 <= 0) {
                int iK = m30.k(jI);
                int iJ = m30.j(jI);
                wc1Var.b(iK, iJ, new ArrayList(), be1Var2.d, ce1Var, zM, z2, 0, 0);
                if (!zM) {
                    wc1Var.a();
                    if (zB) {
                        z = false;
                    } else {
                        z = false;
                        iK = n30.g(0, jI);
                        iJ = n30.f(0, jI);
                    }
                    sa3Var = sa3Var2;
                    ie1Var = ie1Var2;
                    ee1Var = new ee1(null, 0, false, 0.0f, sa3Var2.I0(n30.g(iK + i27, j), n30.f(iJ + iP04, j), oi0Var, new u0(19)), 0.0f, false, x50Var, dd1Var, ce1Var.d, 0, ni0Var, -i30, iH2 + i28, 0, t02Var, i28, i);
                }
            } else {
                float f4 = fFloatValue;
                ie1Var = ie1Var2;
                int i31 = iH3;
                if (iW >= iA2) {
                    iW = iA2 - 1;
                    i31 = 0;
                }
                int iRound = Math.round(f4);
                int i32 = i31 - iRound;
                if (iW == 0 && i32 < 0) {
                    iRound += i32;
                    i32 = 0;
                }
                int i33 = iW;
                mj mjVar2 = new mj();
                int i34 = -i30;
                int i35 = i34 + (i < 0 ? i : 0);
                int iA3 = i32 + i35;
                int iMax2 = 0;
                while (true) {
                    j2 = ce1Var.d;
                    if (iA3 >= 0 || i33 <= 0) {
                        break;
                    }
                    int i36 = i34;
                    int i37 = i33 - 1;
                    fe1 fe1VarA = ce1Var.a(i37, j2);
                    mjVar2.add(0, fe1VarA);
                    iMax2 = Math.max(iMax2, fe1VarA.n);
                    iA3 += fe1VarA.a();
                    i33 = i37;
                    i34 = i36;
                }
                int i38 = i34;
                if (iA3 < i35) {
                    iRound -= i35 - iA3;
                    iA3 = i35;
                }
                int i39 = iRound;
                int i40 = iA3 - i35;
                int i41 = iH2 + i28;
                int i42 = i41 >= 0 ? i41 : 0;
                int i43 = iMax2;
                int iA4 = i40;
                int i44 = i33;
                boolean z3 = false;
                int i45 = -i40;
                int i46 = 0;
                while (i46 < mjVar2.h) {
                    if (i45 >= i42) {
                        mjVar2.b(i46);
                        z3 = true;
                    } else {
                        i44++;
                        int iA5 = ((fe1) mjVar2.get(i46)).a() + i45;
                        i46++;
                        i45 = iA5;
                    }
                }
                int iMax3 = i43;
                boolean z4 = z3;
                int i47 = i44;
                while (i47 < iA2 && (i45 < i42 || i45 <= 0 || mjVar2.isEmpty())) {
                    int i48 = i42;
                    fe1 fe1VarA2 = ce1Var.a(i47, j2);
                    int iA6 = fe1VarA2.a() + i45;
                    if (iA6 <= i35) {
                        i26 = iA6;
                        if (i47 != iA2 - 1) {
                            iA4 -= fe1VarA2.a();
                            i33 = i47 + 1;
                            z4 = true;
                        }
                        i47++;
                        i42 = i48;
                        i45 = i26;
                    } else {
                        i26 = iA6;
                    }
                    iMax3 = Math.max(iMax3, fe1VarA2.n);
                    mjVar2.addLast(fe1VarA2);
                    i47++;
                    i42 = i48;
                    i45 = i26;
                }
                if (i45 < iH2) {
                    int i49 = iH2 - i45;
                    int i50 = i45 + i49;
                    iA = iA4 - i49;
                    while (iA < i30 && i33 > 0) {
                        int i51 = i50;
                        int i52 = i33 - 1;
                        int i53 = i30;
                        fe1 fe1VarA3 = ce1Var.a(i52, j2);
                        i33 = i52;
                        mjVar2.add(0, fe1VarA3);
                        iMax3 = Math.max(iMax3, fe1VarA3.n);
                        iA += fe1VarA3.a();
                        i50 = i51;
                        i30 = i53;
                    }
                    int i54 = i50;
                    i2 = i30;
                    i3 = i39;
                    int i55 = i3 + i49;
                    if (iA < 0) {
                        i45 = i54 + iA;
                        i5 = i33;
                        i4 = i55 + iA;
                        iA = 0;
                    } else {
                        i45 = i54;
                        i5 = i33;
                        i4 = i55;
                    }
                } else {
                    i2 = i30;
                    i3 = i39;
                    i4 = i3;
                    i5 = i33;
                    iA = iA4;
                }
                int i56 = iMax3;
                if (Integer.signum(Math.round(f4)) != Integer.signum(i4) || Math.abs(Math.round(f4)) < Math.abs(i4)) {
                    i6 = i4;
                    f = f4;
                } else {
                    i6 = i4;
                    f = i6;
                }
                float f5 = f4 - f;
                float f6 = 0.0f;
                if (zM && i6 > i3 && f5 <= 0.0f) {
                    f6 = (i6 - i3) + f5;
                }
                float f7 = f6;
                if (iA < 0) {
                    p21.a("negative currentFirstItemScrollOffset");
                }
                int i57 = -iA;
                fe1 fe1Var2 = (fe1) mjVar2.first();
                if (i2 > 0 || i < 0) {
                    f2 = f7;
                    int iA7 = mjVar2.a();
                    f3 = f;
                    int i58 = iA;
                    int i59 = 0;
                    while (i59 < iA7) {
                        int i60 = iA7;
                        int iA8 = ((fe1) mjVar2.get(i59)).a();
                        if (i58 == 0 || iA8 > i58) {
                            break;
                        }
                        i7 = 1;
                        if (i59 == mjVar2.a() - 1) {
                            break;
                        }
                        i58 -= iA8;
                        i59++;
                        fe1Var2 = (fe1) mjVar2.get(i59);
                        iA7 = i60;
                    }
                    i7 = 1;
                    iA = i58;
                } else {
                    f2 = f7;
                    f3 = f;
                    i7 = 1;
                }
                fe1 fe1Var3 = fe1Var2;
                int iMax4 = Math.max(0, i5);
                int i61 = i5 - 1;
                if (iMax4 <= i61) {
                    arrayList = null;
                    while (true) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        i8 = iA;
                        arrayList.add(ce1Var.a(i61, j2));
                        if (i61 == iMax4) {
                            break;
                        }
                        i61--;
                        iA = i8;
                    }
                } else {
                    i8 = iA;
                    arrayList = null;
                }
                int[] iArr = nr1VarS.a;
                int i62 = nr1VarS.b - 1;
                ArrayList arrayList3 = arrayList;
                while (-1 < i62) {
                    int i63 = iArr[i62];
                    if (i63 < iMax4) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        i25 = iMax4;
                        ArrayList arrayList4 = arrayList3;
                        arrayList4.add(ce1Var.a(i63, j2));
                        arrayList3 = arrayList4;
                    } else {
                        i25 = iMax4;
                    }
                    i62--;
                    iMax4 = i25;
                }
                List list3 = arrayList3 == null ? ni0Var : arrayList3;
                int size2 = list3.size();
                int iMax5 = i56;
                for (int i64 = 0; i64 < size2; i64++) {
                    iMax5 = Math.max(iMax5, ((fe1) list3.get(i64)).n);
                }
                int iMin = Math.min(((fe1) qx.y0(mjVar2)).a, iA2 - 1);
                int i65 = ((fe1) qx.y0(mjVar2)).a + 1;
                if (i65 <= iMin) {
                    List arrayList5 = null;
                    while (true) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        i9 = i47;
                        i10 = iMax5;
                        arrayList2 = arrayList5;
                        arrayList2.add(ce1Var.a(i65, j2));
                        if (i65 == iMin) {
                            break;
                        }
                        i65++;
                        arrayList5 = arrayList2;
                        iMax5 = i10;
                        i47 = i9;
                    }
                } else {
                    i9 = i47;
                    i10 = iMax5;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((fe1) qx.y0(arrayList2)).a > iMin) {
                    iMin = ((fe1) qx.y0(arrayList2)).a;
                }
                int[] iArr2 = nr1VarS.a;
                int i66 = nr1VarS.b;
                int i67 = 0;
                while (i67 < i66) {
                    int i68 = i66;
                    int i69 = iArr2[i67];
                    if (i69 > iMin) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(ce1Var.a(i69, j2));
                    }
                    i67++;
                    i66 = i68;
                }
                if (arrayList2 == null) {
                    arrayList2 = ni0Var;
                }
                int size3 = arrayList2.size();
                int iMax6 = i10;
                for (int i70 = 0; i70 < size3; i70++) {
                    iMax6 = Math.max(iMax6, ((fe1) arrayList2.get(i70)).n);
                }
                int i71 = (s51.n(fe1Var3, mjVar2.first()) && list3.isEmpty() && arrayList2.isEmpty()) ? i7 : 0;
                int iG2 = n30.g(iMax6, jI);
                int iF = n30.f(i45, jI);
                int i72 = i45 < Math.min(iF, iH2) ? i7 : 0;
                if (i72 != 0 && i57 != 0) {
                    p21.c("non-zero itemsScrollOffset");
                }
                ArrayList arrayList6 = new ArrayList(arrayList2.size() + list3.size() + mjVar2.a());
                if (i72 != 0) {
                    if (!list3.isEmpty() || !arrayList2.isEmpty()) {
                        p21.a("no extra items");
                    }
                    int iA9 = mjVar2.a();
                    int[] iArr3 = new int[iA9];
                    for (int i73 = 0; i73 < iA9; i73++) {
                        iArr3[i73] = ((fe1) mjVar2.get(i73)).k;
                    }
                    int[] iArr4 = new int[iA9];
                    if (kjVar == null) {
                        throw nc2.y("null verticalArrangement when isVertical == true");
                    }
                    kjVar.g(dd1Var, iF, iArr3, iArr4);
                    l41 l41VarS = uj.S(iArr4);
                    int i74 = l41VarS.g;
                    int i75 = l41VarS.h;
                    if ((i75 > 0 && i74 >= 0) || (i75 < 0 && i74 <= 0)) {
                        int i76 = 0;
                        while (true) {
                            int i77 = iArr4[i76];
                            i11 = i71;
                            fe1 fe1Var4 = (fe1) mjVar2.get(i76);
                            fe1Var4.d(i77, iG2, iF);
                            arrayList6.add(fe1Var4);
                            if (i76 == i74) {
                                break;
                            }
                            i76 += i75;
                            i71 = i11;
                        }
                    } else {
                        i11 = i71;
                    }
                } else {
                    i11 = i71;
                    int size4 = list3.size();
                    int iA10 = i57;
                    int i78 = 0;
                    while (i78 < size4) {
                        int i79 = size4;
                        fe1 fe1Var5 = (fe1) list3.get(i78);
                        iA10 -= fe1Var5.a();
                        fe1Var5.d(iA10, iG2, iF);
                        arrayList6.add(fe1Var5);
                        i78++;
                        size4 = i79;
                    }
                    int iA11 = mjVar2.a();
                    int iA12 = i57;
                    for (int i80 = 0; i80 < iA11; i80++) {
                        fe1 fe1Var6 = (fe1) mjVar2.get(i80);
                        fe1Var6.d(iA12, iG2, iF);
                        arrayList6.add(fe1Var6);
                        iA12 += fe1Var6.a();
                    }
                    int size5 = arrayList2.size();
                    for (int i81 = 0; i81 < size5; i81++) {
                        fe1 fe1Var7 = (fe1) arrayList2.get(i81);
                        fe1Var7.d(iA12, iG2, iF);
                        arrayList6.add(fe1Var7);
                        iA12 += fe1Var7.a();
                    }
                }
                int i82 = i8;
                wc1Var.b(iG2, iF, arrayList6, be1Var2.d, ce1Var, zM, z2, i82, i45);
                if (!zM) {
                    wc1Var.a();
                    if (!zB) {
                        iG2 = n30.g(Math.max(iG2, 0), jI);
                        int iF2 = n30.f(Math.max(iF, 0), jI);
                        if (iF2 != iF) {
                            int size6 = arrayList6.size();
                            for (int i83 = 0; i83 < size6; i83++) {
                                ((fe1) arrayList6.get(i83)).p = iF2;
                            }
                        }
                        iF = iF2;
                    }
                }
                fe1 fe1Var8 = (fe1) mjVar2.f();
                int i84 = fe1Var8 != null ? fe1Var8.a : 0;
                fe1 fe1Var9 = (fe1) mjVar2.h();
                int i85 = fe1Var9 != null ? fe1Var9.a : 0;
                be1Var2.b.getClass();
                nr1 nr1Var2 = f41.a;
                if (this.f == null || arrayList6.isEmpty() || (i18 = nr1Var2.b) == 0) {
                    mjVar = mjVar2;
                    i12 = i7;
                    i13 = i38;
                    i14 = 0;
                    list = ni0Var;
                } else {
                    if (i85 - i84 < 0 || i18 == 0) {
                        nr1Var = nr1Var2;
                    } else {
                        l41 l41VarS2 = y02.S(0, i18);
                        int i86 = l41VarS2.f;
                        int i87 = l41VarS2.g;
                        if (i86 <= i87) {
                            iC = -1;
                            while (nr1Var2.c(i86) <= i84) {
                                iC = nr1Var2.c(i86);
                                if (i86 == i87) {
                                    break;
                                }
                                i86++;
                            }
                            i24 = -1;
                        } else {
                            i24 = -1;
                            iC = -1;
                        }
                        if (iC == i24) {
                            nr1Var = f41.a;
                        } else {
                            nr1Var = new nr1(i7);
                            nr1Var.a(iC);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList(arrayList6.size());
                    int size7 = arrayList6.size();
                    int i88 = 0;
                    while (i88 < size7) {
                        int i89 = size7;
                        Object obj2 = arrayList6.get(i88);
                        mj mjVar3 = mjVar2;
                        int i90 = ((fe1) obj2).a;
                        int i91 = i88;
                        int[] iArr5 = nr1Var2.a;
                        int i92 = nr1Var2.b;
                        nr1 nr1Var3 = nr1Var2;
                        int i93 = 0;
                        while (true) {
                            if (i93 < i92) {
                                int i94 = i93;
                                if (iArr5[i94] == i90) {
                                    arrayList8.add(obj2);
                                    break;
                                }
                                i93 = i94 + 1;
                            }
                        }
                        i88 = i91 + 1;
                        size7 = i89;
                        mjVar2 = mjVar3;
                        nr1Var2 = nr1Var3;
                    }
                    mjVar = mjVar2;
                    int[] iArr6 = nr1Var.a;
                    int i95 = nr1Var.b;
                    int i96 = 0;
                    while (i96 < i95) {
                        int i97 = iArr6[i96];
                        int size8 = arrayList6.size();
                        int[] iArr7 = iArr6;
                        int i98 = 0;
                        int i99 = 0;
                        while (true) {
                            if (i98 >= size8) {
                                i19 = -1;
                                break;
                            }
                            Object obj3 = arrayList6.get(i98);
                            int i100 = i98 + 1;
                            if (((fe1) obj3).a == i97) {
                                i19 = i99;
                                break;
                            }
                            i99++;
                            i98 = i100;
                        }
                        fe1 fe1VarA4 = i19 == -1 ? ce1Var.a(i97, j2) : (fe1) arrayList6.remove(i19);
                        int I = gv3.I(fe1VarA4);
                        if (i19 == -1) {
                            fe1Var = fe1VarA4;
                            j3 = j2;
                            iB = Integer.MIN_VALUE;
                        } else {
                            fe1Var = fe1VarA4;
                            j3 = j2;
                            iB = (int) (fe1Var.b(0) & 4294967295L);
                        }
                        int size9 = arrayList8.size();
                        int i101 = 0;
                        while (true) {
                            if (i101 >= size9) {
                                i20 = i95;
                                obj = null;
                                break;
                            }
                            obj = arrayList8.get(i101);
                            i20 = i95;
                            if (((fe1) obj).a != i97) {
                                break;
                            }
                            i101++;
                            i95 = i20;
                        }
                        fe1 fe1Var10 = (fe1) obj;
                        if (fe1Var10 != null) {
                            long jB = fe1Var10.b(0);
                            i21 = i96;
                            i22 = (int) (jB & 4294967295L);
                        } else {
                            i21 = i96;
                            i22 = Integer.MIN_VALUE;
                        }
                        if (iB == Integer.MIN_VALUE) {
                            iMax = i38;
                            i23 = iMax;
                        } else {
                            i23 = i38;
                            iMax = Math.max(i23, iB);
                        }
                        if (i22 != Integer.MIN_VALUE) {
                            iMax = Math.min(iMax, i22 - I);
                        }
                        fe1Var.o = true;
                        fe1Var.d(iMax, iG2, iF);
                        arrayList7.add(fe1Var);
                        i96 = i21 + 1;
                        i38 = i23;
                        iArr6 = iArr7;
                        i95 = i20;
                        j2 = j3;
                    }
                    i13 = i38;
                    i12 = 1;
                    i14 = 0;
                    list = arrayList7;
                }
                if (i11 != 0) {
                    fe1 fe1Var11 = (fe1) qx.r0(arrayList6);
                    numValueOf = fe1Var11 != null ? Integer.valueOf(fe1Var11.a) : null;
                    if (i11 == 0) {
                        fe1 fe1Var12 = (fe1) qx.z0(arrayList6);
                        if (fe1Var12 != null) {
                            numValueOf2 = Integer.valueOf(fe1Var12.a);
                            i15 = iA2;
                            i16 = i9;
                        }
                        i15 = iA2;
                        i16 = i9;
                        numValueOf2 = null;
                    } else {
                        fe1 fe1Var13 = (fe1) mjVar.h();
                        if (fe1Var13 != null) {
                            numValueOf2 = Integer.valueOf(fe1Var13.a);
                            i15 = iA2;
                            i16 = i9;
                        }
                        i15 = iA2;
                        i16 = i9;
                        numValueOf2 = null;
                    }
                    if (i16 >= i15 && i45 <= iH2) {
                        i12 = i14;
                    }
                    dn1 dn1VarI0 = sa3Var2.I0(n30.g(iG2 + i27, j), n30.f(iF + iP04, j), oi0Var, new v1(os1Var, arrayList6, list, zM));
                    int iIntValue = numValueOf == null ? numValueOf.intValue() : i14;
                    int iIntValue2 = numValueOf2 == null ? numValueOf2.intValue() : i14;
                    if (arrayList6.isEmpty()) {
                        ArrayList arrayList9 = new ArrayList(list);
                        int size10 = arrayList6.size();
                        for (int i102 = i14; i102 < size10; i102++) {
                            fe1 fe1Var14 = (fe1) arrayList6.get(i102);
                            int i103 = fe1Var14.a;
                            if (iIntValue <= i103 && i103 <= iIntValue2) {
                                arrayList9.add(fe1Var14);
                            }
                        }
                        ux.e0(arrayList9, gv3.z);
                        list2 = arrayList9;
                    } else {
                        list2 = ni0Var;
                    }
                    size = list.size();
                    boolean z5 = i12;
                    i17 = i14;
                    int i104 = i17;
                    while (i17 < size) {
                        i104 += ((fe1) list.get(i17)).k;
                        i17++;
                    }
                    sa3Var = sa3Var2;
                    ee1Var = new ee1(fe1Var3, i82, z5, f3, dn1VarI0, f2, z4, x50Var, dd1Var, ce1Var.d, i104, list2, i13, i41, i15, t02Var, i28, i);
                } else {
                    fe1 fe1Var15 = (fe1) mjVar.f();
                    if (fe1Var15 != null) {
                        numValueOf = Integer.valueOf(fe1Var15.a);
                    }
                    if (i11 == 0) {
                    }
                    if (i16 >= i15) {
                        i12 = i14;
                    }
                    dn1 dn1VarI02 = sa3Var2.I0(n30.g(iG2 + i27, j), n30.f(iF + iP04, j), oi0Var, new v1(os1Var, arrayList6, list, zM));
                    if (numValueOf == null) {
                    }
                    if (numValueOf2 == null) {
                    }
                    if (arrayList6.isEmpty()) {
                    }
                    size = list.size();
                    boolean z52 = i12;
                    i17 = i14;
                    int i1042 = i17;
                    while (i17 < size) {
                    }
                    sa3Var = sa3Var2;
                    ee1Var = new ee1(fe1Var3, i82, z52, f3, dn1VarI02, f2, z4, x50Var, dd1Var, ce1Var.d, i1042, list2, i13, i41, i15, t02Var, i28, i);
                }
            }
            ie1 ie1Var3 = ie1Var;
            ie1Var3.f(ee1Var, sa3Var.M(), false);
            z80 z80Var = ie1Var3.a;
            return ee1Var;
        } catch (Throwable th) {
            jo3.v(t63VarL, t63VarS, ns0VarE);
            throw th;
        }
    }
}
