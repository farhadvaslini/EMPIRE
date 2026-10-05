package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nz0 implements ak0 {
    public static final ux0 f;
    public final my1 a;
    public final zj0 b;
    public final pi c;
    public int d;
    public final vx0 e;

    static {
        ux0 ux0Var = ux0.g;
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        if (strArr.length % 2 != 0) {
            c.p("Expected alternating header names and values");
            return;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                c.p("Headers cannot be null");
                return;
            }
            strArr2[i2] = y93.G0(strArr[i2]).toString();
        }
        int iM = g12.M(0, strArr2.length - 1, 2);
        if (iM >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                d32.r(str);
                d32.s(str2, str);
                if (i == iM) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        f = new ux0(strArr2);
    }

    public nz0(my1 my1Var, zj0 zj0Var, pi piVar) {
        piVar.getClass();
        this.a = my1Var;
        this.b = zj0Var;
        this.c = piVar;
        ej2 ej2Var = (ej2) piVar.h;
        ej2Var.getClass();
        vx0 vx0Var = new vx0();
        vx0Var.b = ej2Var;
        vx0Var.a = 262144L;
        this.e = vx0Var;
    }

    @Override // defpackage.ak0
    public final void a(ll2 ll2Var) {
        ll2Var.getClass();
        Proxy.Type type = this.b.f().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(ll2Var.b);
        sb.append(' ');
        i01 i01Var = ll2Var.a;
        if (i01Var.f() || type != Proxy.Type.HTTP) {
            String strB = i01Var.b();
            String strD = i01Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(i01Var);
        }
        sb.append(" HTTP/1.1");
        j(ll2Var.c, sb.toString());
    }

    @Override // defpackage.ak0
    public final z73 b(ln2 ln2Var) {
        ll2 ll2Var = ln2Var.f;
        if (!f01.a(ln2Var)) {
            return i(ll2Var.a, 0L);
        }
        if ("chunked".equalsIgnoreCase(ln2.b(ln2Var, "Transfer-Encoding"))) {
            i01 i01Var = ll2Var.a;
            if (this.d == 4) {
                this.d = 5;
                return new kz0(this, i01Var);
            }
            qn1.d(this.d, "state: ");
            return null;
        }
        long jE = lv3.e(ln2Var);
        if (jE != -1) {
            return i(ll2Var.a, jE);
        }
        i01 i01Var2 = ll2Var.a;
        if (this.d != 4) {
            qn1.d(this.d, "state: ");
            return null;
        }
        this.d = 5;
        this.b.h();
        i01Var2.getClass();
        return new mz0(this, i01Var2);
    }

    @Override // defpackage.ak0
    public final void c() {
        ((dj2) this.c.i).flush();
    }

    @Override // defpackage.ak0
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.ak0
    public final boolean d() {
        return this.d == 6;
    }

    @Override // defpackage.ak0
    public final q73 e() {
        return this.c;
    }

    @Override // defpackage.ak0
    public final zj0 f() {
        return this.b;
    }

    @Override // defpackage.ak0
    public final long g(ln2 ln2Var) {
        if (!f01.a(ln2Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(ln2.b(ln2Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return lv3.e(ln2Var);
    }

    @Override // defpackage.ak0
    public final kn2 h() {
        vx0 vx0Var = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            qn1.d(this.d, "state: ");
            return null;
        }
        try {
            String strQ = ((rp) vx0Var.b).q(vx0Var.a);
            vx0Var.a -= (long) strQ.length();
            h9 h9VarX = b32.x(strQ);
            int i2 = h9VarX.b;
            kn2 kn2Var = new kn2();
            kn2Var.b = (de2) h9VarX.c;
            kn2Var.c = i2;
            kn2Var.d = (String) h9VarX.d;
            kn2Var.f = vx0Var.c().c();
            if (i2 == 100) {
                this.d = 3;
                return kn2Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return kn2Var;
            }
            this.d = 3;
            return kn2Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.f().a.h.g()), e);
        }
    }

    public final lz0 i(i01 i01Var, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new lz0(this, i01Var, j);
        }
        qn1.d(this.d, "state: ");
        return null;
    }

    public final void j(ux0 ux0Var, String str) {
        ux0Var.getClass();
        if (this.d != 0) {
            qn1.d(this.d, "state: ");
            return;
        }
        pi piVar = this.c;
        dj2 dj2Var = (dj2) piVar.i;
        dj2Var.w(str);
        dj2Var.w("\r\n");
        int size = ux0Var.size();
        int i = 0;
        while (true) {
            dj2 dj2Var2 = (dj2) piVar.i;
            if (i >= size) {
                dj2Var2.w("\r\n");
                this.d = 1;
                return;
            } else {
                dj2Var2.w(ux0Var.b(i));
                dj2Var2.w(": ");
                dj2Var2.w(ux0Var.e(i));
                dj2Var2.w("\r\n");
                i++;
            }
        }
    }
}
