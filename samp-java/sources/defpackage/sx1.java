package defpackage;

import android.app.Notification;
import android.app.Service;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sx1 {
    public final Service a;
    public CharSequence e;
    public CharSequence f;
    public int h;
    public int i;
    public boolean j;
    public Bundle k;
    public final String l;
    public final boolean m;
    public final Notification n;
    public final ArrayList o;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final boolean g = true;

    public sx1(Service service, String str) {
        Notification notification = new Notification();
        this.n = notification;
        this.a = service;
        this.l = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.o = new ArrayList();
        this.m = true;
    }

    public static CharSequence b(String str) {
        return str.length() > 5120 ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        Service service = this.a;
        String str = this.l;
        Notification.Builder builder = new Notification.Builder(service, str);
        Notification notification = this.n;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(null).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(this.h, this.i, this.j);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(null).setUsesChronometer(false).setPriority(0);
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            qn1.b();
            return null;
        }
        Bundle bundle2 = this.k;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        builder.setShowWhen(this.g);
        builder.setLocalOnly(false);
        builder.setGroup(null);
        builder.setSortKey(null);
        builder.setGroupSummary(false);
        builder.setCategory(null);
        builder.setColor(0);
        builder.setVisibility(0);
        builder.setPublicVersion(null);
        builder.setSound(notification.sound, notification.audioAttributes);
        int i = Build.VERSION.SDK_INT;
        ArrayList arrayList2 = this.o;
        ArrayList arrayList3 = this.c;
        if (i < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    qn1.b();
                    return null;
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    tj tjVar = new tj(arrayList2.size() + arrayList.size());
                    tjVar.addAll(arrayList);
                    tjVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(tjVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                builder.addPerson((String) obj);
            }
        }
        ArrayList arrayList4 = this.d;
        if (arrayList4.size() > 0) {
            if (this.k == null) {
                this.k = new Bundle();
            }
            Bundle bundle3 = this.k.getBundle("android.car.EXTENSIONS");
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            if (arrayList4.size() > 0) {
                Integer.toString(0);
                if (arrayList4.get(0) != null) {
                    qn1.b();
                    return null;
                }
                new Bundle();
                throw null;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (this.k == null) {
                this.k = new Bundle();
            }
            this.k.putBundle("android.car.EXTENSIONS", bundle3);
            bundle.putBundle("android.car.EXTENSIONS", bundle4);
        }
        builder.setExtras(this.k);
        builder.setRemoteInputHistory(null);
        builder.setBadgeIconType(0);
        builder.setSettingsText(null);
        builder.setShortcutId(null);
        builder.setTimeoutAfter(0L);
        builder.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(str)) {
            builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                qn1.b();
                return null;
            }
        }
        if (i3 >= 29) {
            gf.m(builder, this.m);
            gf.n(builder);
        }
        if (i3 >= 36) {
            q1.e(builder);
        }
        return builder.build();
    }

    public final void c(int i) {
        Notification notification = this.n;
        notification.flags = i | notification.flags;
    }
}
