package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ks1 extends pn2 implements rs0 {
    public yv0 h;
    public ls1 i;
    public long[] j;
    public int k;
    public int l;
    public int m;
    public int n;
    public long o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ls1 r;
    public final /* synthetic */ yv0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks1(ls1 ls1Var, yv0 yv0Var, p40 p40Var) {
        super(p40Var);
        this.r = ls1Var;
        this.s = yv0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((ks1) m((p40) obj2, (ov2) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        ks1 ks1Var = new ks1(this.r, this.s, p40Var);
        ks1Var.q = obj;
        return ks1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        ov2 ov2Var;
        ls1 ls1Var;
        long[] jArr;
        int length;
        yv0 yv0Var;
        int i;
        long j;
        int i2 = this.p;
        if (i2 == 0) {
            y02.Q(obj);
            ov2Var = (ov2) this.q;
            ls1Var = this.r;
            jArr = ls1Var.g.a;
            length = jArr.length - 2;
            if (length >= 0) {
                yv0Var = this.s;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return dm3.a;
        }
        if (i2 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.n;
        int i4 = this.m;
        long j2 = this.o;
        int i5 = this.l;
        int i6 = this.k;
        long[] jArr2 = this.j;
        ls1 ls1Var2 = this.i;
        yv0 yv0Var2 = this.h;
        ov2 ov2Var2 = (ov2) this.q;
        y02.Q(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                ls1Var = ls1Var2;
                ov2Var = ov2Var2;
                i = i5;
                yv0Var = yv0Var2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        ov2Var2 = ov2Var;
                        i3 = 0;
                        ls1Var2 = ls1Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        yv0Var2 = yv0Var;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                yv0Var2.g = i7;
                                Object obj2 = ls1Var2.g.b[i7];
                                this.q = ov2Var2;
                                this.h = yv0Var2;
                                this.i = ls1Var2;
                                this.j = jArr2;
                                this.k = i6;
                                this.l = i5;
                                this.o = j2;
                                this.m = i4;
                                this.n = i3;
                                this.p = 1;
                                ov2Var2.b(obj2, this);
                                return y50.f;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return dm3.a;
        }
    }
}
