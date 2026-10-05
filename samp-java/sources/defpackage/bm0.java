package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bm0 implements nv2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public bm0(File file, cm0 cm0Var) {
        this.a = 0;
        file.getClass();
        this.b = file;
        this.c = cm0Var;
    }

    @Override // defpackage.nv2
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new zl0(this);
            case 1:
                return new yv0(this);
            default:
                nv2 nv2Var = (nv2) this.b;
                nv2Var.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = nv2Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                ux.e0(arrayList, (Comparator) this.c);
                return arrayList.iterator();
        }
    }

    public /* synthetic */ bm0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
