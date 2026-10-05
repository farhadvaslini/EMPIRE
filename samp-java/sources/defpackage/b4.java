package defpackage;

import android.net.Uri;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class b4 implements o3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.o3
    public void a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ns0) ((os1) obj2).getValue()).h(obj);
                break;
            default:
                GameActivity.cleoScriptPicker$lambda$0((GameActivity) obj2, (Uri) obj);
                break;
        }
    }

    public void b() {
        rs0 rs0Var = (rs0) this.b;
        synchronized (a73.c) {
            a73.h = qx.C0(a73.h, rs0Var);
        }
    }
}
