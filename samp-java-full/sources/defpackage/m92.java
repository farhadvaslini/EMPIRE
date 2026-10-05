package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m92 {
    public final Set a;
    public final LinkedHashSet b;
    public final Set c;

    public m92(Set set, LinkedHashSet linkedHashSet, Set set2) {
        this.a = set;
        this.b = linkedHashSet;
        this.c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m92)) {
            return false;
        }
        m92 m92Var = (m92) obj;
        return this.a.equals(m92Var.a) && this.b.equals(m92Var.b) && this.c.equals(m92Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PluginPermissionGrant(requested=" + this.a + ", approved=" + this.b + ", pending=" + this.c + ")";
    }
}
