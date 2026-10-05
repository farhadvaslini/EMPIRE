package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.getClass()
            h01 r0 = r4.c
            monitor-enter(r0)
            int r1 = r4.d     // Catch: java.lang.Throwable -> L20
            int r1 = r1 + 1
            r4.d = r1     // Catch: java.lang.Throwable -> L20
            j21 r1 = r4.b     // Catch: java.lang.Throwable -> L20
            r1.getClass()     // Catch: java.lang.Throwable -> L20
            java.util.LinkedHashMap r1 = r1.f     // Catch: java.lang.Throwable -> L20
            java.lang.Object r5 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L23
            int r6 = r4.d     // Catch: java.lang.Throwable -> L20
            int r6 = r6 + (-1)
            r4.d = r6     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            r4 = move-exception
            goto Lb0
        L23:
            monitor-exit(r0)
            int r6 = r4.a
        L26:
            h01 r0 = r4.c
            monitor-enter(r0)
            int r1 = r4.d     // Catch: java.lang.Throwable -> L3c
            if (r1 < 0) goto La6
            j21 r1 = r4.b     // Catch: java.lang.Throwable -> L3c
            java.util.LinkedHashMap r1 = r1.f     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3f
            int r1 = r4.d     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto La6
            goto L3f
        L3c:
            r4 = move-exception
            goto Lae
        L3f:
            int r1 = r4.d     // Catch: java.lang.Throwable -> L3c
            if (r1 <= r6) goto La4
            j21 r1 = r4.b     // Catch: java.lang.Throwable -> L3c
            java.util.LinkedHashMap r1 = r1.f     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L4e
            goto La4
        L4e:
            j21 r1 = r4.b     // Catch: java.lang.Throwable -> L3c
            java.util.LinkedHashMap r1 = r1.f     // Catch: java.lang.Throwable -> L3c
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L3c
            r1.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L3c
            r3 = 0
            if (r2 == 0) goto L6f
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L69
            goto L7e
        L69:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L3c
            goto L7e
        L6f:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L7a
            goto L7e
        L7a:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L3c
        L7e:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L84
            monitor-exit(r0)
            return r5
        L84:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L3c
            j21 r3 = r4.b     // Catch: java.lang.Throwable -> L3c
            r3.getClass()     // Catch: java.lang.Throwable -> L3c
            r1.getClass()     // Catch: java.lang.Throwable -> L3c
            java.util.LinkedHashMap r3 = r3.f     // Catch: java.lang.Throwable -> L3c
            r3.remove(r1)     // Catch: java.lang.Throwable -> L3c
            int r1 = r4.d     // Catch: java.lang.Throwable -> L3c
            r2.getClass()     // Catch: java.lang.Throwable -> L3c
            int r1 = r1 + (-1)
            r4.d = r1     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            goto L26
        La4:
            monitor-exit(r0)
            return r5
        La6:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            throw r5     // Catch: java.lang.Throwable -> L3c
        Lae:
            monitor-exit(r0)
            throw r4
        Lb0:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl1.b(java.lang.Object, java.lang.Object):java.lang.Object");
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
