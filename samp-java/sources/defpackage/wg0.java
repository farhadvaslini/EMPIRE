package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wg0 extends View {
    public final /* synthetic */ vg0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(vg0 vg0Var, Context context) {
        super(context);
        this.f = vg0Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.f.run();
    }
}
