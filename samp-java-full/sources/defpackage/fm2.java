package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fm2 implements zq {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr b;

    public /* synthetic */ fm2(jr jrVar, int i) {
        this.a = i;
        this.b = jrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc A[Catch: all -> 0x00e7, TryCatch #5 {all -> 0x00e7, blocks: (B:43:0x0090, B:45:0x0094, B:47:0x00a5, B:50:0x00b4, B:52:0x00c8, B:54:0x00cc, B:57:0x00d8, B:55:0x00d1, B:56:0x00d5, B:64:0x00e9, B:65:0x0100), top: B:82:0x0090, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1 A[Catch: all -> 0x00e7, TryCatch #5 {all -> 0x00e7, blocks: (B:43:0x0090, B:45:0x0094, B:47:0x00a5, B:50:0x00b4, B:52:0x00c8, B:54:0x00cc, B:57:0x00d8, B:55:0x00d1, B:56:0x00d5, B:64:0x00e9, B:65:0x0100), top: B:82:0x0090, outer: #3 }] */
    @Override // defpackage.zq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ij2 ij2Var, ln2 ln2Var) {
        Object qn2Var;
        Object qn2Var2;
        Object qn2Var3;
        int i = this.a;
        strM = null;
        String strM = null;
        jr jrVar = this.b;
        try {
            try {
                try {
                } catch (Throwable th) {
                    qn2Var3 = new qn2(th);
                }
            } catch (Throwable th2) {
                qn2Var2 = new qn2(th2);
            }
        } catch (Throwable th3) {
            qn2Var = new qn2(th3);
        }
        switch (i) {
            case 0:
                try {
                    if (!ln2Var.u) {
                        throw new IllegalStateException(("HTTP " + ln2Var.i).toString());
                    }
                    gm2 gm2Var = gm2.a;
                    nn2 nn2Var = ln2Var.l;
                    if (nn2Var.b() <= 262144) {
                        rp rpVarF = nn2Var.f();
                        hp hpVar = new hp();
                        long j = 0;
                        while (j <= 262144) {
                            long jD = rpVarF.d(Math.min(8192L, 262145 - j), hpVar);
                            if (jD != -1) {
                                j += jD;
                            } else if (j > 262144) {
                                strM = hpVar.m();
                            } else {
                                c.q("Response is too large");
                            }
                        }
                        if (j > 262144) {
                        }
                    } else {
                        c.q("Response is too large");
                    }
                    qn2Var2 = new cm2(gm2.b(strM), strM);
                    ln2Var.close();
                    if (jrVar.r() instanceof qx1) {
                        jrVar.t(new rn2(qn2Var2));
                        return;
                    }
                    return;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 1:
                try {
                    if (!ln2Var.u) {
                        throw new IllegalStateException(("HTTP " + ln2Var.i).toString());
                    }
                    String strH = ln2Var.l.h();
                    hn3 hn3Var = hn3.a;
                    qn2Var = new bn3(strH, hn3.d(ln2.b(ln2Var, "Link")));
                    ln2Var.close();
                    if (jrVar.r() instanceof qx1) {
                        jrVar.t(new rn2(qn2Var));
                        return;
                    }
                    return;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            default:
                try {
                    qn2Var3 = ln2Var.l.h();
                    ln2Var.close();
                    String str = (String) (qn2Var3 instanceof qn2 ? null : qn2Var3);
                    if (jrVar.r() instanceof qx1) {
                        jrVar.t(str);
                        return;
                    }
                    return;
                } finally {
                }
        }
    }

    @Override // defpackage.zq
    public final void b(ij2 ij2Var, IOException iOException) {
        int i = this.a;
        jr jrVar = this.b;
        switch (i) {
            case 0:
                if (jrVar.r() instanceof qx1) {
                    jrVar.t(new rn2(new qn2(iOException)));
                }
                break;
            case 1:
                if (jrVar.r() instanceof qx1) {
                    jrVar.t(new rn2(new qn2(iOException)));
                }
                break;
            default:
                if (jrVar.r() instanceof qx1) {
                    jrVar.t(null);
                }
                break;
        }
    }
}
