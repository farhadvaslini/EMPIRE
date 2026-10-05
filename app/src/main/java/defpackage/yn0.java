package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yn0 implements gn0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ yn0(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(v53 v53Var, p40 p40Var) {
        w81 w81Var;
        String string;
        Context context = (Context) this.g;
        if (p40Var instanceof w81) {
            w81Var = (w81) p40Var;
            int i = w81Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                w81Var.k = i - Integer.MIN_VALUE;
            } else {
                w81Var = new w81(this, p40Var);
            }
        }
        Object obj = w81Var.i;
        int i2 = w81Var.k;
        if (i2 == 0) {
            y02.Q(obj);
            if (v53Var instanceof t53) {
                Object[] array = ((t53) v53Var).a.toArray(new Object[0]);
                string = context.getString(R.string.download_snackbar_resources_ready, Arrays.copyOf(array, array.length));
            } else if (v53Var instanceof s53) {
                Object[] array2 = ((s53) v53Var).a.toArray(new Object[0]);
                string = context.getString(R.string.download_snackbar_resources_missing, Arrays.copyOf(array2, array2.length));
            } else {
                if (!(v53Var instanceof u53)) {
                    c.k();
                    return null;
                }
                string = ((u53) v53Var).a;
            }
            string.getClass();
            c63 c63Var = (c63) this.h;
            w81Var.k = 1;
            Object objB = c63.b(c63Var, string, w81Var);
            y50 y50Var = y50.f;
            if (objB == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        return dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0522  */
    @Override // defpackage.gn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, p40 p40Var) {
        xn0 xn0Var;
        bo0 bo0Var;
        fo0 fo0Var;
        gn0 gn0Var;
        hk1 hk1Var;
        mm1 mm1Var;
        Object ad2Var;
        ff2 ff2Var;
        cf2 cf2Var;
        ch2 ch2Var;
        Object obj2 = obj;
        int i = this.f;
        int i2 = 0;
        int i3 = 0;
        y50 y50Var = y50.f;
        p40 p40Var2 = null;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                if (p40Var instanceof xn0) {
                    xn0Var = (xn0) p40Var;
                    int i4 = xn0Var.j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        xn0Var.j = i4 - Integer.MIN_VALUE;
                    } else {
                        xn0Var = new xn0(this, p40Var);
                    }
                }
                Object objF = xn0Var.i;
                int i5 = xn0Var.j;
                if (i5 == 0) {
                    y02.Q(objF);
                    xn0Var.l = obj2;
                    xn0Var.m = 0;
                    xn0Var.j = 1;
                    objF = ((l70) obj4).f(obj2, xn0Var);
                    if (objF == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            y02.Q(objF);
                            return dm3Var;
                        }
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = xn0Var.m;
                    obj2 = xn0Var.l;
                    y02.Q(objF);
                }
                if (!((Boolean) objF).booleanValue()) {
                    throw new d(this);
                }
                xn0Var.l = null;
                xn0Var.m = i2;
                xn0Var.j = 2;
                if (((gn0) obj3).k(obj2, xn0Var) == y50Var) {
                    return y50Var;
                }
                return dm3Var;
            case 1:
                if (p40Var instanceof bo0) {
                    bo0Var = (bo0) p40Var;
                    int i6 = bo0Var.j;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        bo0Var.j = i6 - Integer.MIN_VALUE;
                    } else {
                        bo0Var = new bo0(this, p40Var);
                    }
                }
                Object objF2 = bo0Var.i;
                int i7 = bo0Var.j;
                if (i7 == 0) {
                    y02.Q(objF2);
                    bo0Var.l = obj2;
                    bo0Var.j = 1;
                    objF2 = ((rs0) obj4).f(obj2, bo0Var);
                    if (objF2 == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i7 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = bo0Var.l;
                    y02.Q(objF2);
                }
                if (!((Boolean) objF2).booleanValue()) {
                    return dm3Var;
                }
                ((qk2) obj3).f = obj2;
                throw new d(this);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                if (p40Var instanceof fo0) {
                    fo0Var = (fo0) p40Var;
                    int i8 = fo0Var.j;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        fo0Var.j = i8 - Integer.MIN_VALUE;
                    } else {
                        fo0Var = new fo0(this, p40Var);
                    }
                }
                Object obj5 = fo0Var.i;
                int i9 = fo0Var.j;
                if (i9 == 0) {
                    y02.Q(obj5);
                    gn0Var = (gn0) obj3;
                    fo0Var.l = obj2;
                    fo0Var.m = gn0Var;
                    fo0Var.n = 0;
                    fo0Var.j = 1;
                    if (((rs0) obj4).f(obj2, fo0Var) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            y02.Q(obj5);
                            return dm3Var;
                        }
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = fo0Var.n;
                    gn0 gn0Var2 = fo0Var.m;
                    Object obj6 = fo0Var.l;
                    y02.Q(obj5);
                    gn0Var = gn0Var2;
                    obj2 = obj6;
                }
                fo0Var.l = null;
                fo0Var.m = null;
                fo0Var.n = i3;
                fo0Var.j = 2;
                if (gn0Var.k(obj2, fo0Var) == y50Var) {
                    return y50Var;
                }
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                s41 s41Var = (s41) obj2;
                ArrayList arrayList = (ArrayList) obj4;
                if (s41Var instanceof wo0) {
                    arrayList.add(s41Var);
                } else if (s41Var instanceof xo0) {
                    arrayList.remove(((xo0) s41Var).a);
                }
                ((os1) obj3).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return a((v53) obj2, p40Var);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                s41 s41Var2 = (s41) obj2;
                pg1 pg1Var = (pg1) obj3;
                as1 as1Var = (as1) obj4;
                if ((s41Var2 instanceof zy0) || (s41Var2 instanceof wo0) || (s41Var2 instanceof zc2)) {
                    as1Var.b(s41Var2);
                } else if (s41Var2 instanceof az0) {
                    as1Var.k(((az0) s41Var2).a);
                } else if (s41Var2 instanceof xo0) {
                    as1Var.k(((xo0) s41Var2).a);
                } else if (s41Var2 instanceof ad2) {
                    as1Var.k(((ad2) s41Var2).a);
                } else if (s41Var2 instanceof yc2) {
                    as1Var.k(((yc2) s41Var2).a);
                }
                Object[] objArr = as1Var.a;
                int i10 = as1Var.b;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    s41 s41Var3 = (s41) objArr[i12];
                    if (s41Var3 instanceof zy0) {
                        pg1Var.getClass();
                        i11 |= 2;
                    } else if (s41Var3 instanceof wo0) {
                        pg1Var.getClass();
                        i11 |= 1;
                    } else if (s41Var3 instanceof zc2) {
                        pg1Var.getClass();
                        i11 |= 4;
                    }
                }
                pg1Var.b.h(i11);
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                if (p40Var instanceof hk1) {
                    hk1Var = (hk1) p40Var;
                    int i13 = hk1Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        hk1Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        hk1Var = new hk1(this, p40Var);
                    }
                }
                Object obj7 = hk1Var.i;
                int i14 = hk1Var.j;
                if (i14 == 0) {
                    y02.Q(obj7);
                    gn0 gn0Var3 = (gn0) obj3;
                    xk3 xk3Var = (xk3) obj2;
                    int iIntValue = xk3Var.f.intValue();
                    int iIntValue2 = xk3Var.g.intValue();
                    boolean zBooleanValue = ((Boolean) xk3Var.h).booleanValue();
                    if (((Boolean) ((os1) obj4).getValue()).booleanValue() && iIntValue == 0 && iIntValue2 == 0 && zBooleanValue) {
                        hk1Var.j = 1;
                        if (gn0Var3.k(obj2, hk1Var) == y50Var) {
                            return y50Var;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj7);
                }
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                nm1 nm1Var = (nm1) obj4;
                LinkedHashMap linkedHashMap = nm1Var.b;
                if (p40Var instanceof mm1) {
                    mm1Var = (mm1) p40Var;
                    int i15 = mm1Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        mm1Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        mm1Var = new mm1(this, p40Var);
                    }
                }
                Object obj8 = mm1Var.i;
                int i16 = mm1Var.j;
                if (i16 == 0) {
                    y02.Q(obj8);
                    gn0 gn0Var4 = (gn0) obj3;
                    s41 s41Var4 = (s41) obj2;
                    if (s41Var4 instanceof zc2) {
                        zc2 zc2Var = new zc2(gy1.d(((zc2) s41Var4).a, nm1Var.a));
                        linkedHashMap.put(s41Var4, zc2Var);
                        ad2Var = zc2Var;
                    } else if (s41Var4 instanceof yc2) {
                        yc2 yc2Var = (yc2) s41Var4;
                        zc2 zc2Var2 = (zc2) linkedHashMap.remove(yc2Var.a);
                        ad2Var = yc2Var;
                        if (zc2Var2 != null) {
                            ad2Var = new yc2(zc2Var2);
                        }
                    } else {
                        boolean z = s41Var4 instanceof ad2;
                        ad2Var = s41Var4;
                        if (z) {
                            ad2 ad2Var2 = (ad2) s41Var4;
                            zc2 zc2Var3 = (zc2) linkedHashMap.remove(ad2Var2.a);
                            ad2Var = ad2Var2;
                            if (zc2Var3 != null) {
                                ad2Var = new ad2(zc2Var3);
                            }
                        }
                    }
                    mm1Var.j = 1;
                    if (gn0Var4.k(ad2Var, mm1Var) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i16 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj8);
                }
                return dm3Var;
            case 8:
                ((os1) obj4).setValue(Boolean.TRUE);
                ((z32) obj3).h(((rk) obj2).c);
                return dm3Var;
            case vr.g /* 9 */:
                if (p40Var instanceof ff2) {
                    ff2Var = (ff2) p40Var;
                    int i17 = ff2Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        ff2Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        ff2Var = new ff2(this, p40Var);
                    }
                }
                Object obj9 = ff2Var.i;
                int i18 = ff2Var.j;
                if (i18 == 0) {
                    y02.Q(obj9);
                    gn0 gn0Var5 = (gn0) obj3;
                    String str = (String) ((es1) obj2).c(lf2.b);
                    Object obj10 = ni0.f;
                    if (str != null) {
                        try {
                            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray((String) obj4);
                            if (jSONArrayOptJSONArray != null) {
                                l41 l41VarS = y02.S(0, jSONArrayOptJSONArray.length());
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = l41VarS.iterator();
                                while (((k41) it).h) {
                                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(((e41) it).nextInt());
                                    if (jSONObjectOptJSONObject != null) {
                                        a71[] a71VarArr = mf2.a;
                                        int iOptInt = jSONObjectOptJSONObject.optInt("id", -1);
                                        if (iOptInt < 0) {
                                            cf2Var = null;
                                        } else {
                                            String strOptString = jSONObjectOptJSONObject.optString("label");
                                            strOptString.getClass();
                                            if (y93.q0(strOptString)) {
                                                strOptString = null;
                                            }
                                            if (strOptString != null) {
                                                String strOptString2 = jSONObjectOptJSONObject.optString("text");
                                                strOptString2.getClass();
                                                if (y93.q0(strOptString2)) {
                                                    strOptString2 = null;
                                                }
                                                if (strOptString2 != null) {
                                                    cf2Var = new cf2(strOptString, strOptString2, iOptInt);
                                                }
                                            }
                                        }
                                    }
                                    if (cf2Var != null) {
                                        arrayList2.add(cf2Var);
                                    }
                                }
                                obj10 = arrayList2;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    ff2Var.j = 1;
                    if (gn0Var5.k(obj10, ff2Var) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i18 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj9);
                }
                return dm3Var;
            case vr.h /* 10 */:
                if (p40Var instanceof ch2) {
                    ch2Var = (ch2) p40Var;
                    int i19 = ch2Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        ch2Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        ch2Var = new ch2(this, p40Var);
                    }
                }
                Object obj11 = ch2Var.i;
                int i20 = ch2Var.j;
                if (i20 == 0) {
                    y02.Q(obj11);
                    r32 r32Var = new r32((vg2) obj4, (mg2) obj2);
                    ch2Var.j = 1;
                    if (((gn0) obj3).k(r32Var, ch2Var) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i20 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj11);
                }
                return dm3Var;
            case 11:
                s41 s41Var5 = (s41) obj2;
                cb cbVar = (cb) obj4;
                if (!(s41Var5 instanceof bd2)) {
                    x50 x50Var = (x50) obj3;
                    ot otVar = cbVar.y;
                    float f = 0.0f;
                    if (otVar == null) {
                        boolean z2 = cbVar.u;
                        la0 la0Var = cbVar.x;
                        otVar = new ot();
                        otVar.a = z2;
                        otVar.b = la0Var;
                        otVar.c = gv3.a(0.0f, 0.01f);
                        otVar.d = new ArrayList();
                        vr.J(cbVar);
                        cbVar.y = otVar;
                    }
                    ArrayList arrayList3 = (ArrayList) otVar.d;
                    if (s41Var5 instanceof zy0) {
                        arrayList3.add(s41Var5);
                    } else if (s41Var5 instanceof az0) {
                        arrayList3.remove(((az0) s41Var5).a);
                    } else if (s41Var5 instanceof wo0) {
                        arrayList3.add(s41Var5);
                    } else if (s41Var5 instanceof xo0) {
                        arrayList3.remove(((xo0) s41Var5).a);
                    } else if (s41Var5 instanceof ue0) {
                        arrayList3.add(s41Var5);
                    } else if (s41Var5 instanceof ve0) {
                        arrayList3.remove(((ve0) s41Var5).a);
                    } else if (s41Var5 instanceof te0) {
                        arrayList3.remove(((te0) s41Var5).a);
                    }
                    s41 s41Var6 = (s41) qx.z0(arrayList3);
                    if (!s51.n((s41) otVar.e, s41Var6)) {
                        if (s41Var6 != null) {
                            ((la0) otVar.b).a();
                            boolean z3 = s41Var6 instanceof zy0;
                            if (z3) {
                                f = 0.08f;
                            } else if (s41Var6 instanceof wo0) {
                                f = 0.1f;
                            } else if (s41Var6 instanceof ue0) {
                                f = 0.16f;
                            }
                            zk3 zk3Var = lo2.a;
                            if (!z3 && ((s41Var6 instanceof wo0) || (s41Var6 instanceof ue0))) {
                                zk3Var = new zk3(45, 0, pg0.c);
                            }
                            cl3.t(x50Var, null, new s60(otVar, f, zk3Var, (p40) null), 3);
                        } else {
                            s41 s41Var7 = (s41) otVar.e;
                            zk3 zk3Var2 = lo2.a;
                            if (!(s41Var7 instanceof zy0) && !(s41Var7 instanceof wo0) && (s41Var7 instanceof ue0)) {
                                zk3Var2 = new zk3(150, 0, pg0.c);
                            }
                            cl3.t(x50Var, null, new hd1(otVar, zk3Var2, p40Var2, 26), 3);
                        }
                        otVar.e = s41Var6;
                    }
                } else if (cbVar.B) {
                    cbVar.p1((bd2) s41Var5);
                } else {
                    cbVar.C.b(s41Var5);
                }
                return dm3Var;
            case vr.i /* 12 */:
                long j = ((gy1) obj2).a;
                ed edVar = (ed) obj4;
                if ((((gy1) edVar.d()).a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((gy1) edVar.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objF3 = edVar.f(p40Var, new gy1(j));
                    return objF3 == y50Var ? objF3 : dm3Var;
                }
                cl3.t((x50) obj3, null, new sc(edVar, j, null, 1), 3);
                return dm3Var;
            default:
                s41 s41Var8 = (s41) obj2;
                ok2 ok2Var = (ok2) obj4;
                if (s41Var8 instanceof zc2) {
                    ok2Var.f++;
                } else if ((s41Var8 instanceof ad2) || (s41Var8 instanceof yc2)) {
                    ok2Var.f--;
                }
                boolean z4 = ok2Var.f > 0;
                ai3 ai3Var = (ai3) obj3;
                if (ai3Var.w != z4) {
                    ai3Var.w = z4;
                    lq.J(ai3Var);
                }
                return dm3Var;
        }
    }

    public /* synthetic */ yn0(gn0 gn0Var, Object obj, int i) {
        this.f = i;
        this.h = gn0Var;
        this.g = obj;
    }
}
