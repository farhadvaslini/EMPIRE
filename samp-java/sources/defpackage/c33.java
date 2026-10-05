package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class c33 implements hl1 {
    public final /* synthetic */ hl1 f;
    public final x50 g;
    public ab1 j;
    public ab1 k;
    public final d42 h = b32.w(Boolean.FALSE);
    public final be i = new be(2, this);
    public final a42 l = new a42(0);
    public final as1 m = new as1();
    public final n73 n = new n73();
    public int o = -1;

    public c33(hl1 hl1Var, x50 x50Var) {
        this.f = hl1Var;
        this.g = x50Var;
    }

    public static y23 b(String str, nv0 nv0Var) {
        nv0Var.a0(800730162);
        nv0Var.a0(-148945892);
        boolean zF = nv0Var.f(str);
        Object objO = nv0Var.O();
        if (zF || objO == c20.a) {
            objO = new y23(str);
            nv0Var.j0(objO);
        }
        y23 y23Var = (y23) objO;
        y23Var.b.setValue(v23.a);
        nv0Var.p(false);
        nv0Var.p(false);
        return y23Var;
    }

    public final boolean a() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.hl1
    public final ab1 c(ab1 ab1Var) {
        return this.f.c(ab1Var);
    }

    public final void d() {
        boolean z;
        Collection<m23> collectionValues = this.n.e().c.values();
        loop0: while (true) {
            for (m23 m23Var : collectionValues) {
                m23Var.f();
                z = z || (m23Var.a() && (m23Var.d() || m23Var.e()));
            }
        }
        if (z != a()) {
            this.h.setValue(Boolean.valueOf(z));
            if (z) {
                return;
            }
            for (m23 m23Var2 : collectionValues) {
                if (m23Var2.c().size() > 1) {
                    List listC = m23Var2.c();
                    int i = p23.a;
                    int size = listC.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((o23) listC.get(i2)).c().b()) {
                            break;
                        }
                    }
                }
                l33 l33Var = m23Var2.c;
                l33Var.e = f93.f;
                l33Var.c = l33Var.d.g();
                l33Var.b.setValue(vw1.a);
            }
        }
    }

    @Override // defpackage.hl1
    public final long i(ab1 ab1Var, ab1 ab1Var2) {
        return this.f.i(ab1Var, ab1Var2);
    }
}
