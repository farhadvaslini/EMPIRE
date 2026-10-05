package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class d30 {
    public static final d30 e;
    public static final d30 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        ju juVar = ju.r;
        ju juVar2 = ju.s;
        ju juVar3 = ju.t;
        ju juVar4 = ju.l;
        ju juVar5 = ju.n;
        ju juVar6 = ju.m;
        ju juVar7 = ju.o;
        ju juVar8 = ju.q;
        ju juVar9 = ju.p;
        List listL = vr.L(juVar, juVar2, juVar3, juVar4, juVar5, juVar6, juVar7, juVar8, juVar9);
        List listL2 = vr.L(juVar, juVar2, juVar3, juVar4, juVar5, juVar6, juVar7, juVar8, juVar9, ju.j, ju.k, ju.h, ju.i, ju.f, ju.g, ju.e);
        c30 c30Var = new c30();
        ju[] juVarArr = (ju[]) listL.toArray(new ju[0]);
        c30Var.b((ju[]) Arrays.copyOf(juVarArr, juVarArr.length));
        ii3 ii3Var = ii3.TLS_1_3;
        ii3 ii3Var2 = ii3.TLS_1_2;
        c30Var.c(ii3Var, ii3Var2);
        c30Var.b = true;
        c30Var.a();
        c30 c30Var2 = new c30();
        ju[] juVarArr2 = (ju[]) listL2.toArray(new ju[0]);
        c30Var2.b((ju[]) Arrays.copyOf(juVarArr2, juVarArr2.length));
        c30Var2.c(ii3Var, ii3Var2);
        c30Var2.b = true;
        e = c30Var2.a();
        c30 c30Var3 = new c30();
        ju[] juVarArr3 = (ju[]) listL2.toArray(new ju[0]);
        c30Var3.b((ju[]) Arrays.copyOf(juVarArr3, juVarArr3.length));
        c30Var3.c(ii3Var, ii3Var2, ii3.TLS_1_1, ii3.TLS_1_0);
        c30Var3.b = true;
        c30Var3.a();
        f = new d30(false, false, null, null);
    }

    public d30(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = jv3.h(strArr, enabledCipherSuites, ju.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = jv3.h(enabledProtocols2, strArr2, ot1.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        up0 up0Var = ju.c;
        byte[] bArr = jv3.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (up0Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            c.p("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            c.p("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            c.p("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            c.p("At least one TLS version is required");
            return;
        }
        d30 d30Var = new d30(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (d30Var.c() != null) {
            sSLSocket.setEnabledProtocols(d30Var.d);
        }
        if (d30Var.b() != null) {
            sSLSocket.setEnabledCipherSuites(d30Var.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ju.b.f(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            ii3.g.getClass();
            arrayList.add(ak2.f(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d30)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        d30 d30Var = (d30) obj;
        boolean z = d30Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, d30Var.c) && Arrays.equals(this.d, d30Var.d) && this.b == d30Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
