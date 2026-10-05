package defpackage;

import android.os.Bundle;
import com.nvidia.devtech.NvEventQueueActivity;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class uf implements sq2 {
    public final /* synthetic */ int a;
    public final Object b;

    public uf(tq2 tq2Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        tq2Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.sq2
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((NvEventQueueActivity) obj).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                t22.I(bundleU, "classes_to_restore", qx.N0((LinkedHashSet) obj));
                return bundleU;
        }
    }

    public uf(NvEventQueueActivity nvEventQueueActivity) {
        this.a = 0;
        this.b = nvEventQueueActivity;
    }
}
