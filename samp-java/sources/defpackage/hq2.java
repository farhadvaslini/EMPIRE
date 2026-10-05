package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hq2 implements gq2 {
    public final ns0 f;
    public final is1 g;
    public is1 h;

    public hq2(Map map, ns0 ns0Var) {
        is1 is1Var;
        this.f = ns0Var;
        if (map == null || map.isEmpty()) {
            is1Var = null;
        } else {
            is1Var = new is1(map.size());
            for (Map.Entry entry : map.entrySet()) {
                is1Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.g = is1Var;
    }

    @Override // defpackage.gq2
    public final fq2 a(String str, cs0 cs0Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ur.I(str.charAt(i))) {
                is1 is1Var = this.h;
                if (is1Var == null) {
                    long[] jArr = nr2.a;
                    is1Var = new is1();
                    this.h = is1Var;
                }
                Object objG = is1Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    is1Var.m(str, objG);
                }
                ((List) objG).add(cs0Var);
                return new pi(is1Var, str, cs0Var, 17);
            }
        }
        c.p("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.gq2
    public final boolean b(Object obj) {
        return ((Boolean) this.f.h(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // defpackage.gq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map c() {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq2.c():java.util.Map");
    }

    @Override // defpackage.gq2
    public final Object d(String str) {
        is1 is1Var = this.g;
        List list = is1Var != null ? (List) is1Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && is1Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = is1Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = is1Var.c;
            Object obj = objArr[iF];
            is1Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
