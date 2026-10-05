package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import defpackage.oc2;
import defpackage.sp3;
import defpackage.tp3;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(sp3 sp3Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = !sp3Var.e(1) ? -1 : ((tp3) sp3Var).e.readInt();
        byte[] bArr = iconCompat.c;
        if (sp3Var.e(2)) {
            Parcel parcel = ((tp3) sp3Var).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = sp3Var.f(iconCompat.d, 3);
        int i2 = iconCompat.e;
        if (sp3Var.e(4)) {
            i2 = ((tp3) sp3Var).e.readInt();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (sp3Var.e(5)) {
            i3 = ((tp3) sp3Var).e.readInt();
        }
        iconCompat.f = i3;
        iconCompat.g = (ColorStateList) sp3Var.f(iconCompat.g, 6);
        String string = iconCompat.i;
        if (sp3Var.e(7)) {
            string = ((tp3) sp3Var).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (sp3Var.e(8)) {
            string2 = ((tp3) sp3Var).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                c.p("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
            case oc2.LONG_FIELD_NUMBER /* 4 */:
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, sp3 sp3Var) {
        sp3Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            sp3Var.h(1);
            ((tp3) sp3Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            sp3Var.h(2);
            Parcel parcel = ((tp3) sp3Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            sp3Var.h(3);
            ((tp3) sp3Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            sp3Var.h(4);
            ((tp3) sp3Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            sp3Var.h(5);
            ((tp3) sp3Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            sp3Var.h(6);
            ((tp3) sp3Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            sp3Var.h(7);
            ((tp3) sp3Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            sp3Var.h(8);
            ((tp3) sp3Var).e.writeString(str2);
        }
    }
}
