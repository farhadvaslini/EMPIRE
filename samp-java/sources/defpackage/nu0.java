package defpackage;

import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nu0 extends mb3 implements rs0 {
    public iv2 j;
    public String k;
    public String l;
    public GameActivity m;
    public int n;
    public int o;
    public long p;
    public long q;
    public int r;
    public final /* synthetic */ GameActivity s;
    public final /* synthetic */ long t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;
    public final /* synthetic */ long w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu0(GameActivity gameActivity, long j, int i, String str, long j2, String str2, int i2, p40 p40Var) {
        super(2, p40Var);
        this.s = gameActivity;
        this.t = j;
        this.u = i;
        this.v = str;
        this.w = j2;
        this.x = str2;
        this.y = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((nu0) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new nu0(this.s, this.t, this.u, this.v, this.w, this.x, this.y, p40Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0291, code lost:
    
        r30 = r6;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0295, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0298, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x029d, code lost:
    
        if (r16 <= 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02a2, code lost:
    
        if (r16 != r11) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02b0, code lost:
    
        if (r0.getValue() != (4294967295L & r9)) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02b2, code lost:
    
        r0 = r33.toPath();
        r2 = r30.toPath();
        r3 = new java.nio.file.CopyOption[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02c1, code lost:
    
        r3[0] = java.nio.file.StandardCopyOption.REPLACE_EXISTING;
        java.nio.file.Files.move(r0, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c6, code lost:
    
        r27.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02c9, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02d4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02de, code lost:
    
        throw new java.lang.IllegalArgumentException(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02e6, code lost:
    
        throw new java.lang.IllegalArgumentException(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ee, code lost:
    
        throw new java.lang.IllegalArgumentException(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02ef, code lost:
    
        r0 = th;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.o(java.lang.Object):java.lang.Object");
    }
}
