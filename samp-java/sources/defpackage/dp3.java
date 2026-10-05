package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dp3 implements zo3 {
    public final bp3 f;
    public final gl2 g;
    public final long h;
    public final long i = 0;

    public dp3(bp3 bp3Var, gl2 gl2Var) {
        this.f = bp3Var;
        this.g = gl2Var;
        this.h = ((long) (bp3Var.o() + bp3Var.k())) * 1000000;
    }

    @Override // defpackage.zo3
    public final boolean a() {
        return true;
    }

    @Override // defpackage.zo3
    public final long b(ue ueVar, ue ueVar2, ue ueVar3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j) {
        long j2 = this.i;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.h;
        long j5 = j3 / j4;
        return (this.g == gl2.f || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public final ue d(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        long j2 = this.i;
        long j3 = j + j2;
        long j4 = this.h;
        return j3 > j4 ? this.f.l(j4 - j2, ueVar, ueVar3, ueVar2) : ueVar2;
    }

    @Override // defpackage.zo3
    public final ue l(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        return this.f.l(c(j), ueVar, ueVar2, d(j, ueVar, ueVar3, ueVar2));
    }

    @Override // defpackage.zo3
    public final ue p(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        return this.f.p(c(j), ueVar, ueVar2, d(j, ueVar, ueVar3, ueVar2));
    }
}
