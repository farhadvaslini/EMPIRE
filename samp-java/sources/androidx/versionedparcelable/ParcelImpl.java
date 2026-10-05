package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.m3;
import defpackage.tp3;
import defpackage.up3;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new m3(10);
    public final up3 f;

    public ParcelImpl(Parcel parcel) {
        this.f = new tp3(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new tp3(parcel).i(this.f);
    }
}
