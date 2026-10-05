package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m3 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new n3(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                th thVar = new th(parcel);
                thVar.f = parcel.readByte() != 0;
                return thVar;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new dl(parcel);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new el(parcel);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new y80(parcel.readInt());
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                tr0 tr0Var = new tr0();
                tr0Var.f = parcel.readString();
                tr0Var.g = parcel.readInt();
                return tr0Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                wr0 wr0Var = new wr0();
                wr0Var.j = null;
                wr0Var.k = new ArrayList();
                wr0Var.l = new ArrayList();
                wr0Var.f = parcel.createStringArrayList();
                wr0Var.g = parcel.createStringArrayList();
                wr0Var.h = (dl[]) parcel.createTypedArray(dl.CREATOR);
                wr0Var.i = parcel.readInt();
                wr0Var.j = parcel.readString();
                wr0Var.k = parcel.createStringArrayList();
                wr0Var.l = parcel.createTypedArrayList(el.CREATOR);
                wr0Var.m = parcel.createTypedArrayList(tr0.CREATOR);
                return wr0Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return new yr0(parcel);
            case 8:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new r41((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case vr.g /* 9 */:
                nw1 nw1Var = new nw1(parcel);
                nw1Var.f = parcel.readInt();
                return nw1Var;
            case vr.h /* 10 */:
                return new ParcelImpl(parcel);
            case 11:
                return new z32(parcel.readFloat());
            case vr.i /* 12 */:
                return new a42(parcel.readInt());
            default:
                return new b42(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new n3[i];
            case 1:
                return new th[i];
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new dl[i];
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new el[i];
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new y80[i];
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new tr0[i];
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new wr0[i];
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return new yr0[i];
            case 8:
                return new r41[i];
            case vr.g /* 9 */:
                return new nw1[i];
            case vr.h /* 10 */:
                return new ParcelImpl[i];
            case 11:
                return new z32[i];
            case vr.i /* 12 */:
                return new a42[i];
            default:
                return new b42[i];
        }
    }
}
