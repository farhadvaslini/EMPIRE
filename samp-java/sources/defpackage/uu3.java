package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class uu3 {
    public static final uu3 a = new uu3();

    public final long a(Paint paint) {
        int i = wx.h;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(r51.B(i));
    }

    public final void c(Paint paint, long j) {
        paint.setColor(s51.I(j));
    }
}
