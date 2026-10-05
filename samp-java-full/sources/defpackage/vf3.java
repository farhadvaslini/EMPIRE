package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf3 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vf3(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v165, types: [ns0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, p40] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
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
    @Override // defpackage.ns0
    public final Object h(Object obj) {
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        pg3 pg3Var;
        pg3 pg3Var2;
        qg3 qg3Var;
        qg3 qg3Var2;
        pg3 pg3Var3;
        pg3 pg3Var4;
        qg3 qg3Var3;
        qg3 qg3Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        ar2 ar2Var;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        ?? r5 = 0;
        bg3 bg3Var = null;
        r5 = 0;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                final sf3 sf3Var = (sf3) obj4;
                x50 x50Var = (x50) obj3;
                Context context = (Context) obj2;
                vd3 vd3Var = (vd3) obj;
                as1 as1Var = vd3Var.a;
                as1 as1Var2 = vd3Var.a;
                ie3 ie3Var = ie3.b;
                as1Var.b(ie3Var);
                fe3 fe3Var = fe3.Autofill;
                boolean z = (yg3.c(sf3Var.n().b) || !sf3Var.j() || (sf3Var.f instanceof j42) || sf3Var.h == null) ? false : true;
                int i4 = 26;
                me1 me1Var = new me1(i4, x50Var, new nf3(sf3Var, r5, i3));
                Resources resources = context.getResources();
                int i5 = 22;
                er1 er1Var = new er1(i5, me1Var, r5);
                if (z) {
                    as1Var2.b(new ee3(r51.J1, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, er1Var));
                }
                fe3 fe3Var2 = fe3.Autofill;
                boolean z2 = (yg3.c(sf3Var.n().b) || (sf3Var.f instanceof j42) || sf3Var.h == null) ? false : true;
                me1 me1Var2 = new me1(i4, x50Var, new nf3(sf3Var, r5, 2));
                Resources resources2 = context.getResources();
                er1 er1Var2 = new er1(i5, me1Var2, r5);
                if (z2) {
                    as1Var2.b(new ee3(r51.K1, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, er1Var2));
                }
                fe3 fe3Var3 = fe3.Autofill;
                boolean z3 = sf3Var.j() && ((Boolean) sf3Var.x.getValue()).booleanValue() && sf3Var.h != null;
                me1 me1Var3 = new me1(i4, x50Var, new nf3(sf3Var, r5, 3));
                Resources resources3 = context.getResources();
                er1 er1Var3 = new er1(i5, me1Var3, r5);
                if (z3) {
                    as1Var2.b(new ee3(r51.L1, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, er1Var3));
                }
                fe3 fe3Var4 = fe3.Autofill;
                boolean z4 = yg3.d(sf3Var.n().b) != sf3Var.n().a.g.length();
                cs0 cs0Var = new cs0() { // from class: xf3
                    @Override // defpackage.cs0
                    public final Object a() {
                        int i6 = i2;
                        dm3 dm3Var2 = dm3.a;
                        sf3 sf3Var2 = sf3Var;
                        switch (i6) {
                            case 0:
                                break;
                            case 1:
                                bg3 bg3VarE = sf3.e(sf3Var2.n().a, d32.f(0, sf3Var2.n().a.g.length()));
                                sf3Var2.c.h(bg3VarE);
                                long j = bg3VarE.b;
                                sf3Var2.w = new yg3(j);
                                sf3Var2.u = bg3.a(sf3Var2.u, null, j, 5);
                                sf3Var2.h(true);
                                break;
                            default:
                                cs0 cs0Var2 = sf3Var2.g;
                                if (cs0Var2 != null) {
                                    cs0Var2.a();
                                }
                                break;
                        }
                        return dm3Var2;
                    }
                };
                cs0 cs0Var2 = new cs0() { // from class: xf3
                    @Override // defpackage.cs0
                    public final Object a() {
                        int i6 = i3;
                        dm3 dm3Var2 = dm3.a;
                        sf3 sf3Var2 = sf3Var;
                        switch (i6) {
                            case 0:
                                break;
                            case 1:
                                bg3 bg3VarE = sf3.e(sf3Var2.n().a, d32.f(0, sf3Var2.n().a.g.length()));
                                sf3Var2.c.h(bg3VarE);
                                long j = bg3VarE.b;
                                sf3Var2.w = new yg3(j);
                                sf3Var2.u = bg3.a(sf3Var2.u, null, j, 5);
                                sf3Var2.h(true);
                                break;
                            default:
                                cs0 cs0Var22 = sf3Var2.g;
                                if (cs0Var22 != null) {
                                    cs0Var22.a();
                                }
                                break;
                        }
                        return dm3Var2;
                    }
                };
                Resources resources4 = context.getResources();
                er1 er1Var4 = new er1(i5, cs0Var2, cs0Var);
                if (z4) {
                    as1Var2.b(new ee3(r51.M1, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, er1Var4));
                }
                fe3 fe3Var5 = fe3.Autofill;
                if (sf3Var.j() && yg3.c(sf3Var.n().b)) {
                    i2 = 1;
                }
                final int i6 = 2;
                cs0 cs0Var3 = new cs0() { // from class: xf3
                    @Override // defpackage.cs0
                    public final Object a() {
                        int i62 = i6;
                        dm3 dm3Var2 = dm3.a;
                        sf3 sf3Var2 = sf3Var;
                        switch (i62) {
                            case 0:
                                break;
                            case 1:
                                bg3 bg3VarE = sf3.e(sf3Var2.n().a, d32.f(0, sf3Var2.n().a.g.length()));
                                sf3Var2.c.h(bg3VarE);
                                long j = bg3VarE.b;
                                sf3Var2.w = new yg3(j);
                                sf3Var2.u = bg3.a(sf3Var2.u, null, j, 5);
                                sf3Var2.h(true);
                                break;
                            default:
                                cs0 cs0Var22 = sf3Var2.g;
                                if (cs0Var22 != null) {
                                    cs0Var22.a();
                                }
                                break;
                        }
                        return dm3Var2;
                    }
                };
                Resources resources5 = context.getResources();
                er1 er1Var5 = new er1(i5, cs0Var3, r5);
                if (i2 != 0) {
                    as1Var2.b(new ee3(fe3Var5.f, resources5.getString(fe3Var5.g), fe3Var5.h, er1Var5));
                }
                as1Var2.b(ie3Var);
                break;
            default:
                cf3 cf3Var = (cf3) obj3;
                mk2 mk2Var = (mk2) obj2;
                gf3 gf3Var = (gf3) obj;
                switch (((d71) obj4).ordinal()) {
                    case 0:
                        gf3Var.e.a = null;
                        if (gf3Var.g.g.length() > 0) {
                            if (!yg3.c(gf3Var.f)) {
                                boolean zF = gf3Var.f();
                                long j = gf3Var.f;
                                if (!zF) {
                                    int iE = yg3.e(j);
                                    gf3Var.q(iE, iE);
                                } else {
                                    int iF = yg3.f(j);
                                    gf3Var.q(iF, iF);
                                }
                            } else {
                                gf3Var.i();
                            }
                        }
                        break;
                    case 1:
                        gf3Var.e.a = null;
                        if (gf3Var.g.g.length() > 0) {
                            if (!yg3.c(gf3Var.f)) {
                                boolean zF2 = gf3Var.f();
                                long j2 = gf3Var.f;
                                if (!zF2) {
                                    int iF2 = yg3.f(j2);
                                    gf3Var.q(iF2, iF2);
                                } else {
                                    int iE2 = yg3.e(j2);
                                    gf3Var.q(iE2, iE2);
                                }
                            } else {
                                gf3Var.m();
                            }
                        }
                        break;
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        xg3 xg3Var = gf3Var.e;
                        xg3Var.a = null;
                        af afVar = gf3Var.g;
                        String str = afVar.g;
                        String str2 = afVar.g;
                        if (str.length() > 0) {
                            if (!gf3Var.f()) {
                                xg3Var.a = null;
                                if (str2.length() > 0 && (numE = gf3Var.e()) != null) {
                                    int iIntValue = numE.intValue();
                                    gf3Var.q(iIntValue, iIntValue);
                                    break;
                                }
                            } else {
                                xg3Var.a = null;
                                if (str2.length() > 0 && (numD = gf3Var.d()) != null) {
                                    int iIntValue2 = numD.intValue();
                                    gf3Var.q(iIntValue2, iIntValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        xg3 xg3Var2 = gf3Var.e;
                        xg3Var2.a = null;
                        af afVar2 = gf3Var.g;
                        String str3 = afVar2.g;
                        String str4 = afVar2.g;
                        if (str3.length() > 0) {
                            if (!gf3Var.f()) {
                                xg3Var2.a = null;
                                if (str4.length() > 0 && (numD2 = gf3Var.d()) != null) {
                                    int iIntValue3 = numD2.intValue();
                                    gf3Var.q(iIntValue3, iIntValue3);
                                    break;
                                }
                            } else {
                                xg3Var2.a = null;
                                if (str4.length() > 0 && (numE2 = gf3Var.e()) != null) {
                                    int iIntValue4 = numE2.intValue();
                                    gf3Var.q(iIntValue4, iIntValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        gf3Var.j();
                        break;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        gf3Var.l();
                        break;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        gf3Var.o();
                        break;
                    case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                        gf3Var.n();
                        break;
                    case 8:
                        gf3Var.e.a = null;
                        if (gf3Var.g.g.length() > 0) {
                            if (!gf3Var.f()) {
                                gf3Var.n();
                            } else {
                                gf3Var.o();
                            }
                        }
                        break;
                    case vr.g /* 9 */:
                        gf3Var.e.a = null;
                        if (gf3Var.g.g.length() > 0) {
                            if (!gf3Var.f()) {
                                gf3Var.o();
                            } else {
                                gf3Var.n();
                            }
                        }
                        break;
                    case vr.h /* 10 */:
                        if (gf3Var.g.g.length() > 0 && (pg3Var = gf3Var.c) != null) {
                            int iG = gf3Var.g(pg3Var, -1);
                            gf3Var.q(iG, iG);
                            break;
                        }
                        break;
                    case 11:
                        if (gf3Var.g.g.length() > 0 && (pg3Var2 = gf3Var.c) != null) {
                            int iG2 = gf3Var.g(pg3Var2, 1);
                            gf3Var.q(iG2, iG2);
                            break;
                        }
                        break;
                    case vr.i /* 12 */:
                    case jo3.h /* 48 */:
                        break;
                    case 13:
                        if (gf3Var.g.g.length() > 0 && (qg3Var = gf3Var.i) != null) {
                            int iH = gf3Var.h(qg3Var, -1);
                            gf3Var.q(iH, iH);
                            break;
                        }
                        break;
                    case 14:
                        if (gf3Var.g.g.length() > 0 && (qg3Var2 = gf3Var.i) != null) {
                            int iH2 = gf3Var.h(qg3Var2, 1);
                            gf3Var.q(iH2, iH2);
                            break;
                        }
                        break;
                    case jo3.g /* 15 */:
                        gf3Var.e.a = null;
                        if (gf3Var.g.g.length() > 0) {
                            gf3Var.q(0, 0);
                        }
                        break;
                    case 16:
                        gf3Var.e.a = null;
                        af afVar3 = gf3Var.g;
                        if (afVar3.g.length() > 0) {
                            int length = afVar3.g.length();
                            gf3Var.q(length, length);
                        }
                        break;
                    case 17:
                        cf3Var.b.d(false);
                        break;
                    case 18:
                        cf3Var.b.p();
                        break;
                    case 19:
                        cf3Var.b.f();
                        break;
                    case 20:
                        List listA = gf3Var.a(new db3(5));
                        if (listA != null) {
                            cf3Var.a(listA);
                        }
                        break;
                    case 21:
                        List listA2 = gf3Var.a(new db3(6));
                        if (listA2 != null) {
                            cf3Var.a(listA2);
                        }
                        break;
                    case 22:
                        List listA3 = gf3Var.a(new db3(7));
                        if (listA3 != null) {
                            cf3Var.a(listA3);
                        }
                        break;
                    case 23:
                        List listA4 = gf3Var.a(new db3(8));
                        if (listA4 != null) {
                            cf3Var.a(listA4);
                        }
                        break;
                    case 24:
                        List listA5 = gf3Var.a(new db3(9));
                        if (listA5 != null) {
                            cf3Var.a(listA5);
                        }
                        break;
                    case 25:
                        List listA6 = gf3Var.a(new db3(10));
                        if (listA6 != null) {
                            cf3Var.a(listA6);
                        }
                        break;
                    case 26:
                        gf3Var.e.a = null;
                        af afVar4 = gf3Var.g;
                        if (afVar4.g.length() > 0) {
                            gf3Var.q(0, afVar4.g.length());
                        }
                        break;
                    case 27:
                        gf3Var.i();
                        gf3Var.p();
                        break;
                    case 28:
                        gf3Var.m();
                        gf3Var.p();
                        break;
                    case 29:
                        if (gf3Var.g.g.length() > 0 && (pg3Var3 = gf3Var.c) != null) {
                            int iG3 = gf3Var.g(pg3Var3, -1);
                            gf3Var.q(iG3, iG3);
                        }
                        gf3Var.p();
                        break;
                    case 30:
                        if (gf3Var.g.g.length() > 0 && (pg3Var4 = gf3Var.c) != null) {
                            int iG4 = gf3Var.g(pg3Var4, 1);
                            gf3Var.q(iG4, iG4);
                        }
                        gf3Var.p();
                        break;
                    case 31:
                        if (gf3Var.g.g.length() > 0 && (qg3Var3 = gf3Var.i) != null) {
                            int iH3 = gf3Var.h(qg3Var3, -1);
                            gf3Var.q(iH3, iH3);
                        }
                        gf3Var.p();
                        break;
                    case 32:
                        if (gf3Var.g.g.length() > 0 && (qg3Var4 = gf3Var.i) != null) {
                            int iH4 = gf3Var.h(qg3Var4, 1);
                            gf3Var.q(iH4, iH4);
                        }
                        gf3Var.p();
                        break;
                    case 33:
                        gf3Var.e.a = null;
                        if (gf3Var.g.g.length() > 0) {
                            gf3Var.q(0, 0);
                        }
                        gf3Var.p();
                        break;
                    case 34:
                        gf3Var.e.a = null;
                        af afVar5 = gf3Var.g;
                        if (afVar5.g.length() > 0) {
                            int length2 = afVar5.g.length();
                            gf3Var.q(length2, length2);
                        }
                        gf3Var.p();
                        break;
                    case 35:
                        xg3 xg3Var3 = gf3Var.e;
                        xg3Var3.a = null;
                        af afVar6 = gf3Var.g;
                        String str5 = afVar6.g;
                        String str6 = afVar6.g;
                        if (str5.length() > 0) {
                            if (gf3Var.f()) {
                                xg3Var3.a = null;
                                if (str6.length() > 0 && (numE3 = gf3Var.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    gf3Var.q(iIntValue5, iIntValue5);
                                }
                            } else {
                                xg3Var3.a = null;
                                if (str6.length() > 0 && (numD3 = gf3Var.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    gf3Var.q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        gf3Var.p();
                        break;
                    case 36:
                        xg3 xg3Var4 = gf3Var.e;
                        xg3Var4.a = null;
                        af afVar7 = gf3Var.g;
                        String str7 = afVar7.g;
                        String str8 = afVar7.g;
                        if (str7.length() > 0) {
                            if (gf3Var.f()) {
                                xg3Var4.a = null;
                                if (str8.length() > 0 && (numD4 = gf3Var.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    gf3Var.q(iIntValue7, iIntValue7);
                                }
                            } else {
                                xg3Var4.a = null;
                                if (str8.length() > 0 && (numE4 = gf3Var.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    gf3Var.q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        gf3Var.p();
                        break;
                    case 37:
                        gf3Var.j();
                        gf3Var.p();
                        break;
                    case 38:
                        gf3Var.l();
                        gf3Var.p();
                        break;
                    case 39:
                        gf3Var.o();
                        gf3Var.p();
                        break;
                    case 40:
                        gf3Var.n();
                        gf3Var.p();
                        break;
                    case 41:
                        gf3Var.e.a = null;
                        if (gf3Var.g.g.length() > 0) {
                            if (gf3Var.f()) {
                                gf3Var.o();
                            } else {
                                gf3Var.n();
                            }
                        }
                        gf3Var.p();
                        break;
                    case 42:
                        gf3Var.e.a = null;
                        if (gf3Var.g.g.length() > 0) {
                            if (gf3Var.f()) {
                                gf3Var.n();
                            } else {
                                gf3Var.o();
                            }
                        }
                        gf3Var.p();
                        break;
                    case 43:
                        gf3Var.e.a = null;
                        if (gf3Var.g.g.length() > 0) {
                            long j3 = gf3Var.f;
                            int i7 = yg3.c;
                            int i8 = (int) (j3 & 4294967295L);
                            gf3Var.q(i8, i8);
                        }
                        break;
                    case 44:
                        if (!cf3Var.e) {
                            cf3Var.a(vr.K(new dz(1, "\n")));
                        } else {
                            mk2Var.f = cf3Var.a.x.g.r.b(cf3Var.l);
                        }
                        break;
                    case 45:
                        if (!cf3Var.e) {
                            cf3Var.a(vr.K(new dz(1, "\t")));
                        } else {
                            mk2Var.f = false;
                        }
                        break;
                    case 46:
                        yl3 yl3Var = cf3Var.h;
                        if (yl3Var != null) {
                            yl3Var.a(bg3.a(gf3Var.h, gf3Var.g, gf3Var.f, 4));
                        }
                        yl3 yl3Var2 = cf3Var.h;
                        if (yl3Var2 != null) {
                            ar2 ar2Var2 = yl3Var2.a;
                            if (ar2Var2 != null && (ar2Var = (ar2) ar2Var2.g) != null) {
                                yl3Var2.a = ar2Var;
                                yl3Var2.c -= ((bg3) ar2Var2.h).a.g.length();
                                yl3Var2.b = new ar2(4, yl3Var2.b, (bg3) ar2Var2.h);
                                r5 = (bg3) ar2Var.h;
                            }
                            if (r5 != 0) {
                                cf3Var.k.h(r5);
                            }
                        }
                        break;
                    case 47:
                        yl3 yl3Var3 = cf3Var.h;
                        if (yl3Var3 != null) {
                            ar2 ar2Var3 = yl3Var3.b;
                            if (ar2Var3 != null) {
                                yl3Var3.b = (ar2) ar2Var3.g;
                                bg3 bg3Var2 = (bg3) ar2Var3.h;
                                yl3Var3.a = new ar2(4, yl3Var3.a, bg3Var2);
                                yl3Var3.c = bg3Var2.a.g.length() + yl3Var3.c;
                                bg3Var = (bg3) ar2Var3.h;
                            }
                            if (bg3Var != null) {
                                cf3Var.k.h(bg3Var);
                            }
                        }
                        break;
                    default:
                        c.k();
                        break;
                }
                break;
        }
        return dm3Var;
    }
}
