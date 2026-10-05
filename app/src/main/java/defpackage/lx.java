package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lx {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public lx(kx kxVar) {
        this.a = 0;
        this.d = 0;
        Charset charset = c51.a;
        this.e = kxVar;
        kxVar.g = this;
    }

    public void A(int i) throws y51 {
        if ((this.b & 7) != i) {
            throw z51.b();
        }
    }

    public boolean B() {
        int i;
        kx kxVar = (kx) this.e;
        if (kxVar.c() || (i = this.b) == this.c) {
            return false;
        }
        return kxVar.C(i);
    }

    public au2 a(int i) {
        return new au2(b32.r((pg3) this.e, i), i, 1L);
    }

    public int b() {
        return this.d - this.c;
    }

    public int c() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = ((kx) this.e).z();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public int d(int i) {
        return ((q02) this.e).m[this.c + i];
    }

    public Object e(int i) {
        return ((q02) this.e).o[this.d + i];
    }

    public void f(Object obj, qr2 qr2Var, sk0 sk0Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            qr2Var.h(obj, this, sk0Var);
            if (this.b == this.c) {
            } else {
                throw new z51("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public void g(Object obj, qr2 qr2Var, sk0 sk0Var) throws z51 {
        kx kxVar = (kx) this.e;
        int iA = kxVar.A();
        if (kxVar.f >= 100) {
            throw new z51("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = kxVar.j(iA);
        kxVar.f++;
        qr2Var.h(obj, this, sk0Var);
        kxVar.a(0);
        kxVar.f--;
        kxVar.i(iJ);
    }

    public void h(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((ce2) b51Var).add(Boolean.valueOf(kxVar.k()));
                if (kxVar.c()) {
                    return;
                } else {
                    iZ = kxVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw z51.b();
        }
        int iB = kxVar.b() + kxVar.A();
        do {
            ((ce2) b51Var).add(Boolean.valueOf(kxVar.k()));
        } while (kxVar.b() < iB);
        z(iB);
    }

    public jq i() throws y51 {
        A(2);
        return ((kx) this.e).l();
    }

    public void j(b51 b51Var) throws y51 {
        int iZ;
        kx kxVar = (kx) this.e;
        if ((this.b & 7) != 2) {
            throw z51.b();
        }
        do {
            ((ce2) b51Var).add(i());
            if (kxVar.c()) {
                return;
            } else {
                iZ = kxVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public void k(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((ce2) b51Var).add(Double.valueOf(kxVar.m()));
                if (kxVar.c()) {
                    return;
                } else {
                    iZ = kxVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw z51.b();
        }
        int iA = kxVar.A();
        if ((iA & 7) != 0) {
            throw new z51("Failed to parse the message.");
        }
        int iB = kxVar.b() + iA;
        do {
            ((ce2) b51Var).add(Double.valueOf(kxVar.m()));
        } while (kxVar.b() < iB);
    }

    public void l(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((ce2) b51Var).add(Integer.valueOf(kxVar.n()));
                if (kxVar.c()) {
                    return;
                } else {
                    iZ = kxVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw z51.b();
        }
        int iB = kxVar.b() + kxVar.A();
        do {
            ((ce2) b51Var).add(Integer.valueOf(kxVar.n()));
        } while (kxVar.b() < iB);
        z(iB);
    }

    public Object m(mu3 mu3Var, Class cls, sk0 sk0Var) throws z51 {
        kx kxVar = (kx) this.e;
        switch (mu3Var.ordinal()) {
            case 0:
                A(1);
                return Double.valueOf(kxVar.m());
            case 1:
                A(5);
                return Float.valueOf(kxVar.q());
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                A(0);
                return Long.valueOf(kxVar.s());
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                A(0);
                return Long.valueOf(kxVar.B());
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                A(0);
                return Integer.valueOf(kxVar.r());
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                A(1);
                return Long.valueOf(kxVar.p());
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                A(5);
                return Integer.valueOf(kxVar.o());
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                A(0);
                return Boolean.valueOf(kxVar.k());
            case 8:
                A(2);
                return kxVar.y();
            case vr.g /* 9 */:
            default:
                c.p("unsupported field type.");
                return null;
            case vr.h /* 10 */:
                A(2);
                qr2 qr2VarA = be2.c.a(cls);
                wv0 wv0VarI = qr2VarA.i();
                g(wv0VarI, qr2VarA, sk0Var);
                qr2VarA.c(wv0VarI);
                return wv0VarI;
            case 11:
                return i();
            case vr.i /* 12 */:
                A(0);
                return Integer.valueOf(kxVar.A());
            case 13:
                A(0);
                return Integer.valueOf(kxVar.n());
            case 14:
                A(5);
                return Integer.valueOf(kxVar.t());
            case jo3.g /* 15 */:
                A(1);
                return Long.valueOf(kxVar.u());
            case 16:
                A(0);
                return Integer.valueOf(kxVar.v());
            case 17:
                A(0);
                return Long.valueOf(kxVar.w());
        }
    }

    public void n(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iA = kxVar.A();
            if ((iA & 3) != 0) {
                throw new z51("Failed to parse the message.");
            }
            int iB = kxVar.b() + iA;
            do {
                ((ce2) b51Var).add(Integer.valueOf(kxVar.o()));
            } while (kxVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw z51.b();
        }
        do {
            ((ce2) b51Var).add(Integer.valueOf(kxVar.o()));
            if (kxVar.c()) {
                return;
            } else {
                iZ = kxVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public void o(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((ce2) b51Var).add(Long.valueOf(kxVar.p()));
                if (kxVar.c()) {
                    return;
                } else {
                    iZ = kxVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw z51.b();
        }
        int iA = kxVar.A();
        if ((iA & 7) != 0) {
            throw new z51("Failed to parse the message.");
        }
        int iB = kxVar.b() + iA;
        do {
            ((ce2) b51Var).add(Long.valueOf(kxVar.p()));
        } while (kxVar.b() < iB);
    }

    public void p(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iA = kxVar.A();
            if ((iA & 3) != 0) {
                throw new z51("Failed to parse the message.");
            }
            int iB = kxVar.b() + iA;
            do {
                ((ce2) b51Var).add(Float.valueOf(kxVar.q()));
            } while (kxVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw z51.b();
        }
        do {
            ((ce2) b51Var).add(Float.valueOf(kxVar.q()));
            if (kxVar.c()) {
                return;
            } else {
                iZ = kxVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public void q(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((ce2) b51Var).add(Integer.valueOf(kxVar.r()));
                if (kxVar.c()) {
                    return;
                } else {
                    iZ = kxVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw z51.b();
        }
        int iB = kxVar.b() + kxVar.A();
        do {
            ((ce2) b51Var).add(Integer.valueOf(kxVar.r()));
        } while (kxVar.b() < iB);
        z(iB);
    }

    public void r(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((ce2) b51Var).add(Long.valueOf(kxVar.s()));
                if (kxVar.c()) {
                    return;
                } else {
                    iZ = kxVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw z51.b();
        }
        int iB = kxVar.b() + kxVar.A();
        do {
            ((ce2) b51Var).add(Long.valueOf(kxVar.s()));
        } while (kxVar.b() < iB);
        z(iB);
    }

    public void s(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iA = kxVar.A();
            if ((iA & 3) != 0) {
                throw new z51("Failed to parse the message.");
            }
            int iB = kxVar.b() + iA;
            do {
                ((ce2) b51Var).add(Integer.valueOf(kxVar.t()));
            } while (kxVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw z51.b();
        }
        do {
            ((ce2) b51Var).add(Integer.valueOf(kxVar.t()));
            if (kxVar.c()) {
                return;
            } else {
                iZ = kxVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public void t(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((ce2) b51Var).add(Long.valueOf(kxVar.u()));
                if (kxVar.c()) {
                    return;
                } else {
                    iZ = kxVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw z51.b();
        }
        int iA = kxVar.A();
        if ((iA & 7) != 0) {
            throw new z51("Failed to parse the message.");
        }
        int iB = kxVar.b() + iA;
        do {
            ((ce2) b51Var).add(Long.valueOf(kxVar.u()));
        } while (kxVar.b() < iB);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "";
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                return super.toString();
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int i = this.b;
                pg3 pg3Var = (pg3) this.e;
                sl2 sl2VarR = b32.r(pg3Var, i);
                int i2 = this.c;
                return "SelectionInfo(id=1, range=(" + i + "-" + sl2VarR + "," + i2 + "-" + b32.r(pg3Var, i2) + "), prevOffset=" + this.d + ")";
        }
    }

    public void u(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((ce2) b51Var).add(Integer.valueOf(kxVar.v()));
                if (kxVar.c()) {
                    return;
                } else {
                    iZ = kxVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw z51.b();
        }
        int iB = kxVar.b() + kxVar.A();
        do {
            ((ce2) b51Var).add(Integer.valueOf(kxVar.v()));
        } while (kxVar.b() < iB);
        z(iB);
    }

    public void v(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((ce2) b51Var).add(Long.valueOf(kxVar.w()));
                if (kxVar.c()) {
                    return;
                } else {
                    iZ = kxVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw z51.b();
        }
        int iB = kxVar.b() + kxVar.A();
        do {
            ((ce2) b51Var).add(Long.valueOf(kxVar.w()));
        } while (kxVar.b() < iB);
        z(iB);
    }

    public void w(b51 b51Var, boolean z) throws y51 {
        String strX;
        int iZ;
        kx kxVar = (kx) this.e;
        if ((this.b & 7) != 2) {
            throw z51.b();
        }
        do {
            if (z) {
                A(2);
                strX = kxVar.y();
            } else {
                A(2);
                strX = kxVar.x();
            }
            ((ce2) b51Var).add(strX);
            if (kxVar.c()) {
                return;
            } else {
                iZ = kxVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public void x(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((ce2) b51Var).add(Integer.valueOf(kxVar.A()));
                if (kxVar.c()) {
                    return;
                } else {
                    iZ = kxVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw z51.b();
        }
        int iB = kxVar.b() + kxVar.A();
        do {
            ((ce2) b51Var).add(Integer.valueOf(kxVar.A()));
        } while (kxVar.b() < iB);
        z(iB);
    }

    public void y(b51 b51Var) throws z51 {
        int iZ;
        kx kxVar = (kx) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((ce2) b51Var).add(Long.valueOf(kxVar.B()));
                if (kxVar.c()) {
                    return;
                } else {
                    iZ = kxVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw z51.b();
        }
        int iB = kxVar.b() + kxVar.A();
        do {
            ((ce2) b51Var).add(Long.valueOf(kxVar.B()));
        } while (kxVar.b() < iB);
        z(iB);
    }

    public void z(int i) throws z51 {
        if (((kx) this.e).b() != i) {
            throw z51.e();
        }
    }

    public /* synthetic */ lx() {
        this.a = 1;
    }

    public lx(q02 q02Var) {
        this.a = 2;
        this.e = q02Var;
    }

    public lx(int i, int i2, int i3, pg3 pg3Var) {
        this.a = 3;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = pg3Var;
    }
}
