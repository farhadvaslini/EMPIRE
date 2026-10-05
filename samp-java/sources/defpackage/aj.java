package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class aj implements bj, yi {
    public final /* synthetic */ yi f;
    public final bb1 g;

    public aj(yi yiVar, bb1 bb1Var) {
        this.f = yiVar;
        this.g = bb1Var;
    }

    @Override // defpackage.ua0
    public final long C0(long j) {
        return this.f.C0(j);
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.f.G();
    }

    @Override // defpackage.ua0
    public final float H0(long j) {
        return this.f.H0(j);
    }

    @Override // defpackage.k51
    public final boolean M() {
        return this.f.M();
    }

    @Override // defpackage.ua0
    public final long P0(float f) {
        return this.f.P0(f);
    }

    @Override // defpackage.ua0
    public final long Q(float f) {
        return this.f.Q(f);
    }

    @Override // defpackage.ua0
    public final long R(long j) {
        return this.f.R(j);
    }

    @Override // defpackage.ua0
    public final float T(float f) {
        return this.f.T(f);
    }

    @Override // defpackage.ua0
    public final float X0(int i) {
        return this.f.X0(i);
    }

    @Override // defpackage.ua0
    public final float a1(float f) {
        return this.f.a1(f);
    }

    @Override // defpackage.ua0
    public final int f0(long j) {
        return this.f.f0(j);
    }

    @Override // defpackage.k51
    public final bb1 getLayoutDirection() {
        return this.g;
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.f.h();
    }

    @Override // defpackage.ua0
    public final float j0(long j) {
        return this.f.j0(j);
    }

    @Override // defpackage.en1
    public final dn1 o0(int i, int i2, Map map, ns0 ns0Var, ns0 ns0Var2) {
        int i3 = i < 0 ? 0 : i;
        int i4 = i2 < 0 ? 0 : i2;
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i4) != 0) {
            m21.c("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new zi(i3, i4, map, ns0Var, 0);
    }

    @Override // defpackage.ua0
    public final int p0(float f) {
        return this.f.p0(f);
    }
}
