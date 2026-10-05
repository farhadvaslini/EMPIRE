package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.c;
import defpackage.ef1;
import defpackage.fd2;
import defpackage.gd2;
import defpackage.h21;
import defpackage.if1;
import defpackage.jf1;
import defpackage.ni0;
import defpackage.pi;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements h21 {
    @Override // defpackage.h21
    public final List a() {
        return ni0.f;
    }

    @Override // defpackage.h21
    public final Object b(Context context) {
        context.getClass();
        pi piVarU = pi.u(context);
        piVarU.getClass();
        if (!((HashSet) piVarU.h).contains(ProcessLifecycleInitializer.class)) {
            c.q("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!jf1.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new if1());
        }
        gd2 gd2Var = gd2.n;
        gd2Var.getClass();
        gd2Var.j = new Handler();
        gd2Var.k.e(ef1.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new fd2(gd2Var));
        return gd2Var;
    }
}
