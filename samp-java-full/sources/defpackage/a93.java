package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class a93 implements zo3 {
    public final zo3 f;
    public final long g;

    public a93(zo3 zo3Var, long j) {
        this.f = zo3Var;
        this.g = j;
    }

    @Override // defpackage.zo3
    public final boolean a() {
        return this.f.a();
    }

    @Override // defpackage.zo3
    public final long b(ue ueVar, ue ueVar2, ue ueVar3) {
        return this.f.b(ueVar, ueVar2, ueVar3) + this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a93)) {
            return false;
        }
        a93 a93Var = (a93) obj;
        return a93Var.g == this.g && s51.n(a93Var.f, this.f);
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + (this.f.hashCode() * 31);
    }

    @Override // defpackage.zo3
    public final ue l(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        long j2 = this.g;
        return j < j2 ? ueVar3 : this.f.l(j - j2, ueVar, ueVar2, ueVar3);
    }

    @Override // defpackage.zo3
    public final ue p(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        long j2 = this.g;
        return j < j2 ? ueVar : this.f.p(j - j2, ueVar, ueVar2, ueVar3);
    }
}
