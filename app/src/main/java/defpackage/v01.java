package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class v01 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final u01 j;
    public boolean k;

    public v01(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? wx.g : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        u01 u01Var = new u01(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = u01Var;
        arrayList.add(u01Var);
    }

    public static void a(v01 v01Var, ArrayList arrayList, w73 w73Var) {
        if (v01Var.k) {
            m21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((u01) v01Var.i.get(r0.size() - 1)).j.add(new yo3("", arrayList, 0, w73Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final w01 b() {
        if (this.k) {
            m21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                u01 u01Var = this.j;
                w01 w01Var = new w01(this.a, this.b, this.c, this.d, this.e, new uo3(u01Var.a, u01Var.b, u01Var.c, u01Var.d, u01Var.e, u01Var.f, u01Var.g, u01Var.h, u01Var.i, u01Var.j), this.f, this.g, this.h);
                this.k = true;
                return w01Var;
            }
            if (this.k) {
                m21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            u01 u01Var2 = (u01) arrayList.remove(arrayList.size() - 1);
            ((u01) arrayList.get(arrayList.size() - 1)).j.add(new uo3(u01Var2.a, u01Var2.b, u01Var2.c, u01Var2.d, u01Var2.e, u01Var2.f, u01Var2.g, u01Var2.h, u01Var2.i, u01Var2.j));
        }
    }
}
