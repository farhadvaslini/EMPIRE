package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class nl1 {
    public final int a;
    public final j21 b;
    public final h01 c;
    public int d;
    public int e;
    public int f;

    public nl1(int i) {
        this.a = i;
        if (i <= 0) {
            c.p("maxSize <= 0");
            throw null;
        }
        this.b = new j21(1);
        this.c = new h01(8);
    }

    public final Object a(Object obj) {
        synchronized (this.c) {
            j21 j21Var = this.b;
            j21Var.getClass();
            Object obj2 = j21Var.f.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ad, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            this.d++;
            j21 j21Var = this.b;
            j21Var.getClass();
            objPut = j21Var.f.put(obj, obj2);
            if (objPut != null) {
                this.d--;
            }
        }
        int i = this.a;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.f.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i || this.b.f.isEmpty()) {
                        break;
                    }
                    Set setEntrySet = this.b.f.entrySet();
                    setEntrySet.getClass();
                    Set set = setEntrySet;
                    Object next = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry == null) {
                        return objPut;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    j21 j21Var2 = this.b;
                    j21Var2.getClass();
                    key.getClass();
                    j21Var2.f.remove(key);
                    int i2 = this.d;
                    value.getClass();
                    this.d = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
