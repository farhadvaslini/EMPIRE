package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class x8 {
    public final Context a;
    public final ua0 b;
    public final long c;
    public final x12 d;

    public x8(Context context, ua0 ua0Var, long j, x12 x12Var) {
        this.a = context;
        this.b = ua0Var;
        this.c = j;
        this.d = x12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        x8 x8Var = (x8) obj;
        return s51.n(this.a, x8Var.a) && s51.n(this.b, x8Var.b) && wx.c(this.c, x8Var.c) && s51.n(this.d, x8Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = wx.h;
        return this.d.hashCode() + nc2.c(this.c, iHashCode, 31);
    }
}
