package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class b72 extends mb3 implements rs0 {
    public final /* synthetic */ int j = 0;
    public long k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ long n;
    public Object o;
    public Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b72(long j, p40 p40Var, c72 c72Var, CharSequence charSequence) {
        super(2, p40Var);
        this.r = charSequence;
        this.n = j;
        this.q = c72Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((b72) m((p40) obj2, (TextClassifier) obj)).o(dm3Var);
            default:
                return ((b72) m((p40) obj2, (us2) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.r;
        Object obj3 = this.q;
        switch (i) {
            case 0:
                b72 b72Var = new b72(this.n, p40Var, (c72) obj3, (CharSequence) obj2);
                b72Var.m = obj;
                return b72Var;
            default:
                b72 b72Var2 = new b72((ws2) obj3, (pk2) obj2, this.n, p40Var);
                b72Var2.m = obj;
                return b72Var2;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        long j;
        ud3 ud3VarB;
        dt1 dt1Var;
        pk2 pk2Var;
        long j2;
        Object objA;
        ws2 ws2Var;
        ws2 ws2Var2;
        int i = this.j;
        long j3 = this.n;
        y50 y50Var = y50.f;
        Object obj2 = this.r;
        Object obj3 = this.q;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                c72 c72Var = (c72) obj3;
                int i2 = this.l;
                if (i2 == 0) {
                    y02.Q(obj);
                    TextClassifier textClassifier = (TextClassifier) this.m;
                    i1.y();
                    TextSelection.Request.Builder defaultLocales = i1.j(charSequence, yg3.f(j3), yg3.e(j3)).setDefaultLocales(c72Var.c());
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        defaultLocales.setIncludeTextClassification(true);
                    }
                    TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
                    long jF = d32.f(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
                    if (i3 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                        this.k = jF;
                        this.l = 2;
                        if (c72.a((c72) obj3, (CharSequence) obj2, jF, textClassifier, this) == y50Var) {
                            return y50Var;
                        }
                        j = jF;
                    } else {
                        TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                        textClassification.getClass();
                        ud3VarB = c72Var.b(charSequence, jF, textClassification);
                        dt1Var = c72Var.e;
                        this.m = ud3VarB;
                        this.o = dt1Var;
                        this.p = c72Var;
                        this.k = jF;
                        this.l = 1;
                        if (dt1Var.f(this) == y50Var) {
                            return y50Var;
                        }
                        j = jF;
                        c72Var.g.setValue(ud3VarB);
                    }
                } else if (i2 == 1) {
                    j = this.k;
                    c72Var = (c72) this.p;
                    dt1Var = (dt1) this.o;
                    ud3VarB = (ud3) this.m;
                    y02.Q(obj);
                    try {
                        c72Var.g.setValue(ud3VarB);
                    } finally {
                        dt1Var.i(null);
                    }
                } else {
                    if (i2 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = this.k;
                    y02.Q(obj);
                }
                return new yg3(j);
            default:
                int i4 = this.l;
                t02 t02Var = t02.g;
                if (i4 == 0) {
                    y02.Q(obj);
                    ws2 ws2Var3 = (ws2) obj3;
                    ts2 ts2Var = new ts2(ws2Var3, (us2) this.m);
                    pk2Var = (pk2) obj2;
                    rm0 rm0Var = ws2Var3.c;
                    j2 = pk2Var.f;
                    float fE = ws2Var3.e(ws2Var3.d == t02Var ? lp3.b(j3) : lp3.c(j3));
                    this.m = ws2Var3;
                    this.o = ws2Var3;
                    this.p = pk2Var;
                    this.k = j2;
                    this.l = 1;
                    objA = rm0Var.a(ts2Var, fE, this);
                    if (objA == y50Var) {
                        return y50Var;
                    }
                    ws2Var = ws2Var3;
                    ws2Var2 = ws2Var;
                } else {
                    if (i4 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j4 = this.k;
                    pk2Var = (pk2) this.p;
                    ws2Var = (ws2) this.o;
                    ws2Var2 = (ws2) this.m;
                    y02.Q(obj);
                    j2 = j4;
                    objA = obj;
                }
                float fE2 = ws2Var2.e(((Number) objA).floatValue());
                pk2Var.f = ws2Var.d == t02Var ? lp3.a(j2, fE2, 0.0f, 2) : lp3.a(j2, 0.0f, fE2, 1);
                return dm3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b72(ws2 ws2Var, pk2 pk2Var, long j, p40 p40Var) {
        super(2, p40Var);
        this.q = ws2Var;
        this.r = pk2Var;
        this.n = j;
    }
}
