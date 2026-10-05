package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class k42 extends mo3 {
    public dp b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public dp g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ga3 q;
    public final da r;
    public da s;
    public da t;
    public final lc1 u;

    public k42() {
        int i = vo3.a;
        this.d = ni0.f;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        da daVarA = ga.a();
        this.r = daVarA;
        this.s = daVarA;
        this.u = ur.J(pe1.f, new x91(29));
    }

    @Override // defpackage.mo3
    public final void a(qf0 qf0Var) {
        ga3 ga3Var;
        if (this.n) {
            y02.R(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        dp dpVar = this.b;
        if (dpVar != null) {
            qf0.N(qf0Var, this.s, dpVar, this.c, null, 56);
        }
        dp dpVar2 = this.g;
        if (dpVar2 != null) {
            ga3 ga3Var2 = this.q;
            if (this.o || ga3Var2 == null) {
                ga3 ga3Var3 = new ga3(this.f, this.j, this.h, this.i, null, 16);
                this.q = ga3Var3;
                this.o = false;
                ga3Var = ga3Var3;
            } else {
                ga3Var = ga3Var2;
            }
            qf0.N(qf0Var, this.s, dpVar2, this.e, ga3Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        da daVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = daVar;
            return;
        }
        if (s51.n(this.s, daVar)) {
            this.s = ga.a();
        } else {
            int i = this.s.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.s.h();
            this.s.i(i);
        }
        lc1 lc1Var = this.u;
        ((fa) lc1Var.getValue()).a.setPath(daVar != null ? daVar.a : null, false);
        float length = ((fa) lc1Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((fa) lc1Var.getValue()).a(f4, f5, this.s);
            return;
        }
        da daVarA = this.t;
        if (daVarA == null) {
            daVarA = ga.a();
            this.t = daVarA;
        }
        daVarA.g();
        ((fa) lc1Var.getValue()).a(f4, length, daVarA);
        da.a(this.s, daVarA);
        daVarA.g();
        ((fa) lc1Var.getValue()).a(0.0f, f5, daVarA);
        da.a(this.s, daVarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
