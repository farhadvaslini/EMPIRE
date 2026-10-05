package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class i21 implements zq3 {
    public final xq3[] a;

    public i21(xq3... xq3VarArr) {
        this.a = xq3VarArr;
    }

    @Override // defpackage.zq3
    public final vq3 b(Class cls, lr1 lr1Var) {
        xq3 xq3Var;
        ns0 ns0Var;
        lu luVarA = rk2.a(cls);
        xq3[] xq3VarArr = this.a;
        xq3[] xq3VarArr2 = (xq3[]) Arrays.copyOf(xq3VarArr, xq3VarArr.length);
        int length = xq3VarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                xq3Var = null;
                break;
            }
            xq3Var = xq3VarArr2[i];
            if (xq3Var.a.equals(luVarA)) {
                break;
            }
            i++;
        }
        vq3 vq3Var = (xq3Var == null || (ns0Var = xq3Var.b) == null) ? null : (vq3) ns0Var.h(lr1Var);
        if (vq3Var != null) {
            return vq3Var;
        }
        c.g(by1.g("No initializer set for given class ", luVarA.b()));
        return null;
    }
}
