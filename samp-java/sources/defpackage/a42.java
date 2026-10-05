package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class a42 extends o93 implements Parcelable, f73, e93, os1 {
    public static final Parcelable.Creator<a42> CREATOR = new m3(12);
    public d73 g;

    public a42(int i) {
        t63 t63VarJ = a73.j();
        d73 d73Var = new d73(i, t63VarJ.g());
        if (!(t63VarJ instanceof hw0)) {
            d73Var.b = new d73(i, 1L);
        }
        this.g = d73Var;
    }

    @Override // defpackage.n93
    public final p93 a() {
        return this.g;
    }

    @Override // defpackage.n93
    public final p93 b(p93 p93Var, p93 p93Var2, p93 p93Var3) {
        if (((d73) p93Var2).c == ((d73) p93Var3).c) {
            return p93Var2;
        }
        return null;
    }

    @Override // defpackage.n93
    public final void c(p93 p93Var) {
        p93Var.getClass();
        this.g = (d73) p93Var;
    }

    @Override // defpackage.f73
    public final h73 d() {
        return m22.u;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((d73) a73.t(this.g, this)).c;
    }

    @Override // defpackage.e93
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        t63 t63VarJ;
        d73 d73Var = (d73) a73.h(this.g);
        if (d73Var.c != i) {
            d73 d73Var2 = this.g;
            synchronized (a73.c) {
                t63VarJ = a73.j();
                ((d73) a73.o(d73Var2, this, t63VarJ, d73Var)).c = i;
            }
            a73.n(t63VarJ, this);
        }
    }

    @Override // defpackage.os1
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return nc2.g(((d73) a73.h(this.g)).c, hashCode(), "MutableIntState(value=", ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
