package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ar1 implements cn1 {
    public final zq1 a;

    public ar1(zq1 zq1Var) {
        this.a = zq1Var;
    }

    @Override // defpackage.cn1
    public final int a(k51 k51Var, List list, int i) {
        return this.a.a(k51Var, uq.q(k51Var), i);
    }

    @Override // defpackage.cn1
    public final int b(k51 k51Var, List list, int i) {
        return this.a.b(k51Var, uq.q(k51Var), i);
    }

    @Override // defpackage.cn1
    public final dn1 c(en1 en1Var, List list, long j) {
        return this.a.c(en1Var, uq.q(en1Var), j);
    }

    @Override // defpackage.cn1
    public final int d(k51 k51Var, List list, int i) {
        return this.a.d(k51Var, uq.q(k51Var), i);
    }

    @Override // defpackage.cn1
    public final int e(k51 k51Var, List list, int i) {
        return this.a.e(k51Var, uq.q(k51Var), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar1) && s51.n(this.a, ((ar1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
