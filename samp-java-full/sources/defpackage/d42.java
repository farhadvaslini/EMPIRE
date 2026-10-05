package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class d42 extends o93 implements Parcelable, f73 {
    public static final Parcelable.Creator<d42> CREATOR = new c42(0);
    public final h73 g;
    public g73 h;

    public d42(Object obj, h73 h73Var) {
        this.g = h73Var;
        t63 t63VarJ = a73.j();
        g73 g73Var = new g73(t63VarJ.g(), obj);
        if (!(t63VarJ instanceof hw0)) {
            g73Var.b = new g73(1L, obj);
        }
        this.h = g73Var;
    }

    @Override // defpackage.n93
    public final p93 a() {
        return this.h;
    }

    @Override // defpackage.n93
    public final p93 b(p93 p93Var, p93 p93Var2, p93 p93Var3) {
        if (this.g.d(((g73) p93Var2).c, ((g73) p93Var3).c)) {
            return p93Var2;
        }
        return null;
    }

    @Override // defpackage.n93
    public final void c(p93 p93Var) {
        p93Var.getClass();
        this.h = (g73) p93Var;
    }

    @Override // defpackage.f73
    public final h73 d() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.e93
    public final Object getValue() {
        return ((g73) a73.t(this.h, this)).c;
    }

    @Override // defpackage.os1
    public final void setValue(Object obj) {
        t63 t63VarJ;
        g73 g73Var = (g73) a73.h(this.h);
        if (this.g.d(g73Var.c, obj)) {
            return;
        }
        g73 g73Var2 = this.h;
        synchronized (a73.c) {
            t63VarJ = a73.j();
            ((g73) a73.o(g73Var2, this, t63VarJ, g73Var)).c = obj;
        }
        a73.n(t63VarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((g73) a73.h(this.h)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        f5 f5Var = f5.f0;
        h73 h73Var = this.g;
        if (s51.n(h73Var, f5Var)) {
            i2 = 0;
        } else if (s51.n(h73Var, m22.u)) {
            i2 = 1;
        } else {
            if (!s51.n(h73Var, m22.k)) {
                c.q("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
