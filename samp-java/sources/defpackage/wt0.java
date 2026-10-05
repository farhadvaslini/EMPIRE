package defpackage;

import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class wt0 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ wt0(int i, int i2, Object obj) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        int i2 = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                return Boolean.valueOf(GameActivity.J(i2, (GameActivity) obj));
            case 1:
                return Integer.valueOf(((pg3) ((lx) obj).e).b.d(i2));
            default:
                ((ns0) obj).h(Integer.valueOf(i2));
                return dm3.a;
        }
    }
}
