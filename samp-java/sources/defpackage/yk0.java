package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yk0 implements al0 {
    public final String a;
    public final File b;

    public yk0(String str) {
        this.a = str;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk0)) {
            return false;
        }
        yk0 yk0Var = (yk0) obj;
        return s51.n(this.a, yk0Var.a) && s51.n(this.b, yk0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        File file = this.b;
        return iHashCode + (file == null ? 0 : file.hashCode());
    }

    public final String toString() {
        return "Failed(message=" + this.a + ", zipFile=" + this.b + ")";
    }

    public yk0(String str, File file) {
        this.a = str;
        this.b = file;
    }
}
