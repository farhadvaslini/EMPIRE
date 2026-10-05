package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class dh extends ImageView {
    public final yf f;
    public final h9 g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gi3.a(context);
        this.h = false;
        ph3.a(this, getContext());
        yf yfVar = new yf(this);
        this.f = yfVar;
        yfVar.d(attributeSet, i);
        h9 h9Var = new h9(this);
        this.g = h9Var;
        h9Var.g(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        yf yfVar = this.f;
        if (yfVar != null) {
            yfVar.a();
        }
        h9 h9Var = this.g;
        if (h9Var != null) {
            h9Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        yf yfVar = this.f;
        if (yfVar != null) {
            return yfVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        yf yfVar = this.f;
        if (yfVar != null) {
            return yfVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        c30 c30Var;
        h9 h9Var = this.g;
        if (h9Var == null || (c30Var = (c30) h9Var.d) == null) {
            return null;
        }
        return (ColorStateList) c30Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        c30 c30Var;
        h9 h9Var = this.g;
        if (h9Var == null || (c30Var = (c30) h9Var.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c30Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.g.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yf yfVar = this.f;
        if (yfVar != null) {
            yfVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        yf yfVar = this.f;
        if (yfVar != null) {
            yfVar.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        h9 h9Var = this.g;
        if (h9Var != null) {
            h9Var.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        h9 h9Var = this.g;
        if (h9Var != null && drawable != null && !this.h) {
            h9Var.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (h9Var != null) {
            h9Var.b();
            if (this.h) {
                return;
            }
            ImageView imageView = (ImageView) h9Var.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(h9Var.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        h9 h9Var = this.g;
        if (h9Var != null) {
            ImageView imageView = (ImageView) h9Var.c;
            if (i != 0) {
                Drawable drawableC = rn.C(imageView.getContext(), i);
                if (drawableC != null) {
                    wf0.a(drawableC);
                }
                imageView.setImageDrawable(drawableC);
            } else {
                imageView.setImageDrawable(null);
            }
            h9Var.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        h9 h9Var = this.g;
        if (h9Var != null) {
            h9Var.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        yf yfVar = this.f;
        if (yfVar != null) {
            yfVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        yf yfVar = this.f;
        if (yfVar != null) {
            yfVar.k(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        h9 h9Var = this.g;
        if (h9Var != null) {
            if (((c30) h9Var.d) == null) {
                h9Var.d = new c30();
            }
            c30 c30Var = (c30) h9Var.d;
            c30Var.c = colorStateList;
            c30Var.b = true;
            h9Var.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        h9 h9Var = this.g;
        if (h9Var != null) {
            if (((c30) h9Var.d) == null) {
                h9Var.d = new c30();
            }
            c30 c30Var = (c30) h9Var.d;
            c30Var.d = mode;
            c30Var.a = true;
            h9Var.b();
        }
    }
}
