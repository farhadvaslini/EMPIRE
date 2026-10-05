package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cc0 {
    public final DisplayCutout a;

    public cc0(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final h31 a() {
        return Build.VERSION.SDK_INT >= 30 ? h31.c(o1.c(this.a)) : h31.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cc0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((cc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
