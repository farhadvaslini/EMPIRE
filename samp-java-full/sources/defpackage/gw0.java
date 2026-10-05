package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gw0 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ns0 g;

    public /* synthetic */ gw0(ns0 ns0Var, int i) {
        this.f = i;
        this.g = ns0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        long j;
        switch (this.f) {
            case 0:
                y63 y63Var = (y63) obj;
                synchronized (a73.c) {
                    j = a73.e;
                    a73.e = 1 + j;
                }
                return new bj2(j, y63Var, this.g);
            default:
                return this.g.h(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
