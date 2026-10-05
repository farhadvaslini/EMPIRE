package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qr0 implements o3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur0 b;

    public /* synthetic */ qr0(vr0 vr0Var, int i) {
        this.a = i;
        this.b = vr0Var;
    }

    @Override // defpackage.o3
    public final void a(Object obj) {
        int i = this.a;
        ur0 ur0Var = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                tr0 tr0Var = (tr0) ur0Var.x.pollFirst();
                if (tr0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = tr0Var.f;
                    ur0Var.c.r();
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                }
                break;
            case 1:
                tr0 tr0Var2 = (tr0) ur0Var.x.pollFirst();
                if (tr0Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = tr0Var2.f;
                    ur0Var.c.r();
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                }
                break;
            default:
                tr0 tr0Var3 = (tr0) ur0Var.x.pollFirst();
                if (tr0Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = tr0Var3.f;
                    ur0Var.c.r();
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                }
                break;
        }
    }
}
