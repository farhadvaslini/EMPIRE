package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class v91 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Context g;

    public /* synthetic */ v91(Context context, int i) {
        this.f = i;
        this.g = context;
    }

    @Override // defpackage.cs0
    public final Object a() {
        Activity activity;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Context baseContext = this.g;
        switch (i) {
            case 0:
                baseContext.getClass();
                Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", baseContext.getPackageName());
                intent.setFlags(268435456);
                baseContext.startActivity(intent);
                return dm3Var;
            case 1:
                return lr.v(baseContext);
            default:
                baseContext.getClass();
                while (true) {
                    if (baseContext instanceof Activity) {
                        activity = (Activity) baseContext;
                    } else if (baseContext instanceof ContextWrapper) {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        baseContext.getClass();
                    } else {
                        activity = null;
                    }
                }
                if (activity != null) {
                    activity.recreate();
                }
                return dm3Var;
        }
    }
}
