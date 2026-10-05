package defpackage;

import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k6 implements ek {
    public final h7 a;
    public final jk b;
    public final AutofillId c;

    public k6(h7 h7Var, jk jkVar) {
        this.a = h7Var;
        this.b = jkVar;
        h7Var.setImportantForAutofill(1);
        AutofillId autofillId = h7Var.getAutofillId();
        if (autofillId == null) {
            throw nc2.d("Required value was null.");
        }
        this.c = autofillId;
    }
}
