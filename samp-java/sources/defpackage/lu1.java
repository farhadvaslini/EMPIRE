package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class lu1 {
    public final iu1 a;
    public final l83 b = new l83(0);
    public int c;
    public String d;
    public String e;

    public lu1(iu1 iu1Var) {
        this.a = iu1Var;
    }

    public final fu1 a(int i) {
        return c(i, this.a, null, false);
    }

    public final fu1 b(String str, boolean z) {
        Object next;
        iu1 iu1Var;
        str.getClass();
        l83 l83Var = this.b;
        l83Var.getClass();
        Iterator it = ((l30) pv2.G(new a0(2, l83Var))).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            fu1 fu1Var = (fu1) next;
            if (fa3.Z((String) fu1Var.g.e, str, false) || fu1Var.g.e(str) != null) {
                break;
            }
        }
        fu1 fu1Var2 = (fu1) next;
        if (fu1Var2 != null) {
            return fu1Var2;
        }
        if (!z || (iu1Var = this.a.h) == null) {
            return null;
        }
        lu1 lu1Var = iu1Var.k;
        lu1Var.getClass();
        if (y93.q0(str)) {
            return null;
        }
        return lu1Var.b(str, true);
    }

    public final fu1 c(int i, fu1 fu1Var, fu1 fu1Var2, boolean z) {
        l83 l83Var = this.b;
        fu1 fu1VarC = (fu1) l83Var.b(i);
        if (fu1Var2 != null) {
            if (s51.n(fu1VarC, fu1Var2) && s51.n(fu1VarC.h, fu1Var2.h)) {
                return fu1VarC;
            }
            fu1VarC = null;
        } else if (fu1VarC != null) {
            return fu1VarC;
        }
        iu1 iu1Var = this.a;
        if (z) {
            Iterator it = ((l30) pv2.G(new a0(2, l83Var))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    fu1VarC = null;
                    break;
                }
                fu1 fu1Var3 = (fu1) it.next();
                fu1VarC = (!(fu1Var3 instanceof iu1) || fu1Var3.equals(fu1Var)) ? null : ((iu1) fu1Var3).k.c(i, iu1Var, fu1Var2, true);
                if (fu1VarC != null) {
                    break;
                }
            }
        }
        if (fu1VarC != null) {
            return fu1VarC;
        }
        iu1 iu1Var2 = iu1Var.h;
        if (iu1Var2 == null || iu1Var2.equals(fu1Var)) {
            return null;
        }
        iu1 iu1Var3 = iu1Var.h;
        iu1Var3.getClass();
        return iu1Var3.k.c(i, iu1Var, fu1Var2, z);
    }

    public final eu1 d(eu1 eu1Var, pi piVar, boolean z, fu1 fu1Var) {
        eu1 eu1VarF;
        ArrayList arrayList = new ArrayList();
        iu1 iu1Var = this.a;
        Iterator it = iu1Var.iterator();
        while (true) {
            ku1 ku1Var = (ku1) it;
            if (!ku1Var.hasNext()) {
                break;
            }
            fu1 fu1Var2 = (fu1) ku1Var.next();
            eu1VarF = s51.n(fu1Var2, fu1Var) ? null : fu1Var2.e(piVar);
            if (eu1VarF != null) {
                arrayList.add(eu1VarF);
            }
        }
        eu1 eu1Var2 = (eu1) qx.A0(arrayList);
        iu1 iu1Var2 = iu1Var.h;
        if (iu1Var2 != null && z && !iu1Var2.equals(fu1Var)) {
            eu1VarF = iu1Var2.f(piVar, iu1Var);
        }
        return (eu1) qx.A0(uj.R(new eu1[]{eu1Var, eu1Var2, eu1VarF}));
    }
}
