package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lq0 implements q30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.q30
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                mq0 mq0Var = (mq0) obj;
                if (mq0Var == null) {
                    mq0Var = new mq0(-3);
                }
                ((a31) this.b).B(mq0Var);
                return;
            default:
                mq0 mq0Var2 = (mq0) obj;
                synchronized (nq0.c) {
                    try {
                        w33 w33Var = nq0.d;
                        ArrayList arrayList = (ArrayList) w33Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        w33Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((q30) arrayList.get(i)).accept(mq0Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
