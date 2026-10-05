package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class o5 implements no1 {
    public final um a;
    public final um b;
    public final int c;

    public o5(um umVar, um umVar2, int i) {
        this.a = umVar;
        this.b = umVar2;
        this.c = i;
    }

    @Override // defpackage.no1
    public final int a(m41 m41Var, long j, int i) {
        int iA = this.b.a(0, m41Var.b());
        return m41Var.b + iA + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return this.a.equals(o5Var.a) && this.b.equals(o5Var.b) && this.c == o5Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + nc2.a(Float.hashCode(this.a.a) * 31, this.b.a, 31);
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=" + this.c + ')';
    }
}
