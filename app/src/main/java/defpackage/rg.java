package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rg extends d1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ vg d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(vg vgVar, Context context) {
        super(vgVar);
        this.d = vgVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.d1
    public final IntentFilter d() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.d1
    public final int f() {
        Location location;
        boolean z;
        long j;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!ng.a((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                pi piVar = (pi) obj;
                za zaVar = (za) piVar.h;
                LocationManager locationManager = (LocationManager) piVar.g;
                if (zaVar.b > System.currentTimeMillis()) {
                    z = zaVar.a;
                } else {
                    Context context = (Context) piVar.i;
                    Location lastKnownLocation = null;
                    if (jo3.i(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (jo3.i(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (al3.e == null) {
                            al3.e = new al3();
                        }
                        al3 al3Var = al3.e;
                        al3Var.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        al3Var.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z = al3Var.b == 1;
                        long j2 = al3Var.d;
                        long j3 = al3Var.c;
                        al3Var.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j4 = al3Var.d;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        zaVar.a = z;
                        zaVar.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    break;
                }
                break;
        }
        return 1;
    }

    @Override // defpackage.d1
    public final void o() {
        int i = this.c;
        vg vgVar = this.d;
        switch (i) {
            case 0:
                vgVar.o(true, true);
                break;
            default:
                vgVar.o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(vg vgVar, pi piVar) {
        super(vgVar);
        this.d = vgVar;
        this.e = piVar;
    }
}
