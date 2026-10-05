package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends pn2 implements rs0 {
    public gb2 h;
    public rb3 i;
    public rs0 j;
    public rb3 k;
    public pk2 l;
    public long m;
    public long n;
    public long o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ns0 r;
    public final /* synthetic */ rs0 s;
    public final /* synthetic */ cs0 t;
    public final /* synthetic */ ns0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(ns0 ns0Var, rs0 rs0Var, cs0 cs0Var, ns0 ns0Var2, p40 p40Var) {
        super(p40Var);
        this.r = ns0Var;
        this.s = rs0Var;
        this.t = cs0Var;
        this.u = ns0Var2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((eh1) m((p40) obj2, (rb3) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        eh1 eh1Var = new eh1(this.r, this.s, this.t, this.u, p40Var);
        eh1Var.q = obj;
        return eh1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r4 == r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r2 == r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0144, code lost:
    
        if (defpackage.gy1.b(r3.g, r3.c) == false) goto L60;
     */
    /* JADX WARN: Path cross not found for [B:58:0x013c, B:46:0x0118], limit reached: 74 */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0183  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d0 -> B:34:0x00d3). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Object objA;
        gb2 gb2Var;
        Object objB;
        rs0 rs0Var;
        long j;
        Object obj2;
        long j2;
        long j3;
        long j4;
        rb3 rb3Var;
        pk2 pk2Var;
        Object objC;
        gb2 gb2Var2;
        rb3 rb3Var2;
        rb3 rb3Var3;
        y50 y50Var;
        Object obj3;
        Object obj4;
        rb3 rb3Var4 = (rb3) this.q;
        int i = this.p;
        int i2 = 3;
        int i3 = 0;
        gb2 gb2Var3 = null;
        y50 y50Var2 = y50.f;
        if (i == 0) {
            y02.Q(obj);
            this.q = rb3Var4;
            this.p = 1;
            objA = cd3.a(rb3Var4, false, ab2.f, this);
            if (objA != y50Var2) {
            }
            return y50Var2;
        }
        if (i != 1) {
            if (i == 2) {
                gb2Var = this.h;
                y02.Q(obj);
                objB = obj;
                this.r.h((gb2) objB);
                gy1 gy1Var = new gy1(0L);
                rs0Var = this.s;
                rs0Var.f(gb2Var, gy1Var);
                j = gb2Var.a;
                List list = rb3Var4.k.y.a;
                int size = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i4);
                    if (d32.l(((gb2) obj2).a, j)) {
                        break;
                    }
                    i4++;
                }
                gb2 gb2Var4 = (gb2) obj2;
                if (gb2Var4 != null && gb2Var4.d) {
                    j2 = j;
                    pk2 pk2Var2 = new pk2();
                    pk2Var2.f = j;
                    rb3Var = rb3Var4;
                    pk2Var = pk2Var2;
                    j3 = j2;
                    j4 = j;
                    this.q = gb2Var3;
                    this.h = gb2Var3;
                    this.i = rb3Var4;
                    this.j = rs0Var;
                    this.k = rb3Var;
                    this.l = pk2Var;
                    this.m = j3;
                    this.n = j4;
                    this.o = j;
                    this.p = i2;
                    objC = rb3Var.c(ab2.g, this);
                }
                gb2Var2 = null;
                if (gb2Var2 != null) {
                }
                return dm3.a;
            }
            if (i != 3) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = this.o;
            long j6 = this.n;
            long j7 = this.m;
            pk2Var = this.l;
            rb3Var = this.k;
            rs0 rs0Var2 = this.j;
            rb3 rb3Var5 = this.i;
            y02.Q(obj);
            objC = obj;
            rb3Var4 = rb3Var5;
            j3 = j7;
            rs0Var = rs0Var2;
            j = j5;
            j4 = j6;
            za2 za2Var = (za2) objC;
            List list2 = za2Var.a;
            int size2 = list2.size();
            while (true) {
                if (i3 >= size2) {
                    rb3Var2 = rb3Var4;
                    rb3Var3 = rb3Var;
                    y50Var = y50Var2;
                    obj3 = null;
                    break;
                }
                obj3 = list2.get(i3);
                rb3Var2 = rb3Var4;
                int i5 = i3;
                rb3Var3 = rb3Var;
                int i6 = size2;
                y50Var = y50Var2;
                if (d32.l(((gb2) obj3).a, pk2Var.f)) {
                    break;
                }
                i3 = i5 + 1;
                y50Var2 = y50Var;
                rb3Var = rb3Var3;
                size2 = i6;
                rb3Var4 = rb3Var2;
            }
            gb2 gb2Var5 = (gb2) obj3;
            if (gb2Var5 == null) {
                gb2Var5 = null;
            } else if (w22.n(gb2Var5)) {
                List list3 = za2Var.a;
                int size3 = list3.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size3) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list3.get(i7);
                    if (((gb2) obj4).d) {
                        break;
                    }
                    i7++;
                }
                gb2 gb2Var6 = (gb2) obj4;
                if (gb2Var6 != null) {
                    pk2Var.f = gb2Var6.a;
                    y50Var2 = y50Var;
                    i3 = 0;
                    rb3Var = rb3Var3;
                    i2 = 3;
                    gb2Var3 = null;
                    rb3Var4 = rb3Var2;
                    this.q = gb2Var3;
                    this.h = gb2Var3;
                    this.i = rb3Var4;
                    this.j = rs0Var;
                    this.k = rb3Var;
                    this.l = pk2Var;
                    this.m = j3;
                    this.n = j4;
                    this.o = j;
                    this.p = i2;
                    objC = rb3Var.c(ab2.g, this);
                }
            }
            if (gb2Var5 == null || gb2Var5.c()) {
                gb2Var2 = null;
            } else if (w22.n(gb2Var5)) {
                gb2Var2 = gb2Var5;
            } else {
                rs0Var.f(gb2Var5, new gy1(w22.D(gb2Var5, false)));
                j = gb2Var5.a;
                y50Var2 = y50Var;
                i3 = 0;
                j2 = j3;
                i2 = 3;
                gb2Var3 = null;
                rb3Var4 = rb3Var2;
                pk2 pk2Var22 = new pk2();
                pk2Var22.f = j;
                rb3Var = rb3Var4;
                pk2Var = pk2Var22;
                j3 = j2;
                j4 = j;
                this.q = gb2Var3;
                this.h = gb2Var3;
                this.i = rb3Var4;
                this.j = rs0Var;
                this.k = rb3Var;
                this.l = pk2Var;
                this.m = j3;
                this.n = j4;
                this.o = j;
                this.p = i2;
                objC = rb3Var.c(ab2.g, this);
            }
            if (gb2Var2 != null) {
                this.t.a();
            } else {
                this.u.h(gb2Var2);
            }
            return dm3.a;
        }
        y02.Q(obj);
        objA = obj;
        gb2Var = (gb2) objA;
        this.q = rb3Var4;
        this.h = gb2Var;
        this.p = 2;
        objB = cd3.b(rb3Var4, this, 2);
    }
}
