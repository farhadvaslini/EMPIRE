package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class py implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ py(as3 as3Var, int i, os1 os1Var, a42 a42Var, a42 a42Var2) {
        this.f = 1;
        this.h = as3Var;
        this.g = i;
        this.i = os1Var;
        this.j = a42Var;
        this.k = a42Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    @Override // defpackage.ns0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj) {
        int iM;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = 0;
        Object obj2 = this.k;
        int i3 = this.g;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                i62[] i62VarArr = (i62[]) obj5;
                qy qyVar = (qy) obj4;
                en1 en1Var = (en1) obj3;
                int[] iArr = (int[]) obj2;
                h62 h62Var = (h62) obj;
                int length = i62VarArr.length;
                int i4 = 0;
                while (i2 < length) {
                    i62 i62Var = i62VarArr[i2];
                    int i5 = i4 + 1;
                    i62Var.getClass();
                    Object objE = i62Var.E();
                    bp2 bp2Var = objE instanceof bp2 ? (bp2) objE : null;
                    bb1 layoutDirection = en1Var.getLayoutDirection();
                    vr vrVar = bp2Var != null ? bp2Var.c : null;
                    h62Var.C(i62Var, vrVar != null ? vrVar.l(i3, i62Var.f, layoutDirection) : qyVar.b.a(i62Var.f, i3, layoutDirection), iArr[i4], 0.0f);
                    i2++;
                    i4 = i5;
                }
                return dm3Var;
            case 1:
                os1 os1Var = (os1) obj4;
                a42 a42Var = (a42) obj2;
                ab1 ab1Var = (ab1) obj;
                os1Var.setValue(ab1Var);
                ((a42) obj3).h((int) (ab1Var.i0() >> 32));
                View view = ((as3) obj5).a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i6 = rect.top;
                int i7 = rect.bottom;
                ab1 ab1Var2 = (ab1) os1Var.getValue();
                jk2 jk2VarB = (ab1Var2 == null || !ab1Var2.t0()) ? jk2.e : b32.b(ab1Var2.D(0L), lr.T(ab1Var2.i0()));
                int i8 = i6 + i3;
                int i9 = i7 - i3;
                float f = jk2VarB.b;
                if (f <= i7) {
                    float f2 = jk2VarB.d;
                    iM = f2 < ((float) i6) ? i9 - i8 : vm1.M(Math.max(f - i8, i9 - f2));
                }
                a42Var.h(Math.max(iM, 0));
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                rp0 rp0Var = (rp0) obj4;
                rp0 rp0Var2 = (rp0) obj3;
                v1 v1Var = (v1) obj2;
                qm qmVar = (qm) obj;
                if (((rp0) obj5) != ((ep0) ((h7) vr.Y(rp0Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zY = lq.Y(rp0Var, rp0Var2, i3, v1Var);
                Boolean boolValueOf = Boolean.valueOf(zY);
                if (zY || !qmVar.a()) {
                    return boolValueOf;
                }
                return null;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                ok2 ok2Var = (ok2) obj2;
                h62 h62Var2 = (h62) obj;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    h62.F(h62Var2, (i62) arrayList.get(i10), ok2Var.f * i10, 0);
                }
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    i62 i62Var2 = (i62) arrayList2.get(i11);
                    h62.F(h62Var2, i62Var2, 0, i3 - i62Var2.g);
                }
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    i62 i62Var3 = (i62) arrayList3.get(i12);
                    h62.F(h62Var2, i62Var3, 0, i3 - i62Var3.g);
                }
                return dm3Var;
            default:
                rp0 rp0Var3 = (rp0) obj4;
                jk2 jk2Var = (jk2) obj3;
                v1 v1Var2 = (v1) obj2;
                qm qmVar2 = (qm) obj;
                if (((rp0) obj5) != ((ep0) ((h7) vr.Y(rp0Var3)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean Z = g12.Z(i3, v1Var2, rp0Var3, jk2Var);
                Boolean boolValueOf2 = Boolean.valueOf(Z);
                if (Z || !qmVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }

    public /* synthetic */ py(rp0 rp0Var, rp0 rp0Var2, Object obj, int i, v1 v1Var, int i2) {
        this.f = i2;
        this.h = rp0Var;
        this.i = rp0Var2;
        this.j = obj;
        this.g = i;
        this.k = v1Var;
    }

    public /* synthetic */ py(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ok2 ok2Var, int i) {
        this.f = 3;
        this.h = arrayList;
        this.i = arrayList2;
        this.j = arrayList3;
        this.k = ok2Var;
        this.g = i;
    }

    public /* synthetic */ py(i62[] i62VarArr, qy qyVar, int i, en1 en1Var, int[] iArr) {
        this.f = 0;
        this.h = i62VarArr;
        this.i = qyVar;
        this.g = i;
        this.j = en1Var;
        this.k = iArr;
    }
}
