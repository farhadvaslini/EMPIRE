package defpackage;

import android.R;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class k9 implements gn0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k9(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.gn0
    public final Object k(Object obj, p40 p40Var) {
        Object objG;
        List list;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                a31 a31Var = (a31) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    a31Var.t().startStylusHandwriting((View) a31Var.g);
                }
                return dm3Var;
            case 1:
                b80 b80Var = (b80) obj2;
                return ((b80Var.g.A() instanceof km0) || (objG = b80.g(b80Var, true, p40Var)) != y50.f) ? dm3Var : objG;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((qk2) obj2).f = obj;
                throw new d(this);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((jq1) obj2).h.h(((Number) obj).floatValue());
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                List<r32> list2 = (List) obj;
                Application application = (Application) obj2;
                Object systemService = application.getSystemService("notification");
                NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                int i2 = 0;
                if (notificationManager != null) {
                    notificationManager.cancel(2000);
                    for (int i3 = 0; i3 < 100; i3++) {
                        notificationManager.cancel(i3 + 3000);
                    }
                }
                if (!list2.isEmpty()) {
                    int i4 = 0;
                    for (r32 r32Var : list2) {
                        vg2 vg2Var = (vg2) r32Var.f;
                        mg2 mg2Var = (mg2) r32Var.g;
                        if (mg2Var instanceof ig2) {
                            i2++;
                            String str = ((ig2) mg2Var).b;
                            if (y93.q0(str)) {
                                str = vg2Var.b + ":" + vg2Var.c;
                            }
                            dh2 dh2Var = dh2.a;
                            String str2 = vg2Var.a;
                            Intent intent = new Intent("top.th1nk.samp.action.RAKSAMP_DISCONNECT");
                            intent.putExtra("instance_id", str2);
                            PendingIntent broadcast = PendingIntent.getBroadcast(application, str2.hashCode() & Integer.MAX_VALUE, intent, 201326592);
                            broadcast.getClass();
                            String str3 = vg2Var.b;
                            int i5 = vg2Var.c;
                            String str4 = vg2Var.d;
                            str3.getClass();
                            str4.getClass();
                            Object systemService2 = application.getSystemService("notification");
                            list = list2;
                            NotificationManager notificationManager2 = systemService2 instanceof NotificationManager ? (NotificationManager) systemService2 : null;
                            if (notificationManager2 != null) {
                                String str5 = str3 + ":" + i5;
                                if (y93.q0(str)) {
                                    str = str5;
                                }
                                String str6 = str4 + " @ " + str5;
                                Notification.Builder onlyAlertOnce = new Notification.Builder(application, "raksamp_instances").setContentTitle(str).setContentText(str6).setStyle(new Notification.BigTextStyle().bigText(str + "\n" + str6)).setSmallIcon(R.drawable.ic_menu_compass).setGroup("top.th1nk.samp.raksamp").setOngoing(true).setOnlyAlertOnce(true);
                                onlyAlertOnce.getClass();
                                onlyAlertOnce.addAction(new Notification.Action.Builder(Icon.createWithResource(application, R.drawable.ic_menu_close_clear_cancel), application.getString(top.th1nk.samp.R.string.notif_action_disconnect), broadcast).build());
                                notificationManager2.notify(i4 + 3000, onlyAlertOnce.build());
                            }
                        } else {
                            list = list2;
                            Object systemService3 = application.getSystemService("notification");
                            NotificationManager notificationManager3 = systemService3 instanceof NotificationManager ? (NotificationManager) systemService3 : null;
                            if (notificationManager3 != null) {
                                notificationManager3.cancel(i4 + 3000);
                            }
                        }
                        i4++;
                        list2 = list;
                    }
                    List list3 = list2;
                    if (i2 > 0) {
                        int size = list3.size();
                        Object systemService4 = application.getSystemService("notification");
                        NotificationManager notificationManager4 = systemService4 instanceof NotificationManager ? (NotificationManager) systemService4 : null;
                        if (notificationManager4 != null) {
                            String string = application.getString(top.th1nk.samp.R.string.notif_raksamp_summary, Integer.valueOf(i2), Integer.valueOf(size));
                            string.getClass();
                            Notification notificationBuild = new Notification.Builder(application, "raksamp_instances").setContentTitle(string).setContentText(string).setStyle(new Notification.BigTextStyle().bigText(string)).setSmallIcon(R.drawable.ic_menu_compass).setGroup("top.th1nk.samp.raksamp").setGroupSummary(true).setOngoing(true).setOnlyAlertOnce(true).build();
                            notificationBuild.getClass();
                            notificationManager4.notify(2000, notificationBuild);
                        }
                    }
                }
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((vi2) obj2).H.i((List) obj);
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((sm2) obj2).v.i((String) obj);
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                s41 s41Var = (s41) obj;
                a42 a42Var = (a42) obj2;
                if ((s41Var instanceof zc2) || (s41Var instanceof wo0)) {
                    a42Var.h(a42Var.g() + 1);
                } else if ((s41Var instanceof ad2) || (s41Var instanceof xo0) || (s41Var instanceof yc2)) {
                    a42Var.h(a42Var.g() - 1);
                }
                return dm3Var;
            default:
                List list4 = p03.a;
                ((os1) obj2).setValue((List) obj);
                return dm3Var;
        }
    }
}
