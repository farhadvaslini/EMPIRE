package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ic implements m50 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public ic(ic icVar) {
        this.f = 2;
        this.g = icVar;
        this.h = new yj0();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ns0 ns0Var, p40 p40Var) {
        f52 f52Var;
        boolean z;
        Object objQ;
        int i = 2;
        int i2 = 1;
        switch (this.f) {
            case 0:
                gc gcVar = (gc) this.h;
                jr jrVar = new jr(1, vr.I(p40Var));
                jrVar.s();
                hc hcVar = new hc(jrVar, this, ns0Var);
                if (s51.n(gcVar.h, (Choreographer) this.g)) {
                    synchronized (gcVar.j) {
                        gcVar.l.add(hcVar);
                        if (!gcVar.o) {
                            gcVar.o = true;
                            gcVar.h.postFrameCallback(gcVar.p);
                        }
                        break;
                    }
                    jrVar.v(new la(i2, gcVar, hcVar));
                } else {
                    ((Choreographer) this.g).postFrameCallback(hcVar);
                    jrVar.v(new la(i, this, hcVar));
                }
                return jrVar.q();
            case 1:
                jr jrVar2 = new jr(1, vr.I(p40Var));
                jrVar2.s();
                qk qkVar = (qk) this.h;
                cp cpVar = new cp();
                cpVar.a = jrVar2;
                cpVar.b = ns0Var;
                jrVar2.v(new va(i2, qkVar.d(cpVar, (yj2) this.g)));
                return jrVar2.q();
            default:
                if (p40Var instanceof f52) {
                    f52Var = (f52) p40Var;
                    int i3 = f52Var.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        f52Var.l = i3 - Integer.MIN_VALUE;
                    } else {
                        f52Var = new f52(this, p40Var);
                    }
                }
                Object obj = f52Var.j;
                y50 y50Var = y50.f;
                int i4 = f52Var.l;
                if (i4 == 0) {
                    y02.Q(obj);
                    yj0 yj0Var = (yj0) this.h;
                    f52Var.i = ns0Var;
                    f52Var.l = 1;
                    synchronized (yj0Var.b) {
                        z = yj0Var.a;
                    }
                    if (z) {
                        objQ = dm3.a;
                    } else {
                        jr jrVar3 = new jr(1, vr.I(f52Var));
                        jrVar3.s();
                        synchronized (yj0Var.b) {
                            ((ArrayList) yj0Var.c).add(jrVar3);
                        }
                        jrVar3.v(new la(9, yj0Var, jrVar3));
                        objQ = jrVar3.q();
                        if (objQ != y50Var) {
                            objQ = dm3.a;
                        }
                    }
                    if (objQ != y50Var) {
                    }
                    return y50Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        y02.Q(obj);
                        return obj;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ns0Var = f52Var.i;
                y02.Q(obj);
                ic icVar = (ic) this.g;
                f52Var.i = null;
                f52Var.l = 2;
                Object objA = icVar.a(ns0Var, f52Var);
                if (objA != y50Var) {
                    return objA;
                }
                return y50Var;
        }
    }

    @Override // defpackage.m50
    public n50 getKey() {
        return f5.c0;
    }

    @Override // defpackage.o50
    public final o50 k(o50 o50Var) {
        switch (this.f) {
        }
        return pq.Q(this, o50Var);
    }

    @Override // defpackage.o50
    public final m50 m(n50 n50Var) {
        switch (this.f) {
        }
        return pq.t(this, n50Var);
    }

    @Override // defpackage.o50
    public final Object p(rs0 rs0Var, Object obj) {
        switch (this.f) {
        }
        return rs0Var.f(obj, this);
    }

    @Override // defpackage.o50
    public final o50 u(n50 n50Var) {
        switch (this.f) {
        }
        return pq.M(this, n50Var);
    }

    public ic(Choreographer choreographer, gc gcVar) {
        this.f = 0;
        this.g = choreographer;
        this.h = gcVar;
    }

    public ic(yj2 yj2Var) {
        this.f = 1;
        this.g = yj2Var;
        this.h = new qk();
    }
}
