package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Collection g;

    public /* synthetic */ i0(int i, Collection collection) {
        this.f = i;
        this.g = collection;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        boolean zContains;
        int i = this.f;
        Collection<?> collection = this.g;
        switch (i) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
