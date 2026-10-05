package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class hr0 implements sq2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hr0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sq2
    public final Bundle a() {
        ArrayList arrayList;
        dl[] dlVarArr;
        int size;
        r32[] r32VarArr;
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                wf wfVar = (wf) obj;
                wfVar.markFragmentsCreated();
                wfVar.mFragmentLifecycleRegistry.e(ef1.ON_STOP);
                return new Bundle();
            case 1:
                return xz.a((xz) obj);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                Map mapC = ((hq2) obj).c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapC.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ur0 ur0Var = (ur0) obj;
                ur0Var.getClass();
                Bundle bundle2 = new Bundle();
                Iterator it = ur0Var.b().iterator();
                while (it.hasNext()) {
                    ((n83) it.next()).getClass();
                }
                Iterator it2 = ur0Var.b().iterator();
                if (it2.hasNext()) {
                    ((n83) it2.next()).a();
                    throw null;
                }
                ur0Var.e(true);
                ur0Var.y = true;
                ur0Var.E.getClass();
                pl plVar = ur0Var.c;
                plVar.getClass();
                HashMap map = (HashMap) plVar.h;
                ArrayList arrayList2 = new ArrayList(map.size());
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        qn1.b();
                        return null;
                    }
                }
                pl plVar2 = ur0Var.c;
                plVar2.getClass();
                ArrayList arrayList3 = new ArrayList(((HashMap) plVar2.i).values());
                if (arrayList3.isEmpty()) {
                    if (!ur0.h(2)) {
                        return bundle2;
                    }
                    Log.v("FragmentManager", "saveAllState: no fragments!");
                    return bundle2;
                }
                pl plVar3 = ur0Var.c;
                synchronized (((ArrayList) plVar3.g)) {
                    try {
                        if (((ArrayList) plVar3.g).isEmpty()) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(((ArrayList) plVar3.g).size());
                            Iterator it4 = ((ArrayList) plVar3.g).iterator();
                            if (it4.hasNext()) {
                                if (it4.next() == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            }
                        }
                    } finally {
                    }
                }
                ArrayList arrayList4 = ur0Var.d;
                if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                    dlVarArr = null;
                } else {
                    dlVarArr = new dl[size];
                    for (int i3 = 0; i3 < size; i3++) {
                        dlVarArr[i3] = new dl((cl) ur0Var.d.get(i3));
                        if (ur0.h(2)) {
                            StringBuilder sbM = nc2.m("saveAllState: adding back stack #", ": ", i3);
                            sbM.append(ur0Var.d.get(i3));
                            Log.v("FragmentManager", sbM.toString());
                        }
                    }
                }
                wr0 wr0Var = new wr0();
                wr0Var.j = null;
                ArrayList arrayList5 = new ArrayList();
                wr0Var.k = arrayList5;
                ArrayList arrayList6 = new ArrayList();
                wr0Var.l = arrayList6;
                wr0Var.f = arrayList2;
                wr0Var.g = arrayList;
                wr0Var.h = dlVarArr;
                wr0Var.i = ur0Var.h.get();
                arrayList5.addAll(ur0Var.i.keySet());
                arrayList6.addAll(ur0Var.i.values());
                wr0Var.m = new ArrayList(ur0Var.x);
                bundle2.putParcelable("state", wr0Var);
                for (String str2 : ur0Var.j.keySet()) {
                    bundle2.putBundle(by1.g("result_", str2), (Bundle) ur0Var.j.get(str2));
                }
                int size2 = arrayList3.size();
                while (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    yr0 yr0Var = (yr0) obj2;
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("state", yr0Var);
                    bundle2.putBundle("fragment_" + yr0Var.g, bundle3);
                }
                return bundle2;
            default:
                qk qkVar = (qk) obj;
                for (Map.Entry entry2 : om1.b0((LinkedHashMap) qkVar.d).entrySet()) {
                    qkVar.n(((i93) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : om1.b0((LinkedHashMap) qkVar.b).entrySet()) {
                    qkVar.n(((sq2) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) qkVar.a;
                if (linkedHashMap.isEmpty()) {
                    r32VarArr = new r32[0];
                } else {
                    ArrayList arrayList7 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList7.add(new r32((String) entry4.getKey(), entry4.getValue()));
                    }
                    r32VarArr = (r32[]) arrayList7.toArray(new r32[0]);
                }
                return vp.u((r32[]) Arrays.copyOf(r32VarArr, r32VarArr.length));
        }
    }
}
