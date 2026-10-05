package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.sp3;
import defpackage.tp3;
import defpackage.up3;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(sp3 sp3Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        up3 up3VarG = remoteActionCompat.a;
        boolean z = true;
        if (sp3Var.e(1)) {
            up3VarG = sp3Var.g();
        }
        remoteActionCompat.a = (IconCompat) up3VarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (sp3Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((tp3) sp3Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (sp3Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((tp3) sp3Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) sp3Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (sp3Var.e(5)) {
            z2 = ((tp3) sp3Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!sp3Var.e(6)) {
            z = z3;
        } else if (((tp3) sp3Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, sp3 sp3Var) {
        sp3Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        sp3Var.h(1);
        sp3Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        sp3Var.h(2);
        Parcel parcel = ((tp3) sp3Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        sp3Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        sp3Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        sp3Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        sp3Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
