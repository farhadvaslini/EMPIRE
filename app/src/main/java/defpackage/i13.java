package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i13 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Drawable g;

    public /* synthetic */ i13(Drawable drawable, int i) {
        this.f = i;
        this.g = drawable;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        Drawable drawable = this.g;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setImageDrawable(drawable);
                return imageView;
            default:
                qf0 qf0Var = (qf0) obj;
                pr prVarK = qf0Var.Z().k();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (qf0Var.a() >> 32)), (int) Float.intBitsToFloat((int) (qf0Var.a() & 4294967295L)));
                drawable.draw(o6.a(prVarK));
                return dm3.a;
        }
    }
}
