package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ly1 {
    public long A;
    public k71 B;
    public id3 C;
    public yl1 b;
    public qn1 e;
    public boolean f;
    public boolean g;
    public f5 h;
    public boolean i;
    public boolean j;
    public f5 k;
    public xc0 l;
    public ProxySelector m;
    public f5 n;
    public SocketFactory o;
    public SSLSocketFactory p;
    public X509TrustManager q;
    public List r;
    public List s;
    public HostnameVerifier t;
    public fs u;
    public pq v;
    public int w;
    public int x;
    public int y;
    public int z;
    public pl a = new pl(3);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public ly1() {
        TimeZone timeZone = lv3.a;
        this.e = new qn1(22);
        this.f = true;
        this.g = true;
        f5 f5Var = f5.v;
        this.h = f5Var;
        this.i = true;
        this.j = true;
        this.k = f5.M;
        this.l = xc0.a;
        this.n = f5Var;
        m62 m62Var = m62.a;
        m62.a.getClass();
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.o = socketFactory;
        this.r = my1.E;
        this.s = my1.D;
        this.t = ky1.a;
        this.u = fs.c;
        this.w = 10000;
        this.x = 10000;
        this.y = 10000;
        this.z = 60000;
        this.A = 1024L;
    }

    public final void a(long j) {
        TimeUnit.SECONDS.getClass();
        this.w = lv3.b(j);
    }

    public final void b(long j) {
        TimeUnit.SECONDS.getClass();
        this.x = lv3.b(j);
    }
}
