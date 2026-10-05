package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class c42 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ c42(int i) {
        this.a = i;
    }

    public static d42 a(Parcel parcel, ClassLoader classLoader) {
        h73 h73Var;
        if (classLoader == null) {
            classLoader = c42.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            h73Var = f5.f0;
        } else if (i == 1) {
            h73Var = m22.u;
        } else {
            if (i != 2) {
                c.q(by1.h("Unsupported MutableState policy ", " was restored", i));
                return null;
            }
            h73Var = m22.k;
        }
        return new d42(value, h73Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            default:
                if (parcel.readParcelable(null) == null) {
                    return g.g;
                }
                c.q("superState must be null");
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new d42[i];
            default:
                return new g[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            default:
                if (parcel.readParcelable(classLoader) == null) {
                    return g.g;
                }
                c.q("superState must be null");
                return null;
        }
    }
}
