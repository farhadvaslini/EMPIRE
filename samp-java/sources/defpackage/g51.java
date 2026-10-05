package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class g51 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final Object d;

    public g51(boolean z, bu2 bu2Var, lx lxVar) {
        this.a = 1;
        this.b = z;
        this.c = bu2Var;
        this.d = lxVar;
    }

    public boolean a(long j) {
        Object obj;
        List list = (List) ((a31) this.d).g;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (d32.l(((ib2) obj).a, j)) {
                break;
            }
            i++;
        }
        ib2 ib2Var = (ib2) obj;
        if (ib2Var != null) {
            return ib2Var.h;
        }
        return false;
    }

    public h60 b() {
        lx lxVar = (lx) this.d;
        int i = lxVar.b;
        int i2 = lxVar.c;
        return i < i2 ? h60.g : i > i2 ? h60.f : h60.h;
    }

    public void c() {
        if (this.b) {
            sf3.b((sf3) this.d, (yg3) this.c);
        }
    }

    public long d(bg3 bg3Var, long j, boolean z, qn1 qn1Var) {
        sf3 sf3Var = (sf3) this.d;
        long jC = sf3.c(sf3Var, bg3Var, j, z, false, qn1Var, false, null);
        if (!yg3.a(jC, (yg3) this.c)) {
            this.b = false;
        }
        sf3Var.q(yg3.c(jC) ? hx0.h : hx0.g);
        return jC;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "SingleSelectionLayout(isStartHandle=" + this.b + ", crossed=" + b() + ", info=\n\t" + ((lx) this.d) + ")";
            default:
                return super.toString();
        }
    }

    public g51(xk1 xk1Var, a31 a31Var) {
        this.a = 0;
        this.c = xk1Var;
        this.d = a31Var;
    }

    public g51(sf3 sf3Var) {
        this.a = 2;
        this.d = sf3Var;
        this.b = true;
    }
}
