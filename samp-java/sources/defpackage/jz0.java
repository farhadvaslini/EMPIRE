package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class jz0 implements z73 {
    public final i01 f;
    public final fr0 g;
    public boolean h;
    public final /* synthetic */ nz0 i;

    public jz0(nz0 nz0Var, i01 i01Var) {
        i01Var.getClass();
        this.i = nz0Var;
        this.f = i01Var;
        ci3 ci3VarA = ((ej2) nz0Var.c.h).f.a();
        ci3VarA.getClass();
        fr0 fr0Var = new fr0();
        fr0Var.e = ci3VarA;
        this.g = fr0Var;
    }

    @Override // defpackage.z73
    public final ci3 a() {
        return this.g;
    }

    public final void b(ux0 ux0Var) {
        my1 my1Var;
        f5 f5Var;
        ux0Var.getClass();
        nz0 nz0Var = this.i;
        int i = nz0Var.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + nz0Var.d);
        }
        fr0 fr0Var = this.g;
        ci3 ci3Var = fr0Var.e;
        fr0Var.e = ci3.d;
        ci3Var.a();
        ci3Var.b();
        nz0Var.d = 6;
        if (ux0Var.size() <= 0 || (my1Var = nz0Var.a) == null || (f5Var = my1Var.j) == null) {
            return;
        }
        f01.b(f5Var, this.f, ux0Var);
    }

    @Override // defpackage.z73
    public long d(long j, hp hpVar) throws IOException {
        nz0 nz0Var = this.i;
        hpVar.getClass();
        try {
            return ((ej2) nz0Var.c.h).d(j, hpVar);
        } catch (IOException e) {
            nz0Var.b.h();
            this.b(nz0.f);
            throw e;
        }
    }
}
