package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class t21 {
    public final /* synthetic */ int a;
    public final uy0 b;
    public final uy0 c;
    public final uy0 d;
    public final uy0 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public t21(t21[] t21VarArr) {
        final int i = 0;
        this.a = 0;
        this.f = t21VarArr;
        int length = t21VarArr.length;
        final uy0[] uy0VarArr = new uy0[length];
        for (int i2 = 0; i2 < length; i2++) {
            uy0VarArr[i2] = ((t21[]) this.f)[i2].b();
        }
        final int i3 = 1;
        this.b = new uy0(1, new rs0() { // from class: yp3
            @Override // defpackage.rs0
            public final Object f(Object obj, Object obj2) {
                float fD;
                int i4 = i3;
                uy0[] uy0VarArr2 = uy0VarArr;
                h62 h62Var = (h62) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i4) {
                    case 0:
                        fD = n32.d(h62Var, false, uy0VarArr2, fFloatValue);
                        break;
                    default:
                        fD = n32.d(h62Var, true, uy0VarArr2, fFloatValue);
                        break;
                }
                return Float.valueOf(fD);
            }
        });
        int length2 = ((t21[]) this.f).length;
        final uy0[] uy0VarArr2 = new uy0[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            uy0VarArr2[i4] = ((t21[]) this.f)[i4].d();
        }
        this.c = new uy0(0, new rs0() { // from class: ty0
            @Override // defpackage.rs0
            public final Object f(Object obj, Object obj2) {
                float fD;
                int i5 = i3;
                uy0[] uy0VarArr3 = uy0VarArr2;
                h62 h62Var = (h62) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i5) {
                    case 0:
                        fD = n32.d(h62Var, false, uy0VarArr3, fFloatValue);
                        break;
                    default:
                        fD = n32.d(h62Var, true, uy0VarArr3, fFloatValue);
                        break;
                }
                return Float.valueOf(fD);
            }
        });
        int length3 = ((t21[]) this.f).length;
        final uy0[] uy0VarArr3 = new uy0[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            uy0VarArr3[i5] = ((t21[]) this.f)[i5].c();
        }
        this.d = new uy0(1, new rs0() { // from class: yp3
            @Override // defpackage.rs0
            public final Object f(Object obj, Object obj2) {
                float fD;
                int i42 = i;
                uy0[] uy0VarArr22 = uy0VarArr3;
                h62 h62Var = (h62) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i42) {
                    case 0:
                        fD = n32.d(h62Var, false, uy0VarArr22, fFloatValue);
                        break;
                    default:
                        fD = n32.d(h62Var, true, uy0VarArr22, fFloatValue);
                        break;
                }
                return Float.valueOf(fD);
            }
        });
        int length4 = ((t21[]) this.f).length;
        final uy0[] uy0VarArr4 = new uy0[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            uy0VarArr4[i6] = ((t21[]) this.f)[i6].a();
        }
        this.e = new uy0(0, new rs0() { // from class: ty0
            @Override // defpackage.rs0
            public final Object f(Object obj, Object obj2) {
                float fD;
                int i52 = i;
                uy0[] uy0VarArr32 = uy0VarArr4;
                h62 h62Var = (h62) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i52) {
                    case 0:
                        fD = n32.d(h62Var, false, uy0VarArr32, fFloatValue);
                        break;
                    default:
                        fD = n32.d(h62Var, true, uy0VarArr32, fFloatValue);
                        break;
                }
                return Float.valueOf(fD);
            }
        });
    }

    public final uy0 a() {
        int i = this.a;
        return this.e;
    }

    public final uy0 b() {
        int i = this.a;
        return this.b;
    }

    public final uy0 c() {
        int i = this.a;
        return this.d;
    }

    public final uy0 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i2 = 0;
                for (t21 t21Var : (t21[]) obj) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    y02.e(sb, t21Var, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                return nc2.i("RectRulers(", (String) obj, ")");
        }
    }

    public t21(String str) {
        this.a = 1;
        this.f = str;
        this.b = new uy0(1, null);
        this.c = new uy0(0, null);
        this.d = new uy0(1, null);
        this.e = new uy0(0, null);
    }
}
