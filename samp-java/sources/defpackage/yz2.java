package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class yz2 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ d92 g;
    public final /* synthetic */ os1 h;
    public final /* synthetic */ os1 i;
    public final /* synthetic */ ot0 j;
    public final /* synthetic */ String k;
    public final /* synthetic */ e92 l;

    public /* synthetic */ yz2(int i, ot0 ot0Var, os1 os1Var, os1 os1Var2, d92 d92Var, e92 e92Var, String str) {
        this.f = i;
        this.g = d92Var;
        this.h = os1Var;
        this.i = os1Var2;
        this.j = ot0Var;
        this.k = str;
        this.l = e92Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        d92 d92Var;
        os1 os1Var;
        Object next;
        boolean z;
        boolean z2;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj4 = c20.a;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    d92 d92Var2 = this.g;
                    for (n82 n82Var : ((s82) d92Var2).d) {
                        float f = on1.a;
                        r93 r93Var = hy.a;
                        long j = ((fy) nv0Var.j(r93Var)).q;
                        long j2 = wx.g;
                        un1 un1VarA = on1.a((fy) nv0Var.j(r93Var));
                        if (j == 16) {
                            j = un1VarA.a;
                        }
                        long j3 = j;
                        long j4 = j2 != 16 ? j2 : un1VarA.b;
                        long j5 = j2 != 16 ? j2 : un1VarA.c;
                        long j6 = j2 != 16 ? j2 : un1VarA.d;
                        long j7 = j2 != 16 ? j2 : un1VarA.e;
                        if (j2 == 16) {
                            j2 = un1VarA.f;
                        }
                        un1 un1Var = new un1(j3, j4, j5, j6, j7, j2);
                        d00 d00VarN = gq.N(-1575137324, new pt2(3, n82Var), nv0Var);
                        os1 os1Var2 = this.h;
                        boolean zF = nv0Var.f(os1Var2) | nv0Var.h(n82Var);
                        os1 os1Var3 = this.i;
                        boolean zF2 = zF | nv0Var.f(os1Var3);
                        ot0 ot0Var = this.j;
                        boolean zF3 = zF2 | nv0Var.f(ot0Var);
                        String str = this.k;
                        boolean zF4 = zF3 | nv0Var.f(str);
                        e92 e92Var = this.l;
                        boolean zH = zF4 | nv0Var.h(e92Var) | nv0Var.h(d92Var2);
                        Object objO = nv0Var.O();
                        if (zH || objO == obj4) {
                            Object t81Var = new t81(n82Var, ot0Var, str, e92Var, d92Var2, os1Var2, os1Var3);
                            d92Var = d92Var2;
                            nv0Var.j0(t81Var);
                            objO = t81Var;
                        } else {
                            d92Var = d92Var2;
                        }
                        u9.b(d00VarN, (cs0) objO, null, false, un1Var, null, nv0Var, 6, 444);
                        d92Var2 = d92Var;
                    }
                } else {
                    nv0Var.U();
                }
                break;
            default:
                ok0 ok0Var = (ok0) obj;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ok0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? nv0Var2.f(ok0Var) : nv0Var2.h(ok0Var) ? 4 : 2;
                }
                int i2 = iIntValue2;
                if (nv0Var2.R(i2 & 1, (i2 & 19) != 18)) {
                    d92 d92Var3 = this.g;
                    s82 s82Var = (s82) d92Var3;
                    List list = s82Var.d;
                    boolean z3 = s82Var.h;
                    boolean z4 = s82Var.f;
                    Iterator it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        os1Var = this.i;
                        if (zHasNext) {
                            next = it.next();
                            if (((n82) next).a.equals((String) os1Var.getValue())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    n82 n82Var2 = (n82) next;
                    String str2 = n82Var2 != null ? n82Var2.b : (String) os1Var.getValue();
                    if (!z4 || z3) {
                        z = z3;
                        z2 = false;
                    } else {
                        z = z3;
                        z2 = true;
                    }
                    se3 se3VarU = p03.u(nv0Var2);
                    bq1 bq1VarB = ok0Var.b(j43.c(yp1.a, 1.0f), z4 && !z);
                    Object objO2 = nv0Var2.O();
                    if (objO2 == obj4) {
                        objO2 = new cr2(24);
                        nv0Var2.j0(objO2);
                    }
                    os1 os1Var4 = this.h;
                    g12.m(str2, (ns0) objO2, bq1VarB, z2, true, null, null, null, null, gq.N(95288553, new l8(os1Var4, 15), nv0Var2), null, false, null, null, null, false, 0, 0, null, se3VarU, nv0Var2, 805330992, 0, 4193760);
                    boolean zBooleanValue = ((Boolean) os1Var4.getValue()).booleanValue();
                    boolean zF5 = nv0Var2.f(os1Var4);
                    Object objO3 = nv0Var2.O();
                    if (zF5 || objO3 == obj4) {
                        objO3 = new mh2(os1Var4, 26);
                        nv0Var2.j0(objO3);
                    }
                    ok0Var.a(zBooleanValue, (cs0) objO3, null, null, false, null, 0L, 0.0f, gq.N(461219312, new yz2(0, this.j, os1Var, os1Var4, d92Var3, this.l, this.k), nv0Var2), nv0Var2, 0, 6 | ((i2 << 3) & 112));
                } else {
                    nv0Var2.U();
                }
                break;
        }
        return dm3Var;
    }
}
