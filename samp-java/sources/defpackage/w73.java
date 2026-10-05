package defpackage;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class w73 extends dp {
    public final long a;

    public w73(long j) {
        this.a = j;
    }

    @Override // defpackage.dp
    public final void a(float f, long j, w9 w9Var) {
        w9Var.f(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = wx.b(wx.d(jB) * f, jB);
        }
        w9Var.h(jB);
        if (((Shader) w9Var.c) != null) {
            w9Var.l(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w73) {
            return wx.c(this.a, ((w73) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = wx.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nc2.i("SolidColor(value=", wx.i(this.a), ")");
    }
}
