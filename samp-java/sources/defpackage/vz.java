package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vz extends z3 {
    public final /* synthetic */ xz h;

    public vz(xz xzVar) {
        this.h = xzVar;
    }

    @Override // defpackage.z3
    public final void b(int i, q3 q3Var, Object obj) {
        Bundle bundleExtra;
        int i2;
        xz xzVar = this.h;
        p3 p3VarB = q3Var.b(xzVar, obj);
        if (p3VarB != null) {
            new Handler(Looper.getMainLooper()).post(new uz(i, 0, this, p3VarB));
            return;
        }
        Intent intentA = q3Var.a(xzVar, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(xzVar.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            n92.B(xzVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
            xzVar.startActivityForResult(intentA, i, bundle);
            return;
        }
        r41 r41Var = (r41) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            r41Var.getClass();
            i2 = i;
        } catch (IntentSender.SendIntentException e) {
            e = e;
            i2 = i;
        }
        try {
            xzVar.startIntentSenderForResult(r41Var.f, i2, r41Var.g, r41Var.h, r41Var.i, 0, bundle);
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            new Handler(Looper.getMainLooper()).post(new uz(i2, 1, this, e));
        }
    }
}
