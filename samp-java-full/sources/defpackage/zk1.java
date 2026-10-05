package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zk1 implements ua0 {
    public boolean f;
    public long g = 9223372034707292159L;
    public long h = 0;
    public final /* synthetic */ al1 i;

    public zk1(al1 al1Var) {
        this.i = al1Var;
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.i.G();
    }

    public final ab1 c() {
        this.f = true;
        al1 al1Var = this.i;
        ab1 ab1VarV0 = al1Var.V0();
        if (i41.a(this.g, 9223372034707292159L)) {
            this.g = uq.H(ab1VarV0.i(0L));
            this.h = ab1VarV0.i0();
        }
        al1Var.Z0().M.b();
        return ab1VarV0;
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.i.h();
    }

    public final void i(uy0 uy0Var, float f) {
        al1 al1Var = this.i;
        yf yfVar = al1Var.v;
        if (yfVar == null) {
            yfVar = new yf();
            al1Var.v = yfVar;
        }
        int iV = uj.V((uy0[]) yfVar.b, uy0Var);
        if (iV >= 0) {
            float[] fArr = (float[]) yfVar.c;
            if (fArr[iV] != f) {
                fArr[iV] = f;
                ((byte[]) yfVar.d)[iV] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) yfVar.d;
                if (bArr[iV] == 2) {
                    bArr[iV] = 0;
                    return;
                }
                return;
            }
        }
        int i = yfVar.a;
        uy0[] uy0VarArr = (uy0[]) yfVar.b;
        if (i == uy0VarArr.length) {
            int i2 = i * 2;
            yfVar.b = (uy0[]) Arrays.copyOf(uy0VarArr, i2);
            yfVar.c = Arrays.copyOf((float[]) yfVar.c, i2);
            yfVar.d = Arrays.copyOf((byte[]) yfVar.d, i2);
        }
        ((uy0[]) yfVar.b)[i] = uy0Var;
        ((byte[]) yfVar.d)[i] = 3;
        ((float[]) yfVar.c)[i] = f;
        yfVar.a++;
    }
}
