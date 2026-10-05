package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ll2 {
    public final i01 a;
    public final String b;
    public final ux0 c;
    public final f5 d;
    public mq e;

    public ll2(pl plVar) {
        i01 i01Var = (i01) plVar.g;
        if (i01Var == null) {
            c.q("url == null");
            throw null;
        }
        this.a = i01Var;
        this.b = (String) plVar.h;
        this.c = ((tx0) plVar.i).b();
        this.d = (f5) plVar.j;
    }

    public final pl a() {
        pl plVar = new pl(false);
        plVar.g = this.a;
        plVar.h = this.b;
        plVar.j = this.d;
        plVar.i = this.c.c();
        return plVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        ux0 ux0Var = this.c;
        if (ux0Var.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : ux0Var) {
                int i2 = i + 1;
                if (i < 0) {
                    vr.b0();
                    throw null;
                }
                r32 r32Var = (r32) obj;
                String str = (String) r32Var.f;
                String str2 = (String) r32Var.g;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (jv3.i(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        f5 f5Var = f5.U;
        f5 f5Var2 = this.d;
        if (!s51.n(f5Var2, f5Var)) {
            sb.append(", tags=");
            sb.append(f5Var2);
        }
        sb.append('}');
        return sb.toString();
    }
}
