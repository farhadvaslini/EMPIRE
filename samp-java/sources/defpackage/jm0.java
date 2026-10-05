package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jm0 implements nv2 {
    public final nv2 a;
    public final boolean b;
    public final ns0 c;

    public jm0(nv2 nv2Var, boolean z, ns0 ns0Var) {
        this.a = nv2Var;
        this.b = z;
        this.c = ns0Var;
    }

    @Override // defpackage.nv2
    public final Iterator iterator() {
        return new zl0(this);
    }
}
