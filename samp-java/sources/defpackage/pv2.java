package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class pv2 extends qv2 {
    public static nv2 G(Iterator it) {
        it.getClass();
        return new l30(new vj(3, it));
    }

    public static nv2 H(Object obj, ns0 ns0Var) {
        if (obj == null) {
            return ri0.a;
        }
        return new bm0(1, new it1(17, obj), ns0Var);
    }

    public static String I(nv2 nv2Var, String str, e91 e91Var, int i) {
        if ((i & 32) != 0) {
            e91Var = null;
        }
        nv2Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : nv2Var) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            y02.e(sb, obj, e91Var);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static jm0 J(nv2 nv2Var, ns0 ns0Var) {
        return new jm0(new sc3(nv2Var, ns0Var, 1), false, new cr2(17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static nv2 K(jm0 jm0Var, int i) {
        if (i >= 0) {
            return i == 0 ? ri0.a : jm0Var instanceof fg0 ? ((fg0) jm0Var).a(i) : new eg0(jm0Var, i, 1);
        }
        c.g(by1.h("Requested element count ", " is less than zero.", i));
        return null;
    }

    public static List L(nv2 nv2Var) {
        Iterator it = nv2Var.iterator();
        if (!it.hasNext()) {
            return ni0.f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return vr.K(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
