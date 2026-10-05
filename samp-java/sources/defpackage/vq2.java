package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vq2 {
    public final wq2 a;
    public final it1 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final ak2 c = new ak2(14);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public vq2(wq2 wq2Var, it1 it1Var) {
        this.a = wq2Var;
        this.b = it1Var;
    }

    public final void a() {
        wq2 wq2Var = this.a;
        if (((rf1) wq2Var.getLifecycle()).i != ff1.g) {
            c.q("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                c.q("SavedStateRegistry was already attached.");
                return;
            }
            this.b.a();
            wq2Var.getLifecycle().a(new x1(3, this));
            this.e = true;
        }
    }
}
