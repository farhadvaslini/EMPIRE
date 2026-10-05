package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ru0 implements TextWatcher {
    public final /* synthetic */ GameActivity f;

    public ru0(GameActivity gameActivity) {
        this.f = gameActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x001a, B:7:0x0017), top: B:11:0x0004 }] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte[] bytes;
        GameActivity gameActivity = this.f;
        if (charSequence != null) {
            try {
                String string = charSequence.toString();
                if (string != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    charset.getClass();
                    bytes = string.getBytes(charset);
                    bytes.getClass();
                } else {
                    bytes = new byte[0];
                }
            } catch (Throwable unused) {
                return;
            }
        }
        gameActivity.nativeUpdateCleoDialogInput(bytes);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
