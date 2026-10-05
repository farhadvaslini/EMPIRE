package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xt1 extends vq3 {
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // defpackage.vq3
    public final void d() {
        LinkedHashMap linkedHashMap = this.b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((br3) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        ur.r(16);
        long j = ((long) iIdentityHashCode) & 4294967295L;
        if (j >= 0) {
            ur.r(16);
            strConcat = Long.toString(j, 16);
            strConcat.getClass();
        } else {
            long j2 = ((j >>> 1) / 16) << 1;
            long j3 = j - (j2 * 16);
            if (j3 >= 16) {
                j3 -= 16;
                j2++;
            }
            ur.r(16);
            String string = Long.toString(j2, 16);
            string.getClass();
            ur.r(16);
            String string2 = Long.toString(j3, 16);
            string2.getClass();
            strConcat = string.concat(string2);
        }
        sb.append(strConcat);
        sb.append("} ViewModelStores (");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
