package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wr0 implements Parcelable {
    public static final Parcelable.Creator<wr0> CREATOR = new m3(6);
    public ArrayList f;
    public ArrayList g;
    public dl[] h;
    public int i;
    public String j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f);
        parcel.writeStringList(this.g);
        parcel.writeTypedArray(this.h, i);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeStringList(this.k);
        parcel.writeTypedList(this.l);
        parcel.writeTypedList(this.m);
    }
}
