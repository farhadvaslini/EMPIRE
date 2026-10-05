package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sc3 implements nv2 {
    public final /* synthetic */ int a;
    public final nv2 b;
    public final ns0 c;

    public /* synthetic */ sc3(nv2 nv2Var, ns0 ns0Var, int i) {
        this.a = i;
        this.b = nv2Var;
        this.c = ns0Var;
    }

    @Override // defpackage.nv2
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new zl0(this);
            default:
                return new yj3(this);
        }
    }
}
