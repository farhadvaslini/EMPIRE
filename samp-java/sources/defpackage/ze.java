package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ze {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public ze(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        n21.a("Reversed range is not supported");
    }

    public static ze a(ze zeVar, we weVar, int i, int i2) {
        Object obj = weVar;
        if ((i2 & 1) != 0) {
            obj = zeVar.a;
        }
        int i3 = zeVar.b;
        if ((i2 & 4) != 0) {
            i = zeVar.c;
        }
        String str = zeVar.d;
        zeVar.getClass();
        return new ze(obj, i3, i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze)) {
            return false;
        }
        ze zeVar = (ze) obj;
        return s51.n(this.a, zeVar.a) && this.b == zeVar.b && this.c == zeVar.c && s51.n(this.d, zeVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + nc2.b(this.c, nc2.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public ze(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
