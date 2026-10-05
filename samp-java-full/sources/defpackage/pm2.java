package defpackage;

import android.os.SystemClock;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pm2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm2 b;
    public final /* synthetic */ File c;

    public /* synthetic */ pm2(sm2 sm2Var, File file, int i) {
        this.a = i;
        this.b = sm2Var;
        this.c = file;
    }

    public final void a(int i) {
        int i2 = this.a;
        File file = this.c;
        sm2 sm2Var = this.b;
        switch (i2) {
            case 0:
                i93 i93Var = sm2Var.r;
                wk0 wk0Var = new wk0(i);
                i93Var.getClass();
                i93Var.j(null, wk0Var);
                file.delete();
                sm2Var.g();
                break;
            default:
                i93 i93Var2 = sm2Var.r;
                wk0 wk0Var2 = new wk0(i);
                i93Var2.getClass();
                i93Var2.j(null, wk0Var2);
                file.delete();
                sm2Var.g();
                break;
        }
    }

    public final void b(String str) {
        int i = this.a;
        File file = this.c;
        sm2 sm2Var = this.b;
        switch (i) {
            case 0:
                i93 i93Var = sm2Var.r;
                yk0 yk0Var = new yk0(str);
                i93Var.getClass();
                i93Var.j(null, yk0Var);
                file.delete();
                break;
            default:
                i93 i93Var2 = sm2Var.r;
                yk0 yk0Var2 = new yk0(str, file);
                i93Var2.getClass();
                i93Var2.j(null, yk0Var2);
                break;
        }
    }

    public final void c(vk0 vk0Var) {
        int i = this.a;
        sm2 sm2Var = this.b;
        switch (i) {
            case 0:
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - sm2Var.k >= 150) {
                    sm2Var.k = jElapsedRealtime;
                    i93 i93Var = sm2Var.r;
                    xk0 xk0Var = new xk0(vk0Var);
                    i93Var.getClass();
                    i93Var.j(null, xk0Var);
                    break;
                }
                break;
            default:
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (jElapsedRealtime2 - sm2Var.k >= 150) {
                    sm2Var.k = jElapsedRealtime2;
                    i93 i93Var2 = sm2Var.r;
                    xk0 xk0Var2 = new xk0(vk0Var);
                    i93Var2.getClass();
                    i93Var2.j(null, xk0Var2);
                    break;
                }
                break;
        }
    }
}
