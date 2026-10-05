package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wu2 {
    public final qu2 a;
    public final pr1 b;

    public wu2(vu2 vu2Var, g41 g41Var) {
        this.a = vu2Var.d;
        List listI = vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0);
        this.b = new pr1(listI.size());
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            vu2 vu2Var2 = (vu2) listI.get(i);
            if (g41Var.a(vu2Var2.f)) {
                this.b.a(vu2Var2.f);
            }
        }
    }
}
