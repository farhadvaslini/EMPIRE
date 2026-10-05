package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l23 extends u71 implements cs0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ m23 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l23(m23 m23Var, int i) {
        super(0);
        this.g = i;
        this.h = m23Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        p40 p40Var;
        Object obj;
        int i = this.g;
        int i2 = 0;
        m23 m23Var = this.h;
        switch (i) {
            case 0:
                boolean z = m23Var.g;
                ed edVar = m23Var.f;
                c33 c33Var = m23Var.b;
                if (!z && c33Var.a() && edVar.e()) {
                    List listC = m23Var.c();
                    int size = listC.size();
                    while (true) {
                        p40Var = null;
                        if (i2 < size) {
                            obj = listC.get(i2);
                            if (!((o23) obj).i()) {
                                i2++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    o23 o23Var = (o23) obj;
                    if (o23Var != null) {
                        mm0 mm0Var = o23Var.c().f;
                        if (mm0Var instanceof s83) {
                            s83 s83Var = (s83) mm0Var;
                            cl3.t(c33Var.g, null, new hd1(m23Var, new s83(s83Var.a, s83Var.b, new gy1((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L))), p40Var, 21), 3);
                        }
                        m23Var.g = true;
                    }
                }
                return new gy1(((gy1) edVar.d()).a);
            default:
                List listB = m23Var.b();
                int size2 = listB.size();
                while (i2 < size2) {
                    o23 o23Var2 = (o23) listB.get(i2);
                    if (o23Var2.i() && o23Var2.k()) {
                        return dm3.a;
                    }
                    i2++;
                }
                return dm3.a;
        }
    }
}
