package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class es1 {
    public final LinkedHashMap a;
    public final yl1 b;

    public es1(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new yl1(z);
    }

    public final Map a() {
        r32 r32Var;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iX = om1.X(rx.d0(setEntrySet, 10));
        if (iX < 16) {
            iX = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iX);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                r32Var = new r32(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                r32Var = new r32(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(r32Var.f, r32Var.g);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.g).get()) {
            c.q("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(ec2 ec2Var) {
        ec2Var.getClass();
        Object obj = this.a.get(ec2Var);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d(ec2 ec2Var, Object obj) {
        ec2Var.getClass();
        e(ec2Var, obj);
    }

    public final void e(ec2 ec2Var, Object obj) {
        ec2Var.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(ec2Var);
        } else if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(qx.R0((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(ec2Var, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(ec2Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(ec2Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj instanceof es1) {
            LinkedHashMap linkedHashMap = ((es1) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                boolean zN = value instanceof byte[] ? (obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2) : s51.n(value, obj2);
                                if (!zN) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return qx.x0(this.a.entrySet(), ",\n", "{\n", "\n}", new fi1(11), 24);
    }

    public /* synthetic */ es1(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
