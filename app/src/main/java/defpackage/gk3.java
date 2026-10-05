package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gk3 {
    public final u10 a;
    public final gk3 b;
    public final String c;
    public final d42 d;
    public final d42 f;
    public final d42 i;
    public final l73 j;
    public final l73 k;
    public final d42 l;
    public final cb0 m;
    public final d42 e = b32.w(null);
    public final b42 g = new b42(0);
    public final b42 h = new b42(Long.MIN_VALUE);

    public gk3(u10 u10Var, gk3 gk3Var, String str) {
        this.a = u10Var;
        this.b = gk3Var;
        this.c = str;
        this.d = b32.w(u10Var.h());
        this.f = b32.w(new dk3(u10Var.h(), u10Var.h()));
        Boolean bool = Boolean.FALSE;
        this.i = b32.w(bool);
        this.j = new l73();
        this.k = new l73();
        this.l = b32.w(bool);
        this.m = b32.j(new zj3(this, 1));
        u10Var.n(this);
    }

    public final void a(Object obj, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? nv0Var.f(obj) : nv0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(this) ? 32 : 16;
        }
        int i3 = 0;
        if (!nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            nv0Var.U();
        } else if (g()) {
            nv0Var.a0(467722849);
            nv0Var.p(false);
        } else {
            nv0Var.a0(466062241);
            r(obj);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (z || objO == zjVar) {
                objO = b32.j(new zj3(this, i3));
                nv0Var.j0(objO);
            }
            if (((Boolean) ((e93) objO).getValue()).booleanValue()) {
                nv0Var.a0(466470356);
                Object objO2 = nv0Var.O();
                if (objO2 == zjVar) {
                    objO2 = rn.A(nv0Var);
                    nv0Var.j0(objO2);
                }
                x50 x50Var = (x50) objO2;
                boolean zH = nv0Var.h(x50Var) | (i4 == 32);
                Object objO3 = nv0Var.O();
                if (zH || objO3 == zjVar) {
                    objO3 = new er1(26, x50Var, this);
                    nv0Var.j0(objO3);
                }
                rn.h(x50Var, this, (ns0) objO3, nv0Var);
                nv0Var.p(false);
            } else {
                nv0Var.a0(467712929);
                nv0Var.p(false);
            }
            nv0Var.p(false);
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xc(i, 14, this, obj);
        }
    }

    public final long b() {
        l73 l73Var = this.j;
        int size = l73Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((ek3) l73Var.get(i)).q.g());
        }
        l73 l73Var2 = this.k;
        int size2 = l73Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((gk3) l73Var2.get(i2)).b());
        }
        return jMax;
    }

    public final void c() {
        l73 l73Var = this.j;
        int size = l73Var.size();
        for (int i = 0; i < size; i++) {
            ek3 ek3Var = (ek3) l73Var.get(i);
            ek3Var.k = null;
            ek3Var.j = null;
            ek3Var.n = false;
        }
        l73 l73Var2 = this.k;
        int size2 = l73Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((gk3) l73Var2.get(i2)).c();
        }
    }

    public final boolean d() {
        l73 l73Var = this.j;
        int size = l73Var.size();
        for (int i = 0; i < size; i++) {
            if (((ek3) l73Var.get(i)).j != null) {
                return true;
            }
        }
        l73 l73Var2 = this.k;
        int size2 = l73Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((gk3) l73Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        gk3 gk3Var = this.b;
        return gk3Var != null ? gk3Var.e() : this.g.g();
    }

    public final ck3 f() {
        return (ck3) this.f.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        b42 b42Var = this.h;
        long jG = b42Var.g();
        u10 u10Var = this.a;
        if (jG == Long.MIN_VALUE) {
            b42Var.h(j);
            ((d42) u10Var.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((d42) u10Var.a).getValue()).booleanValue()) {
            ((d42) u10Var.a).setValue(Boolean.TRUE);
        }
        o(false);
        l73 l73Var = this.j;
        int size = l73Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            ek3 ek3Var = (ek3) l73Var.get(i);
            d42 d42Var = ek3Var.l;
            d42 d42Var2 = ek3Var.l;
            if (!((Boolean) d42Var.getValue()).booleanValue()) {
                long jC = z ? ek3Var.a().c() : j;
                ek3Var.e(ek3Var.a().b(jC));
                ek3Var.p = ek3Var.a().f(jC);
                if (ek3Var.a().g(jC)) {
                    d42Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) d42Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        l73 l73Var2 = this.k;
        int size2 = l73Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            gk3 gk3Var = (gk3) l73Var2.get(i2);
            d42 d42Var3 = gk3Var.d;
            u10 u10Var2 = gk3Var.a;
            if (!s51.n(d42Var3.getValue(), u10Var2.h())) {
                gk3Var.h(j, z);
            }
            if (!s51.n(gk3Var.d.getValue(), u10Var2.h())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.h.h(Long.MIN_VALUE);
        u10 u10Var = this.a;
        if (u10Var instanceof ps1) {
            u10Var.m(this.d.getValue());
        }
        n(0L);
        ((d42) u10Var.a).setValue(Boolean.FALSE);
        l73 l73Var = this.k;
        int size = l73Var.size();
        for (int i = 0; i < size; i++) {
            ((gk3) l73Var.get(i)).i();
        }
    }

    public final void j(float f) {
        l73 l73Var = this.j;
        int size = l73Var.size();
        for (int i = 0; i < size; i++) {
            ek3 ek3Var = (ek3) l73Var.get(i);
            ek3Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                dd3 dd3Var = ek3Var.k;
                if (dd3Var != null) {
                    ek3Var.a().h(dd3Var.c);
                    ek3Var.j = null;
                    ek3Var.k = null;
                }
                Object obj = f == -4.0f ? ek3Var.a().d : ek3Var.a().c;
                ek3Var.a().h(obj);
                ek3Var.a().i(obj);
                ek3Var.e(obj);
                ek3Var.q.h(ek3Var.a().c());
            } else {
                ek3Var.m.h(f);
            }
        }
        l73 l73Var2 = this.k;
        int size2 = l73Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((gk3) l73Var2.get(i2)).j(f);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.h.h(Long.MIN_VALUE);
        u10 u10Var = this.a;
        ((d42) u10Var.a).setValue(Boolean.FALSE);
        boolean zG = g();
        d42 d42Var = this.d;
        if (!zG || !s51.n(u10Var.h(), obj) || !s51.n(d42Var.getValue(), obj2)) {
            if (!s51.n(u10Var.h(), obj) && (u10Var instanceof ps1)) {
                u10Var.m(obj);
            }
            d42Var.setValue(obj2);
            this.l.setValue(Boolean.TRUE);
            this.f.setValue(new dk3(obj, obj2));
        }
        l73 l73Var = this.k;
        int size = l73Var.size();
        for (int i = 0; i < size; i++) {
            gk3 gk3Var = (gk3) l73Var.get(i);
            gk3Var.getClass();
            if (gk3Var.g()) {
                gk3Var.k(gk3Var.a.h(), gk3Var.d.getValue());
            }
        }
        l73 l73Var2 = this.j;
        int size2 = l73Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ek3) l73Var2.get(i2)).c(0L);
        }
    }

    public final void l(long j) {
        b42 b42Var = this.h;
        if (b42Var.g() == Long.MIN_VALUE) {
            b42Var.h(j);
        }
        n(j);
        o(false);
        l73 l73Var = this.j;
        int size = l73Var.size();
        for (int i = 0; i < size; i++) {
            ((ek3) l73Var.get(i)).c(j);
        }
        l73 l73Var2 = this.k;
        int size2 = l73Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            gk3 gk3Var = (gk3) l73Var2.get(i2);
            if (!s51.n(gk3Var.d.getValue(), gk3Var.a.h())) {
                gk3Var.l(j);
            }
        }
    }

    public final void m(bt2 bt2Var) {
        l73 l73Var = this.j;
        int size = l73Var.size();
        for (int i = 0; i < size; i++) {
            ek3 ek3Var = (ek3) l73Var.get(i);
            d42 d42Var = ek3Var.o;
            if (!s51.n(ek3Var.a().c, ek3Var.a().d)) {
                ek3Var.k = ek3Var.a();
                ek3Var.j = bt2Var;
            }
            ek3Var.i.setValue(new dd3(ek3Var.s, ek3Var.f, d42Var.getValue(), d42Var.getValue(), ek3Var.p.c()));
            ek3Var.q.h(ek3Var.a().c());
            ek3Var.n = true;
        }
        l73 l73Var2 = this.k;
        int size2 = l73Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((gk3) l73Var2.get(i2)).m(bt2Var);
        }
    }

    public final void n(long j) {
        if (this.b == null) {
            this.g.h(j);
        }
    }

    public final void o(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void p() {
        dd3 dd3Var;
        l73 l73Var = this.j;
        int size = l73Var.size();
        for (int i = 0; i < size; i++) {
            ek3 ek3Var = (ek3) l73Var.get(i);
            bt2 bt2Var = ek3Var.j;
            if (bt2Var != null && (dd3Var = ek3Var.k) != null) {
                long jN = vm1.N(bt2Var.g * ((double) bt2Var.d));
                Object objB = dd3Var.b(jN);
                if (ek3Var.n) {
                    ek3Var.a().i(objB);
                }
                ek3Var.a().h(objB);
                ek3Var.q.h(ek3Var.a().c());
                if (ek3Var.m.g() == -2.0f || ek3Var.n) {
                    ek3Var.e(objB);
                } else {
                    ek3Var.c(ek3Var.t.e());
                }
                if (jN >= bt2Var.g) {
                    ek3Var.j = null;
                    ek3Var.k = null;
                } else {
                    bt2Var.c = false;
                }
            }
        }
        l73 l73Var2 = this.k;
        int size2 = l73Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((gk3) l73Var2.get(i2)).p();
        }
    }

    public final void q(Object obj) {
        d42 d42Var = this.e;
        Object value = d42Var.getValue();
        u10 u10Var = this.a;
        d42 d42Var2 = this.d;
        boolean z = value != null && obj == null && s51.n(d42Var2.getValue(), u10Var.h());
        d42Var.setValue(obj);
        if (z) {
            this.f.setValue(new dk3(value, d42Var2.getValue()));
            u10Var.m(value);
            if (this.h.g() == Long.MIN_VALUE) {
                o(true);
            }
            l73 l73Var = this.j;
            int size = l73Var.size();
            for (int i = 0; i < size; i++) {
                ((ek3) l73Var.get(i)).m.h(-2.0f);
            }
        }
    }

    public final void r(Object obj) {
        d42 d42Var = this.d;
        if (s51.n(d42Var.getValue(), obj)) {
            return;
        }
        this.f.setValue(new dk3(d42Var.getValue(), obj));
        u10 u10Var = this.a;
        if (!s51.n(u10Var.h(), d42Var.getValue())) {
            u10Var.m(d42Var.getValue());
        }
        d42Var.setValue(obj);
        if (this.h.g() == Long.MIN_VALUE) {
            o(true);
        }
        l73 l73Var = this.j;
        int size = l73Var.size();
        for (int i = 0; i < size; i++) {
            ((ek3) l73Var.get(i)).m.h(-2.0f);
        }
    }

    public final String toString() {
        l73 l73Var = this.j;
        int size = l73Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((ek3) l73Var.get(i)) + ", ";
        }
        return str;
    }
}
