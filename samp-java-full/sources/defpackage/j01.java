package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class j01 implements wi, iy1, bp3 {
    public final int f;
    public int g;
    public final Object h;

    public j01(int i, int i2, ng0 ng0Var) {
        this.f = i;
        this.g = i2;
        this.h = new pl(new bn0(i, i2, ng0Var));
    }

    @Override // defpackage.wi
    public void c(int i, Object obj) {
        ((wi) this.h).c(i + (this.g == 0 ? this.f : 0), obj);
    }

    @Override // defpackage.wi
    public void d(Object obj) {
        this.g++;
        ((wi) this.h).d(obj);
    }

    @Override // defpackage.wi
    public void e() {
        ((wi) this.h).e();
    }

    @Override // defpackage.wi
    public void f(int i, Object obj) {
        ((wi) this.h).f(i + (this.g == 0 ? this.f : 0), obj);
    }

    @Override // defpackage.wi
    public void h(int i, int i2, int i3) {
        int i4 = this.g == 0 ? this.f : 0;
        ((wi) this.h).h(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.wi
    public Object i() {
        return ((wi) this.h).i();
    }

    @Override // defpackage.wi
    public void j(int i, int i2) {
        ((wi) this.h).j(i + (this.g == 0 ? this.f : 0), i2);
    }

    @Override // defpackage.bp3
    public int k() {
        return this.g;
    }

    @Override // defpackage.zo3
    public ue l(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        return ((pl) this.h).l(j, ueVar, ueVar2, ueVar3);
    }

    @Override // defpackage.wi
    public void m(rs0 rs0Var, Object obj) {
        ((wi) this.h).m(rs0Var, obj);
    }

    @Override // defpackage.iy1
    public int n(int i) {
        int iN = ((iy1) this.h).n(i);
        if (i >= 0 && i <= this.g) {
            no3.c(iN, this.f, i);
        }
        return iN;
    }

    @Override // defpackage.bp3
    public int o() {
        return this.f;
    }

    @Override // defpackage.zo3
    public ue p(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        return ((pl) this.h).p(j, ueVar, ueVar2, ueVar3);
    }

    @Override // defpackage.iy1
    public int r(int i) {
        int iR = ((iy1) this.h).r(i);
        if (i >= 0 && i <= this.f) {
            no3.b(iR, this.g, i);
        }
        return iR;
    }

    @Override // defpackage.wi
    public void s() {
        if (this.g <= 0) {
            e20.a("OffsetApplier up called with no corresponding down");
        }
        this.g--;
        ((wi) this.h).s();
    }

    public j01(wi wiVar, int i) {
        this.h = wiVar;
        this.f = i;
    }

    public j01(int i, int i2, cs0 cs0Var) {
        this.f = i;
        this.g = i2;
        this.h = cs0Var;
    }

    public j01() {
        this.h = new j01[256];
        this.f = 0;
        this.g = 0;
    }

    public j01(int i, int i2) {
        this.h = null;
        this.f = i;
        int i3 = i2 & 7;
        this.g = i3 == 0 ? 8 : i3;
    }

    public j01(iy1 iy1Var, int i, int i2) {
        this.h = iy1Var;
        this.f = i;
        this.g = i2;
    }
}
