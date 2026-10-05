package okhttp3.internal.platform;

import android.content.Context;
import defpackage.h21;
import defpackage.i40;
import defpackage.m62;
import defpackage.ni0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class PlatformInitializer implements h21 {
    @Override // defpackage.h21
    public final List a() {
        return ni0.f;
    }

    @Override // defpackage.h21
    public final Object b(Context context) {
        context.getClass();
        m62 m62Var = m62.a;
        Object obj = m62.a;
        i40 i40Var = obj != null ? (i40) obj : null;
        if (i40Var != null) {
            i40Var.a(context);
        }
        return m62.a;
    }
}
