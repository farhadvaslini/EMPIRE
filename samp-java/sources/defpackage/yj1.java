package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yj1 {
    public final int a;
    public final String b;
    public final String c;
    public final File d;

    public yj1(int i, String str, String str2, File file) {
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj1)) {
            return false;
        }
        yj1 yj1Var = (yj1) obj;
        return this.a == yj1Var.a && this.b.equals(yj1Var.b) && s51.n(this.c, yj1Var.c) && this.d.equals(yj1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + by1.a(by1.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "LogEntry(nativeInstanceId=" + this.a + ", label=" + this.b + ", subtitle=" + this.c + ", file=" + this.d + ")";
    }
}
