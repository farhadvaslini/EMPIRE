package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k73 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public static l73 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = k73.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new l73();
        }
        z52 z52VarF = n53.g.f();
        for (int i2 = 0; i2 < i; i2++) {
            z52VarF.add(parcel.readValue(classLoader));
        }
        return new l73(z52VarF.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            default:
                return new ui3(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new l73[i];
            default:
                return new ui3[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            default:
                return new ui3(parcel, classLoader);
        }
    }
}
