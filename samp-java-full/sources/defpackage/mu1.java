package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
@xv1("navigation")
public class mu1 extends yv1 {
    public final zv1 c;

    public mu1(zv1 zv1Var) {
        zv1Var.getClass();
        this.c = zv1Var;
    }

    @Override // defpackage.yv1
    public final void d(List list, vu1 vu1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qt1 qt1Var = (qt1) it.next();
            fu1 fu1Var = qt1Var.g;
            fu1Var.getClass();
            iu1 iu1Var = (iu1) fu1Var;
            yf yfVar = iu1Var.g;
            qk2 qk2Var = new qk2();
            qk2Var.f = qt1Var.m.a();
            lu1 lu1Var = iu1Var.k;
            int i = lu1Var.c;
            String str = lu1Var.e;
            if (i == 0 && str == null) {
                yfVar.getClass();
                String strValueOf = String.valueOf(yfVar.a);
                strValueOf.getClass();
                if (lu1Var.a.g.a == 0) {
                    strValueOf = "the root navigation";
                }
                qn1.e("no start destination defined via app:startDestination for ".concat(strValueOf));
                return;
            }
            fu1 fu1VarB = str != null ? lu1Var.b(str, false) : (fu1) lu1Var.b.b(i);
            if (fu1VarB == null) {
                if (lu1Var.d == null) {
                    String strValueOf2 = lu1Var.e;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(lu1Var.c);
                    }
                    lu1Var.d = strValueOf2;
                }
                String str2 = lu1Var.d;
                str2.getClass();
                c.p(nc2.i("navigation destination ", str2, " is not a direct child of this NavGraph"));
                return;
            }
            yf yfVar2 = fu1VarB.g;
            if (str != null) {
                if (!str.equals((String) yfVar2.e)) {
                    eu1 eu1VarE = yfVar2.e(str);
                    Bundle bundle = eu1VarE != null ? eu1VarE.g : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                        bundleU.putAll(bundle);
                        Bundle bundle2 = (Bundle) qk2Var.f;
                        if (bundle2 != null) {
                            bundleU.putAll(bundle2);
                        }
                        qk2Var.f = bundleU;
                    }
                }
                if (fu1VarB.c().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListM = vr.M(fu1VarB.c(), new t6(3, qk2Var));
                    if (!arrayListM.isEmpty()) {
                        c.j("Cannot navigate to startDestination ", fu1VarB, ". Missing required arguments [", arrayListM, 93);
                        return;
                    }
                }
            }
            this.c.b(fu1VarB.f).d(vr.K(b().b(fu1VarB, fu1VarB.a((Bundle) qk2Var.f))), vu1Var);
        }
    }

    @Override // defpackage.yv1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public iu1 a() {
        return new iu1(this);
    }
}
