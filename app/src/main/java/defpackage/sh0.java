package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sh0 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile sh0 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new k83(cls, charSequence) : super.newEditable(charSequence);
    }
}
