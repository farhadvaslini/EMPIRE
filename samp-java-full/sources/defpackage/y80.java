package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class y80 implements Parcelable {
    public static final Parcelable.Creator<y80> CREATOR = new m3(4);
    public final int f;

    public y80(int i) {
        this.f = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y80) && this.f == ((y80) obj).f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f);
    }

    public final String toString() {
        return by1.h("DefaultLazyKey(index=", ")", this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
    }
}
