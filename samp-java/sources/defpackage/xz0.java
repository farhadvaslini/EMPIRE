package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xz0 implements ak0 {
    public static final List g = lv3.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = lv3.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final jj2 a;
    public final mj2 b;
    public final wz0 c;
    public volatile d01 d;
    public final de2 e;
    public volatile boolean f;

    public xz0(my1 my1Var, jj2 jj2Var, mj2 mj2Var, wz0 wz0Var) {
        my1Var.getClass();
        wz0Var.getClass();
        this.a = jj2Var;
        this.b = mj2Var;
        this.c = wz0Var;
        List list = my1Var.r;
        de2 de2Var = de2.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(de2Var) ? de2Var : de2.HTTP_2;
    }

    @Override // defpackage.ak0
    public final void a(ll2 ll2Var) throws IOException {
        int i;
        d01 d01Var;
        ll2Var.getClass();
        if (this.d != null) {
            return;
        }
        ux0 ux0Var = ll2Var.c;
        ArrayList arrayList = new ArrayList(ux0Var.size() + 4);
        arrayList.add(new sx0(sx0.f, ll2Var.b));
        kq kqVar = sx0.g;
        i01 i01Var = ll2Var.a;
        i01Var.getClass();
        String strB = i01Var.b();
        String strD = i01Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new sx0(kqVar, strB));
        String strA = ux0Var.a("Host");
        if (strA != null) {
            arrayList.add(new sx0(sx0.i, strA));
        }
        arrayList.add(new sx0(sx0.h, i01Var.a));
        int size = ux0Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strB2 = ux0Var.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strB2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && ux0Var.e(i2).equals("trailers"))) {
                arrayList.add(new sx0(lowerCase, ux0Var.e(i2)));
            }
        }
        wz0 wz0Var = this.c;
        wz0Var.getClass();
        synchronized (wz0Var.B) {
            synchronized (wz0Var) {
                try {
                    if (wz0Var.j > 1073741823) {
                        wz0Var.h(nj0.l);
                    }
                    if (wz0Var.k) {
                        throw new b30();
                    }
                    i = wz0Var.j;
                    wz0Var.j = i + 2;
                    d01Var = new d01(i, wz0Var, true, false, null);
                    if (d01Var.i()) {
                        wz0Var.g.put(Integer.valueOf(i), d01Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            wz0Var.B.i(true, i, arrayList);
        }
        wz0Var.B.flush();
        this.d = d01Var;
        boolean z = this.f;
        d01 d01Var2 = this.d;
        if (z) {
            d01Var2.getClass();
            d01Var2.f(nj0.m);
            c.r("Canceled");
        } else {
            d01Var2.getClass();
            d01Var2.o.g(this.b.g);
            d01 d01Var3 = this.d;
            d01Var3.getClass();
            d01Var3.p.g(this.b.h);
        }
    }

    @Override // defpackage.ak0
    public final z73 b(ln2 ln2Var) {
        d01 d01Var = this.d;
        d01Var.getClass();
        return d01Var.m;
    }

    @Override // defpackage.ak0
    public final void c() {
        d01 d01Var = this.d;
        d01Var.getClass();
        d01Var.n.close();
    }

    @Override // defpackage.ak0
    public final void cancel() {
        this.f = true;
        d01 d01Var = this.d;
        if (d01Var != null) {
            d01Var.f(nj0.m);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r4 = this;
            d01 r4 = r4.d
            r0 = 0
            if (r4 == 0) goto L20
            monitor-enter(r4)
            b01 r1 = r4.m     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.g     // Catch: java.lang.Throwable -> L17
            r3 = 1
            if (r2 == 0) goto L19
            hp r1 = r1.i     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L17:
            r0 = move-exception
            goto L1e
        L19:
            r1 = r0
        L1a:
            monitor-exit(r4)
            if (r1 != r3) goto L20
            return r3
        L1e:
            monitor-exit(r4)
            throw r0
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz0.d():boolean");
    }

    @Override // defpackage.ak0
    public final q73 e() {
        d01 d01Var = this.d;
        d01Var.getClass();
        return d01Var;
    }

    @Override // defpackage.ak0
    public final zj0 f() {
        return this.a;
    }

    @Override // defpackage.ak0
    public final long g(ln2 ln2Var) {
        if (f01.a(ln2Var)) {
            return lv3.e(ln2Var);
        }
        return 0L;
    }

    @Override // defpackage.ak0
    public final kn2 h() throws IOException {
        ux0 ux0Var;
        d01 d01Var = this.d;
        h9 h9VarX = null;
        if (d01Var == null) {
            c.r("stream wasn't created");
            return null;
        }
        synchronized (d01Var) {
            while (true) {
                if (!d01Var.k.isEmpty() || d01Var.g() != null) {
                    break;
                }
                d01Var.g.getClass();
                a01 a01Var = d01Var.n;
                boolean z = a01Var.h || a01Var.f;
                if (z) {
                    d01Var.o.h();
                }
                try {
                    try {
                        d01Var.wait();
                        if (z) {
                            d01Var.o.l();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z) {
                        d01Var.o.l();
                    }
                    throw th;
                }
            }
            if (d01Var.k.isEmpty()) {
                IOException iOException = d01Var.r;
                if (iOException != null) {
                    throw iOException;
                }
                nj0 nj0VarG = d01Var.g();
                nj0VarG.getClass();
                throw new v93(nj0VarG);
            }
            Object objRemoveFirst = d01Var.k.removeFirst();
            objRemoveFirst.getClass();
            ux0Var = (ux0) objRemoveFirst;
        }
        de2 de2Var = this.e;
        de2Var.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = ux0Var.size();
        for (int i = 0; i < size; i++) {
            String strB = ux0Var.b(i);
            String strE = ux0Var.e(i);
            if (strB.equals(":status")) {
                h9VarX = b32.x("HTTP/1.1 ".concat(strE));
            } else if (!h.contains(strB)) {
                arrayList.add(strB);
                arrayList.add(y93.G0(strE).toString());
            }
        }
        if (h9VarX == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        kn2 kn2Var = new kn2();
        kn2Var.b = de2Var;
        kn2Var.c = h9VarX.b;
        kn2Var.d = (String) h9VarX.d;
        kn2Var.f = new ux0((String[]) arrayList.toArray(new String[0])).c();
        return kn2Var;
    }
}
