package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class h51 {
    public final int a;
    public final int b;
    public final uc1 c;

    public h51(int i, int i2, uc1 uc1Var) {
        this.a = i;
        this.b = i2;
        this.c = uc1Var;
        if (i < 0) {
            p21.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        p21.a("size should be > 0");
    }
}
