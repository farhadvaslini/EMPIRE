package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ip0 {
    public static final ip0 b = new ip0();
    public static final ip0 c = new ip0();
    public static final ip0 d = new ip0();
    public final qs1 a = new qs1(new kp0[16]);

    /* JADX WARN: Code restructure failed: missing block: B:69:0x004b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(ip0 ip0Var) {
        ip0Var.getClass();
        if (ip0Var == b) {
            c.q("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (ip0Var == c) {
            c.q("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        qs1 qs1Var = ip0Var.a;
        int i = qs1Var.h;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = qs1Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ia0 ia0Var = (kp0) objArr[i2];
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
                int i3 = qs1Var2.h;
                if (i3 != 0) {
                    aq1 aq1VarJ = (aq1) qs1Var2.k(i3 - 1);
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
                                        if (((rp0) aq1VarJ).x1(7)) {
                                            break;
                                        }
                                    } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                        int i4 = 0;
                                        for (aq1 aq1Var3 = ((ja0) aq1VarJ).u; aq1Var3 != null; aq1Var3 = aq1Var3.k) {
                                            if ((aq1Var3.h & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
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
                                        if (i4 == 1) {
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
    }
}
