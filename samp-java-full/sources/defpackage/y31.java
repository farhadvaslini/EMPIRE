package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class y31 {
    public final k82 a;
    public final File b;
    public final boolean c;
    public final String d;

    public y31(k82 k82Var, File file, boolean z, String str) {
        file.getClass();
        this.a = k82Var;
        this.b = file;
        this.c = z;
        this.d = str;
    }

    public static y31 a(y31 y31Var, boolean z) {
        k82 k82Var = y31Var.a;
        File file = y31Var.b;
        String str = y31Var.d;
        file.getClass();
        return new y31(k82Var, file, z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y31)) {
            return false;
        }
        y31 y31Var = (y31) obj;
        return this.a.equals(y31Var.a) && s51.n(this.b, y31Var.b) && this.c == y31Var.c && s51.n(this.d, y31Var.d);
    }

    public final int hashCode() {
        int iB = by1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "InstalledPlugin(manifest=" + this.a + ", installDir=" + this.b + ", enabled=" + this.c + ", packageSha256=" + this.d + ")";
    }
}
