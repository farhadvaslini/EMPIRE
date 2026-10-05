package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class h3 extends k33 {
    public i23 a;
    public final d42 b;

    public h3(i23 i23Var, jk2 jk2Var) {
        this.a = i23Var;
        this.b = b32.w(jk2Var);
    }

    @Override // defpackage.k33
    public final k33 a(m23 m23Var, i23 i23Var, long j, long j2, long j3) {
        Object obj;
        pl plVar = new pl(j, gy1.d(j2, j3), j3);
        jk2 jk2VarC = c();
        if (jk2VarC == null) {
            i23 i23Var2 = this.a;
            if (i23Var2 == null) {
                List listB = m23Var.b();
                int size = listB.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i);
                    if (m23Var.c().contains((o23) obj)) {
                        break;
                    }
                    i++;
                }
                o23 o23Var = (o23) obj;
                i23Var2 = o23Var != null ? o23Var.r : null;
            }
            jk2VarC = w22.f(m23Var, i23Var2);
            if (jk2VarC == null) {
                jk2VarC = b32.b(j2, j);
            }
        }
        w22.h(plVar, j, j2, j3, true);
        return new g3(plVar, i23Var, jk2VarC);
    }

    @Override // defpackage.k33
    public final boolean b() {
        return true;
    }

    @Override // defpackage.k33
    public final jk2 c() {
        return (jk2) this.b.getValue();
    }

    @Override // defpackage.k33
    public final pl e() {
        return null;
    }

    @Override // defpackage.k33
    public final jk2 f(m23 m23Var) {
        Object obj;
        jk2 jk2VarC = c();
        if (jk2VarC != null) {
            return jk2VarC;
        }
        if (c() == null) {
            i23 i23Var = this.a;
            if (i23Var == null) {
                List listB = m23Var.b();
                int size = listB.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i);
                    if (m23Var.c().contains((o23) obj)) {
                        break;
                    }
                    i++;
                }
                o23 o23Var = (o23) obj;
                i23Var = o23Var != null ? o23Var.r : null;
            }
            jk2 jk2VarF = w22.f(m23Var, i23Var);
            if (jk2VarF != null) {
                this.b.setValue(jk2VarF);
            }
        }
        return c();
    }

    @Override // defpackage.k33
    public final k33 g(i23 i23Var) {
        if (this.a == null) {
            this.a = i23Var;
        }
        return this;
    }

    @Override // defpackage.k33
    public final k33 h() {
        return vw1.a;
    }

    @Override // defpackage.k33
    public final void i(jk2 jk2Var) {
        this.b.setValue(jk2Var);
    }
}
