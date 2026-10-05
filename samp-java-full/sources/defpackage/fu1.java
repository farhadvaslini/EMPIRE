package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class fu1 {
    public static final /* synthetic */ int j = 0;
    public final String f;
    public final yf g;
    public iu1 h;
    public final l83 i;

    static {
        new LinkedHashMap();
    }

    public fu1(yv1 yv1Var) {
        yv1Var.getClass();
        LinkedHashMap linkedHashMap = zv1.b;
        this.f = uq.w(yv1Var.getClass());
        yf yfVar = new yf();
        yfVar.b = this;
        yfVar.c = new ArrayList();
        yfVar.d = new LinkedHashMap();
        this.g = yfVar;
        this.i = new l83(0);
    }

    public final Bundle a(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.g.d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ((pt1) entry.getValue()).getClass();
            str.getClass();
        }
        if (bundle != null) {
            bundleU.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                pt1 pt1Var = (pt1) entry2.getValue();
                pt1Var.getClass();
                xu1 xu1Var = pt1Var.a;
                str2.getClass();
                if (!bundleU.containsKey(str2) || !g12.X(str2, bundleU)) {
                    try {
                        xu1Var.a(str2, bundleU);
                    } catch (IllegalStateException unused) {
                    }
                }
                throw new IllegalArgumentException(("Wrong argument type for '" + str2 + "' in argument savedState. " + xu1Var.b() + " expected.").toString());
            }
        }
        return bundleU;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] b(fu1 fu1Var) {
        mj mjVar = new mj();
        while (true) {
            yf yfVar = this.g;
            iu1 iu1Var = this.h;
            if ((fu1Var != null ? fu1Var.h : null) != null) {
                iu1 iu1Var2 = fu1Var.h;
                iu1Var2.getClass();
                if (iu1Var2.k.a(yfVar.a) != this) {
                    if (iu1Var == null || iu1Var.k.c != yfVar.a) {
                        mjVar.addFirst(this);
                    }
                    if (s51.n(iu1Var, fu1Var) || iu1Var == null) {
                        break;
                    }
                    this = iu1Var;
                } else {
                    mjVar.addFirst(this);
                    break;
                }
            }
        }
        List listN0 = qx.N0(mjVar);
        ArrayList arrayList = new ArrayList(rx.d0(listN0, 10));
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((fu1) it.next()).g.a));
        }
        return qx.M0(arrayList);
    }

    public final Map c() {
        return om1.b0((LinkedHashMap) this.g.d);
    }

    public eu1 e(pi piVar) {
        boolean zC;
        uk2 uk2Var;
        sm1 sm1VarB;
        yf yfVar = this.g;
        LinkedHashMap linkedHashMap = (LinkedHashMap) yfVar.d;
        Uri uri = (Uri) piVar.g;
        ArrayList arrayList = (ArrayList) yfVar.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        eu1 eu1Var = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            cu1 cu1Var = (cu1) obj;
            cu1Var.getClass();
            xb3 xb3Var = cu1Var.d;
            if (((uk2) xb3Var.getValue()) == null) {
                zC = true;
            } else if (uri == null) {
                zC = false;
            } else {
                uk2 uk2Var2 = (uk2) xb3Var.getValue();
                uk2Var2.getClass();
                zC = uk2Var2.c(uri.toString());
            }
            if (zC) {
                Bundle bundleD = uri != null ? cu1Var.d(uri, linkedHashMap) : null;
                int iB = cu1Var.b(uri);
                String str = (String) piVar.h;
                boolean z = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z) {
                        linkedHashMap.getClass();
                        Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                        if (uri != null && (uk2Var = (uk2) xb3Var.getValue()) != null && (sm1VarB = uk2Var.b(uri.toString())) != null) {
                            cu1Var.e(sm1VarB, bundleU, linkedHashMap);
                            if (((Boolean) cu1Var.e.getValue()).booleanValue()) {
                                cu1Var.f(uri, bundleU, linkedHashMap);
                            }
                        }
                        if (vr.M(linkedHashMap, new au1(1, bundleU)).isEmpty()) {
                        }
                    }
                }
                eu1 eu1Var2 = new eu1((fu1) yfVar.b, bundleD, cu1Var.l, iB, z);
                if (eu1Var == null || eu1Var2.compareTo(eu1Var) > 0) {
                    eu1Var = eu1Var2;
                }
            }
        }
        return eu1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof fu1)) {
                yf yfVar = this.g;
                ArrayList arrayList = (ArrayList) yfVar.c;
                fu1 fu1Var = (fu1) obj;
                l83 l83Var = fu1Var.i;
                yf yfVar2 = fu1Var.g;
                boolean zN = s51.n(arrayList, (ArrayList) yfVar2.c);
                l83 l83Var2 = this.i;
                if (l83Var2.e() == l83Var.e()) {
                    Iterator it = ((l30) pv2.G(new m83(l83Var2))).iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        if (!s51.n(l83Var2.b(iIntValue), l83Var.b(iIntValue))) {
                        }
                    }
                    z = true;
                    if (c().size() == fu1Var.c().size()) {
                        Set<Map.Entry> setEntrySet = c().entrySet();
                        setEntrySet.getClass();
                        for (Map.Entry entry : setEntrySet) {
                            if (!fu1Var.c().containsKey(entry.getKey()) || !s51.n(fu1Var.c().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z2 = true;
                        if (yfVar.a == yfVar2.a || !s51.n((String) yfVar.e, (String) yfVar2.e) || !zN || !z || !z2) {
                        }
                    }
                    z2 = false;
                    if (yfVar.a == yfVar2.a) {
                    }
                }
                z = false;
                if (c().size() == fu1Var.c().size()) {
                }
                z2 = false;
                if (yfVar.a == yfVar2.a) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        yf yfVar = this.g;
        int i = yfVar.a * 31;
        String str = (String) yfVar.e;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) yfVar.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iHashCode = (((cu1) obj).a.hashCode() + (iHashCode * 31)) * 961;
        }
        l83 l83Var = this.i;
        l83Var.getClass();
        if (l83Var.e() > 0) {
            l83Var.f(0).getClass();
            qn1.b();
            return 0;
        }
        for (String str2 : c().keySet()) {
            int iA = by1.a(iHashCode * 31, 31, str2);
            Object obj2 = c().get(str2);
            iHashCode = iA + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        yf yfVar = this.g;
        yfVar.getClass();
        sb.append(Integer.toHexString(yfVar.a));
        sb.append(")");
        String str = (String) yfVar.e;
        if (str != null && !y93.q0(str)) {
            sb.append(" route=");
            sb.append((String) yfVar.e);
        }
        return sb.toString();
    }
}
