package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class uq2 {
    public final vq2 a;
    public final tq2 b;

    public uq2(vq2 vq2Var) {
        this.a = vq2Var;
        this.b = new tq2(vq2Var);
    }

    public final void a(Bundle bundle) {
        vq2 vq2Var = this.a;
        wq2 wq2Var = vq2Var.a;
        if (!vq2Var.e) {
            vq2Var.a();
        }
        if (((rf1) wq2Var.getLifecycle()).i.compareTo(ff1.i) >= 0) {
            qn1.g(((rf1) wq2Var.getLifecycle()).i, "performRestore cannot be called when owner is ");
            return;
        }
        if (vq2Var.g) {
            c.q("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                jo3.q("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        vq2Var.f = bundle2;
        vq2Var.g = true;
    }

    public final void b(Bundle bundle) {
        vq2 vq2Var = this.a;
        Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
        Bundle bundle2 = vq2Var.f;
        if (bundle2 != null) {
            bundleU.putAll(bundle2);
        }
        synchronized (vq2Var.c) {
            for (Map.Entry entry : vq2Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((sq2) entry.getValue()).a();
                str.getClass();
                bundleU.putBundle(str, bundleA);
            }
        }
        if (bundleU.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleU);
    }
}
