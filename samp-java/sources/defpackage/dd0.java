package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dd0 implements hd0 {
    public final File a;
    public final bm2 b;

    public dd0(File file, bm2 bm2Var) {
        file.getClass();
        bm2Var.getClass();
        this.a = file;
        this.b = bm2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd0)) {
            return false;
        }
        dd0 dd0Var = (dd0) obj;
        return s51.n(this.a, dd0Var.a) && s51.n(this.b, dd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Done(file=" + this.a + ", source=" + this.b + ")";
    }
}
