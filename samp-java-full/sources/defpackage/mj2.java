package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mj2 {
    public final ij2 a;
    public final ArrayList b;
    public final int c;
    public final yj0 d;
    public final ll2 e;
    public final int f;
    public final int g;
    public final int h;
    public final f5 i;
    public final fs j;
    public final yl1 k;
    public final f5 l;
    public final xc0 m;
    public final HostnameVerifier n;
    public final f5 o;
    public final ProxySelector p;
    public final boolean q;
    public final SocketFactory r;
    public final SSLSocketFactory s;
    public final X509TrustManager t;
    public final pq u;
    public int v;

    public mj2(ij2 ij2Var, ArrayList arrayList, int i, yj0 yj0Var, ll2 ll2Var, int i2, int i3, int i4, f5 f5Var, fs fsVar, yl1 yl1Var, f5 f5Var2, xc0 xc0Var, HostnameVerifier hostnameVerifier, f5 f5Var3, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, pq pqVar) {
        ll2Var.getClass();
        f5Var.getClass();
        fsVar.getClass();
        yl1Var.getClass();
        f5Var2.getClass();
        xc0Var.getClass();
        hostnameVerifier.getClass();
        f5Var3.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.a = ij2Var;
        this.b = arrayList;
        this.c = i;
        this.d = yj0Var;
        this.e = ll2Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = f5Var;
        this.j = fsVar;
        this.k = yl1Var;
        this.l = f5Var2;
        this.m = xc0Var;
        this.n = hostnameVerifier;
        this.o = f5Var3;
        this.p = proxySelector;
        this.q = z;
        this.r = socketFactory;
        this.s = sSLSocketFactory;
        this.t = x509TrustManager;
        this.u = pqVar;
    }

    public static mj2 a(mj2 mj2Var, int i, yj0 yj0Var, ll2 ll2Var, int i2) {
        int i3 = (i2 & 1) != 0 ? mj2Var.c : i;
        yj0 yj0Var2 = (i2 & 2) != 0 ? mj2Var.d : yj0Var;
        ll2 ll2Var2 = (i2 & 4) != 0 ? mj2Var.e : ll2Var;
        int i4 = mj2Var.f;
        int i5 = mj2Var.g;
        int i6 = mj2Var.h;
        f5 f5Var = mj2Var.i;
        fs fsVar = mj2Var.j;
        yl1 yl1Var = mj2Var.k;
        f5 f5Var2 = mj2Var.l;
        xc0 xc0Var = mj2Var.m;
        HostnameVerifier hostnameVerifier = mj2Var.n;
        f5 f5Var3 = mj2Var.o;
        ProxySelector proxySelector = mj2Var.p;
        boolean z = mj2Var.q;
        SocketFactory socketFactory = mj2Var.r;
        SSLSocketFactory sSLSocketFactory = mj2Var.s;
        X509TrustManager x509TrustManager = mj2Var.t;
        pq pqVar = mj2Var.u;
        ll2Var2.getClass();
        f5Var.getClass();
        fsVar.getClass();
        yl1Var.getClass();
        f5Var2.getClass();
        xc0Var.getClass();
        hostnameVerifier.getClass();
        f5Var3.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new mj2(mj2Var.a, mj2Var.b, i3, yj0Var2, ll2Var2, i4, i5, i6, f5Var, fsVar, yl1Var, f5Var2, xc0Var, hostnameVerifier, f5Var3, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, pqVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fb, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0211, code lost:
    
        r25 = " must call proceed() exactly once";
        r20 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028f  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r48v0, types: [mj2] */
    /* JADX WARN: Type inference failed for: r48v1 */
    /* JADX WARN: Type inference failed for: r48v2 */
    /* JADX WARN: Type inference failed for: r48v3 */
    /* JADX WARN: Type inference failed for: r48v4 */
    /* JADX WARN: Type inference failed for: r48v5 */
    /* JADX WARN: Type inference failed for: r48v6 */
    /* JADX WARN: Type inference failed for: r48v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ln2 b(ll2 ll2Var) throws Throwable {
        String str;
        yj0 yj0Var;
        ArrayList arrayList;
        IOException iOException;
        ?? r48;
        ln2 ln2VarA;
        ak0 nz0Var;
        boolean z;
        a31 a31Var;
        a31 a31Var2;
        ux0 ux0Var;
        int i;
        String str2;
        int i2;
        String strSubstring;
        ij2 ij2Var;
        List list;
        boolean z2;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        fs fsVar;
        String str3 = " must call proceed() exactly once";
        yj0 yj0Var2 = this.d;
        ll2Var.getClass();
        int i3 = this.c;
        ArrayList arrayList2 = this.b;
        ij2 ij2Var2 = null;
        if (i3 >= arrayList2.size()) {
            c.q("Check failed.");
            return null;
        }
        this.v++;
        if (yj0Var2 != null) {
            oj2 oj2VarE = ((bk0) yj0Var2.c).e();
            i01 i01Var = ll2Var.a;
            oj2VarE.getClass();
            i01Var.getClass();
            i01 i01Var2 = oj2VarE.i.h;
            if (i01Var.e != i01Var2.e || !s51.n(i01Var.d, i01Var2.d)) {
                qn1.f(arrayList2.get(i3 - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.v != 1) {
                qn1.f(arrayList2.get(i3 - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i4 = i3 + 1;
        mj2 mj2VarA = a(this, i4, null, ll2Var, 2097146);
        wq wqVar = (wq) arrayList2.get(i3);
        switch (wqVar.a) {
            case 0:
                str = " must call proceed() exactly once";
                yj0Var = yj0Var2;
                arrayList = arrayList2;
                yj0 yj0Var3 = mj2VarA.d;
                yj0Var3.getClass();
                ll2 ll2Var2 = mj2VarA.e;
                ll2Var2.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str4 = ll2Var2.b;
                str4.getClass();
                if (!str4.equals("GET")) {
                    str4.equals("HEAD");
                }
                boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(ll2Var2.c.a("Connection"));
                try {
                    try {
                        ((ij2) yj0Var3.b).i.getClass();
                        ((ak0) yj0Var3.d).a(ll2Var2);
                        ((ij2) yj0Var3.b).i.getClass();
                        try {
                            ((ij2) yj0Var3.b).i(yj0Var3, true, false, false, false, null);
                        } catch (IOException e) {
                            e = e;
                            yj0Var3 = yj0Var3;
                            if ((e instanceof b30) || !yj0Var3.a) {
                                throw e;
                            }
                            iOException = e;
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                    try {
                        ((ak0) yj0Var3.d).c();
                        iOException = null;
                        try {
                            kn2 kn2VarD = yj0Var3.d();
                            kn2VarD.getClass();
                            ((ij2) yj0Var3.b).i.getClass();
                            kn2VarD.a = ll2Var2;
                            kn2VarD.e = yj0Var3.b().f;
                            kn2VarD.l = jCurrentTimeMillis;
                            kn2VarD.m = System.currentTimeMillis();
                            ln2 ln2VarA2 = kn2VarD.a();
                            int i5 = ln2VarA2.i;
                            while (true) {
                                if (i5 != 100 && (102 > i5 || i5 >= 200)) {
                                }
                                kn2 kn2VarD2 = yj0Var3.d();
                                kn2VarD2.getClass();
                                kn2VarD2.a = ll2Var2;
                                kn2VarD2.e = yj0Var3.b().f;
                                kn2VarD2.l = jCurrentTimeMillis;
                                kn2VarD2.m = System.currentTimeMillis();
                                ln2VarA2 = kn2VarD2.a();
                                i5 = ln2VarA2.i;
                            }
                            ((ij2) yj0Var3.b).i.getClass();
                            boolean z3 = i5 == 101;
                            if (z3) {
                                if (yj0Var3.b().i != null) {
                                    throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                                }
                            }
                            boolean z4 = z3 && "upgrade".equalsIgnoreCase(ln2.b(ln2VarA2, "Connection"));
                            try {
                                if (zEqualsIgnoreCase && z4) {
                                    kn2 kn2VarC = ln2VarA2.c();
                                    this = iOException;
                                    kn2VarC.g = new km3(ln2VarA2.l.c(), ln2VarA2.l.b());
                                    kn2VarC.h = yj0Var3.f();
                                    ln2VarA = kn2VarC.a();
                                } else {
                                    this = iOException;
                                    nj2 nj2VarC = yj0Var3.c(ln2VarA2);
                                    kn2 kn2VarC2 = ln2VarA2.c();
                                    kn2VarC2.g = nj2VarC;
                                    kn2VarC2.o = new zj(5);
                                    ln2VarA = kn2VarC2.a();
                                }
                                ll2 ll2Var3 = ln2VarA.f;
                                ll2Var3.getClass();
                                if ("close".equalsIgnoreCase(ll2Var3.c.a("Connection")) || "close".equalsIgnoreCase(ln2.b(ln2VarA, "Connection"))) {
                                    ((ak0) yj0Var3.d).f().h();
                                }
                                if ((i5 == 204 || i5 == 205) && ln2VarA.l.b() > 0) {
                                    throw new ProtocolException("HTTP " + i5 + " had non-zero Content-Length: " + ln2VarA.l.b());
                                }
                            } catch (IOException e3) {
                                e = e3;
                                r48 = this;
                                if (r48 == 0) {
                                    throw e;
                                }
                                ?? r1 = r48;
                                uq.j(r1, e);
                                throw r1;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            r48 = iOException;
                        }
                    } catch (IOException e5) {
                        ((ij2) yj0Var3.b).i.getClass();
                        yj0Var3.e(e5);
                        throw e5;
                    }
                } catch (IOException e6) {
                    ((ij2) yj0Var3.b).i.getClass();
                    yj0Var3.e(e6);
                    throw e6;
                }
                break;
            case 1:
                str = " must call proceed() exactly once";
                yj0Var = yj0Var2;
                arrayList = arrayList2;
                ij2 ij2Var3 = mj2VarA.a;
                synchronized (ij2Var3) {
                    if (!ij2Var3.u) {
                        throw new IllegalStateException("released");
                    }
                    if (ij2Var3.r || ij2Var3.q || ij2Var3.t || ij2Var3.s) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                bk0 bk0Var = ij2Var3.m;
                bk0Var.getClass();
                jj2 jj2VarC = bk0Var.c();
                my1 my1Var = ij2Var3.f;
                jj2VarC.getClass();
                my1Var.getClass();
                int i6 = mj2VarA.g;
                pi piVar = jj2VarC.h;
                wz0 wz0Var = jj2VarC.i;
                if (wz0Var != null) {
                    nz0Var = new xz0(my1Var, jj2VarC, mj2VarA, wz0Var);
                } else {
                    jj2VarC.e.setSoTimeout(i6);
                    ((ej2) piVar.h).f.a().g(i6);
                    ((dj2) piVar.i).f.a().g(mj2VarA.h);
                    nz0Var = new nz0(my1Var, jj2VarC, piVar);
                }
                yj0 yj0Var4 = new yj0(ij2Var3, bk0Var, nz0Var);
                ij2Var3.p = yj0Var4;
                ij2Var3.w = yj0Var4;
                synchronized (ij2Var3) {
                    ij2Var3.q = true;
                    ij2Var3.r = true;
                }
                if (ij2Var3.v) {
                    c.r("Canceled");
                    ln2VarA = null;
                } else {
                    ln2VarA = a(mj2VarA, 0, yj0Var4, null, 2097149).b(mj2VarA.e);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                str = " must call proceed() exactly once";
                yj0Var = yj0Var2;
                arrayList = arrayList2;
                f5 f5Var = mj2VarA.l;
                ll2 ll2Var4 = mj2VarA.e;
                pl plVarA = ll2Var4.a();
                i01 i01Var3 = ll2Var4.a;
                ux0 ux0Var2 = ll2Var4.c;
                if (ux0Var2.a("Host") == null) {
                    plVarA.z("Host", lv3.i(i01Var3, false));
                }
                if (ux0Var2.a("Connection") == null) {
                    plVarA.z("Connection", "Keep-Alive");
                }
                if (ux0Var2.a("Accept-Encoding") == null && ux0Var2.a("Range") == null) {
                    plVarA.z("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                f5Var.getClass();
                i01Var3.getClass();
                if (ux0Var2.a("User-Agent") == null) {
                    plVarA.z("User-Agent", "okhttp/5.5.0");
                }
                ll2 ll2Var5 = new ll2(plVarA);
                ln2 ln2VarB = mj2VarA.b(ll2Var5);
                ux0 ux0Var3 = ln2VarB.k;
                f01.b(f5Var, ll2Var5.a, ux0Var3);
                kn2 kn2VarC3 = ln2VarB.c();
                kn2VarC3.a = ll2Var5;
                if (z && "gzip".equalsIgnoreCase(ln2.b(ln2VarB, "Content-Encoding")) && f01.a(ln2VarB)) {
                    ex0 ex0Var = new ex0(ln2VarB.l.f());
                    tx0 tx0VarC = ux0Var3.c();
                    tx0VarC.m("Content-Encoding");
                    tx0VarC.m("Content-Length");
                    kn2VarC3.f = tx0VarC.b().c();
                    kn2VarC3.g = new nj2(ln2.b(ln2VarB, "Content-Type"), -1L, new ej2(ex0Var));
                }
                ln2VarA = kn2VarC3.a();
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                yj0Var = yj0Var2;
                System.currentTimeMillis();
                ll2 ll2Var6 = mj2VarA.e;
                ll2Var6.getClass();
                a31 a31Var3 = new a31(ll2Var6, false, null, 7);
                mq mqVar = ll2Var6.e;
                if (mqVar == null) {
                    int i7 = mq.n;
                    ux0 ux0Var4 = ll2Var6.c;
                    ux0Var4.getClass();
                    int size = ux0Var4.size();
                    int i8 = 0;
                    String str5 = null;
                    boolean z5 = true;
                    boolean z6 = false;
                    boolean z7 = false;
                    int iL = -1;
                    int iL2 = -1;
                    boolean z8 = false;
                    boolean z9 = false;
                    boolean z10 = false;
                    int iL3 = -1;
                    int iL4 = -1;
                    boolean z11 = false;
                    boolean z12 = false;
                    boolean z13 = false;
                    while (i8 < size) {
                        ArrayList arrayList3 = arrayList2;
                        String strB = ux0Var4.b(i8);
                        a31 a31Var4 = a31Var3;
                        String strE = ux0Var4.e(i8);
                        int i9 = i8;
                        if (strB.equalsIgnoreCase("Cache-Control")) {
                            if (str5 == null) {
                                str5 = strE;
                            }
                            i = 0;
                            while (i < strE.length()) {
                                ux0 ux0Var5 = ux0Var4;
                                int length = strE.length();
                                int i10 = size;
                                int length2 = i;
                                while (true) {
                                    if (length2 < length) {
                                        int i11 = length;
                                        if (!y93.i0("=,;", strE.charAt(length2))) {
                                            length2++;
                                            length = i11;
                                        }
                                    } else {
                                        length2 = strE.length();
                                    }
                                }
                                String string = y93.G0(strE.substring(i, length2)).toString();
                                if (length2 == strE.length() || strE.charAt(length2) == ',' || strE.charAt(length2) == ';') {
                                    str2 = str3;
                                    i2 = length2 + 1;
                                    strSubstring = null;
                                } else {
                                    int length3 = length2 + 1;
                                    byte[] bArr = jv3.a;
                                    int length4 = strE.length();
                                    while (true) {
                                        if (length3 < length4) {
                                            char cCharAt = strE.charAt(length3);
                                            int i12 = length4;
                                            if (cCharAt == ' ' || cCharAt == '\t') {
                                                length3++;
                                                length4 = i12;
                                            }
                                        } else {
                                            length3 = strE.length();
                                        }
                                    }
                                    if (length3 >= strE.length() || strE.charAt(length3) != '\"') {
                                        int length5 = strE.length();
                                        str2 = str3;
                                        int length6 = length3;
                                        while (true) {
                                            if (length6 < length5) {
                                                int i13 = length5;
                                                if (!y93.i0(",;", strE.charAt(length6))) {
                                                    length6++;
                                                    length5 = i13;
                                                }
                                            } else {
                                                length6 = strE.length();
                                            }
                                        }
                                        String string2 = y93.G0(strE.substring(length3, length6)).toString();
                                        i2 = length6;
                                        strSubstring = string2;
                                    } else {
                                        int i14 = length3 + 1;
                                        int iN0 = y93.n0(strE, '\"', i14, 4);
                                        strSubstring = strE.substring(i14, iN0);
                                        str2 = str3;
                                        i2 = iN0 + 1;
                                    }
                                }
                                if ("no-cache".equalsIgnoreCase(string)) {
                                    i = i2;
                                    ux0Var4 = ux0Var5;
                                    size = i10;
                                    str3 = str2;
                                    z6 = true;
                                } else if ("no-store".equalsIgnoreCase(string)) {
                                    i = i2;
                                    ux0Var4 = ux0Var5;
                                    size = i10;
                                    str3 = str2;
                                    z7 = true;
                                } else {
                                    if ("max-age".equalsIgnoreCase(string)) {
                                        iL = jv3.l(-1, strSubstring);
                                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                                        iL2 = jv3.l(-1, strSubstring);
                                    } else if ("private".equalsIgnoreCase(string)) {
                                        i = i2;
                                        ux0Var4 = ux0Var5;
                                        size = i10;
                                        str3 = str2;
                                        z8 = true;
                                    } else if ("public".equalsIgnoreCase(string)) {
                                        i = i2;
                                        ux0Var4 = ux0Var5;
                                        size = i10;
                                        str3 = str2;
                                        z9 = true;
                                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                        i = i2;
                                        ux0Var4 = ux0Var5;
                                        size = i10;
                                        str3 = str2;
                                        z10 = true;
                                    } else if ("max-stale".equalsIgnoreCase(string)) {
                                        iL3 = jv3.l(Integer.MAX_VALUE, strSubstring);
                                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                                        iL4 = jv3.l(-1, strSubstring);
                                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                        i = i2;
                                        ux0Var4 = ux0Var5;
                                        size = i10;
                                        str3 = str2;
                                        z11 = true;
                                    } else if ("no-transform".equalsIgnoreCase(string)) {
                                        i = i2;
                                        ux0Var4 = ux0Var5;
                                        size = i10;
                                        str3 = str2;
                                        z12 = true;
                                    } else if ("immutable".equalsIgnoreCase(string)) {
                                        i = i2;
                                        ux0Var4 = ux0Var5;
                                        size = i10;
                                        str3 = str2;
                                        z13 = true;
                                    }
                                    i = i2;
                                    ux0Var4 = ux0Var5;
                                    size = i10;
                                    str3 = str2;
                                }
                            }
                            i8 = i9 + 1;
                            arrayList2 = arrayList3;
                            a31Var3 = a31Var4;
                            ux0Var4 = ux0Var4;
                            size = size;
                            str3 = str3;
                        } else if (!strB.equalsIgnoreCase("Pragma")) {
                            i8 = i9 + 1;
                            arrayList2 = arrayList3;
                            a31Var3 = a31Var4;
                            ux0Var4 = ux0Var4;
                            size = size;
                            str3 = str3;
                        }
                        z5 = false;
                        i = 0;
                        while (i < strE.length()) {
                        }
                        i8 = i9 + 1;
                        arrayList2 = arrayList3;
                        a31Var3 = a31Var4;
                        ux0Var4 = ux0Var4;
                        size = size;
                        str3 = str3;
                    }
                    str = str3;
                    arrayList = arrayList2;
                    a31Var = a31Var3;
                    mqVar = new mq(z6, z7, iL, iL2, z8, z9, z10, iL3, iL4, z11, z12, z13, !z5 ? null : str5);
                    ll2Var6.e = mqVar;
                } else {
                    str = " must call proceed() exactly once";
                    arrayList = arrayList2;
                    a31Var = a31Var3;
                }
                if (mqVar.j) {
                    Object obj = null;
                    a31Var2 = new a31(obj, false, obj, 7);
                } else {
                    a31Var2 = a31Var;
                }
                ll2 ll2Var7 = (ll2) a31Var2.g;
                ln2 ln2Var = (ln2) a31Var2.h;
                if (ll2Var7 == null && ln2Var == null) {
                    mn2 mn2Var = nn2.f;
                    ak2 ak2Var = uj3.e;
                    ArrayList arrayList4 = new ArrayList(20);
                    ll2 ll2Var8 = mj2VarA.e;
                    ll2Var8.getClass();
                    ln2 ln2Var2 = new ln2(ll2Var8, de2.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new ux0((String[]) arrayList4.toArray(new String[0])), mn2Var, null, null, null, null, -1L, System.currentTimeMillis(), null, ak2Var);
                    mj2VarA.a.i.getClass();
                    ln2VarA = ln2Var2;
                } else if (ll2Var7 == null) {
                    ln2Var.getClass();
                    kn2 kn2VarC4 = ln2Var.c();
                    ln2 ln2VarY = d32.y(ln2Var);
                    kn2.b(ln2VarY, "cacheResponse");
                    kn2VarC4.j = ln2VarY;
                    ln2VarA = kn2VarC4.a();
                    mj2VarA.a.i.getClass();
                } else {
                    if (ln2Var != null) {
                        mj2VarA.a.i.getClass();
                    }
                    ln2 ln2VarB2 = mj2VarA.b(ll2Var7);
                    if (ln2Var != null) {
                        if (ln2VarB2.i == 304) {
                            kn2 kn2VarC5 = ln2Var.c();
                            ux0 ux0Var6 = ln2Var.k;
                            ux0 ux0Var7 = ln2VarB2.k;
                            ArrayList arrayList5 = new ArrayList(20);
                            int size2 = ux0Var6.size();
                            int i15 = 0;
                            while (i15 < size2) {
                                String strB2 = ux0Var6.b(i15);
                                String strE2 = ux0Var6.e(i15);
                                if ("Warning".equalsIgnoreCase(strB2)) {
                                    ux0Var = ux0Var6;
                                    if (fa3.e0(strE2, "1", false)) {
                                    }
                                    i15++;
                                    ux0Var6 = ux0Var;
                                } else {
                                    ux0Var = ux0Var6;
                                }
                                if ("Content-Length".equalsIgnoreCase(strB2) || "Content-Encoding".equalsIgnoreCase(strB2) || "Content-Type".equalsIgnoreCase(strB2) || !pq.F(strB2) || ux0Var7.a(strB2) == null) {
                                    arrayList5.add(strB2);
                                    arrayList5.add(y93.G0(strE2).toString());
                                }
                                i15++;
                                ux0Var6 = ux0Var;
                            }
                            int size3 = ux0Var7.size();
                            for (int i16 = 0; i16 < size3; i16++) {
                                String strB3 = ux0Var7.b(i16);
                                if (!"Content-Length".equalsIgnoreCase(strB3) && !"Content-Encoding".equalsIgnoreCase(strB3) && !"Content-Type".equalsIgnoreCase(strB3) && pq.F(strB3)) {
                                    String strE3 = ux0Var7.e(i16);
                                    arrayList5.add(strB3);
                                    arrayList5.add(y93.G0(strE3).toString());
                                }
                            }
                            kn2VarC5.f = new ux0((String[]) arrayList5.toArray(new String[0])).c();
                            kn2VarC5.l = ln2VarB2.q;
                            kn2VarC5.m = ln2VarB2.r;
                            ln2 ln2VarY2 = d32.y(ln2Var);
                            kn2.b(ln2VarY2, "cacheResponse");
                            kn2VarC5.j = ln2VarY2;
                            ln2 ln2VarY3 = d32.y(ln2VarB2);
                            kn2.b(ln2VarY3, "networkResponse");
                            kn2VarC5.i = ln2VarY3;
                            kn2VarC5.a();
                            ln2VarB2.l.close();
                            throw null;
                        }
                        jv3.a(ln2Var.l);
                    }
                    kn2 kn2VarC6 = ln2VarB2.c();
                    ln2 ln2VarY4 = ln2Var != null ? d32.y(ln2Var) : null;
                    kn2.b(ln2VarY4, "cacheResponse");
                    kn2VarC6.j = ln2VarY4;
                    ln2 ln2VarY5 = d32.y(ln2VarB2);
                    kn2.b(ln2VarY5, "networkResponse");
                    kn2VarC6.i = ln2VarY5;
                    ln2VarA = kn2VarC6.a();
                }
                break;
            default:
                ll2 ll2Var9 = mj2VarA.e;
                ij2 ij2Var4 = mj2VarA.a;
                ln2 ln2Var3 = null;
                List listE0 = ni0.f;
                int i17 = 0;
                ll2 ll2VarA = ll2Var9;
                boolean z14 = true;
                while (true) {
                    ll2VarA.getClass();
                    if (ij2Var4.p == null) {
                        synchronized (ij2Var4) {
                            try {
                            } catch (Throwable th) {
                                th = th;
                                ij2Var2 = ij2Var4;
                            }
                            try {
                                if (ij2Var4.r) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (ij2Var4.q || ij2Var4.t || ij2Var4.s) {
                                    break;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                            break;
                        }
                        if (z14) {
                            my1 my1Var2 = ij2Var4.f;
                            id3 id3Var = my1Var2.B;
                            lj2 lj2Var = (lj2) mj2VarA.k.g;
                            int i18 = mj2VarA.g;
                            int i19 = mj2VarA.h;
                            int i20 = mj2VarA.f;
                            boolean z15 = mj2VarA.q;
                            boolean z16 = my1Var2.f;
                            i01 i01Var4 = ll2VarA.a;
                            i01Var4.getClass();
                            yj0Var = yj0Var2;
                            if (i01Var4.f()) {
                                SSLSocketFactory sSLSocketFactory2 = mj2VarA.s;
                                HostnameVerifier hostnameVerifier2 = mj2VarA.n;
                                fsVar = mj2VarA.j;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                fsVar = null;
                            }
                            String str6 = i01Var4.d;
                            int i21 = i01Var4.e;
                            xc0 xc0Var = mj2VarA.m;
                            SocketFactory socketFactory = mj2VarA.r;
                            f5 f5Var2 = mj2VarA.o;
                            my1 my1Var3 = mj2VarA.a.f;
                            ij2 ij2Var5 = ij2Var4;
                            ll2 ll2Var10 = ll2VarA;
                            list = listE0;
                            oj2 oj2Var = new oj2(id3Var, lj2Var, i18, i19, i20, i18, z15, z16, new m4(str6, i21, xc0Var, socketFactory, sSLSocketFactory, hostnameVerifier, fsVar, f5Var2, my1Var3.r, my1Var3.q, mj2VarA.p), ij2Var4.f.A, ij2Var5, ll2Var10);
                            ij2Var = ij2Var5;
                            ll2VarA = ll2Var10;
                            my1 my1Var4 = ij2Var.f;
                            ij2Var.m = my1Var4.f ? new il0(oj2Var, my1Var4.B) : new k71(14, oj2Var);
                        } else {
                            yj0Var = yj0Var2;
                            ij2Var = ij2Var4;
                            list = listE0;
                        }
                        try {
                            if (ij2Var.v) {
                                throw new IOException("Canceled");
                            }
                            try {
                                kn2 kn2VarC7 = mj2VarA.b(ll2VarA).c();
                                kn2VarC7.a = ll2VarA;
                                kn2VarC7.k = ln2Var3 != null ? d32.y(ln2Var3) : null;
                                ln2VarA = kn2VarC7.a();
                                ll2VarA = wq.a(ln2VarA, ij2Var.p, mj2VarA);
                            } catch (IOException e7) {
                                boolean zB = wq.b(e7, ij2Var, mj2VarA, ll2VarA);
                                ij2Var.i.getClass();
                                if (!zB) {
                                    byte[] bArr2 = jv3.a;
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        uq.j(e7, (Exception) it.next());
                                    }
                                    throw e7;
                                }
                                listE0 = qx.E0(list, e7);
                                ij2Var.g(true);
                                ij2Var4 = ij2Var;
                                yj0Var2 = yj0Var;
                                z14 = false;
                                ij2Var2 = null;
                            }
                            if (ll2VarA == null) {
                                try {
                                    ij2Var.i.getClass();
                                    ij2Var.g(false);
                                } catch (Throwable th3) {
                                    th = th3;
                                    z2 = false;
                                }
                            } else {
                                jv3.a(ln2VarA.l);
                                int i22 = i17 + 1;
                                pj0 pj0Var = ij2Var.i;
                                if (i22 > 20) {
                                    pj0Var.getClass();
                                    throw new ProtocolException("Too many follow-up requests: " + i22);
                                }
                                pj0Var.getClass();
                                ij2Var.g(true);
                                ln2Var3 = ln2VarA;
                                listE0 = list;
                                ij2Var4 = ij2Var;
                                i17 = i22;
                                yj0Var2 = yj0Var;
                                z14 = true;
                                ij2Var2 = null;
                            }
                            break;
                        } catch (Throwable th4) {
                            th = th4;
                            z2 = true;
                        }
                        ij2Var.g(z2);
                        throw th;
                    }
                    yj0Var = yj0Var2;
                    c.q("Check failed.");
                    ln2VarA = null;
                    break;
                }
                break;
        }
        if (ln2VarA == null) {
            throw new NullPointerException("interceptor " + wqVar + " returned null");
        }
        if (yj0Var == null || i4 >= arrayList.size() || mj2VarA.v == 1) {
            return ln2VarA;
        }
        qn1.f(wqVar, str, "network interceptor ");
        return null;
    }
}
