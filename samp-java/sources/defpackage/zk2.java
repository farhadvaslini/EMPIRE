package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zk2 {
    public Set a;
    public j20 b;
    public final qs1 c;
    public js1 d;
    public qs1 e;
    public final qs1 f;
    public final qs1 g;
    public js1 h;
    public is1 i;
    public ArrayList j;
    public js1 k;

    public zk2() {
        qs1 qs1Var = new qs1(new rv0[16]);
        this.c = qs1Var;
        js1 js1Var = or2.a;
        this.d = new js1();
        this.e = qs1Var;
        this.f = new qs1(new Object[16]);
        this.g = new qs1(new cs0[16]);
    }

    public static final boolean f(rv0 rv0Var, qs1 qs1Var) {
        Object[] objArr = qs1Var.f;
        int i = qs1Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            al2 al2Var = ((rv0) objArr[i2]).a;
            if (al2Var instanceof h52) {
                qs1 qs1Var2 = ((h52) al2Var).g;
                if (qs1Var2.j(rv0Var) || f(rv0Var, qs1Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        qs1 qs1Var = this.c;
        qs1Var.g();
        this.d.b();
        this.e = qs1Var;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                al2 al2Var = (al2) it.next();
                it.remove();
                al2Var.d();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        qs1 qs1Var = this.f;
        int i = 12;
        if (qs1Var.h != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                js1 js1Var = this.h;
                int i2 = qs1Var.h;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = qs1Var.f[i2];
                    try {
                        if (obj instanceof rv0) {
                            al2 al2Var = ((rv0) obj).a;
                            set.remove(al2Var);
                            al2Var.e();
                        }
                        if (obj instanceof j10) {
                            if (js1Var == null || !js1Var.c(obj)) {
                                ((j10) obj).h();
                            } else {
                                ((j10) obj).f();
                            }
                        }
                    } catch (Throwable th) {
                        j20 j20Var = this.b;
                        if (j20Var != null) {
                            uq.O(th, new u1(i, j20Var, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        qs1 qs1Var2 = this.c;
        if (qs1Var2.h != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.a;
                if (set2 != null) {
                    Object[] objArr = qs1Var2.f;
                    int i3 = qs1Var2.h;
                    for (int i4 = 0; i4 < i3; i4++) {
                        rv0 rv0Var = (rv0) objArr[i4];
                        al2 al2Var2 = rv0Var.a;
                        set2.remove(al2Var2);
                        try {
                            al2Var2.a();
                        } catch (Throwable th2) {
                            j20 j20Var2 = this.b;
                            if (j20Var2 != null) {
                                uq.O(th2, new u1(i, j20Var2, rv0Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d() {
        qs1 qs1Var = this.g;
        if (qs1Var.h != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = qs1Var.f;
                int i = qs1Var.h;
                for (int i2 = 0; i2 < i; i2++) {
                    ((cs0) objArr[i2]).a();
                }
                qs1Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(rv0 rv0Var) {
        if (!this.d.c(rv0Var)) {
            js1 js1Var = this.k;
            if (js1Var == null || !js1Var.c(rv0Var)) {
                this.f.b(rv0Var);
                return;
            }
            return;
        }
        this.d.l(rv0Var);
        if (!this.e.j(rv0Var)) {
            qs1 qs1Var = this.c;
            if (!qs1Var.j(rv0Var)) {
                f(rv0Var, qs1Var);
            }
        }
        Set set = this.a;
        if (set == null) {
            return;
        }
        set.add(rv0Var.a);
    }

    public final void g(Set set, j20 j20Var) {
        a();
        this.a = set;
        this.b = j20Var;
    }
}
