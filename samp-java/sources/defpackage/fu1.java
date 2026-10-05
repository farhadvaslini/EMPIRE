package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] b(defpackage.fu1 r6) {
        /*
            r5 = this;
            mj r0 = new mj
            r0.<init>()
        L5:
            yf r1 = r5.g
            iu1 r2 = r5.h
            if (r6 == 0) goto Le
            iu1 r3 = r6.h
            goto Lf
        Le:
            r3 = 0
        Lf:
            if (r3 == 0) goto L24
            iu1 r3 = r6.h
            r3.getClass()
            int r4 = r1.a
            lu1 r3 = r3.k
            fu1 r3 = r3.a(r4)
            if (r3 != r5) goto L24
            r0.addFirst(r5)
            goto L3a
        L24:
            if (r2 == 0) goto L2e
            lu1 r3 = r2.k
            int r3 = r3.c
            int r1 = r1.a
            if (r3 == r1) goto L31
        L2e:
            r0.addFirst(r5)
        L31:
            boolean r5 = defpackage.s51.n(r2, r6)
            if (r5 == 0) goto L38
            goto L3a
        L38:
            if (r2 != 0) goto L6a
        L3a:
            java.util.List r5 = defpackage.qx.N0(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.rx.d0(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L4d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r5.next()
            fu1 r0 = (defpackage.fu1) r0
            yf r0 = r0.g
            int r0 = r0.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
            goto L4d
        L65:
            int[] r5 = defpackage.qx.M0(r6)
            return r5
        L6a:
            r5 = r2
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu1.b(fu1):int[]");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu1.equals(java.lang.Object):boolean");
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
