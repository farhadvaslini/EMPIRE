package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pq2 implements sq2 {
    public final tq2 a;
    public boolean b;
    public Bundle c;
    public final xb3 d;

    public pq2(tq2 tq2Var, cr3 cr3Var) {
        tq2Var.getClass();
        this.a = tq2Var;
        this.d = new xb3(new it1(13, cr3Var));
    }

    @Override // defpackage.sq2
    public final Bundle a() {
        Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleU.putAll(bundle);
        }
        for (Map.Entry entry : ((qq2) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((hr0) ((lq2) entry.getValue()).b.e).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleU.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleU;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleU.putAll(bundle);
        }
        if (bundleA != null) {
            bundleU.putAll(bundleA);
        }
        this.c = bundleU;
        this.b = true;
    }
}
