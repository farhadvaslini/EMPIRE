package top.th1nk.samp.feature.update;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import defpackage.sx1;
import defpackage.ti;
import defpackage.ui;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class UpdateForegroundService extends Service {
    public static volatile boolean f;

    public final Notification a(int i, int i2, String str, String str2) {
        sx1 sx1Var = new sx1(this, "update_download");
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
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            NotificationChannel notificationChannel = new NotificationChannel("update_download", getString(top.th1nk.samp.R.string.update_notification_channel_name), 2);
            notificationChannel.setDescription(getString(top.th1nk.samp.R.string.update_notification_channel_desc));
            Object systemService = getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        } catch (RuntimeException e) {
            ti tiVar = ui.a;
            ui.c(ti.i, "UpdateService", "Unable to create update notification channel", e);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        f = false;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ti tiVar = ti.i;
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1947092627) {
                if (iHashCode != -176691970) {
                    if (iHashCode == 1322664311 && action.equals("top.th1nk.samp.update.STOP")) {
                        f = false;
                        stopForeground(1);
                        stopSelf();
                        return 2;
                    }
                } else if (action.equals("top.th1nk.samp.update.UPDATE")) {
                    if (!f) {
                        stopSelf(i2);
                        return 2;
                    }
                    try {
                        String stringExtra = intent.getStringExtra("content");
                        if (stringExtra == null) {
                            stringExtra = "";
                        }
                        int intExtra = intent.getIntExtra("progress", -1);
                        int intExtra2 = intent.getIntExtra("max", -1);
                        String string = getString(top.th1nk.samp.R.string.update_notification_title);
                        string.getClass();
                        Notification notificationA = a(intExtra, intExtra2, string, stringExtra);
                        Object systemService = getSystemService("notification");
                        systemService.getClass();
                        ((NotificationManager) systemService).notify(1002, notificationA);
                        return 2;
                    } catch (RuntimeException e) {
                        ti tiVar2 = ui.a;
                        ui.c(tiVar, "UpdateService", "Unable to update download notification", e);
                        f = false;
                        stopForeground(1);
                        stopSelf(i2);
                    }
                }
            } else if (action.equals("top.th1nk.samp.update.START")) {
                try {
                    String string2 = getString(top.th1nk.samp.R.string.update_notification_title);
                    string2.getClass();
                    String string3 = getString(top.th1nk.samp.R.string.update_notification_starting);
                    string3.getClass();
                    Notification notificationA2 = a(-1, -1, string2, string3);
                    if (Build.VERSION.SDK_INT >= 34) {
                        startForeground(1002, notificationA2, 1);
                    } else {
                        startForeground(1002, notificationA2);
                    }
                    f = true;
                    return 2;
                } catch (RuntimeException e2) {
                    ti tiVar3 = ui.a;
                    ui.c(tiVar, "UpdateService", "Unable to promote update service to foreground", e2);
                    f = false;
                    stopSelf(i2);
                }
            }
        }
        return 2;
    }
}
