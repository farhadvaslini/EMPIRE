package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class th2 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        vg2 vg2Var;
        context.getClass();
        intent.getClass();
        String stringExtra = intent.getStringExtra("instance_id");
        if (stringExtra == null || (vg2Var = (vg2) ((Map) dh2.b.getValue()).get(stringExtra)) == null) {
            return;
        }
        vg2Var.g.h();
    }
}
