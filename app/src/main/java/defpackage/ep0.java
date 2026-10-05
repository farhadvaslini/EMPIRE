package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ep0 implements bp0 {
    public final h7 a;
    public final h7 b;
    public final zo0 d;
    public tr1 f;
    public rp0 h;
    public final rp0 c = new rp0(2, null, 14);
    public final dp0 e = new dp0(this);
    public final as1 g = new as1(1);

    public ep0(h7 h7Var, h7 h7Var2) {
        this.a = h7Var;
        this.b = h7Var2;
        this.d = new zo0(this, h7Var2);
    }

    public final boolean a(boolean z) {
        ax1 ax1Var;
        if (f() != null) {
            rp0 rp0VarF = f();
            i(null);
            if (rp0VarF != null) {
                mp0 mp0Var = mp0.f;
                mp0 mp0Var2 = mp0.h;
                rp0VarF.q1(mp0Var, mp0Var2);
                if (!rp0VarF.f.s) {
                    m21.c("visitAncestors called on an unattached node");
                }
                aq1 aq1Var = rp0VarF.f.j;
                tb1 tb1VarX = vr.X(rp0VarF);
                while (tb1VarX != null) {
                    if ((tb1VarX.L.f.i & 1024) != 0) {
                        while (aq1Var != null) {
                            if ((aq1Var.h & 1024) != 0) {
                                aq1 aq1VarJ = aq1Var;
                                qs1 qs1Var = null;
                                while (aq1VarJ != null) {
                                    if (aq1VarJ instanceof rp0) {
                                        ((rp0) aq1VarJ).q1(mp0.g, mp0Var2);
                                    } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                        int i = 0;
                                        for (aq1 aq1Var2 = ((ja0) aq1VarJ).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                                            if ((aq1Var2.h & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    aq1VarJ = aq1Var2;
                                                } else {
                                                    if (qs1Var == null) {
                                                        qs1Var = new qs1(new aq1[16]);
                                                    }
                                                    if (aq1VarJ != null) {
                                                        qs1Var.b(aq1VarJ);
                                                        aq1VarJ = null;
                                                    }
                                                    qs1Var.b(aq1Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    aq1VarJ = vr.j(qs1Var);
                                }
                            }
                            aq1Var = aq1Var.j;
                        }
                    }
                    tb1VarX = tb1VarX.u();
                    aq1Var = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = uq.z(this.c, i).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                c.k();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        h7 h7Var = this.a;
        if (h7Var.isFocused() || h7Var.hasFocus()) {
            h7Var.clearFocus();
        } else if (h7Var.hasFocus()) {
            View viewFindFocus = h7Var.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            h7Var.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [qs1] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [qs1] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [aq1] */
    /* JADX WARN: Type inference failed for: r12v24, types: [aq1] */
    /* JADX WARN: Type inference failed for: r12v28, types: [aq1] */
    /* JADX WARN: Type inference failed for: r12v29, types: [aq1] */
    /* JADX WARN: Type inference failed for: r12v33, types: [aq1] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42, types: [aq1] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [qs1] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(KeyEvent keyEvent, cs0 cs0Var) {
        ia0 ia0Var;
        aq1 aq1Var;
        ax1 ax1Var;
        ia0 ia0Var2;
        ax1 ax1Var2;
        int size;
        ax1 ax1Var3;
        boolean z;
        rp0 rp0Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!j(keyEvent)) {
                return false;
            }
            rp0 rp0VarS = br.s(rp0Var);
            if (rp0VarS != null) {
                if (!rp0VarS.f.s) {
                    m21.c("visitLocalDescendants called on an unattached node");
                }
                aq1 aq1Var2 = rp0VarS.f;
                if ((aq1Var2.i & 9216) != 0) {
                    aq1Var = null;
                    for (aq1 aq1Var3 = aq1Var2.k; aq1Var3 != null; aq1Var3 = aq1Var3.k) {
                        int i = aq1Var3.h;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            aq1Var = aq1Var3;
                        }
                    }
                } else {
                    aq1Var = null;
                }
                if (aq1Var == null) {
                }
            } else if (rp0VarS == null) {
                if (!rp0Var.f.s) {
                    m21.c("visitAncestors called on an unattached node");
                }
                aq1 aq1Var4 = rp0Var.f.j;
                tb1 tb1VarX = vr.X(rp0Var);
                loop15: while (true) {
                    if (tb1VarX == null) {
                        ia0Var = null;
                        break;
                    }
                    if ((tb1VarX.L.f.i & 8192) != 0) {
                        while (aq1Var4 != null) {
                            if ((aq1Var4.h & 8192) != 0) {
                                aq1 aq1VarJ = aq1Var4;
                                qs1 qs1Var = null;
                                while (aq1VarJ != null) {
                                    if (aq1VarJ instanceof i71) {
                                        ia0Var = aq1VarJ;
                                        break loop15;
                                    }
                                    if ((aq1VarJ.h & 8192) != 0 && (aq1VarJ instanceof ja0)) {
                                        aq1 aq1Var5 = ((ja0) aq1VarJ).u;
                                        int i2 = 0;
                                        aq1VarJ = aq1VarJ;
                                        qs1Var = qs1Var;
                                        while (aq1Var5 != null) {
                                            if ((aq1Var5.h & 8192) != 0) {
                                                i2++;
                                                qs1Var = qs1Var;
                                                if (i2 == 1) {
                                                    aq1VarJ = aq1Var5;
                                                } else {
                                                    if (qs1Var == null) {
                                                        qs1Var = new qs1(new aq1[16]);
                                                    }
                                                    if (aq1VarJ != null) {
                                                        qs1Var.b(aq1VarJ);
                                                        aq1VarJ = null;
                                                    }
                                                    qs1Var.b(aq1Var5);
                                                }
                                            }
                                            aq1Var5 = aq1Var5.k;
                                            aq1VarJ = aq1VarJ;
                                            qs1Var = qs1Var;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    aq1VarJ = vr.j(qs1Var);
                                }
                            }
                            aq1Var4 = aq1Var4.j;
                        }
                    }
                    tb1VarX = tb1VarX.u();
                    aq1Var4 = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
                }
                ia0 ia0Var3 = (i71) ia0Var;
                aq1Var = ia0Var3 != null ? ((aq1) ia0Var3).f : null;
            } else {
                if (!rp0VarS.f.s) {
                    m21.c("visitAncestors called on an unattached node");
                }
                aq1 aq1Var6 = rp0VarS.f;
                tb1 tb1VarX2 = vr.X(rp0VarS);
                loop11: while (true) {
                    if (tb1VarX2 == null) {
                        ia0Var2 = null;
                        break;
                    }
                    if ((tb1VarX2.L.f.i & 8192) != 0) {
                        while (aq1Var6 != null) {
                            if ((aq1Var6.h & 8192) != 0) {
                                qs1 qs1Var2 = null;
                                aq1 aq1VarJ2 = aq1Var6;
                                while (aq1VarJ2 != null) {
                                    if (aq1VarJ2 instanceof i71) {
                                        ia0Var2 = aq1VarJ2;
                                        break loop11;
                                    }
                                    if ((aq1VarJ2.h & 8192) != 0 && (aq1VarJ2 instanceof ja0)) {
                                        aq1 aq1Var7 = ((ja0) aq1VarJ2).u;
                                        int i3 = 0;
                                        aq1VarJ2 = aq1VarJ2;
                                        qs1Var2 = qs1Var2;
                                        while (aq1Var7 != null) {
                                            if ((aq1Var7.h & 8192) != 0) {
                                                i3++;
                                                qs1Var2 = qs1Var2;
                                                if (i3 == 1) {
                                                    aq1VarJ2 = aq1Var7;
                                                } else {
                                                    if (qs1Var2 == null) {
                                                        qs1Var2 = new qs1(new aq1[16]);
                                                    }
                                                    if (aq1VarJ2 != null) {
                                                        qs1Var2.b(aq1VarJ2);
                                                        aq1VarJ2 = null;
                                                    }
                                                    qs1Var2.b(aq1Var7);
                                                }
                                            }
                                            aq1Var7 = aq1Var7.k;
                                            aq1VarJ2 = aq1VarJ2;
                                            qs1Var2 = qs1Var2;
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    aq1VarJ2 = vr.j(qs1Var2);
                                }
                            }
                            aq1Var6 = aq1Var6.j;
                        }
                    }
                    tb1VarX2 = tb1VarX2.u();
                    aq1Var6 = (tb1VarX2 == null || (ax1Var2 = tb1VarX2.L) == null) ? null : ax1Var2.e;
                }
                ia0 ia0Var4 = (i71) ia0Var2;
                if (ia0Var4 != null) {
                    aq1Var = ((aq1) ia0Var4).f;
                }
            }
            if (aq1Var != null) {
                if (!aq1Var.f.s) {
                    m21.c("visitAncestors called on an unattached node");
                }
                aq1 aq1Var8 = aq1Var.f.j;
                tb1 tb1VarX3 = vr.X(aq1Var);
                ArrayList arrayList = null;
                while (tb1VarX3 != null) {
                    if ((tb1VarX3.L.f.i & 8192) != 0) {
                        while (aq1Var8 != null) {
                            if ((aq1Var8.h & 8192) != 0) {
                                aq1 aq1VarJ3 = aq1Var8;
                                qs1 qs1Var3 = null;
                                while (aq1VarJ3 != null) {
                                    if (aq1VarJ3 instanceof i71) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(aq1VarJ3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (aq1VarJ3.h & 8192) != 0 && (aq1VarJ3 instanceof ja0)) {
                                        int i4 = 0;
                                        for (aq1 aq1Var9 = ((ja0) aq1VarJ3).u; aq1Var9 != null; aq1Var9 = aq1Var9.k) {
                                            if ((aq1Var9.h & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    aq1VarJ3 = aq1Var9;
                                                } else {
                                                    if (qs1Var3 == null) {
                                                        qs1Var3 = new qs1(new aq1[16]);
                                                    }
                                                    if (aq1VarJ3 != null) {
                                                        qs1Var3.b(aq1VarJ3);
                                                        aq1VarJ3 = null;
                                                    }
                                                    qs1Var3.b(aq1Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    aq1VarJ3 = vr.j(qs1Var3);
                                }
                            }
                            aq1Var8 = aq1Var8.j;
                        }
                    }
                    tb1VarX3 = tb1VarX3.u();
                    aq1Var8 = (tb1VarX3 == null || (ax1Var3 = tb1VarX3.L) == null) ? null : ax1Var3.e;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((i71) arrayList.get(size)).F(keyEvent)) {
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? J = aq1Var.f;
                ?? qs1Var4 = 0;
                while (J != 0) {
                    if (J instanceof i71) {
                        if (((i71) J).F(keyEvent)) {
                            return true;
                        }
                    } else if ((J.h & 8192) != 0 && (J instanceof ja0)) {
                        aq1 aq1Var10 = ((ja0) J).u;
                        int i6 = 0;
                        qs1Var4 = qs1Var4;
                        J = J;
                        while (aq1Var10 != null) {
                            if ((aq1Var10.h & 8192) != 0) {
                                i6++;
                                qs1Var4 = qs1Var4;
                                if (i6 == 1) {
                                    J = aq1Var10;
                                } else {
                                    if (qs1Var4 == 0) {
                                        qs1Var4 = new qs1(new aq1[16]);
                                    }
                                    if (J != 0) {
                                        qs1Var4.b(J);
                                        J = 0;
                                    }
                                    qs1Var4.b(aq1Var10);
                                }
                            }
                            aq1Var10 = aq1Var10.k;
                            qs1Var4 = qs1Var4;
                            J = J;
                        }
                        if (i6 == 1) {
                        }
                    }
                    J = vr.j(qs1Var4);
                }
                if (((Boolean) cs0Var.a()).booleanValue()) {
                    return true;
                }
                ?? J2 = aq1Var.f;
                ?? qs1Var5 = 0;
                while (J2 != 0) {
                    if (J2 instanceof i71) {
                        if (((i71) J2).u0(keyEvent)) {
                            return true;
                        }
                    } else if ((J2.h & 8192) != 0 && (J2 instanceof ja0)) {
                        aq1 aq1Var11 = ((ja0) J2).u;
                        int i7 = 0;
                        J2 = J2;
                        qs1Var5 = qs1Var5;
                        while (aq1Var11 != null) {
                            if ((aq1Var11.h & 8192) != 0) {
                                i7++;
                                qs1Var5 = qs1Var5;
                                if (i7 == 1) {
                                    J2 = aq1Var11;
                                } else {
                                    if (qs1Var5 == 0) {
                                        qs1Var5 = new qs1(new aq1[16]);
                                    }
                                    if (J2 != 0) {
                                        qs1Var5.b(J2);
                                        J2 = 0;
                                    }
                                    qs1Var5.b(aq1Var11);
                                }
                            }
                            aq1Var11 = aq1Var11.k;
                            J2 = J2;
                            qs1Var5 = qs1Var5;
                        }
                        if (i7 == 1) {
                        }
                    }
                    J2 = vr.j(qs1Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((i71) arrayList.get(i8)).u0(keyEvent)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x011f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean e(int i, jk2 jk2Var, ns0 ns0Var) {
        boolean zN;
        rp0 rp0Var;
        ax1 ax1Var;
        rp0 rp0Var2 = this.c;
        rp0 rp0VarS = br.s(rp0Var2);
        int i2 = 4;
        h7 h7Var = this.b;
        boolean zBooleanValue = false;
        if (rp0VarS != null) {
            bb1 layoutDirection = h7Var.getLayoutDirection();
            gp0 gp0VarR1 = rp0VarS.r1();
            ip0 ip0Var = gp0VarR1.h;
            ip0 ip0Var2 = gp0VarR1.i;
            if (i == 1) {
                ip0Var = gp0VarR1.b;
            } else if (i == 2) {
                ip0Var = gp0VarR1.c;
            } else if (i == 5) {
                ip0Var = gp0VarR1.d;
            } else if (i == 6) {
                ip0Var = gp0VarR1.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        c.k();
                        return null;
                    }
                    ip0Var = ip0Var2;
                }
                if (ip0Var == ip0.b) {
                    ip0Var = null;
                }
                if (ip0Var == null) {
                    ip0Var = gp0VarR1.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    ip0Var = ip0Var2;
                } else if (iOrdinal2 != 1) {
                    c.k();
                    return null;
                }
                if (ip0Var == ip0.b) {
                    ip0Var = null;
                }
                if (ip0Var == null) {
                    ip0Var = gp0VarR1.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    c.q("invalid FocusDirection");
                    return null;
                }
                fr frVar = new fr(i);
                ep0 ep0Var = (ep0) ((h7) vr.Y(rp0VarS)).getFocusOwner();
                rp0 rp0VarF = ep0Var.f();
                if (i == 7) {
                    gp0VarR1.j.h(frVar);
                } else {
                    gp0VarR1.k.h(frVar);
                }
                ip0Var = frVar.b ? ip0.c : rp0VarF != ep0Var.f() ? ip0.d : ip0.b;
            }
            ip0 ip0Var3 = ip0.c;
            if (!s51.n(ip0Var, ip0Var3)) {
                if (s51.n(ip0Var, ip0.d)) {
                    rp0 rp0VarS2 = br.s(rp0Var2);
                    if (rp0VarS2 != null) {
                        return (Boolean) ns0Var.h(rp0VarS2);
                    }
                } else {
                    ip0 ip0Var4 = ip0.b;
                    if (!s51.n(ip0Var, ip0Var4)) {
                        if (ip0Var == ip0Var4) {
                            c.q("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (ip0Var == ip0Var3) {
                            c.q("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        qs1 qs1Var = ip0Var.a;
                        int i3 = qs1Var.h;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = qs1Var.f;
                            boolean z = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ia0 ia0Var = (kp0) objArr[i4];
                                if (!((aq1) ia0Var).f.s) {
                                    m21.c("visitChildren called on an unattached node");
                                }
                                qs1 qs1Var2 = new qs1(new aq1[16]);
                                aq1 aq1Var = ((aq1) ia0Var).f;
                                aq1 aq1Var2 = aq1Var.k;
                                if (aq1Var2 == null) {
                                    vr.h(qs1Var2, aq1Var);
                                } else {
                                    qs1Var2.b(aq1Var2);
                                }
                                while (true) {
                                    int i5 = qs1Var2.h;
                                    if (i5 != 0) {
                                        aq1 aq1VarJ = (aq1) qs1Var2.k(i5 - 1);
                                        if ((aq1VarJ.i & 1024) == 0) {
                                            vr.h(qs1Var2, aq1VarJ);
                                        } else {
                                            while (true) {
                                                if (aq1VarJ == null) {
                                                    break;
                                                }
                                                if ((aq1VarJ.h & 1024) != 0) {
                                                    qs1 qs1Var3 = null;
                                                    while (aq1VarJ != null) {
                                                        if (aq1VarJ instanceof rp0) {
                                                            if (((Boolean) ns0Var.h((rp0) aq1VarJ)).booleanValue()) {
                                                                z = true;
                                                                break;
                                                            }
                                                        } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                                            int i6 = 0;
                                                            for (aq1 aq1Var3 = ((ja0) aq1VarJ).u; aq1Var3 != null; aq1Var3 = aq1Var3.k) {
                                                                if ((aq1Var3.h & 1024) != 0) {
                                                                    i6++;
                                                                    if (i6 == 1) {
                                                                        aq1VarJ = aq1Var3;
                                                                    } else {
                                                                        if (qs1Var3 == null) {
                                                                            qs1Var3 = new qs1(new aq1[16]);
                                                                        }
                                                                        if (aq1VarJ != null) {
                                                                            qs1Var3.b(aq1VarJ);
                                                                            aq1VarJ = null;
                                                                        }
                                                                        qs1Var3.b(aq1Var3);
                                                                    }
                                                                }
                                                            }
                                                            if (i6 == 1) {
                                                            }
                                                        }
                                                        aq1VarJ = vr.j(qs1Var3);
                                                    }
                                                } else {
                                                    aq1VarJ = aq1VarJ.k;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        rp0VarS = null;
        bb1 layoutDirection2 = h7Var.getLayoutDirection();
        v1 v1Var = new v1((Object) rp0VarS, (Object) this, ns0Var, 11);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zN = lq.z(rp0Var2, v1Var);
            } else {
                if (i != 2) {
                    c.q("This function should only be used for 1-D focus search");
                    return null;
                }
                zN = lq.n(rp0Var2, v1Var);
            }
            return Boolean.valueOf(zN);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return g12.g0(i, v1Var, rp0Var2, jk2Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    c.k();
                    return null;
                }
                i2 = 3;
            }
            rp0 rp0VarS3 = br.s(rp0Var2);
            if (rp0VarS3 != null) {
                return g12.g0(i2, v1Var, rp0VarS3, jk2Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(ro0.a(i)).toString());
        }
        rp0 rp0VarS4 = br.s(rp0Var2);
        if (rp0VarS4 == null) {
            rp0Var = null;
        } else {
            if (!rp0VarS4.f.s) {
                m21.c("visitAncestors called on an unattached node");
            }
            aq1 aq1Var4 = rp0VarS4.f.j;
            tb1 tb1VarX = vr.X(rp0VarS4);
            loop5: while (tb1VarX != null) {
                if ((tb1VarX.L.f.i & 1024) != 0) {
                    while (aq1Var4 != null) {
                        if ((aq1Var4.h & 1024) != 0) {
                            aq1 aq1VarJ2 = aq1Var4;
                            qs1 qs1Var4 = null;
                            while (aq1VarJ2 != null) {
                                if (aq1VarJ2 instanceof rp0) {
                                    rp0 rp0Var3 = (rp0) aq1VarJ2;
                                    if (rp0Var3.r1().a) {
                                        rp0Var = rp0Var3;
                                        break loop5;
                                    }
                                } else if ((aq1VarJ2.h & 1024) != 0 && (aq1VarJ2 instanceof ja0)) {
                                    int i7 = 0;
                                    for (aq1 aq1Var5 = ((ja0) aq1VarJ2).u; aq1Var5 != null; aq1Var5 = aq1Var5.k) {
                                        if ((aq1Var5.h & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                aq1VarJ2 = aq1Var5;
                                            } else {
                                                if (qs1Var4 == null) {
                                                    qs1Var4 = new qs1(new aq1[16]);
                                                }
                                                if (aq1VarJ2 != null) {
                                                    qs1Var4.b(aq1VarJ2);
                                                    aq1VarJ2 = null;
                                                }
                                                qs1Var4.b(aq1Var5);
                                            }
                                        }
                                    }
                                    if (i7 != 1) {
                                        aq1VarJ2 = vr.j(qs1Var4);
                                    }
                                }
                                aq1VarJ2 = vr.j(qs1Var4);
                            }
                        }
                        aq1Var4 = aq1Var4.j;
                    }
                }
                tb1VarX = tb1VarX.u();
                aq1Var4 = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
            }
            rp0Var = null;
        }
        if (rp0Var != null && rp0Var != rp0Var2) {
            zBooleanValue = ((Boolean) v1Var.h(rp0Var)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final rp0 f() {
        rp0 rp0Var = this.h;
        if (rp0Var == null || !rp0Var.s) {
            return null;
        }
        return rp0Var;
    }

    public final boolean g(int i, boolean z) {
        rp0 rp0VarF = f();
        h7 h7Var = this.a;
        if (rp0VarF == null || !rp0VarF.t || !h7Var.v(i)) {
            qk2 qk2Var = new qk2();
            qk2Var.f = Boolean.FALSE;
            rp0 rp0VarF2 = f();
            Boolean boolE = e(i, h7Var.getEmbeddedViewFocusRect(), new cp0(i, qk2Var));
            if (!s51.n(boolE, Boolean.TRUE) || rp0VarF2 == f()) {
                if (boolE != null && qk2Var.f != null) {
                    if (!boolE.booleanValue() || !((Boolean) qk2Var.f).booleanValue()) {
                        if ((i == 1 || i == 2) && z && b(i, false, false)) {
                            Boolean boolE2 = e(i, null, new w6(i, 3));
                            if (boolE2 != null ? boolE2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean h(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean boolE = e(i, null, new w6(i, 2));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public final void i(rp0 rp0Var) {
        rp0 rp0Var2 = this.h;
        this.h = rp0Var;
        as1 as1Var = this.g;
        Object[] objArr = as1Var.a;
        int i = as1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((ap0) objArr[i2]).a(rp0Var2, rp0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        r37 = true;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r4.d) * 32, ((long) r0) * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        r0 = r4.a;
        r6 = r4.c;
        r12 = r4.b;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        if (r14 >= r13) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0102, code lost:
    
        r15 = r5;
        r16 = r6;
        r40 = 128;
        r5 = defpackage.uj.T(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r16;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0123, code lost:
    
        if (r6 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r16 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0133, code lost:
    
        if (r16 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0135, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013a, code lost:
    
        if (r16 == 254) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013d, code lost:
    
        r16 = java.lang.Long.hashCode(r12[r6]) * r28;
        r16 = r16 ^ (r16 << 16);
        r17 = r13;
        r13 = r16 >>> 7;
        r14 = r4.b(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0161, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0163, code lost:
    
        r37 = r7;
        r0[r8] = ((~(255 << r9)) & r0[r8]) | (((long) (r16 & 127)) << r9);
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0181, code lost:
    
        r13 = r17;
        r15 = r29;
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0188, code lost:
    
        r37 = r7;
        r7 = r14 >> 3;
        r26 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019a, code lost:
    
        if (((r26 >> r8) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019c, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | (((long) (r16 & 127)) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r35];
        r12[r35] = r33;
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c3, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | (((long) (r16 & 127)) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r35];
        r12[r35] = r5;
        r6 = r35 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01df, code lost:
    
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ee, code lost:
    
        r37 = r7;
        r4.e = defpackage.nr2.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fd, code lost:
    
        r37 = true;
        r40 = 128;
        r0 = defpackage.nr2.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0218, code lost:
    
        if (r12 >= r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0227, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0229, code lost:
    
        r13 = r6[r12];
        r15 = java.lang.Long.hashCode(r13) * r28;
        r15 = r15 ^ (r15 << 16);
        r16 = r0;
        r0 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r0 >> 3;
        r19 = (r0 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r0 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r0] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0267, code lost:
    
        r16 = r0;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026d, code lost:
    
        r12 = r12 + 1;
        r0 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0276, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027a, code lost:
    
        r14 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0293, code lost:
    
        if (((r6 >> r8) & 255) != r40) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0295, code lost:
    
        r21 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0297, code lost:
    
        r4.e = r0 - r21;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x033f, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0341, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        long j;
        boolean z;
        int iNumberOfTrailingZeros2;
        long jE = ur.E(keyEvent);
        int iG = ur.G(keyEvent);
        int i = -862048943;
        long j2 = 0;
        char c = '\b';
        int i2 = 0;
        ?? r21 = 0;
        boolean z2 = true;
        if (iG == 2) {
            tr1 tr1Var = this.f;
            if (tr1Var == null) {
                tr1Var = new tr1(3);
                this.f = tr1Var;
            }
            tr1 tr1Var2 = tr1Var;
            int iHashCode = Long.hashCode(jE) * (-862048943);
            int i3 = iHashCode ^ (iHashCode << 16);
            int i4 = i3 >>> 7;
            int i5 = i3 & 127;
            int i6 = tr1Var2.c;
            int i7 = i4 & i6;
            int i8 = 0;
            loop0: while (true) {
                long[] jArr = tr1Var2.a;
                int i9 = i7 >> 3;
                int i10 = (i7 & 7) << 3;
                long j3 = (jArr[i9] >>> i10) | ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63));
                int i11 = i;
                long j4 = i5;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == j2) {
                        break;
                    }
                    iNumberOfTrailingZeros2 = (i7 + (Long.numberOfTrailingZeros(j6) >> 3)) & i6;
                    long j7 = j2;
                    if (tr1Var2.b[iNumberOfTrailingZeros2] == jE) {
                        z = true;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    j2 = j7;
                }
                i8 += 8;
                i7 = (i7 + i8) & i6;
                i = i11;
                j2 = j;
            }
            tr1Var2.b[iNumberOfTrailingZeros2] = jE;
            return z;
        }
        if (iG != 1) {
            return true;
        }
        tr1 tr1Var3 = this.f;
        if (tr1Var3 == null || !tr1Var3.a(jE)) {
            return false;
        }
        tr1 tr1Var4 = this.f;
        if (tr1Var4 != null) {
            int iHashCode2 = Long.hashCode(jE) * (-862048943);
            int i12 = iHashCode2 ^ (iHashCode2 << 16);
            int i13 = i12 & 127;
            int i14 = tr1Var4.c;
            int i15 = i12 >>> 7;
            loop5: while (true) {
                int i16 = i15 & i14;
                long[] jArr2 = tr1Var4.a;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                long j8 = ((jArr2[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr2[i17] >>> i18);
                long j9 = (((long) i13) * 72340172838076673L) ^ j8;
                long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i16) & i14;
                    if (tr1Var4.b[iNumberOfTrailingZeros] == jE) {
                        break loop5;
                    }
                    j10 &= j10 - 1;
                }
                i2 += 8;
                i15 = i16 + i2;
            }
            if (iNumberOfTrailingZeros >= 0) {
                tr1Var4.d--;
                long[] jArr3 = tr1Var4.a;
                int i19 = tr1Var4.c;
                int i20 = iNumberOfTrailingZeros >> 3;
                int i21 = (iNumberOfTrailingZeros & 7) << 3;
                long j11 = (jArr3[i20] & (~(255 << i21))) | (254 << i21);
                jArr3[i20] = j11;
                jArr3[(((iNumberOfTrailingZeros - 7) & i19) + (i19 & 7)) >> 3] = j11;
                return true;
            }
        }
        return true;
    }
}
