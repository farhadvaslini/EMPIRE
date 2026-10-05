package defpackage;

import android.app.Application;
import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class go implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ go(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
        this.l = obj6;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        final int i2 = 0;
        switch (i) {
            case 0:
                i62[] i62VarArr = (i62[]) obj7;
                List list = (List) obj6;
                en1 en1Var = (en1) obj5;
                ok2 ok2Var = (ok2) obj4;
                ok2 ok2Var2 = (ok2) obj3;
                ho hoVar = (ho) obj2;
                h62 h62Var = (h62) obj;
                int length = i62VarArr.length;
                int i3 = 0;
                while (i2 < length) {
                    i62 i62Var = i62VarArr[i2];
                    i62Var.getClass();
                    eo.b(h62Var, i62Var, (xm1) list.get(i3), en1Var.getLayoutDirection(), ok2Var.f, ok2Var2.f, hoVar.a);
                    i2++;
                    i3++;
                }
                break;
            case 1:
                final c33 c33Var = (c33) obj7;
                final nu1 nu1Var = (nu1) obj6;
                final sa1 sa1Var = (sa1) obj5;
                final Context context = (Context) obj4;
                final go3 go3Var = (go3) obj3;
                final os1 os1Var = (os1) obj2;
                ju1 ju1Var = (ju1) obj;
                ju1Var.getClass();
                final int i4 = 1;
                br.p(ju1Var, "main", null, new d00(-351974805, new ts0() { // from class: h91
                    @Override // defpackage.ts0
                    public final Object l(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i5 = i2;
                        dm3 dm3Var2 = dm3.a;
                        final nu1 nu1Var2 = nu1Var;
                        c33 c33Var2 = c33Var;
                        sd sdVar = (sd) obj8;
                        nv0 nv0Var = (nv0) obj10;
                        ((Integer) obj11).getClass();
                        sdVar.getClass();
                        ((qt1) obj9).getClass();
                        switch (i5) {
                            case 0:
                                final int i6 = 0;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(108023211, new rs0() { // from class: p91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        int i7 = i6;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        final nu1 nu1Var3 = nu1Var2;
                                        switch (i7) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 12);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zH2 = nv0Var2.h(nu1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        objO2 = new q91(nu1Var3, 13);
                                                        nv0Var2.j0(objO2);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO2;
                                                    boolean zH3 = nv0Var2.h(nu1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        objO3 = new q91(nu1Var3, 14);
                                                        nv0Var2.j0(objO3);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO3;
                                                    boolean zH4 = nv0Var2.h(nu1Var3);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new q91(nu1Var3, 15);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    cs0 cs0Var4 = (cs0) objO4;
                                                    boolean zH5 = nv0Var2.h(nu1Var3);
                                                    Object objO5 = nv0Var2.O();
                                                    if (zH5 || objO5 == zjVar) {
                                                        objO5 = new q91(nu1Var3, 16);
                                                        nv0Var2.j0(objO5);
                                                    }
                                                    cs0 cs0Var5 = (cs0) objO5;
                                                    boolean zH6 = nv0Var2.h(nu1Var3);
                                                    Object objO6 = nv0Var2.O();
                                                    if (zH6 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 17);
                                                        nv0Var2.j0(objO6);
                                                    }
                                                    cs0 cs0Var6 = (cs0) objO6;
                                                    boolean zH7 = nv0Var2.h(nu1Var3);
                                                    Object objO7 = nv0Var2.O();
                                                    if (zH7 || objO7 == zjVar) {
                                                        objO7 = new q91(nu1Var3, 18);
                                                        nv0Var2.j0(objO7);
                                                    }
                                                    cs0 cs0Var7 = (cs0) objO7;
                                                    boolean zH8 = nv0Var2.h(nu1Var3);
                                                    Object objO8 = nv0Var2.O();
                                                    if (zH8 || objO8 == zjVar) {
                                                        objO8 = new u91(nu1Var3, 1);
                                                        nv0Var2.j0(objO8);
                                                    }
                                                    ns0 ns0Var = (ns0) objO8;
                                                    boolean zH9 = nv0Var2.h(nu1Var3);
                                                    Object objO9 = nv0Var2.O();
                                                    if (zH9 || objO9 == zjVar) {
                                                        objO9 = new us0() { // from class: y91
                                                            @Override // defpackage.us0
                                                            public final Object j(Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
                                                                Object next;
                                                                String str;
                                                                Map mapSingletonMap;
                                                                String str2;
                                                                Object value;
                                                                Map mapSingletonMap2;
                                                                String str3 = (String) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                String str4 = (String) obj16;
                                                                xy2 xy2Var = (xy2) obj17;
                                                                String str5 = (String) obj18;
                                                                str3.getClass();
                                                                str4.getClass();
                                                                xy2Var.getClass();
                                                                str5.getClass();
                                                                n40 n40Var = dh2.h;
                                                                i93 i93Var = dh2.b;
                                                                Iterator it = ((Map) i93Var.getValue()).values().iterator();
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        next = null;
                                                                        break;
                                                                    }
                                                                    next = it.next();
                                                                    vg2 vg2Var = (vg2) next;
                                                                    if (s51.n(vg2Var.b, str3) && vg2Var.c == iIntValue2 && s51.n(vg2Var.d, str4)) {
                                                                        break;
                                                                    }
                                                                }
                                                                vg2 vg2Var2 = (vg2) next;
                                                                if (vg2Var2 != null) {
                                                                    str2 = vg2Var2.a;
                                                                    if (vg2Var2.e != xy2Var || !s51.n(vg2Var2.f, str5)) {
                                                                        do {
                                                                            value = i93Var.getValue();
                                                                            Map map = (Map) value;
                                                                            vg2 vg2VarA = vg2.a(vg2Var2, xy2Var, str5, 79);
                                                                            map.getClass();
                                                                            if (map.isEmpty()) {
                                                                                mapSingletonMap2 = Collections.singletonMap(str2, vg2VarA);
                                                                                mapSingletonMap2.getClass();
                                                                            } else {
                                                                                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                                                                                linkedHashMap.put(str2, vg2VarA);
                                                                                mapSingletonMap2 = linkedHashMap;
                                                                            }
                                                                        } while (!i93Var.h(value, mapSingletonMap2));
                                                                        cl3.t(n40Var, null, new wg2(str3, iIntValue2, str4, xy2Var, str5, null, 0), 3);
                                                                    }
                                                                } else {
                                                                    Application application = dh2.d;
                                                                    if (application == null) {
                                                                        c.q("RaksampInstanceManager not initialized");
                                                                        return null;
                                                                    }
                                                                    String string = UUID.randomUUID().toString();
                                                                    string.getClass();
                                                                    vi2 vi2Var = new vi2(application);
                                                                    while (true) {
                                                                        Object value2 = i93Var.getValue();
                                                                        Map map2 = (Map) value2;
                                                                        String str6 = str5;
                                                                        xy2 xy2Var2 = xy2Var;
                                                                        String str7 = str4;
                                                                        int i8 = iIntValue2;
                                                                        String str8 = str3;
                                                                        str = string;
                                                                        vg2 vg2Var3 = new vg2(str, str8, i8, str7, xy2Var2, str6, vi2Var);
                                                                        str3 = str8;
                                                                        iIntValue2 = i8;
                                                                        str4 = str7;
                                                                        xy2Var = xy2Var2;
                                                                        str5 = str6;
                                                                        map2.getClass();
                                                                        if (map2.isEmpty()) {
                                                                            mapSingletonMap = Collections.singletonMap(str, vg2Var3);
                                                                            mapSingletonMap.getClass();
                                                                        } else {
                                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                                                                            linkedHashMap2.put(str, vg2Var3);
                                                                            mapSingletonMap = linkedHashMap2;
                                                                        }
                                                                        if (i93Var.h(value2, mapSingletonMap)) {
                                                                            break;
                                                                        }
                                                                        string = str;
                                                                    }
                                                                    cl3.t(n40Var, null, new wg2(str3, iIntValue2, str4, xy2Var, str5, null, 1), 3);
                                                                    str2 = str;
                                                                }
                                                                String strConcat = "raksamp/".concat(str2);
                                                                nu1 nu1Var4 = nu1Var3;
                                                                nu1Var4.getClass();
                                                                wt1 wt1Var = nu1Var4.b;
                                                                wt1Var.getClass();
                                                                wt1Var.l(strConcat, new vu1(true, false, -1, false, false, -1, -1));
                                                                return dm3.a;
                                                            }
                                                        };
                                                        nv0Var2.j0(objO9);
                                                    }
                                                    w7.o(cs0Var, cs0Var2, cs0Var3, cs0Var4, cs0Var5, cs0Var6, cs0Var7, ns0Var, (us0) objO9, nv0Var2, 0);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    boolean zH10 = nv0Var3.h(nu1Var3);
                                                    Object objO10 = nv0Var3.O();
                                                    if (zH10 || objO10 == zjVar) {
                                                        objO10 = new q91(nu1Var3, 7);
                                                        nv0Var3.j0(objO10);
                                                    }
                                                    cs0 cs0Var8 = (cs0) objO10;
                                                    boolean zH11 = nv0Var3.h(nu1Var3);
                                                    Object objO11 = nv0Var3.O();
                                                    if (zH11 || objO11 == zjVar) {
                                                        objO11 = new q91(nu1Var3, 8);
                                                        nv0Var3.j0(objO11);
                                                    }
                                                    cs0 cs0Var9 = (cs0) objO11;
                                                    boolean zH12 = nv0Var3.h(nu1Var3);
                                                    Object objO12 = nv0Var3.O();
                                                    if (zH12 || objO12 == zjVar) {
                                                        objO12 = new q91(nu1Var3, 9);
                                                        nv0Var3.j0(objO12);
                                                    }
                                                    cs0 cs0Var10 = (cs0) objO12;
                                                    boolean zH13 = nv0Var3.h(nu1Var3);
                                                    Object objO13 = nv0Var3.O();
                                                    if (zH13 || objO13 == zjVar) {
                                                        objO13 = new q91(nu1Var3, 10);
                                                        nv0Var3.j0(objO13);
                                                    }
                                                    cs0 cs0Var11 = (cs0) objO13;
                                                    boolean zH14 = nv0Var3.h(nu1Var3);
                                                    Object objO14 = nv0Var3.O();
                                                    if (zH14 || objO14 == zjVar) {
                                                        objO14 = new q91(nu1Var3, 11);
                                                        nv0Var3.j0(objO14);
                                                    }
                                                    g12.d(cs0Var8, cs0Var9, cs0Var10, cs0Var11, (cs0) objO14, nv0Var3, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                            default:
                                final int i7 = 1;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(225343725, new rs0() { // from class: p91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        int i72 = i7;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        final nu1 nu1Var3 = nu1Var2;
                                        switch (i72) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 12);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zH2 = nv0Var2.h(nu1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        objO2 = new q91(nu1Var3, 13);
                                                        nv0Var2.j0(objO2);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO2;
                                                    boolean zH3 = nv0Var2.h(nu1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        objO3 = new q91(nu1Var3, 14);
                                                        nv0Var2.j0(objO3);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO3;
                                                    boolean zH4 = nv0Var2.h(nu1Var3);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new q91(nu1Var3, 15);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    cs0 cs0Var4 = (cs0) objO4;
                                                    boolean zH5 = nv0Var2.h(nu1Var3);
                                                    Object objO5 = nv0Var2.O();
                                                    if (zH5 || objO5 == zjVar) {
                                                        objO5 = new q91(nu1Var3, 16);
                                                        nv0Var2.j0(objO5);
                                                    }
                                                    cs0 cs0Var5 = (cs0) objO5;
                                                    boolean zH6 = nv0Var2.h(nu1Var3);
                                                    Object objO6 = nv0Var2.O();
                                                    if (zH6 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 17);
                                                        nv0Var2.j0(objO6);
                                                    }
                                                    cs0 cs0Var6 = (cs0) objO6;
                                                    boolean zH7 = nv0Var2.h(nu1Var3);
                                                    Object objO7 = nv0Var2.O();
                                                    if (zH7 || objO7 == zjVar) {
                                                        objO7 = new q91(nu1Var3, 18);
                                                        nv0Var2.j0(objO7);
                                                    }
                                                    cs0 cs0Var7 = (cs0) objO7;
                                                    boolean zH8 = nv0Var2.h(nu1Var3);
                                                    Object objO8 = nv0Var2.O();
                                                    if (zH8 || objO8 == zjVar) {
                                                        objO8 = new u91(nu1Var3, 1);
                                                        nv0Var2.j0(objO8);
                                                    }
                                                    ns0 ns0Var = (ns0) objO8;
                                                    boolean zH9 = nv0Var2.h(nu1Var3);
                                                    Object objO9 = nv0Var2.O();
                                                    if (zH9 || objO9 == zjVar) {
                                                        objO9 = new us0() { // from class: y91
                                                            @Override // defpackage.us0
                                                            public final Object j(Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
                                                                Object next;
                                                                String str;
                                                                Map mapSingletonMap;
                                                                String str2;
                                                                Object value;
                                                                Map mapSingletonMap2;
                                                                String str3 = (String) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                String str4 = (String) obj16;
                                                                xy2 xy2Var = (xy2) obj17;
                                                                String str5 = (String) obj18;
                                                                str3.getClass();
                                                                str4.getClass();
                                                                xy2Var.getClass();
                                                                str5.getClass();
                                                                n40 n40Var = dh2.h;
                                                                i93 i93Var = dh2.b;
                                                                Iterator it = ((Map) i93Var.getValue()).values().iterator();
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        next = null;
                                                                        break;
                                                                    }
                                                                    next = it.next();
                                                                    vg2 vg2Var = (vg2) next;
                                                                    if (s51.n(vg2Var.b, str3) && vg2Var.c == iIntValue2 && s51.n(vg2Var.d, str4)) {
                                                                        break;
                                                                    }
                                                                }
                                                                vg2 vg2Var2 = (vg2) next;
                                                                if (vg2Var2 != null) {
                                                                    str2 = vg2Var2.a;
                                                                    if (vg2Var2.e != xy2Var || !s51.n(vg2Var2.f, str5)) {
                                                                        do {
                                                                            value = i93Var.getValue();
                                                                            Map map = (Map) value;
                                                                            vg2 vg2VarA = vg2.a(vg2Var2, xy2Var, str5, 79);
                                                                            map.getClass();
                                                                            if (map.isEmpty()) {
                                                                                mapSingletonMap2 = Collections.singletonMap(str2, vg2VarA);
                                                                                mapSingletonMap2.getClass();
                                                                            } else {
                                                                                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                                                                                linkedHashMap.put(str2, vg2VarA);
                                                                                mapSingletonMap2 = linkedHashMap;
                                                                            }
                                                                        } while (!i93Var.h(value, mapSingletonMap2));
                                                                        cl3.t(n40Var, null, new wg2(str3, iIntValue2, str4, xy2Var, str5, null, 0), 3);
                                                                    }
                                                                } else {
                                                                    Application application = dh2.d;
                                                                    if (application == null) {
                                                                        c.q("RaksampInstanceManager not initialized");
                                                                        return null;
                                                                    }
                                                                    String string = UUID.randomUUID().toString();
                                                                    string.getClass();
                                                                    vi2 vi2Var = new vi2(application);
                                                                    while (true) {
                                                                        Object value2 = i93Var.getValue();
                                                                        Map map2 = (Map) value2;
                                                                        String str6 = str5;
                                                                        xy2 xy2Var2 = xy2Var;
                                                                        String str7 = str4;
                                                                        int i8 = iIntValue2;
                                                                        String str8 = str3;
                                                                        str = string;
                                                                        vg2 vg2Var3 = new vg2(str, str8, i8, str7, xy2Var2, str6, vi2Var);
                                                                        str3 = str8;
                                                                        iIntValue2 = i8;
                                                                        str4 = str7;
                                                                        xy2Var = xy2Var2;
                                                                        str5 = str6;
                                                                        map2.getClass();
                                                                        if (map2.isEmpty()) {
                                                                            mapSingletonMap = Collections.singletonMap(str, vg2Var3);
                                                                            mapSingletonMap.getClass();
                                                                        } else {
                                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                                                                            linkedHashMap2.put(str, vg2Var3);
                                                                            mapSingletonMap = linkedHashMap2;
                                                                        }
                                                                        if (i93Var.h(value2, mapSingletonMap)) {
                                                                            break;
                                                                        }
                                                                        string = str;
                                                                    }
                                                                    cl3.t(n40Var, null, new wg2(str3, iIntValue2, str4, xy2Var, str5, null, 1), 3);
                                                                    str2 = str;
                                                                }
                                                                String strConcat = "raksamp/".concat(str2);
                                                                nu1 nu1Var4 = nu1Var3;
                                                                nu1Var4.getClass();
                                                                wt1 wt1Var = nu1Var4.b;
                                                                wt1Var.getClass();
                                                                wt1Var.l(strConcat, new vu1(true, false, -1, false, false, -1, -1));
                                                                return dm3.a;
                                                            }
                                                        };
                                                        nv0Var2.j0(objO9);
                                                    }
                                                    w7.o(cs0Var, cs0Var2, cs0Var3, cs0Var4, cs0Var5, cs0Var6, cs0Var7, ns0Var, (us0) objO9, nv0Var2, 0);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    boolean zH10 = nv0Var3.h(nu1Var3);
                                                    Object objO10 = nv0Var3.O();
                                                    if (zH10 || objO10 == zjVar) {
                                                        objO10 = new q91(nu1Var3, 7);
                                                        nv0Var3.j0(objO10);
                                                    }
                                                    cs0 cs0Var8 = (cs0) objO10;
                                                    boolean zH11 = nv0Var3.h(nu1Var3);
                                                    Object objO11 = nv0Var3.O();
                                                    if (zH11 || objO11 == zjVar) {
                                                        objO11 = new q91(nu1Var3, 8);
                                                        nv0Var3.j0(objO11);
                                                    }
                                                    cs0 cs0Var9 = (cs0) objO11;
                                                    boolean zH12 = nv0Var3.h(nu1Var3);
                                                    Object objO12 = nv0Var3.O();
                                                    if (zH12 || objO12 == zjVar) {
                                                        objO12 = new q91(nu1Var3, 9);
                                                        nv0Var3.j0(objO12);
                                                    }
                                                    cs0 cs0Var10 = (cs0) objO12;
                                                    boolean zH13 = nv0Var3.h(nu1Var3);
                                                    Object objO13 = nv0Var3.O();
                                                    if (zH13 || objO13 == zjVar) {
                                                        objO13 = new q91(nu1Var3, 10);
                                                        nv0Var3.j0(objO13);
                                                    }
                                                    cs0 cs0Var11 = (cs0) objO13;
                                                    boolean zH14 = nv0Var3.h(nu1Var3);
                                                    Object objO14 = nv0Var3.O();
                                                    if (zH14 || objO14 == zjVar) {
                                                        objO14 = new q91(nu1Var3, 11);
                                                        nv0Var3.j0(objO14);
                                                    }
                                                    g12.d(cs0Var8, cs0Var9, cs0Var10, cs0Var11, (cs0) objO14, nv0Var3, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                        }
                        return dm3Var2;
                    }
                }, true), 254);
                br.p(ju1Var, "log_launcher", null, new d00(-502107564, new ts0() { // from class: i91
                    @Override // defpackage.ts0
                    public final Object l(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i5 = i4;
                        dm3 dm3Var2 = dm3.a;
                        final nu1 nu1Var2 = nu1Var;
                        final sa1 sa1Var2 = sa1Var;
                        c33 c33Var2 = c33Var;
                        sd sdVar = (sd) obj8;
                        nv0 nv0Var = (nv0) obj10;
                        ((Integer) obj11).getClass();
                        sdVar.getClass();
                        ((qt1) obj9).getClass();
                        switch (i5) {
                            case 0:
                                final int i6 = 0;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(375485068, new rs0() { // from class: s91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        Context context2;
                                        Object next;
                                        int i7 = i6;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        nu1 nu1Var3 = nu1Var2;
                                        switch (i7) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    sa1 sa1Var3 = sa1Var2;
                                                    os1 os1VarO = br.o(sa1Var3.f0, nv0Var2);
                                                    os1 os1VarO2 = br.o(sa1Var3.g0, nv0Var2);
                                                    Context context3 = (Context) nv0Var2.j(x7.b);
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 6);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zBooleanValue = ((Boolean) os1VarO.getValue()).booleanValue();
                                                    boolean zBooleanValue2 = ((Boolean) os1VarO2.getValue()).booleanValue();
                                                    boolean zH2 = nv0Var2.h(sa1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        context2 = context3;
                                                        e91 e91Var = new e91(1, sa1Var3, sa1.class, "saveShowServerNotification", "saveShowServerNotification(Z)V", 0, 0, 3);
                                                        nv0Var2.j0(e91Var);
                                                        objO2 = e91Var;
                                                    } else {
                                                        context2 = context3;
                                                    }
                                                    ns0 ns0Var = (ns0) ((ct0) objO2);
                                                    boolean zH3 = nv0Var2.h(sa1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        e91 e91Var2 = new e91(1, sa1Var3, sa1.class, "saveShowRaksampNotification", "saveShowRaksampNotification(Z)V", 0, 0, 4);
                                                        nv0Var2.j0(e91Var2);
                                                        objO3 = e91Var2;
                                                    }
                                                    ns0 ns0Var2 = (ns0) ((ct0) objO3);
                                                    boolean zH4 = nv0Var2.h(context2);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new v91(context2, 0);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    g12.l(cs0Var, zBooleanValue, zBooleanValue2, ns0Var, ns0Var2, (cs0) objO4, nv0Var2, 0);
                                                }
                                                break;
                                            case 1:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    sa1 sa1Var4 = sa1Var2;
                                                    os1 os1VarO3 = br.o(sa1Var4.W, nv0Var3);
                                                    boolean zF = nv0Var3.f((String) os1VarO3.getValue());
                                                    Object objO5 = nv0Var3.O();
                                                    if (zF || objO5 == zjVar) {
                                                        Iterator it = ti.l.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (s51.n(((ti) next).name(), (String) os1VarO3.getValue())) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        objO5 = (ti) next;
                                                        if (objO5 == null) {
                                                            objO5 = ti.h;
                                                        }
                                                        nv0Var3.j0(objO5);
                                                    }
                                                    ti tiVar = (ti) objO5;
                                                    String strM = oz2.M(2131624248, nv0Var3);
                                                    boolean zH5 = nv0Var3.h(nu1Var3);
                                                    Object objO6 = nv0Var3.O();
                                                    if (zH5 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 21);
                                                        nv0Var3.j0(objO6);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO6;
                                                    boolean zH6 = nv0Var3.h(sa1Var4);
                                                    Object objO7 = nv0Var3.O();
                                                    if (zH6 || objO7 == zjVar) {
                                                        objO7 = new r91(sa1Var4, 2);
                                                        nv0Var3.j0(objO7);
                                                    }
                                                    uq.c(strM, null, true, tiVar, cs0Var2, (ns0) objO7, nv0Var3, 384, 2);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var4 = (nv0) obj12;
                                                int iIntValue3 = ((Integer) obj13).intValue();
                                                if (!nv0Var4.R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                    nv0Var4.U();
                                                } else {
                                                    sa1 sa1Var5 = sa1Var2;
                                                    os1 os1VarO4 = br.o(sa1Var5.X, nv0Var4);
                                                    os1 os1VarO5 = br.o(sa1Var5.a0, nv0Var4);
                                                    os1 os1VarO6 = br.o(sa1Var5.b0, nv0Var4);
                                                    os1 os1VarO7 = br.o(sa1Var5.c0, nv0Var4);
                                                    os1 os1VarO8 = br.o(sa1Var5.d0, nv0Var4);
                                                    os1 os1VarO9 = br.o(sa1Var5.e0, nv0Var4);
                                                    boolean zH7 = nv0Var4.h(nu1Var3);
                                                    Object objO8 = nv0Var4.O();
                                                    if (zH7 || objO8 == zjVar) {
                                                        objO8 = new q91(nu1Var3, 5);
                                                        nv0Var4.j0(objO8);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO8;
                                                    boolean zBooleanValue3 = ((Boolean) os1VarO4.getValue()).booleanValue();
                                                    boolean zBooleanValue4 = ((Boolean) os1VarO5.getValue()).booleanValue();
                                                    qf2 qf2Var = (qf2) os1VarO6.getValue();
                                                    boolean zBooleanValue5 = ((Boolean) os1VarO7.getValue()).booleanValue();
                                                    int iIntValue4 = ((Number) os1VarO8.getValue()).intValue();
                                                    int iIntValue5 = ((Number) os1VarO9.getValue()).intValue();
                                                    boolean zH8 = nv0Var4.h(sa1Var5);
                                                    Object objO9 = nv0Var4.O();
                                                    if (zH8 || objO9 == zjVar) {
                                                        e91 e91Var3 = new e91(1, sa1Var5, sa1.class, "saveNativeKeyboardEnabled", "saveNativeKeyboardEnabled(Z)V", 0, 0, 11);
                                                        nv0Var4.j0(e91Var3);
                                                        objO9 = e91Var3;
                                                    }
                                                    ns0 ns0Var3 = (ns0) ((ct0) objO9);
                                                    boolean zH9 = nv0Var4.h(sa1Var5);
                                                    Object objO10 = nv0Var4.O();
                                                    if (zH9 || objO10 == zjVar) {
                                                        e91 e91Var4 = new e91(1, sa1Var5, sa1.class, "saveShowChatTimestamp", "saveShowChatTimestamp(Z)V", 0, 0, 12);
                                                        nv0Var4.j0(e91Var4);
                                                        objO10 = e91Var4;
                                                    }
                                                    ns0 ns0Var4 = (ns0) ((ct0) objO10);
                                                    boolean zH10 = nv0Var4.h(sa1Var5);
                                                    Object objO11 = nv0Var4.O();
                                                    if (zH10 || objO11 == zjVar) {
                                                        e91 e91Var5 = new e91(1, sa1Var5, sa1.class, "saveRadarPosition", "saveRadarPosition(Ltop/th1nk/samp/core/config/RadarPosition;)V", 0, 0, 13);
                                                        nv0Var4.j0(e91Var5);
                                                        objO11 = e91Var5;
                                                    }
                                                    ns0 ns0Var5 = (ns0) ((ct0) objO11);
                                                    boolean zH11 = nv0Var4.h(sa1Var5);
                                                    Object objO12 = nv0Var4.O();
                                                    if (zH11 || objO12 == zjVar) {
                                                        e91 e91Var6 = new e91(1, sa1Var5, sa1.class, "saveEmulatePcClientCheck", "saveEmulatePcClientCheck(Z)V", 0, 0, 14);
                                                        nv0Var4.j0(e91Var6);
                                                        objO12 = e91Var6;
                                                    }
                                                    ns0 ns0Var6 = (ns0) ((ct0) objO12);
                                                    boolean zH12 = nv0Var4.h(sa1Var5);
                                                    Object objO13 = nv0Var4.O();
                                                    if (zH12 || objO13 == zjVar) {
                                                        e91 e91Var7 = new e91(1, sa1Var5, sa1.class, "saveFpsLimit", "saveFpsLimit(I)V", 0, 0, 15);
                                                        nv0Var4.j0(e91Var7);
                                                        objO13 = e91Var7;
                                                    }
                                                    ns0 ns0Var7 = (ns0) ((ct0) objO13);
                                                    boolean zH13 = nv0Var4.h(sa1Var5);
                                                    Object objO14 = nv0Var4.O();
                                                    if (zH13 || objO14 == zjVar) {
                                                        e91 e91Var8 = new e91(1, sa1Var5, sa1.class, "saveFontSize", "saveFontSize(I)V", 0, 0, 16);
                                                        nv0Var4.j0(e91Var8);
                                                        objO14 = e91Var8;
                                                    }
                                                    g12.i(cs0Var3, zBooleanValue3, zBooleanValue4, qf2Var, zBooleanValue5, iIntValue4, iIntValue5, ns0Var3, ns0Var4, ns0Var5, ns0Var6, ns0Var7, (ns0) ((ct0) objO14), nv0Var4, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                            case 1:
                                final int i7 = 1;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(-825645676, new rs0() { // from class: s91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        Context context2;
                                        Object next;
                                        int i72 = i7;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        nu1 nu1Var3 = nu1Var2;
                                        switch (i72) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    sa1 sa1Var3 = sa1Var2;
                                                    os1 os1VarO = br.o(sa1Var3.f0, nv0Var2);
                                                    os1 os1VarO2 = br.o(sa1Var3.g0, nv0Var2);
                                                    Context context3 = (Context) nv0Var2.j(x7.b);
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 6);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zBooleanValue = ((Boolean) os1VarO.getValue()).booleanValue();
                                                    boolean zBooleanValue2 = ((Boolean) os1VarO2.getValue()).booleanValue();
                                                    boolean zH2 = nv0Var2.h(sa1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        context2 = context3;
                                                        e91 e91Var = new e91(1, sa1Var3, sa1.class, "saveShowServerNotification", "saveShowServerNotification(Z)V", 0, 0, 3);
                                                        nv0Var2.j0(e91Var);
                                                        objO2 = e91Var;
                                                    } else {
                                                        context2 = context3;
                                                    }
                                                    ns0 ns0Var = (ns0) ((ct0) objO2);
                                                    boolean zH3 = nv0Var2.h(sa1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        e91 e91Var2 = new e91(1, sa1Var3, sa1.class, "saveShowRaksampNotification", "saveShowRaksampNotification(Z)V", 0, 0, 4);
                                                        nv0Var2.j0(e91Var2);
                                                        objO3 = e91Var2;
                                                    }
                                                    ns0 ns0Var2 = (ns0) ((ct0) objO3);
                                                    boolean zH4 = nv0Var2.h(context2);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new v91(context2, 0);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    g12.l(cs0Var, zBooleanValue, zBooleanValue2, ns0Var, ns0Var2, (cs0) objO4, nv0Var2, 0);
                                                }
                                                break;
                                            case 1:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    sa1 sa1Var4 = sa1Var2;
                                                    os1 os1VarO3 = br.o(sa1Var4.W, nv0Var3);
                                                    boolean zF = nv0Var3.f((String) os1VarO3.getValue());
                                                    Object objO5 = nv0Var3.O();
                                                    if (zF || objO5 == zjVar) {
                                                        Iterator it = ti.l.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (s51.n(((ti) next).name(), (String) os1VarO3.getValue())) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        objO5 = (ti) next;
                                                        if (objO5 == null) {
                                                            objO5 = ti.h;
                                                        }
                                                        nv0Var3.j0(objO5);
                                                    }
                                                    ti tiVar = (ti) objO5;
                                                    String strM = oz2.M(2131624248, nv0Var3);
                                                    boolean zH5 = nv0Var3.h(nu1Var3);
                                                    Object objO6 = nv0Var3.O();
                                                    if (zH5 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 21);
                                                        nv0Var3.j0(objO6);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO6;
                                                    boolean zH6 = nv0Var3.h(sa1Var4);
                                                    Object objO7 = nv0Var3.O();
                                                    if (zH6 || objO7 == zjVar) {
                                                        objO7 = new r91(sa1Var4, 2);
                                                        nv0Var3.j0(objO7);
                                                    }
                                                    uq.c(strM, null, true, tiVar, cs0Var2, (ns0) objO7, nv0Var3, 384, 2);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var4 = (nv0) obj12;
                                                int iIntValue3 = ((Integer) obj13).intValue();
                                                if (!nv0Var4.R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                    nv0Var4.U();
                                                } else {
                                                    sa1 sa1Var5 = sa1Var2;
                                                    os1 os1VarO4 = br.o(sa1Var5.X, nv0Var4);
                                                    os1 os1VarO5 = br.o(sa1Var5.a0, nv0Var4);
                                                    os1 os1VarO6 = br.o(sa1Var5.b0, nv0Var4);
                                                    os1 os1VarO7 = br.o(sa1Var5.c0, nv0Var4);
                                                    os1 os1VarO8 = br.o(sa1Var5.d0, nv0Var4);
                                                    os1 os1VarO9 = br.o(sa1Var5.e0, nv0Var4);
                                                    boolean zH7 = nv0Var4.h(nu1Var3);
                                                    Object objO8 = nv0Var4.O();
                                                    if (zH7 || objO8 == zjVar) {
                                                        objO8 = new q91(nu1Var3, 5);
                                                        nv0Var4.j0(objO8);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO8;
                                                    boolean zBooleanValue3 = ((Boolean) os1VarO4.getValue()).booleanValue();
                                                    boolean zBooleanValue4 = ((Boolean) os1VarO5.getValue()).booleanValue();
                                                    qf2 qf2Var = (qf2) os1VarO6.getValue();
                                                    boolean zBooleanValue5 = ((Boolean) os1VarO7.getValue()).booleanValue();
                                                    int iIntValue4 = ((Number) os1VarO8.getValue()).intValue();
                                                    int iIntValue5 = ((Number) os1VarO9.getValue()).intValue();
                                                    boolean zH8 = nv0Var4.h(sa1Var5);
                                                    Object objO9 = nv0Var4.O();
                                                    if (zH8 || objO9 == zjVar) {
                                                        e91 e91Var3 = new e91(1, sa1Var5, sa1.class, "saveNativeKeyboardEnabled", "saveNativeKeyboardEnabled(Z)V", 0, 0, 11);
                                                        nv0Var4.j0(e91Var3);
                                                        objO9 = e91Var3;
                                                    }
                                                    ns0 ns0Var3 = (ns0) ((ct0) objO9);
                                                    boolean zH9 = nv0Var4.h(sa1Var5);
                                                    Object objO10 = nv0Var4.O();
                                                    if (zH9 || objO10 == zjVar) {
                                                        e91 e91Var4 = new e91(1, sa1Var5, sa1.class, "saveShowChatTimestamp", "saveShowChatTimestamp(Z)V", 0, 0, 12);
                                                        nv0Var4.j0(e91Var4);
                                                        objO10 = e91Var4;
                                                    }
                                                    ns0 ns0Var4 = (ns0) ((ct0) objO10);
                                                    boolean zH10 = nv0Var4.h(sa1Var5);
                                                    Object objO11 = nv0Var4.O();
                                                    if (zH10 || objO11 == zjVar) {
                                                        e91 e91Var5 = new e91(1, sa1Var5, sa1.class, "saveRadarPosition", "saveRadarPosition(Ltop/th1nk/samp/core/config/RadarPosition;)V", 0, 0, 13);
                                                        nv0Var4.j0(e91Var5);
                                                        objO11 = e91Var5;
                                                    }
                                                    ns0 ns0Var5 = (ns0) ((ct0) objO11);
                                                    boolean zH11 = nv0Var4.h(sa1Var5);
                                                    Object objO12 = nv0Var4.O();
                                                    if (zH11 || objO12 == zjVar) {
                                                        e91 e91Var6 = new e91(1, sa1Var5, sa1.class, "saveEmulatePcClientCheck", "saveEmulatePcClientCheck(Z)V", 0, 0, 14);
                                                        nv0Var4.j0(e91Var6);
                                                        objO12 = e91Var6;
                                                    }
                                                    ns0 ns0Var6 = (ns0) ((ct0) objO12);
                                                    boolean zH12 = nv0Var4.h(sa1Var5);
                                                    Object objO13 = nv0Var4.O();
                                                    if (zH12 || objO13 == zjVar) {
                                                        e91 e91Var7 = new e91(1, sa1Var5, sa1.class, "saveFpsLimit", "saveFpsLimit(I)V", 0, 0, 15);
                                                        nv0Var4.j0(e91Var7);
                                                        objO13 = e91Var7;
                                                    }
                                                    ns0 ns0Var7 = (ns0) ((ct0) objO13);
                                                    boolean zH13 = nv0Var4.h(sa1Var5);
                                                    Object objO14 = nv0Var4.O();
                                                    if (zH13 || objO14 == zjVar) {
                                                        e91 e91Var8 = new e91(1, sa1Var5, sa1.class, "saveFontSize", "saveFontSize(I)V", 0, 0, 16);
                                                        nv0Var4.j0(e91Var8);
                                                        objO14 = e91Var8;
                                                    }
                                                    g12.i(cs0Var3, zBooleanValue3, zBooleanValue4, qf2Var, zBooleanValue5, iIntValue4, iIntValue5, ns0Var3, ns0Var4, ns0Var5, ns0Var6, ns0Var7, (ns0) ((ct0) objO14), nv0Var4, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                            default:
                                final int i8 = 2;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(-225080304, new rs0() { // from class: s91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        Context context2;
                                        Object next;
                                        int i72 = i8;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        nu1 nu1Var3 = nu1Var2;
                                        switch (i72) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    sa1 sa1Var3 = sa1Var2;
                                                    os1 os1VarO = br.o(sa1Var3.f0, nv0Var2);
                                                    os1 os1VarO2 = br.o(sa1Var3.g0, nv0Var2);
                                                    Context context3 = (Context) nv0Var2.j(x7.b);
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 6);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zBooleanValue = ((Boolean) os1VarO.getValue()).booleanValue();
                                                    boolean zBooleanValue2 = ((Boolean) os1VarO2.getValue()).booleanValue();
                                                    boolean zH2 = nv0Var2.h(sa1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        context2 = context3;
                                                        e91 e91Var = new e91(1, sa1Var3, sa1.class, "saveShowServerNotification", "saveShowServerNotification(Z)V", 0, 0, 3);
                                                        nv0Var2.j0(e91Var);
                                                        objO2 = e91Var;
                                                    } else {
                                                        context2 = context3;
                                                    }
                                                    ns0 ns0Var = (ns0) ((ct0) objO2);
                                                    boolean zH3 = nv0Var2.h(sa1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        e91 e91Var2 = new e91(1, sa1Var3, sa1.class, "saveShowRaksampNotification", "saveShowRaksampNotification(Z)V", 0, 0, 4);
                                                        nv0Var2.j0(e91Var2);
                                                        objO3 = e91Var2;
                                                    }
                                                    ns0 ns0Var2 = (ns0) ((ct0) objO3);
                                                    boolean zH4 = nv0Var2.h(context2);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new v91(context2, 0);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    g12.l(cs0Var, zBooleanValue, zBooleanValue2, ns0Var, ns0Var2, (cs0) objO4, nv0Var2, 0);
                                                }
                                                break;
                                            case 1:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    sa1 sa1Var4 = sa1Var2;
                                                    os1 os1VarO3 = br.o(sa1Var4.W, nv0Var3);
                                                    boolean zF = nv0Var3.f((String) os1VarO3.getValue());
                                                    Object objO5 = nv0Var3.O();
                                                    if (zF || objO5 == zjVar) {
                                                        Iterator it = ti.l.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (s51.n(((ti) next).name(), (String) os1VarO3.getValue())) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        objO5 = (ti) next;
                                                        if (objO5 == null) {
                                                            objO5 = ti.h;
                                                        }
                                                        nv0Var3.j0(objO5);
                                                    }
                                                    ti tiVar = (ti) objO5;
                                                    String strM = oz2.M(2131624248, nv0Var3);
                                                    boolean zH5 = nv0Var3.h(nu1Var3);
                                                    Object objO6 = nv0Var3.O();
                                                    if (zH5 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 21);
                                                        nv0Var3.j0(objO6);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO6;
                                                    boolean zH6 = nv0Var3.h(sa1Var4);
                                                    Object objO7 = nv0Var3.O();
                                                    if (zH6 || objO7 == zjVar) {
                                                        objO7 = new r91(sa1Var4, 2);
                                                        nv0Var3.j0(objO7);
                                                    }
                                                    uq.c(strM, null, true, tiVar, cs0Var2, (ns0) objO7, nv0Var3, 384, 2);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var4 = (nv0) obj12;
                                                int iIntValue3 = ((Integer) obj13).intValue();
                                                if (!nv0Var4.R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                    nv0Var4.U();
                                                } else {
                                                    sa1 sa1Var5 = sa1Var2;
                                                    os1 os1VarO4 = br.o(sa1Var5.X, nv0Var4);
                                                    os1 os1VarO5 = br.o(sa1Var5.a0, nv0Var4);
                                                    os1 os1VarO6 = br.o(sa1Var5.b0, nv0Var4);
                                                    os1 os1VarO7 = br.o(sa1Var5.c0, nv0Var4);
                                                    os1 os1VarO8 = br.o(sa1Var5.d0, nv0Var4);
                                                    os1 os1VarO9 = br.o(sa1Var5.e0, nv0Var4);
                                                    boolean zH7 = nv0Var4.h(nu1Var3);
                                                    Object objO8 = nv0Var4.O();
                                                    if (zH7 || objO8 == zjVar) {
                                                        objO8 = new q91(nu1Var3, 5);
                                                        nv0Var4.j0(objO8);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO8;
                                                    boolean zBooleanValue3 = ((Boolean) os1VarO4.getValue()).booleanValue();
                                                    boolean zBooleanValue4 = ((Boolean) os1VarO5.getValue()).booleanValue();
                                                    qf2 qf2Var = (qf2) os1VarO6.getValue();
                                                    boolean zBooleanValue5 = ((Boolean) os1VarO7.getValue()).booleanValue();
                                                    int iIntValue4 = ((Number) os1VarO8.getValue()).intValue();
                                                    int iIntValue5 = ((Number) os1VarO9.getValue()).intValue();
                                                    boolean zH8 = nv0Var4.h(sa1Var5);
                                                    Object objO9 = nv0Var4.O();
                                                    if (zH8 || objO9 == zjVar) {
                                                        e91 e91Var3 = new e91(1, sa1Var5, sa1.class, "saveNativeKeyboardEnabled", "saveNativeKeyboardEnabled(Z)V", 0, 0, 11);
                                                        nv0Var4.j0(e91Var3);
                                                        objO9 = e91Var3;
                                                    }
                                                    ns0 ns0Var3 = (ns0) ((ct0) objO9);
                                                    boolean zH9 = nv0Var4.h(sa1Var5);
                                                    Object objO10 = nv0Var4.O();
                                                    if (zH9 || objO10 == zjVar) {
                                                        e91 e91Var4 = new e91(1, sa1Var5, sa1.class, "saveShowChatTimestamp", "saveShowChatTimestamp(Z)V", 0, 0, 12);
                                                        nv0Var4.j0(e91Var4);
                                                        objO10 = e91Var4;
                                                    }
                                                    ns0 ns0Var4 = (ns0) ((ct0) objO10);
                                                    boolean zH10 = nv0Var4.h(sa1Var5);
                                                    Object objO11 = nv0Var4.O();
                                                    if (zH10 || objO11 == zjVar) {
                                                        e91 e91Var5 = new e91(1, sa1Var5, sa1.class, "saveRadarPosition", "saveRadarPosition(Ltop/th1nk/samp/core/config/RadarPosition;)V", 0, 0, 13);
                                                        nv0Var4.j0(e91Var5);
                                                        objO11 = e91Var5;
                                                    }
                                                    ns0 ns0Var5 = (ns0) ((ct0) objO11);
                                                    boolean zH11 = nv0Var4.h(sa1Var5);
                                                    Object objO12 = nv0Var4.O();
                                                    if (zH11 || objO12 == zjVar) {
                                                        e91 e91Var6 = new e91(1, sa1Var5, sa1.class, "saveEmulatePcClientCheck", "saveEmulatePcClientCheck(Z)V", 0, 0, 14);
                                                        nv0Var4.j0(e91Var6);
                                                        objO12 = e91Var6;
                                                    }
                                                    ns0 ns0Var6 = (ns0) ((ct0) objO12);
                                                    boolean zH12 = nv0Var4.h(sa1Var5);
                                                    Object objO13 = nv0Var4.O();
                                                    if (zH12 || objO13 == zjVar) {
                                                        e91 e91Var7 = new e91(1, sa1Var5, sa1.class, "saveFpsLimit", "saveFpsLimit(I)V", 0, 0, 15);
                                                        nv0Var4.j0(e91Var7);
                                                        objO13 = e91Var7;
                                                    }
                                                    ns0 ns0Var7 = (ns0) ((ct0) objO13);
                                                    boolean zH13 = nv0Var4.h(sa1Var5);
                                                    Object objO14 = nv0Var4.O();
                                                    if (zH13 || objO14 == zjVar) {
                                                        e91 e91Var8 = new e91(1, sa1Var5, sa1.class, "saveFontSize", "saveFontSize(I)V", 0, 0, 16);
                                                        nv0Var4.j0(e91Var8);
                                                        objO14 = e91Var8;
                                                    }
                                                    g12.i(cs0Var3, zBooleanValue3, zBooleanValue4, qf2Var, zBooleanValue5, iIntValue4, iIntValue5, ns0Var3, ns0Var4, ns0Var5, ns0Var6, ns0Var7, (ns0) ((ct0) objO14), nv0Var4, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                        }
                        return dm3Var2;
                    }
                }, true), 254);
                br.p(ju1Var, "log_samp", null, new d00(-351966221, new l91(sa1Var, context, nu1Var, i2), true), 254);
                br.p(ju1Var, "log_chat", null, new d00(-201824878, new ts0() { // from class: m91
                    @Override // defpackage.ts0
                    public final Object l(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i5 = i2;
                        dm3 dm3Var2 = dm3.a;
                        zj zjVar = c20.a;
                        p40 p40Var = null;
                        nu1 nu1Var2 = nu1Var;
                        Context context2 = context;
                        switch (i5) {
                            case 0:
                                nv0 nv0Var = (nv0) obj10;
                                ((Integer) obj11).getClass();
                                ((sd) obj8).getClass();
                                ((qt1) obj9).getClass();
                                String strM = oz2.M(2131624243, nv0Var);
                                File externalFilesDir = context2.getExternalFilesDir(null);
                                if (externalFilesDir == null) {
                                    externalFilesDir = context2.getFilesDir();
                                }
                                String absolutePath = new File(externalFilesDir, "chatlog.txt").getAbsolutePath();
                                boolean zH = nv0Var.h(nu1Var2);
                                Object objO = nv0Var.O();
                                if (zH || objO == zjVar) {
                                    objO = new q91(nu1Var2, 3);
                                    nv0Var.j0(objO);
                                }
                                uq.c(strM, absolutePath, false, null, (cs0) objO, null, nv0Var, 0, 44);
                                break;
                            default:
                                nv0 nv0Var2 = (nv0) obj10;
                                ((Integer) obj11).getClass();
                                ((sd) obj8).getClass();
                                ((qt1) obj9).getClass();
                                os1 os1VarO = br.o(dh2.c, nv0Var2);
                                File externalFilesDir2 = context2.getExternalFilesDir(null);
                                Object objO2 = nv0Var2.O();
                                if (objO2 == zjVar) {
                                    objO2 = b32.w(ni0.f);
                                    nv0Var2.j0(objO2);
                                }
                                os1 os1Var2 = (os1) objO2;
                                Map map = (Map) os1VarO.getValue();
                                boolean zH2 = nv0Var2.h(externalFilesDir2);
                                Object objO3 = nv0Var2.O();
                                if (zH2 || objO3 == zjVar) {
                                    objO3 = new pw(externalFilesDir2, os1Var2, p40Var, 7);
                                    nv0Var2.j0(objO3);
                                }
                                rn.m(map, externalFilesDir2, (rs0) objO3, nv0Var2);
                                List list2 = (List) os1Var2.getValue();
                                Map map2 = (Map) os1VarO.getValue();
                                boolean zH3 = nv0Var2.h(nu1Var2);
                                Object objO4 = nv0Var2.O();
                                if (zH3 || objO4 == zjVar) {
                                    objO4 = new q91(nu1Var2, 1);
                                    nv0Var2.j0(objO4);
                                }
                                cs0 cs0Var = (cs0) objO4;
                                boolean zH4 = nv0Var2.h(nu1Var2);
                                Object objO5 = nv0Var2.O();
                                if (zH4 || objO5 == zjVar) {
                                    objO5 = new u91(nu1Var2, 0);
                                    nv0Var2.j0(objO5);
                                }
                                da1.c(list2, map2, cs0Var, (ns0) objO5, nv0Var2, 0);
                                break;
                        }
                        return dm3Var2;
                    }
                }, true), 254);
                br.p(ju1Var, "settings_general", null, new d00(-51683535, new n91(c33Var, sa1Var, go3Var, nu1Var, context, 0), true), 254);
                final int i5 = 2;
                br.p(ju1Var, "settings_ingame", null, new d00(98457808, new ts0() { // from class: i91
                    @Override // defpackage.ts0
                    public final Object l(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i52 = i5;
                        dm3 dm3Var2 = dm3.a;
                        final nu1 nu1Var2 = nu1Var;
                        final sa1 sa1Var2 = sa1Var;
                        c33 c33Var2 = c33Var;
                        sd sdVar = (sd) obj8;
                        nv0 nv0Var = (nv0) obj10;
                        ((Integer) obj11).getClass();
                        sdVar.getClass();
                        ((qt1) obj9).getClass();
                        switch (i52) {
                            case 0:
                                final int i6 = 0;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(375485068, new rs0() { // from class: s91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        Context context2;
                                        Object next;
                                        int i72 = i6;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        nu1 nu1Var3 = nu1Var2;
                                        switch (i72) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    sa1 sa1Var3 = sa1Var2;
                                                    os1 os1VarO = br.o(sa1Var3.f0, nv0Var2);
                                                    os1 os1VarO2 = br.o(sa1Var3.g0, nv0Var2);
                                                    Context context3 = (Context) nv0Var2.j(x7.b);
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 6);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zBooleanValue = ((Boolean) os1VarO.getValue()).booleanValue();
                                                    boolean zBooleanValue2 = ((Boolean) os1VarO2.getValue()).booleanValue();
                                                    boolean zH2 = nv0Var2.h(sa1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        context2 = context3;
                                                        e91 e91Var = new e91(1, sa1Var3, sa1.class, "saveShowServerNotification", "saveShowServerNotification(Z)V", 0, 0, 3);
                                                        nv0Var2.j0(e91Var);
                                                        objO2 = e91Var;
                                                    } else {
                                                        context2 = context3;
                                                    }
                                                    ns0 ns0Var = (ns0) ((ct0) objO2);
                                                    boolean zH3 = nv0Var2.h(sa1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        e91 e91Var2 = new e91(1, sa1Var3, sa1.class, "saveShowRaksampNotification", "saveShowRaksampNotification(Z)V", 0, 0, 4);
                                                        nv0Var2.j0(e91Var2);
                                                        objO3 = e91Var2;
                                                    }
                                                    ns0 ns0Var2 = (ns0) ((ct0) objO3);
                                                    boolean zH4 = nv0Var2.h(context2);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new v91(context2, 0);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    g12.l(cs0Var, zBooleanValue, zBooleanValue2, ns0Var, ns0Var2, (cs0) objO4, nv0Var2, 0);
                                                }
                                                break;
                                            case 1:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    sa1 sa1Var4 = sa1Var2;
                                                    os1 os1VarO3 = br.o(sa1Var4.W, nv0Var3);
                                                    boolean zF = nv0Var3.f((String) os1VarO3.getValue());
                                                    Object objO5 = nv0Var3.O();
                                                    if (zF || objO5 == zjVar) {
                                                        Iterator it = ti.l.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (s51.n(((ti) next).name(), (String) os1VarO3.getValue())) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        objO5 = (ti) next;
                                                        if (objO5 == null) {
                                                            objO5 = ti.h;
                                                        }
                                                        nv0Var3.j0(objO5);
                                                    }
                                                    ti tiVar = (ti) objO5;
                                                    String strM = oz2.M(2131624248, nv0Var3);
                                                    boolean zH5 = nv0Var3.h(nu1Var3);
                                                    Object objO6 = nv0Var3.O();
                                                    if (zH5 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 21);
                                                        nv0Var3.j0(objO6);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO6;
                                                    boolean zH6 = nv0Var3.h(sa1Var4);
                                                    Object objO7 = nv0Var3.O();
                                                    if (zH6 || objO7 == zjVar) {
                                                        objO7 = new r91(sa1Var4, 2);
                                                        nv0Var3.j0(objO7);
                                                    }
                                                    uq.c(strM, null, true, tiVar, cs0Var2, (ns0) objO7, nv0Var3, 384, 2);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var4 = (nv0) obj12;
                                                int iIntValue3 = ((Integer) obj13).intValue();
                                                if (!nv0Var4.R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                    nv0Var4.U();
                                                } else {
                                                    sa1 sa1Var5 = sa1Var2;
                                                    os1 os1VarO4 = br.o(sa1Var5.X, nv0Var4);
                                                    os1 os1VarO5 = br.o(sa1Var5.a0, nv0Var4);
                                                    os1 os1VarO6 = br.o(sa1Var5.b0, nv0Var4);
                                                    os1 os1VarO7 = br.o(sa1Var5.c0, nv0Var4);
                                                    os1 os1VarO8 = br.o(sa1Var5.d0, nv0Var4);
                                                    os1 os1VarO9 = br.o(sa1Var5.e0, nv0Var4);
                                                    boolean zH7 = nv0Var4.h(nu1Var3);
                                                    Object objO8 = nv0Var4.O();
                                                    if (zH7 || objO8 == zjVar) {
                                                        objO8 = new q91(nu1Var3, 5);
                                                        nv0Var4.j0(objO8);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO8;
                                                    boolean zBooleanValue3 = ((Boolean) os1VarO4.getValue()).booleanValue();
                                                    boolean zBooleanValue4 = ((Boolean) os1VarO5.getValue()).booleanValue();
                                                    qf2 qf2Var = (qf2) os1VarO6.getValue();
                                                    boolean zBooleanValue5 = ((Boolean) os1VarO7.getValue()).booleanValue();
                                                    int iIntValue4 = ((Number) os1VarO8.getValue()).intValue();
                                                    int iIntValue5 = ((Number) os1VarO9.getValue()).intValue();
                                                    boolean zH8 = nv0Var4.h(sa1Var5);
                                                    Object objO9 = nv0Var4.O();
                                                    if (zH8 || objO9 == zjVar) {
                                                        e91 e91Var3 = new e91(1, sa1Var5, sa1.class, "saveNativeKeyboardEnabled", "saveNativeKeyboardEnabled(Z)V", 0, 0, 11);
                                                        nv0Var4.j0(e91Var3);
                                                        objO9 = e91Var3;
                                                    }
                                                    ns0 ns0Var3 = (ns0) ((ct0) objO9);
                                                    boolean zH9 = nv0Var4.h(sa1Var5);
                                                    Object objO10 = nv0Var4.O();
                                                    if (zH9 || objO10 == zjVar) {
                                                        e91 e91Var4 = new e91(1, sa1Var5, sa1.class, "saveShowChatTimestamp", "saveShowChatTimestamp(Z)V", 0, 0, 12);
                                                        nv0Var4.j0(e91Var4);
                                                        objO10 = e91Var4;
                                                    }
                                                    ns0 ns0Var4 = (ns0) ((ct0) objO10);
                                                    boolean zH10 = nv0Var4.h(sa1Var5);
                                                    Object objO11 = nv0Var4.O();
                                                    if (zH10 || objO11 == zjVar) {
                                                        e91 e91Var5 = new e91(1, sa1Var5, sa1.class, "saveRadarPosition", "saveRadarPosition(Ltop/th1nk/samp/core/config/RadarPosition;)V", 0, 0, 13);
                                                        nv0Var4.j0(e91Var5);
                                                        objO11 = e91Var5;
                                                    }
                                                    ns0 ns0Var5 = (ns0) ((ct0) objO11);
                                                    boolean zH11 = nv0Var4.h(sa1Var5);
                                                    Object objO12 = nv0Var4.O();
                                                    if (zH11 || objO12 == zjVar) {
                                                        e91 e91Var6 = new e91(1, sa1Var5, sa1.class, "saveEmulatePcClientCheck", "saveEmulatePcClientCheck(Z)V", 0, 0, 14);
                                                        nv0Var4.j0(e91Var6);
                                                        objO12 = e91Var6;
                                                    }
                                                    ns0 ns0Var6 = (ns0) ((ct0) objO12);
                                                    boolean zH12 = nv0Var4.h(sa1Var5);
                                                    Object objO13 = nv0Var4.O();
                                                    if (zH12 || objO13 == zjVar) {
                                                        e91 e91Var7 = new e91(1, sa1Var5, sa1.class, "saveFpsLimit", "saveFpsLimit(I)V", 0, 0, 15);
                                                        nv0Var4.j0(e91Var7);
                                                        objO13 = e91Var7;
                                                    }
                                                    ns0 ns0Var7 = (ns0) ((ct0) objO13);
                                                    boolean zH13 = nv0Var4.h(sa1Var5);
                                                    Object objO14 = nv0Var4.O();
                                                    if (zH13 || objO14 == zjVar) {
                                                        e91 e91Var8 = new e91(1, sa1Var5, sa1.class, "saveFontSize", "saveFontSize(I)V", 0, 0, 16);
                                                        nv0Var4.j0(e91Var8);
                                                        objO14 = e91Var8;
                                                    }
                                                    g12.i(cs0Var3, zBooleanValue3, zBooleanValue4, qf2Var, zBooleanValue5, iIntValue4, iIntValue5, ns0Var3, ns0Var4, ns0Var5, ns0Var6, ns0Var7, (ns0) ((ct0) objO14), nv0Var4, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                            case 1:
                                final int i7 = 1;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(-825645676, new rs0() { // from class: s91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        Context context2;
                                        Object next;
                                        int i72 = i7;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        nu1 nu1Var3 = nu1Var2;
                                        switch (i72) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    sa1 sa1Var3 = sa1Var2;
                                                    os1 os1VarO = br.o(sa1Var3.f0, nv0Var2);
                                                    os1 os1VarO2 = br.o(sa1Var3.g0, nv0Var2);
                                                    Context context3 = (Context) nv0Var2.j(x7.b);
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 6);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zBooleanValue = ((Boolean) os1VarO.getValue()).booleanValue();
                                                    boolean zBooleanValue2 = ((Boolean) os1VarO2.getValue()).booleanValue();
                                                    boolean zH2 = nv0Var2.h(sa1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        context2 = context3;
                                                        e91 e91Var = new e91(1, sa1Var3, sa1.class, "saveShowServerNotification", "saveShowServerNotification(Z)V", 0, 0, 3);
                                                        nv0Var2.j0(e91Var);
                                                        objO2 = e91Var;
                                                    } else {
                                                        context2 = context3;
                                                    }
                                                    ns0 ns0Var = (ns0) ((ct0) objO2);
                                                    boolean zH3 = nv0Var2.h(sa1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        e91 e91Var2 = new e91(1, sa1Var3, sa1.class, "saveShowRaksampNotification", "saveShowRaksampNotification(Z)V", 0, 0, 4);
                                                        nv0Var2.j0(e91Var2);
                                                        objO3 = e91Var2;
                                                    }
                                                    ns0 ns0Var2 = (ns0) ((ct0) objO3);
                                                    boolean zH4 = nv0Var2.h(context2);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new v91(context2, 0);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    g12.l(cs0Var, zBooleanValue, zBooleanValue2, ns0Var, ns0Var2, (cs0) objO4, nv0Var2, 0);
                                                }
                                                break;
                                            case 1:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    sa1 sa1Var4 = sa1Var2;
                                                    os1 os1VarO3 = br.o(sa1Var4.W, nv0Var3);
                                                    boolean zF = nv0Var3.f((String) os1VarO3.getValue());
                                                    Object objO5 = nv0Var3.O();
                                                    if (zF || objO5 == zjVar) {
                                                        Iterator it = ti.l.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (s51.n(((ti) next).name(), (String) os1VarO3.getValue())) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        objO5 = (ti) next;
                                                        if (objO5 == null) {
                                                            objO5 = ti.h;
                                                        }
                                                        nv0Var3.j0(objO5);
                                                    }
                                                    ti tiVar = (ti) objO5;
                                                    String strM = oz2.M(2131624248, nv0Var3);
                                                    boolean zH5 = nv0Var3.h(nu1Var3);
                                                    Object objO6 = nv0Var3.O();
                                                    if (zH5 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 21);
                                                        nv0Var3.j0(objO6);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO6;
                                                    boolean zH6 = nv0Var3.h(sa1Var4);
                                                    Object objO7 = nv0Var3.O();
                                                    if (zH6 || objO7 == zjVar) {
                                                        objO7 = new r91(sa1Var4, 2);
                                                        nv0Var3.j0(objO7);
                                                    }
                                                    uq.c(strM, null, true, tiVar, cs0Var2, (ns0) objO7, nv0Var3, 384, 2);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var4 = (nv0) obj12;
                                                int iIntValue3 = ((Integer) obj13).intValue();
                                                if (!nv0Var4.R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                    nv0Var4.U();
                                                } else {
                                                    sa1 sa1Var5 = sa1Var2;
                                                    os1 os1VarO4 = br.o(sa1Var5.X, nv0Var4);
                                                    os1 os1VarO5 = br.o(sa1Var5.a0, nv0Var4);
                                                    os1 os1VarO6 = br.o(sa1Var5.b0, nv0Var4);
                                                    os1 os1VarO7 = br.o(sa1Var5.c0, nv0Var4);
                                                    os1 os1VarO8 = br.o(sa1Var5.d0, nv0Var4);
                                                    os1 os1VarO9 = br.o(sa1Var5.e0, nv0Var4);
                                                    boolean zH7 = nv0Var4.h(nu1Var3);
                                                    Object objO8 = nv0Var4.O();
                                                    if (zH7 || objO8 == zjVar) {
                                                        objO8 = new q91(nu1Var3, 5);
                                                        nv0Var4.j0(objO8);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO8;
                                                    boolean zBooleanValue3 = ((Boolean) os1VarO4.getValue()).booleanValue();
                                                    boolean zBooleanValue4 = ((Boolean) os1VarO5.getValue()).booleanValue();
                                                    qf2 qf2Var = (qf2) os1VarO6.getValue();
                                                    boolean zBooleanValue5 = ((Boolean) os1VarO7.getValue()).booleanValue();
                                                    int iIntValue4 = ((Number) os1VarO8.getValue()).intValue();
                                                    int iIntValue5 = ((Number) os1VarO9.getValue()).intValue();
                                                    boolean zH8 = nv0Var4.h(sa1Var5);
                                                    Object objO9 = nv0Var4.O();
                                                    if (zH8 || objO9 == zjVar) {
                                                        e91 e91Var3 = new e91(1, sa1Var5, sa1.class, "saveNativeKeyboardEnabled", "saveNativeKeyboardEnabled(Z)V", 0, 0, 11);
                                                        nv0Var4.j0(e91Var3);
                                                        objO9 = e91Var3;
                                                    }
                                                    ns0 ns0Var3 = (ns0) ((ct0) objO9);
                                                    boolean zH9 = nv0Var4.h(sa1Var5);
                                                    Object objO10 = nv0Var4.O();
                                                    if (zH9 || objO10 == zjVar) {
                                                        e91 e91Var4 = new e91(1, sa1Var5, sa1.class, "saveShowChatTimestamp", "saveShowChatTimestamp(Z)V", 0, 0, 12);
                                                        nv0Var4.j0(e91Var4);
                                                        objO10 = e91Var4;
                                                    }
                                                    ns0 ns0Var4 = (ns0) ((ct0) objO10);
                                                    boolean zH10 = nv0Var4.h(sa1Var5);
                                                    Object objO11 = nv0Var4.O();
                                                    if (zH10 || objO11 == zjVar) {
                                                        e91 e91Var5 = new e91(1, sa1Var5, sa1.class, "saveRadarPosition", "saveRadarPosition(Ltop/th1nk/samp/core/config/RadarPosition;)V", 0, 0, 13);
                                                        nv0Var4.j0(e91Var5);
                                                        objO11 = e91Var5;
                                                    }
                                                    ns0 ns0Var5 = (ns0) ((ct0) objO11);
                                                    boolean zH11 = nv0Var4.h(sa1Var5);
                                                    Object objO12 = nv0Var4.O();
                                                    if (zH11 || objO12 == zjVar) {
                                                        e91 e91Var6 = new e91(1, sa1Var5, sa1.class, "saveEmulatePcClientCheck", "saveEmulatePcClientCheck(Z)V", 0, 0, 14);
                                                        nv0Var4.j0(e91Var6);
                                                        objO12 = e91Var6;
                                                    }
                                                    ns0 ns0Var6 = (ns0) ((ct0) objO12);
                                                    boolean zH12 = nv0Var4.h(sa1Var5);
                                                    Object objO13 = nv0Var4.O();
                                                    if (zH12 || objO13 == zjVar) {
                                                        e91 e91Var7 = new e91(1, sa1Var5, sa1.class, "saveFpsLimit", "saveFpsLimit(I)V", 0, 0, 15);
                                                        nv0Var4.j0(e91Var7);
                                                        objO13 = e91Var7;
                                                    }
                                                    ns0 ns0Var7 = (ns0) ((ct0) objO13);
                                                    boolean zH13 = nv0Var4.h(sa1Var5);
                                                    Object objO14 = nv0Var4.O();
                                                    if (zH13 || objO14 == zjVar) {
                                                        e91 e91Var8 = new e91(1, sa1Var5, sa1.class, "saveFontSize", "saveFontSize(I)V", 0, 0, 16);
                                                        nv0Var4.j0(e91Var8);
                                                        objO14 = e91Var8;
                                                    }
                                                    g12.i(cs0Var3, zBooleanValue3, zBooleanValue4, qf2Var, zBooleanValue5, iIntValue4, iIntValue5, ns0Var3, ns0Var4, ns0Var5, ns0Var6, ns0Var7, (ns0) ((ct0) objO14), nv0Var4, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                            default:
                                final int i8 = 2;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(-225080304, new rs0() { // from class: s91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        Context context2;
                                        Object next;
                                        int i72 = i8;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        nu1 nu1Var3 = nu1Var2;
                                        switch (i72) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    sa1 sa1Var3 = sa1Var2;
                                                    os1 os1VarO = br.o(sa1Var3.f0, nv0Var2);
                                                    os1 os1VarO2 = br.o(sa1Var3.g0, nv0Var2);
                                                    Context context3 = (Context) nv0Var2.j(x7.b);
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 6);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zBooleanValue = ((Boolean) os1VarO.getValue()).booleanValue();
                                                    boolean zBooleanValue2 = ((Boolean) os1VarO2.getValue()).booleanValue();
                                                    boolean zH2 = nv0Var2.h(sa1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        context2 = context3;
                                                        e91 e91Var = new e91(1, sa1Var3, sa1.class, "saveShowServerNotification", "saveShowServerNotification(Z)V", 0, 0, 3);
                                                        nv0Var2.j0(e91Var);
                                                        objO2 = e91Var;
                                                    } else {
                                                        context2 = context3;
                                                    }
                                                    ns0 ns0Var = (ns0) ((ct0) objO2);
                                                    boolean zH3 = nv0Var2.h(sa1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        e91 e91Var2 = new e91(1, sa1Var3, sa1.class, "saveShowRaksampNotification", "saveShowRaksampNotification(Z)V", 0, 0, 4);
                                                        nv0Var2.j0(e91Var2);
                                                        objO3 = e91Var2;
                                                    }
                                                    ns0 ns0Var2 = (ns0) ((ct0) objO3);
                                                    boolean zH4 = nv0Var2.h(context2);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new v91(context2, 0);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    g12.l(cs0Var, zBooleanValue, zBooleanValue2, ns0Var, ns0Var2, (cs0) objO4, nv0Var2, 0);
                                                }
                                                break;
                                            case 1:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    sa1 sa1Var4 = sa1Var2;
                                                    os1 os1VarO3 = br.o(sa1Var4.W, nv0Var3);
                                                    boolean zF = nv0Var3.f((String) os1VarO3.getValue());
                                                    Object objO5 = nv0Var3.O();
                                                    if (zF || objO5 == zjVar) {
                                                        Iterator it = ti.l.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (s51.n(((ti) next).name(), (String) os1VarO3.getValue())) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        objO5 = (ti) next;
                                                        if (objO5 == null) {
                                                            objO5 = ti.h;
                                                        }
                                                        nv0Var3.j0(objO5);
                                                    }
                                                    ti tiVar = (ti) objO5;
                                                    String strM = oz2.M(2131624248, nv0Var3);
                                                    boolean zH5 = nv0Var3.h(nu1Var3);
                                                    Object objO6 = nv0Var3.O();
                                                    if (zH5 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 21);
                                                        nv0Var3.j0(objO6);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO6;
                                                    boolean zH6 = nv0Var3.h(sa1Var4);
                                                    Object objO7 = nv0Var3.O();
                                                    if (zH6 || objO7 == zjVar) {
                                                        objO7 = new r91(sa1Var4, 2);
                                                        nv0Var3.j0(objO7);
                                                    }
                                                    uq.c(strM, null, true, tiVar, cs0Var2, (ns0) objO7, nv0Var3, 384, 2);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var4 = (nv0) obj12;
                                                int iIntValue3 = ((Integer) obj13).intValue();
                                                if (!nv0Var4.R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                    nv0Var4.U();
                                                } else {
                                                    sa1 sa1Var5 = sa1Var2;
                                                    os1 os1VarO4 = br.o(sa1Var5.X, nv0Var4);
                                                    os1 os1VarO5 = br.o(sa1Var5.a0, nv0Var4);
                                                    os1 os1VarO6 = br.o(sa1Var5.b0, nv0Var4);
                                                    os1 os1VarO7 = br.o(sa1Var5.c0, nv0Var4);
                                                    os1 os1VarO8 = br.o(sa1Var5.d0, nv0Var4);
                                                    os1 os1VarO9 = br.o(sa1Var5.e0, nv0Var4);
                                                    boolean zH7 = nv0Var4.h(nu1Var3);
                                                    Object objO8 = nv0Var4.O();
                                                    if (zH7 || objO8 == zjVar) {
                                                        objO8 = new q91(nu1Var3, 5);
                                                        nv0Var4.j0(objO8);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO8;
                                                    boolean zBooleanValue3 = ((Boolean) os1VarO4.getValue()).booleanValue();
                                                    boolean zBooleanValue4 = ((Boolean) os1VarO5.getValue()).booleanValue();
                                                    qf2 qf2Var = (qf2) os1VarO6.getValue();
                                                    boolean zBooleanValue5 = ((Boolean) os1VarO7.getValue()).booleanValue();
                                                    int iIntValue4 = ((Number) os1VarO8.getValue()).intValue();
                                                    int iIntValue5 = ((Number) os1VarO9.getValue()).intValue();
                                                    boolean zH8 = nv0Var4.h(sa1Var5);
                                                    Object objO9 = nv0Var4.O();
                                                    if (zH8 || objO9 == zjVar) {
                                                        e91 e91Var3 = new e91(1, sa1Var5, sa1.class, "saveNativeKeyboardEnabled", "saveNativeKeyboardEnabled(Z)V", 0, 0, 11);
                                                        nv0Var4.j0(e91Var3);
                                                        objO9 = e91Var3;
                                                    }
                                                    ns0 ns0Var3 = (ns0) ((ct0) objO9);
                                                    boolean zH9 = nv0Var4.h(sa1Var5);
                                                    Object objO10 = nv0Var4.O();
                                                    if (zH9 || objO10 == zjVar) {
                                                        e91 e91Var4 = new e91(1, sa1Var5, sa1.class, "saveShowChatTimestamp", "saveShowChatTimestamp(Z)V", 0, 0, 12);
                                                        nv0Var4.j0(e91Var4);
                                                        objO10 = e91Var4;
                                                    }
                                                    ns0 ns0Var4 = (ns0) ((ct0) objO10);
                                                    boolean zH10 = nv0Var4.h(sa1Var5);
                                                    Object objO11 = nv0Var4.O();
                                                    if (zH10 || objO11 == zjVar) {
                                                        e91 e91Var5 = new e91(1, sa1Var5, sa1.class, "saveRadarPosition", "saveRadarPosition(Ltop/th1nk/samp/core/config/RadarPosition;)V", 0, 0, 13);
                                                        nv0Var4.j0(e91Var5);
                                                        objO11 = e91Var5;
                                                    }
                                                    ns0 ns0Var5 = (ns0) ((ct0) objO11);
                                                    boolean zH11 = nv0Var4.h(sa1Var5);
                                                    Object objO12 = nv0Var4.O();
                                                    if (zH11 || objO12 == zjVar) {
                                                        e91 e91Var6 = new e91(1, sa1Var5, sa1.class, "saveEmulatePcClientCheck", "saveEmulatePcClientCheck(Z)V", 0, 0, 14);
                                                        nv0Var4.j0(e91Var6);
                                                        objO12 = e91Var6;
                                                    }
                                                    ns0 ns0Var6 = (ns0) ((ct0) objO12);
                                                    boolean zH12 = nv0Var4.h(sa1Var5);
                                                    Object objO13 = nv0Var4.O();
                                                    if (zH12 || objO13 == zjVar) {
                                                        e91 e91Var7 = new e91(1, sa1Var5, sa1.class, "saveFpsLimit", "saveFpsLimit(I)V", 0, 0, 15);
                                                        nv0Var4.j0(e91Var7);
                                                        objO13 = e91Var7;
                                                    }
                                                    ns0 ns0Var7 = (ns0) ((ct0) objO13);
                                                    boolean zH13 = nv0Var4.h(sa1Var5);
                                                    Object objO14 = nv0Var4.O();
                                                    if (zH13 || objO14 == zjVar) {
                                                        e91 e91Var8 = new e91(1, sa1Var5, sa1.class, "saveFontSize", "saveFontSize(I)V", 0, 0, 16);
                                                        nv0Var4.j0(e91Var8);
                                                        objO14 = e91Var8;
                                                    }
                                                    g12.i(cs0Var3, zBooleanValue3, zBooleanValue4, qf2Var, zBooleanValue5, iIntValue4, iIntValue5, ns0Var3, ns0Var4, ns0Var5, ns0Var6, ns0Var7, (ns0) ((ct0) objO14), nv0Var4, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                        }
                        return dm3Var2;
                    }
                }, true), 254);
                br.p(ju1Var, "log_raksamp", null, new d00(248599151, new ts0() { // from class: m91
                    @Override // defpackage.ts0
                    public final Object l(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i52 = i4;
                        dm3 dm3Var2 = dm3.a;
                        zj zjVar = c20.a;
                        p40 p40Var = null;
                        nu1 nu1Var2 = nu1Var;
                        Context context2 = context;
                        switch (i52) {
                            case 0:
                                nv0 nv0Var = (nv0) obj10;
                                ((Integer) obj11).getClass();
                                ((sd) obj8).getClass();
                                ((qt1) obj9).getClass();
                                String strM = oz2.M(2131624243, nv0Var);
                                File externalFilesDir = context2.getExternalFilesDir(null);
                                if (externalFilesDir == null) {
                                    externalFilesDir = context2.getFilesDir();
                                }
                                String absolutePath = new File(externalFilesDir, "chatlog.txt").getAbsolutePath();
                                boolean zH = nv0Var.h(nu1Var2);
                                Object objO = nv0Var.O();
                                if (zH || objO == zjVar) {
                                    objO = new q91(nu1Var2, 3);
                                    nv0Var.j0(objO);
                                }
                                uq.c(strM, absolutePath, false, null, (cs0) objO, null, nv0Var, 0, 44);
                                break;
                            default:
                                nv0 nv0Var2 = (nv0) obj10;
                                ((Integer) obj11).getClass();
                                ((sd) obj8).getClass();
                                ((qt1) obj9).getClass();
                                os1 os1VarO = br.o(dh2.c, nv0Var2);
                                File externalFilesDir2 = context2.getExternalFilesDir(null);
                                Object objO2 = nv0Var2.O();
                                if (objO2 == zjVar) {
                                    objO2 = b32.w(ni0.f);
                                    nv0Var2.j0(objO2);
                                }
                                os1 os1Var2 = (os1) objO2;
                                Map map = (Map) os1VarO.getValue();
                                boolean zH2 = nv0Var2.h(externalFilesDir2);
                                Object objO3 = nv0Var2.O();
                                if (zH2 || objO3 == zjVar) {
                                    objO3 = new pw(externalFilesDir2, os1Var2, p40Var, 7);
                                    nv0Var2.j0(objO3);
                                }
                                rn.m(map, externalFilesDir2, (rs0) objO3, nv0Var2);
                                List list2 = (List) os1Var2.getValue();
                                Map map2 = (Map) os1VarO.getValue();
                                boolean zH3 = nv0Var2.h(nu1Var2);
                                Object objO4 = nv0Var2.O();
                                if (zH3 || objO4 == zjVar) {
                                    objO4 = new q91(nu1Var2, 1);
                                    nv0Var2.j0(objO4);
                                }
                                cs0 cs0Var = (cs0) objO4;
                                boolean zH4 = nv0Var2.h(nu1Var2);
                                Object objO5 = nv0Var2.O();
                                if (zH4 || objO5 == zjVar) {
                                    objO5 = new u91(nu1Var2, 0);
                                    nv0Var2.j0(objO5);
                                }
                                da1.c(list2, map2, cs0Var, (ns0) objO5, nv0Var2, 0);
                                break;
                        }
                        return dm3Var2;
                    }
                }, true), 254);
                br.p(ju1Var, "log_raksamp_instance/{nativeInstanceId}", vr.K(new et1("nativeInstanceId", new pt1(xu1.a))), new d00(398740494, new l91(sa1Var, context, nu1Var, i4), true), 252);
                br.p(ju1Var, "settings_debug", null, new d00(548881837, new ts0() { // from class: h91
                    @Override // defpackage.ts0
                    public final Object l(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i52 = i4;
                        dm3 dm3Var2 = dm3.a;
                        final nu1 nu1Var2 = nu1Var;
                        c33 c33Var2 = c33Var;
                        sd sdVar = (sd) obj8;
                        nv0 nv0Var = (nv0) obj10;
                        ((Integer) obj11).getClass();
                        sdVar.getClass();
                        ((qt1) obj9).getClass();
                        switch (i52) {
                            case 0:
                                final int i6 = 0;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(108023211, new rs0() { // from class: p91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        int i72 = i6;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        final nu1 nu1Var3 = nu1Var2;
                                        switch (i72) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 12);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zH2 = nv0Var2.h(nu1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        objO2 = new q91(nu1Var3, 13);
                                                        nv0Var2.j0(objO2);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO2;
                                                    boolean zH3 = nv0Var2.h(nu1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        objO3 = new q91(nu1Var3, 14);
                                                        nv0Var2.j0(objO3);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO3;
                                                    boolean zH4 = nv0Var2.h(nu1Var3);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new q91(nu1Var3, 15);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    cs0 cs0Var4 = (cs0) objO4;
                                                    boolean zH5 = nv0Var2.h(nu1Var3);
                                                    Object objO5 = nv0Var2.O();
                                                    if (zH5 || objO5 == zjVar) {
                                                        objO5 = new q91(nu1Var3, 16);
                                                        nv0Var2.j0(objO5);
                                                    }
                                                    cs0 cs0Var5 = (cs0) objO5;
                                                    boolean zH6 = nv0Var2.h(nu1Var3);
                                                    Object objO6 = nv0Var2.O();
                                                    if (zH6 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 17);
                                                        nv0Var2.j0(objO6);
                                                    }
                                                    cs0 cs0Var6 = (cs0) objO6;
                                                    boolean zH7 = nv0Var2.h(nu1Var3);
                                                    Object objO7 = nv0Var2.O();
                                                    if (zH7 || objO7 == zjVar) {
                                                        objO7 = new q91(nu1Var3, 18);
                                                        nv0Var2.j0(objO7);
                                                    }
                                                    cs0 cs0Var7 = (cs0) objO7;
                                                    boolean zH8 = nv0Var2.h(nu1Var3);
                                                    Object objO8 = nv0Var2.O();
                                                    if (zH8 || objO8 == zjVar) {
                                                        objO8 = new u91(nu1Var3, 1);
                                                        nv0Var2.j0(objO8);
                                                    }
                                                    ns0 ns0Var = (ns0) objO8;
                                                    boolean zH9 = nv0Var2.h(nu1Var3);
                                                    Object objO9 = nv0Var2.O();
                                                    if (zH9 || objO9 == zjVar) {
                                                        objO9 = new us0() { // from class: y91
                                                            @Override // defpackage.us0
                                                            public final Object j(Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
                                                                Object next;
                                                                String str;
                                                                Map mapSingletonMap;
                                                                String str2;
                                                                Object value;
                                                                Map mapSingletonMap2;
                                                                String str3 = (String) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                String str4 = (String) obj16;
                                                                xy2 xy2Var = (xy2) obj17;
                                                                String str5 = (String) obj18;
                                                                str3.getClass();
                                                                str4.getClass();
                                                                xy2Var.getClass();
                                                                str5.getClass();
                                                                n40 n40Var = dh2.h;
                                                                i93 i93Var = dh2.b;
                                                                Iterator it = ((Map) i93Var.getValue()).values().iterator();
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        next = null;
                                                                        break;
                                                                    }
                                                                    next = it.next();
                                                                    vg2 vg2Var = (vg2) next;
                                                                    if (s51.n(vg2Var.b, str3) && vg2Var.c == iIntValue2 && s51.n(vg2Var.d, str4)) {
                                                                        break;
                                                                    }
                                                                }
                                                                vg2 vg2Var2 = (vg2) next;
                                                                if (vg2Var2 != null) {
                                                                    str2 = vg2Var2.a;
                                                                    if (vg2Var2.e != xy2Var || !s51.n(vg2Var2.f, str5)) {
                                                                        do {
                                                                            value = i93Var.getValue();
                                                                            Map map = (Map) value;
                                                                            vg2 vg2VarA = vg2.a(vg2Var2, xy2Var, str5, 79);
                                                                            map.getClass();
                                                                            if (map.isEmpty()) {
                                                                                mapSingletonMap2 = Collections.singletonMap(str2, vg2VarA);
                                                                                mapSingletonMap2.getClass();
                                                                            } else {
                                                                                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                                                                                linkedHashMap.put(str2, vg2VarA);
                                                                                mapSingletonMap2 = linkedHashMap;
                                                                            }
                                                                        } while (!i93Var.h(value, mapSingletonMap2));
                                                                        cl3.t(n40Var, null, new wg2(str3, iIntValue2, str4, xy2Var, str5, null, 0), 3);
                                                                    }
                                                                } else {
                                                                    Application application = dh2.d;
                                                                    if (application == null) {
                                                                        c.q("RaksampInstanceManager not initialized");
                                                                        return null;
                                                                    }
                                                                    String string = UUID.randomUUID().toString();
                                                                    string.getClass();
                                                                    vi2 vi2Var = new vi2(application);
                                                                    while (true) {
                                                                        Object value2 = i93Var.getValue();
                                                                        Map map2 = (Map) value2;
                                                                        String str6 = str5;
                                                                        xy2 xy2Var2 = xy2Var;
                                                                        String str7 = str4;
                                                                        int i8 = iIntValue2;
                                                                        String str8 = str3;
                                                                        str = string;
                                                                        vg2 vg2Var3 = new vg2(str, str8, i8, str7, xy2Var2, str6, vi2Var);
                                                                        str3 = str8;
                                                                        iIntValue2 = i8;
                                                                        str4 = str7;
                                                                        xy2Var = xy2Var2;
                                                                        str5 = str6;
                                                                        map2.getClass();
                                                                        if (map2.isEmpty()) {
                                                                            mapSingletonMap = Collections.singletonMap(str, vg2Var3);
                                                                            mapSingletonMap.getClass();
                                                                        } else {
                                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                                                                            linkedHashMap2.put(str, vg2Var3);
                                                                            mapSingletonMap = linkedHashMap2;
                                                                        }
                                                                        if (i93Var.h(value2, mapSingletonMap)) {
                                                                            break;
                                                                        }
                                                                        string = str;
                                                                    }
                                                                    cl3.t(n40Var, null, new wg2(str3, iIntValue2, str4, xy2Var, str5, null, 1), 3);
                                                                    str2 = str;
                                                                }
                                                                String strConcat = "raksamp/".concat(str2);
                                                                nu1 nu1Var4 = nu1Var3;
                                                                nu1Var4.getClass();
                                                                wt1 wt1Var = nu1Var4.b;
                                                                wt1Var.getClass();
                                                                wt1Var.l(strConcat, new vu1(true, false, -1, false, false, -1, -1));
                                                                return dm3.a;
                                                            }
                                                        };
                                                        nv0Var2.j0(objO9);
                                                    }
                                                    w7.o(cs0Var, cs0Var2, cs0Var3, cs0Var4, cs0Var5, cs0Var6, cs0Var7, ns0Var, (us0) objO9, nv0Var2, 0);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    boolean zH10 = nv0Var3.h(nu1Var3);
                                                    Object objO10 = nv0Var3.O();
                                                    if (zH10 || objO10 == zjVar) {
                                                        objO10 = new q91(nu1Var3, 7);
                                                        nv0Var3.j0(objO10);
                                                    }
                                                    cs0 cs0Var8 = (cs0) objO10;
                                                    boolean zH11 = nv0Var3.h(nu1Var3);
                                                    Object objO11 = nv0Var3.O();
                                                    if (zH11 || objO11 == zjVar) {
                                                        objO11 = new q91(nu1Var3, 8);
                                                        nv0Var3.j0(objO11);
                                                    }
                                                    cs0 cs0Var9 = (cs0) objO11;
                                                    boolean zH12 = nv0Var3.h(nu1Var3);
                                                    Object objO12 = nv0Var3.O();
                                                    if (zH12 || objO12 == zjVar) {
                                                        objO12 = new q91(nu1Var3, 9);
                                                        nv0Var3.j0(objO12);
                                                    }
                                                    cs0 cs0Var10 = (cs0) objO12;
                                                    boolean zH13 = nv0Var3.h(nu1Var3);
                                                    Object objO13 = nv0Var3.O();
                                                    if (zH13 || objO13 == zjVar) {
                                                        objO13 = new q91(nu1Var3, 10);
                                                        nv0Var3.j0(objO13);
                                                    }
                                                    cs0 cs0Var11 = (cs0) objO13;
                                                    boolean zH14 = nv0Var3.h(nu1Var3);
                                                    Object objO14 = nv0Var3.O();
                                                    if (zH14 || objO14 == zjVar) {
                                                        objO14 = new q91(nu1Var3, 11);
                                                        nv0Var3.j0(objO14);
                                                    }
                                                    g12.d(cs0Var8, cs0Var9, cs0Var10, cs0Var11, (cs0) objO14, nv0Var3, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                            default:
                                final int i7 = 1;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(225343725, new rs0() { // from class: p91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        int i72 = i7;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        final nu1 nu1Var3 = nu1Var2;
                                        switch (i72) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 12);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zH2 = nv0Var2.h(nu1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        objO2 = new q91(nu1Var3, 13);
                                                        nv0Var2.j0(objO2);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO2;
                                                    boolean zH3 = nv0Var2.h(nu1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        objO3 = new q91(nu1Var3, 14);
                                                        nv0Var2.j0(objO3);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO3;
                                                    boolean zH4 = nv0Var2.h(nu1Var3);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new q91(nu1Var3, 15);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    cs0 cs0Var4 = (cs0) objO4;
                                                    boolean zH5 = nv0Var2.h(nu1Var3);
                                                    Object objO5 = nv0Var2.O();
                                                    if (zH5 || objO5 == zjVar) {
                                                        objO5 = new q91(nu1Var3, 16);
                                                        nv0Var2.j0(objO5);
                                                    }
                                                    cs0 cs0Var5 = (cs0) objO5;
                                                    boolean zH6 = nv0Var2.h(nu1Var3);
                                                    Object objO6 = nv0Var2.O();
                                                    if (zH6 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 17);
                                                        nv0Var2.j0(objO6);
                                                    }
                                                    cs0 cs0Var6 = (cs0) objO6;
                                                    boolean zH7 = nv0Var2.h(nu1Var3);
                                                    Object objO7 = nv0Var2.O();
                                                    if (zH7 || objO7 == zjVar) {
                                                        objO7 = new q91(nu1Var3, 18);
                                                        nv0Var2.j0(objO7);
                                                    }
                                                    cs0 cs0Var7 = (cs0) objO7;
                                                    boolean zH8 = nv0Var2.h(nu1Var3);
                                                    Object objO8 = nv0Var2.O();
                                                    if (zH8 || objO8 == zjVar) {
                                                        objO8 = new u91(nu1Var3, 1);
                                                        nv0Var2.j0(objO8);
                                                    }
                                                    ns0 ns0Var = (ns0) objO8;
                                                    boolean zH9 = nv0Var2.h(nu1Var3);
                                                    Object objO9 = nv0Var2.O();
                                                    if (zH9 || objO9 == zjVar) {
                                                        objO9 = new us0() { // from class: y91
                                                            @Override // defpackage.us0
                                                            public final Object j(Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
                                                                Object next;
                                                                String str;
                                                                Map mapSingletonMap;
                                                                String str2;
                                                                Object value;
                                                                Map mapSingletonMap2;
                                                                String str3 = (String) obj14;
                                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                                String str4 = (String) obj16;
                                                                xy2 xy2Var = (xy2) obj17;
                                                                String str5 = (String) obj18;
                                                                str3.getClass();
                                                                str4.getClass();
                                                                xy2Var.getClass();
                                                                str5.getClass();
                                                                n40 n40Var = dh2.h;
                                                                i93 i93Var = dh2.b;
                                                                Iterator it = ((Map) i93Var.getValue()).values().iterator();
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        next = null;
                                                                        break;
                                                                    }
                                                                    next = it.next();
                                                                    vg2 vg2Var = (vg2) next;
                                                                    if (s51.n(vg2Var.b, str3) && vg2Var.c == iIntValue2 && s51.n(vg2Var.d, str4)) {
                                                                        break;
                                                                    }
                                                                }
                                                                vg2 vg2Var2 = (vg2) next;
                                                                if (vg2Var2 != null) {
                                                                    str2 = vg2Var2.a;
                                                                    if (vg2Var2.e != xy2Var || !s51.n(vg2Var2.f, str5)) {
                                                                        do {
                                                                            value = i93Var.getValue();
                                                                            Map map = (Map) value;
                                                                            vg2 vg2VarA = vg2.a(vg2Var2, xy2Var, str5, 79);
                                                                            map.getClass();
                                                                            if (map.isEmpty()) {
                                                                                mapSingletonMap2 = Collections.singletonMap(str2, vg2VarA);
                                                                                mapSingletonMap2.getClass();
                                                                            } else {
                                                                                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                                                                                linkedHashMap.put(str2, vg2VarA);
                                                                                mapSingletonMap2 = linkedHashMap;
                                                                            }
                                                                        } while (!i93Var.h(value, mapSingletonMap2));
                                                                        cl3.t(n40Var, null, new wg2(str3, iIntValue2, str4, xy2Var, str5, null, 0), 3);
                                                                    }
                                                                } else {
                                                                    Application application = dh2.d;
                                                                    if (application == null) {
                                                                        c.q("RaksampInstanceManager not initialized");
                                                                        return null;
                                                                    }
                                                                    String string = UUID.randomUUID().toString();
                                                                    string.getClass();
                                                                    vi2 vi2Var = new vi2(application);
                                                                    while (true) {
                                                                        Object value2 = i93Var.getValue();
                                                                        Map map2 = (Map) value2;
                                                                        String str6 = str5;
                                                                        xy2 xy2Var2 = xy2Var;
                                                                        String str7 = str4;
                                                                        int i8 = iIntValue2;
                                                                        String str8 = str3;
                                                                        str = string;
                                                                        vg2 vg2Var3 = new vg2(str, str8, i8, str7, xy2Var2, str6, vi2Var);
                                                                        str3 = str8;
                                                                        iIntValue2 = i8;
                                                                        str4 = str7;
                                                                        xy2Var = xy2Var2;
                                                                        str5 = str6;
                                                                        map2.getClass();
                                                                        if (map2.isEmpty()) {
                                                                            mapSingletonMap = Collections.singletonMap(str, vg2Var3);
                                                                            mapSingletonMap.getClass();
                                                                        } else {
                                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                                                                            linkedHashMap2.put(str, vg2Var3);
                                                                            mapSingletonMap = linkedHashMap2;
                                                                        }
                                                                        if (i93Var.h(value2, mapSingletonMap)) {
                                                                            break;
                                                                        }
                                                                        string = str;
                                                                    }
                                                                    cl3.t(n40Var, null, new wg2(str3, iIntValue2, str4, xy2Var, str5, null, 1), 3);
                                                                    str2 = str;
                                                                }
                                                                String strConcat = "raksamp/".concat(str2);
                                                                nu1 nu1Var4 = nu1Var3;
                                                                nu1Var4.getClass();
                                                                wt1 wt1Var = nu1Var4.b;
                                                                wt1Var.getClass();
                                                                wt1Var.l(strConcat, new vu1(true, false, -1, false, false, -1, -1));
                                                                return dm3.a;
                                                            }
                                                        };
                                                        nv0Var2.j0(objO9);
                                                    }
                                                    w7.o(cs0Var, cs0Var2, cs0Var3, cs0Var4, cs0Var5, cs0Var6, cs0Var7, ns0Var, (us0) objO9, nv0Var2, 0);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    boolean zH10 = nv0Var3.h(nu1Var3);
                                                    Object objO10 = nv0Var3.O();
                                                    if (zH10 || objO10 == zjVar) {
                                                        objO10 = new q91(nu1Var3, 7);
                                                        nv0Var3.j0(objO10);
                                                    }
                                                    cs0 cs0Var8 = (cs0) objO10;
                                                    boolean zH11 = nv0Var3.h(nu1Var3);
                                                    Object objO11 = nv0Var3.O();
                                                    if (zH11 || objO11 == zjVar) {
                                                        objO11 = new q91(nu1Var3, 8);
                                                        nv0Var3.j0(objO11);
                                                    }
                                                    cs0 cs0Var9 = (cs0) objO11;
                                                    boolean zH12 = nv0Var3.h(nu1Var3);
                                                    Object objO12 = nv0Var3.O();
                                                    if (zH12 || objO12 == zjVar) {
                                                        objO12 = new q91(nu1Var3, 9);
                                                        nv0Var3.j0(objO12);
                                                    }
                                                    cs0 cs0Var10 = (cs0) objO12;
                                                    boolean zH13 = nv0Var3.h(nu1Var3);
                                                    Object objO13 = nv0Var3.O();
                                                    if (zH13 || objO13 == zjVar) {
                                                        objO13 = new q91(nu1Var3, 10);
                                                        nv0Var3.j0(objO13);
                                                    }
                                                    cs0 cs0Var11 = (cs0) objO13;
                                                    boolean zH14 = nv0Var3.h(nu1Var3);
                                                    Object objO14 = nv0Var3.O();
                                                    if (zH14 || objO14 == zjVar) {
                                                        objO14 = new q91(nu1Var3, 11);
                                                        nv0Var3.j0(objO14);
                                                    }
                                                    g12.d(cs0Var8, cs0Var9, cs0Var10, cs0Var11, (cs0) objO14, nv0Var3, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                        }
                        return dm3Var2;
                    }
                }, true), 254);
                br.p(ju1Var, "settings_notifications", null, new d00(699023180, new ts0() { // from class: i91
                    @Override // defpackage.ts0
                    public final Object l(Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i52 = i2;
                        dm3 dm3Var2 = dm3.a;
                        final nu1 nu1Var2 = nu1Var;
                        final sa1 sa1Var2 = sa1Var;
                        c33 c33Var2 = c33Var;
                        sd sdVar = (sd) obj8;
                        nv0 nv0Var = (nv0) obj10;
                        ((Integer) obj11).getClass();
                        sdVar.getClass();
                        ((qt1) obj9).getClass();
                        switch (i52) {
                            case 0:
                                final int i6 = 0;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(375485068, new rs0() { // from class: s91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        Context context2;
                                        Object next;
                                        int i72 = i6;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        nu1 nu1Var3 = nu1Var2;
                                        switch (i72) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    sa1 sa1Var3 = sa1Var2;
                                                    os1 os1VarO = br.o(sa1Var3.f0, nv0Var2);
                                                    os1 os1VarO2 = br.o(sa1Var3.g0, nv0Var2);
                                                    Context context3 = (Context) nv0Var2.j(x7.b);
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 6);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zBooleanValue = ((Boolean) os1VarO.getValue()).booleanValue();
                                                    boolean zBooleanValue2 = ((Boolean) os1VarO2.getValue()).booleanValue();
                                                    boolean zH2 = nv0Var2.h(sa1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        context2 = context3;
                                                        e91 e91Var = new e91(1, sa1Var3, sa1.class, "saveShowServerNotification", "saveShowServerNotification(Z)V", 0, 0, 3);
                                                        nv0Var2.j0(e91Var);
                                                        objO2 = e91Var;
                                                    } else {
                                                        context2 = context3;
                                                    }
                                                    ns0 ns0Var = (ns0) ((ct0) objO2);
                                                    boolean zH3 = nv0Var2.h(sa1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        e91 e91Var2 = new e91(1, sa1Var3, sa1.class, "saveShowRaksampNotification", "saveShowRaksampNotification(Z)V", 0, 0, 4);
                                                        nv0Var2.j0(e91Var2);
                                                        objO3 = e91Var2;
                                                    }
                                                    ns0 ns0Var2 = (ns0) ((ct0) objO3);
                                                    boolean zH4 = nv0Var2.h(context2);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new v91(context2, 0);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    g12.l(cs0Var, zBooleanValue, zBooleanValue2, ns0Var, ns0Var2, (cs0) objO4, nv0Var2, 0);
                                                }
                                                break;
                                            case 1:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    sa1 sa1Var4 = sa1Var2;
                                                    os1 os1VarO3 = br.o(sa1Var4.W, nv0Var3);
                                                    boolean zF = nv0Var3.f((String) os1VarO3.getValue());
                                                    Object objO5 = nv0Var3.O();
                                                    if (zF || objO5 == zjVar) {
                                                        Iterator it = ti.l.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (s51.n(((ti) next).name(), (String) os1VarO3.getValue())) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        objO5 = (ti) next;
                                                        if (objO5 == null) {
                                                            objO5 = ti.h;
                                                        }
                                                        nv0Var3.j0(objO5);
                                                    }
                                                    ti tiVar = (ti) objO5;
                                                    String strM = oz2.M(2131624248, nv0Var3);
                                                    boolean zH5 = nv0Var3.h(nu1Var3);
                                                    Object objO6 = nv0Var3.O();
                                                    if (zH5 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 21);
                                                        nv0Var3.j0(objO6);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO6;
                                                    boolean zH6 = nv0Var3.h(sa1Var4);
                                                    Object objO7 = nv0Var3.O();
                                                    if (zH6 || objO7 == zjVar) {
                                                        objO7 = new r91(sa1Var4, 2);
                                                        nv0Var3.j0(objO7);
                                                    }
                                                    uq.c(strM, null, true, tiVar, cs0Var2, (ns0) objO7, nv0Var3, 384, 2);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var4 = (nv0) obj12;
                                                int iIntValue3 = ((Integer) obj13).intValue();
                                                if (!nv0Var4.R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                    nv0Var4.U();
                                                } else {
                                                    sa1 sa1Var5 = sa1Var2;
                                                    os1 os1VarO4 = br.o(sa1Var5.X, nv0Var4);
                                                    os1 os1VarO5 = br.o(sa1Var5.a0, nv0Var4);
                                                    os1 os1VarO6 = br.o(sa1Var5.b0, nv0Var4);
                                                    os1 os1VarO7 = br.o(sa1Var5.c0, nv0Var4);
                                                    os1 os1VarO8 = br.o(sa1Var5.d0, nv0Var4);
                                                    os1 os1VarO9 = br.o(sa1Var5.e0, nv0Var4);
                                                    boolean zH7 = nv0Var4.h(nu1Var3);
                                                    Object objO8 = nv0Var4.O();
                                                    if (zH7 || objO8 == zjVar) {
                                                        objO8 = new q91(nu1Var3, 5);
                                                        nv0Var4.j0(objO8);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO8;
                                                    boolean zBooleanValue3 = ((Boolean) os1VarO4.getValue()).booleanValue();
                                                    boolean zBooleanValue4 = ((Boolean) os1VarO5.getValue()).booleanValue();
                                                    qf2 qf2Var = (qf2) os1VarO6.getValue();
                                                    boolean zBooleanValue5 = ((Boolean) os1VarO7.getValue()).booleanValue();
                                                    int iIntValue4 = ((Number) os1VarO8.getValue()).intValue();
                                                    int iIntValue5 = ((Number) os1VarO9.getValue()).intValue();
                                                    boolean zH8 = nv0Var4.h(sa1Var5);
                                                    Object objO9 = nv0Var4.O();
                                                    if (zH8 || objO9 == zjVar) {
                                                        e91 e91Var3 = new e91(1, sa1Var5, sa1.class, "saveNativeKeyboardEnabled", "saveNativeKeyboardEnabled(Z)V", 0, 0, 11);
                                                        nv0Var4.j0(e91Var3);
                                                        objO9 = e91Var3;
                                                    }
                                                    ns0 ns0Var3 = (ns0) ((ct0) objO9);
                                                    boolean zH9 = nv0Var4.h(sa1Var5);
                                                    Object objO10 = nv0Var4.O();
                                                    if (zH9 || objO10 == zjVar) {
                                                        e91 e91Var4 = new e91(1, sa1Var5, sa1.class, "saveShowChatTimestamp", "saveShowChatTimestamp(Z)V", 0, 0, 12);
                                                        nv0Var4.j0(e91Var4);
                                                        objO10 = e91Var4;
                                                    }
                                                    ns0 ns0Var4 = (ns0) ((ct0) objO10);
                                                    boolean zH10 = nv0Var4.h(sa1Var5);
                                                    Object objO11 = nv0Var4.O();
                                                    if (zH10 || objO11 == zjVar) {
                                                        e91 e91Var5 = new e91(1, sa1Var5, sa1.class, "saveRadarPosition", "saveRadarPosition(Ltop/th1nk/samp/core/config/RadarPosition;)V", 0, 0, 13);
                                                        nv0Var4.j0(e91Var5);
                                                        objO11 = e91Var5;
                                                    }
                                                    ns0 ns0Var5 = (ns0) ((ct0) objO11);
                                                    boolean zH11 = nv0Var4.h(sa1Var5);
                                                    Object objO12 = nv0Var4.O();
                                                    if (zH11 || objO12 == zjVar) {
                                                        e91 e91Var6 = new e91(1, sa1Var5, sa1.class, "saveEmulatePcClientCheck", "saveEmulatePcClientCheck(Z)V", 0, 0, 14);
                                                        nv0Var4.j0(e91Var6);
                                                        objO12 = e91Var6;
                                                    }
                                                    ns0 ns0Var6 = (ns0) ((ct0) objO12);
                                                    boolean zH12 = nv0Var4.h(sa1Var5);
                                                    Object objO13 = nv0Var4.O();
                                                    if (zH12 || objO13 == zjVar) {
                                                        e91 e91Var7 = new e91(1, sa1Var5, sa1.class, "saveFpsLimit", "saveFpsLimit(I)V", 0, 0, 15);
                                                        nv0Var4.j0(e91Var7);
                                                        objO13 = e91Var7;
                                                    }
                                                    ns0 ns0Var7 = (ns0) ((ct0) objO13);
                                                    boolean zH13 = nv0Var4.h(sa1Var5);
                                                    Object objO14 = nv0Var4.O();
                                                    if (zH13 || objO14 == zjVar) {
                                                        e91 e91Var8 = new e91(1, sa1Var5, sa1.class, "saveFontSize", "saveFontSize(I)V", 0, 0, 16);
                                                        nv0Var4.j0(e91Var8);
                                                        objO14 = e91Var8;
                                                    }
                                                    g12.i(cs0Var3, zBooleanValue3, zBooleanValue4, qf2Var, zBooleanValue5, iIntValue4, iIntValue5, ns0Var3, ns0Var4, ns0Var5, ns0Var6, ns0Var7, (ns0) ((ct0) objO14), nv0Var4, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                            case 1:
                                final int i7 = 1;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(-825645676, new rs0() { // from class: s91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        Context context2;
                                        Object next;
                                        int i72 = i7;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        nu1 nu1Var3 = nu1Var2;
                                        switch (i72) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    sa1 sa1Var3 = sa1Var2;
                                                    os1 os1VarO = br.o(sa1Var3.f0, nv0Var2);
                                                    os1 os1VarO2 = br.o(sa1Var3.g0, nv0Var2);
                                                    Context context3 = (Context) nv0Var2.j(x7.b);
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 6);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zBooleanValue = ((Boolean) os1VarO.getValue()).booleanValue();
                                                    boolean zBooleanValue2 = ((Boolean) os1VarO2.getValue()).booleanValue();
                                                    boolean zH2 = nv0Var2.h(sa1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        context2 = context3;
                                                        e91 e91Var = new e91(1, sa1Var3, sa1.class, "saveShowServerNotification", "saveShowServerNotification(Z)V", 0, 0, 3);
                                                        nv0Var2.j0(e91Var);
                                                        objO2 = e91Var;
                                                    } else {
                                                        context2 = context3;
                                                    }
                                                    ns0 ns0Var = (ns0) ((ct0) objO2);
                                                    boolean zH3 = nv0Var2.h(sa1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        e91 e91Var2 = new e91(1, sa1Var3, sa1.class, "saveShowRaksampNotification", "saveShowRaksampNotification(Z)V", 0, 0, 4);
                                                        nv0Var2.j0(e91Var2);
                                                        objO3 = e91Var2;
                                                    }
                                                    ns0 ns0Var2 = (ns0) ((ct0) objO3);
                                                    boolean zH4 = nv0Var2.h(context2);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new v91(context2, 0);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    g12.l(cs0Var, zBooleanValue, zBooleanValue2, ns0Var, ns0Var2, (cs0) objO4, nv0Var2, 0);
                                                }
                                                break;
                                            case 1:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    sa1 sa1Var4 = sa1Var2;
                                                    os1 os1VarO3 = br.o(sa1Var4.W, nv0Var3);
                                                    boolean zF = nv0Var3.f((String) os1VarO3.getValue());
                                                    Object objO5 = nv0Var3.O();
                                                    if (zF || objO5 == zjVar) {
                                                        Iterator it = ti.l.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (s51.n(((ti) next).name(), (String) os1VarO3.getValue())) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        objO5 = (ti) next;
                                                        if (objO5 == null) {
                                                            objO5 = ti.h;
                                                        }
                                                        nv0Var3.j0(objO5);
                                                    }
                                                    ti tiVar = (ti) objO5;
                                                    String strM = oz2.M(2131624248, nv0Var3);
                                                    boolean zH5 = nv0Var3.h(nu1Var3);
                                                    Object objO6 = nv0Var3.O();
                                                    if (zH5 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 21);
                                                        nv0Var3.j0(objO6);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO6;
                                                    boolean zH6 = nv0Var3.h(sa1Var4);
                                                    Object objO7 = nv0Var3.O();
                                                    if (zH6 || objO7 == zjVar) {
                                                        objO7 = new r91(sa1Var4, 2);
                                                        nv0Var3.j0(objO7);
                                                    }
                                                    uq.c(strM, null, true, tiVar, cs0Var2, (ns0) objO7, nv0Var3, 384, 2);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var4 = (nv0) obj12;
                                                int iIntValue3 = ((Integer) obj13).intValue();
                                                if (!nv0Var4.R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                    nv0Var4.U();
                                                } else {
                                                    sa1 sa1Var5 = sa1Var2;
                                                    os1 os1VarO4 = br.o(sa1Var5.X, nv0Var4);
                                                    os1 os1VarO5 = br.o(sa1Var5.a0, nv0Var4);
                                                    os1 os1VarO6 = br.o(sa1Var5.b0, nv0Var4);
                                                    os1 os1VarO7 = br.o(sa1Var5.c0, nv0Var4);
                                                    os1 os1VarO8 = br.o(sa1Var5.d0, nv0Var4);
                                                    os1 os1VarO9 = br.o(sa1Var5.e0, nv0Var4);
                                                    boolean zH7 = nv0Var4.h(nu1Var3);
                                                    Object objO8 = nv0Var4.O();
                                                    if (zH7 || objO8 == zjVar) {
                                                        objO8 = new q91(nu1Var3, 5);
                                                        nv0Var4.j0(objO8);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO8;
                                                    boolean zBooleanValue3 = ((Boolean) os1VarO4.getValue()).booleanValue();
                                                    boolean zBooleanValue4 = ((Boolean) os1VarO5.getValue()).booleanValue();
                                                    qf2 qf2Var = (qf2) os1VarO6.getValue();
                                                    boolean zBooleanValue5 = ((Boolean) os1VarO7.getValue()).booleanValue();
                                                    int iIntValue4 = ((Number) os1VarO8.getValue()).intValue();
                                                    int iIntValue5 = ((Number) os1VarO9.getValue()).intValue();
                                                    boolean zH8 = nv0Var4.h(sa1Var5);
                                                    Object objO9 = nv0Var4.O();
                                                    if (zH8 || objO9 == zjVar) {
                                                        e91 e91Var3 = new e91(1, sa1Var5, sa1.class, "saveNativeKeyboardEnabled", "saveNativeKeyboardEnabled(Z)V", 0, 0, 11);
                                                        nv0Var4.j0(e91Var3);
                                                        objO9 = e91Var3;
                                                    }
                                                    ns0 ns0Var3 = (ns0) ((ct0) objO9);
                                                    boolean zH9 = nv0Var4.h(sa1Var5);
                                                    Object objO10 = nv0Var4.O();
                                                    if (zH9 || objO10 == zjVar) {
                                                        e91 e91Var4 = new e91(1, sa1Var5, sa1.class, "saveShowChatTimestamp", "saveShowChatTimestamp(Z)V", 0, 0, 12);
                                                        nv0Var4.j0(e91Var4);
                                                        objO10 = e91Var4;
                                                    }
                                                    ns0 ns0Var4 = (ns0) ((ct0) objO10);
                                                    boolean zH10 = nv0Var4.h(sa1Var5);
                                                    Object objO11 = nv0Var4.O();
                                                    if (zH10 || objO11 == zjVar) {
                                                        e91 e91Var5 = new e91(1, sa1Var5, sa1.class, "saveRadarPosition", "saveRadarPosition(Ltop/th1nk/samp/core/config/RadarPosition;)V", 0, 0, 13);
                                                        nv0Var4.j0(e91Var5);
                                                        objO11 = e91Var5;
                                                    }
                                                    ns0 ns0Var5 = (ns0) ((ct0) objO11);
                                                    boolean zH11 = nv0Var4.h(sa1Var5);
                                                    Object objO12 = nv0Var4.O();
                                                    if (zH11 || objO12 == zjVar) {
                                                        e91 e91Var6 = new e91(1, sa1Var5, sa1.class, "saveEmulatePcClientCheck", "saveEmulatePcClientCheck(Z)V", 0, 0, 14);
                                                        nv0Var4.j0(e91Var6);
                                                        objO12 = e91Var6;
                                                    }
                                                    ns0 ns0Var6 = (ns0) ((ct0) objO12);
                                                    boolean zH12 = nv0Var4.h(sa1Var5);
                                                    Object objO13 = nv0Var4.O();
                                                    if (zH12 || objO13 == zjVar) {
                                                        e91 e91Var7 = new e91(1, sa1Var5, sa1.class, "saveFpsLimit", "saveFpsLimit(I)V", 0, 0, 15);
                                                        nv0Var4.j0(e91Var7);
                                                        objO13 = e91Var7;
                                                    }
                                                    ns0 ns0Var7 = (ns0) ((ct0) objO13);
                                                    boolean zH13 = nv0Var4.h(sa1Var5);
                                                    Object objO14 = nv0Var4.O();
                                                    if (zH13 || objO14 == zjVar) {
                                                        e91 e91Var8 = new e91(1, sa1Var5, sa1.class, "saveFontSize", "saveFontSize(I)V", 0, 0, 16);
                                                        nv0Var4.j0(e91Var8);
                                                        objO14 = e91Var8;
                                                    }
                                                    g12.i(cs0Var3, zBooleanValue3, zBooleanValue4, qf2Var, zBooleanValue5, iIntValue4, iIntValue5, ns0Var3, ns0Var4, ns0Var5, ns0Var6, ns0Var7, (ns0) ((ct0) objO14), nv0Var4, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                            default:
                                final int i8 = 2;
                                vr.d(new he2[]{da1.a.a(c33Var2), da1.b.a(sdVar)}, gq.N(-225080304, new rs0() { // from class: s91
                                    @Override // defpackage.rs0
                                    public final Object f(Object obj12, Object obj13) {
                                        Context context2;
                                        Object next;
                                        int i72 = i8;
                                        dm3 dm3Var3 = dm3.a;
                                        zj zjVar = c20.a;
                                        nu1 nu1Var3 = nu1Var2;
                                        switch (i72) {
                                            case 0:
                                                nv0 nv0Var2 = (nv0) obj12;
                                                int iIntValue = ((Integer) obj13).intValue();
                                                if (!nv0Var2.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                                                    nv0Var2.U();
                                                } else {
                                                    sa1 sa1Var3 = sa1Var2;
                                                    os1 os1VarO = br.o(sa1Var3.f0, nv0Var2);
                                                    os1 os1VarO2 = br.o(sa1Var3.g0, nv0Var2);
                                                    Context context3 = (Context) nv0Var2.j(x7.b);
                                                    boolean zH = nv0Var2.h(nu1Var3);
                                                    Object objO = nv0Var2.O();
                                                    if (zH || objO == zjVar) {
                                                        objO = new q91(nu1Var3, 6);
                                                        nv0Var2.j0(objO);
                                                    }
                                                    cs0 cs0Var = (cs0) objO;
                                                    boolean zBooleanValue = ((Boolean) os1VarO.getValue()).booleanValue();
                                                    boolean zBooleanValue2 = ((Boolean) os1VarO2.getValue()).booleanValue();
                                                    boolean zH2 = nv0Var2.h(sa1Var3);
                                                    Object objO2 = nv0Var2.O();
                                                    if (zH2 || objO2 == zjVar) {
                                                        context2 = context3;
                                                        e91 e91Var = new e91(1, sa1Var3, sa1.class, "saveShowServerNotification", "saveShowServerNotification(Z)V", 0, 0, 3);
                                                        nv0Var2.j0(e91Var);
                                                        objO2 = e91Var;
                                                    } else {
                                                        context2 = context3;
                                                    }
                                                    ns0 ns0Var = (ns0) ((ct0) objO2);
                                                    boolean zH3 = nv0Var2.h(sa1Var3);
                                                    Object objO3 = nv0Var2.O();
                                                    if (zH3 || objO3 == zjVar) {
                                                        e91 e91Var2 = new e91(1, sa1Var3, sa1.class, "saveShowRaksampNotification", "saveShowRaksampNotification(Z)V", 0, 0, 4);
                                                        nv0Var2.j0(e91Var2);
                                                        objO3 = e91Var2;
                                                    }
                                                    ns0 ns0Var2 = (ns0) ((ct0) objO3);
                                                    boolean zH4 = nv0Var2.h(context2);
                                                    Object objO4 = nv0Var2.O();
                                                    if (zH4 || objO4 == zjVar) {
                                                        objO4 = new v91(context2, 0);
                                                        nv0Var2.j0(objO4);
                                                    }
                                                    g12.l(cs0Var, zBooleanValue, zBooleanValue2, ns0Var, ns0Var2, (cs0) objO4, nv0Var2, 0);
                                                }
                                                break;
                                            case 1:
                                                nv0 nv0Var3 = (nv0) obj12;
                                                int iIntValue2 = ((Integer) obj13).intValue();
                                                if (!nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    nv0Var3.U();
                                                } else {
                                                    sa1 sa1Var4 = sa1Var2;
                                                    os1 os1VarO3 = br.o(sa1Var4.W, nv0Var3);
                                                    boolean zF = nv0Var3.f((String) os1VarO3.getValue());
                                                    Object objO5 = nv0Var3.O();
                                                    if (zF || objO5 == zjVar) {
                                                        Iterator it = ti.l.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                                if (s51.n(((ti) next).name(), (String) os1VarO3.getValue())) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        objO5 = (ti) next;
                                                        if (objO5 == null) {
                                                            objO5 = ti.h;
                                                        }
                                                        nv0Var3.j0(objO5);
                                                    }
                                                    ti tiVar = (ti) objO5;
                                                    String strM = oz2.M(2131624248, nv0Var3);
                                                    boolean zH5 = nv0Var3.h(nu1Var3);
                                                    Object objO6 = nv0Var3.O();
                                                    if (zH5 || objO6 == zjVar) {
                                                        objO6 = new q91(nu1Var3, 21);
                                                        nv0Var3.j0(objO6);
                                                    }
                                                    cs0 cs0Var2 = (cs0) objO6;
                                                    boolean zH6 = nv0Var3.h(sa1Var4);
                                                    Object objO7 = nv0Var3.O();
                                                    if (zH6 || objO7 == zjVar) {
                                                        objO7 = new r91(sa1Var4, 2);
                                                        nv0Var3.j0(objO7);
                                                    }
                                                    uq.c(strM, null, true, tiVar, cs0Var2, (ns0) objO7, nv0Var3, 384, 2);
                                                }
                                                break;
                                            default:
                                                nv0 nv0Var4 = (nv0) obj12;
                                                int iIntValue3 = ((Integer) obj13).intValue();
                                                if (!nv0Var4.R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                                    nv0Var4.U();
                                                } else {
                                                    sa1 sa1Var5 = sa1Var2;
                                                    os1 os1VarO4 = br.o(sa1Var5.X, nv0Var4);
                                                    os1 os1VarO5 = br.o(sa1Var5.a0, nv0Var4);
                                                    os1 os1VarO6 = br.o(sa1Var5.b0, nv0Var4);
                                                    os1 os1VarO7 = br.o(sa1Var5.c0, nv0Var4);
                                                    os1 os1VarO8 = br.o(sa1Var5.d0, nv0Var4);
                                                    os1 os1VarO9 = br.o(sa1Var5.e0, nv0Var4);
                                                    boolean zH7 = nv0Var4.h(nu1Var3);
                                                    Object objO8 = nv0Var4.O();
                                                    if (zH7 || objO8 == zjVar) {
                                                        objO8 = new q91(nu1Var3, 5);
                                                        nv0Var4.j0(objO8);
                                                    }
                                                    cs0 cs0Var3 = (cs0) objO8;
                                                    boolean zBooleanValue3 = ((Boolean) os1VarO4.getValue()).booleanValue();
                                                    boolean zBooleanValue4 = ((Boolean) os1VarO5.getValue()).booleanValue();
                                                    qf2 qf2Var = (qf2) os1VarO6.getValue();
                                                    boolean zBooleanValue5 = ((Boolean) os1VarO7.getValue()).booleanValue();
                                                    int iIntValue4 = ((Number) os1VarO8.getValue()).intValue();
                                                    int iIntValue5 = ((Number) os1VarO9.getValue()).intValue();
                                                    boolean zH8 = nv0Var4.h(sa1Var5);
                                                    Object objO9 = nv0Var4.O();
                                                    if (zH8 || objO9 == zjVar) {
                                                        e91 e91Var3 = new e91(1, sa1Var5, sa1.class, "saveNativeKeyboardEnabled", "saveNativeKeyboardEnabled(Z)V", 0, 0, 11);
                                                        nv0Var4.j0(e91Var3);
                                                        objO9 = e91Var3;
                                                    }
                                                    ns0 ns0Var3 = (ns0) ((ct0) objO9);
                                                    boolean zH9 = nv0Var4.h(sa1Var5);
                                                    Object objO10 = nv0Var4.O();
                                                    if (zH9 || objO10 == zjVar) {
                                                        e91 e91Var4 = new e91(1, sa1Var5, sa1.class, "saveShowChatTimestamp", "saveShowChatTimestamp(Z)V", 0, 0, 12);
                                                        nv0Var4.j0(e91Var4);
                                                        objO10 = e91Var4;
                                                    }
                                                    ns0 ns0Var4 = (ns0) ((ct0) objO10);
                                                    boolean zH10 = nv0Var4.h(sa1Var5);
                                                    Object objO11 = nv0Var4.O();
                                                    if (zH10 || objO11 == zjVar) {
                                                        e91 e91Var5 = new e91(1, sa1Var5, sa1.class, "saveRadarPosition", "saveRadarPosition(Ltop/th1nk/samp/core/config/RadarPosition;)V", 0, 0, 13);
                                                        nv0Var4.j0(e91Var5);
                                                        objO11 = e91Var5;
                                                    }
                                                    ns0 ns0Var5 = (ns0) ((ct0) objO11);
                                                    boolean zH11 = nv0Var4.h(sa1Var5);
                                                    Object objO12 = nv0Var4.O();
                                                    if (zH11 || objO12 == zjVar) {
                                                        e91 e91Var6 = new e91(1, sa1Var5, sa1.class, "saveEmulatePcClientCheck", "saveEmulatePcClientCheck(Z)V", 0, 0, 14);
                                                        nv0Var4.j0(e91Var6);
                                                        objO12 = e91Var6;
                                                    }
                                                    ns0 ns0Var6 = (ns0) ((ct0) objO12);
                                                    boolean zH12 = nv0Var4.h(sa1Var5);
                                                    Object objO13 = nv0Var4.O();
                                                    if (zH12 || objO13 == zjVar) {
                                                        e91 e91Var7 = new e91(1, sa1Var5, sa1.class, "saveFpsLimit", "saveFpsLimit(I)V", 0, 0, 15);
                                                        nv0Var4.j0(e91Var7);
                                                        objO13 = e91Var7;
                                                    }
                                                    ns0 ns0Var7 = (ns0) ((ct0) objO13);
                                                    boolean zH13 = nv0Var4.h(sa1Var5);
                                                    Object objO14 = nv0Var4.O();
                                                    if (zH13 || objO14 == zjVar) {
                                                        e91 e91Var8 = new e91(1, sa1Var5, sa1.class, "saveFontSize", "saveFontSize(I)V", 0, 0, 16);
                                                        nv0Var4.j0(e91Var8);
                                                        objO14 = e91Var8;
                                                    }
                                                    g12.i(cs0Var3, zBooleanValue3, zBooleanValue4, qf2Var, zBooleanValue5, iIntValue4, iIntValue5, ns0Var3, ns0Var4, ns0Var5, ns0Var6, ns0Var7, (ns0) ((ct0) objO14), nv0Var4, 0);
                                                }
                                                break;
                                        }
                                        return dm3Var3;
                                    }
                                }, nv0Var), nv0Var, 48);
                                break;
                        }
                        return dm3Var2;
                    }
                }, true), 254);
                br.p(ju1Var, "settings_about", null, new d00(-1906565408, new ts0() { // from class: j91
                    @Override // defpackage.ts0
                    public final Object l(Object obj8, Object obj9, Object obj10, Object obj11) {
                        sd sdVar = (sd) obj8;
                        nv0 nv0Var = (nv0) obj10;
                        ((Integer) obj11).getClass();
                        sdVar.getClass();
                        ((qt1) obj9).getClass();
                        vr.d(new he2[]{da1.a.a(c33Var), da1.b.a(sdVar)}, gq.N(948655008, new w1(nu1Var, go3Var, os1Var, 7), nv0Var), nv0Var, 48);
                        return dm3.a;
                    }
                }, true), 254);
                br.p(ju1Var, "raksamp/{instanceId}", vr.K(new et1("instanceId", new pt1(xu1.d))), new d00(-1756424065, new ba(i4, nu1Var), true), 252);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                vm1.n((String) obj7, (x50) obj6, (os1) obj5, (os1) obj4, (vi2) obj3, (vg2) obj2, str);
                break;
        }
        return dm3Var;
    }
}
