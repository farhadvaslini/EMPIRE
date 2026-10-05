package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class x63 extends pn2 implements rs0 {
    public long[] h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ y63 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x63(y63 y63Var, p40 p40Var) {
        super(p40Var);
        this.m = y63Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((x63) m((p40) obj2, (ov2) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        x63 x63Var = new x63(this.m, p40Var);
        x63Var.l = obj;
        return x63Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        ov2 ov2Var;
        long[] jArr;
        int length;
        int i;
        ov2 ov2Var2;
        int i2;
        ov2 ov2Var3;
        int i3;
        y63 y63Var = this.m;
        long j = y63Var.f;
        long j2 = y63Var.h;
        long j3 = y63Var.g;
        int i4 = this.k;
        y50 y50Var = y50.f;
        if (i4 == 0) {
            y02.Q(obj);
            ov2Var = (ov2) this.l;
            jArr = y63Var.i;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                ov2Var2 = ov2Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return dm3.a;
        }
        if (i4 == 1) {
            length = this.j;
            int i5 = this.i;
            jArr = this.h;
            ov2Var = (ov2) this.l;
            y02.Q(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.i;
                ov2Var3 = (ov2) this.l;
                y02.Q(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + ((long) i3) + 64);
                        this.l = ov2Var3;
                        this.h = null;
                        this.i = i3;
                        this.k = 3;
                        ov2Var3.b(l, this);
                        return y50Var;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return dm3.a;
            }
            i2 = this.i;
            ov2Var2 = (ov2) this.l;
            y02.Q(obj);
            i2++;
            if (i2 >= 64) {
                ov2Var = ov2Var2;
                if (j != 0) {
                    ov2Var3 = ov2Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return dm3.a;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + ((long) i2));
                this.l = ov2Var2;
                this.h = null;
                this.i = i2;
                this.k = 2;
                ov2Var2.b(l2, this);
                return y50Var;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.l = ov2Var;
            this.h = jArr;
            this.i = i;
            this.j = length;
            this.k = 1;
            ov2Var.b(l3, this);
            return y50Var;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return dm3.a;
    }
}
