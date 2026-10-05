package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class ya implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ya(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return s51.r(((ed2) obj2).a, ((ed2) obj).a);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return s51.r(((b61) obj).b, ((b61) obj2).b);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                l41 l41Var = (l41) obj;
                l41 l41Var2 = (l41) obj2;
                return (l41Var.g - l41Var.f) - (l41Var2.g - l41Var2.f);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                tb1 tb1Var = (tb1) obj;
                tb1 tb1Var2 = (tb1) obj2;
                float f = tb1Var.M.p.J;
                float f2 = tb1Var2.M.p.J;
                return f == f2 ? s51.r(tb1Var.v(), tb1Var2.v()) : Float.compare(f, f2);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return s51.r(((fe1) obj).a, ((fe1) obj2).a);
            default:
                return ((Number) ev2.b.f(obj, obj2)).intValue();
        }
    }
}
