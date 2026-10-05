package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class g90 implements dw1 {
    public final i32 f;
    public final bb1 g;

    public g90(i32 i32Var, bb1 bb1Var) {
        this.f = i32Var;
        this.g = bb1Var;
    }

    @Override // defpackage.dw1
    public final Object J0(long j, long j2, p40 p40Var) {
        return new lp3(lp3.a(j2, 0.0f, 0.0f, 1));
    }

    @Override // defpackage.dw1
    public final long Q0(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        i32 i32Var = this.f;
        if (Math.abs(i32Var.l()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0L;
        }
        y22 y22VarM = i32Var.m();
        float fL = i32Var.l() * i32Var.o();
        float f = ((y22VarM.b + y22VarM.c) * (-Math.signum(i32Var.l()))) + fL;
        if (i32Var.l() > 0.0f) {
            fL = f;
            f = fL;
        }
        float fG = y02.g(Float.intBitsToFloat(i2), fL, f);
        boolean z = this.g == bb1.g;
        l90 l90Var = i32Var.k;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(z ? l90Var.e(fG) : -l90Var.e(-fG))) << 32);
    }

    @Override // defpackage.dw1
    public final long l0(long j, int i, long j2) {
        if (i != 2 || Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
