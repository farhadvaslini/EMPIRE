package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c72 {
    public final o50 a;
    public final Context b;
    public final zt2 c;
    public final qj1 d;
    public TextClassifier f;
    public final dt1 e = new dt1();
    public final d42 g = b32.w(null);
    public final Object h = new Object();

    public c72(o50 o50Var, Context context, zt2 zt2Var, qj1 qj1Var) {
        this.a = o50Var;
        this.b = context;
        this.c = zt2Var;
        this.d = qj1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c72 c72Var, CharSequence charSequence, long j, TextClassifier textClassifier, q40 q40Var) throws Throwable {
        z62 z62Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        dt1 dt1Var;
        Object obj;
        ud3 ud3Var;
        y50 y50Var;
        Object obj2;
        ud3 ud3VarB;
        Object obj3;
        bt1 bt1Var;
        dt1 dt1Var2 = c72Var.e;
        d42 d42Var = c72Var.g;
        if (q40Var instanceof z62) {
            z62Var = (z62) q40Var;
            int i = z62Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                z62Var.o = i - Integer.MIN_VALUE;
            } else {
                z62Var = new z62(c72Var, q40Var);
            }
        }
        Object obj4 = z62Var.m;
        int i2 = z62Var.o;
        dm3 dm3Var = dm3.a;
        y50 y50Var2 = y50.f;
        try {
            try {
                if (i2 == 0) {
                    y02.Q(obj4);
                    z62Var.i = charSequence;
                    z62Var.j = textClassifier;
                    z62Var.k = dt1Var2;
                    j2 = j;
                    z62Var.l = j2;
                    z62Var.o = 1;
                    if (dt1Var2.f(z62Var) == y50Var2) {
                        return y50Var2;
                    }
                    charSequence2 = charSequence;
                    textClassifier2 = textClassifier;
                    dt1Var = dt1Var2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bt1 bt1Var2 = (bt1) z62Var.j;
                        ud3VarB = (ud3) z62Var.i;
                        y02.Q(obj4);
                        obj3 = null;
                        bt1Var = bt1Var2;
                        d42Var.setValue(ud3VarB);
                        return dm3Var;
                    }
                    j2 = z62Var.l;
                    dt1 dt1Var3 = z62Var.k;
                    textClassifier2 = (TextClassifier) z62Var.j;
                    charSequence2 = (CharSequence) z62Var.i;
                    y02.Q(obj4);
                    dt1Var = dt1Var3;
                }
                if (ud3Var != null) {
                    try {
                        r93 r93Var = e72.a;
                        y50Var = y50Var2;
                        if (yg3.b(j2, ud3Var.b)) {
                            boolean z = s51.n(charSequence2, ud3Var.a);
                            if (z) {
                                dt1Var.i(null);
                                return dm3Var;
                            }
                            obj2 = null;
                        }
                        d42Var.setValue(ud3VarB);
                        return dm3Var;
                    } catch (Throwable th) {
                        th = th;
                        obj = null;
                        dt1Var.i(obj);
                        throw th;
                    }
                }
                y50Var = y50Var2;
                obj2 = null;
                d42Var.setValue(ud3VarB);
                return dm3Var;
            } finally {
                ((dt1) bt1Var).i(obj3);
            }
            ud3Var = (ud3) d42Var.getValue();
            dt1Var.i(obj2);
            i1.n();
            ud3VarB = c72Var.b(charSequence2, j2, textClassifier2.classifyText(i1.f(charSequence2, yg3.f(j2), yg3.e(j2)).setDefaultLocales(c72Var.c()).build()));
            z62Var.i = ud3VarB;
            z62Var.j = dt1Var2;
            obj3 = null;
            z62Var.k = null;
            z62Var.o = 2;
            Object objF = dt1Var2.f(z62Var);
            bt1Var = dt1Var2;
            if (objF == y50Var) {
                return y50Var;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    public final ud3 b(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Object obj = textClassification.getActions().get(i);
            RemoteAction remoteAction = (RemoteAction) obj;
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteAction.shouldShowIcon()) {
                obj = null;
            }
            RemoteAction remoteAction2 = (RemoteAction) obj;
            if (remoteAction2 != null && (icon = remoteAction2.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new ud3(charSequence, j, textClassification, arrayList);
    }

    public final LocaleList c() {
        qj1 qj1Var = this.d;
        if (qj1Var == null) {
            return new LocaleList(((pj1) p62.a.n().f.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(rx.d0(qj1Var, 10));
        Iterator it = qj1Var.f.iterator();
        while (it.hasNext()) {
            arrayList.add(((pj1) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
