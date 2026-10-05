package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final a30 c(wo2 wo2Var, ArrayList arrayList) throws UnknownServiceException {
        ll2 ll2Var;
        de2 de2Var = de2.H2_PRIOR_KNOWLEDGE;
        wo2Var.getClass();
        m4 m4Var = wo2Var.a;
        if (m4Var.c == null) {
            if (!m4Var.j.contains(d30.f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = wo2Var.a.h.d;
            m62 m62Var = m62.a;
            if (!m62.a.i(str)) {
                throw new UnknownServiceException(nc2.i("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (m4Var.i.contains(de2Var)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (wo2Var.b.type() != Proxy.Type.HTTP) {
            ll2Var = null;
        } else {
            m4 m4Var2 = wo2Var.a;
            if (m4Var2.c != null || m4Var2.i.contains(de2Var)) {
                pl plVar = new pl(7);
                i01 i01Var = wo2Var.a.h;
                i01Var.getClass();
                plVar.g = i01Var;
                plVar.A("CONNECT");
                m4 m4Var3 = wo2Var.a;
                plVar.z("Host", lv3.i(m4Var3.h, true));
                plVar.z("Proxy-Connection", "Keep-Alive");
                plVar.z("User-Agent", "okhttp/5.5.0");
                ll2 ll2Var2 = new ll2(plVar);
                mn2 mn2Var = nn2.f;
                ArrayList arrayList2 = new ArrayList(20);
                d32.r("Proxy-Authenticate");
                d32.s("OkHttp-Preemptive", "Proxy-Authenticate");
                int i = 0;
                while (i < arrayList2.size()) {
                    if ("Proxy-Authenticate".equalsIgnoreCase((String) arrayList2.get(i))) {
                        arrayList2.remove(i);
                        arrayList2.remove(i);
                        i -= 2;
                    }
                    i += 2;
                }
                arrayList2.add("Proxy-Authenticate");
                arrayList2.add(y93.G0("OkHttp-Preemptive").toString());
                new ux0((String[]) arrayList2.toArray(new String[0]));
                mn2Var.getClass();
                m4Var3.f.getClass();
                ll2Var = ll2Var2;
            }
        }
        return new a30(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, wo2Var, arrayList, ll2Var, -1, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x0034, B:22:0x0041, B:25:0x0048), top: B:53:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xn2 d(a30 a30Var, List list) {
        jj2 jj2Var;
        boolean z;
        Socket socketK;
        lj2 lj2Var = this.b;
        boolean z2 = this.l;
        m4 m4Var = this.i;
        ij2 ij2Var = this.k;
        boolean z3 = a30Var != null && a30Var.e();
        lj2Var.getClass();
        Iterator it = lj2Var.d.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                jj2Var = null;
                break;
            }
            jj2Var = (jj2) it.next();
            jj2Var.getClass();
            synchronized (jj2Var) {
                if (z3) {
                    try {
                        if (!(jj2Var.i != null)) {
                            z = false;
                        } else if (jj2Var.e(m4Var, list)) {
                            ij2Var.b(jj2Var);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                if (jj2Var.g(z2)) {
                    break;
                }
                synchronized (jj2Var) {
                    jj2Var.j = true;
                    socketK = ij2Var.k();
                }
                if (socketK != null) {
                    lv3.c(socketK);
                }
            }
        }
        if (jj2Var == null) {
            return null;
        }
        if (a30Var != null) {
            this.o = a30Var.j;
            Socket socket = a30Var.r;
            if (socket != null) {
                lv3.c(socket);
            }
        }
        this.k.i.getClass();
        return new xn2(jj2Var);
    }
}
