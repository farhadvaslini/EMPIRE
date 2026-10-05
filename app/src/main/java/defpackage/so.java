package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class so {
    public final qs1 a = new qs1(new to[16]);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(jk2 jk2Var, q40 q40Var) {
        ro roVar;
        int i;
        jk2 jk2Var2;
        int i2;
        Object[] objArr;
        if (q40Var instanceof ro) {
            roVar = (ro) q40Var;
            int i3 = roVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                roVar.o = i3 - Integer.MIN_VALUE;
            } else {
                roVar = new ro(this, q40Var);
            }
        }
        Object obj = roVar.m;
        int i4 = roVar.o;
        if (i4 == 0) {
            y02.Q(obj);
            qs1 qs1Var = this.a;
            Object[] objArr2 = qs1Var.f;
            i = qs1Var.h;
            jk2Var2 = jk2Var;
            i2 = 0;
            objArr = objArr2;
            if (i2 < i) {
            }
        } else {
            if (i4 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = roVar.l;
            i2 = roVar.k;
            objArr = roVar.j;
            jk2 jk2Var3 = roVar.i;
            y02.Q(obj);
            jk2Var2 = jk2Var3;
            i2++;
            if (i2 < i) {
                to toVar = (to) objArr[i2];
                ja jaVar = new ja(6, jk2Var2);
                roVar.i = jk2Var2;
                roVar.j = objArr;
                roVar.k = i2;
                roVar.l = i;
                roVar.o = 1;
                Object objQ = vm1.q(toVar, jaVar, roVar);
                y50 y50Var = y50.f;
                if (objQ == y50Var) {
                    return y50Var;
                }
                i2++;
                if (i2 < i) {
                    return dm3.a;
                }
            }
        }
    }
}
