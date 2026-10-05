package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zc1 {
    public final dq2 a;
    public final yb b;
    public final is1 c;

    public zc1(dq2 dq2Var, yb ybVar) {
        this.a = dq2Var;
        this.b = ybVar;
        long[] jArr = nr2.a;
        this.c = new is1();
    }

    public final rs0 a(int i, Object obj, Object obj2) {
        is1 is1Var = this.c;
        yc1 yc1Var = (yc1) is1Var.g(obj);
        int i2 = 23;
        if (yc1Var != null && yc1Var.c == i && s51.n(yc1Var.b, obj2)) {
            d00 d00Var = yc1Var.d;
            if (d00Var != null) {
                return d00Var;
            }
            d00 d00Var2 = new d00(818252804, new y7(i2, yc1Var.e, yc1Var), true);
            yc1Var.d = d00Var2;
            return d00Var2;
        }
        yc1 yc1Var2 = new yc1(this, i, obj, obj2);
        is1Var.m(obj, yc1Var2);
        d00 d00Var3 = yc1Var2.d;
        if (d00Var3 != null) {
            return d00Var3;
        }
        d00 d00Var4 = new d00(818252804, new y7(i2, this, yc1Var2), true);
        yc1Var2.d = d00Var4;
        return d00Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        yc1 yc1Var = (yc1) this.c.g(obj);
        if (yc1Var != null) {
            return yc1Var.b;
        }
        ad1 ad1Var = (ad1) this.b.a();
        int iE = ad1Var.e(obj);
        if (iE != -1) {
            return ad1Var.c(iE);
        }
        return null;
    }
}
