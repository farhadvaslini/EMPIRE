package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class m10 extends mb3 implements ss0 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m10(Object obj, p40 p40Var, int i) {
        super(3, p40Var);
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) throws PendingIntent.CanceledException {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                new m10((mk2) obj4, (p40) obj3, 0).o(dm3Var);
                break;
            default:
                ((Number) obj2).floatValue();
                new m10((h53) obj4, (p40) obj3, 1).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) throws PendingIntent.CanceledException {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                ((mk2) obj2).f = true;
                break;
            default:
                y02.Q(obj);
                ((h53) obj2).t.a();
                break;
        }
        return dm3Var;
    }
}
