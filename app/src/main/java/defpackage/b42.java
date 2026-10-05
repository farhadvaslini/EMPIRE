package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class b42 extends o93 implements Parcelable, f73, e93, os1 {
    public static final Parcelable.Creator<b42> CREATOR = new m3(13);
    public e73 g;

    public b42(long j) {
        t63 t63VarJ = a73.j();
        e73 e73Var = new e73(t63VarJ.g(), j);
        if (!(t63VarJ instanceof hw0)) {
            e73Var.b = new e73(1L, j);
        }
        this.g = e73Var;
    }

    @Override // defpackage.n93
    public final p93 a() {
        return this.g;
    }

    @Override // defpackage.n93
    public final p93 b(p93 p93Var, p93 p93Var2, p93 p93Var3) {
        if (((e73) p93Var2).c == ((e73) p93Var3).c) {
            return p93Var2;
        }
        return null;
    }

    @Override // defpackage.n93
    public final void c(p93 p93Var) {
        p93Var.getClass();
        this.g = (e73) p93Var;
    }

    @Override // defpackage.f73
    public final h73 d() {
        return m22.u;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return ((e73) a73.t(this.g, this)).c;
    }

    @Override // defpackage.e93
    public final Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j) {
        t63 t63VarJ;
        e73 e73Var = (e73) a73.h(this.g);
        if (e73Var.c != j) {
            e73 e73Var2 = this.g;
            synchronized (a73.c) {
                t63VarJ = a73.j();
                ((e73) a73.o(e73Var2, this, t63VarJ, e73Var)).c = j;
            }
            a73.n(t63VarJ, this);
        }
    }

    @Override // defpackage.os1
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((e73) a73.h(this.g)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(g());
    }
}
