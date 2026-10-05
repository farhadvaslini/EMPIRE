package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class oh0 implements a90 {
    public final /* synthetic */ gf1 f;

    public oh0(EmojiCompatInitializer emojiCompatInitializer, gf1 gf1Var) {
        this.f = gf1Var;
    }

    @Override // defpackage.a90
    public final void f(of1 of1Var) {
        (Build.VERSION.SDK_INT >= 28 ? w20.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new ar(), 500L);
        this.f.b(this);
    }
}
