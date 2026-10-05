package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dl implements Parcelable {
    public static final Parcelable.Creator<dl> CREATOR = new m3(2);
    public final int[] f;
    public final ArrayList g;
    public final int[] h;
    public final int[] i;
    public final int j;
    public final String k;
    public final int l;
    public final int m;
    public final CharSequence n;
    public final int o;
    public final CharSequence p;
    public final ArrayList q;
    public final ArrayList r;
    public final boolean s;

    public dl(cl clVar) {
        int size = clVar.a.size();
        this.f = new int[size * 6];
        if (!clVar.g) {
            c.q("Not on back stack");
            throw null;
        }
        this.g = new ArrayList(size);
        this.h = new int[size];
        this.i = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zr0 zr0Var = (zr0) clVar.a.get(i2);
            this.f[i] = zr0Var.a;
            this.g.add(null);
            int[] iArr = this.f;
            iArr[i + 1] = zr0Var.b ? 1 : 0;
            iArr[i + 2] = zr0Var.c;
            iArr[i + 3] = zr0Var.d;
            int i3 = i + 5;
            iArr[i + 4] = zr0Var.e;
            i += 6;
            iArr[i3] = zr0Var.f;
            this.h[i2] = zr0Var.g.ordinal();
            this.i[i2] = zr0Var.h.ordinal();
        }
        this.j = clVar.f;
        this.k = clVar.h;
        this.l = clVar.q;
        this.m = clVar.i;
        this.n = clVar.j;
        this.o = clVar.k;
        this.p = clVar.l;
        this.q = clVar.m;
        this.r = clVar.n;
        this.s = clVar.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f);
        parcel.writeStringList(this.g);
        parcel.writeIntArray(this.h);
        parcel.writeIntArray(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        TextUtils.writeToParcel(this.n, parcel, 0);
        parcel.writeInt(this.o);
        TextUtils.writeToParcel(this.p, parcel, 0);
        parcel.writeStringList(this.q);
        parcel.writeStringList(this.r);
        parcel.writeInt(this.s ? 1 : 0);
    }

    public dl(Parcel parcel) {
        this.f = parcel.createIntArray();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createIntArray();
        this.i = parcel.createIntArray();
        this.j = parcel.readInt();
        this.k = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.n = (CharSequence) creator.createFromParcel(parcel);
        this.o = parcel.readInt();
        this.p = (CharSequence) creator.createFromParcel(parcel);
        this.q = parcel.createStringArrayList();
        this.r = parcel.createStringArrayList();
        this.s = parcel.readInt() != 0;
    }
}
