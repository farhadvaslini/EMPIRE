package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fs {
    public static final fs c = new fs(qx.R0(new ArrayList()), null);
    public final Set a;
    public final pq b;

    public fs(Set set, pq pqVar) {
        this.a = set;
        this.b = pqVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fs)) {
            return false;
        }
        fs fsVar = (fs) obj;
        return fsVar.a.equals(this.a) && s51.n(fsVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        pq pqVar = this.b;
        return iHashCode + (pqVar != null ? pqVar.hashCode() : 0);
    }
}
