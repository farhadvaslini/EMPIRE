package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bx0 extends mo3 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = wx.g;
    public List f;
    public boolean g;
    public da h;
    public ns0 i;
    public final s j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public bx0() {
        int i = vo3.a;
        this.f = ni0.f;
        this.g = true;
        this.j = new s(28, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.mo3
    public final void a(qf0 qf0Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = wm1.a();
                this.b = fArrA;
            } else {
                wm1.d(fArrA);
            }
            wm1.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            wm1.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                da daVarA = this.h;
                if (daVarA == null) {
                    daVarA = ga.a();
                    this.h = daVarA;
                }
                y02.R(this.f, daVarA);
            }
            this.g = false;
        }
        pi piVarZ = qf0Var.Z();
        long jA = piVarZ.A();
        piVarZ.k().l();
        try {
            pi piVar = (pi) ((yl1) piVarZ.g).g;
            float[] fArr = this.b;
            if (fArr != null) {
                piVar.k().q(fArr);
            }
            da daVar = this.h;
            if (!this.f.isEmpty() && daVar != null) {
                piVar.k().s(daVar);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((mo3) arrayList.get(i)).a(qf0Var);
            }
        } finally {
            nc2.t(piVarZ, jA);
        }
    }

    @Override // defpackage.mo3
    public final ns0 b() {
        return this.i;
    }

    @Override // defpackage.mo3
    public final void d(s sVar) {
        this.i = sVar;
    }

    public final void e(int i, mo3 mo3Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, mo3Var);
        } else {
            arrayList.add(mo3Var);
        }
        g(mo3Var);
        mo3Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = vo3.a;
            if (wx.h(j2) == wx.h(j) && wx.g(j2) == wx.g(j) && wx.e(j2) == wx.e(j)) {
                return;
            }
            this.d = false;
            this.e = wx.g;
        }
    }

    public final void g(mo3 mo3Var) {
        if (!(mo3Var instanceof k42)) {
            if (mo3Var instanceof bx0) {
                bx0 bx0Var = (bx0) mo3Var;
                if (bx0Var.d && this.d) {
                    f(bx0Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = wx.g;
                    return;
                }
            }
            return;
        }
        k42 k42Var = (k42) mo3Var;
        dp dpVar = k42Var.b;
        if (this.d && dpVar != null) {
            if (dpVar instanceof w73) {
                f(((w73) dpVar).a);
            } else {
                this.d = false;
                this.e = wx.g;
            }
        }
        dp dpVar2 = k42Var.g;
        if (this.d && dpVar2 != null) {
            if (dpVar2 instanceof w73) {
                f(((w73) dpVar2).a);
            } else {
                this.d = false;
                this.e = wx.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mo3 mo3Var = (mo3) arrayList.get(i);
            sb.append("\t");
            sb.append(mo3Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
