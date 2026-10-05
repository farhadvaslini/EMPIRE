package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class z21 extends InputConnectionWrapper {
    public final /* synthetic */ b4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z21(InputConnection inputConnection, b4 b4Var) {
        super(inputConnection, false);
        this.a = b4Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        z30 yl1Var;
        yl1 yl1Var2 = inputContentInfo == null ? null : new yl1(29, new yl1(28, inputContentInfo));
        ah ahVar = (ah) this.a.b;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((yl1) yl1Var2.g).g).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((yl1) yl1Var2.g).g;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((yl1) yl1Var2.g).g;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            yl1Var = new yl1(clipData, 2);
        } else {
            a40 a40Var = new a40();
            a40Var.g = clipData;
            a40Var.h = 2;
            yl1Var = a40Var;
        }
        yl1Var.n(inputContentInfo3.getLinkUri());
        yl1Var.setExtras(bundle2);
        if (mq3.g(ahVar, yl1Var.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
