package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class o23 implements al2 {
    public final d42 i;
    public final d42 j;
    public final d42 k;
    public final d42 l;
    public final d42 m;
    public final d42 n;
    public boolean o;
    public da p;
    public o23 q;
    public i23 r;
    public final d42 f = b32.w(Boolean.FALSE);
    public final z32 g = new z32(0.0f);
    public final d42 h = b32.w(Boolean.TRUE);
    public final d42 s = b32.w(null);

    public o23(m23 m23Var, vn vnVar, x23 x23Var, boolean z, d33 d33Var, y23 y23Var) {
        this.i = b32.w(m23Var);
        this.j = b32.w(vnVar);
        this.k = b32.w(x23Var);
        this.l = b32.w(Boolean.valueOf(z));
        this.m = b32.w(d33Var);
        this.n = b32.w(y23Var);
    }

    @Override // defpackage.al2
    public final void a() {
        c33 c33Var = f().b;
        a42 a42Var = c33Var.l;
        m23 m23VarF = f();
        m23VarF.d.setValue(qx.E0(m23VarF.b(), this));
        m23VarF.f();
        c33Var.d();
        as1 as1Var = c33Var.m;
        Object[] objArr = as1Var.a;
        int i = as1Var.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            o23 o23Var = (o23) objArr[i2];
            if (!(o23Var instanceof o23)) {
                o23Var = null;
            }
            if (s51.n(o23Var != null ? o23Var.f() : null, f())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || i2 >= as1Var.b - 1) {
            as1Var.b(this);
        } else {
            as1Var.a(i2 + 1, this);
        }
        a42Var.h(a42Var.g() + 1);
        f().c.b();
    }

    public final u23 b() {
        i23 i23Var;
        u23 u23VarQ1;
        ((v23) j().b.getValue()).getClass();
        i23 i23Var2 = this.r;
        Object obj = null;
        u23 u23VarQ12 = i23Var2 != null ? i23Var2.q1() : null;
        if (l() ? !i() : i()) {
            List listC = f().c();
            int size = listC.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj2 = listC.get(i);
                o23 o23Var = (o23) obj2;
                boolean zL = o23Var.l();
                boolean zI = o23Var.i();
                if (!zL) {
                    zI = !zI;
                }
                if (zI) {
                    obj = obj2;
                    break;
                }
                i++;
            }
            o23 o23Var2 = (o23) obj;
            if (o23Var2 != null && (i23Var = o23Var2.r) != null && (u23VarQ1 = i23Var.q1()) != null) {
                return u23VarQ1;
            }
        }
        return u23VarQ12;
    }

    public final vn c() {
        return (vn) this.j.getValue();
    }

    @Override // defpackage.al2
    public final void e() {
        c33 c33Var = f().b;
        m23 m23VarF = f();
        m23VarF.d.setValue(qx.C0(m23VarF.b(), this));
        m23VarF.e.setValue(qx.C0(m23VarF.c(), this));
        m23VarF.f();
        c33Var.d();
        c33Var.m.k(this);
        a42 a42Var = c33Var.l;
        a42Var.h(a42Var.g() + 1);
        if (m23VarF.b().isEmpty()) {
            cl3.t(m23VarF.b.g, null, new pw(m23VarF, this, null, 16), 3);
        }
        f().c.b();
    }

    public final m23 f() {
        return (m23) this.i.getValue();
    }

    public final boolean g() {
        if (c().b()) {
            return true;
        }
        return (f().c.a().d() && !f().c.a().b()) || !((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean h() {
        if (g() && f().c.a().d() && k() && ((Boolean) this.h.getValue()).booleanValue()) {
            return f().b.a() || l();
        }
        return false;
    }

    public final boolean i() {
        return c().b();
    }

    public final y23 j() {
        return (y23) this.n.getValue();
    }

    public final boolean k() {
        y23 y23VarJ = j();
        if (!((Boolean) this.f.getValue()).booleanValue()) {
            return false;
        }
        ((v23) y23VarJ.b.getValue()).getClass();
        return true;
    }

    public final boolean l() {
        u23 u23VarQ1;
        i23 i23Var = this.r;
        return (i23Var == null || (u23VarQ1 = i23Var.q1()) == null || !u23VarQ1.d()) ? false : true;
    }

    @Override // defpackage.al2
    public final void d() {
    }
}
