package defpackage;

import android.app.Application;
import android.net.Uri;
import java.io.File;
import java.util.Arrays;
import top.th1nk.samp.feature.download.DownloadForegroundService;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sm2 extends vc {
    public final a31 c;
    public final qy2 d;
    public final ul2 e;
    public final vl2 f;
    public w83 g;
    public w83 h;
    public w83 i;
    public long j;
    public long k;
    public final i93 l;
    public final i93 m;
    public final i93 n;
    public final i93 o;
    public final i93 p;
    public final i93 q;
    public final i93 r;
    public final i93 s;
    public final s23 t;
    public final s23 u;
    public final i93 v;
    public final i93 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm2(Application application) {
        super(application);
        application.getClass();
        this.c = new a31(application, 28);
        this.d = new qy2(application);
        this.e = new ul2();
        this.f = new vl2();
        i93 i93VarE = s51.e(lm2.a);
        this.l = i93VarE;
        this.m = i93VarE;
        i93 i93VarE2 = s51.e(d83.a);
        this.n = i93VarE2;
        this.o = i93VarE2;
        i93 i93VarE3 = s51.e(gd0.a);
        this.p = i93VarE3;
        this.q = i93VarE3;
        i93 i93VarE4 = s51.e(zk0.a);
        this.r = i93VarE4;
        this.s = i93VarE4;
        s23 s23VarB = r51.b(7, null);
        this.t = s23VarB;
        this.u = s23VarB;
        i93 i93VarE5 = s51.e("");
        this.v = i93VarE5;
        this.w = i93VarE5;
        g();
        cl3.t(f80.F(this), null, new l80(this, null, 10), 3);
        j("https://sa-mp.th1nk.top/data/sources.json", false);
    }

    public static final String e(sm2 sm2Var, long j) {
        double d = j / 1024.0d;
        double d2 = d / 1024.0d;
        double d3 = d2 / 1024.0d;
        if (d3 >= 1.0d) {
            return String.format("%.1f GB", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1));
        }
        if (d2 >= 1.0d) {
            return String.format("%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
        }
        if (d >= 1.0d) {
            return String.format("%.0f KB", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        }
        return j + " B";
    }

    @Override // defpackage.vq3
    public final void d() {
        ij2 ij2Var = this.e.c;
        if (ij2Var != null) {
            ij2Var.d();
        }
        this.f.a = true;
        int i = DownloadForegroundService.g;
        Application application = this.b;
        application.getClass();
        pq.T(application);
    }

    public final void f() {
        w83 w83Var = this.h;
        if (w83Var != null) {
            w83Var.c(null);
        }
        this.h = null;
        ij2 ij2Var = this.e.c;
        if (ij2Var != null) {
            ij2Var.d();
        }
        i93 i93Var = this.p;
        gd0 gd0Var = gd0.a;
        i93Var.getClass();
        i93Var.j(null, gd0Var);
        int i = DownloadForegroundService.g;
        Application application = this.b;
        application.getClass();
        pq.T(application);
    }

    public final void g() {
        cl3.t(f80.F(this), null, new om2(this, null), 3);
    }

    public final void h(Uri uri) {
        uri.getClass();
        if (this.r.getValue() instanceof xk0) {
            return;
        }
        this.i = cl3.t(f80.F(this), null, new m9(this, uri, (p40) null, 11), 3);
    }

    public final void i() {
        String str;
        g83 g83Var = (g83) this.n.getValue();
        if (s51.n(g83Var, d83.a)) {
            str = "https://sa-mp.th1nk.top/data/sources.json";
        } else if (g83Var instanceof e83) {
            str = ((e83) g83Var).a;
        } else if (g83Var instanceof f83) {
            str = ((f83) g83Var).b;
        } else {
            if (!(g83Var instanceof c83)) {
                c.k();
                return;
            }
            str = ((c83) g83Var).b;
        }
        j(str, false);
    }

    public final void j(String str, boolean z) {
        String string = y93.G0(str).toString();
        if (string.length() == 0) {
            return;
        }
        w83 w83Var = this.g;
        if (w83Var != null) {
            w83Var.c(null);
        }
        this.g = cl3.t(f80.F(this), null, new rm2(this, string, z, null), 3);
    }

    public final void k(bm2 bm2Var) {
        bm2Var.getClass();
        if (this.p.getValue() instanceof ed0) {
            return;
        }
        this.h = cl3.t(f80.F(this), null, new hd1(this, bm2Var, null, 16), 3);
    }

    public final void l(File file) {
        file.getClass();
        if (this.r.getValue() instanceof xk0) {
            return;
        }
        this.i = cl3.t(f80.F(this), null, new hd1(this, file, null, 17), 3);
    }
}
