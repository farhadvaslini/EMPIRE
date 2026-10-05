package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class la1 extends mb3 implements ss0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la1(String str, p40 p40Var) {
        super(3, p40Var);
        this.j = 1;
        this.k = str;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = this.j;
        int i2 = 3;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                la1 la1Var = new la1(i2, (p40) obj3, 0);
                la1Var.l = (List) obj;
                la1Var.k = (String) obj2;
                return la1Var.o(dm3Var);
            case 1:
                la1 la1Var2 = new la1((String) this.k, (p40) obj3);
                la1Var2.l = (Throwable) obj2;
                la1Var2.o(dm3Var);
                return dm3Var;
            default:
                la1 la1Var3 = new la1(i2, (p40) obj3, 2);
                la1Var3.l = (List) obj;
                la1Var3.k = (Map) obj2;
                return la1Var3.o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) throws Throwable {
        switch (this.j) {
            case 0:
                List list = (List) this.l;
                String str = (String) this.k;
                y02.Q(obj);
                for (Object obj2 : list) {
                    if (s51.n(((kq2) obj2).e, str)) {
                        return obj2;
                    }
                }
                return null;
            case 1:
                Throwable th = (Throwable) this.l;
                y02.Q(obj);
                if (th instanceof CancellationException) {
                    throw th;
                }
                ti tiVar = ui.a;
                ui.c(ti.i, "LauncherViewModel", "Configuration flow stopped: ".concat((String) this.k), th);
                return dm3.a;
            default:
                List<kq2> list2 = (List) this.l;
                Map map = (Map) this.k;
                y02.Q(obj);
                ArrayList arrayList = new ArrayList(rx.d0(list2, 10));
                for (kq2 kq2Var : list2) {
                    wy2 wy2Var = (wy2) map.get(kq2Var.e);
                    if (wy2Var == null) {
                        wy2Var = ty2.a;
                    }
                    arrayList.add(new yv2(kq2Var, wy2Var));
                }
                return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la1(int i, p40 p40Var, int i2) {
        super(i, p40Var);
        this.j = i2;
    }
}
