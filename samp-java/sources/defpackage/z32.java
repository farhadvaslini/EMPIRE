package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class z32 extends o93 implements Parcelable, f73, e93, os1 {
    public static final Parcelable.Creator<z32> CREATOR = new m3(11);
    public c73 g;

    public z32(float f) {
        t63 t63VarJ = a73.j();
        c73 c73Var = new c73(f, t63VarJ.g());
        if (!(t63VarJ instanceof hw0)) {
            c73Var.b = new c73(f, 1L);
        }
        this.g = c73Var;
    }

    @Override // defpackage.n93
    public final p93 a() {
        return this.g;
    }

    @Override // defpackage.n93
    public final p93 b(p93 p93Var, p93 p93Var2, p93 p93Var3) {
        if (((c73) p93Var2).c == ((c73) p93Var3).c) {
            return p93Var2;
        }
        return null;
    }

    @Override // defpackage.n93
    public final void c(p93 p93Var) {
        p93Var.getClass();
        this.g = (c73) p93Var;
    }

    @Override // defpackage.f73
    public final h73 d() {
        return m22.u;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((c73) a73.t(this.g, this)).c;
    }

    @Override // defpackage.e93
    public final Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f) {
        t63 t63VarJ;
        c73 c73Var = (c73) a73.h(this.g);
        if (c73Var.c == f) {
            return;
        }
        c73 c73Var2 = this.g;
        synchronized (a73.c) {
            t63VarJ = a73.j();
            ((c73) a73.o(c73Var2, this, t63VarJ, c73Var)).c = f;
        }
        a73.n(t63VarJ, this);
    }

    @Override // defpackage.os1
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((c73) a73.h(this.g)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
