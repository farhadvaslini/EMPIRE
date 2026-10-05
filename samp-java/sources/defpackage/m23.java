package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class m23 {
    public final String a;
    public final c33 b;
    public final l33 c = new l33(this);
    public final d42 d;
    public final d42 e;
    public final ed f;
    public boolean g;
    public final l23 h;
    public final l23 i;

    public m23(String str, c33 c33Var) {
        this.a = str;
        this.b = c33Var;
        ni0 ni0Var = ni0.f;
        this.d = b32.w(ni0Var);
        this.e = b32.w(ni0Var);
        this.f = new ed(new gy1(0L), rn.k1, null, 12);
        this.h = new l23(this, 0);
        this.i = new l23(this, 1);
    }

    public final boolean a() {
        l33 l33Var = this.c;
        return l33Var.a().b() || l33Var.a().d() || l33Var.e == f93.g;
    }

    public final List b() {
        return (List) this.d.getValue();
    }

    public final List c() {
        return (List) this.e.getValue();
    }

    public final boolean d() {
        List listC = c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            if (((o23) listC.get(i)).c().d()) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        List listC = c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            u23 u23VarB = ((o23) listC.get(i)).b();
            if (u23VarB != null && u23VarB.d()) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        List listB = b();
        ArrayList arrayList = new ArrayList();
        int size = listB.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            o23 o23Var = (o23) listB.get(i);
            if (o23Var.k()) {
                arrayList.add(o23Var);
                if (o23Var.c().b()) {
                    z = true;
                }
            }
        }
        this.e.setValue(arrayList);
        l33 l33Var = this.c;
        m23 m23Var = l33Var.a;
        a42 a42Var = l33Var.d;
        if (m23Var.c().size() > 1 && z) {
            l33Var.e = f93.g;
            a42Var.h(l33Var.c + 1);
        } else if (!m23Var.b.a()) {
            l33Var.e = f93.f;
            l33Var.c = a42Var.g();
            l33Var.b.setValue(vw1.a);
        } else if (!z) {
            l33Var.e = f93.h;
            a42Var.h(l33Var.c + 1);
        }
        l33Var.b();
    }
}
