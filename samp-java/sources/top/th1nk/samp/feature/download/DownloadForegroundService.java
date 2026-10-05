package top.th1nk.samp.feature.download;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import defpackage.bd0;
import defpackage.sx1;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class DownloadForegroundService extends Service {
    public static final /* synthetic */ int g = 0;
    public final bd0 f = new bd0();

    public final Notification a(int i, int i2, String str, String str2) {
        sx1 sx1Var = new sx1(this, "resource_download");
        sx1Var.n.icon = R.drawable.stat_sys_download;
        sx1Var.e = sx1.b(str);
        sx1Var.f = sx1.b(str2);
        sx1Var.c(2);
        sx1Var.c(8);
        if (i < 0 || i2 <= 0) {
            sx1Var.h = 0;
            sx1Var.i = 0;
            sx1Var.j = true;
        } else {
            sx1Var.h = i2;
            sx1Var.i = i;
            sx1Var.j = false;
        }
        Notification notificationA = sx1Var.a();
        notificationA.getClass();
        return notificationA;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        NotificationChannel notificationChannel = new NotificationChannel("resource_download", "Resource Download", 2);
        notificationChannel.setDescription("Shows download progress for game resources");
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action = intent != null ? intent.getAction() : null;
        if (action == null) {
            return 2;
        }
        int iHashCode = action.hashCode();
        if (iHashCode == -1710385896) {
            if (!action.equals("top.th1nk.samp.download.STOP")) {
                return 2;
            }
            stopForeground(1);
            stopSelf();
            return 2;
        }
        if (iHashCode == -1482368532) {
            if (!action.equals("top.th1nk.samp.download.START")) {
                return 2;
            }
            String stringExtra = intent.getStringExtra("title");
            Notification notificationA = a(-1, -1, stringExtra != null ? stringExtra : "Downloading", "Starting download…");
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(1001, notificationA, 1);
                return 2;
            }
            startForeground(1001, notificationA);
            return 2;
        }
        if (iHashCode != 1344853087 || !action.equals("top.th1nk.samp.download.UPDATE")) {
            return 2;
        }
        String stringExtra2 = intent.getStringExtra("title");
        String str = stringExtra2 != null ? stringExtra2 : "Downloading";
        String stringExtra3 = intent.getStringExtra("content");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        Notification notificationA2 = a(intent.getIntExtra("progress", -1), intent.getIntExtra("max", -1), str, stringExtra3);
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).notify(1001, notificationA2);
        return 2;
    }
}
