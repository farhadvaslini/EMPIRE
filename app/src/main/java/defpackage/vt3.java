package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vt3 {
    public final tn a;
    public final float b;

    public vt3(Rect rect, float f) {
        this.a = new tn(rect);
        this.b = f;
    }

    public final Rect a() {
        tn tnVar = this.a;
        tnVar.getClass();
        return new Rect(tnVar.a, tnVar.b, tnVar.c, tnVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vt3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        vt3 vt3Var = (vt3) obj;
        return s51.n(this.a, vt3Var.a) && this.b == vt3Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public vt3(tn tnVar, float f) {
        this.a = tnVar;
        this.b = f;
    }
}
