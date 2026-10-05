package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class it3 extends ht3 {
    public it3(mt3 mt3Var, WindowInsets windowInsets) {
        super(mt3Var, windowInsets);
    }

    @Override // defpackage.bt3, defpackage.jt3
    public List<Rect> f(int i) {
        return this.c.getBoundingRects(lt3.a(i));
    }

    @Override // defpackage.bt3, defpackage.jt3
    public List<Rect> g(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(lt3.a(i));
    }

    public it3(mt3 mt3Var, it3 it3Var) {
        super(mt3Var, it3Var);
    }

    @Override // defpackage.bt3, defpackage.jt3
    public void q() {
    }
}
