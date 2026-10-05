package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qd extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ rd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd(rd rdVar, int i) {
        super(1);
        this.g = i;
        this.h = rdVar;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        i62[] i62VarArr;
        int i;
        dm3 dm3Var;
        int i2;
        int i3 = this.g;
        dm3 dm3Var2 = dm3.a;
        int i4 = 0;
        rd rdVar = this.h;
        switch (i3) {
            case 0:
                h62 h62Var = (h62) obj;
                i62[] i62VarArr2 = rdVar.c;
                i62VarArr2.getClass();
                int i5 = rdVar.e;
                int i6 = rdVar.g;
                int length = i62VarArr2.length;
                while (i4 < length) {
                    i62 i62Var = i62VarArr2[i4];
                    if (i62Var != null) {
                        h5 h5Var = rdVar.a.b;
                        long j = (((long) i62Var.f) << 32) | (((long) i62Var.g) & 4294967295L);
                        i62VarArr = i62VarArr2;
                        i = i4;
                        long jA = h5Var.a(j, (((long) i5) << 32) | (((long) i6) & 4294967295L), bb1.f);
                        h62Var.C(i62Var, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
                    } else {
                        i62VarArr = i62VarArr2;
                        i = i4;
                    }
                    i4 = i + 1;
                    i62VarArr2 = i62VarArr;
                }
                break;
            default:
                h62 h62Var2 = (h62) obj;
                i62[] i62VarArr3 = rdVar.b;
                i62VarArr3.getClass();
                int i7 = rdVar.d;
                int i8 = rdVar.f;
                int length2 = i62VarArr3.length;
                while (i4 < length2) {
                    i62 i62Var2 = i62VarArr3[i4];
                    if (i62Var2 != null) {
                        h5 h5Var2 = rdVar.a.b;
                        int i9 = i62Var2.f;
                        long j2 = (((long) i62Var2.g) & 4294967295L) | (((long) i9) << 32);
                        dm3Var = dm3Var2;
                        i2 = i4;
                        long jA2 = h5Var2.a(j2, (((long) i7) << 32) | (((long) i8) & 4294967295L), bb1.f);
                        h62Var2.C(i62Var2, (int) (jA2 >> 32), (int) (jA2 & 4294967295L), 0.0f);
                    } else {
                        dm3Var = dm3Var2;
                        i2 = i4;
                    }
                    i4 = i2 + 1;
                    dm3Var2 = dm3Var;
                }
                break;
        }
        return dm3Var2;
    }
}
