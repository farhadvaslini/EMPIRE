package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dn3 {
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final boolean d;

    public dn3(String str, ArrayList arrayList, boolean z, boolean z2) {
        this.a = str;
        this.b = arrayList;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn3)) {
            return false;
        }
        dn3 dn3Var = (dn3) obj;
        return this.a.equals(dn3Var.a) && this.b.equals(dn3Var.b) && this.c == dn3Var.c && this.d == dn3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + by1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "ReleaseInfo(tagName=" + this.a + ", assets=" + this.b + ", isDraft=" + this.c + ", isPreRelease=" + this.d + ")";
    }
}
