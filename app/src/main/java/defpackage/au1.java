package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class au1 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Bundle g;

    public /* synthetic */ au1(int i, Bundle bundle) {
        this.f = i;
        this.g = bundle;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        boolean zContainsKey;
        int i = this.f;
        Bundle bundle = this.g;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                zContainsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                zContainsKey = bundle.containsKey(str);
                break;
        }
        return Boolean.valueOf(!zContainsKey);
    }
}
