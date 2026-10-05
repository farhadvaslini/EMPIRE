package defpackage;

import android.graphics.RenderEffect;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cn extends u10 {
    public final u10 b;
    public final float c;
    public final float d;
    public final int e;

    public cn(u10 u10Var, float f, float f2, int i) {
        this.b = u10Var;
        this.c = f;
        this.d = f2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn)) {
            return false;
        }
        cn cnVar = (cn) obj;
        return this.c == cnVar.c && this.d == cnVar.d && this.e == cnVar.e && s51.n(this.b, cnVar.b);
    }

    @Override // defpackage.u10
    public final RenderEffect f() {
        float f = this.c;
        float f2 = this.d;
        if (f == 0.0f && f2 == 0.0f) {
            return RenderEffect.createOffsetEffect(0.0f, 0.0f);
        }
        u10 u10Var = this.b;
        int i = this.e;
        return u10Var == null ? RenderEffect.createBlurEffect(f, f2, r51.C(i)) : RenderEffect.createBlurEffect(f, f2, u10Var.c(), r51.C(i));
    }

    public final int hashCode() {
        u10 u10Var = this.b;
        return Integer.hashCode(this.e) + nc2.a(nc2.a((u10Var != null ? u10Var.hashCode() : 0) * 31, this.c, 31), this.d, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=" + this.b + ", radiusX=" + this.c + ", radiusY=" + this.d + ", edgeTreatment=" + jo3.x(this.e) + ")";
    }
}
