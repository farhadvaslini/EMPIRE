package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.gf1;
import defpackage.h21;
import defpackage.jq0;
import defpackage.nh0;
import defpackage.of1;
import defpackage.oh0;
import defpackage.pi;
import defpackage.qh0;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements h21 {
    @Override // defpackage.h21
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.h21
    public final Object b(Context context) {
        Object objI;
        jq0 jq0Var = new jq0(new qh0(context, 0));
        jq0Var.b = 1;
        if (nh0.k == null) {
            synchronized (nh0.j) {
                try {
                    if (nh0.k == null) {
                        nh0.k = new nh0(jq0Var);
                    }
                } finally {
                }
            }
        }
        pi piVarU = pi.u(context);
        piVarU.getClass();
        synchronized (pi.k) {
            try {
                objI = ((HashMap) piVarU.g).get(ProcessLifecycleInitializer.class);
                if (objI == null) {
                    objI = piVarU.i(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        gf1 lifecycle = ((of1) objI).getLifecycle();
        lifecycle.a(new oh0(this, lifecycle));
        return Boolean.TRUE;
    }
}
