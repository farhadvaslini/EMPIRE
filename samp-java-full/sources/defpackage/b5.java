package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b5 implements ns0 {
    public final /* synthetic */ int f = 3;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ b5(int i, x50 x50Var, a42 a42Var, ed edVar) {
        this.g = i;
        this.h = x50Var;
        this.i = a42Var;
        this.j = edVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        bb1 bb1Var = bb1.f;
        boolean z = true;
        Object[] objArr = 0;
        dm3 dm3Var = dm3.a;
        int i2 = 0;
        Object obj2 = this.j;
        int i3 = this.g;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj4;
                en1 en1Var = (en1) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                h62 h62Var = (h62) obj;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    List list = (List) arrayList.get(i4);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i5 = i2;
                    while (i5 < size2) {
                        boolean z2 = z;
                        iArr[i5] = ((i62) list.get(i5)).f + (i5 < list.size() + (-1) ? en1Var.p0(8.0f) : i2);
                        i5++;
                        z = z2;
                    }
                    boolean z3 = z;
                    int[] iArr2 = new int[size2];
                    if (en1Var.getLayoutDirection() == bb1Var) {
                        int i6 = i2;
                        int i7 = i6;
                        while (i6 < size2) {
                            i7 += iArr[i6];
                            i6++;
                        }
                        int i8 = i3 - i7;
                        int i9 = i2;
                        int i10 = i9;
                        while (i9 < size2) {
                            int i11 = iArr[i9];
                            iArr2[i10] = i8;
                            i8 += i11;
                            i9++;
                            i10++;
                        }
                    } else {
                        int i12 = i2;
                        for (int i13 = size2 - 1; -1 < i13; i13--) {
                            int i14 = iArr[i13];
                            iArr2[i13] = i12;
                            i12 += i14;
                        }
                    }
                    int size3 = list.size();
                    for (int i15 = i2; i15 < size3; i15++) {
                        h62Var.C((i62) list.get(i15), iArr2[i15], ((Number) arrayList2.get(i4)).intValue(), 0.0f);
                    }
                    i4++;
                    z = z3;
                    i2 = 0;
                }
                break;
            case 1:
                n41 n41Var = (n41) obj3;
                wr1 wr1Var = (wr1) obj2;
                if (obj == ((cb0) obj4)) {
                    c.q("A derived state calculation cannot read itself");
                } else if (obj instanceof n93) {
                    int i16 = n41Var.a - i3;
                    int iD = wr1Var.d(obj);
                    wr1Var.g(Math.min(i16, iD >= 0 ? wr1Var.c[iD] : Integer.MAX_VALUE), obj);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                vy0 vy0Var = (vy0) obj4;
                en1 en1Var2 = (en1) obj2;
                i62 i62Var = (i62) obj3;
                h62 h62Var2 = (h62) obj;
                int i17 = vy0Var.b;
                lf3 lf3Var = vy0Var.a;
                xj3 xj3Var = vy0Var.c;
                qg3 qg3Var = (qg3) vy0Var.d.a();
                lf3Var.a(t02.g, y02.d(h62Var2, i17, xj3Var, qg3Var != null ? qg3Var.a : null, en1Var2.getLayoutDirection() == bb1.g, i62Var.f), i3, i62Var.f);
                h62.F(h62Var2, i62Var, Math.round(-lf3Var.a.g()), 0);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                x50 x50Var = (x50) obj4;
                a42 a42Var = (a42) obj3;
                ed edVar = (ed) obj2;
                z60 z60Var = (z60) obj;
                z60Var.getClass();
                int iRound = Math.round(z60Var.d());
                int i18 = i3 - 1;
                if (iRound < 0) {
                    iRound = 0;
                }
                if (iRound <= i18) {
                    i18 = iRound;
                }
                a42Var.h(i18);
                z60Var.a(i18);
                cl3.t(x50Var, null, new ah1(edVar, objArr == true ? 1 : 0, i2), 3);
                break;
            default:
                i62[] i62VarArr = (i62[]) obj4;
                dp2 dp2Var = (dp2) obj3;
                int[] iArr3 = (int[]) obj2;
                h62 h62Var3 = (h62) obj;
                int length = i62VarArr.length;
                int i19 = 0;
                while (i2 < length) {
                    i62 i62Var2 = i62VarArr[i2];
                    int i20 = i19 + 1;
                    i62Var2.getClass();
                    Object objE = i62Var2.E();
                    bp2 bp2Var = objE instanceof bp2 ? (bp2) objE : null;
                    vr vrVar = bp2Var != null ? bp2Var.c : null;
                    h62Var3.C(i62Var2, iArr3[i19], vrVar != null ? vrVar.l(i3, i62Var2.g, bb1Var) : dp2Var.b.a(i62Var2.g, i3), 0.0f);
                    i2++;
                    i19 = i20;
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ b5(cb0 cb0Var, n41 n41Var, wr1 wr1Var, int i) {
        this.h = cb0Var;
        this.i = n41Var;
        this.j = wr1Var;
        this.g = i;
    }

    public /* synthetic */ b5(vy0 vy0Var, en1 en1Var, i62 i62Var, int i) {
        this.h = vy0Var;
        this.j = en1Var;
        this.i = i62Var;
        this.g = i;
    }

    public /* synthetic */ b5(ArrayList arrayList, en1 en1Var, int i, ArrayList arrayList2) {
        this.h = arrayList;
        this.j = en1Var;
        this.g = i;
        this.i = arrayList2;
    }

    public /* synthetic */ b5(i62[] i62VarArr, dp2 dp2Var, int i, int[] iArr) {
        this.h = i62VarArr;
        this.i = dp2Var;
        this.g = i;
        this.j = iArr;
    }
}
