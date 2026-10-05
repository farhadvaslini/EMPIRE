package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class o43 extends u71 implements ns0 {
    public final /* synthetic */ p43 g;
    public final /* synthetic */ i62 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ en1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o43(p43 p43Var, i62 i62Var, long j, en1 en1Var) {
        super(1);
        this.g = p43Var;
        this.h = i62Var;
        this.i = j;
        this.j = en1Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        long jFloatToRawIntBits;
        h62 h62Var = (h62) obj;
        p43 p43Var = this.g;
        mr2 mr2Var = (mr2) p43Var.t.getValue();
        i62 i62Var = this.h;
        if (mr2Var == null) {
            h62Var.C(i62Var, 0, 0, 0.0f);
        } else {
            long j = p43Var.w;
            int i = (int) (j >> 32);
            long j2 = this.i;
            if (i == 0 || ((int) (j & 4294967295L)) == 0) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                int i2 = lr2.a;
            } else {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lr.T(j2) >> 32)) / Float.intBitsToFloat((int) (lr.T(j) >> 32));
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i3 = lr2.a;
            }
            long jM = (((long) vm1.M(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) * ((int) (p43Var.w & 4294967295L)))) & 4294967295L) | (((long) vm1.M(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) * ((int) (p43Var.w >> 32)))) << 32);
            long jRound = (((long) Math.round((1.0f + (this.j.getLayoutDirection() == bb1.f ? 0.0f : (-1.0f) * 0.0f)) * ((((int) (j2 >> 32)) - ((int) (jM >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f + 0.0f) * ((((int) (j2 & 4294967295L)) - ((int) (jM & 4294967295L))) / 2.0f))) & 4294967295L);
            h62.I(h62Var, i62Var, (int) (jRound >> 32), (int) (jRound & 4294967295L), new n43(jFloatToRawIntBits));
        }
        return dm3.a;
    }
}
