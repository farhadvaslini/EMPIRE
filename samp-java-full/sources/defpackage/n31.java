package defpackage;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n31 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ int i;

    public /* synthetic */ n31(int i, int i2, i62 i62Var) {
        this.f = 1;
        this.g = i;
        this.h = i62Var;
        this.i = i2;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.i;
        int i3 = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                ((h62) obj).C((i62) obj2, i3, i2, 0.0f);
                break;
            case 1:
                ((h62) obj).C((i62) obj2, vm1.M((i3 - r8.f) / 2.0f), vm1.M((i2 - r8.g) / 2.0f), 0.0f);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((h62) obj).C((i62) obj2, i3, i2, 0.0f);
                break;
            default:
                da daVar = (da) obj2;
                t32 t32Var = (t32) obj;
                y9 y9Var = t32Var.a;
                int iD = t32Var.d(i3);
                int iD2 = t32Var.d(i2);
                CharSequence charSequence = y9Var.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder sbL = nc2.l("start(", iD, ") or end(", iD2, ") is out of range [0..");
                    sbL.append(length);
                    sbL.append("], or start > end!");
                    n21.a(sbL.toString());
                }
                Path path = new Path();
                ng3 ng3Var = y9Var.d;
                ng3Var.f.getSelectionPath(iD, iD2, path);
                int i4 = ng3Var.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                da daVar2 = new da(path);
                daVar2.j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(t32Var.f)) & 4294967295L));
                da.a(daVar, daVar2);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ n31(Object obj, int i, int i2, int i3) {
        this.f = i3;
        this.h = obj;
        this.g = i;
        this.i = i2;
    }
}
