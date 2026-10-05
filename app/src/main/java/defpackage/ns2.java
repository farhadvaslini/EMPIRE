package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ns2 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ps2 g;

    public /* synthetic */ ns2(ps2 ps2Var, int i) {
        this.f = i;
        this.g = ps2Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        ps2 ps2Var = this.g;
        switch (i) {
            case 0:
                return Boolean.valueOf(ps2Var.s);
            default:
                rp0 rp0Var = ps2Var.Y;
                if (!rp0Var.f.s) {
                    return null;
                }
                mp0 mp0VarU1 = rp0Var.u1();
                int iOrdinal = mp0VarU1.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    c.k();
                    return null;
                }
                if (mp0VarU1.a()) {
                    return rp0Var.s1(null);
                }
                rp0 rp0VarF = ((ep0) ((h7) vr.Y(rp0Var)).getFocusOwner()).f();
                if (rp0VarF != null) {
                    return rp0VarF.s1(vr.W(rp0Var));
                }
                return null;
        }
    }
}
