package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class zf2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ rs0 g;
    public final /* synthetic */ os1 h;
    public final /* synthetic */ os1 i;
    public final /* synthetic */ os1 j;

    public /* synthetic */ zf2(rs0 rs0Var, os1 os1Var, os1 os1Var2, os1 os1Var3, int i) {
        this.f = i;
        this.g = rs0Var;
        this.h = os1Var;
        this.i = os1Var2;
        this.j = os1Var3;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        zj zjVar = c20.a;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    final rs0 rs0Var = this.g;
                    boolean zF = nv0Var.f(rs0Var);
                    Object objO = nv0Var.O();
                    if (zF || objO == zjVar) {
                        final int i2 = 0;
                        final os1 os1Var = this.h;
                        final os1 os1Var2 = this.i;
                        final os1 os1Var3 = this.j;
                        objO = new cs0() { // from class: xf2
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i3 = i2;
                                dm3 dm3Var2 = dm3.a;
                                os1 os1Var4 = os1Var3;
                                os1 os1Var5 = os1Var2;
                                os1 os1Var6 = os1Var;
                                rs0 rs0Var2 = rs0Var;
                                switch (i3) {
                                    case 0:
                                        if (y93.q0((String) os1Var6.getValue()) || y93.q0((String) os1Var5.getValue())) {
                                            os1Var4.setValue(Boolean.TRUE);
                                        } else {
                                            rs0Var2.f(y93.G0((String) os1Var6.getValue()).toString(), y93.G0((String) os1Var5.getValue()).toString());
                                        }
                                        break;
                                    default:
                                        if (y93.q0((String) os1Var6.getValue()) || y93.q0((String) os1Var5.getValue())) {
                                            os1Var4.setValue(Boolean.TRUE);
                                        } else {
                                            rs0Var2.f(y93.G0((String) os1Var6.getValue()).toString(), y93.G0((String) os1Var5.getValue()).toString());
                                        }
                                        break;
                                }
                                return dm3Var2;
                            }
                        };
                        nv0Var.j0(objO);
                    }
                    gq.m((cs0) objO, null, false, null, null, null, rn.A, nv0Var, 805306368, 510);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    final rs0 rs0Var2 = this.g;
                    boolean zF2 = nv0Var2.f(rs0Var2);
                    Object objO2 = nv0Var2.O();
                    if (zF2 || objO2 == zjVar) {
                        final int i3 = 1;
                        final os1 os1Var4 = this.h;
                        final os1 os1Var5 = this.i;
                        final os1 os1Var6 = this.j;
                        objO2 = new cs0() { // from class: xf2
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i32 = i3;
                                dm3 dm3Var2 = dm3.a;
                                os1 os1Var42 = os1Var6;
                                os1 os1Var52 = os1Var5;
                                os1 os1Var62 = os1Var4;
                                rs0 rs0Var22 = rs0Var2;
                                switch (i32) {
                                    case 0:
                                        if (y93.q0((String) os1Var62.getValue()) || y93.q0((String) os1Var52.getValue())) {
                                            os1Var42.setValue(Boolean.TRUE);
                                        } else {
                                            rs0Var22.f(y93.G0((String) os1Var62.getValue()).toString(), y93.G0((String) os1Var52.getValue()).toString());
                                        }
                                        break;
                                    default:
                                        if (y93.q0((String) os1Var62.getValue()) || y93.q0((String) os1Var52.getValue())) {
                                            os1Var42.setValue(Boolean.TRUE);
                                        } else {
                                            rs0Var22.f(y93.G0((String) os1Var62.getValue()).toString(), y93.G0((String) os1Var52.getValue()).toString());
                                        }
                                        break;
                                }
                                return dm3Var2;
                            }
                        };
                        nv0Var2.j0(objO2);
                    }
                    gq.m((cs0) objO2, null, false, null, null, null, f80.X, nv0Var2, 805306368, 510);
                }
                break;
        }
        return dm3Var;
    }
}
