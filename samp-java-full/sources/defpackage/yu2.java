package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yu2 {
    public final tb1 a;
    public final qi0 b;
    public final g41 c;
    public final as1 d = new as1(2);

    public yu2(tb1 tb1Var, qi0 qi0Var, or1 or1Var) {
        this.a = tb1Var;
        this.b = qi0Var;
        this.c = or1Var;
    }

    public final vu2 a() {
        return new vu2(this.b, false, this.a, new qu2());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(tb1 tb1Var, qu2 qu2Var) {
        d8 d8Var;
        d8 d8Var2;
        mi3 mi3Var;
        mi3 mi3Var2;
        z8 z8Var;
        z8 z8Var2;
        as1 as1Var = this.d;
        Object[] objArr = as1Var.a;
        int i = as1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            l6 l6Var = (l6) objArr[i2];
            l6Var.getClass();
            qu2 qu2VarW = tb1Var.w();
            int i3 = tb1Var.g;
            a31 a31Var = l6Var.f;
            h7 h7Var = l6Var.h;
            if (qu2Var != null) {
                Object objG = qu2Var.f.g(zu2.s);
                if (objG == null) {
                    objG = null;
                }
                d8Var = (d8) objG;
            } else {
                d8Var = null;
            }
            if (qu2VarW != null) {
                Object objG2 = qu2VarW.f.g(zu2.s);
                if (objG2 == null) {
                    objG2 = null;
                }
                d8Var2 = (d8) objG2;
            } else {
                d8Var2 = null;
            }
            d8 d8Var3 = f5.I;
            if (!s51.n(d8Var2, d8Var3)) {
                if (s51.n(d8Var, d8Var3) && !s51.n(d8Var2, d8Var3)) {
                    a31Var.z(h7Var, i3, true);
                }
                if (qu2Var != null) {
                    Object objG3 = qu2Var.f.g(zu2.F);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    af afVar = (af) objG3;
                    String str = afVar != null ? afVar.g : null;
                    if (qu2VarW != null) {
                        Object objG4 = qu2VarW.f.g(zu2.F);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        af afVar2 = (af) objG4;
                        String str2 = afVar2 != null ? afVar2.g : null;
                        if (str != str2) {
                            if (str == null) {
                                a31Var.z(h7Var, i3, true);
                            } else if (str2 == null) {
                                a31Var.z(h7Var, i3, false);
                            } else if (s51.n(d8Var2, f5.J)) {
                                a31Var.w().notifyValueChanged(h7Var, i3, AutofillValue.forText(n92.G(str2)));
                            }
                        }
                        if (qu2Var != null) {
                            Object objG5 = qu2Var.f.g(zu2.L);
                            if (objG5 == null) {
                                objG5 = null;
                            }
                            mi3Var = (mi3) objG5;
                        } else {
                            mi3Var = null;
                        }
                        if (qu2VarW != null) {
                            Object objG6 = qu2VarW.f.g(zu2.L);
                            if (objG6 == null) {
                                objG6 = null;
                            }
                            mi3Var2 = (mi3) objG6;
                        } else {
                            mi3Var2 = null;
                        }
                        if (mi3Var != mi3Var2) {
                            if (mi3Var == null) {
                                a31Var.z(h7Var, i3, true);
                            } else if (mi3Var2 == null) {
                                a31Var.z(h7Var, i3, false);
                            } else if (s51.n(d8Var2, f5.K)) {
                                int iOrdinal = mi3Var2.ordinal();
                                Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                                if (bool != null) {
                                    a31Var.w().notifyValueChanged(h7Var, i3, AutofillValue.forToggle(bool.booleanValue()));
                                }
                            }
                        }
                        if (qu2Var != null) {
                            Object objG7 = qu2Var.f.g(zu2.t);
                            if (objG7 == null) {
                                objG7 = null;
                            }
                            z8Var = (z8) objG7;
                        } else {
                            z8Var = null;
                        }
                        if (qu2VarW != null) {
                            Object objG8 = qu2VarW.f.g(zu2.t);
                            if (objG8 == null) {
                                objG8 = null;
                            }
                            z8Var2 = (z8) objG8;
                        } else {
                            z8Var2 = null;
                        }
                        if (!s51.n(z8Var, z8Var2)) {
                            if (z8Var == null) {
                                a31Var.z(h7Var, i3, true);
                            } else if (z8Var2 == null) {
                                a31Var.z(h7Var, i3, false);
                            } else {
                                a31Var.w().notifyValueChanged(h7Var, i3, z8Var2.a);
                            }
                        }
                    }
                }
            } else if (!s51.n(d8Var, d8Var3)) {
                a31Var.z(h7Var, i3, false);
            }
            boolean z = qu2Var != null && qu2Var.f.b(zu2.r);
            boolean z2 = qu2VarW != null && qu2VarW.f.b(zu2.r);
            if (z != z2) {
                pr1 pr1Var = l6Var.m;
                if (z2) {
                    pr1Var.a(i3);
                } else {
                    pr1Var.f(i3);
                }
            }
        }
    }
}
