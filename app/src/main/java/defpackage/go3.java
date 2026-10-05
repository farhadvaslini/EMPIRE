package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageInfo;
import java.io.File;
import java.util.Arrays;
import top.th1nk.samp.feature.update.UpdateForegroundService;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class go3 extends vc {
    public final pi c;
    public final ul2 d;
    public final i93 e;
    public final i93 f;
    public final i93 g;
    public final i93 h;
    public final i93 i;
    public final i93 j;
    public final i93 k;
    public final i93 l;
    public w83 m;
    public w83 n;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go3(Application application) {
        super(application);
        application.getClass();
        this.c = new pi(application);
        this.d = new ul2();
        i93 i93VarE = s51.e(Boolean.TRUE);
        this.e = i93VarE;
        this.f = i93VarE;
        i93 i93VarE2 = s51.e(Boolean.FALSE);
        this.g = i93VarE2;
        this.h = i93VarE2;
        i93 i93VarE3 = s51.e(ym3.a);
        this.i = i93VarE3;
        this.j = i93VarE3;
        i93 i93VarE4 = s51.e(nn3.a);
        this.k = i93VarE4;
        this.l = i93VarE4;
        p40 p40Var = null;
        cl3.t(f80.F(this), null, new do3(this, p40Var, 0), 3);
        cl3.t(f80.F(this), null, new do3(this, p40Var, 1), 3);
    }

    public static final String e(go3 go3Var, long j) {
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

    public static final String f(go3 go3Var) {
        Object qn2Var;
        Application application = go3Var.b;
        try {
            application.getClass();
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            packageInfo.getClass();
            qn2Var = packageInfo.versionName;
            if (qn2Var == null) {
                qn2Var = "";
            }
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        return (String) (qn2Var instanceof qn2 ? "" : qn2Var);
    }

    @Override // defpackage.vq3
    public final void d() {
        ij2 ij2Var = this.d.c;
        if (ij2Var != null) {
            ij2Var.d();
        }
        Application application = this.b;
        application.getClass();
        i(application);
    }

    public final void g(boolean z) {
        w83 w83Var = this.n;
        if (w83Var == null || !w83Var.b()) {
            i93 i93Var = this.k;
            pn3 pn3Var = (pn3) i93Var.getValue();
            if (s51.n(pn3Var, kn3.a) || (pn3Var instanceof mn3)) {
                i93Var.j(null, nn3.a);
            }
            this.n = cl3.t(f80.F(this), null, new eo3(z, this, null), 3);
        }
    }

    public final void h() {
        File file;
        Object value = this.k.getValue();
        p40 p40Var = null;
        on3 on3Var = value instanceof on3 ? (on3) value : null;
        if (on3Var == null || (file = on3Var.a) == null) {
            return;
        }
        cl3.t(f80.F(this), null, new ri2(this, file, p40Var, 12), 3);
    }

    public final void i(Application application) {
        if (this.o) {
            this.o = false;
            boolean z = UpdateForegroundService.f;
            application.getClass();
            application.stopService(new Intent(application, (Class<?>) UpdateForegroundService.class));
        }
    }
}
