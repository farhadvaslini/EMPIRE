package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class kq3 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static c40 b(View view, c40 c40Var) {
        ContentInfo contentInfoK = c40Var.a.k();
        Objects.requireNonNull(contentInfoK);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoK);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoK ? c40Var : new c40(new yl1(contentInfoPerformReceiveContent));
    }
}
