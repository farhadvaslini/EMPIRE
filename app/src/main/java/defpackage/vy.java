package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vy extends mb3 implements rs0 {
    public Object[] j;
    public js k;
    public byte[] l;
    public int m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ fn0[] r;
    public final /* synthetic */ cs0 s;
    public final /* synthetic */ ss0 t;
    public final /* synthetic */ gn0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy(p40 p40Var, gn0 gn0Var, cs0 cs0Var, ss0 ss0Var, fn0[] fn0VarArr) {
        super(2, p40Var);
        this.r = fn0VarArr;
        this.s = cs0Var;
        this.t = ss0Var;
        this.u = gn0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((vy) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        vy vyVar = new vy(p40Var, this.u, this.s, this.t, this.r);
        vyVar.q = obj;
        return vyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0135, code lost:
    
        if (r15.e(r14, r7, r20) == r9) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0 A[LOOP:0: B:29:0x00d0->B:37:0x00f1, LOOP_START, PHI: r3 r14
      0x00d0: PHI (r3v4 int) = (r3v3 int), (r3v5 int) binds: [B:26:0x00cb, B:37:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r14v6 k11) = (r14v5 k11), (r14v10 k11) binds: [B:26:0x00cb, B:37:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0135 -> B:8:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x013a -> B:44:0x011a). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        int length;
        byte[] bArr;
        int i;
        Object[] objArr;
        js jsVar;
        int i2;
        Object objS;
        int i3;
        int i4;
        k11 k11Var;
        ai0 ai0Var = vm1.c0;
        x50 x50Var = (x50) this.q;
        int i5 = this.p;
        int i6 = 2;
        int i7 = 1;
        y50 y50Var = y50.f;
        if (i5 == 0) {
            y02.Q(obj);
            length = this.r.length;
            if (length != 0) {
                Object[] objArr2 = new Object[length];
                uj.O(0, length, ai0Var, objArr2);
                np npVarA = lr.a(length, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                for (int i8 = 0; i8 < length; i8++) {
                    cl3.t(x50Var, null, new uy(this.r, i8, atomicInteger, npVarA, null, 0), 3);
                }
                bArr = new byte[length];
                i = 0;
                objArr = objArr2;
                jsVar = npVarA;
                i2 = length;
                i = (byte) (i + i7);
                this.q = null;
                this.j = objArr;
                this.k = jsVar;
                this.l = bArr;
                this.m = length;
                this.n = i2;
                this.o = i;
                this.p = i7;
                objS = jsVar.s(this);
                if (objS != y50Var) {
                }
                return y50Var;
            }
            return dm3.a;
        }
        if (i5 == 1) {
            int i9 = this.o;
            i4 = this.n;
            i3 = this.m;
            byte[] bArr2 = this.l;
            jsVar = this.k;
            Object[] objArr3 = this.j;
            y02.Q(obj);
            objS = ((vs) obj).a;
            i = i9;
            bArr = bArr2;
            objArr = objArr3;
            k11Var = (k11) vs.a(objS);
            if (k11Var != null) {
            }
            return dm3.a;
        }
        if (i5 == 2) {
            int i10 = this.o;
            int i11 = this.n;
            int i12 = this.m;
            byte[] bArr3 = this.l;
            jsVar = this.k;
            Object[] objArr4 = this.j;
            y02.Q(obj);
            i = i10;
            bArr = bArr3;
            objArr = objArr4;
            i2 = i11;
            length = i12;
            i7 = 1;
            i = (byte) (i + i7);
            this.q = null;
            this.j = objArr;
            this.k = jsVar;
            this.l = bArr;
            this.m = length;
            this.n = i2;
            this.o = i;
            this.p = i7;
            objS = jsVar.s(this);
            if (objS != y50Var) {
            }
            return y50Var;
        }
        if (i5 != 3) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i13 = this.o;
        i4 = this.n;
        i3 = this.m;
        byte[] bArr4 = this.l;
        jsVar = this.k;
        Object[] objArr5 = this.j;
        y02.Q(obj);
        i = i13;
        bArr = bArr4;
        objArr = objArr5;
        int i14 = i3;
        i2 = i4;
        length = i14;
        i6 = 2;
        i7 = 1;
        i = (byte) (i + i7);
        this.q = null;
        this.j = objArr;
        this.k = jsVar;
        this.l = bArr;
        this.m = length;
        this.n = i2;
        this.o = i;
        this.p = i7;
        objS = jsVar.s(this);
        if (objS != y50Var) {
            int i15 = i2;
            i3 = length;
            i4 = i15;
            k11Var = (k11) vs.a(objS);
            if (k11Var != null) {
                do {
                    int i16 = k11Var.a;
                    Object obj2 = objArr[i16];
                    objArr[i16] = k11Var.b;
                    if (obj2 == ai0Var) {
                        i4--;
                    }
                    if (bArr[i16] == i) {
                        break;
                    }
                    bArr[i16] = (byte) i;
                    k11Var = (k11) vs.a(jsVar.g());
                } while (k11Var != null);
                if (i4 == 0) {
                    Object[] objArr6 = (Object[]) this.s.a();
                    gn0 gn0Var = this.u;
                    ss0 ss0Var = this.t;
                    if (objArr6 == null) {
                        this.q = null;
                        this.j = objArr;
                        this.k = jsVar;
                        this.l = bArr;
                        this.m = i3;
                        this.n = i4;
                        this.o = i;
                        this.p = i6;
                        if (ss0Var.e(gn0Var, objArr, this) != y50Var) {
                            int i17 = i3;
                            i2 = i4;
                            length = i17;
                        }
                    } else {
                        uj.L(objArr, objArr6, 0, 0, 14);
                        this.q = null;
                        this.j = objArr;
                        this.k = jsVar;
                        this.l = bArr;
                        this.m = i3;
                        this.n = i4;
                        this.o = i;
                        this.p = 3;
                    }
                } else {
                    int i18 = i3;
                    i2 = i4;
                    length = i18;
                }
                i7 = 1;
                i = (byte) (i + i7);
                this.q = null;
                this.j = objArr;
                this.k = jsVar;
                this.l = bArr;
                this.m = length;
                this.n = i2;
                this.o = i;
                this.p = i7;
                objS = jsVar.s(this);
                if (objS != y50Var) {
                }
            }
            return dm3.a;
        }
        return y50Var;
    }
}
