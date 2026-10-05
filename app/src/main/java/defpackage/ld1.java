package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ld1 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ nd1 c;

    public ld1(nd1 nd1Var, int i) {
        this.c = nd1Var;
        this.a = i;
    }

    public final void a(int i) {
        nd1 nd1Var = this.c;
        yj0 yj0Var = nd1Var.c;
        if (yj0Var == null) {
            return;
        }
        this.b.add(new rc2(yj0Var, i, nd1Var.b, null));
    }
}
