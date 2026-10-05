package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fi0 extends kh0 implements Runnable {
    public final WeakReference f;

    public fi0(EditText editText) {
        this.f = new WeakReference(editText);
    }

    @Override // defpackage.kh0
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        gi0.a((EditText) this.f.get(), 1);
    }
}
