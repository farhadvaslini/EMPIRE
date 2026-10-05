package defpackage;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class uz implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ uz(int i, int i2, Object obj, Object obj2) {
        this.f = i2;
        this.g = obj;
        this.h = i;
        this.i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Object obj = this.i;
        int i2 = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                vz vzVar = (vz) obj2;
                Object obj3 = ((p3) obj).a;
                String str = (String) vzVar.a.get(Integer.valueOf(i2));
                if (str != null) {
                    w3 w3Var = (w3) vzVar.e.get(str);
                    if ((w3Var != null ? w3Var.a : null) != null) {
                        o3 o3Var = w3Var.a;
                        if (vzVar.d.remove(str)) {
                            o3Var.a(obj3);
                        }
                    } else {
                        vzVar.g.remove(str);
                        vzVar.f.put(str, obj3);
                    }
                    break;
                }
                break;
            case 1:
                ((vz) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            default:
                ((md2) ((db0) obj2).c).g(i2, obj);
                break;
        }
    }
}
