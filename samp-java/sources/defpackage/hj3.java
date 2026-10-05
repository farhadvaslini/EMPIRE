package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hj3 implements ub2 {
    public final int f;

    public hj3(int i) {
        this.f = i;
    }

    @Override // defpackage.ub2
    public final long a(m41 m41Var, long j, bb1 bb1Var, long j2) {
        int i = (int) (j2 >> 32);
        int iD = ((m41Var.d() - i) / 2) + m41Var.a;
        if (iD < 0) {
            iD = m41Var.a;
        } else if (iD + i > ((int) (j >> 32))) {
            iD = m41Var.c - i;
        }
        int i2 = m41Var.b - ((int) (j2 & 4294967295L));
        int i3 = this.f;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = m41Var.d + i3;
        }
        return (((long) iD) << 32) | (((long) i4) & 4294967295L);
    }
}
