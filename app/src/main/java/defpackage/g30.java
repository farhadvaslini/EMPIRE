package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class g30 {
    public final iy a;
    public final iy b;
    public final iy c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g30(iy iyVar, iy iyVar2, int i) {
        float[] fArr;
        iy iyVarJ = gq.y(iyVar.b, 12884901888L) ? pq.j(iyVar) : iyVar;
        iy iyVarJ2 = gq.y(iyVar2.b, 12884901888L) ? pq.j(iyVar2) : iyVar2;
        float[] fArrA = rn.n0;
        if (i == 3) {
            boolean zY = gq.y(iyVar.b, 12884901888L);
            boolean zY2 = gq.y(iyVar2.b, 12884901888L);
            if (!(zY && zY2) && (zY || zY2)) {
                xr3 xr3Var = ((eo2) (zY ? iyVar : iyVar2)).d;
                float[] fArrA2 = zY ? xr3Var.a() : fArrA;
                fArrA = zY2 ? xr3Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        }
        this(iyVar2, iyVarJ, iyVarJ2, fArr);
    }

    public long a(long j) {
        float fH = wx.h(j);
        float fG = wx.g(j);
        float fE = wx.e(j);
        float fD = wx.d(j);
        iy iyVar = this.b;
        long jD = iyVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = iyVar.e(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.f(f, f2, fE2, fD, this.a);
    }

    public g30(iy iyVar, iy iyVar2, iy iyVar3, float[] fArr) {
        this.a = iyVar;
        this.b = iyVar2;
        this.c = iyVar3;
        this.d = fArr;
    }
}
