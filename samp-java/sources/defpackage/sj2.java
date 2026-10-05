package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sj2 implements vj2 {
    public final ArrayList a;
    public final boolean b;
    public final boolean c;

    public sj2(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj2)) {
            return false;
        }
        sj2 sj2Var = (sj2) obj;
        return this.a.equals(sj2Var.a) && this.b == sj2Var.b && this.c == sj2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + by1.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Content(servers=" + this.a + ", isRefreshing=" + this.b + ", refreshFailed=" + this.c + ")";
    }
}
