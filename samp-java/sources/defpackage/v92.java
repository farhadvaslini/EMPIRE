package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class v92 extends mb3 implements rs0 {
    public dt1 j;
    public y92 k;
    public InputStream l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public int r;
    public final /* synthetic */ y92 s;
    public final /* synthetic */ InputStream t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v92(y92 y92Var, InputStream inputStream, String str, String str2, String str3, String str4, String str5, p40 p40Var) {
        super(2, p40Var);
        this.s = y92Var;
        this.t = inputStream;
        this.u = str;
        this.v = str2;
        this.w = str3;
        this.x = str4;
        this.y = str5;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((v92) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new v92(this.s, this.t, this.u, this.v, this.w, this.x, this.y, p40Var);
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        InputStream inputStream;
        String str;
        dt1 dt1Var;
        y92 y92Var;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = this.r;
        y92 y92Var2 = this.s;
        y50 y50Var = y50.f;
        if (i == 0) {
            y02.Q(obj);
            this.r = 1;
            if (y92Var2.c(this) != y50Var) {
            }
            return y50Var;
        }
        if (i != 1) {
            if (i != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str6 = this.q;
            String str7 = this.p;
            String str8 = this.o;
            str = this.n;
            String str9 = this.m;
            inputStream = this.l;
            y92 y92Var3 = this.k;
            dt1Var = this.j;
            y02.Q(obj);
            str5 = str9;
            y92Var = y92Var3;
            str3 = str6;
            str2 = str7;
            str4 = str8;
            try {
                return y92.a(y92Var, inputStream, str5, str, str4, str2, str3);
            } finally {
                dt1Var.i(null);
            }
        }
        y02.Q(obj);
        dt1 dt1Var2 = y92Var2.e;
        this.j = dt1Var2;
        this.k = y92Var2;
        inputStream = this.t;
        this.l = inputStream;
        String str10 = this.u;
        this.m = str10;
        str = this.v;
        this.n = str;
        String str11 = this.w;
        this.o = str11;
        String str12 = this.x;
        this.p = str12;
        String str13 = this.y;
        this.q = str13;
        this.r = 2;
        if (dt1Var2.f(this) != y50Var) {
            dt1Var = dt1Var2;
            y92Var = y92Var2;
            str2 = str12;
            str3 = str13;
            str4 = str11;
            str5 = str10;
            return y92.a(y92Var, inputStream, str5, str, str4, str2, str3);
        }
        return y50Var;
    }
}
