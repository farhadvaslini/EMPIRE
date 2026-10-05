package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class p33 implements dw1 {
    public final /* synthetic */ s33 f;
    public final /* synthetic */ ns0 g;

    public p33(s33 s33Var, ns0 ns0Var) {
        this.f = s33Var;
        this.g = ns0Var;
    }

    @Override // defpackage.dw1
    public final Object G0(long j, p40 p40Var) {
        float fC = lp3.c(j);
        s33 s33Var = this.f;
        float f = s33Var.c.f();
        float fC2 = s33Var.c.d().c();
        if (fC >= 0.0f || f <= fC2) {
            j = 0;
        } else {
            this.g.h(new Float(fC));
        }
        return new lp3(j);
    }

    @Override // defpackage.dw1
    public final Object J0(long j, long j2, p40 p40Var) {
        this.g.h(new Float(lp3.c(j2)));
        return new lp3(j2);
    }

    @Override // defpackage.dw1
    public final long Q0(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        d6 d6Var = this.f.c;
        float fE = d6Var.e(fIntBitsToFloat);
        z32 z32Var = d6Var.j;
        float fG = Float.isNaN(z32Var.g()) ? 0.0f : z32Var.g();
        z32Var.h(fE);
        return a(fE - fG);
    }

    public final long a(float f) {
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // defpackage.dw1
    public final long l0(long j, int i, long j2) {
        if (i != 1) {
            return 0L;
        }
        d6 d6Var = this.f.c;
        float fE = d6Var.e(Float.intBitsToFloat((int) (4294967295L & j2)));
        z32 z32Var = d6Var.j;
        float fG = Float.isNaN(z32Var.g()) ? 0.0f : z32Var.g();
        z32Var.h(fE);
        return a(fE - fG);
    }
}
