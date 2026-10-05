package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class iu1 extends fu1 implements Iterable, t61 {
    public static final /* synthetic */ int l = 0;
    public final lu1 k;

    public iu1(mu1 mu1Var) {
        super(mu1Var);
        this.k = new lu1(this);
    }

    @Override // defpackage.fu1
    public final eu1 e(pi piVar) {
        eu1 eu1VarE = super.e(piVar);
        lu1 lu1Var = this.k;
        lu1Var.getClass();
        return lu1Var.d(eu1VarE, piVar, false, lu1Var.a);
    }

    @Override // defpackage.fu1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof iu1) || !super.equals(obj)) {
            return false;
        }
        lu1 lu1Var = this.k;
        int iE = lu1Var.b.e();
        lu1 lu1Var2 = ((iu1) obj).k;
        if (iE != lu1Var2.b.e() || lu1Var.c != lu1Var2.c) {
            return false;
        }
        l83 l83Var = lu1Var.b;
        l83Var.getClass();
        for (fu1 fu1Var : (l30) pv2.G(new a0(2, l83Var))) {
            if (!fu1Var.equals(lu1Var2.b.b(fu1Var.g.a))) {
                return false;
            }
        }
        return true;
    }

    public final eu1 f(pi piVar, fu1 fu1Var) {
        return this.k.d(super.e(piVar), piVar, true, fu1Var);
    }

    public final eu1 g(String str, boolean z, fu1 fu1Var) {
        eu1 eu1VarG;
        lu1 lu1Var = this.k;
        lu1Var.getClass();
        iu1 iu1Var = lu1Var.a;
        eu1 eu1VarE = iu1Var.g.e(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = iu1Var.iterator();
        while (true) {
            ku1 ku1Var = (ku1) it;
            eu1VarG = null;
            if (!ku1Var.hasNext()) {
                break;
            }
            fu1 fu1Var2 = (fu1) ku1Var.next();
            if (!s51.n(fu1Var2, fu1Var)) {
                if (fu1Var2 instanceof iu1) {
                    eu1VarG = ((iu1) fu1Var2).g(str, false, iu1Var);
                } else {
                    fu1Var2.getClass();
                    eu1VarG = fu1Var2.g.e(str);
                }
            }
            if (eu1VarG != null) {
                arrayList.add(eu1VarG);
            }
        }
        eu1 eu1Var = (eu1) qx.A0(arrayList);
        iu1 iu1Var2 = iu1Var.h;
        if (iu1Var2 != null && z && !iu1Var2.equals(fu1Var)) {
            eu1VarG = iu1Var2.g(str, true, iu1Var);
        }
        return (eu1) qx.A0(uj.R(new eu1[]{eu1VarE, eu1Var, eu1VarG}));
    }

    @Override // defpackage.fu1
    public final int hashCode() {
        lu1 lu1Var = this.k;
        int iC = lu1Var.c;
        l83 l83Var = lu1Var.b;
        int iE = l83Var.e();
        for (int i = 0; i < iE; i++) {
            iC = (((iC * 31) + l83Var.c(i)) * 31) + ((fu1) l83Var.f(i)).hashCode();
        }
        return iC;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        lu1 lu1Var = this.k;
        lu1Var.getClass();
        return new ku1(lu1Var);
    }

    @Override // defpackage.fu1
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        lu1 lu1Var = this.k;
        String str = lu1Var.e;
        lu1Var.getClass();
        fu1 fu1VarB = (str == null || y93.q0(str)) ? null : lu1Var.b(str, true);
        if (fu1VarB == null) {
            fu1VarB = lu1Var.a(lu1Var.c);
        }
        sb.append(" startDestination=");
        if (fu1VarB == null) {
            String str2 = lu1Var.e;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = lu1Var.d;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(lu1Var.c));
                }
            }
        } else {
            sb.append("{");
            sb.append(fu1VarB.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
