package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xm extends yx {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public xm(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            m6.g();
            porterDuffColorFilter = m6.c(vp.T(j), r51.B(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(vp.T(j), r51.D(i));
        }
        super(porterDuffColorFilter);
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm)) {
            return false;
        }
        xm xmVar = (xm) obj;
        return wx.c(this.b, xmVar.b) && this.c == xmVar.c;
    }

    public final int hashCode() {
        int i = wx.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return by1.i("BlendModeColorFilter(color=", wx.i(this.b), ", blendMode=", w7.b0(this.c), ")");
    }
}
