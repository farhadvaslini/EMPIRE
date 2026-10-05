package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bq2 {
    public final aq2 a;
    public final Map b;
    public final Long c;

    public bq2(aq2 aq2Var, Map map, Long l) {
        aq2Var.getClass();
        map.getClass();
        this.a = aq2Var;
        this.b = map;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq2)) {
            return false;
        }
        bq2 bq2Var = (bq2) obj;
        return s51.n(this.a, bq2Var.a) && s51.n(this.b, bq2Var.b) && s51.n(this.c, bq2Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Long l = this.c;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "SampServerStatus(info=" + this.a + ", rules=" + this.b + ", pingMillis=" + this.c + ")";
    }
}
