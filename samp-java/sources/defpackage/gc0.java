package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gc0 extends aq1 implements of0 {
    public wc1 t;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gc0) && s51.n(this.t, ((gc0) obj).t);
    }

    @Override // defpackage.aq1
    public final void h1() {
        this.t.getClass();
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    @Override // defpackage.aq1
    public final void i1() {
        wc1 wc1Var = this.t;
        wc1Var.c();
        wc1Var.b = null;
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        ArrayList arrayList = (ArrayList) this.t.h;
        if (arrayList.size() <= 0) {
            vb1Var.c();
        } else {
            nc2.u(arrayList.get(0));
            throw null;
        }
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.t + ")";
    }
}
