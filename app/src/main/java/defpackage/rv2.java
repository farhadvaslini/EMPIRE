package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rv2 implements Iterable, t61 {
    public final /* synthetic */ sa0 f;

    public rv2(sa0 sa0Var) {
        this.f = sa0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ra0(this.f);
    }
}
