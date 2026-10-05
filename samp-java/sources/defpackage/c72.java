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
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.c72 r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, defpackage.q40 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c72.a(c72, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, q40):java.lang.Object");
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
