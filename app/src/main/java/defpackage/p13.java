package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class p13 extends CharacterStyle implements UpdateAppearance {
    public final o13 f;
    public final float g;
    public final d42 h = b32.w(new h43(9205357640488583168L));
    public final cb0 i = b32.j(new it1(20, this));

    public p13(o13 o13Var, float f) {
        this.f = o13Var;
        this.g = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        f80.O(textPaint, this.g);
        textPaint.setShader((Shader) this.i.getValue());
    }
}
