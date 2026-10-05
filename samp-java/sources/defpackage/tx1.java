package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tx1 {
    public final NotificationManager a;

    static {
        new HashSet();
    }

    public tx1(Context context) {
        this.a = (NotificationManager) context.getSystemService("notification");
    }
}
