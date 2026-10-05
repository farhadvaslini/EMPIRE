package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k10 extends pn2 implements rs0 {
    public int h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ l10 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k10(l10 l10Var, p40 p40Var) {
        super(p40Var);
        this.m = l10Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((k10) m((p40) obj2, (ov2) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        k10 k10Var = new k10(this.m, p40Var);
        k10Var.l = obj;
        return k10Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        ov2 ov2Var;
        int i;
        int i2;
        int i3;
        String strG;
        int i4;
        int i5;
        String str;
        l10 l10Var = this.m;
        as1 as1Var = l10Var.f;
        nr1 nr1Var = l10Var.h;
        int i6 = this.k;
        if (i6 == 0) {
            y02.Q(obj);
            ov2Var = (ov2) this.l;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.j;
            i2 = this.i;
            i3 = this.h;
            ov2Var = (ov2) this.l;
            y02.Q(obj);
        }
        if (i3 >= Math.min(l10Var.i + 10, nr1Var.b)) {
            return dm3.a;
        }
        int i7 = i3 + 1;
        int iC = nr1Var.c(i3);
        switch (iC) {
            case 0:
                strG = "up";
                break;
            case 1:
                Object objG = as1Var.g(i2);
                i2++;
                strG = "down " + objG;
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                strG = nc2.g(nr1Var.c(i7), nr1Var.c(i3 + 2), "remove ", " ");
                i7 = i3 + 3;
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int iC2 = nr1Var.c(i7);
                int iC3 = nr1Var.c(i3 + 2);
                int iC4 = nr1Var.c(i3 + 3);
                StringBuilder sbL = nc2.l("move ", iC2, " ", iC3, " ");
                sbL.append(iC4);
                strG = sbL.toString();
                i7 = i3 + 4;
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                strG = "clear";
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                i4 = i3 + 2;
                int iC5 = nr1Var.c(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC5 + " " + as1Var.g(i2);
                int i8 = i4;
                strG = str;
                i7 = i8;
                i2 = i5;
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                i4 = i3 + 2;
                int iC6 = nr1Var.c(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iC6 + " " + as1Var.g(i2);
                int i82 = i4;
                strG = str;
                i7 = i82;
                i2 = i5;
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                Object objG2 = as1Var.g(i2);
                objG2.getClass();
                cl3.i(2, objG2);
                i2 += 2;
                strG = "apply " + ((rs0) objG2);
                break;
            case 8:
                strG = "reuse " + l10Var.g.g(i);
                i++;
                break;
            case vr.g /* 9 */:
                strG = "recompose pending";
                break;
            default:
                strG = by1.e(iC, "unknown op: ");
                break;
        }
        this.l = ov2Var;
        this.h = i7;
        this.i = i2;
        this.j = i;
        this.k = 1;
        ov2Var.b(i3 + ": " + strG, this);
        return y50.f;
    }
}
