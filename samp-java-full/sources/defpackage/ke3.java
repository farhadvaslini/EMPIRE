package defpackage;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ke3 extends wd3 {
    public final TextClassification b;
    public final int c;
    public final Drawable d;

    public ke3(Object obj, TextClassification textClassification, int i, Drawable drawable) {
        super(obj);
        this.b = textClassification;
        this.c = i;
        this.d = drawable;
    }

    public final String toString() {
        return "TextContextMenuTextClassificationItem(key=" + this.a + ", textClassification=" + this.b + ", index=" + this.c + ", icon=" + this.d + ")";
    }
}
