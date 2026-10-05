package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class o70 implements gn0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ gn0 g;

    public o70(gn0 gn0Var, qy2 qy2Var) {
        this.f = 14;
        this.g = gn0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r1v6, types: [ni0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
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
    @Override // defpackage.gn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, p40 p40Var) throws Throwable {
        n70 n70Var;
        s92 s92Var;
        gh2 gh2Var;
        l52 l52Var;
        gx2 gx2Var;
        String str;
        ix2 ix2Var;
        kx2 kx2Var;
        mx2 mx2Var;
        ox2 ox2Var;
        qx2 qx2Var;
        ux2 ux2Var;
        wx2 wx2Var;
        yx2 yx2Var;
        by2 by2Var;
        fy2 fy2Var;
        hy2 hy2Var;
        jy2 jy2Var;
        ly2 ly2Var;
        ny2 ny2Var;
        py2 py2Var;
        yn3 yn3Var;
        ao3 ao3Var;
        int i = this.f;
        ec2 ec2Var = qy2.z;
        ak2 ak2Var = qp2.h;
        dm3 dm3Var = dm3.a;
        gn0 gn0Var = this.g;
        Object obj2 = y50.f;
        Object obj3 = null;
        switch (i) {
            case 0:
                if (p40Var instanceof n70) {
                    n70Var = (n70) p40Var;
                    int i2 = n70Var.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        n70Var.j = i2 - Integer.MIN_VALUE;
                    } else {
                        n70Var = new n70(this, p40Var);
                    }
                }
                Object obj4 = n70Var.i;
                int i3 = n70Var.j;
                if (i3 == 0) {
                    y02.Q(obj4);
                    d93 d93Var = (d93) obj;
                    if (d93Var instanceof zi2) {
                        throw ((zi2) d93Var).b;
                    }
                    if (d93Var instanceof a70) {
                        Object obj5 = ((a70) d93Var).b;
                        n70Var.j = 1;
                        return gn0Var.k(obj5, n70Var) == obj2 ? obj2 : dm3Var;
                    }
                    if ((d93Var instanceof km0) || (d93Var instanceof ul3) || (d93Var instanceof ww1)) {
                        c.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    } else {
                        c.k();
                    }
                } else {
                    if (i3 == 1) {
                        y02.Q(obj4);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                if (p40Var instanceof s92) {
                    s92Var = (s92) p40Var;
                    int i4 = s92Var.j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        s92Var.j = i4 - Integer.MIN_VALUE;
                    } else {
                        s92Var = new s92(this, p40Var);
                    }
                }
                Object obj6 = s92Var.i;
                int i5 = s92Var.j;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y02.Q(obj6);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj6);
                if (!((Boolean) obj).booleanValue()) {
                    return dm3Var;
                }
                s92Var.j = 1;
                return gn0Var.k(obj, s92Var) == obj2 ? obj2 : dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                if (p40Var instanceof gh2) {
                    gh2Var = (gh2) p40Var;
                    int i6 = gh2Var.j;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        gh2Var.j = i6 - Integer.MIN_VALUE;
                    } else {
                        gh2Var = new gh2(this, p40Var);
                    }
                }
                Object obj7 = gh2Var.i;
                int i7 = gh2Var.j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y02.Q(obj7);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj7);
                String str2 = (String) ((es1) obj).c(ih2.b);
                Object arrayList = ni0.f;
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        l41 l41VarS = y02.S(0, jSONArray.length());
                        arrayList = new ArrayList();
                        Iterator it = l41VarS.iterator();
                        while (((k41) it).h) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(((e41) it).nextInt());
                            if (jSONObjectOptJSONObject == null) {
                                l52Var = null;
                            } else {
                                String strOptString = jSONObjectOptJSONObject.optString("host");
                                strOptString.getClass();
                                String str3 = !y93.q0(strOptString) ? strOptString : null;
                                if (str3 != null) {
                                    int iOptInt = jSONObjectOptJSONObject.optInt("port");
                                    String strOptString2 = jSONObjectOptJSONObject.optString("nickname");
                                    strOptString2.getClass();
                                    String str4 = !y93.q0(strOptString2) ? strOptString2 : null;
                                    if (str4 != null) {
                                        String strOptString3 = jSONObjectOptJSONObject.optString("textEncoding");
                                        ak2 ak2Var2 = xy2.h;
                                        ak2Var2.getClass();
                                        xy2 xy2VarH = ak2.h(strOptString3);
                                        if (xy2VarH == null) {
                                            xy2VarH = ak2.n(ak2Var2);
                                        }
                                        String strOptString4 = jSONObjectOptJSONObject.optString("password");
                                        strOptString4.getClass();
                                        l52Var = new l52(str3, iOptInt, str4, xy2VarH, strOptString4);
                                    }
                                }
                            }
                            if (l52Var != null) {
                                arrayList.add(l52Var);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                gh2Var.j = 1;
                return gn0Var.k(arrayList, gh2Var) == obj2 ? obj2 : dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                if (p40Var instanceof gx2) {
                    gx2Var = (gx2) p40Var;
                    int i8 = gx2Var.j;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        gx2Var.j = i8 - Integer.MIN_VALUE;
                    } else {
                        gx2Var = new gx2(this, p40Var);
                    }
                }
                Object obj8 = gx2Var.i;
                int i9 = gx2Var.j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y02.Q(obj8);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj8);
                String str5 = (String) ((es1) obj).c(qy2.E);
                str = str5 != null ? str5 : "";
                gx2Var.j = 1;
                return gn0Var.k(str, gx2Var) == obj2 ? obj2 : dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                if (p40Var instanceof ix2) {
                    ix2Var = (ix2) p40Var;
                    int i10 = ix2Var.j;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        ix2Var.j = i10 - Integer.MIN_VALUE;
                    } else {
                        ix2Var = new ix2(this, p40Var);
                    }
                }
                Object obj9 = ix2Var.i;
                int i11 = ix2Var.j;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y02.Q(obj9);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj9);
                Boolean bool = (Boolean) ((es1) obj).c(qy2.G);
                Object objValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                ix2Var.j = 1;
                return gn0Var.k(objValueOf, ix2Var) == obj2 ? obj2 : dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                if (p40Var instanceof kx2) {
                    kx2Var = (kx2) p40Var;
                    int i12 = kx2Var.j;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        kx2Var.j = i12 - Integer.MIN_VALUE;
                    } else {
                        kx2Var = new kx2(this, p40Var);
                    }
                }
                Object obj10 = kx2Var.i;
                int i13 = kx2Var.j;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y02.Q(obj10);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj10);
                String str6 = (String) ((es1) obj).c(qy2.H);
                qf2.g.getClass();
                Iterator it2 = qf2.j.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((qf2) next).f.equals(str6)) {
                            obj3 = next;
                        }
                    }
                }
                Object obj11 = (qf2) obj3;
                if (obj11 == null) {
                    obj11 = qf2.h;
                }
                kx2Var.j = 1;
                return gn0Var.k(obj11, kx2Var) == obj2 ? obj2 : dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                if (p40Var instanceof mx2) {
                    mx2Var = (mx2) p40Var;
                    int i14 = mx2Var.j;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        mx2Var.j = i14 - Integer.MIN_VALUE;
                    } else {
                        mx2Var = new mx2(this, p40Var);
                    }
                }
                Object obj12 = mx2Var.i;
                int i15 = mx2Var.j;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y02.Q(obj12);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj12);
                Boolean bool2 = (Boolean) ((es1) obj).c(qy2.I);
                Object objValueOf2 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                mx2Var.j = 1;
                return gn0Var.k(objValueOf2, mx2Var) == obj2 ? obj2 : dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                if (p40Var instanceof ox2) {
                    ox2Var = (ox2) p40Var;
                    int i16 = ox2Var.j;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        ox2Var.j = i16 - Integer.MIN_VALUE;
                    } else {
                        ox2Var = new ox2(this, p40Var);
                    }
                }
                Object obj13 = ox2Var.i;
                int i17 = ox2Var.j;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y02.Q(obj13);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj13);
                Integer num = (Integer) ((es1) obj).c(qy2.J);
                Object num2 = new Integer(num != null ? num.intValue() : 60);
                ox2Var.j = 1;
                return gn0Var.k(num2, ox2Var) == obj2 ? obj2 : dm3Var;
            case 8:
                if (p40Var instanceof qx2) {
                    qx2Var = (qx2) p40Var;
                    int i18 = qx2Var.j;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        qx2Var.j = i18 - Integer.MIN_VALUE;
                    } else {
                        qx2Var = new qx2(this, p40Var);
                    }
                }
                Object obj14 = qx2Var.i;
                int i19 = qx2Var.j;
                if (i19 != 0) {
                    if (i19 == 1) {
                        y02.Q(obj14);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj14);
                Integer num3 = (Integer) ((es1) obj).c(qy2.K);
                Object num4 = new Integer(num3 != null ? num3.intValue() : 0);
                qx2Var.j = 1;
                return gn0Var.k(num4, qx2Var) == obj2 ? obj2 : dm3Var;
            case vr.g /* 9 */:
                if (p40Var instanceof ux2) {
                    ux2Var = (ux2) p40Var;
                    int i20 = ux2Var.j;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        ux2Var.j = i20 - Integer.MIN_VALUE;
                    } else {
                        ux2Var = new ux2(this, p40Var);
                    }
                }
                Object obj15 = ux2Var.i;
                int i21 = ux2Var.j;
                if (i21 != 0) {
                    if (i21 == 1) {
                        y02.Q(obj15);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj15);
                Boolean bool3 = (Boolean) ((es1) obj).c(qy2.M);
                Object objValueOf3 = Boolean.valueOf(bool3 != null ? bool3.booleanValue() : true);
                ux2Var.j = 1;
                return gn0Var.k(objValueOf3, ux2Var) == obj2 ? obj2 : dm3Var;
            case vr.h /* 10 */:
                if (p40Var instanceof wx2) {
                    wx2Var = (wx2) p40Var;
                    int i22 = wx2Var.j;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        wx2Var.j = i22 - Integer.MIN_VALUE;
                    } else {
                        wx2Var = new wx2(this, p40Var);
                    }
                }
                Object obj16 = wx2Var.i;
                int i23 = wx2Var.j;
                if (i23 != 0) {
                    if (i23 == 1) {
                        y02.Q(obj16);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj16);
                Boolean bool4 = (Boolean) ((es1) obj).c(qy2.N);
                Object objValueOf4 = Boolean.valueOf(bool4 != null ? bool4.booleanValue() : true);
                wx2Var.j = 1;
                return gn0Var.k(objValueOf4, wx2Var) == obj2 ? obj2 : dm3Var;
            case 11:
                if (p40Var instanceof yx2) {
                    yx2Var = (yx2) p40Var;
                    int i24 = yx2Var.j;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        yx2Var.j = i24 - Integer.MIN_VALUE;
                    } else {
                        yx2Var = new yx2(this, p40Var);
                    }
                }
                Object obj17 = yx2Var.i;
                int i25 = yx2Var.j;
                if (i25 != 0) {
                    if (i25 == 1) {
                        y02.Q(obj17);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj17);
                String str7 = (String) ((es1) obj).c(qy2.L);
                str = str7 != null ? str7 : "";
                yx2Var.j = 1;
                return gn0Var.k(str, yx2Var) == obj2 ? obj2 : dm3Var;
            case vr.i /* 12 */:
                if (p40Var instanceof by2) {
                    by2Var = (by2) p40Var;
                    int i26 = by2Var.j;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        by2Var.j = i26 - Integer.MIN_VALUE;
                    } else {
                        by2Var = new by2(this, p40Var);
                    }
                }
                Object obj18 = by2Var.i;
                int i27 = by2Var.j;
                if (i27 != 0) {
                    if (i27 == 1) {
                        y02.Q(obj18);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj18);
                Object obj19 = (String) ((es1) obj).c(qy2.x);
                if (obj19 == null) {
                    obj19 = "Player";
                }
                by2Var.j = 1;
                return gn0Var.k(obj19, by2Var) == obj2 ? obj2 : dm3Var;
            case 13:
                if (p40Var instanceof fy2) {
                    fy2Var = (fy2) p40Var;
                    int i28 = fy2Var.j;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        fy2Var.j = i28 - Integer.MIN_VALUE;
                    } else {
                        fy2Var = new fy2(this, p40Var);
                    }
                }
                Object obj20 = fy2Var.i;
                int i29 = fy2Var.j;
                if (i29 != 0) {
                    if (i29 == 1) {
                        y02.Q(obj20);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj20);
                String str8 = (String) ((es1) obj).c(ec2Var);
                ak2Var.getClass();
                Object objG = ak2.g(str8);
                fy2Var.j = 1;
                return gn0Var.k(objG, fy2Var) == obj2 ? obj2 : dm3Var;
            case 14:
                if (p40Var instanceof hy2) {
                    hy2Var = (hy2) p40Var;
                    int i30 = hy2Var.j;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        hy2Var.j = i30 - Integer.MIN_VALUE;
                    } else {
                        hy2Var = new hy2(this, p40Var);
                    }
                }
                Object obj21 = hy2Var.i;
                int i31 = hy2Var.j;
                if (i31 != 0) {
                    if (i31 == 1) {
                        y02.Q(obj21);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj21);
                es1 es1Var = (es1) obj;
                String str9 = (String) es1Var.c(ec2Var);
                ak2Var.getClass();
                qp2 qp2VarG = ak2.g(str9);
                String str10 = (String) es1Var.c(qy2.A);
                Object objF = qy2.f(str10 != null ? str10 : "", qp2VarG);
                hy2Var.j = 1;
                return gn0Var.k(objF, hy2Var) == obj2 ? obj2 : dm3Var;
            case jo3.g /* 15 */:
                if (p40Var instanceof jy2) {
                    jy2Var = (jy2) p40Var;
                    int i32 = jy2Var.j;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        jy2Var.j = i32 - Integer.MIN_VALUE;
                    } else {
                        jy2Var = new jy2(this, p40Var);
                    }
                }
                Object obj22 = jy2Var.i;
                int i33 = jy2Var.j;
                if (i33 != 0) {
                    if (i33 == 1) {
                        y02.Q(obj22);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj22);
                Object obj23 = (String) ((es1) obj).c(qy2.B);
                if (obj23 == null) {
                    obj23 = "Info";
                }
                jy2Var.j = 1;
                return gn0Var.k(obj23, jy2Var) == obj2 ? obj2 : dm3Var;
            case 16:
                if (p40Var instanceof ly2) {
                    ly2Var = (ly2) p40Var;
                    int i34 = ly2Var.j;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        ly2Var.j = i34 - Integer.MIN_VALUE;
                    } else {
                        ly2Var = new ly2(this, p40Var);
                    }
                }
                Object obj24 = ly2Var.i;
                int i35 = ly2Var.j;
                if (i35 != 0) {
                    if (i35 == 1) {
                        y02.Q(obj24);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj24);
                Boolean bool5 = (Boolean) ((es1) obj).c(qy2.C);
                Object objValueOf5 = Boolean.valueOf(bool5 != null ? bool5.booleanValue() : false);
                ly2Var.j = 1;
                return gn0Var.k(objValueOf5, ly2Var) == obj2 ? obj2 : dm3Var;
            case 17:
                if (p40Var instanceof ny2) {
                    ny2Var = (ny2) p40Var;
                    int i36 = ny2Var.j;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ny2Var.j = i36 - Integer.MIN_VALUE;
                    } else {
                        ny2Var = new ny2(this, p40Var);
                    }
                }
                Object obj25 = ny2Var.i;
                int i37 = ny2Var.j;
                if (i37 != 0) {
                    if (i37 == 1) {
                        y02.Q(obj25);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj25);
                String str11 = (String) ((es1) obj).c(qy2.D);
                Object objB = str11 != null ? qi.b(str11) : qi.a();
                ny2Var.j = 1;
                return gn0Var.k(objB, ny2Var) == obj2 ? obj2 : dm3Var;
            case 18:
                if (p40Var instanceof py2) {
                    py2Var = (py2) p40Var;
                    int i38 = py2Var.j;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        py2Var.j = i38 - Integer.MIN_VALUE;
                    } else {
                        py2Var = new py2(this, p40Var);
                    }
                }
                Object obj26 = py2Var.i;
                int i39 = py2Var.j;
                if (i39 != 0) {
                    if (i39 == 1) {
                        y02.Q(obj26);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj26);
                String str12 = (String) ((es1) obj).c(qy2.F);
                Object obj27 = oh3.g;
                if (str12 != null) {
                    oh3.f.getClass();
                    int iHashCode = str12.hashCode();
                    if (iHashCode != 3075958) {
                        if (iHashCode != 102970646) {
                            if (iHashCode == 2124767295 && str12.equals("dynamic")) {
                                obj27 = oh3.j;
                            }
                        } else if (str12.equals("light")) {
                            obj27 = oh3.h;
                        }
                    } else if (str12.equals("dark")) {
                        obj27 = oh3.i;
                    }
                }
                py2Var.j = 1;
                return gn0Var.k(obj27, py2Var) == obj2 ? obj2 : dm3Var;
            case 19:
                if (p40Var instanceof yn3) {
                    yn3Var = (yn3) p40Var;
                    int i40 = yn3Var.j;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        yn3Var.j = i40 - Integer.MIN_VALUE;
                    } else {
                        yn3Var = new yn3(this, p40Var);
                    }
                }
                Object obj28 = yn3Var.i;
                int i41 = yn3Var.j;
                if (i41 != 0) {
                    if (i41 == 1) {
                        y02.Q(obj28);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj28);
                Boolean bool6 = (Boolean) ((es1) obj).c(pi.l);
                Object objValueOf6 = Boolean.valueOf(bool6 != null ? bool6.booleanValue() : true);
                yn3Var.j = 1;
                return gn0Var.k(objValueOf6, yn3Var) == obj2 ? obj2 : dm3Var;
            default:
                if (p40Var instanceof ao3) {
                    ao3Var = (ao3) p40Var;
                    int i42 = ao3Var.j;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        ao3Var.j = i42 - Integer.MIN_VALUE;
                    } else {
                        ao3Var = new ao3(this, p40Var);
                    }
                }
                Object obj29 = ao3Var.i;
                int i43 = ao3Var.j;
                if (i43 != 0) {
                    if (i43 == 1) {
                        y02.Q(obj29);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj29);
                Boolean bool7 = (Boolean) ((es1) obj).c(pi.m);
                Object objValueOf7 = Boolean.valueOf(bool7 != null ? bool7.booleanValue() : false);
                ao3Var.j = 1;
                return gn0Var.k(objValueOf7, ao3Var) == obj2 ? obj2 : dm3Var;
        }
    }

    public /* synthetic */ o70(gn0 gn0Var, int i) {
        this.f = i;
        this.g = gn0Var;
    }
}
