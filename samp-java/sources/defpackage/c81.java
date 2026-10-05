package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class c81 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ea1 g;
    public final /* synthetic */ ns0 h;

    public /* synthetic */ c81(int i, ns0 ns0Var, ea1 ea1Var) {
        this.f = i;
        this.g = ea1Var;
        this.h = ns0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        zj zjVar;
        final int i;
        int i2 = this.f;
        dm3 dm3Var = dm3.a;
        zj zjVar2 = c20.a;
        final ns0 ns0Var = this.h;
        ea1 ea1Var = this.g;
        int i3 = 1;
        switch (i2) {
            case 0:
                ep2 ep2Var = (ep2) obj;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ep2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= nv0Var.f(ep2Var) ? 4 : 2;
                }
                if (nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    for (final ea1 ea1Var2 : ea1.k) {
                        String strM = oz2.M(ea1Var2.f, nv0Var);
                        boolean z = ea1Var2 == ea1Var;
                        boolean zF = nv0Var.f(ns0Var) | nv0Var.d(ea1Var2.ordinal());
                        Object objO = nv0Var.O();
                        if (zF || objO == zjVar2) {
                            final int i4 = 0;
                            objO = new cs0() { // from class: d81
                                @Override // defpackage.cs0
                                public final Object a() {
                                    int i5 = i4;
                                    dm3 dm3Var2 = dm3.a;
                                    ea1 ea1Var3 = ea1Var2;
                                    ns0 ns0Var2 = ns0Var;
                                    switch (i5) {
                                        case 0:
                                            ns0Var2.h(ea1Var3);
                                            break;
                                        default:
                                            ns0Var2.h(ea1Var3);
                                            break;
                                    }
                                    return dm3Var2;
                                }
                            };
                            nv0Var.j0(objO);
                        }
                        fh1.a(ep2Var, (cs0) objO, null, gq.N(918424153, new yv(ea1Var2, z, strM, 3), nv0Var), nv0Var, (iIntValue & 14) | 3072);
                    }
                } else {
                    nv0Var.U();
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Iterator it = ea1.k.iterator();
                    while (it.hasNext()) {
                        final ea1 ea1Var3 = (ea1) it.next();
                        String strM2 = oz2.M(ea1Var3.f, nv0Var2);
                        int i5 = ea1Var == ea1Var3 ? i3 : 0;
                        r93 r93Var = hy.a;
                        long j = ((fy) nv0Var2.j(r93Var)).q;
                        long j2 = ((fy) nv0Var2.j(r93Var)).q;
                        zj zjVar3 = zjVar2;
                        long jB = wx.b(0.62f, ((fy) nv0Var2.j(r93Var)).H);
                        Iterator it2 = it;
                        dm3 dm3Var2 = dm3Var;
                        long j3 = ((fy) nv0Var2.j(r93Var)).s;
                        long j4 = ((fy) nv0Var2.j(r93Var)).s;
                        long jB2 = wx.b(0.38f, j3);
                        long jB3 = wx.b(0.38f, j4);
                        tv1 tv1VarV = pq.v((fy) nv0Var2.j(r93Var));
                        if (j == 16) {
                            j = tv1VarV.a;
                        }
                        long j5 = j;
                        if (j2 == 16) {
                            j2 = tv1VarV.b;
                        }
                        long j6 = j2;
                        long j7 = jB != 16 ? jB : tv1VarV.c;
                        if (j3 == 16) {
                            j3 = tv1VarV.d;
                        }
                        long j8 = j3;
                        if (j4 == 16) {
                            j4 = tv1VarV.e;
                        }
                        tv1 tv1Var = new tv1(j5, j6, j7, j8, j4, jB2 != 16 ? jB2 : tv1VarV.f, jB3 != 16 ? jB3 : tv1VarV.g);
                        boolean zF2 = nv0Var2.f(ns0Var) | nv0Var2.d(ea1Var3.ordinal());
                        Object objO2 = nv0Var2.O();
                        if (zF2) {
                            zjVar = zjVar3;
                        } else {
                            zjVar = zjVar3;
                            if (objO2 != zjVar) {
                                i = 1;
                            }
                            nv0 nv0Var3 = nv0Var2;
                            wv1.b(i5, (cs0) objO2, gq.N(-1427704571, new y7(21, ea1Var3, strM2), nv0Var2), null, false, gq.N(711889186, new z71(strM2, 2, (byte) 0), nv0Var2), false, tv1Var, nv0Var3, 196992, 344);
                            zjVar2 = zjVar;
                            i3 = i;
                            nv0Var2 = nv0Var3;
                            dm3Var = dm3Var2;
                            it = it2;
                        }
                        i = 1;
                        objO2 = new cs0() { // from class: d81
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i52 = i;
                                dm3 dm3Var22 = dm3.a;
                                ea1 ea1Var32 = ea1Var3;
                                ns0 ns0Var2 = ns0Var;
                                switch (i52) {
                                    case 0:
                                        ns0Var2.h(ea1Var32);
                                        break;
                                    default:
                                        ns0Var2.h(ea1Var32);
                                        break;
                                }
                                return dm3Var22;
                            }
                        };
                        nv0Var2.j0(objO2);
                        nv0 nv0Var32 = nv0Var2;
                        wv1.b(i5, (cs0) objO2, gq.N(-1427704571, new y7(21, ea1Var3, strM2), nv0Var2), null, false, gq.N(711889186, new z71(strM2, 2, (byte) 0), nv0Var2), false, tv1Var, nv0Var32, 196992, 344);
                        zjVar2 = zjVar;
                        i3 = i;
                        nv0Var2 = nv0Var32;
                        dm3Var = dm3Var2;
                        it = it2;
                    }
                } else {
                    nv0Var2.U();
                }
                break;
        }
        return dm3Var;
    }
}
