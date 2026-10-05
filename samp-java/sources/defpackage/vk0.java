package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vk0 {
    public final int a;
    public final int b;
    public final String c;

    public vk0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk0)) {
            return false;
        }
        vk0 vk0Var = (vk0) obj;
        return this.a == vk0Var.a && this.b == vk0Var.b && this.c.equals(vk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nc2.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return nc2.j(nc2.l("ExtractProgress(extractedEntries=", this.a, ", totalEntries=", this.b, ", currentEntry="), this.c, ")");
    }
}
