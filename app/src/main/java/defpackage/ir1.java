package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ir1 extends u10 {
    public final is1 b;
    public final ArrayList c;
    public final is1 d;
    public final b4 e;

    public ir1() {
        super(2);
        this.b = n32.j();
        this.c = new ArrayList();
        this.d = new is1();
        u uVar = new u(22, this);
        a73.e(a73.a);
        synchronized (a73.c) {
            a73.h = qx.E0(a73.h, uVar);
        }
        this.e = new b4(4, uVar);
    }

    @Override // defpackage.u10
    public final void d(lv2 lv2Var) {
        this.c.add(new gr1(lv2Var));
    }

    @Override // defpackage.u10
    public final void e() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    hr1 hr1Var = (hr1) arrayList.get(i);
                    if (hr1Var instanceof fr1) {
                        n32.f(this.b, ((fr1) hr1Var).a, ((fr1) hr1Var).b);
                    } else {
                        if (!(hr1Var instanceof gr1)) {
                            throw new kz();
                        }
                        n32.x(this.b, ((gr1) hr1Var).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // defpackage.u10
    public final void g() {
        this.e.b();
        this.c.clear();
        this.d.a();
        synchronized (this.a) {
            this.b.a();
        }
    }

    @Override // defpackage.u10
    public final ns0 k(lv2 lv2Var) {
        is1 is1Var = this.d;
        ns0 er1Var = (ns0) is1Var.g(lv2Var);
        if (er1Var == null) {
            er1Var = new er1(0, this, lv2Var);
            int iF = is1Var.f(lv2Var);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = is1Var.c;
            Object obj = objArr[iF];
            is1Var.b[iF] = lv2Var;
            objArr[iF] = er1Var;
        }
        return er1Var;
    }

    @Override // defpackage.u10
    public final void l(js jsVar) {
        this.d.k(jsVar);
        d(jsVar);
        e();
    }
}
