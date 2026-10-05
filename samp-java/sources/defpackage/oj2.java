package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class oj2 {
    public final id3 a;
    public final lj2 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final m4 i;
    public final k71 j;
    public final ij2 k;
    public final boolean l;
    public s4 m;
    public zo2 n;
    public wo2 o;
    public final mj p;

    public oj2(id3 id3Var, lj2 lj2Var, int i, int i2, int i3, int i4, boolean z, boolean z2, m4 m4Var, k71 k71Var, ij2 ij2Var, ll2 ll2Var) {
        id3Var.getClass();
        lj2Var.getClass();
        k71Var.getClass();
        this.a = id3Var;
        this.b = lj2Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = m4Var;
        this.j = k71Var;
        this.k = ij2Var;
        this.l = !s51.n(ll2Var.b, "GET");
        this.p = new mj();
    }

    public final boolean a(jj2 jj2Var) {
        zo2 zo2Var;
        wo2 wo2Var;
        if (this.p.isEmpty() && this.o == null) {
            if (jj2Var != null) {
                synchronized (jj2Var) {
                    wo2Var = null;
                    if (jj2Var.l == 0 && jj2Var.j && lv3.a(jj2Var.c.a.h, this.i.h)) {
                        wo2Var = jj2Var.c;
                    }
                }
                if (wo2Var != null) {
                    this.o = wo2Var;
                    return true;
                }
            }
            s4 s4Var = this.m;
            if ((s4Var == null || s4Var.a >= ((ArrayList) s4Var.b).size()) && (zo2Var = this.n) != null) {
                return zo2Var.a();
            }
        }
        return true;
    }

    public final yo2 b() {
        Socket socketK;
        xn2 xn2Var;
        a30 a30VarC;
        String hostAddress;
        int port;
        List<wo2> listR;
        boolean zContains;
        jj2 jj2Var = this.k.n;
        if (jj2Var == null) {
            xn2Var = null;
        } else {
            boolean zG = jj2Var.g(this.l);
            synchronized (jj2Var) {
                boolean z = jj2Var.j;
                try {
                    if (!zG) {
                        jj2Var.j = true;
                        socketK = this.k.k();
                    } else if (!z) {
                        i01 i01Var = jj2Var.c.a.h;
                        i01Var.getClass();
                        i01 i01Var2 = this.i.h;
                        socketK = !(i01Var.e == i01Var2.e && s51.n(i01Var.d, i01Var2.d)) ? this.k.k() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.n == null) {
                if (socketK != null) {
                    lv3.c(socketK);
                }
                this.k.i.getClass();
                xn2Var = null;
            } else {
                if (socketK != null) {
                    c.q("Check failed.");
                    return null;
                }
                xn2Var = new xn2(jj2Var);
            }
        }
        if (xn2Var != null) {
            return xn2Var;
        }
        xn2 xn2VarD = d(null, null);
        if (xn2VarD != null) {
            return xn2VarD;
        }
        if (!this.p.isEmpty()) {
            return (yo2) this.p.removeFirst();
        }
        wo2 wo2Var = this.o;
        if (wo2Var != null) {
            this.o = null;
            a30VarC = c(wo2Var, null);
        } else {
            s4 s4Var = this.m;
            if (s4Var == null || s4Var.a >= ((ArrayList) s4Var.b).size()) {
                zo2 zo2Var = this.n;
                if (zo2Var == null) {
                    zo2Var = new zo2(this.i, this.j, this.k, this.h);
                    this.n = zo2Var;
                }
                if (!zo2Var.a()) {
                    c.r("exhausted all routes");
                    return null;
                }
                if (!zo2Var.a()) {
                    c.n();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (zo2Var.f < zo2Var.e.size()) {
                    if (zo2Var.f >= zo2Var.e.size()) {
                        throw new SocketException("No route to " + zo2Var.a.h.d + "; exhausted proxy configurations: " + zo2Var.e);
                    }
                    List list = zo2Var.e;
                    int i = zo2Var.f;
                    zo2Var.f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        i01 i01Var3 = zo2Var.a.h;
                        hostAddress = i01Var3.d;
                        port = i01Var3.e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            qn1.n(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        m4 m4Var = zo2Var.a;
                        InetSocketAddress inetSocketAddressCreateUnresolved = InetSocketAddress.createUnresolved(hostAddress, port);
                        inetSocketAddressCreateUnresolved.getClass();
                        listR = vr.K(new wo2(m4Var, proxy, inetSocketAddressCreateUnresolved, null));
                    } else {
                        uk2 uk2Var = hv3.a;
                        hostAddress.getClass();
                        if (hv3.a.c(hostAddress)) {
                            listR = vr.K(new wo2(zo2Var.a, proxy, new InetSocketAddress(InetAddress.getByName(hostAddress), port), null));
                        } else {
                            zo2Var.c.i.getClass();
                            zo2Var.a.a.b(new wc0((zo2Var.a.h.f() || port != 80) ? port : -1, hostAddress));
                            List listA = zo2Var.a.a.a(hostAddress);
                            ArrayList arrayList2 = new ArrayList(rx.d0(listA, 10));
                            Iterator it = listA.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new wo2(zo2Var.a, proxy, new InetSocketAddress((InetAddress) it.next(), port), null));
                            }
                            if (arrayList2.isEmpty()) {
                                throw new UnknownHostException(zo2Var.a.a + " returned no addresses for " + hostAddress);
                            }
                            pj0 pj0Var = zo2Var.c.i;
                            ArrayList arrayList3 = new ArrayList(rx.d0(arrayList2, 10));
                            int size = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList2.get(i2);
                                i2++;
                                arrayList3.add(((wo2) obj).c.getAddress());
                            }
                            pj0Var.getClass();
                            ArrayList arrayList4 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj2 = arrayList2.get(i3);
                                i3++;
                                if (((wo2) obj2).d != null) {
                                    arrayList4.add(obj2);
                                }
                            }
                            boolean zIsEmpty = arrayList4.isEmpty();
                            ArrayList arrayList5 = arrayList4;
                            if (zIsEmpty) {
                                arrayList5 = arrayList2;
                            }
                            listR = arrayList5;
                            if (zo2Var.d) {
                                int size3 = arrayList5.size();
                                listR = arrayList5;
                                if (size3 >= 2) {
                                    ArrayList arrayList6 = new ArrayList();
                                    ArrayList arrayList7 = new ArrayList();
                                    int size4 = arrayList5.size();
                                    int i4 = 0;
                                    while (i4 < size4) {
                                        Object obj3 = arrayList5.get(i4);
                                        i4++;
                                        if (((wo2) obj3).c.getAddress() instanceof Inet6Address) {
                                            arrayList6.add(obj3);
                                        } else {
                                            arrayList7.add(obj3);
                                        }
                                    }
                                    listR = arrayList5;
                                    if (!arrayList6.isEmpty()) {
                                        listR = arrayList5;
                                        if (!arrayList7.isEmpty()) {
                                            byte[] bArr = jv3.a;
                                            Iterator it2 = arrayList6.iterator();
                                            Iterator it3 = arrayList7.iterator();
                                            ai1 ai1VarX = vr.x();
                                            while (true) {
                                                if (!it2.hasNext() && !it3.hasNext()) {
                                                    break;
                                                }
                                                if (it2.hasNext()) {
                                                    ai1VarX.add(it2.next());
                                                }
                                                if (it3.hasNext()) {
                                                    ai1VarX.add(it3.next());
                                                }
                                            }
                                            listR = vr.r(ai1VarX);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    for (wo2 wo2Var2 : listR) {
                        k71 k71Var = zo2Var.b;
                        synchronized (k71Var) {
                            wo2Var2.getClass();
                            zContains = ((LinkedHashSet) k71Var.g).contains(wo2Var2);
                        }
                        if (zContains) {
                            zo2Var.g.add(wo2Var2);
                        } else {
                            arrayList.add(wo2Var2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    vx.f0(arrayList, zo2Var.g);
                    zo2Var.g.clear();
                }
                s4 s4Var2 = new s4(7, arrayList);
                this.m = s4Var2;
                if (this.k.v) {
                    c.r("Canceled");
                    return null;
                }
                if (s4Var2.a >= arrayList.size()) {
                    c.n();
                    return null;
                }
                int i5 = s4Var2.a;
                s4Var2.a = i5 + 1;
                a30VarC = c((wo2) arrayList.get(i5), arrayList);
            } else {
                int i6 = s4Var.a;
                ArrayList arrayList8 = (ArrayList) s4Var.b;
                if (i6 >= arrayList8.size()) {
                    c.n();
                    return null;
                }
                int i7 = s4Var.a;
                s4Var.a = i7 + 1;
                a30VarC = c((wo2) arrayList8.get(i7), null);
            }
        }
        xn2 xn2VarD2 = d(a30VarC, a30VarC.k);
        return xn2VarD2 != null ? xn2VarD2 : a30VarC;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.a30 c(defpackage.wo2 r17, java.util.ArrayList r18) throws java.net.UnknownServiceException {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj2.c(wo2, java.util.ArrayList):a30");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x0034, B:22:0x0041, B:25:0x0048), top: B:53:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xn2 d(defpackage.a30 r11, java.util.List r12) {
        /*
            r10 = this;
            lj2 r0 = r10.b
            boolean r1 = r10.l
            m4 r2 = r10.i
            ij2 r3 = r10.k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.e()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.d
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L21:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L69
            java.lang.Object r7 = r0.next()
            jj2 r7 = (defpackage.jj2) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L41
            wz0 r9 = r7.i     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L3a
            r9 = r5
            goto L3b
        L3a:
            r9 = r4
        L3b:
            if (r9 != 0) goto L41
        L3d:
            r9 = r4
            goto L4c
        L3f:
            r10 = move-exception
            goto L67
        L41:
            boolean r9 = r7.e(r2, r12)     // Catch: java.lang.Throwable -> L3f
            if (r9 != 0) goto L48
            goto L3d
        L48:
            r3.b(r7)     // Catch: java.lang.Throwable -> L3f
            r9 = r5
        L4c:
            monitor-exit(r7)
            if (r9 == 0) goto L21
            boolean r9 = r7.g(r1)
            if (r9 == 0) goto L56
            goto L6a
        L56:
            monitor-enter(r7)
            r7.j = r5     // Catch: java.lang.Throwable -> L64
            java.net.Socket r8 = r3.k()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r7)
            if (r8 == 0) goto L21
            defpackage.lv3.c(r8)
            goto L21
        L64:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L67:
            monitor-exit(r7)
            throw r10
        L69:
            r7 = r8
        L6a:
            if (r7 != 0) goto L6d
            return r8
        L6d:
            if (r11 == 0) goto L7a
            wo2 r12 = r11.j
            r10.o = r12
            java.net.Socket r11 = r11.r
            if (r11 == 0) goto L7a
            defpackage.lv3.c(r11)
        L7a:
            ij2 r10 = r10.k
            pj0 r10 = r10.i
            r10.getClass()
            xn2 r10 = new xn2
            r10.<init>(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj2.d(a30, java.util.List):xn2");
    }
}
