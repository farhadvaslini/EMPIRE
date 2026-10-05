package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class o13 extends dp {
    public k71 a;
    public long b = 9205357640488583168L;

    @Override // defpackage.dp
    public final void a(float f, long j, w9 w9Var) {
        k71 k71Var = this.a;
        if (k71Var == null || !h43.a(this.b, j)) {
            if (h43.c(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                k71Var = null;
            } else {
                k71Var = this.a;
                if (k71Var == null) {
                    k71Var = new k71(24, false);
                    this.a = k71Var;
                }
                k71Var.g = b(j);
                this.a = k71Var;
                this.b = j;
            }
        }
        long jC = w9Var.c();
        long j2 = wx.b;
        if (!wx.c(jC, j2)) {
            w9Var.h(j2);
        }
        if (!s51.n((Shader) w9Var.c, k71Var != null ? (Shader) k71Var.g : null)) {
            w9Var.l(k71Var != null ? (Shader) k71Var.g : null);
        }
        if (((Paint) w9Var.b).getAlpha() / 255.0f == f) {
            return;
        }
        w9Var.f(f);
    }

    public abstract Shader b(long j);
}
