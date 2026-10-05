package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kn2 {
    public ll2 a;
    public de2 b;
    public String d;
    public mx0 e;
    public q73 h;
    public ln2 i;
    public ln2 j;
    public ln2 k;
    public long l;
    public long m;
    public yj0 n;
    public int c = -1;
    public nn2 g = nn2.f;
    public uj3 o = uj3.e;
    public tx0 f = new tx0(0);

    public static void b(ln2 ln2Var, String str) {
        if (ln2Var != null) {
            if (ln2Var.n != null) {
                c.g(str.concat(".networkResponse != null"));
            } else if (ln2Var.o != null) {
                c.g(str.concat(".cacheResponse != null"));
            } else {
                if (ln2Var.p == null) {
                    return;
                }
                c.g(str.concat(".priorResponse != null"));
            }
        }
    }

    public final ln2 a() {
        int i = this.c;
        if (i < 0) {
            qn1.d(this.c, "code < 0: ");
            return null;
        }
        ll2 ll2Var = this.a;
        if (ll2Var == null) {
            c.q("request == null");
            return null;
        }
        de2 de2Var = this.b;
        if (de2Var == null) {
            c.q("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new ln2(ll2Var, de2Var, str, i, this.e, this.f.b(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
        c.q("message == null");
        return null;
    }
}
