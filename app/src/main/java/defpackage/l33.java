package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class l33 {
    public final m23 a;
    public int c;
    public i23 f;
    public int h;
    public final d42 b = b32.w(vw1.a);
    public final a42 d = new a42(0);
    public f93 e = f93.f;
    public final a42 g = new a42(0);

    public l33(m23 m23Var) {
        this.a = m23Var;
    }

    public final k33 a() {
        return (k33) this.b.getValue();
    }

    public final void b() {
        Object obj;
        List listC = this.a.c();
        int size = listC.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = listC.get(i);
            if (((o23) obj).i()) {
                break;
            } else {
                i++;
            }
        }
        o23 o23Var = (o23) obj;
        if (o23Var == null && this.f == null) {
            return;
        }
        if (s51.n(o23Var != null ? o23Var.r : null, this.f)) {
            return;
        }
        this.g.h(this.h + 1);
    }

    public final void c() {
        Object obj;
        Object obj2;
        k33 k33VarA;
        a42 a42Var = this.d;
        int iG = a42Var.g();
        int i = this.c;
        int i2 = 0;
        m23 m23Var = this.a;
        if (iG != i) {
            this.c = a42Var.g();
            int iOrdinal = this.e.ordinal();
            if (iOrdinal == 0) {
                k33VarA = a();
            } else if (iOrdinal != 1) {
                k33VarA = vw1.a;
                if (iOrdinal == 2) {
                    List listC = m23Var.c();
                    int size = listC.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            k33VarA = a().h();
                            break;
                        } else if (s51.n(((o23) listC.get(i3)).r, this.f)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else if (iOrdinal != 3) {
                    c.k();
                    return;
                }
            } else {
                k33VarA = a().g(this.f);
            }
            this.b.setValue(k33VarA);
            this.e = f93.f;
        }
        a42 a42Var2 = this.g;
        if (a42Var2.g() != this.h) {
            i23 i23Var = null;
            if (m23Var.b.a()) {
                List listC2 = m23Var.c();
                int size2 = listC2.size();
                while (true) {
                    if (i2 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listC2.get(i2);
                    if (((o23) obj2).i()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                o23 o23Var = (o23) obj2;
                if (o23Var != null) {
                    i23Var = o23Var.r;
                }
            } else {
                List listB = m23Var.b();
                int size3 = listB.size();
                while (true) {
                    if (i2 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i2);
                    if (((o23) obj).i()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                o23 o23Var2 = (o23) obj;
                if (o23Var2 != null) {
                    i23Var = o23Var2.r;
                }
            }
            if (!s51.n(i23Var, this.f)) {
                this.f = i23Var;
            }
            this.h = a42Var2.g();
        }
    }
}
