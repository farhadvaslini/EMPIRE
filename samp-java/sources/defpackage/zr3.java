package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zr3 implements no1 {
    public final um a;
    public final int b;

    public zr3(um umVar, int i) {
        this.a = umVar;
        this.b = i;
    }

    @Override // defpackage.no1
    public final int a(m41 m41Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        return i >= i2 - (i3 * 2) ? Math.round(((i2 - i) / 2.0f) * 1.0f) : y02.h(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr3)) {
            return false;
        }
        zr3 zr3Var = (zr3) obj;
        return this.a.equals(zr3Var.a) && this.b == zr3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Vertical(alignment=" + this.a + ", margin=" + this.b + ')';
    }
}
