package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vn {
    public final c33 a;
    public final gk3 b;
    public final cs0 c;
    public final d42 d;
    public final d42 e;
    public jk2 i;
    public jk2 j;
    public mm0 f = wn.a;
    public final un g = new un(this, 1);
    public final d42 h = b32.w(null);
    public final un k = new un(this, 0);

    public vn(c33 c33Var, gk3 gk3Var, bk3 bk3Var, r03 r03Var, cs0 cs0Var) {
        this.a = c33Var;
        this.b = gk3Var;
        this.c = cs0Var;
        this.d = b32.w(bk3Var);
        this.e = b32.w(r03Var);
    }

    public final void a(jk2 jk2Var, jk2 jk2Var2, r03 r03Var, jk2 jk2Var3, te teVar) {
        mm0 mm0VarI;
        if (this.a.a()) {
            this.i = jk2Var;
            this.j = jk2Var2;
            d42 d42Var = this.h;
            if (((e93) d42Var.getValue()) == null) {
                if (r03Var == null) {
                    r03Var = (r03) this.e.getValue();
                }
                switch (r03Var.a) {
                    case 0:
                        mm0VarI = n92.I(300, 2, pg0.a);
                        break;
                    case 1:
                        mm0VarI = n92.I(300, 2, pg0.a);
                        break;
                    default:
                        mm0VarI = n92.F(0.0f, 0.0f, mr3.a, 3);
                        break;
                }
                this.f = mm0VarI;
            }
            d42Var.setValue(((bk3) this.d.getValue()).a(this.g, jk2Var3, teVar, this.k));
        }
    }

    public final boolean b() {
        return ((Boolean) this.b.d.getValue()).booleanValue();
    }

    public final jk2 c() {
        e93 e93Var;
        jk2 jk2Var;
        if (!this.a.a() || (e93Var = (e93) this.h.getValue()) == null || (jk2Var = (jk2) e93Var.getValue()) == null) {
            return null;
        }
        long j = ((gy1) this.c.a()).a;
        return !gy1.b(j, 0L) ? jk2Var.i(j) : jk2Var;
    }

    public final boolean d() {
        gk3 gk3Var = this.b;
        while (true) {
            gk3 gk3Var2 = gk3Var.b;
            if (gk3Var2 == null) {
                return !s51.n(gk3Var.a.h(), gk3Var.d.getValue());
            }
            gk3Var = gk3Var2;
        }
    }
}
